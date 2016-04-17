package test.com.hibernate.model; 

import com.hibernate.model.Color;
import com.hibernate.model.Group;
import com.hibernate.model.Husband;
import com.hibernate.model.Teacher;
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
public class TeacherTest {

    public static SessionFactory sf = null;
    @BeforeClass
    public static void beforeClass(){
        sf = new AnnotationConfiguration().configure().buildSessionFactory();
    }
    @Test
    public void testTeacherSave(){
        Teacher t = new Teacher();
//        t.setId(3);
//        t.setName("张杰敏");
//        t.setTitle("副教授");
//        t.setBirthday(new Date());
//        t.setColor(Color.RED);

//        Session session = sf.openSession();//打开新的session
        Session session = sf.getCurrentSession();//可能打开新的也可能打开旧的

        session.beginTransaction();
//        session.save(t);
        session.getTransaction().commit();
//        session.close();
    }

    @Test
    public void testTeacherDelete(){
        Teacher t = new Teacher();
        t.setId(3);

        Session session = sf.getCurrentSession();//可能打开新的也可能打开旧的
        session.beginTransaction();
        session.delete(t);
        session.getTransaction().commit();

    }

    @Test
    public void testTeacherLoad(){

        Session session = sf.getCurrentSession();//可能打开新的也可能打开旧的
        session.beginTransaction();
        Teacher t = (Teacher) session.load(Teacher.class,2);
        System.out.println(t.getName());
        session.getTransaction().commit();

    }

    @Test
    public void testTeacherGet(){

        Session session = sf.getCurrentSession();//可能打开新的也可能打开旧的
        session.beginTransaction();
        Teacher t = (Teacher) session.get(Teacher.class,4);
        System.out.println(t.getName());
        session.getTransaction().commit();

    }

//    @Test//此方法会把除color之外的对西都变为null
//    public void testTeacherUpdate(){
//
//        Teacher t = new Teacher();
//        t.setId(3);
//        t.setColor(Color.GREEN);
//
//        Session session = sf.getCurrentSession();//可能打开新的也可能打开旧的
//        session.beginTransaction();
//        session.update(t);
//        session.getTransaction().commit();
//
//    }

    @Test
    public void testTeacherUpdate(){

        Session session = sf.getCurrentSession();//可能打开新的也可能打开旧的
        session.beginTransaction();
        Teacher t = (Teacher) session.get(Teacher.class,2);
        t.setColor(Color.BLUE);
        session.update(t);
        session.getTransaction().commit();

    }

    @Test
    public void testTeacherUpdate2(){

        Session session = sf.getCurrentSession();//可能打开新的也可能打开旧的
        session.beginTransaction();
        Query q = session.createQuery("update Teacher t set t.color = 'YELLOW' where t.id=2");
        q.executeUpdate();
        session.getTransaction().commit();

    }
    @Test
    public void testOneToOne() {
        Husband h = new Husband();
        Session session = sf.getCurrentSession();//可能打开新的也可能打开旧的
        session.beginTransaction();
        session.getTransaction().commit();
    }

    @Test
    public void testManyToOne() {
        Group g = new Group();
        Session session = sf.getCurrentSession();//可能打开新的也可能打开旧的
        session.beginTransaction();
        session.getTransaction().commit();
    }
    @AfterClass
    public static void afterClass(){
        sf.close();
    }

} 
