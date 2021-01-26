/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import com.mysql.jdbc.Connection;
import java.net.URL;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import Vista.FrmVerificarDPI;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

/**
 *
//Carlos Castillo
 */
public class ConexionRENAP {
    Vista.FrmVerificarDPI VR = new Vista.FrmVerificarDPI();
    Connection con;
    Connection cn = GetConection();

    public static Connection GetConection(){
        Connection con = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/RENAP", "root","");
            JOptionPane.showMessageDialog(null,"Conexion Exitosa!");
        } catch (Exception e) {
            System.out.println(e);
        }
        return con; 
}
       public void MostrarUsuarios(String atributo){
           DefaultTableModel modo = new DefaultTableModel();
           modo.addColumn("DPI");
           modo.addColumn("Nombres");
           modo.addColumn("Apellido Paterno");
           modo.addColumn("Apellido Materno");
           modo.addColumn("Fecha de Nacimiento");
           VR.Tabla.setModel(modo);
         String sql="SELECT * FROM Persona";
         if(atributo.equals("")){
             sql="SELECT * FROM Persona";
         }
         else {
             sql="SELECT * FROM Persona WHERE DPI_Num= ? ";
         }
         String datos[] = new String [5];
         try {
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql);
             while (rs.next()){
                 datos[0]=rs.getString(1);
                 datos[1]=rs.getString(2);
                 datos[2]=rs.getString(3);
                 datos[3]=rs.getString(4);
                 datos[4]=rs.getString(5);
                 modo.addRow(datos);
                 JOptionPane.showMessageDialog(null, "El DPI Ingresado si existe");
             } VR.Tabla.setModel(modo);
         }catch(SQLException ex){
             JOptionPane.showMessageDialog(null, "El dato no existe");
         }
       }
}
