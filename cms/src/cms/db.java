/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cms;

import java.io.File;
import java.io.IOException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author HP
 */
public class db {
    private String[] tables = {"agencies", "experts", "export", "import", "user"};
    private static final Logger LOGGER = Logger.getLogger(db.class.getName());
    
    public static Connection mycon(){
        
        Connection con;

     try {
         
         Class.forName("com.mysql.cj.jdbc.Driver");
         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cms_db","root","1234");
 
         return con;
         
         
     } catch (ClassNotFoundException | SQLException e) {
         
         System.out.println(e);
         return null;
     }
 
    }
 public static void backupDatabase() {
        try {
            String backupFileName = "backup_" + getCurrentDate() + ".sql";
            String currentPath = System.getProperty("user.dir");
            
            ProcessBuilder processBuilder = new ProcessBuilder(
                    "C:\\Program Files\\MySQL\\MySQL Server 8.0\\bin\\mysqldump",
                    "-uroot",
                    "-p1234",
                    "cms_db"
            );
            
            // Set the output file
            processBuilder.redirectOutput(ProcessBuilder.Redirect.to(new File(currentPath + "\\" + backupFileName)));
            
            // Start the process
            Process process = processBuilder.start();
            
            // Wait for the process to complete
            int exitCode = process.waitFor();
            
            if (exitCode == 0) {
                JOptionPane.showMessageDialog(null, "Data saved succsafily!");
            } else {
                CmsLogger.log("Database backup failed.");
                JOptionPane.showMessageDialog(null, "error: " + "Database backup failed." + "!", "خطأ!", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException | InterruptedException ex) {
            LOGGER.log(Level.SEVERE, "An error occurred during login: {0}", ex);
            CmsLogger.log(ex.getMessage());
            JOptionPane.showMessageDialog(null, "error: " + ex.getMessage() + "!", "خطأ!", JOptionPane.ERROR_MESSAGE);
        }
    }
 
    private static String getCurrentDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        return dateFormat.format(new Date());
    }
    
    public static void truncateTables() {
        Connection connection = null;
        Statement statement = null;
        
        try {
            // Get the database connection
            connection = mycon();
            
            // Disable foreign key checks
            String disableForeignKeyCheck = "SET FOREIGN_KEY_CHECKS=0";
            statement = connection.createStatement();
            statement.execute(disableForeignKeyCheck);
            statement.close();
            
            // Reset auto-increment values for each table
            String[] tables = {"agencies", "experts", "export", "import", "user"};
            
            for (String table : tables) {
                statement = connection.createStatement();
                
                // Truncate table
                String truncateTable = "TRUNCATE TABLE " + table;
                statement.execute(truncateTable);
                
                // Reset auto-increment value
                String resetAutoIncrement = "ALTER TABLE " + table + " AUTO_INCREMENT = 1";
                statement.execute(resetAutoIncrement);
                
                statement.close();
            }
            statement = connection.createStatement();
            
            statement.executeUpdate("INSERT INTO `user`.`cms_db` (`name`, `password`, `is_admin`) VALUES ('admin', 'admin', '1')");
                
            statement.close();
            
            // Enable foreign key checks
            String enableForeignKeyCheck = "SET FOREIGN_KEY_CHECKS=1";
            statement = connection.createStatement();
            statement.execute(enableForeignKeyCheck);
            statement.close();
            
            System.out.println("All tables truncated successfully.");
            
        } catch (SQLException ex) {
            System.out.println("Failed to truncate tables: " + ex.getMessage());
            
        } finally {
            // Close the statement and connection
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException closeEx) {
                    System.out.println("Failed to close statement: " + closeEx.getMessage());
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException closeEx) {
                    System.out.println("Failed to close connection: " + closeEx.getMessage());
                }
            }
        }
    }
    
    public static ArrayList dataload(String ...args){
        ResultSet rs;
        Statement stmt;
        ArrayList<ResultSet> dataList = new ArrayList<ResultSet>();
        try {
         for(String arg : args){
             String sql = "SELECT * FROM " + arg;
            stmt = mycon().createStatement();
            rs = stmt.executeQuery(sql);
            dataList.add(rs);
        }
        }catch(SQLException ex){
           JOptionPane.showMessageDialog(null, "error: "+ex+"!","خطأ!", JOptionPane.ERROR_MESSAGE);
        }
        return dataList;
    }
}
