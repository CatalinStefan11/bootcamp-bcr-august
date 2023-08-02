package ro.bcr.spring_context._5_scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoScope {


    public static void main(String[] args) {
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(ScopeConfig.class);

        createSingletonService(ctx);

        createPrototypeService(ctx);

    }

    private static void createSingletonService(ApplicationContext ctx) {
        SingletonService s1 = ctx.getBean(SingletonService.class);
        SingletonService s2 = ctx.getBean(SingletonService.class);
        SingletonService s3 = ctx.getBean(SingletonService.class);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }

    private static void createPrototypeService(ApplicationContext ctx) {
        PrototypeService s1 = ctx.getBean(PrototypeService.class);
        PrototypeService s2 = ctx.getBean(PrototypeService.class);
        PrototypeService s3 = ctx.getBean(PrototypeService.class);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
