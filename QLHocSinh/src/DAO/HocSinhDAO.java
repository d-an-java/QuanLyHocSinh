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
}
