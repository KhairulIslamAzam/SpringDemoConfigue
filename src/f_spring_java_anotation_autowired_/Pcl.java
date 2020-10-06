package f_spring_java_anotation_autowired_;
import org.springframework.stereotype.Component;

@Component
public class Pcl implements League {

    @Override
    public String getLeague() {
        return "pakistan cricket league";
    }
}
