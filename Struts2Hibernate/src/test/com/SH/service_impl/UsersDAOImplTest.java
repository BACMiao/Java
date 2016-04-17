package test.com.SH.service_impl; 

import com.SH.model.Users;
import com.SH.service.UsersDAO;
import com.SH.service_impl.UsersDAOImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* UsersDAOImpl Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 20, 2016</pre> 
* @version 1.0 
*/ 
public class UsersDAOImplTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: usersLogin(Users u) 
* 
*/ 
@Test
public void testUsersLogin() throws Exception {
    Users u = new Users(1,"cm","123456");
    UsersDAO udao = new UsersDAOImpl();
    Assert.assertEquals(true, udao.usersLogin(u));
} 


} 
