package ro.bcr.product_app.config;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class ProjectConfig {

    private static final Logger log = LoggerFactory.getLogger(ProjectConfig.class);

    @Value("${spring.datasource.url}")
    private String dataSourceUrl;

    @Value("${spring.datasource.driver-class-name}")
    private String driverClassName;

    @Value("${spring.datasource.username}")
    private String username;

    @Value("${spring.datasource.password}")
    private String password;

    @Bean
    public DataSource dataSource(){
        var dataSource = new DriverManagerDataSource();

        log.info("Database driver {}", driverClassName);
        log.info("Database url {}", dataSourceUrl);
        log.info("Database user {}", username);
        log.info("Database pass {}", password);

        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(dataSourceUrl);
        dataSource.setUsername(username);
        dataSource.setPassword(password);

        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(){
        // calling the datasource() method doesn't that
        // we create a new datasource, it means that we tell
        // spring to inject the datasource dependency here
        return new JdbcTemplate(dataSource());
    }
}
