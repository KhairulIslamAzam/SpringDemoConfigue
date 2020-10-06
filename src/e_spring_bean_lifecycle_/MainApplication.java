package e_spring_bean_lifecycle_;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean_lifecyle_applocationContext.xml");

        CricketCoach tomMody = context.getBean("cricketCoach", CricketCoach.class);

//        tomMody.doInitMethod();
//        tomMody.doDestroyMethod();
        System.out.println(tomMody.getDailyWorkout());
        //System.out.println(tomMody.getPractice());


        context.close();
    }
}
