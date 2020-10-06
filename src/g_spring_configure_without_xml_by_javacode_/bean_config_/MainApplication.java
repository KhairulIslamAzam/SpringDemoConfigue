package g_spring_configure_without_xml_by_javacode_.bean_config_;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApplication {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigJava.class);

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
