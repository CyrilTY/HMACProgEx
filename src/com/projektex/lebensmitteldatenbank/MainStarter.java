/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projektex.lebensmitteldatenbank;

/**
 *
 * @author hamzasincanoglu
 */
public class MainStarter {

    public static void main(String[] args) {
        /*SignUp anmelden = new SignUp();
        anmelden.setVisible(true);
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }

        });
    }
}
