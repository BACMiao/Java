package test.com.hibernate.model; 

import com.hibernate.model.*;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Date;


/** 
* Teacher Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 15, 2016</pre> 
* @version 1.0 
*/ 
public class UserAndGroupTest {

    public static SessionFactory sf = null;
    @BeforeClass
    public static void beforeClass(){
        sf = new AnnotationConfiguration().configure().buildSessionFactory();
    }

    @Test
    public void testSaveUser() {
        User u = new User();
        u.setName("陈淼");
        Group g = new Group();
        g.setName("天启");
        u.setGroup(g);
        Session session = sf.getCurrentSession();//可能打开新的也可能打开旧的
        session.beginTransaction();
//        session.save(g);
        session.save(u);
        session.getTransaction().commit();
    }

    @Test
    public void testSaveGroup() {
        User u1 = new User();
        u1.setName("陈淼");
        User u2 = new User();
        u2.setName("君夜灵");
        Group g = new Group();
        g.setName("天启");
        g.getUsers().add(u1);
        g.getUsers().add(u2);
        u1.setGroup(g);
        u2.setGroup(g);
        Session session = sf.getCurrentSession();//可能打开新的也可能打开旧的
        session.beginTransaction();
        session.save(g);
        session.getTransaction().commit();
    }

    @Test
    public void testGetUser() {
        Session session = sf.getCurrentSession();//可能打开新的也可能打开旧的
        session.beginTransaction();
        User u = (User) session.get(User.class,1);
        System.out.println(u.getId()+":"+u.getName()+":"+u.getGroup().getName());
        session.getTransaction().commit();
    }

    @Test
    public void testGetGroup() {
        Session session = sf.getCurrentSession();//可能打开新的也可能打开旧的
        session.beginTransaction();
        Group g = (Group) session.get(Group.class,1);
        System.out.println(g.getId()+":"+g.getName()+":");
        for(User u:g.getUsers()){
            System.out.println(u.getId()+":"+u.getName());
        }
        session.getTransaction().commit();
    }

    @Test
    public void testUpdateUser() {
        Session session = sf.getCurrentSession();//可能打开新的也可能打开旧的
        session.beginTransaction();
        User u = (User) session.get(User.class,2);
        u.setName("君夜灵");
        session.update(u);
        session.getTransaction().commit();
    }

    @Test
    public void testUpdateGroup() {
        Session session = sf.getCurrentSession();//可能打开新的也可能打开旧的
        session.beginTransaction();
        User u = (User) session.get(User.class,2);
        u.getGroup().setName("天庭");
        session.update(u);
        session.getTransaction().commit();
    }

    @Test
    public void testDeleteUser() {
        Session session = sf.getCurrentSession();//可能打开新的也可能打开旧的
        session.beginTransaction();
        User u = (User) session.load(User.class,5);
//        System.out.println(u.getId()+u.getName());
        u.setGroup(null);
        session.delete(u);
        session.getTransaction().commit();
    }

    @AfterClass
    public static void afterClass(){
        sf.close();
    }

} 
