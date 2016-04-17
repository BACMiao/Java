package test.model; 

import com.SH.model.Students;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.junit.*;

import java.util.Date;

/** 
* Students Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 20, 2016</pre> 
* @version 1.0 
*/ 
public class StudentsTest {
@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
}

    @Test
    public void testSchemaExport(){
        //创建配置对象
        Configuration config = new Configuration().configure();
        //创建服务注册对象
        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
        //创建sessionFactory
        SessionFactory sessionFactory = config.buildSessionFactory(serviceRegistry);
        //创建session对象
        Session session = sessionFactory.getCurrentSession();
        //创建SchemaExport对象
        SchemaExport export =new SchemaExport(config);

        export.create(true,true);
    }

    @Test
    public void testSaveStudent(){
        //创建配置对象
        Configuration config = new Configuration().configure();
        //创建服务注册对象
        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
        //创建sessionFactory
        SessionFactory sessionFactory = config.buildSessionFactory(serviceRegistry);
        //创建session对象
        Session session = sessionFactory.getCurrentSession();
        //创建事物对象
        Transaction tx = session.beginTransaction();

        Students s1 = new Students("jm000001","张三","男", new Date(), "北京");
        Students s2 = new Students("jm000002","李四","女", new Date(), "上海");
        Students s3 = new Students("jm000003","王五","女", new Date(), "深圳");

        session.save(s1);
        session.save(s2);
        session.save(s3);

        tx.commit();
        sessionFactory.close();
    }
}
