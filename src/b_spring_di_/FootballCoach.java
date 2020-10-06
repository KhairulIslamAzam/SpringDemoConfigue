package b_spring_di_;

public class FootballCoach implements Coach {

    private League league;

    public FootballCoach() {
        System.out.println("Football constructor");
    }

    public void setLeague(League league) {
        System.out.println("Set method for football");
        this.league = league;
    }

    @Override
    public String getDailyWorkout() {
        return "Football workout";
    }

    @Override
    public String getLeague() {
        return league.getLeague();
    }
}
