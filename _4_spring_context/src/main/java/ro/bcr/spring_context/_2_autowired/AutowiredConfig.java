package ro.bcr.spring_context._2_autowired;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("ro.bcr.spring_context._2_autowired")
@Configuration
public class AutowiredConfig {

    public AutowiredConfig() {
        System.out.println("Config created");
    }
}
