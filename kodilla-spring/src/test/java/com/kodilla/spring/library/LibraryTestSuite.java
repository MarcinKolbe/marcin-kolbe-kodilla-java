package com.kodilla.spring.library;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

@SpringBootTest
public class LibraryTestSuite {

    @Autowired
    private Library library;

    @Test
    void testLoadFromDb() {
        //Given
//        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.library");
//        Library library = context.getBean(Library.class);
        //When
        library.loadFromDb();
        //Then
        //do nothing
    }

    @Test
    void testSaveToDb() {
        //Given
//        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.library");
//        Library library = context.getBean(Library.class);
        //When
        library.saveToDb();
        //Then
        //do nothing
    }

    @Test
    void testContext() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        //When & Then
        System.out.println("==== Beans List: ==== >>");
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println("<< ==== Beans List: ====");

    }
}
