package seeu.edu.java_project.pojo.entity;

import javax.persistence.*;

@Entity
@Table(name="order_items")
public class Order_items {
    @EmbeddedId
    private Order_ItemsKey id;

    @ManyToOne
    @MapsId("orderId")
    @JoinColumn(name = "order_id")
    private  Order order_id;

    @ManyToOne
    @MapsId("productId")
    @JoinColumn(name = "product_id")
    private Product product_id;

    @Column(name = "quantity")
    private Integer quantity;

    public Order_items() {
    }

    public Order_ItemsKey getId() {
        return id;
    }

    public void setId(Order_ItemsKey id) {
        this.id = id;
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
