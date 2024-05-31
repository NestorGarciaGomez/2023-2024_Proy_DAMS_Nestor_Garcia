/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.Ingresos;

import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Style;
import com.itextpdf.layout.borders.SolidBorder;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.HorizontalAlignment;
import com.itextpdf.layout.property.TextAlignment;
import com.itextpdf.layout.property.UnitValue;
import com.mongodb.client.FindIterable;
import com.mongodb.client.model.Filters;
import com.mycompany.concesionariongg.Conexion.Conexion;
import java.awt.Color;
import static java.awt.Component.CENTER_ALIGNMENT;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author nesto
 */
public class IngresosAnuales extends javax.swing.JFrame {

    Conexion conexion = new Conexion();
    DefaultTableModel tabla = new DefaultTableModel();
    int sumaIngresos2022 = 0;
    int sumaIngresos2023 = 0;
    int sumaIngresos2024 = 0;

    /**
     * Creates new form GananciasAnuales
     */
    public IngresosAnuales() {
        initComponents();
        //Establecer titulo de la ventana
        setTitle("CONCESIONARIO NGG");
        //Cambiar el color del fondo
        getContentPane().setBackground(new Color(128, 0, 128));
        //Ajustar el panel del fondo
        jPanel1.setLayout(new BoxLayout(jPanel1, BoxLayout.Y_AXIS));
        //Cambiar el color del fondo del panel
        jPanel1.setBackground(new Color(128, 0, 128));
        //Cambiar estetica botones
        jButtonVolver.setFont(new Font("Arial", Font.BOLD, 12));
        jButtonVolver.setBackground(Color.WHITE);
        
        jButtonPdf.setFont(new Font("Arial", Font.BOLD, 12));
        jButtonPdf.setBackground(Color.WHITE);

        //Añadir titulo
        jLabelTitulo.setText("ConcesionarioNGG:Informe Ingresos Anuales");
        jLabelTitulo.setFont(new Font("Arial", Font.BOLD, 20));
        jLabelTitulo.setAlignmentX(CENTER_ALIGNMENT);
        jLabelTitulo.setForeground(Color.WHITE);
        jPanel1.add(jLabelTitulo);

        //Añadir parrafo
        jLabelParrafo.setText("A continuacion puede consultar los ingresos anuales de los últimos años");
        jLabelParrafo.setFont(new Font("Arial", Font.PLAIN, 14));
        jPanel1.add(Box.createVerticalStrut(60));
        jLabelParrafo.setAlignmentX(CENTER_ALIGNMENT);
        jLabelParrafo.setForeground(Color.WHITE);
        jPanel1.add(jLabelParrafo);

        //Añadir Tabla
        crearTabla();
        jTableIngresos.setAlignmentX(CENTER_ALIGNMENT);
        jTableIngresos.setFont(new Font("Arial", Font.BOLD, 12));
        jPanel1.add(jTableIngresos);

        //Añadir grafico
        generarGrafico();
        //Poner la ventana en el centro de la pantalla
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableIngresos = new javax.swing.JTable();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelParrafo = new javax.swing.JLabel();
        jButtonVolver = new javax.swing.JButton();
        jButtonPdf = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableIngresos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTableIngresos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(203, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(195, 195, 195))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelParrafo)
                            .addComponent(jLabelTitulo))
                        .addGap(405, 405, 405))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabelTitulo)
                .addGap(18, 18, 18)
                .addComponent(jLabelParrafo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(178, 178, 178))
        );

        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        jButtonPdf.setText("PDF");
        jButtonPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPdfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonVolver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonPdf)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPdf)
                    .addComponent(jButtonVolver))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        // TODO add your handling code here:
        IngresosInicio newframe = new IngresosInicio();

        newframe.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButtonPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPdfActionPerformed
        try {
            // TODO add your handling code here:
            generarPdf();
            JOptionPane.showMessageDialog(this, "El Pdf se ha creado correctamente.", "Warning", JOptionPane.WARNING_MESSAGE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonPdfActionPerformed

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
            java.util.logging.Logger.getLogger(IngresosAnuales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresosAnuales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresosAnuales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresosAnuales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresosAnuales().setVisible(true);
            }
        });
    }

    private void crearTabla() {
        //Filtros para sacar los datos de cada año
        LocalDate fechaInicial2022 = LocalDate.of(2022, 1, 1);
        LocalDate fechaFinal2022 = LocalDate.of(2022, 12, 31);
        Bson query2022 = Filters.and(
                Filters.gte("fecha", fechaInicial2022),
                Filters.lt("fecha", fechaFinal2022));
        conexion.col_Ventas.find(query2022);
        FindIterable<Document> resultado2022 = conexion.col_Ventas.find(query2022);
        for (Document doc : resultado2022) {
            int ingresos = doc.getInteger("ingreso");
            sumaIngresos2022 += ingresos;
        }

        LocalDate fechaInicial2023 = LocalDate.of(2023, 1, 1);
        LocalDate fechaFinal2023 = LocalDate.of(2023, 12, 31);
        Bson query2023 = Filters.and(
                Filters.gte("fecha", fechaInicial2023),
                Filters.lt("fecha", fechaFinal2023));
        conexion.col_Ventas.find(query2023);
        FindIterable<Document> resultado2023 = conexion.col_Ventas.find(query2023);
        for (Document doc : resultado2023) {
            int ingresos = doc.getInteger("ingreso");
            sumaIngresos2023 += ingresos;
        }

        LocalDate fechaInicial2024 = LocalDate.of(2024, 1, 1);
        LocalDate fechaFinal2024 = LocalDate.of(2024, 12, 31);
        Bson query2024 = Filters.and(
                Filters.gte("fecha", fechaInicial2024),
                Filters.lt("fecha", fechaFinal2024));
        conexion.col_Ventas.find(query2024);
        FindIterable<Document> resultado2024 = conexion.col_Ventas.find(query2024);
        for (Document doc : resultado2024) {
            int ingresos = doc.getInteger("ingreso");
            sumaIngresos2024 += ingresos;
        }

        //Añadimos las columnas de la tabla
        String[] columnas = {"Años", "Ingresos"};
        tabla.setColumnIdentifiers(columnas);

        //Añadimos las filas de la tabla
        Object[][] datos = {
            {"2022", sumaIngresos2022 + "€"},
            {"2023", sumaIngresos2023 + "€"},
            {"2024", sumaIngresos2024 + "€"}
        };
        for (Object[] fila : datos) {
            tabla.addRow(fila);
        }

        jTableIngresos.setModel(tabla);
        jPanel1.add(Box.createVerticalStrut(60));
    }

    private void generarGrafico() {
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        datos.addValue(sumaIngresos2022, "Año", "2022");
        datos.addValue(sumaIngresos2023, "Año", "2023");
        datos.addValue(sumaIngresos2024, "Año", "2024");

        // Crear gráfico con los datos
        JFreeChart chart = ChartFactory.createBarChart(
                "Ingresos por Año", // Título
                "Año", // eje X
                "Ingresos", // eje Y
                datos // datos
        );
        //Dibujar el grafico
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(180, 180));
        jPanel1.add(chartPanel);
        jPanel1.add(Box.createVerticalStrut(60));

    }

    private void generarPdf() throws IOException {
        String archivo = "C:/Users/nesto/Desktop/InformeIngresosAnuales.pdf";
        String titulos = "CONCESIONARIOS NGG:Informe Beneficios Anuales";
        String parrafo = "A continuacion se puede comprobar el registro de Ingresos anuales realizado por la empresa ConesionarioNGG.Este documento contiene informacion privada,por lo tanto queda totalmente prohibido ser compartido,excepto con fines empresariales.";
        try {
            //Creamos el escritor del pdf
            PdfWriter writer = new PdfWriter(archivo);
            //Creamos el documento con formato pdf
            PdfDocument pdf = new PdfDocument(writer);
            //Le damos el formato al documento
            com.itextpdf.layout.Document documento = new com.itextpdf.layout.Document(pdf);

            // Agregar título
            Style estiloTitulo = new Style();
            estiloTitulo.setFontSize(22).setBold().setTextAlignment(TextAlignment.CENTER);
            Paragraph titulo = new Paragraph(titulos).addStyle(estiloTitulo.setBorderBottom(new SolidBorder(new DeviceRgb(0, 0, 0), 1)));
            documento.add(titulo);

            // Agregar un párrafo
            Style estiloParrafo = new Style();
            estiloParrafo.setFontSize(10);
            Paragraph parrafos = new Paragraph(parrafo).addStyle(estiloParrafo).setTextAlignment(TextAlignment.JUSTIFIED).setMarginBottom(30);
            documento.add(parrafos);

            // Crear tabla en PDF
            Table tablaPdf = new Table(UnitValue.createPercentArray(new float[]{1, 1}));
            tablaPdf.addCell("AÑOS").setBold().setFontSize(18);
            tablaPdf.addCell("Ingresos").setBold().setFontSize(18);
            for (int i = 0; i < tabla.getRowCount(); i++) {
                tablaPdf.addCell((String) tabla.getValueAt(i, 0)).setFontSize(12);
                tablaPdf.addCell(tabla.getValueAt(i, 1).toString()).setFontSize(12);
            }

            tablaPdf.setHorizontalAlignment(HorizontalAlignment.CENTER).setMarginBottom(30);
            documento.add(tablaPdf);

            DefaultCategoryDataset datos = new DefaultCategoryDataset();
            datos.addValue(sumaIngresos2022, "Año", "2022");
            datos.addValue(sumaIngresos2023, "Año", "2023");
            datos.addValue(sumaIngresos2024, "Año", "2024");

            // Crear gráfico con los datos
            JFreeChart chart = ChartFactory.createBarChart(
                    "Ingresos por Año", // Título
                    "Año", // eje X
                    "Ingresos", // eje Y
                    datos // datos
            );

            ChartPanel chartPanel = new ChartPanel(chart);
            chartPanel.setPreferredSize(new Dimension(180, 180));
            jPanel1.add(chartPanel);
            jPanel1.add(Box.createVerticalStrut(60));

            //Añadir imagen del grafico
            BufferedImage bufferedImage = chart.createBufferedImage(240, 240);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(bufferedImage, "png", baos);
            byte[] imageBytes = baos.toByteArray();
            ImageData imageData = ImageDataFactory.create(imageBytes);
            com.itextpdf.layout.element.Image chartImage = new com.itextpdf.layout.element.Image(imageData);
            chartImage.setHorizontalAlignment(HorizontalAlignment.CENTER).setMarginBottom(30);
            documento.add(chartImage);

            //Añadir Fechay hora del documento
            LocalDate fecha = LocalDate.now();
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            String fechaformato = fecha.format(formato);
            LocalTime hora = LocalTime.now();
            DateTimeFormatter formatoh = DateTimeFormatter.ofPattern("HH:mm");
            String horaformato = hora.format(formatoh);

            Paragraph fechayhora = new Paragraph("Valencia," + fechaformato + " a las " + horaformato + " horas.").setFontSize(10).setTextAlignment(TextAlignment.RIGHT).setMarginTop(15);
            documento.add(fechayhora);

            // Cerrar documento
            documento.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPdf;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabelParrafo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableIngresos;
    // End of variables declaration//GEN-END:variables
}
