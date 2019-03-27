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
        String hql = "from Diem";
        Query query = session.createQuery(hql);
        dsDiem = query.list();
        session.close();
        return dsDiem;
    }
}
