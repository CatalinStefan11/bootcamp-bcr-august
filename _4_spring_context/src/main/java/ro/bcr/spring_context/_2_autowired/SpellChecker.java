package ro.bcr.spring_context._2_autowired;

import org.springframework.stereotype.Component;

@Component
public class SpellChecker {

    public SpellChecker() {
        System.out.println("SpellChecker created");
    }

    public void checkSpelling(){
        System.out.println("check spelling");
    }
}
