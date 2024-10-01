package sample_project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.RowFilter;

public class Register_Frame1 extends javax.swing.JFrame {

    private static final String dbuserName = "root";
    private static final String password = "";
    private static final String baseUrl = "jdbc:mysql://localhost:3306/sample_project";
    
    private Connection config = null;
    private PreparedStatement pst = null;
    private ResultSet result = null;
    private int number1;
    
    public Register_Frame1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    
    public void Connection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            config = DriverManager.getConnection(baseUrl, dbuserName, password);
        } catch (Exception erorr){
            JOptionPane.showMessageDialog(this, erorr);
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        userN_text = new javax.swing.JLabel();
        userP_text = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        signButton = new javax.swing.JButton();
        showHide = new javax.swing.JCheckBox();
        firstName = new javax.swing.JTextField();
        userN_text1 = new javax.swing.JLabel();
        LastName = new javax.swing.JTextField();
        userN_text2 = new javax.swing.JLabel();
        birthOFdate = new javax.swing.JTextField();
        phoneNumber = new javax.swing.JTextField();
        userP_text1 = new javax.swing.JLabel();
        userP_text2 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 128, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sample_project/login-img.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sign up");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        userN_text.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        userN_text.setText("first Name");

        userP_text.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        userP_text.setText("Password");

        Password.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        signButton.setBackground(new java.awt.Color(0, 128, 255));
        signButton.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        signButton.setForeground(new java.awt.Color(255, 255, 255));
        signButton.setText("Sign up");
        signButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signButtonActionPerformed(evt);
            }
        });

        showHide.setBackground(new java.awt.Color(255, 255, 255));
        showHide.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        showHide.setText("Show Password");
        showHide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showHideActionPerformed(evt);
            }
        });

        firstName.setCaretColor(new java.awt.Color(255, 255, 255));
        firstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameActionPerformed(evt);
            }
        });

        userN_text1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        userN_text1.setText("Last Name");

        LastName.setCaretColor(new java.awt.Color(255, 255, 255));

        userN_text2.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        userN_text2.setText("Birth Of date");

        birthOFdate.setCaretColor(new java.awt.Color(255, 255, 255));

        phoneNumber.setCaretColor(new java.awt.Color(255, 255, 255));

        userP_text1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        userP_text1.setText("Email");

        userP_text2.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        userP_text2.setText("Phone Number");

        email.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 128, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Log In");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 1, 36)); // NOI18N
        jLabel3.setText("Join us for free");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Password)
                                    .addComponent(signButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(userN_text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(firstName)
                                    .addComponent(LastName)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(userN_text2)
                                            .addComponent(userN_text1))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(birthOFdate)
                                    .addComponent(phoneNumber)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(userP_text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(showHide))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(userP_text2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(412, 412, 412))
                                    .addComponent(email)
                                    .addComponent(userP_text1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(94, 94, 94))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addGap(31, 31, 31)
                .addComponent(userN_text)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userN_text1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userN_text2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(birthOFdate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userP_text1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userP_text2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userP_text)
                    .addComponent(showHide))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(signButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 943, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void showHideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showHideActionPerformed
        // TODO add your handling code here:
        if (showHide.isSelected()){
            Password.setEchoChar((char)0);
        } else {
            Password.setEchoChar('*');
        }
    }//GEN-LAST:event_showHideActionPerformed

    private void signButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signButtonActionPerformed
        // TODO add your handling code here:
        try{
            Connection();
            pst = config.prepareStatement("insert into users(first_name, last_name, birthOFdate, email, phone_number, password)value(?, ?, ?, ?, ?, ?)");
            pst.setString(1, firstName.getText());
            pst.setString(2, LastName.getText());
            pst.setString(3, birthOFdate.getText());
            pst.setString(4, email.getText());
            pst.setString(5, phoneNumber.getText());
            pst.setString(6, Password.getText());
            
            int result = pst.executeUpdate();
            
            if (result > 0) {
                Login_Frame login = new Login_Frame();
                this.dispose();
                login.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Registration failed. Please try again.");
            }
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_signButtonActionPerformed

    private void firstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        Login_Frame login = new Login_Frame();
        this.dispose();
        login.setVisible(true);
    }//GEN-LAST:event_jLabel8MouseClicked

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
            java.util.logging.Logger.getLogger(Register_Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register_Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register_Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register_Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register_Frame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField LastName;
    private javax.swing.JPasswordField Password;
    private javax.swing.JTextField birthOFdate;
    private javax.swing.JTextField email;
    private javax.swing.JTextField firstName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField phoneNumber;
    private javax.swing.JCheckBox showHide;
    private javax.swing.JButton signButton;
    private javax.swing.JLabel userN_text;
    private javax.swing.JLabel userN_text1;
    private javax.swing.JLabel userN_text2;
    private javax.swing.JLabel userP_text;
    private javax.swing.JLabel userP_text1;
    private javax.swing.JLabel userP_text2;
    // End of variables declaration//GEN-END:variables
}
