/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cms;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Login extends javax.swing.JFrame {
    /**
     * Creates new form Index
     */
    
    private static final Logger LOGGER = Logger.getLogger(Login.class.getName());

    
    public Login() {
        initComponents();
    }
    
    private void loginProcedure(){
        
        // جلب اسم المستخدم وكلمة السر
        dilogLabel.setText("جاري تحقق...");
        String user = usernameTextField.getText();
        String password = String.valueOf(passwordField.getPassword());
        if(user.isBlank()|| password.isBlank()){
            dilogLabel.setForeground(Color.red);
            dilogLabel.setText("الرجاء تعبئة حقل اسم المستخدم وكلمة المرور!");
        }else{ 
            // البحث عنهم في قاعدة البيانات
            try{
                String sql = "SELECT * FROM user WHERE name=? AND password=?";
                PreparedStatement pstmt = db.mycon().prepareStatement(sql);
                pstmt.setString(1, user);
                pstmt.setString(2, password);
                ResultSet rs = pstmt.executeQuery();

                // ان وجدة اي شيء مطابق للمدخلات يتم تسجيل الدخول
                if(rs.next()){
                    String username = rs.getString("name");
                    boolean is_admin = rs.getBoolean("is_admin");
                    int id = rs.getInt("id");
                    dilogLabel.setText("تم التحقق...");
                    new Home(username, is_admin, id).setVisible(true);
                    this.setVisible(false);

                    // حفظ عملية الدخول
                    String m = "USER WITH "+id+" LOGIN IN SUCCESSFULLY";
                    CmsLogger.log(m);
                }else{
                    // في حال لم يجد ترسل رسالة خطأ
                    dilogLabel.setForeground(Color.red);
                    dilogLabel.setText("خطأ...");
                    // حفظ عملية الدخول
                    String m = "ERORR: USER TRIED "+user+" AS USERNAME AND "+password+" AS PASSWORD!";
                    CmsLogger.log(m);
                }
            }catch(SQLException ex){
                LOGGER.log(Level.SEVERE, "An error occurred during login: {0}", ex);
                CmsLogger.log(ex.getMessage());
                JOptionPane.showMessageDialog(null, "error: " + ex.getMessage() + "!", "خطأ!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usernameTextField = new javax.swing.JTextField();
        loigninButton = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        showPasswordButton = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        dilogLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Loign in");

        usernameTextField.setToolTipText("");
        usernameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usernameTextFieldKeyPressed(evt);
            }
        });

        loigninButton.setText("تسجيل الدخول");
        loigninButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loigninButtonActionPerformed(evt);
            }
        });

        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordFieldKeyPressed(evt);
            }
        });

        usernameLabel.setText("اسم المستخدم:");

        passwordLabel.setText("كلمة السر:");

        showPasswordButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cms/img/show.png"))); // NOI18N
        showPasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("مرحباً بك في منظومة الخبرة القضائية");

        dilogLabel.setText("...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dilogLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 23, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(loigninButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(showPasswordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passwordField)
                                    .addComponent(usernameTextField))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(passwordLabel, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usernameLabel)
                            .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordLabel)))
                    .addComponent(showPasswordButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 28, Short.MAX_VALUE)
                .addComponent(loigninButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dilogLabel)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loigninButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loigninButtonActionPerformed
        loginProcedure();
    }//GEN-LAST:event_loigninButtonActionPerformed

    private void showPasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPasswordButtonActionPerformed
        // TODO add your handling code here:
        if(showPasswordButton.isSelected()){
            passwordField.setEchoChar((char)0);
            showPasswordButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cms/img/DnotShow.png")));
        }else {
                passwordField.setEchoChar('*');
                showPasswordButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cms/img/show.png")));
        }
    }//GEN-LAST:event_showPasswordButtonActionPerformed

    private void usernameTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameTextFieldKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            loginProcedure();
        }
    }//GEN-LAST:event_usernameTextFieldKeyPressed

    private void passwordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            loginProcedure();
        }
    }//GEN-LAST:event_passwordFieldKeyPressed

    /**
     * @param args the command line arguments
     */
    public void veiw() {
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dilogLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton loigninButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JToggleButton showPasswordButton;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
