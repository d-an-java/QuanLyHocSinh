/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlhocsinh;

import DAO.PhanQuyenDAO;
import DAO.TaiKhoanDAO;
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
            System.out.println("user: " + dsTaiKhoan.get(i).gettentaikhoan()
            + " - matkhau: " + dsTaiKhoan.get(i).getmatkhau());
        }
        // Phân quyền       
//         List<PhanQuyen> dsPhanQuyen = PhanQuyenDAO.layDanhSachPhanQuyen();
//        for (int i = 0; i < dsPhanQuyen.size(); i++) {
//            System.out.println("user: " + dsPhanQuyen.get(i).gettenchucvu());
//        }
        
    }
    
}
