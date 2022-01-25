package seeu.edu.java_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import seeu.edu.java_project.pojo.entity.Order;
import seeu.edu.java_project.pojo.entity.User;
import seeu.edu.java_project.pojo.input.OrderInput;
import seeu.edu.java_project.repository.OrderRepository;

import java.util.List;

@RestController
public class OrderController {
@Autowired
    private OrderRepository orderRepository;

    @GetMapping("/order")
    public List<Order> getOrders(){
    return orderRepository.findAll();
    }
    @GetMapping("/getOrderById/{id}")
    public Order getOrderById (@PathVariable  Integer id){

    return orderRepository.findOrderById(id);
    }
    @PostMapping("create/order")
    public Order createOrder(@RequestBody OrderInput orderInput){
            String newStatus = orderInput.getStatus();
            String newCreated_At = orderInput.getCreated_at();
            User newUser = orderInput.getUser();

            Order order = new Order();
            order.setStatus(newStatus);
            order.setCreated_at(newCreated_At);
            order.setUser(newUser);
            orderRepository.save(order);
            return (order);

    }
    @PutMapping("update/order/{id}")
    public Order updateOrder (@PathVariable Integer id,
                              @RequestBody OrderInput orderInput){
        Order order = orderRepository.findOrderById(id);
        if(order == null)
        {
            return null;
        }
        String updatedStatus = orderInput.getStatus();
        String updatedCreated_At = orderInput.getCreated_at();
        User updatedUser = orderInput.getUser();

        order.setStatus(updatedStatus);
        order.setCreated_at(updatedCreated_At);
        order.setUser(updatedUser);

        orderRepository.save(order);
        return (order);

    }
    @DeleteMapping("/deleteOrder/{id}")
    public String deleteOrderById(@PathVariable Integer id){
        Order order = orderRepository.findOrderById(id);
        if(order == null){
            return "The order with id:"+ id +" dose not exist!";
        }
        orderRepository.delete(order);
        return "The product with id:" + id + " is deleted successfully!";
    }



}
