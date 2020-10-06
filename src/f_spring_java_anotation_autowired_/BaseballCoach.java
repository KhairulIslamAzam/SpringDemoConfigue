package f_spring_java_anotation_autowired_;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

    @Value("${foo.team}")
    private String team;
    @Value("${foo.coachName}")
    private String coachName;

    private League league;

    @Autowired
    @Qualifier("pcl")
    public void setLeague(League league) {
        System.out.println("set method of baseball");
        this.league = league;
    }

    @Override
    public String getDailyWorkout() {
        return "Work out baseball";
    }

    @Override
    public String getLeague() {
        return league.getLeague();
    }

    public String getTeam() {
        return team;
    }

    public String getCoachName() {
        return coachName;
    }
}
