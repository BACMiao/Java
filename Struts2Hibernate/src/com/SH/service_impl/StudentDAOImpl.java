package com.SH.service_impl;

import com.SH.db.MyHibernateSessionFactory;
import com.SH.model.Students;
import com.SH.service.StudentDAO;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by King on 2016/2/20.
 */
//学生业务逻辑接口的实现类
public class StudentDAOImpl implements StudentDAO{

    //查询所有学生资料
    @Override
    public List<Students> queryAllStudents() {
        Transaction tx = null;
        List<Students> list = null;
        String hql = "";
        try {
            Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
            tx = session.beginTransaction();
            hql = "from Students";
            Query query = session.createQuery(hql);
            list = query.list();
            tx.commit();
            return list;
        }
        catch (Exception e){
            e.printStackTrace();
            tx.commit();
            return list;
        }
        finally {
            if (tx != null){
                tx = null;
            }
        }
    }

    @Override
    public Students queryStudentsBySid(String sid) {
        Transaction tx = null;
        Students s = null;
        try {
            Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
            tx = session.beginTransaction();
            s = (Students) session.get(Students.class, sid);
            tx.commit();
            return s;
        }
        catch (Exception e){
            e.printStackTrace();
            tx.commit();
            return s;
        }
        finally {
            if (tx != null){
                tx = null;
            }
        }
    }

    @Override
    public List<Students> queryStudentsBySname(String sname) {
        Transaction tx = null;
        List<Students> list = null;
        try {
            Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
            tx = session.beginTransaction();
            String hql = "from Students where sname = ?";
            Query query = session.createQuery(hql);
            query.setParameter(0, sname);
            list = query.list();
            tx.commit();
            return list;
        }
        catch (Exception e){
            e.printStackTrace();
            tx.commit();
            return list;
        }
        finally {
            if (tx != null){
                tx = null;
            }
        }
    }


    @Override
    public boolean addStudents(Students s) {
        s.setSid(getNewSid());//设置学号
        Transaction tx = null;
        try
        {
            Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
            tx = session.beginTransaction();
            session.save(s);
            tx.commit();
            return true;

        }
        catch (Exception e)
        {
            e.printStackTrace();
            tx.commit();
            return false;
        }
        finally
        {
            if (tx != null)
            {
                tx = null;
            }
        }
    }

    @Override
    public boolean updateStudents(Students s) {
        Transaction tx = null;
        try
        {
            Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
            tx = session.beginTransaction();
            session.update(s);
            tx.commit();
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            tx.commit();
            return false;
        }
        finally
        {
            if (tx != null)
            {
                tx = null;
            }
        }
    }

    @Override
    public boolean deleteStudents(String sid) {
        Transaction tx = null;

        try {
            Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
            tx = session.beginTransaction();
            Students s = (Students) session.get(Students.class, sid);
            session.delete(s);
            tx.commit();
            return true;
        }
        catch (Exception e){
            e.printStackTrace();
            tx.commit();
            return false;
        }
        finally {
            if (tx != null){
                tx = null;
            }
        }
    }

    private String getNewSid()
    {
        Transaction tx = null;
        String hql = "";
        String sid = null;
        try
        {
            Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
            tx = session.beginTransaction();
            //获得当前学生号的最大值
            hql = "select max(sid) from Students";
            Query query = session.createQuery(hql);
            sid = (String) query.uniqueResult();//返回当前数据库的值
            if (sid == null||"".equals(sid))
            {
                //给一个默认最大学生号
                sid = "jm000001";
            }
            else
            {
                String temp = sid.substring(2); //去掉首位的jm，取后七位
                int i = Integer.parseInt(temp); //转成数字
                i++;
                //再还原为字符串
                temp = String.valueOf(i);
                int len = temp.length();
                for (int j = 0; j < 6-len ; j++)
                {
                    temp = "0" + temp;
                }
                sid = "jm" + temp;
            }
            tx.commit();
            return sid;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            tx.commit();
            return null;

        }
        finally
        {
            if (tx != null)
            {
                tx = null;
            }
        }
    }
}
