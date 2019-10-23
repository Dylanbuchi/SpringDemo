package com.dylanbuchi.springdemo;

public class FortniteCoach implements ICoach {

    // define private variable for dependency injection
    private String email;
    private String team;
    // random fortunes
    private String randomFortune;
    private IFortuneService fortuneService;

    /**
     * no args constructor
     */
    public FortniteCoach() {
    }

    /**
     * // constructor for the dependency injection
     * 
     * @param fortuneService
     */
    public FortniteCoach(IFortuneService fortuneService) {
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

    /**
     * @return the email
     */
    public String getEmail() {
        System.out.println("inside email getter method");
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        System.out.println("inside email setter method");
        this.email = email;
    }

    /**
     * @return the team
     */
    public String getTeam() {
        System.out.println("inside team getter method");
        return team;
    }

    /**
     * @param team the team to set
     */
    public void setTeam(String team) {
        System.out.println("inside team setter method");
        this.team = team;
    }

    /**
     * @return the randomFortune
     */
    public String getRandomFortune() {
        System.out.println("inside getter random fortune");
        return randomFortune;
    }

    /**
     * @param randomFortune the randomFortune to set
     */
    public void setRandomFortune(RandomFortuneService randomFortune) {
        System.out.println("inside setter random fortune");
        this.randomFortune = randomFortune.getFortune();
    }

}
