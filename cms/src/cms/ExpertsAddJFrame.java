/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cms;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class ExpertsAddJFrame extends javax.swing.JFrame {
    
    private static final Logger LOGGER = Logger.getLogger(ExpertsAddJFrame.class.getName());
    /**
     * Creates new form ExpertsAddPanel
     */
    public ExpertsAddJFrame() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        alTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        saveRecord = new javax.swing.JButton();
        deleteRecord = new javax.swing.JButton();
        nameTextField = new javax.swing.JTextField();
        spTextField = new javax.swing.JTextField();
        education_level = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        edgreeTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        doeDateChooser = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();

        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("اسم الخبير: ");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(330, 170, 70, 20);

        alTextField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jPanel2.add(alTextField);
        alTextField.setBounds(90, 260, 180, 22);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("التخصص العلمي:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(290, 210, 110, 20);

        saveRecord.setText("إضافة خبير");
        saveRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveRecordActionPerformed(evt);
            }
        });
        jPanel2.add(saveRecord);
        saveRecord.setBounds(300, 410, 90, 23);

        deleteRecord.setText("مسح");
        deleteRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteRecordActionPerformed(evt);
            }
        });
        jPanel2.add(deleteRecord);
        deleteRecord.setBounds(10, 410, 100, 23);

        nameTextField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        nameTextField.setText("   ");
        jPanel2.add(nameTextField);
        nameTextField.setBounds(90, 170, 221, 22);

        spTextField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        spTextField.setText(" ");
        jPanel2.add(spTextField);
        spTextField.setBounds(90, 210, 180, 22);

        education_level.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        education_level.setText("المستوى الدراسي:");
        jPanel2.add(education_level);
        education_level.setBounds(290, 260, 110, 20);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("تاريخ التعيين:");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(320, 300, 80, 20);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("الدرجة الوظيفية:");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(300, 340, 100, 20);

        edgreeTextField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jPanel2.add(edgreeTextField);
        edgreeTextField.setBounds(90, 340, 200, 22);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("الخبراء");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(140, 50, 188, 42);
        jPanel2.add(doeDateChooser);
        doeDateChooser.setBounds(90, 300, 190, 22);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("رقم الخبير:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(330, 130, 70, 20);

        idTextField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        idTextField.setText("   ");
        jPanel2.add(idTextField);
        idTextField.setBounds(90, 130, 221, 22);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteRecordActionPerformed
        // TODO add your handling code here:
        nameTextField.setText("");
        spTextField.setText("");
        alTextField.setText("");
        edgreeTextField.setText("");
    }//GEN-LAST:event_deleteRecordActionPerformed

    private void saveRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveRecordActionPerformed
        // TODO add your handling code here:
        String id = idTextField.getText();
        String name = nameTextField.getText();
        String sp = spTextField.getText();
        String al = alTextField.getText();
        String edgree = edgreeTextField.getText();
        
     
        String query = "INSERT INTO `experts` (`id`,`name`, `sp`, `a_l`, `doe`, `e_degree`) VALUES (?, ?, ?, ?, ?, ?)";
        if(id.isBlank() | name.isBlank() | sp.isBlank() | al.isBlank() | edgree.isBlank()){
            String m = "الرجاء تأكد من البيانات يجب!";
            JOptionPane.showMessageDialog(null, "خطأ: " + m + "!", "خطأ!", JOptionPane.ERROR_MESSAGE);
        }else{  
            try{
                SimpleDateFormat inputFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.ENGLISH);
                SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");
                String doe = outputFormat.format(inputFormat.parse(doeDateChooser.getDate().toString()));

                PreparedStatement pstmt = db.mycon().prepareStatement(query);
                pstmt.setString(1, id);
                pstmt.setString(2, name);
                pstmt.setString(3, sp);
                pstmt.setString(4, al);
                pstmt.setString(5, doe);
                pstmt.setString(6, edgree);

                pstmt.executeUpdate();

                pstmt.close();
                idTextField.setText("");
                nameTextField.setText("");
                spTextField.setText("");
                alTextField.setText("");
                edgreeTextField.setText("");
                JOptionPane.showMessageDialog(null, "تم تعديل!");
            }catch(SQLException | ParseException ex){
                LOGGER.log(Level.SEVERE, "An error occurred during login: {0}", ex);
                CmsLogger.log(ex.getMessage());
                JOptionPane.showMessageDialog(null, "error: " + ex.getMessage() + "!", "خطأ!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_saveRecordActionPerformed

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
            java.util.logging.Logger.getLogger(ExpertsAddJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExpertsAddJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExpertsAddJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExpertsAddJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExpertsAddJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alTextField;
    private javax.swing.JButton deleteRecord;
    private com.toedter.calendar.JDateChooser doeDateChooser;
    private javax.swing.JTextField edgreeTextField;
    private javax.swing.JLabel education_level;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton saveRecord;
    private javax.swing.JTextField spTextField;
    // End of variables declaration//GEN-END:variables
}
