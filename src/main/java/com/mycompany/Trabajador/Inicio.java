/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.Trabajador;

import com.mycompany.concesionariongg.Conexion.Conexion;
import com.mycompany.concesionariongg.Piezas.Piezas;
import com.mycompany.concesionariongg.Gestiones.Gestiones;
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
public class Inicio extends javax.swing.JFrame {

    Conexion conexion = new Conexion();

    /**
     * Creates new form InicioTrabajador
     */
    public Inicio() {
        initComponents();
        //Añadir titulo a la ventana
        setTitle("CONCESIONARIO NGG");
        //Cambiar el color del fondo
        getContentPane().setBackground(new Color(128, 0, 128));
        //Añadir el titulo
        jLabelTexto.setText("CONCESIONARIO NGG");
        jLabelTexto.setFont(new Font("Arial", Font.BOLD, 20));
        jLabelTexto.setAlignmentX(CENTER_ALIGNMENT);
        jLabelTexto.setForeground(Color.WHITE);
        //Añadir el logo
        String ruta = "C:/Users/nesto/Documents/NetBeansProjects/ConcesionarioNGG/imagenes/logo.png";
        Image foto = new ImageIcon(ruta).getImage();
        Image nuevaImagen = foto.getScaledInstance(400, 400, Image.SCALE_SMOOTH);
        ImageIcon imagen = new ImageIcon(nuevaImagen);
        jLabelImagen.setIcon(imagen);
        jLabelImagen.setAlignmentX(CENTER_ALIGNMENT);
        pack();
        //Añadir el texto
        jLabelInicio.setText("INICIO DE SESION:");
        jLabelInicio.setFont(new Font("Arial", Font.BOLD, 16));
        jLabelInicio.setAlignmentX(CENTER_ALIGNMENT);
        jLabelInicio.setForeground(Color.WHITE);
        //Decorar el borde del jpanel de los datos
        Border borde = BorderFactory.createLineBorder(Color.white, 5);
        jPanelInicio.setBorder(borde);
        jPanelInicio.setBackground(new Color(128, 0, 128));
        //Decorar el label del texto
        jLabelUsuario.setText("USUARIO:");
        jLabelUsuario.setFont(new Font("Arial", Font.BOLD, 16));
        jLabelUsuario.setForeground(Color.WHITE);
        //Decorar el label del texto
        jLabelContrasenya.setText("CONTRASEÑA:");
        jLabelContrasenya.setFont(new Font("Arial", Font.BOLD, 16));
        jLabelContrasenya.setForeground(Color.WHITE);
        //Cambiar estetica del boton
        jButtonIniciarSesion.setBackground(Color.WHITE);
        jButtonIniciarSesion.setFont(new Font("Arial", Font.BOLD, 14));
        jButtonIniciarSesion.setForeground(Color.BLACK);

        // Centrar el JFrame en la pantalla
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
        jLabelImagen = new javax.swing.JLabel();
        jPanelInicio = new javax.swing.JPanel();
        jLabelUsuario = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jLabelContrasenya = new javax.swing.JLabel();
        jPasswordContrasenya = new javax.swing.JPasswordField();
        jButtonIniciarSesion = new javax.swing.JButton();
        jLabelInicio = new javax.swing.JLabel();

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
        setBackground(new java.awt.Color(204, 102, 255));

        jLabelTexto.setText("CONCESIONARIO NGG");

        jLabelUsuario.setText("USUARIO:");

        jLabelContrasenya.setText("CONTRASEÑA:");

        jButtonIniciarSesion.setText("Iniciar Sesion");
        jButtonIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelInicioLayout = new javax.swing.GroupLayout(jPanelInicio);
        jPanelInicio.setLayout(jPanelInicioLayout);
        jPanelInicioLayout.setHorizontalGroup(
            jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInicioLayout.createSequentialGroup()
                .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPasswordContrasenya, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelInicioLayout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelInicioLayout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(jLabelUsuario))))
                    .addGroup(jPanelInicioLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jButtonIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelInicioLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabelContrasenya)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanelInicioLayout.setVerticalGroup(
            jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInicioLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabelUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabelContrasenya)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPasswordContrasenya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabelInicio.setText("INICIO DE SESIÓN:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(jPanelInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jLabelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 279, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(250, 250, 250))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(207, 207, 207))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabelTexto)
                .addGap(68, 68, 68)
                .addComponent(jLabelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabelInicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jPanelInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarSesionActionPerformed
        // TODO add your handling code here:
        //Obtenemos los datos de los jtextfield
        String usuario = jTextFieldUsuario.getText();
        char[] textocontrasenya = jPasswordContrasenya.getPassword();
        String contrasenya = new String(textocontrasenya);
        //Creamos los filtros de los datos
        Document filtrorol = new Document("Usuario", usuario);
        Document encontradorol = conexion.col_Trabajadores.find(filtrorol).first();
        Document filtrodatos = new Document("Usuario", usuario).append("Contrasenya", contrasenya);
        boolean encontrado = conexion.col_Trabajadores.find(filtrodatos).iterator().hasNext();

        //Comprobamos si el trabajador existe y su rol para abrir una ventana u otra
        if (encontrado && encontradorol != null) {
            String rol = encontradorol.getString("Rol");
            switch (rol) {
                case "Administrador": {
                    Gestiones newframe = new Gestiones();
                    newframe.setVisible(true);
                    this.dispose();
                    break;
                }
                case "Comercial": {
                    MenuPrincipalComercial newframe = new MenuPrincipalComercial();
                    newframe.setVisible(true);
                    this.dispose();
                    break;
                }
                case "Mecanico": {
                    Piezas newframe = new Piezas();
                    newframe.setVisible(true);
                    this.dispose();
                    break;
                }
                default:
                    break;
            }

        } else {
            JOptionPane.showMessageDialog(this, "El Trabajador no existe", "Error", JOptionPane.ERROR_MESSAGE);
            jTextFieldUsuario.setText("");
            jPasswordContrasenya.setText("");
        }
    }//GEN-LAST:event_jButtonIniciarSesionActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIniciarSesion;
    private javax.swing.JLabel jLabelContrasenya;
    private javax.swing.JLabel jLabelImagen;
    private javax.swing.JLabel jLabelInicio;
    private javax.swing.JLabel jLabelTexto;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelInicio;
    private javax.swing.JPasswordField jPasswordContrasenya;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
