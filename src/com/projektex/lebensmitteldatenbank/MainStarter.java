/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projektex.lebensmitteldatenbank;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author hamzasincanoglu
 */
public class MainStarter {
    public static DbTable db;

    public static void main(String[] args) {
        /*SignUp anmelden = new SignUp();
        anmelden.setVisible(true);
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                int check = 0;
                while(check == 0){
                    JTextField name = new JTextField("root");
                    JPasswordField pw = new JPasswordField();
                    Object[] message = {"DB-Username: ", name, "DB-Password: ", pw};
                    Object[] options = {"OK", "Cancel"};
                    int option = JOptionPane.showOptionDialog(null, message, "MySQL-Connection", 1, 1, null,options, "OK");
                    if (option == JOptionPane.OK_OPTION) {
                        try {
                            db = new DbTable(name.getText(), pw.getPassword());
                            if (db.getConnection() != null){
                                check = 1;
                                new SignUp().setVisible(true);
                            }
                        }
                        catch (HeadlessException e) {
                            JOptionPane.showMessageDialog(null, "Can't connect to DB", "DB-Connection", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                    else{
                        System.exit(0);
                    }    
                }              
            }

        });
    }
}
