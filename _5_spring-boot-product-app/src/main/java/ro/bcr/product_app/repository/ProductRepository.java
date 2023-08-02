package ro.bcr.product_app.repository;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ro.bcr.product_app.config.ProjectConfig;

@Repository
public class ProductRepository {

    private static final Logger log = LoggerFactory.getLogger(ProjectConfig.class);

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @PostConstruct
    private void initDatabase() {
        String sql = "CREATE TABLE IF NOT EXISTS product(" +
                "id SERIAL PRIMARY KEY," +
                "name VARCHAR(255)," +
                "description VARCHAR(255))";
        jdbcTemplate.update(sql);
        log.info("Database created.");
    }

    public void addProduct(String name, String description){
        String sql = "INSERT INTO product(name, description) VALUES(?, ?)";
        jdbcTemplate.update(sql, name, description);
    }

}
