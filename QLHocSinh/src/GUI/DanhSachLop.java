/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author Vinh
 */
public class DanhSachLop extends javax.swing.JFrame {

    /**
     * Creates new form DanhSachLop
     */
    public DanhSachLop() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtLop = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtHienThiTenLop = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtHienThiSiSo = new javax.swing.JTextField();
        btnGiaoVu = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnInDanhSach = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Danh Sách Lớp");

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "STT", "Họ Tên", "Giới Tính", "Năm Sinh", "Địa Chỉ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("DANH SÁCH LỚP");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 14, 0, 0);
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("LỚP");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(19, 160, 0, 0);
        jPanel1.add(jLabel2, gridBagConstraints);

        txtLop.setText("  ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 229;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 2, 0, 0);
        jPanel1.add(txtLop, gridBagConstraints);

        btnTimKiem.setBackground(new java.awt.Color(255, 102, 0));
        btnTimKiem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnTimKiem.setText("TÌM KIẾM");
        btnTimKiem.setMaximumSize(new java.awt.Dimension(95, 23));
        btnTimKiem.setMinimumSize(new java.awt.Dimension(95, 23));
        btnTimKiem.setPreferredSize(new java.awt.Dimension(95, 23));
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 72, 0, 0);
        jPanel1.add(btnTimKiem, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("TÊN LỚP");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(43, 136, 0, 0);
        jPanel1.add(jLabel3, gridBagConstraints);

        txtHienThiTenLop.setText(" ");
        txtHienThiTenLop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHienThiTenLopActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 60;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(41, 4, 0, 0);
        jPanel1.add(txtHienThiTenLop, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("SỈ SỐ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(43, 63, 0, 0);
        jPanel1.add(jLabel4, gridBagConstraints);

        txtHienThiSiSo.setText(" ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 60;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(41, 4, 0, 0);
        jPanel1.add(txtHienThiSiSo, gridBagConstraints);

        btnGiaoVu.setBackground(new java.awt.Color(255, 0, 0));
        btnGiaoVu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGiaoVu.setText("GIÁO VỤ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 39;
        gridBagConstraints.ipady = 17;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 187, 0, 10);
        jPanel1.add(btnGiaoVu, gridBagConstraints);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        btnThem.setBackground(new java.awt.Color(255, 102, 0));
        btnThem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnThem.setText("THÊM");
        btnThem.setMaximumSize(new java.awt.Dimension(95, 23));
        btnThem.setMinimumSize(new java.awt.Dimension(95, 23));
        btnThem.setPreferredSize(new java.awt.Dimension(95, 23));
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 28;
        gridBagConstraints.ipady = 17;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        jPanel2.add(btnThem, gridBagConstraints);

        btnXoa.setBackground(new java.awt.Color(255, 102, 0));
        btnXoa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnXoa.setText("XÓA");
        btnXoa.setMaximumSize(new java.awt.Dimension(95, 23));
        btnXoa.setMinimumSize(new java.awt.Dimension(95, 23));
        btnXoa.setPreferredSize(new java.awt.Dimension(95, 23));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 28;
        gridBagConstraints.ipady = 17;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 10, 0, 10);
        jPanel2.add(btnXoa, gridBagConstraints);

        btnSua.setBackground(new java.awt.Color(255, 102, 0));
        btnSua.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSua.setText("SỬA");
        btnSua.setMaximumSize(new java.awt.Dimension(95, 23));
        btnSua.setMinimumSize(new java.awt.Dimension(95, 23));
        btnSua.setPreferredSize(new java.awt.Dimension(95, 23));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 28;
        gridBagConstraints.ipady = 17;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 10, 0, 10);
        jPanel2.add(btnSua, gridBagConstraints);

        btnInDanhSach.setBackground(new java.awt.Color(255, 102, 0));
        btnInDanhSach.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnInDanhSach.setText("IN DANH SÁCH");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipady = 17;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 10, 43, 10);
        jPanel2.add(btnInDanhSach, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void txtHienThiTenLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHienThiTenLopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHienThiTenLopActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemActionPerformed

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
            java.util.logging.Logger.getLogger(DanhSachLop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DanhSachLop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DanhSachLop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DanhSachLop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DanhSachLop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGiaoVu;
    private javax.swing.JButton btnInDanhSach;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtHienThiSiSo;
    private javax.swing.JTextField txtHienThiTenLop;
    private javax.swing.JTextField txtLop;
    // End of variables declaration//GEN-END:variables
}
