/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlhocsinh;

import DAO.HocSinhDAO;
import DAO.LopDAO;
import DAO.MonDAO;
import DAO.PhanQuyenDAO;
import DAO.TaiKhoanDAO;
import Entity.HocSinh;
import Entity.Lop;
import Entity.Mon;
import Entity.PhanQuyen;
import Entity.TaiKhoan;
import java.util.List;

/**
 *
 * @author Carvin
 */
public class QLHocSinh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Tai khoản
        List<TaiKhoan> dsTaiKhoan = TaiKhoanDAO.layDanhSachTaiKhoan();
        for (int i = 0; i < dsTaiKhoan.size(); i++) {
            System.out.println("taikhoan-user: " + dsTaiKhoan.get(i).gettentaikhoan()
            + " - matkhau: " + dsTaiKhoan.get(i).getmatkhau());
        }
        
        // Phân quyền       
         List<PhanQuyen> dsPhanQuyen = PhanQuyenDAO.layDanhSachPhanQuyen();
        for (int i = 0; i < dsPhanQuyen.size(); i++) {
            System.out.println("Phanquyen-chức vụ: " + dsPhanQuyen.get(i).gettenchucvu());
        }
        
        // mon      
        List<Mon> dsMon = MonDAO.layDanhSachMon();
        for (int i = 0; i < dsMon.size(); i++) {
            System.out.println(" Mon - mon: " + dsMon.get(i).gettenmon());
        }
        
        // Lop      
        List<Lop> dsLop = LopDAO.layDanhSachLop();
        for (int i = 0; i < dsLop.size(); i++) {
            System.out.println(" Lop - malop: " + dsLop.get(i).gettenlop());
        }
        
        // HocSinh     
        List<HocSinh> dsHocSinh = HocSinhDAO.layDanhSachHocSinh();
        for (int i = 0; i < dsHocSinh.size(); i++) {
            System.out.println(" HocSinh - ten: " + dsHocSinh.get(i).getten());
        }
    }
    
}
