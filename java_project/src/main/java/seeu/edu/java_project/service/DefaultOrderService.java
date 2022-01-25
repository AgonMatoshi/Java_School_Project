package seeu.edu.java_project.service;

import org.springframework.beans.factory.annotation.Autowired;
import seeu.edu.java_project.pojo.entity.Order;
import seeu.edu.java_project.repository.OrderRepository;

import java.util.List;

public class DefaultOrderService implements OrderService {
   @Autowired
   private OrderRepository orderRepository;

    @Override
    public List<Order> findAll() {
        return null;
    }

    @Override
    public Order findOrderById(Integer id) {
        return null;
    }
}
