/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion;

/**
 *
 * @author eduar
 */
public class PantallaInicio extends javax.swing.JFrame {
PantallaMesas pm;
pantallaRegistroCliente RC;
PantallaRegistroMeseros RM;
PantallaMenuMeseros MM;
pantallaCancelarReservacion CR;
    /**
     * Creates new form PantallaInicio
     */
    public PantallaInicio() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnMapaMesas = new javax.swing.JButton();
        btnCancelarReservacion = new javax.swing.JButton();
        btnRegistrarReservacion = new javax.swing.JButton();
        btnRegistrarCliente = new javax.swing.JButton();
        btnRegistrarMesero1 = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Bienvenido");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 280, 60));

        btnMapaMesas.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        btnMapaMesas.setText("Mapa de Mesas");
        btnMapaMesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMapaMesasActionPerformed(evt);
            }
        });
        jPanel1.add(btnMapaMesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, -1));

        btnCancelarReservacion.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        btnCancelarReservacion.setText("Cancelar Reservacion");
        btnCancelarReservacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarReservacionActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelarReservacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, -1, -1));

        btnRegistrarReservacion.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        btnRegistrarReservacion.setText("Registrar Reservacion");
        btnRegistrarReservacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarReservacionActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarReservacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, -1, -1));

        btnRegistrarCliente.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        btnRegistrarCliente.setText("Registrar Cliente");
        btnRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarClienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, -1, -1));

        btnRegistrarMesero1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        btnRegistrarMesero1.setText("Meseros");
        btnRegistrarMesero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarMesero1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarMesero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/fondoResta.jpg"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMapaMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMapaMesasActionPerformed
        pm = new PantallaMesas();
        pm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMapaMesasActionPerformed

    private void btnRegistrarReservacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarReservacionActionPerformed
        pm = new PantallaMesas();
        pm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegistrarReservacionActionPerformed

    private void btnRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarClienteActionPerformed
        RC = new pantallaRegistroCliente();
        RC.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegistrarClienteActionPerformed

    private void btnCancelarReservacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarReservacionActionPerformed
        CR = new pantallaCancelarReservacion();
        CR.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelarReservacionActionPerformed

    private void btnRegistrarMesero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarMesero1ActionPerformed
        MM = new PantallaMenuMeseros();
        MM.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegistrarMesero1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PantallaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnCancelarReservacion;
    private javax.swing.JButton btnMapaMesas;
    private javax.swing.JButton btnRegistrarCliente;
    private javax.swing.JButton btnRegistrarMesero1;
    private javax.swing.JButton btnRegistrarReservacion;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
