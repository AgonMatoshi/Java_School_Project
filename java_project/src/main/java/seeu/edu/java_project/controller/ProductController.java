package seeu.edu.java_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import seeu.edu.java_project.pojo.entity.Product;
import seeu.edu.java_project.pojo.input.ProductInput;
import seeu.edu.java_project.repository.ProductRepository;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/products")
    public List<Product> getProducts(){
        return productRepository.findAll();
    }

    @GetMapping ("/products/{id}")
    public Product getProductById(@PathVariable Integer id){
        return productRepository.findProductsById(id);
    }

    @PostMapping("/create/product")
    public Product createProduct(@RequestBody ProductInput productInput){
        String newName = productInput.getName();
        Integer newPrice = productInput.getPrice();
        String newStatus = productInput.getStatus();
        String newCreate_At = productInput.getCreated_at();

        Product product = new Product();

        product.setName(newName);
        product.setPrice(newPrice);
        product.setStatus(newStatus);
        product.setCreated_at(newCreate_At);

        productRepository.save(product);
        return (product);
    }

    @PutMapping("/update/product/{id}")
    public Product updateProduct (@PathVariable Integer id,
                                  @RequestBody ProductInput productInput){
        Product product= productRepository.findProductsById(id);
        if(product ==null){
            return null;
        }
        String updatedName = productInput.getName();
        Integer updatedPrice = productInput.getPrice();
        String updatedStatus = productInput.getStatus();
        String updatedCreate_At = productInput.getCreated_at();

        product.setName(updatedName);
        product.setPrice(updatedPrice);
        product.setStatus(updatedStatus);
        product.setCreated_at(updatedCreate_At);

        productRepository.save(product);
        return (product);
    }

    @DeleteMapping ("/delete/product/{id}")
    public String deleteProduct(@PathVariable Integer id){
        Product product = productRepository.findProductsById(id);
        if(product == null){
            return "The product with id:"+ id+ " dose not exist!";
        }
        productRepository.delete(product);
        return "The product with id:" + id + " is deleted successfully!";
    }
}
