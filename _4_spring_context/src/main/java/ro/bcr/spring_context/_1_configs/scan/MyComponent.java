package ro.bcr.spring_context._1_configs.scan;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {
    public void complexOperation(){
        System.out.println("complex stuff");
    }
}
