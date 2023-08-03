/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cms;

import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Authenticator;
import javax.mail.Message;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
/**
 *
 * @author HP
 */
public class sendMail {
    private static final Logger LOGGER = Logger.getLogger(sendMail.class.getName());
    public static void send(String recepient, String msg){
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        
        String myAccountEmail = "hpnutsly@gmail.com";
        String password = "loefnqtgvyajrkjj";
        
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myAccountEmail, password);
            }
        });
        Message m = preparMessage(session, myAccountEmail, recepient, msg);
        
        try {
            Transport.send(m);
            JOptionPane.showMessageDialog(null, "Email Sended succsafily!");
        } catch (MessagingException ex) {
            LOGGER.log(Level.SEVERE, "An error occurred during login: {0}", ex);
            CmsLogger.log(ex.getMessage());
            JOptionPane.showMessageDialog(null, "error: " + ex.getMessage() + "!", "خطأ!", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static Message preparMessage(Session session, String myAccountEmail, String recepient, String msg){
        Message m = new MimeMessage(session);
            try {
                m.setFrom(new InternetAddress(myAccountEmail));
                m.setRecipient(RecipientType.TO, new InternetAddress(recepient));
                m.setSubject("منظومة الخبرة القضائية");
                m.setText(msg);
                return m;
            } catch (MessagingException ex) {
                LOGGER.log(Level.SEVERE, "An error occurred during login: {0}", ex);
                CmsLogger.log(ex.getMessage());
                JOptionPane.showMessageDialog(null, "error: " + ex.getMessage() + "!", "خطأ!", JOptionPane.ERROR_MESSAGE);
            }
            return null;
    }
}
