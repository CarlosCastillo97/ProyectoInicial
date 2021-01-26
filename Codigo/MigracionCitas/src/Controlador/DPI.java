/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.FrmVerificarDPI;
import Modelo.ConexionRENAP;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
//Carlos Castillo 
public class DPI implements ActionListener{
    
    private ConexionRENAP mr;
    private FrmVerificarDPI vr;

    public DPI(ConexionRENAP mr, FrmVerificarDPI vr) {
        this.mr = mr;
        this.vr = vr;
        this.vr.JBtnVerificarRENAP.addActionListener(this);
    }
    
    public void iniciar(){
        vr.setTitle("Sistema con MVC");
        vr.pack();
        vr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vr.setLocationRelativeTo (null);
        vr.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(vr.JBtnVerificarRENAP == e.getSource()){
            try{
                mr.MostrarUsuarios("");
            }catch(Exception ex){
               JOptionPane.showMessageDialog(null, "No se puede encontrar usuario");
                    }
                
        }
}
}
