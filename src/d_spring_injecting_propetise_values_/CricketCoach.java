package d_spring_injecting_propetise_values_;

import c_spring_injecting_literal_values_.League;

public class CricketCoach implements Coach {

    private  League league;
    private  String team;
    private String coachName;

    public CricketCoach() {
        System.out.println("Default constructor");
    }

    public void setLeague(League league) {
        System.out.println("set League");
        this.league = league;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("set Team");
        this.team = team;
    }

    public String getCoachName() {
        return coachName;
    }

    public void setCoachName(String coachName) {
        System.out.println("set Coach Name");
        this.coachName = coachName;
    }

    @Override
    public String getDailyWorkout() {
        return "Work our 5 hour";
    }

    @Override
    public String getLeague() {
        return league.getLeague();
    }

}
