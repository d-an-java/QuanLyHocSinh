/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.HocKy;
import Util.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Carvin
 */
public class HocKyDAO {
    public static List<HocKy> layDanhSachHocKy()
    {
        List<HocKy> dsHocKy = null;
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        String hql = "from HocKy";
        Query query = session.createQuery(hql);
        dsHocKy = query.list();
        session.close();
        return dsHocKy;
    }
}
