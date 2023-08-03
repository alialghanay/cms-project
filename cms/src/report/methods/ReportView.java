/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package report.methods;

import cms.db;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author wow
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */









public class ReportView extends JFrame implements Runnable{
    private String fileName;
    private HashMap para;
    
    public ReportView(String fileName) throws SQLException, JRException
    {
        this(fileName, null);
        this.fileName = fileName;
    }
   
    
    
    public ReportView(String fileName, HashMap para)
    {
        this.fileName = fileName;
        this.para = para;
    }
    
    /**
     *
     * @throws SQLException
     * @throws JRException
     */
    @Override
    public void run() {
        Connection con =  db.mycon();
        JasperReport jr;
         JasperPrint print;
        try {
            jr = JasperCompileManager.compileReport(fileName);
            print = JasperFillManager.fillReport(jr, para, con);
            JasperViewer.viewReport(print, false);
            con.close();
        } catch (JRException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "error: "+ex+"!","خطأ!", JOptionPane.ERROR_MESSAGE);
            System.out.println(ex);
            Logger.getLogger(ReportView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
}
