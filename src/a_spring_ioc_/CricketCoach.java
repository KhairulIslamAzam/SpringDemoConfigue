package a_spring_ioc_;

public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Workout for 5 hours";
    }

    @Override
    public String getPractice() {
        return "Batting and Bolling";
    }
}
