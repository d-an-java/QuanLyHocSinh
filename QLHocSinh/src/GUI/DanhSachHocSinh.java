/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAO.DiemDAO;
import DAO.HocKyDAO;
import DAO.HocSinhDAO;
import Entity.Diem;
import Entity.HocKy;
import Entity.HocSinh;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vinh
 */
public class DanhSachHocSinh extends javax.swing.JFrame {

     DefaultTableModel model=null;
    /**
     * Creates new form DanhSachHocSinh
     */
    public DanhSachHocSinh() {
        initComponents();
        setResizable(false); 
        LoadData();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jtb_dshocsinh = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jbt_timkiem = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jtf_lop = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jcb_hocky = new javax.swing.JComboBox();
        jbtn_thoat2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Danh Sách Học Sinh");
        setPreferredSize(new java.awt.Dimension(840, 490));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("DANH SÁCH HỌC SINH");

        jtb_dshocsinh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "STT", "Họ Tên", "Lớp", "TB Học Kỳ 1", "TB Học Kỳ 2"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtb_dshocsinh);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jbt_timkiem.setBackground(new java.awt.Color(255, 51, 0));
        jbt_timkiem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbt_timkiem.setText("TÌM KIẾM");
        jbt_timkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_timkiemActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Nhập thông tin: tên lớp cần tìm");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("LỚP");

        jcb_hocky.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcb_hockyItemStateChanged(evt);
            }
        });

        jbtn_thoat2.setBackground(new java.awt.Color(255, 102, 0));
        jbtn_thoat2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtn_thoat2.setText("Thoát");
        jbtn_thoat2.setToolTipText("");
        jbtn_thoat2.setMaximumSize(new java.awt.Dimension(95, 23));
        jbtn_thoat2.setMinimumSize(new java.awt.Dimension(95, 23));
        jbtn_thoat2.setPreferredSize(new java.awt.Dimension(95, 23));
        jbtn_thoat2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_thoat2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jtf_lop, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addComponent(jbt_timkiem)
                .addGap(117, 117, 117)
                .addComponent(jcb_hocky, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtn_thoat2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbt_timkiem)
                        .addComponent(jcb_hocky, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtn_thoat2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel3))
                            .addComponent(jtf_lop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(366, 366, 366))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 874, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

       void LoadData() {
        jcb_hocky.removeAllItems();
        List<HocKy> dshk = HocKyDAO.layDanhSachHocKy();
        for (int i = 0; i < dshk.size(); i++) {
            jcb_hocky.addItem(dshk.get(i).gettenhocky());
        }     
        String hocky = jcb_hocky.getSelectedItem().toString().trim();
        String hocky1 = hocky.substring(9, 13)+"_" ;
        String hocky2 = hocky.substring(16, 20);
        hocky = hocky1.concat(hocky2);
        List<HocSinh> listResultSV;
        String[] columns = new String [] {
            "STT",
            "Họ Tên",
            "Lớp",
            "TB Học Kỳ 1",
            "TB Học Kỳ 2"
        };
        model = new DefaultTableModel(null , columns);
        
        listResultSV = HocSinhDAO.layDanhSachHocSinh();
        
        for (int i = 0; i < listResultSV.size(); i++) {
            HocSinh hs = (HocSinh) listResultSV.get(i);
            int stt = i;
            
            String hk1 = hocky+"_HK1";
            List<Diem> DiemHS1  = DiemDAO.DiemCuaHocSinh(hs.getmahocsinh(),hk1);
            float tdhk1 = 0;
            float dtbhk1 = 0 ;
            if(DiemHS1.size() > 0)
            {
                 for(int j = 0; j < DiemHS1.size(); j++ )
                {
                    Diem diem = (Diem) DiemHS1.get(j);
                    tdhk1 += diem.getdiemtbmon();
                }

                if(DiemHS1.size()>0)
                    dtbhk1 = tdhk1/DiemHS1.size();
            }
           
            
            String hk2 = hocky+"_HK2";
            List<Diem> DiemHS2  = DiemDAO.DiemCuaHocSinh(hs.getmahocsinh(),hk2);
            float tdhk2 = 0;          
            float dtbhk2 = 0 ;
            if(DiemHS2.size() > 0)
            {
                 for(int j = 0; j < DiemHS2.size(); j++ )
                {
                    Diem diem = (Diem) DiemHS2.get(j);
                    tdhk2 += diem.getdiemtbmon();
                }
                 dtbhk2 = tdhk2/DiemHS2.size();
            }
               
            
            Object[] items = new Object[] {
                stt++,
                hs.getten(),
                hs.getlop(),              
                dtbhk1,
                dtbhk2
            };
            model.addRow(items);  
        }
        jtb_dshocsinh.setModel(model);
        jtb_dshocsinh.setRowHeight(30);
        jtb_dshocsinh.getColumnModel().getColumn(0).setPreferredWidth(100);
        jtb_dshocsinh.getColumnModel().getColumn(1).setPreferredWidth(200);
        jtb_dshocsinh.getColumnModel().getColumn(2).setPreferredWidth(150);
        jtb_dshocsinh.getColumnModel().getColumn(3).setPreferredWidth(100);
        jtb_dshocsinh.getColumnModel().getColumn(4).setPreferredWidth(100);
    }
    
    private void jbt_timkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_timkiemActionPerformed
        // TODO add your handling code here:
        if(jtf_lop.getText().trim().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Vui Lòng Nhập Thông Tin Tìm Kiếm", "Thông báo", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            String hocky = jcb_hocky.getSelectedItem().toString().trim();
            String hocky1 = hocky.substring(9, 13)+"_" ;
            String hocky2 = hocky.substring(16, 20);
            hocky = hocky1.concat(hocky2);
            List<HocSinh> listResultSV;
            String[] columns = new String [] {
                "STT",
                "Họ Tên",
                "Lớp",
                "TB Học Kỳ 1",
                "TB Học Kỳ 2"
            };
            model = new DefaultTableModel(null , columns);

            listResultSV = HocSinhDAO.Timhocsinhcualop(jtf_lop.getText().trim());

            for (int i = 0; i < listResultSV.size(); i++) {
                HocSinh hs = (HocSinh) listResultSV.get(i);
                int stt = i;

                String hk1 = hocky+"_HK1";
                List<Diem> DiemHS1  = DiemDAO.DiemCuaHocSinh(hs.getmahocsinh(),hk1);
                float tdhk1 = 0;
                float dtbhk1 = 0 ;
                if(DiemHS1.size() > 0)
                {
                     for(int j = 0; j < DiemHS1.size(); j++ )
                    {
                        Diem diem = (Diem) DiemHS1.get(j);
                        tdhk1 += diem.getdiemtbmon();
                    }

                    if(DiemHS1.size()>0)
                        dtbhk1 = tdhk1/DiemHS1.size();
                }


                String hk2 = hocky+"_HK2";
                List<Diem> DiemHS2  = DiemDAO.DiemCuaHocSinh(hs.getmahocsinh(),hk2);
                float tdhk2 = 0;          
                float dtbhk2 = 0 ;
                if(DiemHS2.size() > 0)
                {
                     for(int j = 0; j < DiemHS2.size(); j++ )
                    {
                        Diem diem = (Diem) DiemHS2.get(j);
                        tdhk2 += diem.getdiemtbmon();
                    }
                     dtbhk2 = tdhk2/DiemHS2.size();
                }


                Object[] items = new Object[] {
                    stt++,
                    hs.getten(),
                    hs.getlop(),              
                    dtbhk1,
                    dtbhk2
                };
                model.addRow(items);  
            }
            jtb_dshocsinh.setModel(model);
            jtb_dshocsinh.setRowHeight(30);
            jtb_dshocsinh.getColumnModel().getColumn(0).setPreferredWidth(100);
            jtb_dshocsinh.getColumnModel().getColumn(1).setPreferredWidth(200);
            jtb_dshocsinh.getColumnModel().getColumn(2).setPreferredWidth(150);
            jtb_dshocsinh.getColumnModel().getColumn(3).setPreferredWidth(100);
            jtb_dshocsinh.getColumnModel().getColumn(4).setPreferredWidth(100);
        }
      
        
    }//GEN-LAST:event_jbt_timkiemActionPerformed

    private void jcb_hockyItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcb_hockyItemStateChanged
        // TODO add your handling code here:
          String hocky = jcb_hocky.getSelectedItem().toString().trim();
        String hocky1 = hocky.substring(9, 13)+"_" ;
        String hocky2 = hocky.substring(16, 20);
        hocky = hocky1.concat(hocky2);
        List<HocSinh> listResultSV;
        String[] columns = new String [] {
            "STT",
            "Họ Tên",
            "Lớp",
            "TB Học Kỳ 1",
            "TB Học Kỳ 2"
        };
        model = new DefaultTableModel(null , columns);
        
        listResultSV = HocSinhDAO.layDanhSachHocSinh();
        
        for (int i = 0; i < listResultSV.size(); i++) {
            HocSinh hs = (HocSinh) listResultSV.get(i);
            int stt = i;
            
            String hk1 = hocky+"_HK1";
            List<Diem> DiemHS1  = DiemDAO.DiemCuaHocSinh(hs.getmahocsinh(),hk1);
            float tdhk1 = 0;
            float dtbhk1 = 0 ;
            if(DiemHS1.size() > 0)
            {
                 for(int j = 0; j < DiemHS1.size(); j++ )
                {
                    Diem diem = (Diem) DiemHS1.get(j);
                    tdhk1 += diem.getdiemtbmon();
                }

                if(DiemHS1.size()>0)
                    dtbhk1 = tdhk1/DiemHS1.size();
            }
           
            
            String hk2 = hocky+"_HK2";
            List<Diem> DiemHS2  = DiemDAO.DiemCuaHocSinh(hs.getmahocsinh(),hk2);
            float tdhk2 = 0;          
            float dtbhk2 = 0 ;
            if(DiemHS2.size() > 0)
            {
                 for(int j = 0; j < DiemHS2.size(); j++ )
                {
                    Diem diem = (Diem) DiemHS2.get(j);
                    tdhk2 += diem.getdiemtbmon();
                }
                 dtbhk2 = tdhk2/DiemHS2.size();
            }
               
            
            Object[] items = new Object[] {
                stt++,
                hs.getten(),
                hs.getlop(),              
                dtbhk1,
                dtbhk2
            };
            model.addRow(items);  
        }
        jtb_dshocsinh.setModel(model);
        jtb_dshocsinh.setRowHeight(30);
        jtb_dshocsinh.getColumnModel().getColumn(0).setPreferredWidth(100);
        jtb_dshocsinh.getColumnModel().getColumn(1).setPreferredWidth(200);
        jtb_dshocsinh.getColumnModel().getColumn(2).setPreferredWidth(150);
        jtb_dshocsinh.getColumnModel().getColumn(3).setPreferredWidth(100);
        jtb_dshocsinh.getColumnModel().getColumn(4).setPreferredWidth(100);
    }//GEN-LAST:event_jcb_hockyItemStateChanged

    private void jbtn_thoat2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_thoat2ActionPerformed
        // TODO add your handling code here:
        setVisible(false); //you can't see me!
        dispose();
    }//GEN-LAST:event_jbtn_thoat2ActionPerformed

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
            java.util.logging.Logger.getLogger(DanhSachHocSinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DanhSachHocSinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DanhSachHocSinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DanhSachHocSinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DanhSachHocSinh().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbt_timkiem;
    private javax.swing.JButton jbtn_thoat;
    private javax.swing.JButton jbtn_thoat1;
    private javax.swing.JButton jbtn_thoat2;
    private javax.swing.JComboBox jcb_hocky;
    private javax.swing.JTable jtb_dshocsinh;
    private javax.swing.JTextField jtf_lop;
    // End of variables declaration//GEN-END:variables
}
