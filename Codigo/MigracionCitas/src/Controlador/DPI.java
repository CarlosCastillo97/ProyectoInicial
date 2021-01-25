/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ConexionRENAP;
import Vista.FrmVerificarDPI;
import java.text.SimpleDateFormat;

/**
 *
//realizado por Carlos Castillo (CarlosCastillo97)
 */
public class DPI {
 private String Num_DPI;
  private String Nombres_RENAP;
  private String Apellido_M;
  private String Apellido_P;
  private SimpleDateFormat Fecha_Nac;
  
  public DPI(){     
  } 
  
  public DPI(String Num_DPI, String Nombres_RENAP, String Apellido_M, String Apellido_P, SimpleDateFormat Fecha_Nac) {
      this.Num_DPI = Num_DPI;
      this.Nombres_RENAP = Nombres_RENAP;
      this.Apellido_P = Apellido_P;
      this.Apellido_M = Apellido_M;
      this.Fecha_Nac = Fecha_Nac;
  }

    public String getNum_DPI() {
        return Num_DPI;
    }

    public void setNum_DPI(String Num_DPI) {
        this.Num_DPI = Num_DPI;
    }

    public String getNombres_RENAP() {
        return Nombres_RENAP;
    }

    public void setNombres_RENAP(String Nombres_RENAP) {
        this.Nombres_RENAP = Nombres_RENAP;
    }

    public String getApellido_M() {
        return Apellido_M;
    }

    public void setApellido_M(String Apellido_M) {
        this.Apellido_M = Apellido_M;
    }

    public String getApellido_P() {
        return Apellido_P;
    }

    public void setApellido_P(String Apellido_P) {
        this.Apellido_P = Apellido_P;
    }

    public SimpleDateFormat getFecha_Nac() {
        return Fecha_Nac;
    }

    public void setFecha_Nac(SimpleDateFormat Fecha_Nac) {
        this.Fecha_Nac = Fecha_Nac;
    }
}

