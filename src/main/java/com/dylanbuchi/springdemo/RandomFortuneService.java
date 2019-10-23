package com.dylanbuchi.springdemo;

/**
 * HappyFortuneService
 */
public class RandomFortuneService implements IFortuneService {

    private String[] fortunes = new String[] { "You will have good luck and overcome many hardships",
            "A focused mind is one of the most powerful forces in the universe",
            "A smile is your passport into the hearts of others" };

    @Override
    public String getFortune() {

        String randomFortune;

        int n = (int) (Math.random() * 3);

        randomFortune = fortunes[n];

        return randomFortune;

    }

}