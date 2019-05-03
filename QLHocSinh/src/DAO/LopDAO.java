/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.Lop;
import Util.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Carvin
 */
public class LopDAO {
    
    public static List<Lop> layDanhSachLop()
    {
        List<Lop> dsLop = null;
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        String hql = "from Lop ORDER BY malop";
        Query query = session.createQuery(hql);
        dsLop = query.list();
        session.close();
        return dsLop;
    }
    
    public static List<Lop> layDanhSachLop(String malop)
    {
        List<Lop> dsLop = null;
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        String hql = "from Lop where malop=:malop";
        Query query = session.createQuery(hql);
        query.setParameter("malop", malop);
        dsLop = query.list();
        session.close();
        return dsLop;
    }
    
     public static String layTenLop(String malop)
    {
        List<Lop> dsLop = null;
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        String hql = "from Lop where malop=:malop";
        Query query = session.createQuery(hql);
        query.setParameter("malop", malop);
        dsLop = query.list();
        session.close();
        
        return String.valueOf(dsLop.get(0).getsiso());
    }
     
        // Thêm
    public static boolean themLop(Lop lop) {
         List<Lop> m = LopDAO.layDanhSachLop(lop.getmalop());
        if(m.size() > 0)
           return false; 
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.save(lop);
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            session.getTransaction().rollback();
            System.out.println(e);
            return false;
        } finally {
            session.close();
        }
    }
    
    
     // sửa
    public static boolean capNhatLop(Lop lop) {
        List<Lop> mh = LopDAO.layDanhSachLop(lop.getmalop());
       if(mh.size() < 1)
           return false;
        lop.setid(mh.get(0).getid());
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.update(lop);
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            session.getTransaction().rollback();
            System.out.println(e);
            return false;
        } finally {
            session.close();
        }
    }
    
     // Tang si so
    public static boolean capSiSoLop(String mlop) {
        List<Lop> mh = LopDAO.layDanhSachLop(mlop);
       if(mh.size() < 1)
           return false;
        mh.get(0).setsiso(mh.get(0).getsiso()+1);
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.update(mh.get(0));
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            session.getTransaction().rollback();
            System.out.println(e);
            return false;
        } finally {
            session.close();
        }
    }
    
    public static boolean xoaLop(String malop) {
       List<Lop> mh = LopDAO.layDanhSachLop(malop);
       if(mh == null)
           return false;
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.delete(mh.get(0));
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            session.getTransaction().rollback();
            System.out.println(e);
            return false;
        } finally {
            session.close();
        }
    }
     
}
