package seeu.edu.java_project.service;

import seeu.edu.java_project.pojo.entity.Order;

import java.util.List;

public interface OrderService {
    List<Order> findAll();
    Order findOrderById(Integer id);
}
