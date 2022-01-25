package seeu.edu.java_project.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import seeu.edu.java_project.pojo.entity.Product;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product,Integer> {
    List<Product> findAll();
    Product findProductsById(Integer id);
}
