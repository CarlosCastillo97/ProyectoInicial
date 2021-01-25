package Vista;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class FrmContenedor extends javax.swing.JFrame {

    public FrmContenedor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        JDesktopPaneSistema = new javax.swing.JDesktopPane();
        JMenuBar = new javax.swing.JMenuBar();
        JMenuGenerarCita = new javax.swing.JMenu();
        JMenuVerificarDPI = new javax.swing.JMenu();
        JMenuSalirSistema = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Programar Cita Migración");
        setResizable(false);

        JMenuGenerarCita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/gtk-new.png"))); // NOI18N
        JMenuGenerarCita.setText("Generar Cita");
        JMenuGenerarCita.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JMenuGenerarCita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                GenerarCita(evt);
            }
        });
        JMenuBar.add(JMenuGenerarCita);

        JMenuVerificarDPI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/gtk-new.png"))); // NOI18N
        JMenuVerificarDPI.setText("Verificación DPI");
        JMenuVerificarDPI.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JMenuVerificarDPI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JMenuVerificarDPIGenerarCita(evt);
            }
        });
        JMenuBar.add(JMenuVerificarDPI);

        JMenuSalirSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/application-exit.png"))); // NOI18N
        JMenuSalirSistema.setText("Salir del sistema");
        JMenuSalirSistema.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JMenuSalirSistema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SalirSistema(evt);
            }
        });
        JMenuBar.add(JMenuSalirSistema);

        setJMenuBar(JMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JDesktopPaneSistema, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JDesktopPaneSistema, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void GenerarCita(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GenerarCita
        FrmCitas frmCitas = new FrmCitas();
        JDesktopPaneSistema.add(frmCitas);
        frmCitas.setVisible(true);
    }//GEN-LAST:event_GenerarCita

    private void SalirSistema(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirSistema
        System.exit(0);
    }//GEN-LAST:event_SalirSistema

    private void JMenuVerificarDPIGenerarCita(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMenuVerificarDPIGenerarCita
        FrmVerificarDPI frmVerificarDPI = new FrmVerificarDPI();
        JDesktopPaneSistema.add(frmVerificarDPI);
        frmVerificarDPI.setVisible(true);
    }//GEN-LAST:event_JMenuVerificarDPIGenerarCita

    public static void main(String args[]) {
        
        /*Por: Diego Vásquez
        Utilización de Libreria FlatLaF para Interfaz Gráfica de Usuario*/
        
        try{
            UIManager.setLookAndFeel(new FlatLightLaf());
        }
        catch(UnsupportedLookAndFeelException ex){
            JOptionPane.showMessageDialog(null, "Error Interfaz Gráfica", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new FrmContenedor().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane JDesktopPaneSistema;
    private javax.swing.JMenuBar JMenuBar;
    private javax.swing.JMenu JMenuGenerarCita;
    private javax.swing.JMenu JMenuSalirSistema;
    private javax.swing.JMenu JMenuVerificarDPI;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}