package f_spring_java_anotation_autowired_;

import org.springframework.stereotype.Component;

@Component
public class Cpl implements League {
    @Override
    public String getLeague() {
        return "Caribian premier league";
    }
}
