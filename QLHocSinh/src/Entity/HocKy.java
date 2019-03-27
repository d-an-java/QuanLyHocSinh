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
public class HocKy implements java.io.Serializable{
    private int id;
    private String tenhocky;
     public HocKy() {
        this.id = 0;
        this.tenhocky = ""; 
    }
    public void setid(int id ) {
        this.id = id;
    }

    public int getid() {
        return id;
    }
    
    public void settenhocky(String tenhocky ) {
        this.tenhocky = tenhocky;
    }

    public String gettenhocky() {
        return tenhocky;
    }
    
}
