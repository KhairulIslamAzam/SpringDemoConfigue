package d_spring_injecting_propetise_values_;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertiseValuesMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("injecting_Propertise_values_applicationContext.xml");

        CricketCoach coach = context.getBean("myCoach", CricketCoach.class);
        System.out.println(coach.getCoachName());
        System.out.println(coach.getTeam());

        context.close();
    }
}
