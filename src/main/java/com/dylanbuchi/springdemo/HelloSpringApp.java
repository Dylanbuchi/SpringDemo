package com.dylanbuchi.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * HelloSpringApp
 */
public class HelloSpringApp {

    public static void main(String[] args) {

        // load Spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve the bean from the spring container
        ICoach theCoach = context.getBean("MyCoach", ICoach.class);

        // call method on the bean
        System.out.println(theCoach.getDailyTraining());

        // Call new method for the fortune
        System.out.println(theCoach.getDailyFortune());

        // close context
        context.close();

    }

}