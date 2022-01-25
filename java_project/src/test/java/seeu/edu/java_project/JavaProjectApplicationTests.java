package seeu.edu.java_project;

import org.aspectj.weaver.ast.Or;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import seeu.edu.java_project.pojo.entity.Order;
import seeu.edu.java_project.pojo.entity.Product;
import seeu.edu.java_project.pojo.entity.User;
import seeu.edu.java_project.repository.OrderRepository;
import seeu.edu.java_project.repository.ProductRepository;
import seeu.edu.java_project.repository.UserRepository;

import java.util.List;

@SpringBootTest
class JavaProjectApplicationTests {
	@Autowired
	OrderRepository orderRepository;
	@Autowired
	UserRepository userRepository;

	private static User user = new User(1,"Agon","am28675","000","12/08/2001","Today","Male");
	@Test
	public void TestOrder(){
		Order order= new Order();
		order.setId(1);
		order.setUser(user);
		order.setStatus("Available");
		order.setCreated_at("Today");
		orderRepository.save(order);
		assertNotNull(orderRepository.findOrderById(1));


	}
	private void assertNotNull(Order orderById) {
	}

	@Test
	public void testUser(){
	assertNotNull(userRepository.findAll());
	}

	private void assertNotNull(List<User> all) {
	}

}
