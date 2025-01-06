package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User john = new Millenials("John");
        User jane = new YGeneration("Jane");
        User jack = new ZGeneration("Jack");

        //When
        String mediumUsedByJohn = john.sharePost();
        System.out.println("John uses: " + mediumUsedByJohn);
        String mediumUsedByJane = jane.sharePost();
        System.out.println("Jane uses: " + mediumUsedByJane);
        String mediumUsedByJack = jack.sharePost();
        System.out.println("Jack uses: " + mediumUsedByJack);

        //Then
        Assertions.assertEquals("Facebook",mediumUsedByJohn);
        Assertions.assertEquals("Twitter",mediumUsedByJane);
        Assertions.assertEquals("Snapchat",mediumUsedByJack);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User john = new Millenials("John");

        //When
        String mediumUsedByJohn = john.sharePost();
        System.out.println("John uses: " + mediumUsedByJohn);
        john.setSocialPublisher(new SnapchatPublisher());
        String newMediumUsedByJohn = john.sharePost();
        System.out.println("Now John uses: " + newMediumUsedByJohn);

        //Then
        Assertions.assertEquals("Snapchat",newMediumUsedByJohn);
    }
}
