package ro.bcr.product_app.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ro.bcr.product_app.exception.ProductAppException;
import ro.bcr.product_app.model.Product;
import ro.bcr.product_app.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class ProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void addProduct(Product p){
        log.info("Adding to db product {}", p);
        this.productRepository.save(p);
    }

    public List<Product> findAllProducts(){
        log.info("Retrieving all products");
        return this.productRepository.findAll();
    }

    public Product findById(long id){
        log.info("Retrieving product with id {}", id);

        Optional<Product> optional = productRepository.findById(id);

        return optional.orElseThrow(
                () -> new ProductAppException("Product not found"));
    }
}
