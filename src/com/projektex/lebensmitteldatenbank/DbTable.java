
package com.projektex.lebensmitteldatenbank;


import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;




public final class DbTable {
    public Connection con = null;
    public Statement stat = null;
    public ResultSet res = null;
    
    public DbTable(){
        systemConnection();
    }
    
    
    public void systemConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/Lebensmittel??verifyServerCertificate=false&useSSL=true", "root" , "Swordfish25");
            stat = (Statement) con.createStatement();
            
            
        }catch (ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Error");
        }
        
    }
    

    
    public static void main(String[] args) {
        
    }
    
}
