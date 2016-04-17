package test.com.SH.service_impl;

import com.SH.db.MyHibernateSessionFactory;
import com.SH.model.Students;
import com.SH.model.Users;
import com.SH.service.StudentDAO;
import com.SH.service.UsersDAO;
import com.SH.service_impl.StudentDAOImpl;
import com.SH.service_impl.UsersDAOImpl;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.hql.internal.ast.HqlASTFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.List;

/** 
* UsersDAOImpl Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 20, 2016</pre> 
* @version 1.0 
*/ 
public class StudentsDAOImplTest {

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
public void testQueryAllStudents() throws Exception {
    StudentDAO sdao = new StudentDAOImpl();
    List<Students> list = sdao.queryAllStudents();

    for (Students s: list) {
        System.out.println(s);
    }
}
//    @Test
//    public void testGetNewSid()
//    {
//        StudentDAOImpl sdao = new StudentDAOImpl();
//        System.out.println(sdao.getNewSid());
//    }
    @Test
    public void testAddStudents()
    {
        Students s = new Students();
        s.setSname("张三");
        s.setGender("男");
        s.setBirthday(new Date());
        s.setAddress("北京");

        StudentDAO sdao = new StudentDAOImpl();
        Assert.assertEquals(true, sdao.addStudents(s));
    }

    @Test
    public void queryStudentsBySname() {
        Transaction tx = null;
        Students s = null;
        Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
        tx = session.beginTransaction();
        String hql = "from Students where sname = ?";
        Query query = session.createQuery(hql);
        query.setParameter(0, "王六");
        List list = query.list();
        tx.commit();
        System.out.println(list);
    }


} 
