/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.Diem;
import Util.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Carvin
 */
public class DiemDAO {
     public static List<Diem> layDanhSachDiem()
    {
        List<Diem> dsDiem = null;
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        String hql = "from Diem  ORDER BY malop,mamonhoc,mahocky";
        Query query = session.createQuery(hql);
        dsDiem = query.list();
        session.close();
        return dsDiem;
    }
     
         /// tìm học  sinh được chọn
    public static List<Diem> DiemCuaHocSinh(String mahocsinh,String maHocKy) {
        List<Diem> dsDiem = null;
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        String hql = "from Diem where mahocsinh=:mahs and mahocky=:mahk";
        Query query = session.createQuery(hql);
        query.setParameter("mahs", mahocsinh);
        query.setParameter("mahk", maHocKy);
        dsDiem = query.list();
        session.close();
        return dsDiem;
        
    }
     
       /// tìm học  sinh được chọn
    public static List<Diem> layThongTinDiemCuaHocSinh(String malop,String mahocsinh,String maMon,String maHocKy) {
        List<Diem> dsDiem = null;
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        String hql = "from Diem where mahocsinh=:mahs and mamonhoc=:mamon and mahocky=:mahk and malop=:malop ";
        Query query = session.createQuery(hql);
        query.setParameter("mahs", mahocsinh);
        query.setParameter("mamon", maMon);
        query.setParameter("mahk", maHocKy);
        query.setParameter("malop", malop);
        dsDiem = query.list();
        session.close();
        return dsDiem;
        
    }
    
     /// tìm theo ma hoc sinh
    public static List<Diem> TimKiem (String malop,String mahocsinh,String maMon,String maHocKy) {
        List<Diem> dsDiem = null;
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        String hql = "from Diem where mahocsinh like:mahs ";
        Query query = session.createQuery(hql);
        query.setParameter("mahs", "%"+mahocsinh+"%");
       if(malop != null)
        {
             hql = "from Diem where  malop=:malop";
            query = session.createQuery(hql);
            query.setParameter("malop", malop);
        }
        else if(maMon != null)
        {
            hql = "from Diem where  mamonhoc=:mamon ";
            query = session.createQuery(hql);
            query.setParameter("mamon", maMon);
        }
        else if(maHocKy != null)
        {
            hql = "from Diem where mahocky=:mahk";
            query = session.createQuery(hql);
            query.setParameter("mahk", maHocKy);
        }
        dsDiem = query.list();
        session.close();
        return dsDiem;
        
    }
     
        // Thêm
    public static boolean themDiem(Diem diem) {
        List<Diem> d = DiemDAO.layThongTinDiemCuaHocSinh(diem.getmalop(),diem.getmahocsinh(), diem.getmamonhoc(), diem.getmahocky());
        if(d.size() == 1)
           return false;      
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.save(diem);
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
    public static boolean capNhatDiem(Diem diem) {
        List<Diem> d = DiemDAO.layThongTinDiemCuaHocSinh(diem.getmalop(),diem.getmahocsinh(), diem.getmamonhoc(), diem.getmahocky());
        if(d.size() < 1)
           return false; 
        diem.setid(d.get(0).getid());
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.update(diem);
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
    
    public static boolean xoaDiem(Diem diem) {
        List<Diem> d = DiemDAO.layThongTinDiemCuaHocSinh(diem.getmalop(),diem.getmahocsinh(), diem.getmamonhoc(), diem.getmahocky());
        if(d.size() < 1)
           return false; 
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.delete(d.get(0));
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
