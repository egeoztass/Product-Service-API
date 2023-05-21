package com.example.ayrotek.codingexam.codingexam.dao;

import com.example.ayrotek.codingexam.codingexam.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductDao {
    int insertProduct(String id, Product product);
    List<Product> selectAllProducts();
    int deleteProductById(String id, String ownerId);
    int updateProductById(String id, Product product, String ownerId);
    Optional<Product> selectProductById(String id);
}
