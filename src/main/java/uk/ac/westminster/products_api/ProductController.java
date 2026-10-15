package uk.ac.westminster.products_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/product")
public class ProductController {

    @Autowired
    private  ProductService productService;

//    @GetMapping("/{id}")
//    public Product getById(@PathVariable long id){
//        return new Product(id,"Laptop",999.99);
//    }
    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return productService.getAllProduct();
    }

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable Long id){
        return productService.getProductById(id).orElse(null);
    }

    @PostMapping("/productsv")
    public Product addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }

    @DeleteMapping("/product/{id}")
    public void deleteProduct(@PathVariable Long id){productService.deleteProduct(id);}

}
