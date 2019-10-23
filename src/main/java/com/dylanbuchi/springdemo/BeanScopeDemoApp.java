package com.dylanbuchi.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * BeanScopeDemoApp
 */
public class BeanScopeDemoApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("scopeBeans.xml");

        ICoach theCoach = context.getBean("MyCoach", ICoach.class);

        ICoach alphaCoach = context.getBean("MyCoach", ICoach.class);

        // test scope with Singleton scope then with prototype scope (change scope in
        // xml file)

        boolean isTheSameObject = theCoach == alphaCoach;

        System.out.println("\n The coach and alpha coach is the same object: " + isTheSameObject);

        System.out.println("\n Memory location of the Coach: " + theCoach);

        System.out.println("\n Memory location of alpha Coach: " + alphaCoach + "\n");

        // so a singleton scope is the same object and a prototype scope creates 2 new
        // objects
        context.close();
    }
}