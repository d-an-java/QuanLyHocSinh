/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Entity.TaiKhoan;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import Util.HibernateUtil;
/**
 *
 * @author Carvin
 */
public class TaiKhoanDAO {
    public static List<TaiKhoan> layDanhSachTaiKhoan()
    {
        List<TaiKhoan> dsTaiKhoan = null;
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        String hql = "from TaiKhoan";
        Query query = session.createQuery(hql);
        dsTaiKhoan = query.list();
        session.close();
        return dsTaiKhoan;
    }
}
