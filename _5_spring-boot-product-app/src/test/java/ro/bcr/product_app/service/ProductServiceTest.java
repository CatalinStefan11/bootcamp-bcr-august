package ro.bcr.product_app.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import ro.bcr.product_app.model.Product;
import ro.bcr.product_app.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(SpringExtension.class)
public class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductService productService;

    @Test
    public void testFindById(){
        int id = 1;
        Product p = new Product(id, "test prod", "test description");

        when(productRepository.findById(id)).thenReturn(p);

        Product result = productService.findById(id);

        assertEquals(id, result.getId());
        assertEquals("test prod", result.getName());
        assertEquals("test description", result.getDescription());

        verify(productRepository, times(1)).findById(id);
    }

}
