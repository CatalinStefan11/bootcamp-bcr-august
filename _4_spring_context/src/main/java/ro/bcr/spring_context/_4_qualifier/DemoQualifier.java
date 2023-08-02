package ro.bcr.spring_context._4_qualifier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoQualifier {

    public static void main(String[] args) {

        var ctx = new AnnotationConfigApplicationContext(QualifierConfig.class);

        FormatService formatService =
                (FormatService) ctx.getBean("formatService");

        formatService.format();

    }

}
