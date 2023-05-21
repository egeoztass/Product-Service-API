package com.example.ayrotek.codingexam.codingexam.controller;

import com.example.ayrotek.codingexam.codingexam.model.Product;
import com.example.ayrotek.codingexam.codingexam.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RequestMapping("api/v1/product")
@RestController
public class ProductController {

    private final ProductService productService;
    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @PostMapping
    public void addProduct(@RequestBody Product product) {
        productService.addProduct(product);
    }
    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
    @DeleteMapping(path = "{id}/{ownerId}")
    public void deleteProduct(@PathVariable("id") String id, @PathVariable("ownerId") String ownerId) {
        productService.deleteProduct(id, ownerId);
    }
    @PutMapping(path = "{id}/{ownerId}")
    public void updateProduct(@PathVariable("id") String id, @PathVariable("ownerId") String ownerId, @RequestBody Product product) {
        productService.updateProduct(id, product, ownerId);
    }

}
