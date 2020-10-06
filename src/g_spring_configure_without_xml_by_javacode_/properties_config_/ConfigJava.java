package g_spring_configure_without_xml_by_javacode_.properties_config_;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("g_spring_configure_without_xml_by_javacode_.bean_config_")
@PropertySource("classpath:inject_values.properties")
public class ConfigJava {

    @Bean
    public League bpl(){
        return new Bpl();
    }

    @Bean
    public Coach cricketCoach(){
        return new CricketCoach(bpl());
    }

}
