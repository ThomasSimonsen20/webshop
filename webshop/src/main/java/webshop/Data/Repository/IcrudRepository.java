package webshop.Data.Repository;

import webshop.Model.Product;

import java.util.List;

public interface IcrudRepository<Product> {
    void createProduct(Product product);
    List<Product> readAll();
    Product getProduct(int id);
    void updateProduct(Product product);
    void deleteProduct(Product product);
}

