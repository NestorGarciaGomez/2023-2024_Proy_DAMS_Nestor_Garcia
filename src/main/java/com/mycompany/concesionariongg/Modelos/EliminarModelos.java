/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.concesionariongg.Modelos;

import com.mycompany.concesionariongg.Conexion.Conexion;
import java.awt.Color;
import static java.awt.Component.CENTER_ALIGNMENT;
import java.awt.Font;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import org.bson.Document;

/**
 *
 * @author nesto
 */
public class EliminarModelos extends javax.swing.JFrame {

    Conexion conexion = new Conexion();

    /**
     * Creates new form EliminarModelos
     */
    public EliminarModelos() {
        initComponents();
        //Se establece el titulo de la ventana
        setTitle("CONCESIONARIO NGG");
        //Se cambia el color de fondo de la ventana y el jpanel
        getContentPane().setBackground(new Color(128, 0, 128));
        jPanel1.setBackground(new Color(128, 0, 128));

        //Se crea el borde del jpanel
        Border borde = BorderFactory.createLineBorder(Color.white, 5);
        //Cambiamos el color del fondo del jpanel
        jPanelOpciones.setBackground(new Color(128, 0, 128));
        jPanelOpciones.setBorder(borde);

        jLabelTexto.setFont(new Font("Arial", Font.BOLD, 24));
        jLabelTexto.setForeground(Color.WHITE);
        jLabelTexto.setAlignmentX(CENTER_ALIGNMENT);
        //Se añade el logo
        String ruta = "C:/Users/nesto/Documents/NetBeansProjects/ConcesionarioNGG/imagenes/logo.png";
        Image foto = new ImageIcon(ruta).getImage();
        Image nuevaImagen = foto.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
        ImageIcon imagen = new ImageIcon(nuevaImagen);
        jLabelLogo.setIcon(imagen);
        pack();
        //Se decoran los jlabel
        jLabelMarca.setFont(new Font("Arial", Font.BOLD, 12));
        jLabelMarca.setForeground(Color.WHITE);

        jLabelModelo.setFont(new Font("Arial", Font.BOLD, 12));
        jLabelModelo.setForeground(Color.WHITE);

        jLabelMotor.setFont(new Font("Arial", Font.BOLD, 12));
        jLabelMotor.setForeground(Color.WHITE);

        jLabelCombustible.setFont(new Font("Arial", Font.BOLD, 12));
        jLabelCombustible.setForeground(Color.WHITE);

        jLabelKms.setFont(new Font("Arial", Font.BOLD, 12));
        jLabelKms.setForeground(Color.WHITE);

        jLabelAño.setFont(new Font("Arial", Font.BOLD, 12));
        jLabelAño.setForeground(Color.WHITE);

        jLabelPrecio.setFont(new Font("Arial", Font.BOLD, 12));
        jLabelPrecio.setForeground(Color.WHITE);

        jLabelCambio.setFont(new Font("Arial", Font.BOLD, 12));
        jLabelCambio.setForeground(Color.WHITE);

        jLabelEstado.setFont(new Font("Arial", Font.BOLD, 12));
        jLabelEstado.setForeground(Color.WHITE);
        //Se decoran los botones
        jButtonVolver.setFont(new Font("Arial", Font.BOLD, 12));
        jButtonVolver.setBackground(Color.WHITE);

        jButtonEliminar.setFont(new Font("Arial", Font.BOLD, 12));
        jButtonEliminar.setBackground(Color.WHITE);
        //Se coloca la ventana en el medio de la pantalla
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
        jButtonVolver = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jPanelOpciones = new javax.swing.JPanel();
        jLabelMarca = new javax.swing.JLabel();
        jTextFieldMarca = new javax.swing.JTextField();
        jLabelModelo = new javax.swing.JLabel();
        jTextFieldModelo = new javax.swing.JTextField();
        jLabelMotor = new javax.swing.JLabel();
        jTextFieldMotor = new javax.swing.JTextField();
        jLabelCombustible = new javax.swing.JLabel();
        jTextFieldCombustible = new javax.swing.JTextField();
        jLabelKms = new javax.swing.JLabel();
        jTextFieldKm = new javax.swing.JTextField();
        jLabelAño = new javax.swing.JLabel();
        jTextFieldAnyo = new javax.swing.JTextField();
        jLabelPrecio = new javax.swing.JLabel();
        jTextFieldPrecio = new javax.swing.JTextField();
        jLabelCambio = new javax.swing.JLabel();
        jTextFieldCambio = new javax.swing.JTextField();
        jLabelEstado = new javax.swing.JLabel();
        jTextFieldEstado = new javax.swing.JTextField();
        jLabelLogo = new javax.swing.JLabel();
        jLabelTexto = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jLabelMarca.setText("Marca:");

        jLabelModelo.setText("Modelo:");

        jLabelMotor.setText("Motor:");

        jLabelCombustible.setText("Combustible:");

        jLabelKms.setText("Kms:");

        jLabelAño.setText("Año:");

        jLabelPrecio.setText("Precio:");

        jLabelCambio.setText("Cambio:");

        jLabelEstado.setText("Estado:");

        javax.swing.GroupLayout jPanelOpcionesLayout = new javax.swing.GroupLayout(jPanelOpciones);
        jPanelOpciones.setLayout(jPanelOpcionesLayout);
        jPanelOpcionesLayout.setHorizontalGroup(
            jPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMarca)
                    .addComponent(jTextFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelModelo)
                    .addComponent(jTextFieldMotor, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMotor))
                .addGap(30, 30, 30)
                .addGroup(jPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCombustible)
                    .addComponent(jTextFieldCombustible, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAño)
                    .addComponent(jTextFieldAnyo, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldKm, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelKms))
                .addGap(27, 27, 27)
                .addGroup(jPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelOpcionesLayout.createSequentialGroup()
                        .addGroup(jPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPrecio))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelOpcionesLayout.createSequentialGroup()
                        .addGroup(jPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCambio)
                            .addComponent(jTextFieldCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelEstado)
                            .addComponent(jTextFieldEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanelOpcionesLayout.setVerticalGroup(
            jPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOpcionesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMarca)
                    .addComponent(jLabelCombustible)
                    .addComponent(jLabelPrecio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCombustible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelModelo)
                    .addComponent(jLabelKms)
                    .addComponent(jLabelCambio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldKm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMotor)
                    .addComponent(jLabelAño)
                    .addComponent(jLabelEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAnyo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabelTexto.setText("CONCESIONARIO NGG");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jButtonVolver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 654, Short.MAX_VALUE)
                .addComponent(jButtonEliminar)
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(161, 161, 161))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(253, 253, 253))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabelTexto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jPanelOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVolver)
                    .addComponent(jButtonEliminar))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        GestionarModelos newframe = new GestionarModelos();

        newframe.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        // TODO add your handling code here:
        //Se guardan todos los datos introducidos en los jtextfield modificandolos y poniendo la primera letra en mayuscula
        String marca = jTextFieldMarca.getText().toLowerCase();
        String marcaFormateado = marca.substring(0, 1).toUpperCase() + marca.substring(1);
        String modelo = (String) jTextFieldModelo.getText().toLowerCase();
        String modeloFormateado = modelo.substring(0, 1).toUpperCase() + modelo.substring(1);
        String motor = (String) jTextFieldMotor.getText().toLowerCase();
        String motorFormateado = motor.substring(0, 1).toUpperCase() + motor.substring(1);
        String combustible = (String) jTextFieldCombustible.getText().toLowerCase();
        String combustibleFormateado = combustible.substring(0, 1).toUpperCase() + combustible.substring(1);
        String kmString = (String) jTextFieldKm.getText();
        int km = Integer.parseInt(kmString);
        String anyo = (String) jTextFieldAnyo.getText();
        String precioString = (String) jTextFieldPrecio.getText();
        int precio = Integer.parseInt(precioString);
        String cambio = (String) jTextFieldCambio.getText().toLowerCase();
        String cambioFormateado = cambio.substring(0, 1).toUpperCase() + cambio.substring(1);
        String estado = (String) jTextFieldEstado.getText().toLowerCase();
        String estadoFormateado = estado.substring(0, 1).toUpperCase() + estado.substring(1);
        //Se guardan todos los en un docuemento
        Document d1 = new Document();
        d1.append("Marca", marcaFormateado);
        d1.append("Modelo", modeloFormateado);
        d1.append("Motor", motorFormateado);
        d1.append("Combustible", combustibleFormateado);
        d1.append("Km", km);
        d1.append("Anyo", anyo);
        d1.append("Precio", precio);
        d1.append("Cambio", cambioFormateado);
        d1.append("Estado", estadoFormateado);
        //Se crea un filtro con los datos introducidos
        Document filtro = new Document("Marca", marcaFormateado).append("Modelo", modeloFormateado).append("Motor", motorFormateado).append("Combustible", combustibleFormateado).append("Km", km).append("Anyo", anyo).append("Precio", precio).append("Cambio", cambioFormateado).append("Estado", estadoFormateado);
        //Se crea una variable para comprobar si los datos existen
        boolean encontrado = conexion.col_Modelos.find(filtro).iterator().hasNext();

        if (encontrado) {
            //Si existe se avisa por mensaje de que se elimina y se eliminan y se vacian los jtextfield
            JOptionPane.showMessageDialog(this, "Los datos se han eliminado correctamente", "Aviso", JOptionPane.WARNING_MESSAGE);
            conexion.col_Modelos.deleteOne(d1);
            jTextFieldMarca.setText("");
            jTextFieldModelo.setText("");
            jTextFieldMotor.setText("");
            jTextFieldCombustible.setText("");
            jTextFieldKm.setText("");
            jTextFieldAnyo.setText("");
            jTextFieldPrecio.setText("");
            jTextFieldCambio.setText("");
            jTextFieldEstado.setText("");

        } else {
            //Si no existe se avisa por mensaje y se vacian los jtextfield
            JOptionPane.showMessageDialog(this, "Los datos no existen", "Error", JOptionPane.ERROR_MESSAGE);
            jTextFieldMarca.setText("");
            jTextFieldModelo.setText("");
            jTextFieldMotor.setText("");
            jTextFieldCombustible.setText("");
            jTextFieldKm.setText("");
            jTextFieldAnyo.setText("");
            jTextFieldPrecio.setText("");
            jTextFieldCambio.setText("");
            jTextFieldEstado.setText("");
        }

    }//GEN-LAST:event_jButtonEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(EliminarModelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EliminarModelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EliminarModelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EliminarModelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminarModelos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabelAño;
    private javax.swing.JLabel jLabelCambio;
    private javax.swing.JLabel jLabelCombustible;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelKms;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelMarca;
    private javax.swing.JLabel jLabelModelo;
    private javax.swing.JLabel jLabelMotor;
    private javax.swing.JLabel jLabelPrecio;
    private javax.swing.JLabel jLabelTexto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelOpciones;
    private javax.swing.JTextField jTextFieldAnyo;
    private javax.swing.JTextField jTextFieldCambio;
    private javax.swing.JTextField jTextFieldCombustible;
    private javax.swing.JTextField jTextFieldEstado;
    private javax.swing.JTextField jTextFieldKm;
    private javax.swing.JTextField jTextFieldMarca;
    private javax.swing.JTextField jTextFieldModelo;
    private javax.swing.JTextField jTextFieldMotor;
    private javax.swing.JTextField jTextFieldPrecio;
    // End of variables declaration//GEN-END:variables
}