package seeu.edu.java_project.service;

import seeu.edu.java_project.pojo.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    Product findProductById(Integer id);

}
