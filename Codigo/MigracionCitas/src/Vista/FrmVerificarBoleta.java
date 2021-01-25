package Vista;
import Controlador.Boleta;

/**
 *
 * @author diego
 */
public class FrmVerificarBoleta extends javax.swing.JInternalFrame {

    public FrmVerificarBoleta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLabelTitulo = new javax.swing.JLabel();
        JTxtNumBoleta = new javax.swing.JTextField();
        JBtnVerificar = new javax.swing.JButton();

        setClosable(true);
        setResizable(true);
        setTitle("Verificar Boleta Pago");
        setToolTipText("");

        JLabelTitulo.setText("Número de Boleta BANRURAL");

        JBtnVerificar.setText("Verificar");
        JBtnVerificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBtnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnVerificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JBtnVerificar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(JLabelTitulo)
                        .addComponent(JTxtNumBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(JLabelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTxtNumBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JBtnVerificar)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBtnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnVerificarActionPerformed
        
    }//GEN-LAST:event_JBtnVerificarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBtnVerificar;
    private javax.swing.JLabel JLabelTitulo;
    private javax.swing.JTextField JTxtNumBoleta;
    // End of variables declaration//GEN-END:variables
}
