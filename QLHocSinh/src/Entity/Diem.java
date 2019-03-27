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
public class Diem implements java.io.Serializable{
    private int id;
    private String mahocsinh;
    private String mamonhoc;
    private int hesodiemid;
    private int hockyid;
    private float diem;
    
    public Diem() {
        this.id = 0;
        this.mahocsinh = "";
        this.mamonhoc = "";
        this.hesodiemid = 0;
        this.hockyid = 0;
        this.diem = 0;      
    }
    public void setid(int id ) {
        this.id = id;
    }

    public int getid() {
        return id;
    }
    
    public void setmahocsinh(String mahocsinh ) {
        this.mahocsinh = mahocsinh;
    }

    public String getmahocsinh() {
        return mahocsinh;
    }
    
    public void setmamonhoc(String mamonhoc ) {
        this.mamonhoc = mamonhoc;
    }

    public String getmamonhoc() {
        return mamonhoc;
    }
    
     public void sethesodiemid(int hesodiemid ) {
        this.hesodiemid = hesodiemid;
    }

    public int gethesodiemid() {
        return hesodiemid;
    }
    
     public void sethockyid(int hockyid ) {
        this.hockyid = hockyid;
    }

    public int gethockyid() {
        return hockyid;
    }
       public void setdiem(float diem ) {
        this.diem = diem;
    }

    public float getdiem() {
        return diem;
    }
    
}
