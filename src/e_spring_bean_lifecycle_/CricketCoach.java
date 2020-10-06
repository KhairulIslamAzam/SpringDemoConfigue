package e_spring_bean_lifecycle_;

public class CricketCoach implements Coach {

//    private League league;
//
//    public CricketCoach(League league) {
//        System.out.println(" constructor of Cricket Coach");
//        this.league = league;
//    }


    public CricketCoach() {
        System.out.println("Default constructor");
    }

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

//    @Override
//    public String getPractice() {
//        return "Batting and Bolling";
//    }
}
