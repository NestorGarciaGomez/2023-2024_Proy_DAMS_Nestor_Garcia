/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.concesionariongg.Disenyo;

import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Style;
import com.itextpdf.layout.borders.SolidBorder;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.HorizontalAlignment;
import com.itextpdf.layout.property.TextAlignment;
import com.mongodb.client.FindIterable;
import com.mycompany.Trabajador.MenuPrincipalComercial;
import com.mycompany.concesionariongg.Conexion.Conexion;
import java.awt.Color;
import static java.awt.Component.CENTER_ALIGNMENT;
import java.awt.Font;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
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
public class Disenyo extends javax.swing.JFrame {

    Conexion conexion = new Conexion();
    String marcaFormateado;
    String modeloFormateado;
    String anyo;

    /**
     * Creates new form Disenyo
     */
    public Disenyo() {
        initComponents();
        //Establecemos el titulo de la ventana
        setTitle("CONCESIONARIO NGG");
        //Cambiamos el color del fondo de la ventana
        getContentPane().setBackground(new Color(128, 0, 128));
        //Añadimos el titulo
        jLabelTexto.setFont(new Font("Arial", Font.BOLD, 24));
        jLabelTexto.setForeground(Color.WHITE);
        jLabelTexto.setAlignmentX(CENTER_ALIGNMENT);
        //Añadimos el logo
        String ruta = "C:/Users/nesto/Documents/NetBeansProjects/ConcesionarioNGG/imagenes/logo.png";
        java.awt.Image foto = new ImageIcon(ruta).getImage();
        java.awt.Image nuevaImagen = foto.getScaledInstance(220, 220, java.awt.Image.SCALE_SMOOTH);
        ImageIcon imagen = new ImageIcon(nuevaImagen);
        jLabelLogo.setIcon(imagen);
        jLabelLogo.setAlignmentX(CENTER_ALIGNMENT);
        pack();
        //Decoramos los jlabel
        jLabelMarca.setFont(new Font("Arial", Font.BOLD, 12));
        jLabelMarca.setForeground(Color.WHITE);

        jLabelModelo.setFont(new Font("Arial", Font.BOLD, 12));
        jLabelModelo.setForeground(Color.WHITE);

        jLabelAnyo.setFont(new Font("Arial", Font.BOLD, 12));
        jLabelAnyo.setForeground(Color.WHITE);
        //Decoramos el jlabel que contiene los jCombobox
        jPanelOpciones.setAlignmentX(CENTER_ALIGNMENT);
        Border borde = BorderFactory.createLineBorder(Color.white, 5);
        jPanelOpciones.setBorder(borde);
        jPanelOpciones.setBackground(new Color(128, 0, 128));
        //Decoramos los jlabel
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
        //Decoramos los botones
        jButtonVolver.setFont(new Font("Arial", Font.BOLD, 12));
        jButtonVolver.setBackground(Color.WHITE);
        jButtonPDF.setFont(new Font("Arial", Font.BOLD, 12));
        jButtonPDF.setBackground(Color.WHITE);
        //Modificamos el texto de los jtextfield para que de igual como lo ponga el trabajador
        String marca = jTextFieldMarca.getText().toLowerCase();
        if (!marca.isEmpty()) {
            marcaFormateado = marca.substring(0, 1).toUpperCase() + marca.substring(1);
        } else {
            marcaFormateado = "";
        }
        String modelo = (String) jTextFieldModelo.getText().toLowerCase();
        if (!modelo.isEmpty()) {
            modeloFormateado = modelo.substring(0, 1).toUpperCase() + modelo.substring(1);
        } else {
            modeloFormateado = "";
        }
        //Colocamos la ventana en el medio de la pantalla
        setLocationRelativeTo(null);
        //Llamamos al metodo para rellenar los jcombobox
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

        jButtonVolver = new javax.swing.JButton();
        jButtonPDF = new javax.swing.JButton();
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
        jTextFieldMarca = new javax.swing.JTextField();
        jLabelMarca = new javax.swing.JLabel();
        jTextFieldModelo = new javax.swing.JTextField();
        jTextFieldAnyo = new javax.swing.JTextField();
        jLabelModelo = new javax.swing.JLabel();
        jLabelAnyo = new javax.swing.JLabel();
        jLabelTexto = new javax.swing.JLabel();
        jLabelLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(780, 850));

        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        jButtonPDF.setText("PDF");
        jButtonPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPDFActionPerformed(evt);
            }
        });

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

        jTextFieldMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMarcaActionPerformed(evt);
            }
        });

        jLabelMarca.setText("Marca");

        jTextFieldModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldModeloActionPerformed(evt);
            }
        });

        jLabelModelo.setText("Modelo");

        jLabelAnyo.setText("Año:");

        jLabelTexto.setText("CONCESIONARIO NGG");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonVolver)
                        .addGap(606, 606, 606)
                        .addComponent(jButtonPDF))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(184, 184, 184))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabelMarca)
                                    .addGap(272, 272, 272)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelModelo))
                            .addGap(191, 191, 191)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelAnyo)
                                .addComponent(jTextFieldAnyo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(100, 100, 100))
                        .addComponent(jPanelOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabelTexto)
                .addGap(13, 13, 13)
                .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMarca)
                    .addComponent(jLabelModelo)
                    .addComponent(jLabelAnyo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAnyo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonPDF)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonVolver)
                        .addGap(33, 33, 33))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        MenuPrincipalComercial newframe = new MenuPrincipalComercial();

        newframe.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButtonPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPDFActionPerformed

        try {
            crearPdf();
            JOptionPane.showMessageDialog(this, "El Pdf se ha creado correctamente.", "Warning", JOptionPane.WARNING_MESSAGE);
            jTextFieldMarca.setText("");
            jTextFieldModelo.setText("");
            jTextFieldAnyo.setText("");
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButtonPDFActionPerformed

    private void jComboBoxCristalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCristalesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCristalesActionPerformed

    private void jComboBoxTapiceriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTapiceriaActionPerformed


    }//GEN-LAST:event_jComboBoxTapiceriaActionPerformed

    private void jComboBoxLucesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxLucesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxLucesActionPerformed

    private void jTextFieldMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMarcaActionPerformed

    private void jTextFieldModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldModeloActionPerformed

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
            java.util.logging.Logger.getLogger(Disenyo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Disenyo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Disenyo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Disenyo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Disenyo().setVisible(true);
            }
        });
    }

    private void rellenarComboBox() {
        //Borramos todos los items de los jcombobox
        jComboBoxTapiceria.removeAllItems();
        jComboBoxLuces.removeAllItems();
        jComboBoxLlantas.removeAllItems();
        jComboBoxPintura.removeAllItems();
        jComboBoxCristales.removeAllItems();
        jComboBoxAleron.removeAllItems();
        jComboBoxAsientos.removeAllItems();
        //Creamos el filtro para rellenar los jcombobox con los datos que corresponden
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

    private void crearPdf() throws MalformedURLException {
        //Modificamos el texto de los jtextfield para que salgan con la primera letra en mayuscula
        String marca = jTextFieldMarca.getText().toLowerCase();
        if (!marca.isEmpty()) {
            marcaFormateado = marca.substring(0, 1).toUpperCase() + marca.substring(1);
        } else {
            marcaFormateado = "";
        }
        String modelo = (String) jTextFieldModelo.getText().toLowerCase();
        if (!modelo.isEmpty()) {
            modeloFormateado = modelo.substring(0, 1).toUpperCase() + modelo.substring(1);
        } else {
            modeloFormateado = "";
        }
        anyo = jTextFieldAnyo.getText();
        //Pasamos los datos seleccionados de los jcombobox al pdf
        Random random = new Random();
        int precioTotal = random.nextInt(4001) + 2000;
        String tapiceria = (String) jComboBoxTapiceria.getSelectedItem();
        String luces = (String) jComboBoxLuces.getSelectedItem();
        String llantas = (String) jComboBoxLlantas.getSelectedItem();
        String pintura = (String) jComboBoxPintura.getSelectedItem();
        String cristales = (String) jComboBoxCristales.getSelectedItem();
        String aleron = (String) jComboBoxAleron.getSelectedItem();
        String asientos = (String) jComboBoxAsientos.getSelectedItem();
        String archivo = "C:/Users/nesto/Desktop/ResumenPersonalizacion.pdf";
        String titulos = "CONCESIONARIOS NGG:Resumen Personalizacion";
        String parrafo = "El cliente durante el proceso de venta ha solicitado un pack de personalizacion para su vehiculo personal. Y desea tener en un documento guardada toda la infromacion de la personalizacion,por ello se le hace entrega de este documento donde el cliente,conforme con su decisión,puede consultar toda la información de la personalización solicitada.Este documento queda aprobado por ConcesionariosNGG para ser entregado al cliente correspondiente.";

        try {
            // Crear un escritor de PDF
            PdfWriter writer = new PdfWriter(archivo);
            // Crear documento PDF
            PdfDocument pdf = new PdfDocument(writer);
            // Crear un documento de iText
            com.itextpdf.layout.Document documento = new com.itextpdf.layout.Document(pdf);

            // Agregar título
            Style estiloTitulo = new Style();
            estiloTitulo.setFontSize(22).setBold().setTextAlignment(TextAlignment.CENTER);
            Paragraph titulo = new Paragraph(titulos).addStyle(estiloTitulo.setBorderBottom(new SolidBorder(new DeviceRgb(0, 0, 0), 1)));
            documento.add(titulo);

            // Agregar un párrafo
            Style estiloParrafo = new Style();
            estiloParrafo.setFontSize(10);
            Paragraph parrafos = new Paragraph(parrafo).addStyle(estiloParrafo).setTextAlignment(TextAlignment.JUSTIFIED);
            documento.add(parrafos);

            //Añadir datos empresa
            Paragraph nombreEmpleado = new Paragraph("Nombre:Nestor Garcia Gomez.").setFontSize(10).setTextAlignment(TextAlignment.LEFT);
            documento.add(nombreEmpleado);
            Paragraph nombreEmpresa = new Paragraph("Nombre de la empresa:ConcesionariosNGG.").setFontSize(10).setTextAlignment(TextAlignment.LEFT);
            documento.add(nombreEmpresa);
            Paragraph nif = new Paragraph("CIF:P4516225B.").setFontSize(10).setTextAlignment(TextAlignment.LEFT);
            documento.add(nif);
            Paragraph direccion = new Paragraph("Dirección: Carrer de la Corona D'Arago, 1.").setFontSize(10).setTextAlignment(TextAlignment.LEFT);
            documento.add(direccion);
            Paragraph provincia = new Paragraph("Provincia:Valencia.").setFontSize(10).setTextAlignment(TextAlignment.LEFT);
            documento.add(provincia);
            Paragraph ciudad = new Paragraph("Ciudad:Torrent.").setFontSize(10).setTextAlignment(TextAlignment.LEFT);
            documento.add(ciudad);
            Paragraph codigoPostal = new Paragraph("Código Postal:46900.").setFontSize(10).setTextAlignment(TextAlignment.LEFT);
            documento.add(codigoPostal);
            Paragraph telefono = new Paragraph("Teléfono:722630143.").setFontSize(10).setTextAlignment(TextAlignment.LEFT);
            documento.add(telefono);

            //Añadir Tabla datos
            Table tabla = new Table(2).setMarginBottom(20).setTextAlignment(TextAlignment.CENTER);
            tabla.addCell("MARCA").setBold().setFontSize(18);
            tabla.addCell(marcaFormateado).setFontSize(12);
            tabla.addCell("MODELO").setBold().setFontSize(18);
            tabla.addCell(modeloFormateado).setFontSize(12);
            tabla.addCell("AÑO").setBold().setFontSize(18);
            tabla.addCell(anyo).setFontSize(12);
            tabla.addCell("TAPICERIA").setBold().setFontSize(18);
            tabla.addCell(tapiceria).setFontSize(12);
            tabla.addCell("LUCES").setBold().setFontSize(18);
            tabla.addCell(luces).setFontSize(12);
            tabla.addCell("LLANTAS").setBold().setFontSize(18);
            tabla.addCell(llantas).setFontSize(12);
            tabla.addCell("PINTURA").setBold().setFontSize(18);
            tabla.addCell(pintura).setFontSize(12);
            tabla.addCell("CRISTALES").setBold().setFontSize(18);
            tabla.addCell(cristales).setFontSize(12);
            tabla.addCell("ALERON").setBold().setFontSize(18);
            tabla.addCell(aleron).setFontSize(12);
            tabla.addCell("ASIENTOS").setBold().setFontSize(18);
            tabla.addCell(asientos).setFontSize(12);
            tabla.addCell("Coste Total del pack de personalizacion:").setBold().setFontSize(18);
            tabla.addCell(precioTotal + "€").setFontSize(12);
            tabla.setHorizontalAlignment(HorizontalAlignment.CENTER);
            documento.add(tabla);

            //Añadir imagen
            Image imagen = new Image(ImageDataFactory.create("C:/Users/nesto/Documents/NetBeansProjects/ConcesionarioNGG/imagenes/logo.png"));
            imagen.scaleToFit(200, 200);
            imagen.setHorizontalAlignment(HorizontalAlignment.CENTER).setMarginBottom(5);
            documento.add(imagen);

            //Añadir Fechay hora del documento
            LocalDate fecha = LocalDate.now();
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            String fechaformato = fecha.format(formato);
            LocalTime hora = LocalTime.now();
            DateTimeFormatter formatoh = DateTimeFormatter.ofPattern("HH:mm");
            String horaformato = hora.format(formatoh);

            Paragraph fechayhora = new Paragraph("Valencia," + fechaformato + " a las " + horaformato + " horas.").setFontSize(10).setTextAlignment(TextAlignment.RIGHT).setMarginTop(15);
            documento.add(fechayhora);

            // Cerrar el documento
            documento.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPDF;
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
    private javax.swing.JLabel jLabelCristales;
    private javax.swing.JLabel jLabelLlantas;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelLuces;
    private javax.swing.JLabel jLabelMarca;
    private javax.swing.JLabel jLabelModelo;
    private javax.swing.JLabel jLabelPintura;
    private javax.swing.JLabel jLabelTapiceria;
    private javax.swing.JLabel jLabelTexto;
    private javax.swing.JPanel jPanelOpciones;
    private javax.swing.JTextField jTextFieldAnyo;
    private javax.swing.JTextField jTextFieldMarca;
    private javax.swing.JTextField jTextFieldModelo;
    // End of variables declaration//GEN-END:variables
}
