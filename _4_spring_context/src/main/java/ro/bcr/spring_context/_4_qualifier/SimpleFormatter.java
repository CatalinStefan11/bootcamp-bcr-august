package ro.bcr.spring_context._4_qualifier;

import org.springframework.stereotype.Component;

@Component("simple")
public class SimpleFormatter implements Formatter {

    @Override
    public String format() {
        System.out.println("simple format");
        return "formatted";
    }

}
