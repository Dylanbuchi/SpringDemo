package com.dylanbuchi.springdemo;

public class FortniteCoach implements Coach {

    // define private variable for dependency injection

    private FortuneService fortuneService;

    // constructor for the dependency injection

    /**
     * @param fortuneService
     */
    public FortniteCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyTraining() {

        return "Practice building for 10 min";
    }

    @Override
    public String getDailyFortune() {

        return this.fortuneService.getFortune();
    }

}
