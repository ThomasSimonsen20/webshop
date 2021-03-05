package webshop.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webshop.Data.Repository.IcrudRepository;
import webshop.Data.Repository.ProductRepository;
import webshop.Model.Product;
import java.util.List;

@Service
public class ProductService implements IcrudRepository<Product> {

    @Autowired
    ProductRepository productRepository;

    public void createProduct(Product product) {
        productRepository.createProduct(product);
    }

    public List<Product> readAll() {
        return productRepository.readAll();
    }

    @Override
    public Product getProduct(int id) {
        return productRepository.getProduct(id);
    }

    @Override
    public void updateProduct(Product product) {
        productRepository.updateProduct(product);
    }

    @Override
    public void deleteProduct(Product product) {
        productRepository.deleteProduct(product);
    }

}
