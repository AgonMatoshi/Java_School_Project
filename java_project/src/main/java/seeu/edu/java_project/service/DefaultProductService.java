package seeu.edu.java_project.service;

import org.springframework.beans.factory.annotation.Autowired;
import seeu.edu.java_project.pojo.entity.Product;
import seeu.edu.java_project.repository.ProductRepository;

import java.util.List;

public class DefaultProductService implements ProductService{
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return null;
    }

    @Override
    public Product findProductById(Integer id) {
        return null;
    }
}
