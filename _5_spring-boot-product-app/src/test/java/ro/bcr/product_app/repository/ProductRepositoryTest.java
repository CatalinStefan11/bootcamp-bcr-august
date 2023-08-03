package ro.bcr.product_app.repository;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import ro.bcr.product_app.model.Product;
import ro.bcr.product_app.repository.ProductRepository;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

@ExtendWith(SpringExtension.class)
public class ProductRepositoryTest {

    @Mock
    private JdbcTemplate jdbcTemplate;

    @InjectMocks
    private ProductRepository productRepository;

    @Test
    void testAddProduct() {
        String productName = "test";
        String description = "test description";

        when(jdbcTemplate.update(anyString(), anyString(), anyString()))
                .thenReturn(1);

        productRepository.addProduct(productName, description);

        verify(jdbcTemplate, times(1))
                .update(
                        eq("INSERT INTO product(name, description) VALUES(?, ?)"),
                        eq(productName),
                        eq(description));
    }

    @Test
    void testFindAllProducts() {
        List<Product> productList = Arrays.asList(
                new Product(1, "Product 1", "Description 1"),
                new Product(2, "Product 2", "Description 2")
        );

        // we tell jdbc template how to response when this method query is called with
        // this parameters (any string and any instance of the RowMapper)
        // we can do this because jdbcTemplate is a MOCK otherwise we cannot combine
        // non-mocks instance with when()
        when(jdbcTemplate.query(anyString(), any(RowMapper.class)))
                .thenReturn(productList);

        List<Product> actual = productRepository.getAllProducts();

        assertEquals(2, actual.size());
        assertEquals("Product 1", actual.get(0).getName());
        assertEquals("Product 2", actual.get(1).getName());

        verify(jdbcTemplate, times(1)).query(anyString(), any(RowMapper.class));
    }


}
