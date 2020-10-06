package f_spring_java_anotation_autowired_;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class Bpl implements League {
    private String [] teamsName = {"ABC","DBC","SYZ","DFE"};
    private Random random = new Random();

    @Override
    public String getLeague() {

        int index = random.nextInt(teamsName.length);
        String teamName = teamsName[index];

        return teamName;
    }
}
