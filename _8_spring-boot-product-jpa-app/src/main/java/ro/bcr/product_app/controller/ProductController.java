package ro.bcr.product_app.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ro.bcr.product_app.model.Product;
import ro.bcr.product_app.service.ProductService;

import java.util.List;

@RestController
@Validated
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/product/add")
    public void createProduct(@RequestBody Product p){
        this.productService.addProduct(p);
    }

    @GetMapping("products/all")
    public List<Product> getAllProducts(){
        return this.productService.findAllProducts();
    }

    @GetMapping("product/{id}")
    public Product getById(@PathVariable long id){
        return this.productService.findById(id);
    }

}
