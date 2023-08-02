package ro.bcr.spring_context._4_qualifier;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// primary makes this bean the default bean to inject in case
// there are no hard requirements like @Qualifier
@Component("advanced")
@Primary
public class AdvancedFormatter implements Formatter {

    @Override
    public String format() {
        System.out.println("advanced format");
        return "formatted";
    }
}
