/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cms;

import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import report.methods.ReportView;

/**
 *
 * @author anas almograbi
 */
public class ExportEditpanal extends javax.swing.JFrame {

    /**
     * Creates new form ExportEditpanal
     */
    private static final Logger LOGGER = Logger.getLogger(ExportAddpanal.class.getName());
    public ExportEditpanal() {
        initComponents();
        this.setTitle("ExportEditpanal");
        this.setSize(500,420);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setLocationRelativeTo(null);
       this.setVisible(true); 
       this.setResizable(false);
       dataload();
    }
    
    void dataload(){
        ArrayList<ResultSet> tables_db = db.dataload("import");
        ResultSet im = tables_db.get(0);
        try{
            Vector v = new Vector();
            
           //agencies combo box loadeer
           
            while(im.next()){
                v.add(im.getString("id"));
                DefaultComboBoxModel dc = new DefaultComboBoxModel(v);
                importIdComboBox.setModel(dc);
            }
            
            String empty = " ";
            importIdComboBox.addItem(empty);
            
            for (int i = 0; i < importIdComboBox.getItemCount(); i++) {
                    if (importIdComboBox.getItemAt(i).equals(empty)) {
                        // Set the selected index to the index of the matching item
                        importIdComboBox.setSelectedIndex(i);
                        break;
                    }
                }
            im.close();
            
        }catch(SQLException ex){
            LOGGER.log(Level.SEVERE, "An error occurred during login: {0}", ex);
            CmsLogger.log(ex.getMessage());
            JOptionPane.showMessageDialog(null, "error: " + ex.getMessage() + "!", "خطأ!", JOptionPane.ERROR_MESSAGE);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        importIdComboBox = new javax.swing.JComboBox<>();
        exportIdTextField = new javax.swing.JTextField();
        exDateChooser = new com.toedter.calendar.JDateChooser();
        editButton = new javax.swing.JButton();
        returnButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("الصادر");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(151, 6, 205, 36);

        jLabel5.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel5.setText("تاريخ الصادر :  ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(280, 220, 120, 30);

        jLabel6.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel6.setText("رقم الصادر  :   ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(290, 80, 120, 30);

        jLabel7.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel7.setText("الرقم الوارد  : ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(290, 150, 120, 30);
        getContentPane().add(importIdComboBox);
        importIdComboBox.setBounds(60, 150, 200, 30);

        exportIdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportIdTextFieldActionPerformed(evt);
            }
        });
        exportIdTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                exportIdTextFieldKeyPressed(evt);
            }
        });
        getContentPane().add(exportIdTextField);
        exportIdTextField.setBounds(60, 80, 200, 30);
        getContentPane().add(exDateChooser);
        exDateChooser.setBounds(60, 220, 190, 30);

        editButton.setBackground(new java.awt.Color(0, 0, 0));
        editButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        editButton.setForeground(new java.awt.Color(255, 255, 255));
        editButton.setText("تعديل السجل");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });
        getContentPane().add(editButton);
        editButton.setBounds(320, 280, 130, 50);

        returnButton.setBackground(new java.awt.Color(0, 0, 0));
        returnButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        returnButton.setForeground(new java.awt.Color(255, 255, 255));
        returnButton.setText("رجوع");
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });
        getContentPane().add(returnButton);
        returnButton.setBounds(180, 280, 130, 50);

        deleteButton.setBackground(new java.awt.Color(0, 0, 0));
        deleteButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("حذف السجل");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(deleteButton);
        deleteButton.setBounds(40, 280, 130, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exportIdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportIdTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exportIdTextFieldActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
        String eid = exportIdTextField.getText();
        String iid = importIdComboBox.getSelectedItem().toString();
        String sql = "UPDATE export SET `i_id`=?, `date`=? WHERE id=?";
        
        try{
            SimpleDateFormat inputFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.ENGLISH);
            SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");
            String imdate = outputFormat.format(inputFormat.parse(exDateChooser.getDate().toString()));
            PreparedStatement pstmt = db.mycon().prepareStatement(sql);
            pstmt.setString(1, iid);
            pstmt.setString(2, imdate);
            pstmt.setString(3, eid);
            pstmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "تم تعديل!");
        }catch(SQLException | ParseException ex){
            LOGGER.log(Level.SEVERE, "An error occurred during login: {0}", ex);
            CmsLogger.log(ex.getMessage());
            JOptionPane.showMessageDialog(null, "error: " + ex.getMessage() + "!", "خطأ!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        // TODO add your handling code here:
         new Home().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_returnButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void exportIdTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_exportIdTextFieldKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            String eid = exportIdTextField.getText();
            String query = "SELECT * FROM `export` WHERE `id`=?";
            try{
            PreparedStatement pstmt = db.mycon().prepareStatement(query);
            pstmt.setString(1, eid);
            ResultSet rs = pstmt.executeQuery();

            if(rs.next()){
                exDateChooser.setDate(rs.getDate("date"));
                                
                 // Retrieve the iid value from the ResultSet
                String iid = rs.getString("i_id");

                // Loop through the items in the catgoryComboBox to find the index of the matching item
                for (int i = 0; i < importIdComboBox.getItemCount(); i++) {
                    if (importIdComboBox.getItemAt(i).equals(iid)) {
                        // Set the selected index to the index of the matching item
                        importIdComboBox.setSelectedIndex(i);
                        break;
                    }
                }
                
            }else{
                String empty = " ";
                for (int i = 0; i < importIdComboBox.getItemCount(); i++) {
                    if (importIdComboBox.getItemAt(i).equals(empty)) {
                        // Set the selected index to the index of the matching item
                        importIdComboBox.setSelectedIndex(i);
                        break;
                    }
                }
                exDateChooser.setDate(null);
            }
            
            
            rs.close();
            pstmt.close();
        }catch(SQLException ex){
            LOGGER.log(Level.SEVERE, "An error occurred during login: {0}", ex);
            CmsLogger.log(ex.getMessage());
            JOptionPane.showMessageDialog(null, "error: " + ex.getMessage() + "!", "خطأ!", JOptionPane.ERROR_MESSAGE);
        }
        }
    }//GEN-LAST:event_exportIdTextFieldKeyPressed

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
            java.util.logging.Logger.getLogger(ExportEditpanal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExportEditpanal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExportEditpanal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExportEditpanal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExportEditpanal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private com.toedter.calendar.JDateChooser exDateChooser;
    private javax.swing.JTextField exportIdTextField;
    private javax.swing.JComboBox<String> importIdComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton returnButton;
    // End of variables declaration//GEN-END:variables
}
