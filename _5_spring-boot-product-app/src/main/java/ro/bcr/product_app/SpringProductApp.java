package ro.bcr.product_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// because we use spring boot, the components are scanned in the
// package where main class resides and also in the subdirectories
@SpringBootApplication
public class SpringProductApp {
    public static void main(String[] args) {
        SpringApplication.run(SpringProductApp.class, args);
    }
}
