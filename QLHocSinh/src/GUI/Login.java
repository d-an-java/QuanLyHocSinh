package GUI;



import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class Login extends javax.swing.JFrame {

		Connection con;
		PreparedStatement pst;
	    ResultSet rs;
	    public Login() {
	        initComponents();
	    }
	    @SuppressWarnings("unchecked")
	                  
	    private void initComponents() {

	        jLabel1 = new javax.swing.JLabel();
	        txtUse = new javax.swing.JTextField();
	        jLabel2 = new javax.swing.JLabel();
	        jLabel3 = new javax.swing.JLabel();
	        bntlogin = new javax.swing.JButton();
	        bntcancel = new javax.swing.JButton();
	        txtpass = new javax.swing.JPasswordField();

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	        setTitle("Đăng nhập hệ thống");

	        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
	        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
	        jLabel1.setText("ĐĂNG NHẬP HỆ THỐNG ");

	        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        jLabel2.setText("UserName");

	        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        jLabel3.setText("Password");

	        bntlogin.setText("ĐĂNG NHẬP");
	        bntlogin.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                bntloginActionPerformed(evt);
	            }
	        });

	        bntcancel.setText("THOÁT");
	        bntcancel.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                bntcancelActionPerformed(evt);
	            }
	        });

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
	                .addContainerGap(114, Short.MAX_VALUE)
	                .addComponent(jLabel1)
	                .addGap(101, 101, 101))
	            .addGroup(layout.createSequentialGroup()
	                .addGap(35, 35, 35)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(jLabel2)
	                    .addComponent(jLabel3))
	                .addGap(30, 30, 30)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                    .addComponent(txtUse, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
	                    .addComponent(txtpass)
	                    .addGroup(layout.createSequentialGroup()
	                        .addComponent(bntlogin)
	                        .addGap(18, 18, 18)
	                        .addComponent(bntcancel)))
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGap(22, 22, 22)
	                .addComponent(jLabel1)
	                .addGap(26, 26, 26)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(txtUse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jLabel2))
	                .addGap(34, 34, 34)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jLabel3)
	                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(18, 18, 18)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(bntlogin)
	                    .addComponent(bntcancel))
	                .addContainerGap(27, Short.MAX_VALUE))
	        );

	        pack();
	    }// </editor-fold>                        

	    private void bntcancelActionPerformed(java.awt.event.ActionEvent evt) {                                          
	        // TODO add your handling code here:
	        System.exit(0);
	    }                                         

	    private void bntloginActionPerformed(java.awt.event.ActionEvent evt) {                                         
	        // TODO add your handling code here:
	       
	    }                                        

	    
	    public static void main(String args[]) {
	     
	        try {
	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	                if ("Nimbus".equals(info.getName())) {
	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                    break;
	                }
	            }
	        } catch (ClassNotFoundException ex) {
	            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
	        //</editor-fold>

	        /* Create and display the form */
	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new Login().setVisible(true);
	            }
	        });
	    }

	    // Variables declaration - do not modify                     
	    private javax.swing.JButton bntcancel;
	    private javax.swing.JButton bntlogin;
	    private javax.swing.JLabel jLabel1;
	    private javax.swing.JLabel jLabel2;
	    private javax.swing.JLabel jLabel3;
	    private javax.swing.JTextField txtUse;
	    private javax.swing.JPasswordField txtpass;
	    // End of variables declaration              
}
