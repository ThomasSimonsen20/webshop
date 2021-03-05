package webshop.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import webshop.Model.Product;
import webshop.Service.ProductService;

/*
//@Controller
public class webshopController {

    @Autowired
    ProductService productService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("products", productService.readAll());
        return "index";
    }

    @GetMapping("createProduct")
    public String createProduct() {
        return "createProduct";
    }

    @PostMapping("/createProduct")
    public String createProduct(@ModelAttribute Product product) {
        productService.createProduct(product);
        return "redirect:/";
    }

    @GetMapping("/update/{id}")
    public String update(@PathVariable("id") int id, Model model) {
        model.addAttribute("product", productService.getProduct(id));
        return "update";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Product product) {
        productService.updateProduct(product);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id) {
        productService.deleteProduct(productService.getProduct(id));
        return "redirect:/";
    }

}

 */
