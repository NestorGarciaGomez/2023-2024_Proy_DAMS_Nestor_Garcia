/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.concesionariongg.Piezas;

import com.mongodb.client.FindIterable;
import com.mycompany.Trabajador.Inicio;
import com.mycompany.concesionariongg.Conexion.Conexion;
import java.awt.Color;
import static java.awt.Component.CENTER_ALIGNMENT;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;

/**
 *
 * @author nesto
 */
public class Piezas extends javax.swing.JFrame {

    Conexion conexion = new Conexion();
    private int seleccionFila;

    /**
     * Creates new form Piezas
     */
    public Piezas() {
        initComponents();
        //Se establece el titulo de la ventana
        setTitle("CONCESIONARIO NGG");
        //Se cambia el color de fondo de la ventana
        getContentPane().setBackground(new Color(128, 0, 128));
        //Se crea el borde para el jpanel
        Border borde = BorderFactory.createLineBorder(Color.white, 5);
        //Se añade el titulo
        jLabelTexto.setFont(new Font("Arial", Font.BOLD, 24));
        jLabelTexto.setForeground(Color.WHITE);
        jLabelTexto.setAlignmentX(CENTER_ALIGNMENT);
        //Se añade el logo
        String ruta = "C:/Users/nesto/Documents/NetBeansProjects/ConcesionarioNGG/imagenes/logo.png";
        java.awt.Image foto = new ImageIcon(ruta).getImage();
        java.awt.Image nuevaImagen = foto.getScaledInstance(130, 130, java.awt.Image.SCALE_SMOOTH);
        ImageIcon imagen = new ImageIcon(nuevaImagen);
        jLabelLogo.setIcon(imagen);
        pack();
        //Se decora el jpanel
        jPanelOpciones.setBorder(borde);
        jPanelOpciones.setBackground(new Color(128, 0, 128));
        //Se decoran los jlabel
        jLabelMarca.setFont(new Font("Arial", Font.BOLD, 12));
        jLabelMarca.setForeground(Color.WHITE);

        jLabelModelo.setFont(new Font("Arial", Font.BOLD, 12));
        jLabelModelo.setForeground(Color.WHITE);

        jLabelAño.setFont(new Font("Arial", Font.BOLD, 12));
        jLabelAño.setForeground(Color.WHITE);
        //Se decoran los botones
        jButtonVolver.setFont(new Font("Arial", Font.BOLD, 12));
        jButtonVolver.setBackground(Color.WHITE);

        jButtonBuscar.setFont(new Font("Arial", Font.BOLD, 12));
        jButtonBuscar.setBackground(Color.WHITE);

        jButtonSiguiente.setFont(new Font("Arial", Font.BOLD, 12));
        jButtonSiguiente.setBackground(Color.WHITE);
        //Se coloca la ventana en mitad de la pantalla
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonBuscar = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTablePiezas = new javax.swing.JTable();
        jButtonSiguiente = new javax.swing.JButton();
        jPanelOpciones = new javax.swing.JPanel();
        jTextFieldMarca = new javax.swing.JTextField();
        jLabelMarca = new javax.swing.JLabel();
        jTextFieldModelo = new javax.swing.JTextField();
        jLabelModelo = new javax.swing.JLabel();
        jTextFieldAnyo = new javax.swing.JTextField();
        jLabelAño = new javax.swing.JLabel();
        jLabelLogo = new javax.swing.JLabel();
        jLabelTexto = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        jTablePiezas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jTablePiezas);

        jButtonSiguiente.setText("Siguiente");
        jButtonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSiguienteActionPerformed(evt);
            }
        });

        jLabelMarca.setText("Marca");

        jLabelModelo.setText("Modelo");

        jLabelAño.setText("Año");

        javax.swing.GroupLayout jPanelOpcionesLayout = new javax.swing.GroupLayout(jPanelOpciones);
        jPanelOpciones.setLayout(jPanelOpcionesLayout);
        jPanelOpcionesLayout.setHorizontalGroup(
            jPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOpcionesLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMarca))
                .addGap(107, 107, 107)
                .addGroup(jPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelModelo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addGroup(jPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldAnyo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAño))
                .addGap(19, 19, 19))
        );
        jPanelOpcionesLayout.setVerticalGroup(
            jPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelOpcionesLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMarca)
                    .addComponent(jLabelModelo)
                    .addComponent(jLabelAño))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAnyo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        jLabelTexto.setText("CONCESIONARIO NGG");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jButtonVolver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonBuscar)
                .addGap(256, 256, 256)
                .addComponent(jButtonSiguiente)
                .addGap(42, 42, 42))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanelOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane3))
                        .addGap(52, 52, 52))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelTexto)
                        .addGap(39, 39, 39)))
                .addComponent(jPanelOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBuscar)
                    .addComponent(jButtonVolver)
                    .addComponent(jButtonSiguiente))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        // TODO add your handling code here:
        //Se guardan los datos introducidos en los jtextfield y se modfican para que tengan la primera letra en mayuscula
        String marca = jTextFieldMarca.getText().toLowerCase();
        String marcaFormateado;
        if (!marca.isEmpty()) {
            marcaFormateado = marca.substring(0, 1).toUpperCase() + marca.substring(1);
        } else {
            marcaFormateado = "";
        }
        String modelo = (String) jTextFieldModelo.getText().toLowerCase();
        String modeloFormateado;
        if (!modelo.isEmpty()) {
            modeloFormateado = modelo.substring(0, 1).toUpperCase() + modelo.substring(1);
        } else {
            modeloFormateado = "";
        }
        String anyo = (String) jTextFieldAnyo.getText();
        //Se llaman a los metodos para filtrar los datos y crear la tabla
        List<Document> filtro = encontrarDatosConElFiltro(marcaFormateado, modeloFormateado, anyo);
        crearTabla(filtro);


    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        Inicio newframe = new Inicio();

        newframe.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButtonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSiguienteActionPerformed
        // TODO add your handling code here:
        pasarDatosFiladeVentana();
        DatosPieza newframe = new DatosPieza();

        newframe.setVisible(true);

        this.dispose();

    }//GEN-LAST:event_jButtonSiguienteActionPerformed
    private List<Document> encontrarDatosConElFiltro(String marca, String modelo, String anyo) {
        //Se crea el filtro con los datos y se filtran
        List<Document> consulta = new ArrayList<>();
        Document filtros = new Document();
        if (!marca.isEmpty()) {
            filtros.append("Marca", marca);
        }
        if (!modelo.isEmpty()) {
            filtros.append("Modelo", modelo);
        }
        if (!anyo.isEmpty()) {
            filtros.append("Anyo", anyo);
        }
        FindIterable<Document> d = conexion.col_Piezas.find(filtros);
        for (Document doc : d) {
            consulta.add(doc);
        }

        return consulta;
    }

    private void crearTabla(List<Document> filtro) {
        //Se le da el modelo a la tabla y se le añaden las columnas y las filas
        DefaultTableModel tabla = new DefaultTableModel();
        String[] columnas = {"Pieza", "Marca", "Modelo", "Anyo", "Precio"};
        tabla.setColumnIdentifiers(columnas);
        jTablePiezas.setModel(tabla);
        jTablePiezas.setRowSelectionAllowed(true);
        for (Document d : filtro) {
            Object[] filas = {d.get("Pieza"), d.get("Marca"), d.get("Modelo"), d.get("Anyo"), d.get("Precio")};
            tabla.addRow(filas);
        }
        jTablePiezas.setFont(new Font("Arial", Font.BOLD, 12));

    }

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
            java.util.logging.Logger.getLogger(Piezas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Piezas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Piezas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Piezas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Piezas().setVisible(true);
            }
        });
    }

    private void pasarDatosFiladeVentana() {
        //Se guardan los datos de la fila de la tabla seleccionada y se pasan de ventana
        seleccionFila = jTablePiezas.getSelectedRow();
        String pieza = String.valueOf(jTablePiezas.getValueAt(seleccionFila, 0));
        String marca = String.valueOf(jTablePiezas.getValueAt(seleccionFila, 1));
        String modelo = String.valueOf(jTablePiezas.getValueAt(seleccionFila, 2));
        String anyo = String.valueOf(jTablePiezas.getValueAt(seleccionFila, 3));
        String precio = String.valueOf(jTablePiezas.getValueAt(seleccionFila, 4));

        DatosPieza.pieza = pieza;
        DatosPieza.marca = marca;
        DatosPieza.modelo = modelo;
        DatosPieza.anyo = anyo;
        DatosPieza.precio = precio;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonSiguiente;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabelAño;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelMarca;
    private javax.swing.JLabel jLabelModelo;
    private javax.swing.JLabel jLabelTexto;
    private javax.swing.JPanel jPanelOpciones;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTablePiezas;
    private javax.swing.JTextField jTextFieldAnyo;
    private javax.swing.JTextField jTextFieldMarca;
    private javax.swing.JTextField jTextFieldModelo;
    // End of variables declaration//GEN-END:variables
}
