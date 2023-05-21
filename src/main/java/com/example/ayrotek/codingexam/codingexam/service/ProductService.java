package com.example.ayrotek.codingexam.codingexam.service;

import com.example.ayrotek.codingexam.codingexam.dao.ProductDao;
import com.example.ayrotek.codingexam.codingexam.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {

    private final ProductDao productDao;
    @Autowired
    public ProductService(@Qualifier("fakeDao") ProductDao productDao) {
        this.productDao = productDao;
    }
    public int addProduct(Product product) {
        return productDao.insertProduct(product.getId(), product);
    }
    public List<Product> getAllProducts() {
        return productDao.selectAllProducts();
    }
    public int deleteProduct(String id, String ownerId) {
        return productDao.deleteProductById(id, ownerId);
    }
    public int updateProduct(String id, Product product, String ownerId) {
        return productDao.updateProductById(id, product, ownerId);
    }
    public Product getProductById(String id) {
        return productDao.selectProductById(id)
                .orElse(null);

    }
}
