/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projektex.lebensmitteldatenbank;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;


/**
 *
 * @author hamzasincanoglu
 */
public class GuestLebensmittel extends javax.swing.JFrame {
        DbTable db = new DbTable();
    
    public GuestLebensmittel() {
        initComponents();
        showTable();
    }
    
     public void showTable(){
        try{
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            db.res = db.stat.executeQuery("SELECT * FROM Artikel");
            
            while(db.res.next()){
                String ID = db.res.getString(1);
                String ProduktName = db.res.getString(2);
                int Kalorien = db.res.getInt(3);
                int Gewicht = db.res.getInt(4);
                int Preis = db.res.getInt(5);
                
                Object[] content = {ID, ProduktName, Kalorien, Gewicht, Preis};
                DefaultTableModel model2 = (DefaultTableModel) jTable1.getModel();
                model2.addRow(content);
            }
            
        }catch(SQLException e) {
            
        }
    }
     public void orderPreis(){
        try{
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            
            db.res = db.stat.executeQuery("SELECT * FROM Artikel ORDER BY preis");
            
            while(db.res.next()){
                String ID = db.res.getString(1);
                String ProduktName = db.res.getString(2);
                int Kalorien = db.res.getInt(3);
                int Gewicht = db.res.getInt(4);
                int Preis = db.res.getInt(5);
                
                Object[] content = {ID, ProduktName, Kalorien, Gewicht, Preis};
                DefaultTableModel model2 = (DefaultTableModel) jTable1.getModel();
                model2.addRow(content);
                
            }
            
        }catch(SQLException e) {
            
        }
    }
     
      public void orderdescPreis(){
        try{
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            db.res = db.stat.executeQuery("SELECT * FROM Artikel ORDER BY preis desc");
            
            while(db.res.next()){
                String ID = db.res.getString(1);
                String ProduktName = db.res.getString(2);
                int Kalorien = db.res.getInt(3);
                int Gewicht = db.res.getInt(4);
                int Preis = db.res.getInt(5);
                
                Object[] content = {ID, ProduktName, Kalorien, Gewicht, Preis};
                DefaultTableModel model2 = (DefaultTableModel) jTable1.getModel();
                model2.addRow(content);
            }
            
        }catch(SQLException e) {
            
        }
    }

     public void orderKalorien(){
        try{
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            
            db.res = db.stat.executeQuery("SELECT * FROM Artikel ORDER BY Kalorien");
            
            while(db.res.next()){
                String ID = db.res.getString(1);
                String ProduktName = db.res.getString(2);
                int Kalorien = db.res.getInt(3);
                int Gewicht = db.res.getInt(4);
                int Preis = db.res.getInt(5);
                
                Object[] content = {ID, ProduktName, Kalorien, Gewicht, Preis};
                DefaultTableModel model2 = (DefaultTableModel) jTable1.getModel();
                model2.addRow(content);
                
            }
            
        }catch(SQLException e) {
            
        }
    } 
     
        public void orderdescKalorien(){
        try{
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            db.res = db.stat.executeQuery("SELECT * FROM Artikel ORDER BY Kalorien desc");
            
            while(db.res.next()){
                String ID = db.res.getString(1);
                String ProduktName = db.res.getString(2);
                int Kalorien = db.res.getInt(3);
                int Gewicht = db.res.getInt(4);
                int Preis = db.res.getInt(5);
                
                Object[] content = {ID, ProduktName, Kalorien, Gewicht, Preis};
                DefaultTableModel model2 = (DefaultTableModel) jTable1.getModel();
                model2.addRow(content);
            }
            
        }catch(SQLException e) {
            
        }
    }
    
     public void orderGewicht(){
        try{
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            
            db.res = db.stat.executeQuery("SELECT * FROM Artikel ORDER BY Gewicht");
            
            while(db.res.next()){
                String ID = db.res.getString(1);
                String ProduktName = db.res.getString(2);
                int Kalorien = db.res.getInt(3);
                int Gewicht = db.res.getInt(4);
                int Preis = db.res.getInt(5);
                
                Object[] content = {ID, ProduktName, Kalorien, Gewicht, Preis};
                DefaultTableModel model2 = (DefaultTableModel) jTable1.getModel();
                model2.addRow(content);
                
            }
            
        }catch(SQLException e) {
            
        }
    }
     
     
     public void orderdescGewicht(){
        try{
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            db.res = db.stat.executeQuery("SELECT * FROM Artikel ORDER BY Gewicht desc");
            
            while(db.res.next()){
                String ID = db.res.getString(1);
                String ProduktName = db.res.getString(2);
                int Kalorien = db.res.getInt(3);
                int Gewicht = db.res.getInt(4);
                int Preis = db.res.getInt(5);
                
                Object[] content = {ID, ProduktName, Kalorien, Gewicht, Preis};
                DefaultTableModel model2 = (DefaultTableModel) jTable1.getModel();
                model2.addRow(content);
            }
            
        }catch(SQLException e) {
            
        }
    }
     
      public void orderProduktname(){
        try{
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            
            db.res = db.stat.executeQuery("SELECT * FROM Artikel ORDER BY ProduktName");
            
            while(db.res.next()){
                String ID = db.res.getString(1);
                String ProduktName = db.res.getString(2);
                int Kalorien = db.res.getInt(3);
                int Gewicht = db.res.getInt(4);
                int Preis = db.res.getInt(5);
                
                Object[] content = {ID, ProduktName, Kalorien, Gewicht, Preis};
                DefaultTableModel model2 = (DefaultTableModel) jTable1.getModel();
                model2.addRow(content);
                
            }
            
        }catch(SQLException e) {
            
        }
    }
      
      public void orderdescProduktname(){
        try{
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            db.res = db.stat.executeQuery("SELECT * FROM Artikel ORDER BY ProduktName desc");
            
            while(db.res.next()){
                String ID = db.res.getString(1);
                String ProduktName = db.res.getString(2);
                int Kalorien = db.res.getInt(3);
                int Gewicht = db.res.getInt(4);
                int Preis = db.res.getInt(5);
                
                Object[] content = {ID, ProduktName, Kalorien, Gewicht, Preis};
                DefaultTableModel model2 = (DefaultTableModel) jTable1.getModel();
                model2.addRow(content);
            }
            
        }catch(SQLException e) {
            
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

        jTextField1 = new javax.swing.JTextField();
        jSuche = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jSuche.setText("Suche");
        jSuche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSucheActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Produktname", "Kalorien", "Gewicht", "Preis"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bitte auswählen", "Produktname", "Kalorien", "Gewicht", "Preis" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "aufsteigend", "absteigend" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Sortieren nach");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSuche, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 216, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSlider1, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSuche)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane2)))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSucheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSucheActionPerformed
        String temp; 
        temp = jTextField1.getText();
        if(temp.contains(""))
        {
           showTable();
        }
                
        /*try{
            orderPreis();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            db.res = db.stat.executeQuery("SELECT * " +
                                          "FROM Artikel " +
                                          "WHERE preis =  2");
            
            while(db.res.next()){
                String ID = db.res.getString(1);
                String ProduktName = db.res.getString(2);
                int Kalorien = db.res.getInt(3);
                int Gewicht = db.res.getInt(4);
                int Preis = db.res.getInt(5);
                
                Object[] content = {ID, ProduktName, Kalorien, Gewicht, Preis};
                DefaultTableModel model2 = (DefaultTableModel) jTable1.getModel();
                model2.addRow(content);
            }
            
        }catch(SQLException e) {
            
        }*/
        
    }//GEN-LAST:event_jSucheActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        jTextField1.setText(jComboBox1.getSelectedItem().toString());
        String temp = jTextField1.getText();
        jTextField1.setText(jComboBox2.getSelectedItem().toString());
        String temp2 = jTextField1.getText();
        
        if (temp.contains("Preis") && temp2.contains("aufsteigend"))
        {
        jTextField1.setText("");    
        orderPreis();
        }
        else if (temp.contains("Bitte auswählen") && temp2.contains("absteigend"))
        {
        jTextField1.setText("");  
        }
        else if (temp.contains("Bitte auswählen") && temp2.contains("aufsteigend"))
        {
        jTextField1.setText("");  
        }
        else if (temp.contains("Preis") && temp2.contains("absteigend"))
        {
        jTextField1.setText("");
        orderdescPreis();
        }
        else if (temp.contains("Produktname") && temp2.contains("aufsteigend"))
        {
        jTextField1.setText("");    
        orderProduktname();
        }
        else if (temp.contains("Produktname") && temp2.contains("absteigend"))
        {
        jTextField1.setText("");    
        orderdescProduktname();
        }
        else if (temp.contains("Kalorien") && temp2.contains("aufsteigend"))
        {
        jTextField1.setText("");    
        orderKalorien();
        }
        else if (temp.contains("Kalorien") && temp2.contains("absteigend"))
        {
        jTextField1.setText("");    
        orderdescKalorien();
        }
        
        else if (temp.contains("Gewicht") && temp2.contains("aufsteigend"))
        {
        jTextField1.setText("");    
        orderGewicht();
        }
        else if (temp.contains("Gewicht") && temp2.contains("absteigend"))
        {
        jTextField1.setText("");    
        orderdescGewicht();
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        jTextField1.setText(jComboBox1.getSelectedItem().toString());
        String temp = jTextField1.getText();
        jTextField1.setText(jComboBox2.getSelectedItem().toString());
        String temp2 = jTextField1.getText();
        
        if (temp.contains("Preis") && temp2.contains("aufsteigend"))
        {
        jTextField1.setText("");    
        orderPreis();
        }
        else if (temp.contains("Preis") && temp2.contains("absteigend"))
        {
        jTextField1.setText("");
        orderdescPreis();
        }
         else if (temp.contains("Bitte auswählen") && temp2.contains("absteigend"))
        {
        jTextField1.setText("");  
        }
        else if (temp.contains("Bitte auswählen") && temp2.contains("aufsteigend"))
        {
        jTextField1.setText("");  
        }
        else if (temp.contains("Produktname") && temp2.contains("aufsteigend"))
        {
        jTextField1.setText("");    
        orderProduktname();
        }
        else if (temp.contains("Produktname") && temp2.contains("absteigend"))
        {
        jTextField1.setText("");    
        orderdescProduktname();
        }
        else if (temp.contains("Kalorien") && temp2.contains("aufsteigend"))
        {
        jTextField1.setText("");    
        orderKalorien();
        }
        else if (temp.contains("Kalorien") && temp2.contains("absteigend"))
        {
        jTextField1.setText("");    
        orderdescKalorien();
        }
        
        else if (temp.contains("Gewicht") && temp2.contains("aufsteigend"))
        {
        jTextField1.setText("");    
        orderGewicht();
        }
        else if (temp.contains("Gewicht") && temp2.contains("absteigend"))
        {
        jTextField1.setText("");    
        orderdescGewicht();
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

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
            java.util.logging.Logger.getLogger(GuestLebensmittel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuestLebensmittel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuestLebensmittel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuestLebensmittel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuestLebensmittel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JButton jSuche;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private void setText(String toString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean contains(String preis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
