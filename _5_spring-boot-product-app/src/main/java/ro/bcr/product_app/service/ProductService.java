package ro.bcr.product_app.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ro.bcr.product_app.model.Product;
import ro.bcr.product_app.repository.ProductRepository;


@Service
public class ProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void addProduct(Product p){
        productRepository.addProduct(p.getName(), p.getDescription());
    }
}
