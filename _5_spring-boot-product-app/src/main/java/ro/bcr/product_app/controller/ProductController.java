package ro.bcr.product_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ro.bcr.product_app.model.Product;
import ro.bcr.product_app.service.ProductService;

@RestController
public class ProductController {

    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/product/add")
    public void addProduct(@RequestBody Product p){
        productService.addProduct(p);
    }
}
