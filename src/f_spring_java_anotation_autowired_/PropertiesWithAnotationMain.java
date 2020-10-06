package f_spring_java_anotation_autowired_;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertiesWithAnotationMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("anotation_autowiredapplicationContext.xml");

        BaseballCoach baseballCoach = context.getBean("baseballCoach", BaseballCoach.class);

        System.out.println(baseballCoach.getDailyWorkout());
        System.out.println(baseballCoach.getLeague());
        System.out.println(baseballCoach.getTeam());
        System.out.println(baseballCoach.getCoachName());

        context.close();
    }
}
