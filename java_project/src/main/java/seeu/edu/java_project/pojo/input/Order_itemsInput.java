package seeu.edu.java_project.pojo.input;

import seeu.edu.java_project.pojo.entity.Order;
import seeu.edu.java_project.pojo.entity.Order_ItemsKey;
import seeu.edu.java_project.pojo.entity.Product;


public class Order_itemsInput {
   private Order order_id;
   private Product product_id;
   private Integer quantity;

    public Order_itemsInput() {

    }

    public Order_itemsInput(Order_ItemsKey order_itemsKey, Order order_id, Product product_id, Integer quantity) {
        this.order_id = order_id;
        this.product_id = product_id;
        this.quantity = quantity;
    }

    public Order getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Order order_id) {
        this.order_id = order_id;
    }

    public Product getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Product product_id) {
        this.product_id = product_id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
