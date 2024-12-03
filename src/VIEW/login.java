/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import DAO.StaffDAO;
import MODEL.Staff;
import javax.swing.JOptionPane;

/**
 *
 * @author Naome
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        right = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        emailBOX = new javax.swing.JTextField();
        loginBTN = new javax.swing.JButton();
        passwordBOX = new javax.swing.JPasswordField();
        gobacklink = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setName("login"); // NOI18N
        setPreferredSize(new java.awt.Dimension(800, 400));

        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 400));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        right.setBackground(new java.awt.Color(0, 102, 102));

        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\AUCA\\java\\transport_managment_system\\bus1.png")); // NOI18N
        jLabel4.setText("jLabel4");

        jLabel6.setFont(new java.awt.Font("Yu Gothic Medium", 2, 14)); // NOI18N
        jLabel6.setText("KIMIRONKO BUS STATION ");

        javax.swing.GroupLayout rightLayout = new javax.swing.GroupLayout(right);
        right.setLayout(rightLayout);
        rightLayout.setHorizontalGroup(
            rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        rightLayout.setVerticalGroup(
            rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel4)
                .addGap(41, 41, 41)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jPanel1.add(right);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("LOGIN");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("EMAIL");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("PASSWORD");

        loginBTN.setBackground(new java.awt.Color(0, 102, 102));
        loginBTN.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        loginBTN.setForeground(new java.awt.Color(0, 102, 102));
        loginBTN.setText("LOGIN");
        loginBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBTNActionPerformed(evt);
            }
        });

        gobacklink.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        gobacklink.setForeground(new java.awt.Color(0, 103, 102));
        gobacklink.setText("If no account clink on button below to register");
        gobacklink.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gobacklink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gobacklinkMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gobacklinkMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(emailBOX)
                            .addComponent(jLabel2)
                            .addComponent(passwordBOX, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 51, Short.MAX_VALUE)
                .addComponent(gobacklink, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(loginBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailBOX, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(passwordBOX, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(loginBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(gobacklink)
                .addGap(39, 39, 39))
        );

        jPanel1.add(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 713, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("LOGIN");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gobacklinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gobacklinkMouseClicked
        
    }//GEN-LAST:event_gobacklinkMouseClicked

    private void gobacklinkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gobacklinkMouseEntered
             register registerFrame = new register();
                 
            registerFrame.setLocationRelativeTo(null); // Center the frame
            registerFrame.setVisible(true);
    }//GEN-LAST:event_gobacklinkMouseEntered

    private void loginBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBTNActionPerformed
        if(emailBOX.getText().trim().isEmpty())  {
       JOptionPane.showMessageDialog(null, "Staff's EMAIL is Mandatory","Mandatory Field",JOptionPane.WARNING_MESSAGE);  
    }else{
char[] pass= passwordBOX.getPassword();
String password=new String (pass);
String email = emailBOX.getText().trim();
if (password.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).{4}$") && email.matches("^[\\w-\\.]+@[\\w-\\.]+$")) {
         Staff thestaff=new Staff();
         thestaff.setEmail(emailBOX.getText());
         thestaff.setPassword(new String(passwordBOX.getPassword()));
        StaffDAO staffdao=new StaffDAO();
     String enteredUser=staffdao.loginAuthentication(thestaff);
     if(enteredUser!=null){
            if(enteredUser.equals("manager")){
             man_Dashboard dash=new man_Dashboard();
             dash.setVisible(true);
              this.dispose();
     }
     else if(enteredUser.equals("supervisor")){
         supervisorDash dashboard=new supervisorDash();
         dashboard.setVisible(true);
     }
    //this.dispose();
     }else{
          JOptionPane.showMessageDialog(this, "Invalid credentials. Please try again.");
     }
   
        }  }
    }//GEN-LAST:event_loginBTNActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               

   login loginFrame = new login();
            loginFrame.setLocationRelativeTo(null); // Center the frame
            loginFrame.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailBOX;
    private javax.swing.JLabel gobacklink;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginBTN;
    private javax.swing.JPasswordField passwordBOX;
    private javax.swing.JPanel right;
    // End of variables declaration//GEN-END:variables
}
