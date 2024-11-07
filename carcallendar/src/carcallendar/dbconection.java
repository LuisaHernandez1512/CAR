/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carcallendar;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author PC
 */
class dbconection {
   static String url = "jdbc:mysql://localhost:3306/carcallendar";
   static String user = "root";
   static String pass = "12345"; 

   public static Connection conectar()
    {
        Connection con=null;
        try
        {
        con=DriverManager.getConnection(url, user, pass);
            System.out.println("Conexión exitosa");
        }catch(SQLException e)
        {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error de conexión: " + e.getMessage());
        }
        return con;
    }
}
