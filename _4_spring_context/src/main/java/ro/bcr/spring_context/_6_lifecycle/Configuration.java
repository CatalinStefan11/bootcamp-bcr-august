package ro.bcr.spring_context._6_lifecycle;

import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

    // the name of the method is the name of the bean from app context
    @Bean
    public Cat cat123(){
        return new Cat();
    }
}
