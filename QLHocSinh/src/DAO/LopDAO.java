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
        String hql = "from Lop";
        Query query = session.createQuery(hql);
        dsLop = query.list();
        session.close();
        return dsLop;
    }
    
    
}
