package c_spring_injecting_literal_values_;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LiteralValuesMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("injecting_Propertise_values_applicationContext.xml");

        //Constructor
        CricketCoach tom = context.getBean("myCoach", CricketCoach.class);

        System.out.println(tom.getDailyWorkout());
        System.out.println(tom.getLeague());
        System.out.println(tom.getCoachName());
        System.out.println(tom.getTeam());
        System.out.println();

        context.close();
    }
}
