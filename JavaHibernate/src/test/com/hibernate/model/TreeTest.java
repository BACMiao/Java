package test.com.hibernate.model;

import com.hibernate.model.Group;
import com.hibernate.model.Org;
import com.hibernate.model.User;
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
public class TreeTest {

    public static SessionFactory sf = null;
    @BeforeClass
    public static void beforeClass(){
        sf = new AnnotationConfiguration().configure().buildSessionFactory();
    }

    @Test
    public void testSaveTree() {
        Org o = new Org();
        o.setName("总部");
        Org o1 = new Org();
        o1.setName("第一分部");
        Org o2 = new Org();
        o2.setName("第二分部");
        Org o3 = new Org();
        o3.setName("一分部第一组");
        Org o4 = new Org();
        o4.setName("一分部第二组");
        Org o5 = new Org();
        o5.setName("一分部第二组第一队");

        o.getChildren().add(o1);
        o.getChildren().add(o2);
        o1.getChildren().add(o3);
        o1.getChildren().add(o4);
        o4.getChildren().add(o5);
        o5.setParent(o4);
        o4.setParent(o1);
        o3.setParent(o1);
        o2.setParent(o);
        o1.setParent(o);

        Session session = sf.getCurrentSession();
        session.beginTransaction();
        session.save(o);
        session.getTransaction().commit();
    }

    @Test
    public void testGetTree() {
        Session session = sf.getCurrentSession();//可能打开新的也可能打开旧的
        session.beginTransaction();
        Org o = (Org) session.get(Org.class,1);
        print(o, 0);
        session.getTransaction().commit();
    }

    private void print(Org o, int level) {
        String preStr = "";
        for (int i = 0; i < level; i++) {
            preStr += "*****";
        }
        System.out.println(preStr+o.getName());
        for (Org child : o.getChildren()){
            print(child,level+1);
        }
    }


    @AfterClass
    public static void afterClass(){
        sf.close();
    }

} 
