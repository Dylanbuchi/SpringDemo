package com.dylanbuchi.springdemo;

/**
 * FootballCoach
 */
public class FootballCoach implements Coach {
    // field for dependency
    private FortuneService fortuneService;

    // no args constructor
    public FootballCoach() {
        System.out.println("no args constructor");
    }

    // getter
    /**
     * @return the fortuneService
     */
    public FortuneService getFortuneService() {
        return fortuneService;
    }

    // setter
    /**
     * @param fortuneService the fortuneService to set
     */
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("setter fortune injection");
        this.fortuneService = fortuneService;
    }

    // methods form coach
    @Override
    public String getDailyTraining() {

        return "Practice dribbles for 10min";
    }

    @Override
    public String getDailyFortune() {

        return fortuneService.getFortune();
    }

}