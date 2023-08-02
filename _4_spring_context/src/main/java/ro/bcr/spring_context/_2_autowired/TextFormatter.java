package ro.bcr.spring_context._2_autowired;

import org.springframework.stereotype.Component;

@Component
public class TextFormatter {

    public TextFormatter() {
        System.out.println("Text formatter");
    }

    public void format(){
        System.out.println("formatting...");
    }
}
