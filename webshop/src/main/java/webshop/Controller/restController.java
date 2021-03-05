package webshop.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import webshop.Model.Product;
import webshop.Service.ProductService;

import java.util.List;

@RestController
@RequestMapping("*")
public class restController {

    @Autowired
    ProductService productService;

    @GetMapping("/products")
    public List<Product> allProducts() {
        return productService.readAll();
    }

    @GetMapping("products/{id}")
    public Product getProductById(@PathVariable("id") int id) {
        return productService.getProduct(id);

    }

}
