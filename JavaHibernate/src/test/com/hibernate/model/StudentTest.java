package test.com.hibernate.model;

import com.hibernate.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by King on 2016/2/15.
 */
public class StudentTest {
    public static void main(String[] args){
        Student s = new Student();
        s.setId(9);
        s.setName("君夜灵");
        s.setAge(22);

        Configuration cfg = new Configuration();
        SessionFactory sf = cfg.configure().buildSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();
        session.save(s);
        session.getTransaction().commit();
        session.close();
        sf.close();
    }
}
