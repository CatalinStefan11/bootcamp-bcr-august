package ro.bcr.spring_context._2_autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoAutowired {

    public static void main(String[] args) {

        var ctx = new AnnotationConfigApplicationContext(AutowiredConfig.class);

        TextEditor textEditor = ctx.getBean(TextEditor.class);

        textEditor.spellCheck();
        textEditor.format();
        textEditor.convertImage();

    }
}
