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
    private String mahocky;
    private String malop;
    private float diemtbmon;
    private float diemheso1;
    private float diemheso2;
    private float diemheso3;
    public Diem() {
        this.id = 0;
        this.mahocsinh = "";
        this.mamonhoc = "";
        this.mahocky = "";
        this.malop = "";
        this.diemtbmon = 0;  
        this.diemheso1 = 0;
        this.diemheso2 = 0;
        this.diemheso3 = 0;
        
    }
    
    public Diem(String malop,String mamonhoc,String mahocky,String mahocsinh,float diemheso1,float diemheso2,float diemheso3,float diemtbmon) {
        this.mahocsinh = mahocsinh;
        this.mamonhoc = mamonhoc;
        this.mahocky = mahocky;
        this.malop = malop;
        this.diemtbmon = diemtbmon;  
        this.diemheso1 = diemheso1;
        this.diemheso2 = diemheso2;
        this.diemheso3 = diemheso3;
        
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
    
     public void setmalop (String malop ) {
        this.malop = malop;
    }

    public String getmalop() {
        return malop;
    }
    
     public void setmahocky(String mahocky ) {
        this.mahocky = mahocky;
    }

    public String getmahocky() {
        return mahocky;
    }
       public void setdiemtbmon(float diem ) {
        this.diemtbmon = diem;
    }

    public float getdiemtbmon() {
        return diemtbmon;
    }
       public void setdiemheso1(float diem ) {
        this.diemheso1 = diem;
    }

    public float getdiemheso1() {
        return diemheso1;
    }
      public void setdiemheso2(float diem ) {
        this.diemheso2 = diem;
    }

    public float getdiemheso2() {
        return diemheso2;
    }
    
      public void setdiemheso3(float diem ) {
        this.diemheso3 = diem;
    }

    public float getdiemheso3() {
        return diemheso3;
    }
}
