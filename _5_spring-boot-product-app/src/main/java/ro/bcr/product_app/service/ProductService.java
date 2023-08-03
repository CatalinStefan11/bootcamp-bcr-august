package ro.bcr.product_app.service;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import ro.bcr.product_app.model.Product;
import ro.bcr.product_app.repository.ProductRepository;

import java.util.List;


@Service
@Slf4j
public class ProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void addProduct(Product p){
        log.info("Adding product");
        productRepository.addProduct(p.getName(), p.getDescription());
    }

    public List<Product> getProducts(){
        log.info("Retrieving all products");
        return productRepository.getAllProducts();
    }

    public Product findById(long id){
        log.info("Retrieving product with {}", id);
        return productRepository.findById(id);
    }
}
