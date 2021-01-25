/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.BusquedaRENAP;
import Vista.FrmVerificarDPI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author OtakuGT
 */
public class ControladorDPI implements ActionListener {
    private FrmVerificarDPI Vista;
    private BusquedaRENAP Modelo;
    
    public ControladorDPI(FrmVerificarDPI Vista, BusquedaRENAP Modelo) {
        this.Vista = Vista;
        this.Modelo = Modelo;
        this.Vista.JBtnVerificar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
