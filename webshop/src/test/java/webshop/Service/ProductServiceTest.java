package webshop.Service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import webshop.Data.Repository.ProductRepository;
import webshop.Model.Product;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class ProductServiceTest {

    private static final int productId = 20;

    @InjectMocks
    ProductService productService;

    @Mock
    ProductRepository mockedProductRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);

        //arrange
        //definer dummydata - productId er defineret som konstant 5
        Product product = new Product(productId, "test", 150);

        // Define what is returned when mock repository is called
        Mockito.when(mockedProductRepository.getProduct(productId)).thenReturn(product);

    }

    @Test
    void getProduct() {

        //act
        String productName = productService.getProduct(productId).getProduct_Name();

        //assert
        assertEquals("test", productName);

        // Test that read gets called exactly once when service is called
        Mockito.verify(mockedProductRepository, Mockito.times(1)).getProduct(productId);
    }







/*
    @Autowired
    ProductService productService;

    @Test
    void readAll() {
        List<Product> a;

        a = productService.readAll();
        long antal = a.size();

        assertEquals(4, antal);

    }

    @Test
    void getProduct() {
        int id = 1;

        Product product = productService.getProduct(id);

        assertEquals(product.getProduct_Id(), id);
    }


    @Test
    void createProduct() {
        Product product = new Product("test", 200);

        productService.createProduct(product);

        Product productActual = productService.getProduct(10);

        assertEquals(product.getProduct_Name(), productActual.getProduct_Name());


    }

 */


}