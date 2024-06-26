/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.Ingresos;

import com.mycompany.concesionariongg.Gestiones.Gestiones;
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
public class IngresosInicio extends javax.swing.JFrame {

    /**
     * Creates new form GanaciasInicio
     */
    public IngresosInicio() {
        initComponents();
        //Añadir titulo a la ventana
        setTitle("CONCESIONARIO NGG");
        //Cambiar color del fondo de la ventana
        getContentPane().setBackground(new Color(128, 0, 128));
        //Cambiar estetica boton
        jButtonVolver.setFont(new Font("Arial", Font.BOLD, 12));
        jButtonVolver.setBackground(Color.WHITE);

        //Añadir el titulo
        jLabelTexto.setText("INICIO INGRESOS");
        jLabelTexto.setFont(new Font("Arial", Font.BOLD, 20));
        jLabelTexto.setAlignmentX(CENTER_ALIGNMENT);
        jLabelTexto.setForeground(Color.WHITE);
        //Añadir el logo
        String ruta = "C:/Users/nesto/Documents/NetBeansProjects/ConcesionarioNGG/imagenes/logo.png";
        Image foto = new ImageIcon(ruta).getImage();
        Image nuevaImagen = foto.getScaledInstance(220, 220, Image.SCALE_SMOOTH);
        ImageIcon imagen = new ImageIcon(nuevaImagen);
        jLabelLogo.setIcon(imagen);
        jLabelLogo.setAlignmentX(CENTER_ALIGNMENT);
        pack();
        //Añadir texto
        jLabelOpciones.setFont(new Font("Arial", Font.BOLD, 16));
        jLabelOpciones.setForeground(Color.WHITE);
        jLabelOpciones.setAlignmentX(CENTER_ALIGNMENT);
        //Darle forma al panel de los botones
        jPanelOpciones.setAlignmentX(CENTER_ALIGNMENT);
        Border borde = BorderFactory.createLineBorder(Color.white, 5);
        jPanelOpciones.setBorder(borde);
        jPanelOpciones.setBackground(new Color(128, 0, 128));
        //Cambiar estetica boton
        jButtonMensuales.setFont(new Font("Arial", Font.BOLD, 12));
        jButtonMensuales.setBackground(Color.WHITE);
        jButtonMensuales.setAlignmentX(CENTER_ALIGNMENT);
        jButtonMensuales.setBorder(BorderFactory.createEmptyBorder(40, 60, 40, 60));
        //Cambiar estetica boton
        jButtonAnuales.setAlignmentX(CENTER_ALIGNMENT);
        jButtonAnuales.setFont(new Font("Arial", Font.BOLD, 12));
        jButtonAnuales.setBackground(Color.WHITE);
        jButtonAnuales.setBorder(BorderFactory.createEmptyBorder(40, 60, 40, 60));

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

        jButtonVolver = new javax.swing.JButton();
        jLabelTexto = new javax.swing.JLabel();
        jPanelOpciones = new javax.swing.JPanel();
        jButtonMensuales = new javax.swing.JButton();
        jButtonAnuales = new javax.swing.JButton();
        jLabelOpciones = new javax.swing.JLabel();
        jLabelLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        jLabelTexto.setText("INICIO INGRESOS");

        jButtonMensuales.setText("MENSUALES");
        jButtonMensuales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMensualesActionPerformed(evt);
            }
        });

        jButtonAnuales.setText("ANUALES");
        jButtonAnuales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnualesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelOpcionesLayout = new javax.swing.GroupLayout(jPanelOpciones);
        jPanelOpciones.setLayout(jPanelOpcionesLayout);
        jPanelOpcionesLayout.setHorizontalGroup(
            jPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOpcionesLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonAnuales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonMensuales, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanelOpcionesLayout.setVerticalGroup(
            jPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOpcionesLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jButtonMensuales, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(jButtonAnuales, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        jLabelOpciones.setText("INGRESOS:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(147, 147, 147))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jButtonVolver))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(jPanelOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(389, 389, 389)
                        .addComponent(jLabelOpciones)))
                .addContainerGap(300, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(jLabelTexto)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonVolver)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabelOpciones)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanelOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMensualesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMensualesActionPerformed
        // TODO add your handling code here:
        IngresosMensuales newframe = new IngresosMensuales();

        newframe.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_jButtonMensualesActionPerformed

    private void jButtonAnualesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnualesActionPerformed
        // TODO add your handling code here:
        IngresosAnuales newframe = new IngresosAnuales();

        newframe.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_jButtonAnualesActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        // TODO add your handling code here:
        Gestiones newframe = new Gestiones();

        newframe.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_jButtonVolverActionPerformed

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
            java.util.logging.Logger.getLogger(IngresosInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresosInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresosInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresosInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresosInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnuales;
    private javax.swing.JButton jButtonMensuales;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelOpciones;
    private javax.swing.JLabel jLabelTexto;
    private javax.swing.JPanel jPanelOpciones;
    // End of variables declaration//GEN-END:variables
}
