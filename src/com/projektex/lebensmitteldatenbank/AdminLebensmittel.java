/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projektex.lebensmitteldatenbank;
import static com.projektex.lebensmitteldatenbank.MainStarter.db;
import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.JTableHeader;


/**
 *
 * @author Amir Mahmood
 */
public class AdminLebensmittel extends javax.swing.JFrame {
        //DbTable db = new DbTable();

    
    public AdminLebensmittel() {
        initComponents();
        this.setLocationRelativeTo(null);
        showTable();
        Font f = new Font("Arial", Font.BOLD, 13);
        JTableHeader header = jTable1.getTableHeader();
        jTable1.getTableHeader().setBackground(Color.lightGray);
        header.setFont(f);
    }
    
    
     public void showTable(){
        try{
            Bildlabel.hide();
            jTextField2.setText("");
            jTextField1.setText("");
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
            else                    {tabelleAusgabe("SELECT * FROM Artikel WHERE ProduktName LIKE '%"+temp+"%'");}
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
        jabmelden = new javax.swing.JButton();
        jRahmen = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPN = new javax.swing.JTextField();
        jK = new javax.swing.JTextField();
        jG = new javax.swing.JTextField();
        jP = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jadd = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jloesch = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jrefresh = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Bildlabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setBackground(new java.awt.Color(204, 255, 255));
        jTextField1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jSuche.setBackground(new java.awt.Color(255, 102, 102));
        jSuche.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
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
                "ID", "Produktname", "Kalorien (auf 100g)", "Gewicht (Gramm)", "Preis"
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
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(3);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(85);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(75);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(10);
        }

        jabmelden.setBackground(new java.awt.Color(255, 51, 51));
        jabmelden.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jabmelden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/projektex/lebensmitteldatenbank/imag/image signoff.jpg"))); // NOI18N
        jabmelden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jabmeldenActionPerformed(evt);
            }
        });

        jRahmen.setBackground(new java.awt.Color(51, 102, 255));
        jRahmen.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel4.setText("Kalorien:");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel5.setText("Gewicht:");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel6.setText("Preis:");

        jPN.setBackground(new java.awt.Color(204, 255, 255));

        jK.setBackground(new java.awt.Color(204, 255, 255));

        jG.setBackground(new java.awt.Color(204, 255, 255));

        jP.setBackground(new java.awt.Color(204, 255, 255));
        jP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel3.setText("Produktname:");

        jadd.setBackground(new java.awt.Color(255, 255, 102));
        jadd.setText("Datensatz hinzufügen");
        jadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jaddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jRahmenLayout = new javax.swing.GroupLayout(jRahmen);
        jRahmen.setLayout(jRahmenLayout);
        jRahmenLayout.setHorizontalGroup(
            jRahmenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jRahmenLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jRahmenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jadd, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                    .addGroup(jRahmenLayout.createSequentialGroup()
                        .addGroup(jRahmenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jRahmenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPN, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                            .addComponent(jK)
                            .addComponent(jG)
                            .addComponent(jP))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jRahmenLayout.setVerticalGroup(
            jRahmenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jRahmenLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jadd)
                .addGap(18, 18, 18)
                .addGroup(jRahmenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jRahmenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jRahmenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jRahmenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(51, 102, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jloesch.setBackground(new java.awt.Color(255, 255, 102));
        jloesch.setText("Datensatz löschen");
        jloesch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jloeschActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jloesch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jloesch)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(51, 102, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sortieren nach");

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

        jrefresh.setBackground(new java.awt.Color(255, 255, 102));
        jrefresh.setText("Tabelle aktuallisieren");
        jrefresh.setPreferredSize(new java.awt.Dimension(63, 35));
        jrefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jrefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(51, 102, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel2.setText("Gesamtkalorien vom Produkt:");

        jTextField2.setBackground(new java.awt.Color(204, 255, 255));
        jTextField2.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(20, 20, 20))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());
        jPanel1.add(Bildlabel, new java.awt.GridBagConstraints());

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSuche, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jRahmen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jabmelden, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSuche))
                    .addComponent(jabmelden, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRahmen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
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

    private void jloeschActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jloeschActionPerformed
        if(jTable1.getSelectedRow()== -1)
        {
            JOptionPane.showMessageDialog(null, "Choose first a Dataset", "Error", JOptionPane.ERROR_MESSAGE);
        }
        String temp = jTable1.getValueAt(jTable1.getSelectedRow(),0).toString();
            try {
                db.stat.executeUpdate("DELETE from Artikel WHERE ID = '"+temp+"'");
                showTable();
                
            } catch (SQLException ex) {
                Logger.getLogger(AdminLebensmittel.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jloeschActionPerformed

    private void jrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrefreshActionPerformed
            showTable();
    }//GEN-LAST:event_jrefreshActionPerformed

    private void jaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jaddActionPerformed
         Bildlabel.hide();
         jTextField2.setText("");
        
        
        String a = jPN.getText();
        String b = jK.getText();
        String c = jG.getText();
        String d = jP.getText();
        
        if(a.equals("") || b.equals("") || c.equals("") || d.equals(""))
        {
             JOptionPane.showMessageDialog(null, "Type something in Produktname, Kalorien, Gewicht and Preis", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
        if(a.contains("1") || a.contains("2") || a.contains("3") || a.contains("4") || a.contains("5") || a.contains("6") || a.contains("7") || a.contains("8")
           || a.contains("9") || a.contains("0"))
        {
            JOptionPane.showMessageDialog(null, "You can´t type numbers in Produktname", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(d.contains("-"))
        {
             JOptionPane.showMessageDialog(null, "You can´t type negative numbers in Preis", "Error", JOptionPane.ERROR_MESSAGE);   
        }
        else
        {
            try {
            db.stat.executeUpdate("INSERT INTO Artikel (ProduktName, Kalorien, Gewicht, Preis) VALUES ('"+a+"',"+b+","+c+","+d+")");
            showTable();

            } catch (SQLException ex) {
            Logger.getLogger(AdminLebensmittel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if(b.contains("A") || b.contains("B") || b.contains("C") || b.contains("D") || b.contains("E") || b.contains("F") || b.contains("G") || b.contains("H") || b.contains("I") ||
           b.contains("J") || b.contains("K")|| b.contains("L")|| b.contains("M")|| b.contains("N")|| b.contains("O")|| b.contains("P")|| b.contains("Q")|| b.contains("R") ||
           b.contains("S") || b.contains("T")|| b.contains("U")|| b.contains("V")|| b.contains("W") || b.contains("X") || b.contains("Y") || b.contains("Z") || b.contains("a") ||
           b.contains("b") || b.contains("c") || b.contains("d") || b.contains("e") || b.contains("f") || b.contains("g") || b.contains("h") || b.contains("i") ||
           b.contains("j") || b.contains("k")|| b.contains("l")|| b.contains("m")|| b.contains("n")|| b.contains("o")|| b.contains("p")|| b.contains("q")|| b.contains("r") ||
           b.contains("s") || b.contains("t")|| b.contains("u")|| b.contains("v")|| b.contains("w") || b.contains("x") || b.contains("y") || b.contains("z") || b.contains("!") ||
           b.contains("§") || b.contains("$") || b.contains("%") || b.contains("&") || b.contains("/") || b.contains("(") || b.contains(")") || b.contains("=") || b.contains("?") ||
           b.contains("ß") || b.contains("+") || b.contains("*") || b.contains("-") || b.contains(",") || b.contains(";") || b.contains(":") || b.contains("<") || b.contains(">") ||
           b.contains("|") || b.contains("#") || b.contains("[") || b.contains("]") || b.contains("."))
        {
            JOptionPane.showMessageDialog(null, "You can only type numbers in Kalorien", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        if(c.contains("A") || c.contains("B") || c.contains("C") || c.contains("D") || c.contains("E") || c.contains("F") || c.contains("G") || c.contains("H") || c.contains("I") ||
           c.contains("J") || c.contains("K")|| c.contains("L")|| c.contains("M")|| c.contains("N")|| c.contains("O")|| c.contains("P")|| c.contains("Q")|| c.contains("R") ||
           c.contains("S") || c.contains("T")|| c.contains("U")|| c.contains("V")|| c.contains("W") || c.contains("X") || c.contains("Y") || c.contains("Z") || c.contains("a") ||
           c.contains("b") || c.contains("c") || c.contains("d") || c.contains("e") || c.contains("f") || c.contains("g") || c.contains("h") || c.contains("i") ||
           c.contains("j") || c.contains("k")|| c.contains("l")|| c.contains("m")|| c.contains("n")|| c.contains("o")|| c.contains("p")|| c.contains("q")|| c.contains("r") ||
           c.contains("s") || c.contains("t")|| c.contains("u")|| c.contains("v")|| c.contains("w") || c.contains("x") || c.contains("y") || c.contains("z") || c.contains("!") ||
           c.contains("§") || c.contains("$") || c.contains("%") || c.contains("&") || c.contains("/") || c.contains("(") || c.contains(")") || c.contains("=") || c.contains("?") ||
           c.contains("ß") || c.contains("+") || c.contains("*") || c.contains("-") || c.contains(",") || c.contains(";") || c.contains(":") || c.contains("<") || c.contains(">") ||
           c.contains("|") || c.contains("#") || c.contains("[") || c.contains("]") || c.contains("."))
        {
            JOptionPane.showMessageDialog(null, "You can only type numbers in Gewicht", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
         if(d.contains("A") || d.contains("B") || d.contains("C") || d.contains("D") || d.contains("E") || d.contains("F") || d.contains("G") || d.contains("H")|| d.contains("I")||
            d.contains("J") || d.contains("K") || d.contains("L") || d.contains("M") || d.contains("N") || d.contains("O") || d.contains("P") || d.contains("Q")|| d.contains("R")||
            d.contains("S") || d.contains("T") || d.contains("U") || d.contains("V") || d.contains("W") || d.contains("X") || d.contains("Y") || d.contains("Z")|| d.contains("a")||
            d.contains("b") || d.contains("c") || d.contains("d") || d.contains("e") || d.contains("f") || d.contains("g") || d.contains("h") || d.contains("i")|| d.contains("j")||
            d.contains("k") || d.contains("l") || d.contains("m") || d.contains("n") || d.contains("o") || d.contains("p") || d.contains("q") || d.contains("r")|| d.contains("s")||
            d.contains("t") || d.contains("u") || d.contains("v") || d.contains("w") || d.contains("x") || d.contains("y") || d.contains("z") || d.contains("!")|| d.contains("§")||
            d.contains("$") || d.contains("%") || d.contains("&") || d.contains("/") || d.contains("(") || d.contains(")") || d.contains("=") || d.contains("?")|| d.contains("ß")||
            d.contains("*") || d.contains(";") || d.contains(":") || d.contains("<") || d.contains(">") || d.contains("|") || d.contains("#") || d.contains("[")|| d.contains("]"))
        {
            JOptionPane.showMessageDialog(null, "You can only type numbers in Preis", "Error", JOptionPane.ERROR_MESSAGE);
        } 
        else if(d.contains(","))
        {
            JOptionPane.showMessageDialog(null, "The format should look like this '3.99' ", "Error", JOptionPane.ERROR_MESSAGE);
        }      
       

        /*try {
            db.stat.executeUpdate("INSERT INTO Artikel (ProduktName, Kalorien, Gewicht, Preis) VALUES ('"+a+"',"+b+","+c+","+d+")");
            showTable();

        } catch (SQLException ex) {
            Logger.getLogger(AdminLebensmittel.class.getName()).log(Level.SEVERE, null, ex);
        }*/

    }//GEN-LAST:event_jaddActionPerformed

    private void jPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPActionPerformed

    private void jabmeldenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jabmeldenActionPerformed
        this.dispose();
    }//GEN-LAST:event_jabmeldenActionPerformed

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
    private javax.swing.JTextField jG;
    private javax.swing.JTextField jK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jP;
    private javax.swing.JTextField jPN;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jRahmen;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jSuche;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton jabmelden;
    private javax.swing.JButton jadd;
    private javax.swing.JButton jloesch;
    private javax.swing.JButton jrefresh;
    // End of variables declaration//GEN-END:variables

}
