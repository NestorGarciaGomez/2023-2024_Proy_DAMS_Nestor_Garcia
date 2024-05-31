package com.mycompany.concesionariongg.Modelos;

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
import com.mycompany.concesionariongg.Conexion.Conexion;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author nesto
 */
public class DatosModelo extends javax.swing.JFrame {

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

    public DatosModelo() {
        initComponents();
        //Establecemos el titulo de la ventana
        setTitle("CONCESIONARIO NGG");
        //Se establece el tamaño de la ventana
        setPreferredSize(new Dimension(780, 850));
        //Se cambia el color del fondo de la ventana y del jpanel
        getContentPane().setBackground(new Color(128, 0, 128));
        jPanelPrincipal.setBackground(new Color(128, 0, 128));
        //Se establece el layout del jpanel
        jPanelPrincipal.setLayout(new BoxLayout(jPanelPrincipal, BoxLayout.Y_AXIS));

        //Añadir titulo
        jLabelTitulo.setText("ConcesionarioNGG:Resumen" + marca + modelo);
        jLabelTitulo.setFont(new Font("Arial", Font.BOLD, 20));
        jLabelTitulo.setForeground(Color.WHITE);
        jLabelTitulo.setAlignmentX(CENTER_ALIGNMENT);
        jPanelPrincipal.add(jLabelTitulo);

        //Añadir parrafo
        jLabelParrafo.setText("A continuacion puede consultar la informacion del vehiculo solicitado");
        jLabelParrafo.setFont(new Font("Arial", Font.BOLD, 12));
        jLabelParrafo.setForeground(Color.WHITE);
        jPanelPrincipal.add(Box.createVerticalStrut(20));
        jLabelParrafo.setAlignmentX(CENTER_ALIGNMENT);
        jPanelPrincipal.add(jLabelParrafo);

        //Crear Tabla
        crearTabla();
        jPanelPrincipal.add(Box.createVerticalStrut(20));
        jTableInfo.setAlignmentX(CENTER_ALIGNMENT);
        jPanelPrincipal.add(jTableInfo);

        //Añadir imagen
        String ruta = "C:/Users/nesto/Documents/NetBeansProjects/ConcesionarioNGG/imagenes/Modelos/" + marca + modelo + anyo + ".png";
        java.awt.Image foto = new ImageIcon(ruta).getImage();
        foto.getScaledInstance(20, 20, 20);
        ImageIcon imagen = new ImageIcon(foto);
        jLabelImagen.setIcon(imagen);
        jPanelPrincipal.add(Box.createVerticalStrut(20));
        jLabelImagen.setAlignmentX(CENTER_ALIGNMENT);
        jPanelPrincipal.add(jLabelImagen);
        pack();
        jPanelPrincipal.setBorder(BorderFactory.createEmptyBorder(70, 140, 70, 140));
        //Se decoran los botones
        jButtonVolver.setFont(new Font("Arial", Font.BOLD, 12));
        jButtonVolver.setBackground(Color.WHITE);

        jButtonPdf.setFont(new Font("Arial", Font.BOLD, 12));
        jButtonPdf.setBackground(Color.WHITE);

        jButtonVender.setFont(new Font("Arial", Font.BOLD, 12));
        jButtonVender.setBackground(Color.WHITE);
        //Dependiendo del estado del vehículo se modifica el texto del boton
        if (estado.equals("Nuevo")) {
            jButtonVender.setText("Personalizar");
        } else {
            jButtonVender.setText("Vender");
        }

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
        jLabelImagen = new javax.swing.JLabel();
        jPanelPrincipal = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableInfo = new javax.swing.JTable();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelParrafo = new javax.swing.JLabel();
        jButtonPdf = new javax.swing.JButton();
        jButtonVender = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        jTableInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTableInfo);

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGap(317, 317, 317)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGap(387, 387, 387)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelParrafo)
                            .addComponent(jLabelTitulo))))
                .addContainerGap(333, Short.MAX_VALUE))
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelTitulo)
                .addGap(46, 46, 46)
                .addComponent(jLabelParrafo)
                .addGap(76, 76, 76)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(240, Short.MAX_VALUE))
        );

        jButtonPdf.setText("PDF");
        jButtonPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPdfActionPerformed(evt);
            }
        });

        jButtonVender.setText("Vender");
        jButtonVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVenderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelImagen))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jButtonVolver)
                        .addGap(32, 32, 32)
                        .addComponent(jButtonPdf)
                        .addGap(26, 26, 26)
                        .addComponent(jButtonVender)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(570, 570, 570)
                        .addComponent(jLabelImagen))
                    .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVolver)
                    .addComponent(jButtonPdf)
                    .addComponent(jButtonVender))
                .addGap(32, 32, 32))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        Modelos newframe = new Modelos();

        newframe.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButtonPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPdfActionPerformed
        try {

            crearPdf();
            JOptionPane.showMessageDialog(this, "El Pdf se ha creado correctamente.", "Warning", JOptionPane.WARNING_MESSAGE);

        } catch (MalformedURLException ex) {

            ex.printStackTrace();

        }

    }//GEN-LAST:event_jButtonPdfActionPerformed

    private void jButtonVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVenderActionPerformed

        //Depende del estado del vehiculo se pasan a otra ventana para poder modificarlo o se vende directamente el modelo dandole al boton
        if (estado.equals("Nuevo")) {
            PersonalizarModeloNuevo.marca = marca;
            PersonalizarModeloNuevo.modelo = modelo;
            PersonalizarModeloNuevo.motor = motor;
            PersonalizarModeloNuevo.combustible = combustible;
            PersonalizarModeloNuevo.km = km;
            PersonalizarModeloNuevo.precio = precio;
            PersonalizarModeloNuevo.anyo = anyo;
            PersonalizarModeloNuevo.cambio = cambio;
            PersonalizarModeloNuevo.estado = estado;

            PersonalizarModeloNuevo newframe = new PersonalizarModeloNuevo();

            newframe.setVisible(true);

            this.dispose();

        } else {
            //Se añade una nueva venta con los datos correspondientes
            LocalDate fecha = LocalDate.now();
            int ingreso = Integer.parseInt(precio);
            int cantidad = 1;
            Document venta2 = new Document()
                    .append("fecha", fecha)
                    .append("cantidad", cantidad)
                    .append("ingreso", ingreso);
            conexion.col_Ventas.insertOne(venta2);
            //Se avisa por mensaje de la venta y se borra el modelo
            JOptionPane.showMessageDialog(this, "El Vehículo se ha vendido correctamente.", "Warning", JOptionPane.WARNING_MESSAGE);
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
        }

    }//GEN-LAST:event_jButtonVenderActionPerformed

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
            java.util.logging.Logger.getLogger(DatosModelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatosModelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatosModelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatosModelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new DatosModelo().setVisible(true);
            }
        });

    }

    private void crearTabla() {
        //Se le da el formato a la tabla y se añaden las columnas y las filas
        DefaultTableModel tabla = new DefaultTableModel();
        String[] columnas = {"Datos", "Informacion"};
        tabla.setColumnIdentifiers(columnas);
        Object[][] filas = {
            {"Marca", marca},
            {"Modelo", modelo},
            {"Motor", motor},
            {"Combustible", combustible},
            {"Km", km},
            {"Precio", precio},
            {"Anyo", anyo},
            {"Cambio", cambio},
            {"Estado", estado}
        };
        for (Object[] fila : filas) {
            tabla.addRow(fila);
        }
        jTableInfo.setModel(tabla);
        jTableInfo.setFont(new Font("Arial", Font.BOLD, 12));

    }

    private void crearPdf() throws MalformedURLException {
        String archivo = "C:/Users/nesto/Desktop/Resumen" + marca + modelo + anyo + ".pdf";
        String titulos = "CONCESIONARIOS NGG:Resumen " + marca + " " + modelo;
        String parrafo = "El cliente durante el proceso de venta del Modelo ha decidido que sea el vehiculo:" + marca + " " + modelo + " de motor:" + motor + " y " + combustible + ". Y desea tener en un documento guardada toda la infromacion del modelo adquirido,por ello se le hace entrega de este documento donde el cliente,conforme con su decisión,puede consultar toda la información del vehículo solicitado.Este documento queda aprobado por ConcesionariosNGG para ser entregado al cliente correspondiente.";

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
            Table tabla = new Table(2).setMarginBottom(100).setTextAlignment(TextAlignment.CENTER);
            tabla.addCell("MARCA").setBold().setFontSize(18);
            tabla.addCell(marca).setFontSize(12);
            tabla.addCell("MODELO").setBold().setFontSize(18);
            tabla.addCell(modelo).setFontSize(12);
            tabla.addCell("MOTOR").setBold().setFontSize(18);
            tabla.addCell(motor).setFontSize(12);
            tabla.addCell("COMBUSTIBLE").setBold().setFontSize(18);
            tabla.addCell(combustible).setFontSize(12);
            tabla.addCell("KILÓMETROS").setBold().setFontSize(18);
            tabla.addCell(km).setFontSize(12);
            tabla.addCell("AÑO").setBold().setFontSize(18);
            tabla.addCell(anyo).setFontSize(12);
            tabla.addCell("CAMBIO").setBold().setFontSize(18);
            tabla.addCell(cambio).setFontSize(12);
            tabla.addCell("ESTADO").setBold().setFontSize(18);
            tabla.addCell(estado).setFontSize(12);
            tabla.addCell("Coste Total del vehículo:").setBold().setFontSize(18);
            tabla.addCell(precio + "€").setFontSize(12);
            tabla.setHorizontalAlignment(HorizontalAlignment.CENTER).setMarginBottom(20);
            documento.add(tabla);

            //Añadir imagen
            Image imagen = new Image(ImageDataFactory.create("C:/Users/nesto/Documents/NetBeansProjects/ConcesionarioNGG/imagenes/Modelos/" + marca + modelo + anyo + ".png"));
            imagen.scaleToFit(200, 200);
            imagen.setHorizontalAlignment(HorizontalAlignment.CENTER).setMarginBottom(10);
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

            // Cerrar el documento y crearlo
            documento.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPdf;
    private javax.swing.JButton jButtonVender;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabelImagen;
    private javax.swing.JLabel jLabelParrafo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableInfo;
    // End of variables declaration//GEN-END:variables
}
