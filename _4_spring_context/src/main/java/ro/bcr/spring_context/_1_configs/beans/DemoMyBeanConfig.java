package ro.bcr.spring_context._1_configs.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoMyBeanConfig {

    public static void main(String[] args) {

        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(Config.class);

        MyBean myBean = ctx.getBean("myBean", MyBean.class);
        // the same reference, the beans are singleton by default
        MyBean myBean2 = ctx.getBean("myBean", MyBean.class);

        myBean.complexOperation();

    }
}
