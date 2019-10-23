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

        FortniteCoach fortniteCoach = context.getBean("MyFortniteCoach", FortniteCoach.class);

        // call methods on the bean
        System.out.println(footballCoach.getDailyTraining());
        System.out.println(footballCoach.getDailyFortune());

        // call the fortniteCoach methods
        System.out.println(fortniteCoach.getEmail());
        System.out.println(fortniteCoach.getTeam());

        // close the bean
        context.close();
    }
}