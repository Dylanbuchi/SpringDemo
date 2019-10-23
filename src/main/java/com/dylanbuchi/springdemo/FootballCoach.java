package com.dylanbuchi.springdemo;

/**
 * FootballCoach
 */
public class FootballCoach implements ICoach {
    // field for dependency
    private IFortuneService fortuneService;

    // no args constructor
    public FootballCoach() {
        System.out.println("no args constructor");
    }

    // getter
    /**
     * @return the fortuneService
     */
    public IFortuneService getFortuneService() {
        return fortuneService;
    }

    // setter
    /**
     * @param fortuneService the fortuneService to set
     */
    public void setFortuneService(IFortuneService fortuneService) {
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