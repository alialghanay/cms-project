/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package cms;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import report.methods.ReportView;

/**
 *
 * @author HP
 */
public class ImportEditPanel extends javax.swing.JPanel {
    
    private int id;
    private Calendar calendar = Calendar.getInstance();
    private Date currentDate = calendar.getTime();
    private static final Logger LOGGER = Logger.getLogger(ExportTablePanel.class.getName());
    /**
     * Creates new form ImportPanel
     */
    public ImportEditPanel() {
        initComponents();
        dataload();
    }
    
    ImportEditPanel(int id){
        this();
        this.id = id;
    }
    
    private void dataload(){
        ArrayList<ResultSet> tables_db = db.dataload("agencies", "experts", "export", "import");
        ResultSet agencies = tables_db.get(0);
        ResultSet experts = tables_db.get(1);
        ResultSet ex = tables_db.get(2);
        ResultSet im = tables_db.get(3);
        ArrayList state = Lists.state();
        ArrayList catgory = Lists.catcgory();
        
        try{
            Vector v = new Vector();
            Vector v1 = new Vector();
            
           //agencies combo box loadeer
           
            while(agencies.next()){
                v.add(agencies.getString("A_name"));
                DefaultComboBoxModel dc = new DefaultComboBoxModel(v);
                agComboBox.setModel(dc);
            }
            
            // agencies combo box loader
            
            while(experts.next()){
                v1.add(experts.getString("name"));
                DefaultComboBoxModel dc = new DefaultComboBoxModel(v1);
                expertComboBox.setModel(dc);
            }
            
            
            
            // adding state list
            
            for(int i = 0; i < state.size(); i++){
                stateComboBox.addItem(state.get(i).toString());
            }
            
            // adding cotgary list
           
            for(int i = 0; i < catgory.size(); i++){
                catgoryComboBox.addItem(catgory.get(i).toString());
            }
            
            agencies.close();
            experts.close();
            ex.close();
            im.close();
            
        }catch(SQLException e){
            LOGGER.log(Level.SEVERE, "An error occurred during login: {0}", e);
            CmsLogger.log(e.getMessage());
            JOptionPane.showMessageDialog(null, "error: " + e.getMessage() + "!", "خطأ!", JOptionPane.ERROR_MESSAGE);
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

        jPanel1 = new javax.swing.JPanel();
        caseNumTextField = new javax.swing.JTextField();
        stateComboBox = new javax.swing.JComboBox<>();
        stateLabel = new javax.swing.JLabel();
        importNumLabel = new javax.swing.JLabel();
        caseNumLabel = new javax.swing.JLabel();
        exportNumLabel = new javax.swing.JLabel();
        importDateLabel = new javax.swing.JLabel();
        catgoryComboBox = new javax.swing.JComboBox<>();
        catgoryLabel = new javax.swing.JLabel();
        exportNum = new javax.swing.JLabel();
        importNumTextField = new javax.swing.JTextField();
        importDateChooser = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        agComboBox = new javax.swing.JComboBox<>();
        expertComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        fileInfoTextArea = new javax.swing.JTextArea();
        agLabel = new javax.swing.JLabel();
        exportLabel = new javax.swing.JLabel();
        fileInfoLabel = new javax.swing.JLabel();
        noteLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        noteTextArea = new javax.swing.JTextArea();
        idAglabel = new javax.swing.JLabel();
        idExportLebel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        deleteCaseButton = new javax.swing.JButton();
        editCaseButton = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(1008, 497));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        stateLabel.setText("الحالة:");

        importNumLabel.setText("رقم الوارد:");

        caseNumLabel.setText("رقم القضية:");

        exportNumLabel.setText("رقم الصادر:");

        importDateLabel.setText("تاريخ الورود:");

        catgoryLabel.setText("التصنيف:");

        exportNum.setText("0");

        importNumTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                importNumTextFieldKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(importDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(importDateLabel)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(exportNum)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exportNumLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(caseNumTextField))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 39, Short.MAX_VALUE)
                        .addComponent(stateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(stateLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(catgoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(catgoryLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(caseNumLabel)
                        .addGap(24, 24, 24)
                        .addComponent(importNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(importNumLabel)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(importNumLabel)
                            .addComponent(caseNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(caseNumLabel)
                            .addComponent(exportNumLabel)
                            .addComponent(exportNum)
                            .addComponent(importNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(catgoryLabel)
                            .addComponent(catgoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stateLabel)
                            .addComponent(stateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(importDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(importDateLabel))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        agComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agComboBoxActionPerformed(evt);
            }
        });

        expertComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expertComboBoxActionPerformed(evt);
            }
        });

        fileInfoTextArea.setColumns(20);
        fileInfoTextArea.setRows(5);
        jScrollPane1.setViewportView(fileInfoTextArea);

        agLabel.setText("جهة التكليف:");

        exportLabel.setText("الخبير المكلف:");

        fileInfoLabel.setText("محتويات الملف:");

        noteLabel.setText("ملاحظات + إجراءات");

        noteTextArea.setColumns(20);
        noteTextArea.setRows(5);
        jScrollPane2.setViewportView(noteTextArea);

        idAglabel.setText("0");

        idExportLebel.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(noteLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(idAglabel)
                                    .addComponent(agComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(agLabel))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(idExportLebel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(expertComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(exportLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 636, Short.MAX_VALUE)
                            .addComponent(fileInfoLabel))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 976, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agLabel)
                    .addComponent(agComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idAglabel)
                    .addComponent(idExportLebel))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noteLabel)
                .addContainerGap(168, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(exportLabel)
                        .addComponent(expertComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(fileInfoLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("الوارد");

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        deleteCaseButton.setText("حذف الوارد");
        deleteCaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCaseButtonActionPerformed(evt);
            }
        });

        editCaseButton.setText("تعديل الوارد");
        editCaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editCaseButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deleteCaseButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                .addComponent(editCaseButton)
                .addGap(15, 15, 15))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteCaseButton)
                    .addComponent(editCaseButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(320, 320, 320))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void deleteCaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCaseButtonActionPerformed
       String cid = importNumTextField.getText();
        String query = "DELETE FROM `import` WHERE `id`=?";

        try{
            PreparedStatement pstmt = db.mycon().prepareStatement(query);
            pstmt.setString(1, cid);
            pstmt.executeUpdate();

            pstmt.close();
        }catch(SQLException ex){
            LOGGER.log(Level.SEVERE, "An error occurred during login: {0}", ex);
            CmsLogger.log(ex.getMessage());
            JOptionPane.showMessageDialog(null, "error: " + ex.getMessage() + "!", "خطأ!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_deleteCaseButtonActionPerformed

    private void editCaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editCaseButtonActionPerformed
        // TODO add your handling code here:
         // TODO add your handling code here:
         
        String caseNum = caseNumTextField.getText();
        String state = stateComboBox.getSelectedItem().toString();
        String catgory = catgoryComboBox.getSelectedItem().toString();
        int idAgence = Integer.parseInt(idAglabel.getText());
        int idExpert = Integer.parseInt(idExportLebel.getText());
        String fileInfo = fileInfoTextArea.getText();
        String notes = noteTextArea.getText();
        String iid = importNumTextField.getText();
        String sql = "UPDATE `import` SET date=?, c_n=?, A_id=?, e_id=?, category=?, file_info=?, notes=?, state=? WHERE id=?";
        try{
            
            SimpleDateFormat inputFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.ENGLISH);
            SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");
            String imdate = outputFormat.format(inputFormat.parse(importDateChooser.getDate().toString()));
            PreparedStatement pstmt = db.mycon().prepareStatement(sql);
            pstmt.setString(1, imdate);
            pstmt.setString(2, caseNum);
            pstmt.setInt(3, idAgence);
            pstmt.setInt(4, idExpert);
            pstmt.setString(5, catgory);
            pstmt.setString(6, fileInfo);
            pstmt.setString(7, notes);
            pstmt.setString(8, state);
            pstmt.setString(9, iid);
            pstmt.executeUpdate();
            
        }catch(SQLException | ParseException ex){
           LOGGER.log(Level.SEVERE, "An error occurred during login: {0}", ex);
            CmsLogger.log(ex.getMessage());
            JOptionPane.showMessageDialog(null, "error: " + ex.getMessage() + "!", "خطأ!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_editCaseButtonActionPerformed

    private void agComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agComboBoxActionPerformed
        // TODO add your handling code here:
         String agence = agComboBox.getSelectedItem().toString();
         String sql = "SELECT id FROM agencies WHERE `A_name`='"+agence+"'";
         try{
             Statement stmt = db.mycon().createStatement();
             ResultSet rs = stmt.executeQuery(sql);
             if(rs.next()){
                idAglabel.setText(rs.getString("id"));
             }else{
                 idAglabel.setText("0");
             }
         }catch(SQLException ex){
            LOGGER.log(Level.SEVERE, "An error occurred during login: {0}", ex);
            CmsLogger.log(ex.getMessage());
            JOptionPane.showMessageDialog(null, "error: " + ex.getMessage() + "!", "خطأ!", JOptionPane.ERROR_MESSAGE);
         }
    }//GEN-LAST:event_agComboBoxActionPerformed

    private void expertComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expertComboBoxActionPerformed
          // TODO add your handling code here:
        String expert = expertComboBox.getSelectedItem().toString();
        String sql = "SELECT id FROM experts WHERE `name`='"+expert+"'";
        try{
             Statement stmt = db.mycon().createStatement();
             ResultSet rs = stmt.executeQuery(sql);
             if(rs.next()){
                idExportLebel.setText(rs.getString("id"));
             }else{
                 idExportLebel.setText("0");
             }
         }catch(SQLException ex){
            LOGGER.log(Level.SEVERE, "An error occurred during login: {0}", ex);
            CmsLogger.log(ex.getMessage());
            JOptionPane.showMessageDialog(null, "error: " + ex.getMessage() + "!", "خطأ!", JOptionPane.ERROR_MESSAGE);
         }
    }//GEN-LAST:event_expertComboBoxActionPerformed

    private void importNumTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_importNumTextFieldKeyPressed
         // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
          String id = importNumTextField.getText();
          String query = "SELECT * FROM `import` WHERE `id`=?";
        try{
            PreparedStatement pstmt = db.mycon().prepareStatement(query);
            pstmt.setString(1, id);
            ResultSet rs = pstmt.executeQuery();

            if(rs.next()){
                importDateChooser.setDate(rs.getDate("date"));
                caseNumTextField.setText(rs.getString("c_n"));
                idAglabel.setText(rs.getString("A_id"));
                idExportLebel.setText(rs.getString("e_id"));
                
                 // Retrieve the category value from the ResultSet
                String category = rs.getString("category");

                // Loop through the items in the catgoryComboBox to find the index of the matching item
                for (int i = 0; i < catgoryComboBox.getItemCount(); i++) {
                    if (catgoryComboBox.getItemAt(i).equals(category)) {
                        // Set the selected index to the index of the matching item
                        catgoryComboBox.setSelectedIndex(i);
                        break;
                    }
                }
                fileInfoTextArea.setText(rs.getString("file_info"));
                noteTextArea.setText(rs.getString("notes"));
                stateComboBox.setSelectedItem(rs.getString("state"));
            }else{
                caseNumTextField.setText("");
                idAglabel.setText("0");
                idExportLebel.setText("0");
                fileInfoTextArea.setText("");
                noteTextArea.setText("");
                importDateChooser.setDate(null);
            }
            
            
            rs.close();
            pstmt.close();
        }catch(SQLException ex){
            LOGGER.log(Level.SEVERE, "An error occurred during login: {0}", ex);
            CmsLogger.log(ex.getMessage());
            JOptionPane.showMessageDialog(null, "error: " + ex.getMessage() + "!", "خطأ!", JOptionPane.ERROR_MESSAGE);
        }
        
       if (!idExportLebel.getText().equals("0")) {
        String eid = idExportLebel.getText();
        String sql = "SELECT * FROM experts WHERE id=?";
        try {
            PreparedStatement pstmt = db.mycon().prepareStatement(sql);
            pstmt.setString(1, eid);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                String experts  = rs.getString("name");
                // Loop through the items in the catgoryComboBox to find the index of the matching item
                for (int i = 0; i < expertComboBox.getItemCount(); i++) {
                    if (expertComboBox.getItemAt(i).equals(experts)) {
                        // Set the selected index to the index of the matching item
                        expertComboBox.setSelectedIndex(i);
                        break;
                    }
                }
            }
            rs.close();
            pstmt.close();
        } catch (SQLException ex) {
            LOGGER.log(Level.SEVERE, "An error occurred during login: {0}", ex);
            CmsLogger.log(ex.getMessage());
            JOptionPane.showMessageDialog(null, "error: " + ex.getMessage() + "!", "خطأ!", JOptionPane.ERROR_MESSAGE);
        }
    }

        
        
               if (!idAglabel.getText().equals("0")) {
        String aid = idAglabel.getText();
        String sql = "SELECT * FROM agencies WHERE id=?";
        try {
                PreparedStatement pstmt = db.mycon().prepareStatement(sql);
                pstmt.setString(1, aid);
                ResultSet rs = pstmt.executeQuery();
                if (rs.next()) {
                    String agencies  = rs.getString("A_name");

                    // Loop through the items in the catgoryComboBox to find the index of the matching item
                    for (int i = 0; i < agComboBox.getItemCount(); i++) {
                        if (agComboBox.getItemAt(i).equals(agencies)) {
                            // Set the selected index to the index of the matching item
                            agComboBox.setSelectedIndex(i);
                            break;
                        }
                    }
                }
                rs.close();
                pstmt.close();
            } catch (SQLException ex) {
                LOGGER.log(Level.SEVERE, "An error occurred during login: {0}", ex);
                CmsLogger.log(ex.getMessage());
                JOptionPane.showMessageDialog(null, "error: " + ex.getMessage() + "!", "خطأ!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    }//GEN-LAST:event_importNumTextFieldKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> agComboBox;
    private javax.swing.JLabel agLabel;
    private javax.swing.JLabel caseNumLabel;
    private javax.swing.JTextField caseNumTextField;
    private javax.swing.JComboBox<String> catgoryComboBox;
    private javax.swing.JLabel catgoryLabel;
    private javax.swing.JButton deleteCaseButton;
    private javax.swing.JButton editCaseButton;
    private javax.swing.JComboBox<String> expertComboBox;
    private javax.swing.JLabel exportLabel;
    private javax.swing.JLabel exportNum;
    private javax.swing.JLabel exportNumLabel;
    private javax.swing.JLabel fileInfoLabel;
    private javax.swing.JTextArea fileInfoTextArea;
    private javax.swing.JLabel idAglabel;
    private javax.swing.JLabel idExportLebel;
    private com.toedter.calendar.JDateChooser importDateChooser;
    private javax.swing.JLabel importDateLabel;
    private javax.swing.JLabel importNumLabel;
    private javax.swing.JTextField importNumTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel noteLabel;
    private javax.swing.JTextArea noteTextArea;
    private javax.swing.JComboBox<String> stateComboBox;
    private javax.swing.JLabel stateLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}