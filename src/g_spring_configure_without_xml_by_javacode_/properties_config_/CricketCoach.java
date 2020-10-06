package g_spring_configure_without_xml_by_javacode_.properties_config_;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    @Value("${foo.team}")
    private String team;

    @Value("${foo.coachName}")
    private String coachName;

    private League league;

    @Autowired
    public CricketCoach(League league) {
        System.out.println(" constructor of Cricket Coach no xml bean config");
        this.league = league;
    }


//    public CricketCoach() {
//        System.out.println("Default constructor");
//    }



    public void doInitMethod(){
        System.out.println("init method are started");
    }

    public void doDestroyMethod(){
        System.out.println("Destroy method are called");
    }

    @Override
    public String getDailyWorkout() {
        return "Workout for 10 hours";
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
