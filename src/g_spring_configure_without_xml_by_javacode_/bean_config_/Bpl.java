package g_spring_configure_without_xml_by_javacode_.bean_config_;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class Bpl implements League {
    private List<String> leagueName ;
    private Random random = new Random();
    private String pathName = "G:\\Spring practice\\Spring_Exercise\\Spring_IOC\\src\\leaguename.txt";
   // private BufferedReader bufferedReader;
    //private FileReader fileReader;
    private File file;

    public Bpl() {
        leagueName = new ArrayList<>();
        file = new File(pathName);
        System.out.println("Reading league from the file "+ file);
        System.out.println("file exits "+file.exists());

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){

            String line;

            while ((line = bufferedReader.readLine()) != null){
                leagueName.add(line);
            }
        } catch (IOException e) {
            System.out.println("io exception");;
        }
    }

    @Override
    public String getLeague() {

        int index = random.nextInt(leagueName.size());
        String league = leagueName.get(index);

        return league;
    }
}
