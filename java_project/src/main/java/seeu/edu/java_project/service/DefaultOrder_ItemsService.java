package seeu.edu.java_project.service;

import org.springframework.beans.factory.annotation.Autowired;
import seeu.edu.java_project.pojo.entity.Order_items;
import seeu.edu.java_project.repository.OrderItemsRepository;

import java.util.List;

public class DefaultOrder_ItemsService implements Order_ItemsService{

    @Autowired
    private OrderItemsRepository orderItemsRepository;
    @Override
    public List<Order_items> findAll() {
        return null;
    }

    @Override
    public Order_items findOrder_itemsByOredrId(Integer o_id, Integer p_id) {
        return null;
    }
}
