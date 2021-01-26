
package Principal;

import Controlador.DPI;
import Modelo.ConexionRENAP;
import Vista.FrmVerificarDPI;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Principal {
    public static void main (String[] args){
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);     
        }
        ConexionRENAP mr = new ConexionRENAP();
            FrmVerificarDPI vr = new FrmVerificarDPI();
            DPI cr = new DPI(mr,vr);
            cr.iniciar();
    }
}
