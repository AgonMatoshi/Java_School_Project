package seeu.edu.java_project.service;

import seeu.edu.java_project.pojo.entity.Order_items;

import java.util.List;

public interface Order_ItemsService {
    List<Order_items> findAll();
    Order_items findOrder_itemsByOredrId(Integer o_id , Integer p_id );

}
