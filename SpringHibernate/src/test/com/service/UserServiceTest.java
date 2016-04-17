package test.com.service;
import com.dao.UserDAO;
import com.service.UserService;
import org.junit.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.User;

//Dependency Injection
//Inverse of Control
/*
* 在此程序运行中，程序先依照xml配置文件初始化并实例化spring容器，并在注入UserService对象时其userDAO
* 注入UserDAOImpl的实例，让UserService对象可以使用UserDAOImpl的save方法。在此过程之前，若实例化
* UserDAOImpl对象时其属性（sessionFactory）需要注入，就应该在UserDAOImpl注入UserService之前给
* sessionFactory赋值，否则会产生空指针异常
* */
public class UserServiceTest {

	@Test
	public void testAdd() throws Exception {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");//实例化spring容器
		UserService service = (UserService)ctx.getBean("userService");
		System.out.println(service.getClass());
		User u = new User();
		u.setName("张三");
		service.add(u);
	}


}
