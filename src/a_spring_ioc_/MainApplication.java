package a_spring_ioc_;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach tomMody = context.getBean("myCoach", Coach.class);

        System.out.println(tomMody.getDailyWorkout());
        System.out.println(tomMody.getPractice());

        context.close();
    }
}
