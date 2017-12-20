/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projektex.lebensmitteldatenbank;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;



/**
 *
 * @author Amir Mahmood
 */
public class GuestLebensmittel extends javax.swing.JFrame {
        DbTable db = new DbTable();
    
    public GuestLebensmittel() {
        initComponents();
        this.setLocationRelativeTo(null);
        showTable();
    }
    
     public void showTable(){
        try{
            Bildlabel.hide();
            jTextField2.setText("");
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            db.res = db.stat.executeQuery("SELECT * FROM Artikel");
            
            while(db.res.next()){
                String ID = db.res.getString(1);
                String ProduktName = db.res.getString(2);
                int Kalorien = db.res.getInt(3);
                int Gewicht = db.res.getInt(4);
                double Preis = db.res.getDouble(5);
                
                Object[] content = {ID, ProduktName, Kalorien, Gewicht, Preis};
                DefaultTableModel model2 = (DefaultTableModel) jTable1.getModel();
                model2.addRow(content);
            }
            
        }
        catch(SQLException e) { }
    }
     
     /*public void totalCal(int a, int b){
         
                float totalcal=0;
                float cal=a;
                float wei=b;
                totalcal=cal/100*wei; 
                String temp=Float.toString(totalcal);
                jTextArea1.setText("Gesamt Kalorien:"+temp);
     }*/
     
     public void tabelleAusgabe(String a){
         try{
            Bildlabel.hide();
            jTextField2.setText("");
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            
            db.res = db.stat.executeQuery(a);
            
            while(db.res.next()){
                String ID = db.res.getString(1);
                String ProduktName = db.res.getString(2);
                int Kalorien = db.res.getInt(3);
                int Gewicht = db.res.getInt(4);
                double Preis = db.res.getDouble(5);
  
                Object[] content = {ID, ProduktName, Kalorien, Gewicht, Preis};
                DefaultTableModel model2 = (DefaultTableModel) jTable1.getModel();
                model2.addRow(content);
                //totalCal(Kalorien, Gewicht);
            }
            
           
            
            
            
        }catch(SQLException e) {
            
        }
     }
     
     public void leereFeld() {jTextField1.setText(""); }
     
     public void orderPreis(){
       tabelleAusgabe("SELECT * FROM Artikel ORDER BY preis");
    }
     
      public void orderdescPreis(){
       
        tabelleAusgabe("SELECT * FROM Artikel ORDER BY preis desc");
    }

     public void orderKalorien(){
        tabelleAusgabe("SELECT * FROM Artikel ORDER BY Kalorien");
    } 
     
        public void orderdescKalorien(){
        tabelleAusgabe("SELECT * FROM Artikel ORDER BY Kalorien desc");
    }
    
     public void orderGewicht(){
        tabelleAusgabe("SELECT * FROM Artikel ORDER BY Gewicht");
    }
     
     
     public void orderdescGewicht(){
        tabelleAusgabe("SELECT * FROM Artikel ORDER BY Gewicht desc");
    }
     
      public void orderProduktname(){
        tabelleAusgabe("SELECT * FROM Artikel ORDER BY ProduktName");
    }
      
      public void orderdescProduktname(){
        tabelleAusgabe("SELECT * FROM Artikel ORDER BY ProduktName desc");
    }
      
      public void sucheProdukt(){
        String temp; 
        temp = jTextField1.getText();
        
            if(temp.equals(""))     {showTable();}
            else                    {tabelleAusgabe("SELECT * FROM Artikel WHERE ProduktName = '"+temp+"'");}
      }
      public void showImage(String a) throws IOException
      {            
                Bildlabel.hide();
                BufferedImage temp = ImageIO.read(this.getClass().getResource(a));
                Bildlabel = new JLabel(new ImageIcon(temp));
                jPanel1.add(Bildlabel);
                Bildlabel.setSize(240, 240);
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
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        Bildlabel = new javax.swing.JLabel();

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

        jTable1.setBackground(new java.awt.Color(255, 204, 102));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Produktname", "Kalorien (auf 100g)", "Gewicht", "Preis"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(0, 0, 0));
        jTable1.setSelectionBackground(new java.awt.Color(51, 102, 255));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(15);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(30);
        }

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

        jLabel2.setText("Gesamt Kalorien:");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new java.awt.GridBagLayout());
        jPanel1.add(Bildlabel, new java.awt.GridBagConstraints());

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSuche))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(213, 213, 213))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE))
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSucheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSucheActionPerformed
      sucheProdukt();
    }//GEN-LAST:event_jSucheActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        jTextField1.setText(jComboBox1.getSelectedItem().toString());
        String temp = jTextField1.getText();
        jTextField1.setText(jComboBox2.getSelectedItem().toString());
        String temp2 = jTextField1.getText();
        
        if (temp.contains("Preis") && temp2.contains("aufsteigend"))
        {
        leereFeld();   
        orderPreis();
        }
        else if (temp.contains("Bitte auswählen") && temp2.contains("absteigend"))
        {
        leereFeld(); 
        }
        else if (temp.contains("Bitte auswählen") && temp2.contains("aufsteigend"))
        {
        leereFeld();  
        }
        else if (temp.contains("Preis") && temp2.contains("absteigend"))
        {
        leereFeld();;
        orderdescPreis();
        }
        else if (temp.contains("Produktname") && temp2.contains("aufsteigend"))
        {
        leereFeld();    
        orderProduktname();
        }
        else if (temp.contains("Produktname") && temp2.contains("absteigend"))
        {
        leereFeld();    
        orderdescProduktname();
        }
        else if (temp.contains("Kalorien") && temp2.contains("aufsteigend"))
        {
        leereFeld();    
        orderKalorien();
        }
        else if (temp.contains("Kalorien") && temp2.contains("absteigend"))
        {
        leereFeld();    
        orderdescKalorien();
        }
        
        else if (temp.contains("Gewicht") && temp2.contains("aufsteigend"))
        {
        leereFeld();   
        orderGewicht();
        }
        else if (temp.contains("Gewicht") && temp2.contains("absteigend"))
        {
        leereFeld();   
        orderdescGewicht();
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
            sucheProdukt(); 
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        jTextField1.setText(jComboBox1.getSelectedItem().toString());
        String temp = jTextField1.getText();
        jTextField1.setText(jComboBox2.getSelectedItem().toString());
        String temp2 = jTextField1.getText();
        
        if (temp.contains("Preis") && temp2.contains("aufsteigend"))
        {
        leereFeld();    
        orderPreis();
        }
        else if (temp.contains("Preis") && temp2.contains("absteigend"))
        {
        leereFeld();
        orderdescPreis();
        }
         else if (temp.contains("Bitte auswählen") && temp2.contains("absteigend"))
        {
        leereFeld(); 
        }
        else if (temp.contains("Bitte auswählen") && temp2.contains("aufsteigend"))
        {
        leereFeld();  
        }
        else if (temp.contains("Produktname") && temp2.contains("aufsteigend"))
        {
        leereFeld();   
        orderProduktname();
        }
        else if (temp.contains("Produktname") && temp2.contains("absteigend"))
        {
        leereFeld();   
        orderdescProduktname();
        }
        else if (temp.contains("Kalorien") && temp2.contains("aufsteigend"))
        {
        leereFeld();    
        orderKalorien();
        }
        else if (temp.contains("Kalorien") && temp2.contains("absteigend"))
        {
        leereFeld();    
        orderdescKalorien();
        }
        
        else if (temp.contains("Gewicht") && temp2.contains("aufsteigend"))
        {
        leereFeld();    
        orderGewicht();
        }
        else if (temp.contains("Gewicht") && temp2.contains("absteigend"))
        {
        leereFeld();    
        orderdescGewicht();
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
         if(jTable1.getSelectedRow()> -1){
            try {
                String a = jTable1.getValueAt(jTable1.getSelectedRow(),1).toString();
                 if(a.equals("Apfel") || a.equals("Ayran") || a.equals("Baguette") || a.equals("Birne")|| a.equals("Brezel")|| a.equals("Bulgur")|| a.equals("Butter")
                   || a.equals("Champignons")|| a.equals("Cola")|| a.equals("Croissant")|| a.equals("Datteln")|| a.equals("Döner")|| a.equals("Ei")
                   || a.equals("Eiweißpulver")|| a.equals("Erdnuesse")|| a.equals("Falafel")|| a.equals("Fladenbrot")|| a.equals("Frikadelle")|| a.equals("Garnelen")
                   || a.equals("Grapefruit")|| a.equals("Hähnchen")|| a.equals("Hamburger")|| a.equals("Honig")|| a.equals("Joghurt")|| a.equals("Karotten")
                   || a.equals("Kartoffeln")|| a.equals("Käsekuchen")|| a.equals("Kefir")|| a.equals("Ketchup")|| a.equals("Knoblauch")|| a.equals("Kokosmilch")
                   || a.equals("Lasagne")|| a.equals("Limette")|| a.equals("Limonade")|| a.equals("Mais")|| a.equals("Mandarine")|| a.equals("Mandeln")|| a.equals("Mango")
                   || a.equals("Marzipan")|| a.equals("Milch")|| a.equals("Milchreis")|| a.equals("Milchschnitte")|| a.equals("Mortadella")|| a.equals("Müsli")|| a.equals("Nougat")
                   || a.equals("Nutella")|| a.equals("Oliven, grün")|| a.equals("Oliven, schwarz")|| a.equals("Olivenöl")|| a.equals("Orange")|| a.equals("Papaya")
                   || a.equals("Peperoni")|| a.equals("Pizza")|| a.equals("Popcorn")|| a.equals("Puderzucker")|| a.equals("Quark, Magerquark")|| a.equals("Radicchio")
                   || a.equals("Reiswaffel")|| a.equals("Rindswurst")|| a.equals("Roggenbrot")|| a.equals("Salami")|| a.equals("Salz")|| a.equals("Sardinen")|| a.equals("Seelachs")
                   || a.equals("Spaghetti")|| a.equals("Stevia")|| a.equals("Studentenfutter")|| a.equals("Thunfisch")|| a.equals("Vollkornbrot")|| a.equals("Zartbitterschokolade")
                   || a.equals("Zucker"))
                {    
                showImage("Bilder/"+a+".jpg");
                }
                else
                {
                showImage("Bilder/Noimage.jpg");
                }
                

                
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            
                
            String cal=jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString();
            String wei=jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString();
            Double cal1=Double.valueOf(cal);
            Double wei1=Double.valueOf(wei);
            Double Result=cal1/100*wei1;
            String stringresult = Double.toString(Math.round(Result));
            jTextField2.setText(stringresult +" kcal");      
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

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
    private javax.swing.JLabel Bildlabel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jSuche;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

}
