package GUI;



import DAO.TaiKhoanDAO;
import java.awt.Color;
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

	    	java.awt.GridBagConstraints gridBagConstraints;

	        jLabel1 = new javax.swing.JLabel();
	        txtUse = new javax.swing.JTextField();
	        jLabel2 = new javax.swing.JLabel();
	        jLabel3 = new javax.swing.JLabel();
	        bntlogin = new javax.swing.JButton();
	        bntcancel = new javax.swing.JButton();
	        txtpass = new javax.swing.JPasswordField();

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	        setTitle("Đăng nhập hệ thống");
	        setBackground(new java.awt.Color(0, 255, 51));
	        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
	        getContentPane().setLayout(new java.awt.GridBagLayout());

	        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
	        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
	        jLabel1.setText("Đăng nhập hệ thống");
	        gridBagConstraints = new java.awt.GridBagConstraints();
	        gridBagConstraints.gridx = 2;
	        gridBagConstraints.gridy = 0;
	        gridBagConstraints.gridwidth = 3;
	        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
	        gridBagConstraints.insets = new java.awt.Insets(22, 20, 0, 0);
	        getContentPane().add(jLabel1, gridBagConstraints);
	        gridBagConstraints = new java.awt.GridBagConstraints();
	        gridBagConstraints.gridx = 2;
	        gridBagConstraints.gridy = 1;
	        gridBagConstraints.gridwidth = 4;
	        gridBagConstraints.gridheight = 2;
	        gridBagConstraints.ipadx = 243;
	        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
	        gridBagConstraints.insets = new java.awt.Insets(26, 30, 0, 27);
	        getContentPane().add(txtUse, gridBagConstraints);

	        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        jLabel2.setText("UseName");
	        gridBagConstraints = new java.awt.GridBagConstraints();
	        gridBagConstraints.gridx = 0;
	        gridBagConstraints.gridy = 1;
	        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
	        gridBagConstraints.insets = new java.awt.Insets(28, 35, 0, 0);
	        getContentPane().add(jLabel2, gridBagConstraints);

	        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
	        jLabel3.setText("Password");
	        gridBagConstraints = new java.awt.GridBagConstraints();
	        gridBagConstraints.gridx = 0;
	        gridBagConstraints.gridy = 3;
	        gridBagConstraints.gridwidth = 2;
	        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
	        gridBagConstraints.insets = new java.awt.Insets(36, 35, 0, 0);
	        getContentPane().add(jLabel3, gridBagConstraints);

	        bntlogin.setBackground(new java.awt.Color(51, 51, 255));
	        bntlogin.setForeground(new java.awt.Color(255, 255, 255));
	        bntlogin.setText("Login");
	        bntlogin.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                bntloginActionPerformed(evt);
	            }
	        });
	        gridBagConstraints = new java.awt.GridBagConstraints();
	        gridBagConstraints.gridx = 2;
	        gridBagConstraints.gridy = 5;
	        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
	        gridBagConstraints.insets = new java.awt.Insets(18, 30, 27, 0);
	        getContentPane().add(bntlogin, gridBagConstraints);

	        bntcancel.setText("Cancel");
	        bntcancel.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                bntcancelActionPerformed(evt);
	            }
	        });
	        gridBagConstraints = new java.awt.GridBagConstraints();
	        gridBagConstraints.gridx = 3;
	        gridBagConstraints.gridy = 5;
	        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
	        gridBagConstraints.insets = new java.awt.Insets(18, 18, 27, 0);
	        getContentPane().add(bntcancel, gridBagConstraints);
	        gridBagConstraints = new java.awt.GridBagConstraints();
	        gridBagConstraints.gridx = 2;
	        gridBagConstraints.gridy = 3;
	        gridBagConstraints.gridwidth = 4;
	        gridBagConstraints.gridheight = 2;
	        gridBagConstraints.ipadx = 243;
	        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
	        gridBagConstraints.insets = new java.awt.Insets(34, 30, 0, 27);
	        getContentPane().add(txtpass, gridBagConstraints);
                pack();     
                setLocationRelativeTo(null);
//	        setVisible(true);
	    }// </editor-fold>                        

	    private void bntcancelActionPerformed(java.awt.event.ActionEvent evt) {                                          
	        // TODO add your handling code here:
	        System.exit(0);
	    }                                         

	    private void bntloginActionPerformed(java.awt.event.ActionEvent evt) {                                         
	        // TODO add your handling code here:
	       int loai =  TaiKhoanDAO.DangNhap(txtUse.getText(), txtpass.getText());
                if(loai == 1 )
                {
                    System.out.println("tk giao vien");
//                    TrangChu ct = new TrangChu();
//                    ct.setLocationRelativeTo(null);
//                    ct.setVisible(true);
                    this.dispose();
                    java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                            new TrangChu().setVisible(true);
                        }
                    });
                }                
                else if(loai == 2)
                    System.out.println("tk giao vu");
                else
                    System.out.println("sai tai khoản hoạc mk ?");
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
