package test.com.hibernate.model;

import com.hibernate.model.Classmate;
import com.hibernate.model.Course;
import com.hibernate.model.Org;
import com.hibernate.model.Score;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


/** 
* Teacher Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 15, 2016</pre> 
* @version 1.0 
*/ 
public class CSCTest {

    public static SessionFactory sf = null;
    @BeforeClass
    public static void beforeClass(){
        sf = new AnnotationConfiguration().configure().buildSessionFactory();
    }

    @Test
    public void testSaveTree() {
        Classmate classmate = new Classmate();
        classmate.setName("陈淼");
        Course course = new Course();
        course.setName("java");
        Score score = new Score();
        score.setScore(99);
        score.setClassmate(classmate);
        score.setCourse(course);

        Session session = sf.getCurrentSession();
        session.beginTransaction();
        session.save(classmate);
        session.save(course);
        session.save(score);
        session.getTransaction().commit();
    }

    @Test
    public void testGetTree() {
        Session session = sf.getCurrentSession();
        session.beginTransaction();
        Classmate classmate = (Classmate)session.get(Classmate.class,2);
        for (Course c : classmate.getCourses()){
            System.out.println(c.getName());
        }
        session.getTransaction().commit();
    }


    @AfterClass
    public static void afterClass(){
        sf.close();
    }

} 
