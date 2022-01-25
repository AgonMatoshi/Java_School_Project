package seeu.edu.java_project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import seeu.edu.java_project.service.*;

@Configuration
public class ServicesAutoConfiguration {
    @Bean
    public UserService userService(){
        return new DefaultUserService();
    }
    @Bean
    public ProductService productService()
    {
        return  new DefaultProductService();
    }
    @Bean
    public OrderService orderService()
    {
        return  new DefaultOrderService();
    }
    @Bean Order_ItemsService order_itemsService(){
        return new DefaultOrder_ItemsService();
    }
}
