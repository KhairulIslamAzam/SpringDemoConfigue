package b_spring_di_;

import d_spring_injecting_propetise_values_.League;

import java.util.Random;

public class Pcl implements League {
    private String [] teamsName = {"ABC","DBC","SYZ","DFE"};
    private Random random = new Random();

    @Override
    public String getLeague() {

        int index = random.nextInt(teamsName.length);
        String teamName = teamsName[index];

        return teamName;
    }
}