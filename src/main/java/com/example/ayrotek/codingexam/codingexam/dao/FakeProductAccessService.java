package com.example.ayrotek.codingexam.codingexam.dao;

import com.example.ayrotek.codingexam.codingexam.model.Product;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository("fakeDao")
public class FakeProductAccessService implements ProductDao {

    private static List<Product> DB = new ArrayList<>();
    @Override
    public int insertProduct(String id, Product product) {
        DB.add(new Product(id, product.getName(), product.getDescription(), product.getOwnerId()));
        return 1;
    }
    @Override
    public List<Product> selectAllProducts() {
        return DB;
    }
    @Override
    public int deleteProductById(String id, String ownerId) {
        Optional<Product> productMaybe = selectProductById(id);
        if (productMaybe.isPresent() && productMaybe.get().getOwnerId().equals(ownerId)) {
            DB.remove(productMaybe.get());
            return 1;
        }
        return 0;
    }
    @Override
    public int updateProductById(String id, Product product, String ownerId) {
        return selectProductById(id)
                .map(p -> {
                    int indexOfProductToUpdate = DB.indexOf(p);
                    if (indexOfProductToUpdate >= 0 && p.getOwnerId().equals(ownerId)) {
                        DB.set(indexOfProductToUpdate, new Product(id, product.getName(), product.getDescription(), ownerId));
                        return 1;
                    }
                    return 0;
                })
                .orElse(0);
    }
    @Override
    public Optional<Product> selectProductById(String id) {
        return DB.stream()
                .filter(product -> product.getId().equals(id))
                .findFirst();
    }

}
