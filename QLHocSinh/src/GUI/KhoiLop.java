/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAO.KhoiDAO;
import Entity.Khoi;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Carvin
 */
public class KhoiLop extends javax.swing.JFrame {

    private static int idkhoi =0;
    DefaultTableModel model=null;
    /**
     * Creates new form KhoiLop
     */
    public KhoiLop() {
        initComponents();
       setResizable(false); 

        LoadData();
    }
    
    void LoadData() {
       
        List<Khoi> listkhoi;
        String[] columns = new String [] {
            "STT",
            "Đtên Khối",
            "Sỉ Số Tối Đa của Khối"
        };
        model = new DefaultTableModel(null , columns);
        
        listkhoi = KhoiDAO.layDanhSachKhoi();
        
        for (int i = 0; i < listkhoi.size(); i++) {
            Khoi gv = (Khoi) listkhoi.get(i);
            int stt = i;
            Object[] items = new Object[] {
                gv.getid(),
                gv.gettenkhoi(),
                gv.getsisotoida()
            };
            model.addRow(items);  
        }
        jtb_khoi.setModel(model);
        jtb_khoi.setRowHeight(30);
        jtb_khoi.getColumnModel().getColumn(0).setPreferredWidth(50);
        jtb_khoi.getColumnModel().getColumn(1).setPreferredWidth(150);
        jtb_khoi.getColumnModel().getColumn(2).setPreferredWidth(150);

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtf_tenkhoi = new javax.swing.JTextField();
        jtf_sisotoida = new javax.swing.JTextField();
        jbt_thoat = new javax.swing.JButton();
        jbt_capnhat = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtb_khoi = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Khối Lớp");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Tên Khối");

        jLabel2.setText("Sí Số Đối Đa Của Khối");

        jtf_tenkhoi.setEditable(false);
        jtf_tenkhoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_tenkhoiActionPerformed(evt);
            }
        });

        jtf_sisotoida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf_sisotoidaKeyTyped(evt);
            }
        });

        jbt_thoat.setBackground(new java.awt.Color(255, 102, 0));
        jbt_thoat.setText("Thoát");
        jbt_thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_thoatActionPerformed(evt);
            }
        });

        jbt_capnhat.setBackground(new java.awt.Color(255, 102, 0));
        jbt_capnhat.setText("Cập Nhật");
        jbt_capnhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_capnhatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(jtf_tenkhoi, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtf_sisotoida, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(jbt_capnhat, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbt_thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtf_tenkhoi, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbt_capnhat)
                        .addComponent(jbt_thoat)
                        .addComponent(jtf_sisotoida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtb_khoi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtb_khoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtb_khoiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtb_khoi);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbt_thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_thoatActionPerformed
        // TODO add your handling code here:
        setVisible(false); //you can't see me!
        dispose();
    }//GEN-LAST:event_jbt_thoatActionPerformed

    private void jbt_capnhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_capnhatActionPerformed
        // TODO add your handling code here:
        if(!jtf_sisotoida.getText().trim().equals(""))
        {
            int sisotoida = Integer.parseInt(jtf_sisotoida.getText().trim()) ;
            String tenkhoi = jtf_tenkhoi.getText().trim() ;
            Khoi khoi = new Khoi(idkhoi, tenkhoi,sisotoida);
            boolean result = KhoiDAO.capNhatKhoi(khoi);
            if (result) {
                LoadData();
                //            Moi();
            } else {
                JOptionPane.showMessageDialog(this, "Thêm thất bại", "Thông báo", JOptionPane.WARNING_MESSAGE);
            }
        }else
        JOptionPane.showMessageDialog(this, "Bạn cần nhập đúng dữ liệu", "Thông báo", JOptionPane.WARNING_MESSAGE);

    }//GEN-LAST:event_jbt_capnhatActionPerformed

    private void jtb_khoiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtb_khoiMouseClicked
        // TODO add your handling code here:
        int index=jtb_khoi.getSelectedRow();
        jtf_tenkhoi.setText((String)String.valueOf(model.getValueAt(index, 1)));       
        jtf_sisotoida.setText((String)String.valueOf(model.getValueAt(index, 2)));
        idkhoi =((int) model.getValueAt(index, 0)) ;
    }//GEN-LAST:event_jtb_khoiMouseClicked

    private void jtf_tenkhoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_tenkhoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_tenkhoiActionPerformed

    private void jtf_sisotoidaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_sisotoidaKeyTyped
        // TODO add your handling code here:
        char  c =evt.getKeyChar();
        if(!(Character.isDigit(c)  || (c== KeyEvent.VK_BACK_SPACE) || c== KeyEvent.VK_DELETE ))
            evt.consume();
        if (jtf_sisotoida.getText().length() >= 3 ) // limit textfield to 3 characters
            evt.consume(); 
    }//GEN-LAST:event_jtf_sisotoidaKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KhoiLop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KhoiLop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KhoiLop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KhoiLop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KhoiLop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbt_capnhat;
    private javax.swing.JButton jbt_thoat;
    private javax.swing.JTable jtb_khoi;
    private javax.swing.JTextField jtf_sisotoida;
    private javax.swing.JTextField jtf_tenkhoi;
    // End of variables declaration//GEN-END:variables
}
