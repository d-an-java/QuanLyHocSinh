/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Carvin
 */
public class TaiKhoan implements java.io.Serializable{

    private int id;
    private String tentaikhoan;
    private String matkhau;
    private int chucvu;
    //Các phương thức khởi tạo, get, set.
     public void setid(Integer id ) {
        this.id = id;
    }

    public Integer getid() {
        return id;
    }
    
    public void settentaikhoan(String tentaikhoan ) {
        this.tentaikhoan = tentaikhoan;
    }

    public String gettentaikhoan() {
        return tentaikhoan;
    }
    
    public void setmatkhau(String matkhau ) {
        this.matkhau = matkhau;
    }

    public String getmatkhau() {
        return matkhau;
    }
    
         public void setchucvu(Integer chucvu ) {
        this.chucvu = chucvu;
    }

    public Integer getchucvu() {
        return chucvu;
    }
}
