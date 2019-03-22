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
public class PhanQuyen implements java.io.Serializable{
    private int id;
    private String chucvu;

    //Các phương thức khởi tạo, get, set.
     public void setid(Integer id ) {
        this.id = id;
    }

    public Integer getid() {
        return id;
    }
    
    public void settenchucvu(String tenchucvu ) {
        this.chucvu = tenchucvu;
    }

    public String gettenchucvu() {
        return chucvu;
    }
}
