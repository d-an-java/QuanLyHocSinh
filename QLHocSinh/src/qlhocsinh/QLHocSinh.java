/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlhocsinh;

import DAO.TaiKhoanDAO;
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
        List<TaiKhoan> dsTaiKhoan = TaiKhoanDAO.layDanhSachTaiKhoan();
        for (int i = 0; i < dsTaiKhoan.size(); i++) {
            System.out.println("user: " + dsTaiKhoan.get(i).gettentaikhoan()
            + " - matkhau: " + dsTaiKhoan.get(i).getmatkhau());
        }
    }
    
}
