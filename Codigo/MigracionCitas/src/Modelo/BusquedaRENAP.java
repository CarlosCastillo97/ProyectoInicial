/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import Controlador.DPI;
import java.sql.CallableStatement;
/**
 *
 * @author OtakuGT
 */
public class BusquedaRENAP extends ConexionRENAP{
    public DPI Busquedaindividual (String Num_DPI){
        Connection con = getConectar();
        DPI per = null;
        try {
            CallableStatement cs = (CallableStatement) con.prepareCall("(call buscarindividual(?) )");
            int num=1;
            String s=String.valueOf(num);  
            cs.setString(s, Num_DPI);
            int busper = cs.executeUpdate();
            ResultSet rs = cs.executeQuery();
            while (rs.next()) {
                per = new DPI();
                per.setNum_DPI(rs.getString(1));
                per.setNombres_RENAP(rs.getString(2));
                per.setApellido_M(rs.getString(3));
                per.setApellido_P(rs.getString(4));
            }
        
        }   catch (SQLException e){
        }
        return per;
    }}
        
        
        
     

