package com.dylanbuchi.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * SetterAppTest
 */
public class SetterAppTest {

    public static void main(String[] args) {

        // load spring conf file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean fromm spring container
        FootballCoach footballCoach = context.getBean("MyFootballCoach", FootballCoach.class);

        // call methods on the bean (todo later)...
        System.out.println(footballCoach.getDailyTraining());
        System.out.println(footballCoach.getDailyFortune());

        // close the bean
        context.close();
    }
}