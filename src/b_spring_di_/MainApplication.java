package b_spring_di_;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("diapplicationContext.xml");
        //Constructor
//        Coach tom = context.getBean("myCoach", Coach.class);
//
//        System.out.println(tom.getDailyWorkout());
//        System.out.println(tom.getLeague());


        //setter method
        Coach baseballCoach = context.getBean("baseballCoach", Coach.class);
        System.out.println(baseballCoach.getDailyWorkout());
        System.out.println(baseballCoach.getLeague());

        context.close();
    }
}
