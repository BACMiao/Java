package test.com.service;
import com.dao.UserDAO;
import com.service.UserService;
import org.junit.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.User;

//Dependency Injection
//Inverse of Control
public class UserServiceTest {

	@Test
	public void testAdd() throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		UserService service = (UserService)ctx.getBean("userService");
//		UserService service2 = (UserService)ctx.getBean("userService");
//		System.out.println(service==service2);
		User u = new User();
//		u.setUsername("zhangsan");
//		u.setPassword("zhangsan");
		service.add(u);
	}

	@Test
	public void test2() throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		UserDAO u1 = (UserDAO) ctx.getBean("userDAO");
		System.out.println(u1);

	}
	@Test
	public void test3() throws Exception {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

		UserService service = (UserService)ctx.getBean("userService");
//		System.out.println(service.getClass());
		service.add(new User());
	}
	@Test
	public void test4() throws Exception {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");

		UserService service = (UserService)ctx.getBean("userService");
		System.out.println(service.getClass());
		service.add(new User());
	}


}
