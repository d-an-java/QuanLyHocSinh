/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.HocSinh;
import Util.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Carvin
 */
public class HocSinhDAO {
    
    /// lấy danh sách học sinh
    public static List<HocSinh> layDanhSachHocSinh()
    {
        List<HocSinh> dsHocSinh = null;
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        String hql = "from HocSinh";
        Query query = session.createQuery(hql);
        dsHocSinh = query.list();
        session.close();
        return dsHocSinh;
    }
    
    /// tìm học  sinh được chọn
    public static List<HocSinh> layThongTinHocSinh(String maHocSinh) {
//         Session session = HibernateUtil.getSessionFactory().openSession();
//         session.beginTransaction();
//         HocSinh hs = (HocSinh) session.get(HocSinh.class, maHocSinh);
//         session.close();
//         return hs;
        // c2
        List<HocSinh> dsHocSinh = null;
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        String hql = "from HocSinh where mahocsinh=:mahs ";
        Query query = session.createQuery(hql);
        query.setParameter("mahs", maHocSinh);
        dsHocSinh = query.list();
        session.close();
        return dsHocSinh;
        
    }
    
      public static List<HocSinh> LopCoBaoNhieuHocSinh(String malop) {
        List<HocSinh> dsHocSinh = null;
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        String hql = "from HocSinh where lop=:malop ";
        Query query = session.createQuery(hql);
        query.setParameter("malop", malop);
        dsHocSinh = query.list();
        session.close();
        return dsHocSinh;
        
    }
    
    // Thêm
    public static boolean themHocSinh(HocSinh hs) {
//        if (HocSinhDAO.layThongTinHocSinh(tk.gettentaikhoan()) != null) {
//            return false;
//        }
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.save(hs);
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
    public static boolean capNhatHocSinh(HocSinh hs) {
        List<HocSinh> mh = HocSinhDAO.layThongTinHocSinh(hs.getmahocsinh());
       if(mh == null)
           return false;
        hs.setid(mh.get(0).getid());
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.update(hs);
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
    
    public static boolean xoaHocSinh(String mahs) {
       List<HocSinh> mh = HocSinhDAO.layThongTinHocSinh(mahs);
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
