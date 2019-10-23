package com.dylanbuchi.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * LifeCycleBeanDemoApp
 */
public class LifeCycleBeanDemoApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("lifeCycleBeans.xml");

        ICoach coach = context.getBean("MyCoach", ICoach.class);

        System.out.println(coach.getDailyTraining());
        context.close();

    }
}