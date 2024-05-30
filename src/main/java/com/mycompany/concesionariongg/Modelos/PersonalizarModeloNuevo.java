/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.concesionariongg.Modelos;

import com.mongodb.client.FindIterable;
import com.mycompany.concesionariongg.Conexion.Conexion;
import java.awt.Color;
import static java.awt.Component.CENTER_ALIGNMENT;
import java.awt.Font;
import java.time.LocalDate;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import org.bson.Document;

/**
 *
 * @author nesto
 */
public class PersonalizarModeloNuevo extends javax.swing.JFrame {

    Conexion conexion = new Conexion();
    public static String marca;
    public static String modelo;
    public static String motor;
    public static String combustible;
    public static String km;
    public static String precio;
    public static String anyo;
    public static String cambio;
    public static String estado;

    /**
     * Creates new form PersonalizarModeloNuevo
     */
    public PersonalizarModeloNuevo() {
        initComponents();
        //Se establece el titulo de la ventana
        setTitle("CONCESIONARIO NGG");
        getContentPane().setBackground(new Color(128, 0, 128));
        //Se añade el titulo
        jLabelTexto.setFont(new Font("Arial", Font.BOLD, 24));
        jLabelTexto.setForeground(Color.WHITE);
        jLabelTexto.setAlignmentX(CENTER_ALIGNMENT);
        //Se añade el logo
        String ruta = "C:/Users/nesto/Documents/NetBeansProjects/ConcesionarioNGG/imagenes/logo.png";
        java.awt.Image foto = new ImageIcon(ruta).getImage();
        java.awt.Image nuevaImagen = foto.getScaledInstance(220, 220, java.awt.Image.SCALE_SMOOTH);
        ImageIcon imagen = new ImageIcon(nuevaImagen);
        jLabelLogo.setIcon(imagen);
        jLabelLogo.setAlignmentX(CENTER_ALIGNMENT);
        pack();
        //Se decoran los jlabel
        jLabelMarca.setFont(new Font("Arial", Font.BOLD, 12));
        jLabelMarca.setForeground(Color.WHITE);
        jLabelMarca.setText("Marca: " + marca);

        jLabelModelo.setFont(new Font("Arial", Font.BOLD, 12));
        jLabelModelo.setForeground(Color.WHITE);
        jLabelModelo.setText("Modelo: " + modelo);

        jLabelMotor.setFont(new Font("Arial", Font.BOLD, 12));
        jLabelMotor.setForeground(Color.WHITE);
        jLabelMotor.setText("Motor: " + motor);

        jLabelCombustible.setFont(new Font("Arial", Font.BOLD, 12));
        jLabelCombustible.setForeground(Color.WHITE);
        jLabelCombustible.setText("Combustible: " + combustible);

        jLabelKm.setFont(new Font("Arial", Font.BOLD, 12));
        jLabelKm.setForeground(Color.WHITE);
        jLabelKm.setText("Km: " + km);

        jLabelAnyo.setFont(new Font("Arial", Font.BOLD, 12));
        jLabelAnyo.setForeground(Color.WHITE);
        jLabelAnyo.setText("Año: " + anyo);

        jLabelPrecio.setFont(new Font("Arial", Font.BOLD, 12));
        jLabelPrecio.setForeground(Color.WHITE);
        jLabelPrecio.setText("Precio: " + precio);

        jLabelCambio.setFont(new Font("Arial", Font.BOLD, 12));
        jLabelCambio.setForeground(Color.WHITE);
        jLabelCambio.setText("Cambio: " + cambio);

        jLabelEstado.setFont(new Font("Arial", Font.BOLD, 12));
        jLabelEstado.setForeground(Color.WHITE);
        jLabelEstado.setText("Estado: " + estado);
        //Se decora el borde del jpanel de las modificaciones
        jPanelOpciones.setAlignmentX(CENTER_ALIGNMENT);
        Border borde = BorderFactory.createLineBorder(Color.white, 5);
        jPanelOpciones.setBorder(borde);
        jPanelOpciones.setBackground(new Color(128, 0, 128));
        //Se decoran los jlabel
        jLabelTapiceria.setText("Tapiceria:");
        jLabelTapiceria.setFont(new Font("Arial", Font.BOLD, 14));
        jLabelTapiceria.setForeground(Color.WHITE);

        jLabelLuces.setText("Luces:");
        jLabelLuces.setFont(new Font("Arial", Font.BOLD, 14));
        jLabelLuces.setForeground(Color.WHITE);

        jLabelLlantas.setText("Llantas:");
        jLabelLlantas.setFont(new Font("Arial", Font.BOLD, 14));
        jLabelLlantas.setForeground(Color.WHITE);

        jLabelPintura.setText("Pintura:");
        jLabelPintura.setFont(new Font("Arial", Font.BOLD, 14));
        jLabelPintura.setForeground(Color.WHITE);

        jLabelCristales.setText("Cristales:");
        jLabelCristales.setFont(new Font("Arial", Font.BOLD, 14));
        jLabelCristales.setForeground(Color.WHITE);

        jLabelAleron.setText("Aleron:");
        jLabelAleron.setFont(new Font("Arial", Font.BOLD, 14));
        jLabelAleron.setForeground(Color.WHITE);

        jLabelAsientos.setText("Asientos:");
        jLabelAsientos.setFont(new Font("Arial", Font.BOLD, 14));
        jLabelAsientos.setForeground(Color.WHITE);
        //Se decoran los botones
        jButtonVolver.setFont(new Font("Arial", Font.BOLD, 12));
        jButtonVolver.setBackground(Color.WHITE);

        jButtonEncargar.setFont(new Font("Arial", Font.BOLD, 12));
        jButtonEncargar.setBackground(Color.WHITE);
        //Se coloca la ventana en el medio de la pantalla
        setLocationRelativeTo(null);
        //Se llama al metodo para rellenar los jcombobox
        rellenarComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelOpciones = new javax.swing.JPanel();
        jLabelTapiceria = new javax.swing.JLabel();
        jComboBoxTapiceria = new javax.swing.JComboBox<>();
        jLabelLlantas = new javax.swing.JLabel();
        jComboBoxLlantas = new javax.swing.JComboBox<>();
        jLabelAleron = new javax.swing.JLabel();
        jComboBoxAleron = new javax.swing.JComboBox<>();
        jLabelLuces = new javax.swing.JLabel();
        jComboBoxLuces = new javax.swing.JComboBox<>();
        jLabelCristales = new javax.swing.JLabel();
        jComboBoxCristales = new javax.swing.JComboBox<>();
        jLabelPintura = new javax.swing.JLabel();
        jComboBoxPintura = new javax.swing.JComboBox<>();
        jLabelAsientos = new javax.swing.JLabel();
        jComboBoxAsientos = new javax.swing.JComboBox<>();
        jLabelMarca = new javax.swing.JLabel();
        jLabelModelo = new javax.swing.JLabel();
        jLabelMotor = new javax.swing.JLabel();
        jLabelCombustible = new javax.swing.JLabel();
        jLabelAnyo = new javax.swing.JLabel();
        jLabelKm = new javax.swing.JLabel();
        jLabelCambio = new javax.swing.JLabel();
        jLabelPrecio = new javax.swing.JLabel();
        jLabelTexto = new javax.swing.JLabel();
        jLabelLogo = new javax.swing.JLabel();
        jButtonVolver = new javax.swing.JButton();
        jButtonEncargar = new javax.swing.JButton();
        jLabelEstado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTapiceria.setText("Tapíceria");

        jComboBoxTapiceria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxTapiceria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTapiceriaActionPerformed(evt);
            }
        });

        jLabelLlantas.setText("Llantas");

        jComboBoxLlantas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabelAleron.setText("Alerón");

        jComboBoxAleron.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabelLuces.setText("Luces");

        jComboBoxLuces.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxLuces.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxLucesActionPerformed(evt);
            }
        });

        jLabelCristales.setText("Cristales");

        jComboBoxCristales.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxCristales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCristalesActionPerformed(evt);
            }
        });

        jLabelPintura.setText("Pintura:");

        jComboBoxPintura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabelAsientos.setText("Asientos");

        jComboBoxAsientos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanelOpcionesLayout = new javax.swing.GroupLayout(jPanelOpciones);
        jPanelOpciones.setLayout(jPanelOpcionesLayout);
        jPanelOpcionesLayout.setHorizontalGroup(
            jPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOpcionesLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelLuces)
                    .addComponent(jComboBoxLuces, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCristales)
                    .addComponent(jComboBoxCristales, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(110, 110, 110)
                .addGroup(jPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelLlantas)
                    .addComponent(jComboBoxAleron, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAleron)
                    .addComponent(jComboBoxLlantas, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxTapiceria, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTapiceria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(jPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPintura)
                    .addComponent(jComboBoxPintura, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAsientos)
                    .addComponent(jComboBoxAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );
        jPanelOpcionesLayout.setVerticalGroup(
            jPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTapiceria, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxTapiceria, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPintura, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelLlantas)
                        .addComponent(jLabelLuces)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxPintura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxLlantas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxLuces, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAsientos)
                    .addComponent(jLabelAleron)
                    .addComponent(jLabelCristales))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxAleron, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxCristales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(116, Short.MAX_VALUE))
        );

        jLabelMarca.setText("Marca:");

        jLabelModelo.setText("Modelo:");

        jLabelMotor.setText("Motor:");

        jLabelCombustible.setText("Combustible:");

        jLabelAnyo.setText("Año:");

        jLabelKm.setText("Km:");

        jLabelCambio.setText("Cambio:");

        jLabelPrecio.setText("Precio:");

        jLabelTexto.setText("CONCESIONARIO NGG");

        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        jButtonEncargar.setText("Encargar");
        jButtonEncargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEncargarActionPerformed(evt);
            }
        });

        jLabelEstado.setText("Estado:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelMarca)
                            .addComponent(jLabelCombustible)
                            .addComponent(jLabelAnyo))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabelModelo)
                                .addGap(206, 206, 206)
                                .addComponent(jLabelMotor))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelKm)
                                    .addComponent(jLabelCambio))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelPrecio, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelEstado, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(134, 134, 134))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonVolver)
                        .addGap(594, 594, 594)
                        .addComponent(jButtonEncargar))
                    .addComponent(jPanelOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(246, 246, 246))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabelTexto)
                .addGap(19, 19, 19)
                .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelModelo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelMarca)
                        .addComponent(jLabelMotor)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelCombustible)
                        .addComponent(jLabelPrecio))
                    .addComponent(jLabelKm, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabelAnyo))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCambio)
                            .addComponent(jLabelEstado))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButtonVolver))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jButtonEncargar)))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxTapiceriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTapiceriaActionPerformed

    }//GEN-LAST:event_jComboBoxTapiceriaActionPerformed

    private void jComboBoxLucesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxLucesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxLucesActionPerformed

    private void jComboBoxCristalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCristalesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCristalesActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        DatosModelo newframe = new DatosModelo();

        newframe.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButtonEncargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEncargarActionPerformed
        // TODO add your handling code here:
        //Cuando se le de al boton se crea una nueva venta,se avisa por mensaje y se elimina el modelo
        LocalDate fecha = LocalDate.now();
        Random random = new Random();
        int precioPersonalizacion = random.nextInt(4001) + 2000;
        int precioModelo = Integer.parseInt(precio);
        int precioTotal = precioPersonalizacion + precioModelo;
        int cantidad = 1;
        Document venta2 = new Document()
                .append("fecha", fecha)
                .append("cantidad", cantidad)
                .append("ingreso", precioTotal);
        conexion.col_Ventas.insertOne(venta2);

        JOptionPane.showMessageDialog(this, "El Modelo ha sido encargado a fabrica correctamente.El coste del Modelo es:" + precioModelo + " € del modelo + " + precioPersonalizacion + " € de la personalizacion = Coste Total: " + precioTotal + " €", "Warning", JOptionPane.WARNING_MESSAGE);
        Document d1 = new Document();
        d1.append("Marca", marca);
        d1.append("Modelo", modelo);
        d1.append("Motor", motor);
        d1.append("Combustible", combustible);
        d1.append("Km", km);
        d1.append("Anyo", anyo);
        d1.append("Precio", precio);
        d1.append("Cambio", cambio);
        d1.append("Estado", estado);
        conexion.col_Modelos.deleteOne(d1);

        Modelos newframe = new Modelos();

        newframe.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_jButtonEncargarActionPerformed

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
            java.util.logging.Logger.getLogger(PersonalizarModeloNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonalizarModeloNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonalizarModeloNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonalizarModeloNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonalizarModeloNuevo().setVisible(true);
            }
        });
    }

    private void rellenarComboBox() {
        //Se borran todos los items de los combobox
        jComboBoxTapiceria.removeAllItems();
        jComboBoxLuces.removeAllItems();
        jComboBoxLlantas.removeAllItems();
        jComboBoxPintura.removeAllItems();
        jComboBoxCristales.removeAllItems();
        jComboBoxAleron.removeAllItems();
        jComboBoxAsientos.removeAllItems();
        //Se crea el filtro para rellenar los jcombobox con los datos que corresponden
        FindIterable<Document> cursor = conexion.col_Disenyo.find();
        for (Document document : cursor) {
            String tapiceria = document.getString("Tapiceria");
            jComboBoxTapiceria.addItem(tapiceria);
            String luces = document.getString("Luces");
            jComboBoxLuces.addItem(luces);
            String llantas = document.getString("Llantas");
            jComboBoxLlantas.addItem(llantas);
            String pintura = document.getString("Pintura");
            jComboBoxPintura.addItem(pintura);
            String cristales = document.getString("Cristales");
            jComboBoxCristales.addItem(cristales);
            String aleron = document.getString("Aleron");
            jComboBoxAleron.addItem(aleron);
            String asientos = document.getString("Asientos");
            jComboBoxAsientos.addItem(asientos);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEncargar;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JComboBox<String> jComboBoxAleron;
    private javax.swing.JComboBox<String> jComboBoxAsientos;
    private javax.swing.JComboBox<String> jComboBoxCristales;
    private javax.swing.JComboBox<String> jComboBoxLlantas;
    private javax.swing.JComboBox<String> jComboBoxLuces;
    private javax.swing.JComboBox<String> jComboBoxPintura;
    private javax.swing.JComboBox<String> jComboBoxTapiceria;
    private javax.swing.JLabel jLabelAleron;
    private javax.swing.JLabel jLabelAnyo;
    private javax.swing.JLabel jLabelAsientos;
    private javax.swing.JLabel jLabelCambio;
    private javax.swing.JLabel jLabelCombustible;
    private javax.swing.JLabel jLabelCristales;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelKm;
    private javax.swing.JLabel jLabelLlantas;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelLuces;
    private javax.swing.JLabel jLabelMarca;
    private javax.swing.JLabel jLabelModelo;
    private javax.swing.JLabel jLabelMotor;
    private javax.swing.JLabel jLabelPintura;
    private javax.swing.JLabel jLabelPrecio;
    private javax.swing.JLabel jLabelTapiceria;
    private javax.swing.JLabel jLabelTexto;
    private javax.swing.JPanel jPanelOpciones;
    // End of variables declaration//GEN-END:variables
}
