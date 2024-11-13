package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@DisplayName("Advanced Forum Statistics Test Suite")
@ExtendWith(MockitoExtension.class)
public class AdvStatisticsTestSuite {
    private static int testCounter = 0;
    private List<String> generateUsersList(int usersQuantity) {
        List<String> users = new ArrayList<>();
        for (int n = 1; n <= usersQuantity; n++) {
            String user = ("Name " + n);
            users.add(user);
        }
        return users;
    }
    @BeforeAll
    static void beforeAll() {
        System.out.println("This is the beginning of tests.");
    }
    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }
    @BeforeEach
    void beforeEach() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Mock
    private Statistics statisticsMock;
    @Test
    void calculateAdvStatisticsForZeroPosts() {
        //Given
        AdvStatistics advStatistics = new AdvStatistics();
        List<String> users = generateUsersList(50);
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(500);
        //When
        advStatistics.calculateAdvStatistics(statisticsMock);
        double resultAvgCommentsPerPost = advStatistics.getAvgCommentsPerPost();
        double resultAvgPostsPerUser = advStatistics.getAvgPostsPerUser();
        //Then
        Assertions.assertEquals(0, resultAvgCommentsPerPost);
        Assertions.assertEquals(0, resultAvgPostsPerUser);
    }
    @Test
    void calculateAdvStatisticsFor1000Post() {
        //Given
        AdvStatistics advStatistics = new AdvStatistics();
        List<String> users = generateUsersList(50);
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        //When
        advStatistics.calculateAdvStatistics(statisticsMock);
        double resultAvgCommentsPerPost = advStatistics.getAvgCommentsPerPost();
        double resultAvgPostsPerUser = advStatistics.getAvgPostsPerUser();
        //Then
        Assertions.assertEquals(1, resultAvgCommentsPerPost);
        Assertions.assertEquals(20, resultAvgPostsPerUser);
    }
    @Test
    void calculateAdvStatisticsForMorePostThanComments() {
        //Given
        AdvStatistics advStatistics = new AdvStatistics();
        List<String> users = generateUsersList(50);
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(500);
        //When
        advStatistics.calculateAdvStatistics(statisticsMock);
        double resultAvgCommentsPerPost = advStatistics.getAvgCommentsPerPost();
        //Then
        Assertions.assertEquals(0.5, resultAvgCommentsPerPost);
    }
    @Test
    void calculateAdvStatisticsForLessPostThanComments() {
        //Given
        AdvStatistics advStatistics = new AdvStatistics();
        List<String> users = generateUsersList(50);
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(500);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        //When
        advStatistics.calculateAdvStatistics(statisticsMock);
        double resultAvgCommentsPerPost = advStatistics.getAvgCommentsPerPost();
        //Then
        Assertions.assertEquals(2, resultAvgCommentsPerPost);
    }
    @Test
    void calculateAdvStatisticsForZeroUsers() {
        //Given
        AdvStatistics advStatistics = new AdvStatistics();
        List<String> users = generateUsersList(0);
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        //When
        advStatistics.calculateAdvStatistics(statisticsMock);
        double resultAvgPostsPerUser = advStatistics.getAvgPostsPerUser();
        double resultAvgCommentsPerUser = advStatistics.getAvgCommentsPerUser();
        //Then
        Assertions.assertEquals(0, resultAvgPostsPerUser);
        Assertions.assertEquals(0, resultAvgCommentsPerUser);
    }
    @Test
    void calculateAdvStatisticsFor100Users() {
        //Given
        AdvStatistics advStatistics = new AdvStatistics();
        List<String> users = generateUsersList(100);
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        //When
        advStatistics.calculateAdvStatistics(statisticsMock);
        double resultAvgPostsPerUser = advStatistics.getAvgPostsPerUser();
        double resultAvgCommentsPerUser = advStatistics.getAvgCommentsPerUser();
        //Then
        Assertions.assertEquals(10, resultAvgPostsPerUser);
        Assertions.assertEquals(10, resultAvgCommentsPerUser);
    }
}