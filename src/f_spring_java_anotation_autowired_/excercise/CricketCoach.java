package f_spring_java_anotation_autowired_.excercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    private League league;

    @Autowired
    public CricketCoach(League league) {
        System.out.println(" constructor of Cricket Coach");
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
        return "Workout for 5 hours";
    }

    @Override
    public String getLeague() {
        return league.getLeague();
    }
}
