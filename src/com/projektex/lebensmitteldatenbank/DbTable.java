
package com.projektex.lebensmitteldatenbank;


import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;




public final class DbTable {
    public Connection con;
    public Statement stat;
    public ResultSet res;
    
    public DbTable(String name, char[] password){
        systemConnection(name, password);
    }
    
    
    public void systemConnection(String name, char[] password){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String pw = new String(password);
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/lebensmittel?verifyServerCertificate=false&useSSL=true", name , pw);
            stat = (Statement) con.createStatement();
        }catch (ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Error");
        }
        
    }
        
    public Connection getConnection(){
        return con;
    }
    
    public static void main(String[] args) {
        
    }
    
}
