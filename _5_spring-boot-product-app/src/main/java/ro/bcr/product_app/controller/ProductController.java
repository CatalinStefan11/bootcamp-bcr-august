package ro.bcr.product_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.bcr.product_app.model.Product;
import ro.bcr.product_app.service.ProductService;

import java.util.List;

@RestController
public class ProductController {

    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/product/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void addProduct(@RequestBody Product p) {
        productService.addProduct(p);
    }

    @GetMapping("/products/all")
    public List<Product> getAllProducts() {
        return productService.getProducts();
    }

    // http://api/1 -> path param
    // http://api?queryParam1=value1&queryParam2=value2 -> queryParam/requestParam

    // path variable / path param
    @GetMapping("/product/{id}")
    public Product findById(@PathVariable long id){
        return productService.findById(id);
    }

    @PostMapping("/products-without-tx")
    public void addProductsWithoutTx(@RequestBody List<Product> products){
        productService.addProductsWithoutTx(products);
    }

    @PostMapping("/products-with-tx")
    public void addProductsWithTx(@RequestBody List<Product> products){
        productService.addProductsWithTransaction(products);
    }

}
