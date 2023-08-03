/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cms;

import java.awt.HeadlessException;
import java.util.Calendar;
import java.util.Date;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToolBar;

/**
 *
 * @author HP
 */
public class Home extends javax.swing.JFrame {

    JpanelLoader jPanel = new JpanelLoader();
    private String username;
    private boolean is_admin;
    private int id;
    private Calendar calendar = Calendar.getInstance();
    private String currentDate = calendar.getTime().toString();

    /**
     * Creates new form Home
     *
     * @param is_admin
     * @param username
     */
    public Home() {
        initComponents();
    }

    Home(String username, boolean is_admin, int id) {
        this();
        this.username = username;
        this.is_admin = is_admin;
        this.id = id;
        dataload();
    }

    private void dataload() {
        usernameLabel.setText(username);
        dateLabel.setText(currentDate);
        newExpertMenuItem.setEnabled(is_admin);
        editExpertMenuItem.setEnabled(is_admin);
        editAgenciesMenuItem.setEnabled(is_admin);
        sginUpMenuItem.setEnabled(is_admin);
        factorySettingMenuItem.setEnabled(is_admin);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        agenciesNavButton = new javax.swing.JButton();
        expertNavButton = new javax.swing.JButton();
        exportNavButton = new javax.swing.JButton();
        importNavButton = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        mainPanel1 = new javax.swing.JPanel();
        uLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        homeMenuBar = new javax.swing.JMenuBar();
        helpMenu = new javax.swing.JMenu();
        sginUpMenuItem = new javax.swing.JMenuItem();
        factorySettingMenuItem = new javax.swing.JMenuItem();
        backUpMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        infoMenu = new javax.swing.JMenu();
        sginOutMenuItem = new javax.swing.JMenuItem();
        techncalSportMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        newExpertMenuItem = new javax.swing.JMenuItem();
        editExpertMenuItem = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        newAgenciesMenuItem = new javax.swing.JMenuItem();
        editAgenciesMenuItem = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        editImportMenuItem = new javax.swing.JMenuItem();
        ExportEditMenuItem = new javax.swing.JMenuItem();
        ExportAddMenuItem = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        expertsTableMenuItem = new javax.swing.JMenuItem();
        agenciesTableMenuItem = new javax.swing.JMenuItem();
        importTableMenuItem = new javax.swing.JMenuItem();
        exportTableMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("منظومة الخبرة القاضئية");
        setMinimumSize(new java.awt.Dimension(1024, 600));
        setName("home"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1056, 614));
        setSize(new java.awt.Dimension(1056, 614));
        getContentPane().setLayout(null);

        jToolBar1.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jToolBar1.add(Box.createHorizontalGlue());
        jToolBar1.setRollover(true);
        jToolBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        agenciesNavButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        agenciesNavButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cms/img/agencies.png"))); // NOI18N
        agenciesNavButton.setText("الهيئات");
        agenciesNavButton.setFocusable(false);
        agenciesNavButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        agenciesNavButton.setMargin(new java.awt.Insets(10, 85, 10, 85));
        agenciesNavButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agenciesNavButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(agenciesNavButton);

        expertNavButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        expertNavButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cms/img/expert.png"))); // NOI18N
        expertNavButton.setText("الخبراء");
        expertNavButton.setFocusable(false);
        expertNavButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        expertNavButton.setMargin(new java.awt.Insets(10, 85, 10, 85));
        expertNavButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expertNavButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(expertNavButton);

        exportNavButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        exportNavButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cms/img/export.png"))); // NOI18N
        exportNavButton.setText("الصادر");
        exportNavButton.setFocusable(false);
        exportNavButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        exportNavButton.setMargin(new java.awt.Insets(10, 85, 10, 85));
        exportNavButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportNavButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(exportNavButton);

        importNavButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        importNavButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cms/img/import.png"))); // NOI18N
        importNavButton.setText("الوارد");
        importNavButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        importNavButton.setFocusable(false);
        importNavButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        importNavButton.setMargin(new java.awt.Insets(10, 85, 10, 85));
        importNavButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importNavButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(importNavButton);

        getContentPane().add(jToolBar1);
        jToolBar1.setBounds(0, 0, 1040, 51);

        mainPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        mainPanel.setMinimumSize(new java.awt.Dimension(1008, 497));
        mainPanel.setPreferredSize(new java.awt.Dimension(1008, 497));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1036, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 496, Short.MAX_VALUE)
        );

        getContentPane().add(mainPanel);
        mainPanel.setBounds(0, 50, 1040, 500);

        mainPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        mainPanel1.setMinimumSize(new java.awt.Dimension(1008, 497));

        uLabel.setText("اسم المستخدم:");

        usernameLabel.setText("علي محمد الغناي");

        dateLabel.setText("2023/07/20 5:00 .........");

        javax.swing.GroupLayout mainPanel1Layout = new javax.swing.GroupLayout(mainPanel1);
        mainPanel1.setLayout(mainPanel1Layout);
        mainPanel1Layout.setHorizontalGroup(
            mainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanel1Layout.createSequentialGroup()
                .addComponent(dateLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 754, Short.MAX_VALUE)
                .addComponent(usernameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        mainPanel1Layout.setVerticalGroup(
            mainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(uLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(usernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(mainPanel1);
        mainPanel1.setBounds(0, 550, 1040, 20);

        homeMenuBar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        homeMenuBar.setToolTipText("");
        homeMenuBar.add(Box.createHorizontalGlue());
        homeMenuBar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        homeMenuBar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        homeMenuBar.setName(""); // NOI18N

        helpMenu.setText("إعدادات");
        helpMenu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        helpMenu.setMargin(new java.awt.Insets(3, 9, 3, 9));

        sginUpMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        sginUpMenuItem.setText("تسجيل موظف");
        sginUpMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sginUpMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(sginUpMenuItem);

        factorySettingMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        factorySettingMenuItem.setText("إعدادات المصنع");
        factorySettingMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factorySettingMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(factorySettingMenuItem);

        backUpMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        backUpMenuItem.setText("حفظ نسخ احتياطية");
        backUpMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backUpMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(backUpMenuItem);
        helpMenu.add(jSeparator1);

        infoMenu.setText("مساعدة؟");

        sginOutMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        sginOutMenuItem.setText("تسجيل الخروج");
        sginOutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sginOutMenuItemActionPerformed(evt);
            }
        });
        infoMenu.add(sginOutMenuItem);

        techncalSportMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        techncalSportMenuItem.setText("طلب دعم فني");
        techncalSportMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                techncalSportMenuItemActionPerformed(evt);
            }
        });
        infoMenu.add(techncalSportMenuItem);

        helpMenu.add(infoMenu);

        homeMenuBar.add(helpMenu);

        editMenu.setText("تعديل");
        editMenu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        editMenu.setMargin(new java.awt.Insets(6, 9, 6, 9));

        newExpertMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        newExpertMenuItem.setText("خبير جديد");
        newExpertMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newExpertMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(newExpertMenuItem);

        editExpertMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_DOWN_MASK));
        editExpertMenuItem.setText("تعديل/حذف خبير");
        editExpertMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editExpertMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(editExpertMenuItem);
        editMenu.add(jSeparator2);

        newAgenciesMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        newAgenciesMenuItem.setText("هيئة جديدة");
        newAgenciesMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newAgenciesMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(newAgenciesMenuItem);

        editAgenciesMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_DOWN_MASK));
        editAgenciesMenuItem.setText("تعديل/حذف هيئة");
        editAgenciesMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editAgenciesMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(editAgenciesMenuItem);
        editMenu.add(jSeparator3);

        editImportMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_DOWN_MASK));
        editImportMenuItem.setText("تعديل/حذف قضية واردة");
        editImportMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editImportMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(editImportMenuItem);

        ExportEditMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_DOWN_MASK));
        ExportEditMenuItem.setText("تعديل/حذف قضية صادرة");
        ExportEditMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportEditMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(ExportEditMenuItem);

        ExportAddMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        ExportAddMenuItem.setText("إضافة قضية صادرة");
        ExportAddMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportAddMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(ExportAddMenuItem);

        homeMenuBar.add(editMenu);

        jMenu3.setText("عرض");

        expertsTableMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        expertsTableMenuItem.setText("عرض سجل الخبراء");
        expertsTableMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expertsTableMenuItemActionPerformed(evt);
            }
        });
        jMenu3.add(expertsTableMenuItem);

        agenciesTableMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        agenciesTableMenuItem.setText("عرض سجل الهيئات");
        agenciesTableMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agenciesTableMenuItemActionPerformed(evt);
            }
        });
        jMenu3.add(agenciesTableMenuItem);

        importTableMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        importTableMenuItem.setText("عرض سجل الوارد");
        importTableMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importTableMenuItemActionPerformed(evt);
            }
        });
        jMenu3.add(importTableMenuItem);

        exportTableMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        exportTableMenuItem.setText("عرض سجل الصادر");
        exportTableMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportTableMenuItemActionPerformed(evt);
            }
        });
        jMenu3.add(exportTableMenuItem);

        homeMenuBar.add(jMenu3);

        setJMenuBar(homeMenuBar);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void importNavButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importNavButtonActionPerformed
        // TODO add your handling code here:
        ImportAddPanel ip = new ImportAddPanel(id);
        jPanel.jPanelLoader(mainPanel, ip);
    }//GEN-LAST:event_importNavButtonActionPerformed

    private void agenciesNavButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agenciesNavButtonActionPerformed
        // TODO add your handling code here:
        AgenciesTablePanel ap = new AgenciesTablePanel();
        jPanel.jPanelLoader(mainPanel, ap);
    }//GEN-LAST:event_agenciesNavButtonActionPerformed

    private void expertNavButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expertNavButtonActionPerformed
        // TODO add your handling code here:
        ExpertsTablePanel ep = new ExpertsTablePanel();
        jPanel.jPanelLoader(mainPanel, ep);
    }//GEN-LAST:event_expertNavButtonActionPerformed

    private void sginUpMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sginUpMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sginUpMenuItemActionPerformed

    private void editExpertMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editExpertMenuItemActionPerformed
        // TODO add your handling code here:
        ExpertsEditJFrame ap = new ExpertsEditJFrame();
        ap.setVisible(true);
    }//GEN-LAST:event_editExpertMenuItemActionPerformed

    private void techncalSportMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_techncalSportMenuItemActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_techncalSportMenuItemActionPerformed

    private void editImportMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editImportMenuItemActionPerformed
        // TODO add your handling code here:
        ImportEditPanel ap = new ImportEditPanel();
        jPanel.jPanelLoader(mainPanel, ap);
    }//GEN-LAST:event_editImportMenuItemActionPerformed

    private void ExportEditMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportEditMenuItemActionPerformed
        // TODO add your handling code here:
        ExportEditpanal ap = new ExportEditpanal();
        ap.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ExportEditMenuItemActionPerformed

    private void newAgenciesMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newAgenciesMenuItemActionPerformed
        // TODO add your handling code here:
        AgenciesAddPanel ap = new AgenciesAddPanel();
        jPanel.jPanelLoader(mainPanel, ap);

    }//GEN-LAST:event_newAgenciesMenuItemActionPerformed

    private void newExpertMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newExpertMenuItemActionPerformed
        // TODO add your handling code here:
        ExpertsAddJFrame ap = new ExpertsAddJFrame();
        ap.setVisible(true);
    }//GEN-LAST:event_newExpertMenuItemActionPerformed

    private void editAgenciesMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editAgenciesMenuItemActionPerformed
        // TODO add your handling code here:
        AgenciesEditPanel ap = new AgenciesEditPanel();
        jPanel.jPanelLoader(mainPanel, ap);
    }//GEN-LAST:event_editAgenciesMenuItemActionPerformed

    private void agenciesTableMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agenciesTableMenuItemActionPerformed
        // TODO add your handling code here:
        AgenciesTablePanel ap = new AgenciesTablePanel();
        jPanel.jPanelLoader(mainPanel, ap);
    }//GEN-LAST:event_agenciesTableMenuItemActionPerformed

    private void importTableMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importTableMenuItemActionPerformed
        // TODO add your handling code here:
        ImportTablePanel ap = new ImportTablePanel();
        jPanel.jPanelLoader(mainPanel, ap);
    }//GEN-LAST:event_importTableMenuItemActionPerformed

    private void exportTableMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportTableMenuItemActionPerformed
        // TODO add your handling code here:
        ExportTablePanel ap = new ExportTablePanel();
        jPanel.jPanelLoader(mainPanel, ap);
    }//GEN-LAST:event_exportTableMenuItemActionPerformed

    private void ExportAddMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportAddMenuItemActionPerformed
        // TODO add your handling code here:
        ExportAddpanal ap = new ExportAddpanal();
        ap.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ExportAddMenuItemActionPerformed

    private void exportNavButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportNavButtonActionPerformed
        // TODO add your handling code here:
        ExportTablePanel ap = new ExportTablePanel();
        jPanel.jPanelLoader(mainPanel, ap);
    }//GEN-LAST:event_exportNavButtonActionPerformed

    private void expertsTableMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expertsTableMenuItemActionPerformed
        // TODO add your handling code here:
        ExpertsTablePanel ep = new ExpertsTablePanel();
        jPanel.jPanelLoader(mainPanel, ep);
    }//GEN-LAST:event_expertsTableMenuItemActionPerformed

    private void factorySettingMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factorySettingMenuItemActionPerformed
        // TODO add your handling code here:
        int option = JOptionPane.showConfirmDialog(null, "هل حفا تريد مسح كل معلومات المنظومة؟", "Confirmation", JOptionPane.YES_NO_OPTION);
        
        if (option == JOptionPane.YES_OPTION) {
            db.truncateTables();
        } else {
            System.out.println("User clicked No");
        }
    }//GEN-LAST:event_factorySettingMenuItemActionPerformed

    private void backUpMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backUpMenuItemActionPerformed
        // TODO add your handling code here:
        db.backupDatabase();
    }//GEN-LAST:event_backUpMenuItemActionPerformed

    private void sginOutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sginOutMenuItemActionPerformed
        // TODO add your handling code here:
        new Login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_sginOutMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ExportAddMenuItem;
    private javax.swing.JMenuItem ExportEditMenuItem;
    private javax.swing.JButton agenciesNavButton;
    private javax.swing.JMenuItem agenciesTableMenuItem;
    private javax.swing.JMenuItem backUpMenuItem;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JMenuItem editAgenciesMenuItem;
    private javax.swing.JMenuItem editExpertMenuItem;
    private javax.swing.JMenuItem editImportMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JButton expertNavButton;
    private javax.swing.JMenuItem expertsTableMenuItem;
    private javax.swing.JButton exportNavButton;
    private javax.swing.JMenuItem exportTableMenuItem;
    private javax.swing.JMenuItem factorySettingMenuItem;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuBar homeMenuBar;
    private javax.swing.JButton importNavButton;
    private javax.swing.JMenuItem importTableMenuItem;
    private javax.swing.JMenu infoMenu;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel mainPanel1;
    private javax.swing.JMenuItem newAgenciesMenuItem;
    private javax.swing.JMenuItem newExpertMenuItem;
    private javax.swing.JMenuItem sginOutMenuItem;
    private javax.swing.JMenuItem sginUpMenuItem;
    private javax.swing.JMenuItem techncalSportMenuItem;
    private javax.swing.JLabel uLabel;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}