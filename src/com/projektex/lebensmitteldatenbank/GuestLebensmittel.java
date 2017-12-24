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
import java.text.DecimalFormat;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.JTableHeader;



/**
 *
 * @author Amir Mahmood
 */
public class GuestLebensmittel extends javax.swing.JFrame {
        //db = new DbTable();
    
    public GuestLebensmittel() {
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
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jaddm = new javax.swing.JButton();
        jumrechner = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jMverrichten = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jMealf = new javax.swing.JButton();
        jdeleteMeal = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jaddCart = new javax.swing.JButton();
        jdeleteCart = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Bildlabel = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jSuche.setBackground(new java.awt.Color(255, 204, 153));
        jSuche.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
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

        jButton1.setText("Tabelle aktuallisieren");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(51, 102, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("---->");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produktname", "Kalorien", "Gewicht"
            }
        ));
        jScrollPane2.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setResizable(false);
            jTable3.getColumnModel().getColumn(0).setPreferredWidth(80);
            jTable3.getColumnModel().getColumn(1).setResizable(false);
            jTable3.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTable3.getColumnModel().getColumn(2).setResizable(false);
            jTable3.getColumnModel().getColumn(2).setPreferredWidth(50);
        }

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Mahlzeit");

        jaddm.setBackground(new java.awt.Color(255, 255, 102));
        jaddm.setText("Zur Mahlzeit hinzufügen");
        jaddm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jaddmActionPerformed(evt);
            }
        });

        jumrechner.setBackground(new java.awt.Color(255, 255, 102));
        jumrechner.setText("Gewicht ändern");
        jumrechner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumrechnerActionPerformed(evt);
            }
        });

        jTextField4.setBackground(new java.awt.Color(204, 255, 255));
        jTextField4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jMverrichten.setBackground(new java.awt.Color(255, 255, 102));
        jMverrichten.setText("verrichtete Mahlzeit");
        jMverrichten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMverrichtenActionPerformed(evt);
            }
        });

        jTextField5.setBackground(new java.awt.Color(204, 255, 255));
        jTextField5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField5.setText("0 kcal");

        jMealf.setBackground(new java.awt.Color(255, 255, 102));
        jMealf.setText("Mahlzeit verrichtet");
        jMealf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMealfActionPerformed(evt);
            }
        });

        jdeleteMeal.setBackground(new java.awt.Color(255, 255, 102));
        jdeleteMeal.setText("Mahlzeit rausnehmen");
        jdeleteMeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdeleteMealActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("---->");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jMealf, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jumrechner, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jMverrichten, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jaddm, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(15, 15, 15))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(18, 18, 18)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jdeleteMeal)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jaddm)
                    .addComponent(jdeleteMeal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jumrechner)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jMverrichten)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jMealf)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(51, 102, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jaddCart.setBackground(new java.awt.Color(255, 255, 102));
        jaddCart.setText("Im Warenkorb hinzufügen");
        jaddCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jaddCartActionPerformed(evt);
            }
        });

        jdeleteCart.setBackground(new java.awt.Color(255, 255, 102));
        jdeleteCart.setText("Vom Warenkorb entfernen");
        jdeleteCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdeleteCartActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Warenkorb");

        jTable2.setBackground(new java.awt.Color(255, 102, 102));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produktname", "Kalorien", "Gewicht", "Preis"
            }
        ));
        jScrollPane3.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(80);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setPreferredWidth(50);
            jTable2.getColumnModel().getColumn(3).setResizable(false);
            jTable2.getColumnModel().getColumn(3).setPreferredWidth(30);
        }

        jTextField3.setBackground(new java.awt.Color(204, 255, 255));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField3.setText("0€");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel3.setText("Gesamtpreis:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jaddCart, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jdeleteCart))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jdeleteCart)
                    .addComponent(jaddCart))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());
        jPanel1.add(Bildlabel, new java.awt.GridBagConstraints());

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel5.setBackground(new java.awt.Color(51, 102, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel2.setText("Gesamtkalorien vom Produkt :");

        jTextField2.setBackground(new java.awt.Color(204, 255, 255));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField2.setEnabled(false);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/projektex/lebensmitteldatenbank/imag/image signoff.jpg"))); // NOI18N
        jButton2.setPreferredSize(new java.awt.Dimension(32, 33));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(24, 24, 24)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTextField1)
                        .addGap(18, 18, 18)
                        .addComponent(jSuche, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 74, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSuche))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 846, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
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

    private void jaddCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jaddCartActionPerformed
        
        if(jTable1.getSelectedRow()== -1)
        {
            JOptionPane.showMessageDialog(null, "Select a Dataset from the left table", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
        if(jTable1.getSelectedRow()> -1)
        {        
            String temp1=jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString();
            String temp2=jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString();
            String temp3=jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString();
            String temp4=jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString();
            jTable1.clearSelection();
            
            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            model.addRow(new Object[]{temp1,temp2,temp3,temp4});
            
            String stgpreis = jTextField3.getText();
            stgpreis = stgpreis.replace("€", "");
            Double tgpreis1 = Double.valueOf(stgpreis);
            Double tgpreis2 = Double.valueOf(temp4);
            
            Double fgpreis= tgpreis1+tgpreis2;
            String sfgpreis = Double.toString(Math.round(fgpreis*100)/100.00);
            jTextField3.setText("");
            jTextField3.setText(sfgpreis+"0€");
        }
    }//GEN-LAST:event_jaddCartActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jdeleteCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdeleteCartActionPerformed
        if(jTable2.getSelectedRow()== -1)
        {
            JOptionPane.showMessageDialog(null, "Select a Dataset from the Warenkorb table", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();    
        String temp1=jTable2.getValueAt(jTable2.getSelectedRow(), 3).toString();
        model.removeRow(jTable2.getSelectedRow());
        
            String stgpreis = jTextField3.getText();
            stgpreis = stgpreis.replace("€", "");
            Double tgpreis1 = Double.valueOf(stgpreis);
            Double tgpreis2 = Double.valueOf(temp1);
            
            Double fgpreis= tgpreis1-tgpreis2;
            String sfgpreis = Double.toString(Math.round(fgpreis*100)/100.00);
            jTextField3.setText("");
            jTextField3.setText(sfgpreis+"0");
        
    }//GEN-LAST:event_jdeleteCartActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            showTable();
            leereFeld();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jaddmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jaddmActionPerformed
         if(jTable2.getSelectedRow()== -1)
        {
            JOptionPane.showMessageDialog(null, "Select a Dataset from the Warenkorb table", "Error", JOptionPane.ERROR_MESSAGE);
        }

        if(jTable2.getSelectedRow()>-1)
        {
            String pa = jTable2.getValueAt(jTable2.getSelectedRow(),0).toString();
            String ka = jTable2.getValueAt(jTable2.getSelectedRow(),1).toString();
            String ge = jTable2.getValueAt(jTable2.getSelectedRow(),2).toString();
            jTable2.clearSelection();
            
            Double dka=Double.valueOf(ka);
            Double dge=Double.valueOf(ge);
            Double gka=dka/100*dge;
            String sgka = Double.toString(Math.round(gka));
            
            DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
            model.addRow(new Object[]{pa,sgka,ge});
        }
 
        
        
    }//GEN-LAST:event_jaddmActionPerformed

    private void jumrechnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumrechnerActionPerformed
         if(jTable3.getSelectedRow()== -1)
        {
            JOptionPane.showMessageDialog(null, "Select a Dataset from the Mahlzeit table", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        if(jTable3.getSelectedRow()>-1)
        {
             String pa = jTable3.getValueAt(jTable3.getSelectedRow(),0).toString();
             String ka = jTable3.getValueAt(jTable3.getSelectedRow(),1).toString();
             String ge = jTable3.getValueAt(jTable3.getSelectedRow(),2).toString();
             DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
             String temp = jTextField4.getText();
             Double uge= Double.valueOf(temp);
             Double ka1=Double.valueOf(ka);
             Double ge1=Double.valueOf(ge);
             Double kpg= ka1/ge1;
             Double nka= uge*kpg;
             String snka = Double.toString(Math.round(nka*100)/100.00);
             
             model.removeRow(jTable3.getSelectedRow());
             model.addRow(new Object[]{pa,snka,uge});
             jTable3.clearSelection();
             jTextField4.setText("");
          
        }
    }//GEN-LAST:event_jumrechnerActionPerformed

    private void jMverrichtenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMverrichtenActionPerformed
        if(jTable3.getSelectedRow()>-1)
        {
            String ka = jTable3.getValueAt(jTable3.getSelectedRow(),1).toString();
            DefaultTableModel model = (DefaultTableModel) jTable3.getModel();    
            model.removeRow(jTable3.getSelectedRow());
            String sterg = jTextField5.getText();
            sterg = sterg.replace("kcal", "");
            Double ka1 = Double.valueOf(ka);
            Double terg = Double.valueOf(sterg);
            Double gerg= terg+ka1;
            String sgerg = Double.toString(Math.round(gerg*100)/100.00);
            jTextField5.setText("");
            jTextField5.setText(sgerg+"kcal");
            
            
        }
    }//GEN-LAST:event_jMverrichtenActionPerformed

    private void jMealfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMealfActionPerformed
            String temp1 = jTextField3.getText();
            String temp2 = jTextField5.getText();
            
            
            if(temp1.equals("0€") || temp1.equals("") || temp1.equals("0") )
            {
                JOptionPane.showMessageDialog(null, "Sie haben 0.00€ für ihren Einkauf ausgegeben und "+temp2+" Kalorien gegessen", null, JOptionPane.NO_OPTION);
            }    
            else
            {
                JOptionPane.showMessageDialog(null, "Sie haben " + temp1 +" für ihren Einkauf ausgegeben und "+temp2+" Kalorien gegessen", null, JOptionPane.NO_OPTION);
            }
    }//GEN-LAST:event_jMealfActionPerformed

    private void jdeleteMealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdeleteMealActionPerformed
         if(jTable3.getSelectedRow()== -1)
        {
            JOptionPane.showMessageDialog(null, "Select a Dataset from the Mahlzeit table", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
            DefaultTableModel model = (DefaultTableModel) jTable3.getModel();    
            model.removeRow(jTable3.getSelectedRow());
    }//GEN-LAST:event_jdeleteMealActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton jMealf;
    private javax.swing.JButton jMverrichten;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jSuche;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JButton jaddCart;
    private javax.swing.JButton jaddm;
    private javax.swing.JButton jdeleteCart;
    private javax.swing.JButton jdeleteMeal;
    private javax.swing.JButton jumrechner;
    // End of variables declaration//GEN-END:variables

    private static class setVisible {

        public setVisible(boolean b) {
        }
    }

}
