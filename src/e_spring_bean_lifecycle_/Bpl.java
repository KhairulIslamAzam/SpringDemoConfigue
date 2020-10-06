package e_spring_bean_lifecycle_;
import java.util.Random;

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
