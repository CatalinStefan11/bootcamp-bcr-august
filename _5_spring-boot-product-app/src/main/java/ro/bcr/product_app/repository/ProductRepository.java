package ro.bcr.product_app.repository;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ro.bcr.product_app.config.ProjectConfig;
import ro.bcr.product_app.model.Product;

import java.util.List;

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

    public void addProduct(String name, String description) {
        String sql = "INSERT INTO product(name, description) VALUES(?, ?)";
        jdbcTemplate.update(sql, name, description);
    }

    public List<Product> getAllProducts() {
        String sql = "SELECT * FROM product";
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            return new Product(rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("description"));
        });
    }

    public Product findById(long id){
        String sql = "SELECT * FROM product WHERE ID = ?";
        return jdbcTemplate.queryForObject(sql, (rs, rowNum) -> {
            return new Product(rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("description"));
        }, id);
    }

    public void addProductsWithoutTx(List<Product> products){
        String sql = "INSERT INTO product(name, description) VALUES(?, ?)";
        for(int i = 0; i < products.size(); i++){
            jdbcTemplate.update(sql, products.get(i).getName(), products.get(i).getDescription());
            // we simulated that something wrong is happening while adding products to db
            if(i == 2){
                throw new RuntimeException("Something wrong occurred");
            }
        }
    }

    // https://www.marcobehler.com/guides/spring-transaction-management-transactional-in-depth
    @Transactional
    public void addProductsWithTransaction(List<Product> products){
        String sql = "INSERT INTO product(name, description) VALUES(?, ?)";
        for(int i = 0; i < products.size(); i++){
            jdbcTemplate.update(sql, products.get(i).getName(), products.get(i).getDescription());
            // we simulated that something wrong is happening while adding products to db
            if(i == 2){
                throw new RuntimeException("Something wrong occurred");
            }
        }
    }


}
