/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cms;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 *
 * @author HP
 */
public class CmsLogger {
    public static void log(String msg) {
        Logger logger = Logger.getLogger("MyLog");  
        FileHandler fh;  
        try {  
  
            fh = new FileHandler("C:/temp/cms/MyLogFile.log", true);  
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();  
            fh.setFormatter(formatter);  

              
            logger.info(msg);  

        } catch (SecurityException | IOException ex) {  
            Logger.getLogger(CmsLogger.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
}
