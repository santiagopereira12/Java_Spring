package com.project.Market.web.controller;

import com.project.Market.domain.Product;
import com.project.Market.domain.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/all")
    public List<Product> getAll(){
        return productService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Product> getProduct(int productId){
        return productService.getProduct(productId);
    }

    @GetMapping("/category/{categoryId}")
    public Optional<List<Product>> getByCategory(int categoryId){
        return productService.getByCategory(categoryId);
    }

    @PostMapping("/save")
    public Product save(Product product){
        return productService.save(product);
    }

    @DeleteMapping("/delete/{id}")
    public Boolean delete(int productId){
        return productService.delete(productId);
    }
}
