/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAO.HocSinhDAO;
import DAO.LopDAO;
import Entity.HocSinh;
import Entity.Lop;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vinh
 */
public class HoSoHocSinh extends javax.swing.JFrame {

    /**
     * Creates new form HoSoHocSinh
     */
    public HoSoHocSinh() {
        initComponents();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jtb_hocsinh = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jbt_them = new javax.swing.JButton();
        jbt_xoa = new javax.swing.JButton();
        jbt_sua = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtf_hoten = new javax.swing.JTextField();
        jtf_diachi = new javax.swing.JTextField();
        jtf_email = new javax.swing.JTextField();
        jrb_gtnam = new javax.swing.JRadioButton();
        jrb_gtnu = new javax.swing.JRadioButton();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jbtn_thoat = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jcb_lop = new javax.swing.JComboBox();
        jdp_ngaysinh = new org.jdesktop.swingx.JXDatePicker();
        jXDatePicker2 = new org.jdesktop.swingx.JXDatePicker();
        jtf_mahocsinh = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Hồ Sơ Học Sinh");
        setBackground(new java.awt.Color(153, 255, 204));

        jtb_hocsinh.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtb_hocsinh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Họ và tên", "Giới tính", "Ngày sinh", "Địa chỉ", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtb_hocsinh.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(jtb_hocsinh);
        jtb_hocsinh.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jbt_them.setBackground(new java.awt.Color(255, 102, 0));
        jbt_them.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbt_them.setText("THÊM");
        jbt_them.setMaximumSize(new java.awt.Dimension(95, 23));
        jbt_them.setMinimumSize(new java.awt.Dimension(95, 23));
        jbt_them.setPreferredSize(new java.awt.Dimension(95, 23));
        jbt_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_themActionPerformed(evt);
            }
        });

        jbt_xoa.setBackground(new java.awt.Color(255, 102, 0));
        jbt_xoa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbt_xoa.setText("XÓA");
        jbt_xoa.setMaximumSize(new java.awt.Dimension(95, 23));
        jbt_xoa.setMinimumSize(new java.awt.Dimension(95, 23));
        jbt_xoa.setPreferredSize(new java.awt.Dimension(95, 23));
        jbt_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_xoaActionPerformed(evt);
            }
        });

        jbt_sua.setBackground(new java.awt.Color(255, 102, 0));
        jbt_sua.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbt_sua.setText("SỬA");
        jbt_sua.setMaximumSize(new java.awt.Dimension(95, 23));
        jbt_sua.setMinimumSize(new java.awt.Dimension(95, 23));
        jbt_sua.setPreferredSize(new java.awt.Dimension(95, 23));
        jbt_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_suaActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 102, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("MỚI");
        jButton4.setMaximumSize(new java.awt.Dimension(95, 23));
        jButton4.setMinimumSize(new java.awt.Dimension(95, 23));
        jButton4.setPreferredSize(new java.awt.Dimension(95, 23));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Địa chỉ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Giới tính");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Ngày sinh");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Họ và tên");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Email");

        jtf_hoten.setText(" ");

        jtf_diachi.setText(" ");

        jtf_email.setText(" ");

        jrb_gtnam.setText("Nam ");

        jrb_gtnu.setText("Nữ");

        jButton5.setBackground(new java.awt.Color(255, 0, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setText("Giáo Vụ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("HỒ SƠ HỌC SINH");

        jbtn_thoat.setBackground(new java.awt.Color(255, 102, 0));
        jbtn_thoat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtn_thoat.setText("Thoát");
        jbtn_thoat.setToolTipText("");
        jbtn_thoat.setMaximumSize(new java.awt.Dimension(95, 23));
        jbtn_thoat.setMinimumSize(new java.awt.Dimension(95, 23));
        jbtn_thoat.setPreferredSize(new java.awt.Dimension(95, 23));
        jbtn_thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_thoatActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Lớp");

        jtf_mahocsinh.setText(" ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("* Mã học sinh");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Tìm Kiếm");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtf_hoten, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jdp_ngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtf_email, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jbt_them, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jbt_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(102, 102, 102)
                                        .addComponent(jbt_sua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jrb_gtnam, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jrb_gtnu, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(57, 57, 57)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jcb_lop, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jbtn_thoat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(72, 72, 72)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 190, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jtf_diachi, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtf_mahocsinh, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(42, 42, 42))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(301, 301, 301)
                        .addComponent(jButton5))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addGap(54, 54, 54)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtf_hoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdp_ngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jrb_gtnam)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jrb_gtnu)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jcb_lop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtf_diachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtf_mahocsinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn_thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbt_sua, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbt_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbt_them, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

      void LoadData() {
        List<Lop> dsLop = LopDAO.layDanhSachLop();
        for (int i = 0; i < dsLop.size(); i++) {
            jcb_lop.addItem(dsLop.get(i).getmalop());
        }          
          
        List<HocSinh> listResultSV;
        String[] columns = new String [] {
            "Mã",
            "Tên Học Sinh",
            "Năm sinh",
            "Giới Tính",
            "Email",
            "Địa chỉ"
        };
        DefaultTableModel model = new DefaultTableModel(null , columns);
        
        listResultSV = HocSinhDAO.layDanhSachHocSinh();
        
        for (int i = 0; i < listResultSV.size(); i++) {
            HocSinh hs = (HocSinh) listResultSV.get(i);
            
            Object[] items = new Object[] {
                hs.getmahocsinh(),
                hs.getten(),
                hs.getngaysinh(),
                hs.getgioitinh(),
                hs.getemail(),
                hs.getdiachi()
            };
            model.addRow(items);  
        }
        jtb_hocsinh.setModel(model);
        jtb_hocsinh.setRowHeight(30);
        jtb_hocsinh.getColumnModel().getColumn(0).setPreferredWidth(100);
        jtb_hocsinh.getColumnModel().getColumn(1).setPreferredWidth(200);
        jtb_hocsinh.getColumnModel().getColumn(2).setPreferredWidth(150);
        jtb_hocsinh.getColumnModel().getColumn(3).setPreferredWidth(50);
        jtb_hocsinh.getColumnModel().getColumn(4).setPreferredWidth(150);
        jtb_hocsinh.getColumnModel().getColumn(4).setPreferredWidth(300);
   
    }
    
    private void jbt_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_themActionPerformed
        // TODO add your handling code here:
        String hoten = jtf_hoten.getText();
        String diachi = jtf_diachi.getText();
        String email = jtf_email.getText();
        SimpleDateFormat sdft = new SimpleDateFormat("dd/MM/yyyy");
        String ngaysinh = sdft.format(jdp_ngaysinh.getDate());//select date 
        String gioitinh = "Nữ";
        if(jrb_gtnam.isSelected())
        {
            gioitinh = "Nam";
        }
        String malop =  jcb_lop.getSelectedItem().toString();
        
        SimpleDateFormat sdft1 = new SimpleDateFormat("dd-MM-yyyy");

        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY");
        String nam = simpleDateFormat.format(date).toUpperCase();
        
        List<HocSinh> lop = HocSinhDAO.LopCoBaoNhieuHocSinh(malop);
        int sohocsinh = 1;
        for (int i = 0; i < lop.size(); i++) {
            sohocsinh++;
        }   
        String mahs = "";
        if(sohocsinh < 10)
            mahs = "0"+String.valueOf(sohocsinh);
        else
            mahs = String.valueOf(sohocsinh);
        String mahocsinh = nam.substring(2)+ malop.substring(0, 2) + malop.substring(2 + 1) +  mahs ;     
        HocSinh hs = new HocSinh(hoten, ngaysinh, gioitinh, diachi, email, malop, mahocsinh);
        boolean result = HocSinhDAO.themHocSinh(hs);
        if (result) {
            JOptionPane.showMessageDialog(this, "Thêm sinh viên thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Thêm thất bại", "Thông báo", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jbt_themActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jbtn_thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_thoatActionPerformed
        // TODO add your handling code here:
        setVisible(false); //you can't see me!
        dispose();
    }//GEN-LAST:event_jbtn_thoatActionPerformed

    private void jbt_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_xoaActionPerformed
        // TODO add your handling code here:
//        List<HocSinh> hs = HocSinhDAO.layThongTinHocSinh(jtf_mahocsinh.getText());
//        String id = String.valueOf(hs.get(0).getid()) ;
//         System.out.println(" mahs : " + id);
        boolean result = HocSinhDAO.xoaHocSinh(jtf_mahocsinh.getText().trim());
        if (result) {
            JOptionPane.showMessageDialog(this, "xóa sinh viên thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "xoa thất bại", "Thông báo", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jbt_xoaActionPerformed

    private void jbt_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_suaActionPerformed
        // TODO add your handling code here:
           // TODO add your handling code here:
        String hoten = jtf_hoten.getText();
        String diachi = jtf_diachi.getText();
        String email = jtf_email.getText();
        SimpleDateFormat sdft = new SimpleDateFormat("dd/MM/yyyy");
        String ngaysinh = sdft.format(jdp_ngaysinh.getDate());//select date 
        String gioitinh = "Nữ";
        if(jrb_gtnam.isSelected())
        {
            gioitinh = "Nam";
        }
        String malop =  jcb_lop.getSelectedItem().toString();
        
        SimpleDateFormat sdft1 = new SimpleDateFormat("dd-MM-yyyy");

        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY");
        String nam = simpleDateFormat.format(date).toUpperCase();
     
        String mahocsinh = jtf_mahocsinh.getText().trim() ;     

        HocSinh hs = new HocSinh(hoten, ngaysinh, gioitinh, diachi, email, malop, mahocsinh);
        boolean result = HocSinhDAO.capNhatHocSinh(hs);
        if (result) {
            JOptionPane.showMessageDialog(this, "Thêm sinh viên thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Thêm thất bại", "Thông báo", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jbt_suaActionPerformed

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
            java.util.logging.Logger.getLogger(HoSoHocSinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HoSoHocSinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HoSoHocSinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HoSoHocSinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HoSoHocSinh().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker2;
    private javax.swing.JButton jbt_sua;
    private javax.swing.JButton jbt_them;
    private javax.swing.JButton jbt_xoa;
    private javax.swing.JButton jbtn_thoat;
    private javax.swing.JComboBox jcb_lop;
    private org.jdesktop.swingx.JXDatePicker jdp_ngaysinh;
    private javax.swing.JRadioButton jrb_gtnam;
    private javax.swing.JRadioButton jrb_gtnu;
    private javax.swing.JTable jtb_hocsinh;
    private javax.swing.JTextField jtf_diachi;
    private javax.swing.JTextField jtf_email;
    private javax.swing.JTextField jtf_hoten;
    private javax.swing.JTextField jtf_mahocsinh;
    // End of variables declaration//GEN-END:variables
}
