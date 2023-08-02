package ro.bcr.spring_context._1_configs.scan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoScanConfig {

    public static void main(String[] args) {

        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(ScanConfig.class);

        MyComponent myComponent = ctx.getBean("myComponent", MyComponent.class);

        myComponent.complexOperation();

    }
}
