package seeu.edu.java_project.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import seeu.edu.java_project.pojo.entity.Order_ItemsKey;
import seeu.edu.java_project.pojo.entity.Order_items;

import java.util.List;

@Repository
public interface OrderItemsRepository extends CrudRepository<Order_items, Order_ItemsKey > {
    List<Order_items> findAll();

    @Query("SELECT o" +
            " FROM Order_items o " +
            " WHERE o.order_id.id = ?1 " +
            " AND o.product_id.id = ?2")
    Order_items customFindOrderItem(Integer orderId, Integer productId);

}
