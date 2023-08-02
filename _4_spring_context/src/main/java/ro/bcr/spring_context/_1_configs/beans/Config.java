package ro.bcr.spring_context._1_configs.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public MyBean myBean(){
        return new MyBean();
    }
}
