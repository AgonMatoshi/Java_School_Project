package seeu.edu.java_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import seeu.edu.java_project.pojo.entity.Order;
import seeu.edu.java_project.pojo.entity.Order_ItemsKey;
import seeu.edu.java_project.pojo.entity.Order_items;
import seeu.edu.java_project.pojo.entity.Product;
import seeu.edu.java_project.pojo.input.Order_itemsInput;
import seeu.edu.java_project.repository.OrderItemsRepository;

import java.util.List;

@RestController
public class Order_ItemsController {
    @Autowired
    private OrderItemsRepository orderItemsRepository;

    @GetMapping("/order_items")
    public List<Order_items> getOrder_Items(){
        return orderItemsRepository.findAll();
    }

    @GetMapping ("/getorder_items")
    public Order_items getOrder_itemsById(@RequestParam Integer orderId, @RequestParam Integer productId){
        return orderItemsRepository.customFindOrderItem(orderId, productId);
    }


    @PostMapping("/add/order_items")
    public Order_items addOrder_Items(@RequestBody Order_itemsInput order_itemsInput)
    {

        Order newOrdr_Id = order_itemsInput.getOrder_id();
        Product newProduct_Id = order_itemsInput.getProduct_id();
        Integer newQuantity = order_itemsInput.getQuantity();

        Order_ItemsKey orderItemKy = new Order_ItemsKey();
        orderItemKy.setOrderId(newOrdr_Id.getId());
        orderItemKy.setProductId(newProduct_Id.getId());

        Order_items order_items = new Order_items();
        order_items.setId(orderItemKy);
        order_items.setOrder_id(newOrdr_Id);
        order_items.setProduct_id(newProduct_Id);
        order_items.setQuantity(newQuantity);

        orderItemsRepository.save(order_items);
        return (order_items);
    }
    @DeleteMapping("/deleteOrderItems")
    public String deleteOrderItems(@RequestParam Integer orderId, @RequestParam Integer productId){
        Order_items order_items=orderItemsRepository.customFindOrderItem(orderId, productId);
        if(order_items == null){
            return "The required order item with order id:"+ orderId+" and product id: "+ productId+" dose not exist!";
        }
        orderItemsRepository.delete(order_items);
        return "The required order item with order id:"+ orderId+" and product id: "+ productId+" is deleted successfully!";
    }

}
