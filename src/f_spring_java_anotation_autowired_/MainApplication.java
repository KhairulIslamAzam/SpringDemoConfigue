package f_spring_java_anotation_autowired_;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("anotation_autowiredapplicationContext.xml");

        //autowired
        CricketCoach tomMody = context.getBean("cricketCoach", CricketCoach.class);

//        tomMody.doInitMethod();
//        tomMody.doDestroyMethod();
        System.out.println(tomMody.getDailyWorkout());
        System.out.println(tomMody.getLeague());

        //autowire and qualifier

//        Coach qulifierCoach = context.getBean("coachQualifier",Coach.class);
//
//        System.out.println(qulifierCoach.getDailyWorkout());
//        System.out.println(qulifierCoach.getLeague());
        context.close();
    }
}
