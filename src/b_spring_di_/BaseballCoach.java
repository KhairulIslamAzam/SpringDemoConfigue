package b_spring_di_;

public class BaseballCoach implements Coach {

    private League league;

    public BaseballCoach(League league) {
        this.league = league;
    }

    @Override
    public String getDailyWorkout() {
        return "WOrk out 10 hours";
    }

    @Override
    public String getLeague() {
        return league.getLeague();
    }
}
