package ro.bcr.spring_context._6_lifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        try(var ctx = new AnnotationConfigApplicationContext(Configuration.class)){

            Cat c1 = ctx.getBean(Cat.class);

            c1.sawMeow();

            System.out.println("Before shutting down the context");
        }

        System.out.println("The context was shut down.");
    }
}
