/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.concesionariongg.Gestiones;

import com.mycompany.Ingresos.IngresosInicio;
import com.mycompany.Trabajador.Inicio;
import com.mycompany.Ventas.VentasInicio;
import com.mycompany.concesionariongg.Piezas.GestionarPiezas;
import com.mycompany.concesionariongg.Modelos.GestionarModelos;
import java.awt.Color;
import static java.awt.Component.CENTER_ALIGNMENT;
import java.awt.Font;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.border.Border;

/**
 *
 * @author nesto
 */
public class Gestiones extends javax.swing.JFrame {

    /**
     * Creates new form GestionarStock
     */
    public Gestiones() {
        initComponents();
        //Establecemos el titulo de la ventana
        setTitle("CONCESIONARIO NGG");
        //Cambiamos el color de fondo de la ventana
        getContentPane().setBackground(new Color(128, 0, 128));
        //Cambiamos el color de fondo del jpanel de los botones
        jPanel1.setBackground(new Color(128, 0, 128));
        //Añadimos el titulo
        jLabelTexto.setText("MENÚ GESTIONES");
        jLabelTexto.setFont(new Font("Arial", Font.BOLD, 20));
        jLabelTexto.setAlignmentX(CENTER_ALIGNMENT);
        jLabelTexto.setForeground(Color.WHITE);
        //Añadimos el logo
        String ruta = "C:/Users/nesto/Documents/NetBeansProjects/ConcesionarioNGG/imagenes/logo.png";
        Image foto = new ImageIcon(ruta).getImage();
        Image nuevaImagen = foto.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
        ImageIcon imagen = new ImageIcon(nuevaImagen);
        jLabelLogo.setIcon(imagen);
        jLabelLogo.setAlignmentX(CENTER_ALIGNMENT);
        pack();
        //Decoramos el texto
        jLabelGestiones.setFont(new Font("Arial", Font.BOLD, 16));
        jLabelGestiones.setForeground(Color.WHITE);
        jLabelGestiones.setAlignmentX(CENTER_ALIGNMENT);
        //Decoramos el jpanel de los botones
        jPanelOpciones.setAlignmentX(CENTER_ALIGNMENT);
        Border borde = BorderFactory.createLineBorder(Color.white, 5);
        jPanelOpciones.setBorder(borde);
        jPanelOpciones.setBackground(new Color(128, 0, 128));
        //Decoramos los botones
        jButtonModelos.setFont(new Font("Arial", Font.BOLD, 12));
        jButtonModelos.setBackground(Color.WHITE);

        jButtonPiezas.setFont(new Font("Arial", Font.BOLD, 12));
        jButtonPiezas.setBackground(Color.WHITE);

        jButtonVentas.setFont(new Font("Arial", Font.BOLD, 12));
        jButtonVentas.setBackground(Color.WHITE);

        jButtonIngresos.setFont(new Font("Arial", Font.BOLD, 12));
        jButtonIngresos.setBackground(Color.WHITE);

        jButtonVolver.setFont(new Font("Arial", Font.BOLD, 12));
        jButtonVolver.setBackground(Color.WHITE);
        //Colocamos la ventana en el centro de la pantalla
        setLocationRelativeTo(null);
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
        jLabelTexto = new javax.swing.JLabel();
        jButtonVolver = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanelOpciones = new javax.swing.JPanel();
        jButtonModelos = new javax.swing.JButton();
        jButtonPiezas = new javax.swing.JButton();
        jButtonVentas = new javax.swing.JButton();
        jButtonIngresos = new javax.swing.JButton();
        jLabelLogo = new javax.swing.JLabel();
        jLabelGestiones = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(850, 780));
        jPanel1.setVerifyInputWhenFocusTarget(false);

        jLabelTexto.setText("MENÚ GESTIONES");

        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 231, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jButtonModelos.setText("MODELOS");
        jButtonModelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModelosActionPerformed(evt);
            }
        });

        jButtonPiezas.setText("PIEZAS");
        jButtonPiezas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPiezasActionPerformed(evt);
            }
        });

        jButtonVentas.setText("VENTAS");
        jButtonVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVentasActionPerformed(evt);
            }
        });

        jButtonIngresos.setText("INGRESOS");
        jButtonIngresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngresosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelOpcionesLayout = new javax.swing.GroupLayout(jPanelOpciones);
        jPanelOpciones.setLayout(jPanelOpcionesLayout);
        jPanelOpcionesLayout.setHorizontalGroup(
            jPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOpcionesLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelOpcionesLayout.createSequentialGroup()
                        .addComponent(jButtonPiezas, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, Short.MAX_VALUE)
                        .addComponent(jButtonIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelOpcionesLayout.createSequentialGroup()
                        .addComponent(jButtonModelos, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56))
        );
        jPanelOpcionesLayout.setVerticalGroup(
            jPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOpcionesLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonModelos, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPiezas, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jLabelGestiones.setText("GESTIONES DISPONIBLES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 107, Short.MAX_VALUE)
                .addComponent(jPanelOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(311, 311, 311)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonVolver)
                        .addGap(384, 384, 384))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelGestiones)
                        .addGap(326, 326, 326))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(249, 249, 249))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabelTexto)
                .addGap(48, 48, 48)
                .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabelGestiones)
                .addGap(18, 18, 18)
                .addComponent(jPanelOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonVolver)
                .addGap(65, 65, 65))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 844, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonModelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModelosActionPerformed
        GestionarModelos newframe = new GestionarModelos();

        newframe.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_jButtonModelosActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        Inicio newframe = new Inicio();

        newframe.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButtonPiezasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPiezasActionPerformed
        GestionarPiezas newframe = new GestionarPiezas();

        newframe.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_jButtonPiezasActionPerformed

    private void jButtonIngresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngresosActionPerformed
        // TODO add your handling code here:
        IngresosInicio newframe = new IngresosInicio();

        newframe.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_jButtonIngresosActionPerformed

    private void jButtonVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVentasActionPerformed
        // TODO add your handling code here:
        VentasInicio newframe = new VentasInicio();

        newframe.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_jButtonVentasActionPerformed

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
            java.util.logging.Logger.getLogger(Gestiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gestiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gestiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gestiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gestiones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIngresos;
    private javax.swing.JButton jButtonModelos;
    private javax.swing.JButton jButtonPiezas;
    private javax.swing.JButton jButtonVentas;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabelGestiones;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelTexto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelOpciones;
    // End of variables declaration//GEN-END:variables
}
