package b_spring_di_;

public class CricketCoach implements Coach {

    private League league;

    public CricketCoach(League league) {
        this.league = league;
    }

    @Override
    public String getDailyWorkout() {
        return "Work out 5 hour in a row";
    }

    @Override
    public String getLeague() {
        return league.getLeague();
    }

}
