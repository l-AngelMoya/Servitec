/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazGrafica;

/**
 *
 * @author Angel Moya
 */
public class PaginaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form PaginaPrincipal
     */
    public PaginaPrincipal() {
        initComponents();
        setTitle("Pagina Principal");
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnEmpleados = new javax.swing.JButton();
        btnDistribuidora = new javax.swing.JButton();
        btnFacturaExt = new javax.swing.JButton();
        btnGasto = new javax.swing.JButton();
        btnClliente = new javax.swing.JButton();
        btnArticulo = new javax.swing.JButton();
        btnTrabajo = new javax.swing.JButton();
        BtnReportes = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        BtnRegresar = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        btnFacturaServ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(683, 515));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/Servitec_logo_small.png"))); // NOI18N

        btnEmpleados.setBackground(new java.awt.Color(0, 204, 255));
        btnEmpleados.setFont(new java.awt.Font("Dutch801 XBd BT", 2, 36)); // NOI18N
        btnEmpleados.setText("Empleados");
        btnEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadosActionPerformed(evt);
            }
        });

        btnDistribuidora.setBackground(new java.awt.Color(0, 204, 255));
        btnDistribuidora.setFont(new java.awt.Font("Dutch801 XBd BT", 2, 36)); // NOI18N
        btnDistribuidora.setText("Distribuidora");
        btnDistribuidora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDistribuidoraActionPerformed(evt);
            }
        });

        btnFacturaExt.setBackground(new java.awt.Color(0, 204, 255));
        btnFacturaExt.setFont(new java.awt.Font("Dutch801 XBd BT", 2, 32)); // NOI18N
        btnFacturaExt.setText("Factura Externa");
        btnFacturaExt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturaExtActionPerformed(evt);
            }
        });

        btnGasto.setBackground(new java.awt.Color(0, 204, 255));
        btnGasto.setFont(new java.awt.Font("Dutch801 XBd BT", 2, 36)); // NOI18N
        btnGasto.setText("Gasto");
        btnGasto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGastoActionPerformed(evt);
            }
        });

        btnClliente.setBackground(new java.awt.Color(0, 204, 255));
        btnClliente.setFont(new java.awt.Font("Dutch801 XBd BT", 2, 36)); // NOI18N
        btnClliente.setText("Cliente");
        btnClliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCllienteActionPerformed(evt);
            }
        });

        btnArticulo.setBackground(new java.awt.Color(0, 204, 255));
        btnArticulo.setFont(new java.awt.Font("Dutch801 XBd BT", 2, 36)); // NOI18N
        btnArticulo.setText("Articulo");
        btnArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArticuloActionPerformed(evt);
            }
        });

        btnTrabajo.setBackground(new java.awt.Color(0, 204, 255));
        btnTrabajo.setFont(new java.awt.Font("Dutch801 XBd BT", 2, 36)); // NOI18N
        btnTrabajo.setText("Trabajo");
        btnTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrabajoActionPerformed(evt);
            }
        });

        BtnReportes.setBackground(new java.awt.Color(0, 204, 255));
        BtnReportes.setFont(new java.awt.Font("Dutch801 XBd BT", 2, 36)); // NOI18N
        BtnReportes.setText("Reportes");

        jLabel2.setFont(new java.awt.Font("Lucida Bright", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("PAGINA PINCIPAL");

        BtnRegresar.setBackground(new java.awt.Color(153, 255, 102));
        BtnRegresar.setFont(new java.awt.Font("MS Reference Serif", 3, 18)); // NOI18N
        BtnRegresar.setText("Regresar");
        BtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarActionPerformed(evt);
            }
        });

        BtnSalir.setBackground(new java.awt.Color(153, 255, 102));
        BtnSalir.setFont(new java.awt.Font("MS Reference Serif", 3, 18)); // NOI18N
        BtnSalir.setText("Salir");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        btnFacturaServ.setBackground(new java.awt.Color(0, 204, 255));
        btnFacturaServ.setFont(new java.awt.Font("Dutch801 XBd BT", 2, 32)); // NOI18N
        btnFacturaServ.setText("Factura Servitec");
        btnFacturaServ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturaServActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnFacturaServ)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDistribuidora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnArticulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnClliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnGasto, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnFacturaExt, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEmpleados)
                            .addComponent(btnClliente))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDistribuidora)
                            .addComponent(btnArticulo))
                        .addGap(73, 73, 73))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnFacturaServ)
                                    .addComponent(btnTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(BtnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 18, Short.MAX_VALUE)))))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnFacturaExt, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnReportes))
                    .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnGasto)
                .addGap(58, 58, 58))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDistribuidoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDistribuidoraActionPerformed
        Distribuidora dis = new Distribuidora();
        dis.setVisible(true);
        dis.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnDistribuidoraActionPerformed

    private void btnCllienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCllienteActionPerformed
        Cliente cliente = new Cliente();
        cliente.setVisible(true); 
        cliente.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnCllienteActionPerformed

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed

            Inicio inicio = new Inicio();
            inicio.setVisible(true); 
            inicio.setLocationRelativeTo(null);
            dispose();

    }//GEN-LAST:event_BtnRegresarActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void btnEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadosActionPerformed
        Empleado e = new Empleado();
        e.setVisible(true); 
        e.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnEmpleadosActionPerformed

    private void btnFacturaServActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturaServActionPerformed
        Trabajo trab = new Trabajo();
        trab.setVisible(true); 
        trab.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnFacturaServActionPerformed

    private void btnTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrabajoActionPerformed
        Trabajo tr = new Trabajo();
        tr.setVisible(true);
        tr.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnTrabajoActionPerformed

    private void btnArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArticuloActionPerformed
        Articulo art = new Articulo();
        art.setVisible(true);
        art.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnArticuloActionPerformed

    private void btnGastoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGastoActionPerformed
        Gasto gast= new Gasto();
        gast.setVisible(true);
        gast.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnGastoActionPerformed

    private void btnFacturaExtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturaExtActionPerformed
        FacturaExterna factExt= new FacturaExterna();
        factExt.setVisible(true);
        factExt.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnFacturaExtActionPerformed

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
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JButton BtnReportes;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JButton btnArticulo;
    private javax.swing.JButton btnClliente;
    private javax.swing.JButton btnDistribuidora;
    private javax.swing.JButton btnEmpleados;
    private javax.swing.JButton btnFacturaExt;
    private javax.swing.JButton btnFacturaServ;
    private javax.swing.JButton btnGasto;
    private javax.swing.JButton btnTrabajo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
