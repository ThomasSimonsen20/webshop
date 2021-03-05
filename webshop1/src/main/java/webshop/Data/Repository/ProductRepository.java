package webshop.Data.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import webshop.Model.Product;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository implements IcrudRepository<Product> {


    private List<Product> productList = new ArrayList<>();

    @Autowired
    JdbcTemplate template;


    @Override
    public void createProduct(Product product) {
        String sql = "INSERT INTO product (product_Name, product_Price) VALUES (?,?)";
        template.update(sql, product.getProduct_Name(), product.getProduct_Price());
    }

    @Override
    public List<Product> readAll() {
        String sql = "SELECT * FROM product";
        RowMapper<Product> rowMapper = new BeanPropertyRowMapper<>(Product.class);
        return template.query(sql, rowMapper);
    }

    @Override
    public Product getProduct(int product_Id) {
        String sql = "SELECT * FROM product WHERE product_Id=?";
        RowMapper<Product> rowMapper = new BeanPropertyRowMapper<>(Product.class);
        return template.queryForObject(sql, rowMapper, product_Id);
    }

    @Override
    public void updateProduct(Product product) {
        String sql = "UPDATE product SET product_Name= ? , product_Price= ? WHERE product_Id= ? ";
        template.update(sql, product.getProduct_Name(), product.getProduct_Price(), product.getProduct_Id());
    }

    @Override
    public void deleteProduct(Product product) {
        String sql = "DELETE FROM product WHERE product_Id=?";
        template.update(sql, product.getProduct_Id());
    }


}
