package ro.bcr.spring_context._3_stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoBook {

    public static void main(String[] args) {

        var ctx = new AnnotationConfigApplicationContext(BookConfig.class);

        BookController controller = ctx.getBean(BookController.class);
        controller.post("The lord of the rings");

    }
}
