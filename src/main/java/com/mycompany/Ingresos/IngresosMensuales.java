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
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
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
public class IngresosMensuales extends javax.swing.JFrame {

    Conexion conexion = new Conexion();
    DefaultTableModel tabla = new DefaultTableModel();
    int sumaIngresosEnero = 0;
    int sumaIngresosFebrero = 0;
    int sumaIngresosMarzo = 0;
    int sumaIngresosAbril = 0;
    int sumaIngresosMayo = 0;
    int sumaIngresosJunio = 0;
    int sumaIngresosJulio = 0;
    int sumaIngresosAgosto = 0;
    int sumaIngresosSeptiembre = 0;
    int sumaIngresosOctubre = 0;
    int sumaIngresosNoviembre = 0;
    int sumaIngresosDiciembre = 0;

    /**
     * Creates new form GananciasMensuales
     */
    public IngresosMensuales() {
        initComponents();
        //Añadir titulo a la ventana
        setTitle("CONCESIONARIO NGG");
        //Cambiar color ventana de fondo
        getContentPane().setBackground(new Color(128, 0, 128));
        // Configurar el layout del JPanel
        jPanel2.setLayout(new BoxLayout(jPanel2, BoxLayout.Y_AXIS));
        //Cambiar el color del fondo del jpanel
        jPanel2.setBackground(new Color(128, 0, 128));
        //Cambiar estetica botones
        jButtonVolver.setFont(new Font("Arial", Font.BOLD, 12));
        jButtonVolver.setBackground(Color.WHITE);
        jButtonPdf.setFont(new Font("Arial", Font.BOLD, 12));
        jButtonPdf.setBackground(Color.WHITE);

        // Añadir título
        JLabel jLabelTitulo = new JLabel("ConcesionarioNGG: Informe Ingresos Mensuales");
        jLabelTitulo.setFont(new Font("Arial", Font.BOLD, 20));
        jLabelTitulo.setForeground(Color.WHITE);
        jLabelTitulo.setAlignmentX(CENTER_ALIGNMENT);
        jPanel2.add(jLabelTitulo);

        // Añadir párrafo
        JLabel jLabelParrafo = new JLabel("A continuación puede consultar los ingresos mensuales de este año");
        jLabelParrafo.setFont(new Font("Arial", Font.BOLD, 14));
        jLabelParrafo.setAlignmentX(CENTER_ALIGNMENT);
        jLabelParrafo.setForeground(Color.WHITE);
        jPanel2.add(Box.createVerticalStrut(60));
        jPanel2.add(jLabelParrafo);

        // Añadir tabla
        crearTabla();
        jPanel2.add(Box.createVerticalStrut(20));
        jTableIngresos.setAlignmentX(CENTER_ALIGNMENT);
        jTableIngresos.setFont(new Font("Arial", Font.BOLD, 12));
        jTableIngresos.setBorder(BorderFactory.createEmptyBorder(20, 40, 20, 40));
        jPanel2.add(jTableIngresos);

        // Añadir gráfico
        jPanel2.add(Box.createVerticalStrut(40));
        generarGrafico();

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

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableIngresos = new javax.swing.JTable();
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
        jScrollPane1.setViewportView(jTableIngresos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(205, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(192, 192, 192))
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
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonVolver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonPdf)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVolver)
                    .addComponent(jButtonPdf))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPdfActionPerformed
        try {
            // TODO add your handling code here:
            generarPdf();
            JOptionPane.showMessageDialog(this, "El Pdf se ha creado correctamente.", "Warning", JOptionPane.WARNING_MESSAGE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonPdfActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        // TODO add your handling code here:
        IngresosInicio newframe = new IngresosInicio();

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
            java.util.logging.Logger.getLogger(IngresosMensuales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresosMensuales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresosMensuales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresosMensuales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresosMensuales().setVisible(true);
            }
        });
    }

    private void crearTabla() {
        //Creamos los filtros de los ingresos de los meses
        LocalDate fechaInicialEnero = LocalDate.of(2024, 1, 1);
        LocalDate fechaFinalEnero = LocalDate.of(2024, 2, 1);
        Bson queryEnero = Filters.and(
                Filters.gte("fecha", fechaInicialEnero),
                Filters.lt("fecha", fechaFinalEnero));
        conexion.col_Ventas.find(queryEnero);
        FindIterable<Document> resultadoEnero = conexion.col_Ventas.find(queryEnero);
        for (Document doc : resultadoEnero) {
            int ingresos = doc.getInteger("ingreso");
            sumaIngresosEnero += ingresos;
        }

        LocalDate fechaInicialFebrero = LocalDate.of(2024, 2, 1);
        LocalDate fechaFinalFebrero = LocalDate.of(2024, 3, 1);
        Bson queryFebrero = Filters.and(
                Filters.gte("fecha", fechaInicialFebrero),
                Filters.lt("fecha", fechaFinalFebrero));
        conexion.col_Ventas.find(queryFebrero);
        FindIterable<Document> resultadoFebrero = conexion.col_Ventas.find(queryFebrero);
        for (Document doc : resultadoFebrero) {
            int ingresos = doc.getInteger("ingreso");
            sumaIngresosFebrero += ingresos;
        }

        LocalDate fechaInicialMarzo = LocalDate.of(2024, 3, 1);
        LocalDate fechaFinalMarzo = LocalDate.of(2024, 4, 1);
        Bson queryMarzo = Filters.and(
                Filters.gte("fecha", fechaInicialMarzo),
                Filters.lt("fecha", fechaFinalMarzo));
        conexion.col_Ventas.find(queryMarzo);
        FindIterable<Document> resultadoMarzo = conexion.col_Ventas.find(queryMarzo);
        for (Document doc : resultadoMarzo) {
            int ingresos = doc.getInteger("ingreso");
            sumaIngresosMarzo += ingresos;
        }

        LocalDate fechaInicialAbril = LocalDate.of(2024, 4, 1);
        LocalDate fechaFinalAbril = LocalDate.of(2024, 5, 1);
        Bson queryAbril = Filters.and(
                Filters.gte("fecha", fechaInicialAbril),
                Filters.lt("fecha", fechaFinalAbril));
        conexion.col_Ventas.find(queryAbril);
        FindIterable<Document> resultadoAbril = conexion.col_Ventas.find(queryAbril);
        for (Document doc : resultadoAbril) {
            int ingresos = doc.getInteger("ingreso");
            sumaIngresosAbril += ingresos;
        }

        LocalDate fechaInicialMayo = LocalDate.of(2024, 5, 1);
        LocalDate fechaFinalMayo = LocalDate.of(2024, 6, 1);
        Bson queryMayo = Filters.and(
                Filters.gte("fecha", fechaInicialMayo),
                Filters.lt("fecha", fechaFinalMayo));
        conexion.col_Ventas.find(queryMayo);
        FindIterable<Document> resultadoMayo = conexion.col_Ventas.find(queryMayo);
        for (Document doc : resultadoMayo) {
            int ingresos = doc.getInteger("ingreso");
            sumaIngresosMayo += ingresos;
        }

        LocalDate fechaInicialJunio = LocalDate.of(2024, 6, 1);
        LocalDate fechaFinalJunio = LocalDate.of(2024, 7, 1);
        Bson queryJunio = Filters.and(
                Filters.gte("fecha", fechaInicialJunio),
                Filters.lt("fecha", fechaFinalJunio));
        conexion.col_Ventas.find(queryJunio);
        FindIterable<Document> resultadoJunio = conexion.col_Ventas.find(queryJunio);
        for (Document doc : resultadoJunio) {
            int ingresos = doc.getInteger("ingreso");
            sumaIngresosJunio += ingresos;
        }
        LocalDate fechaInicialJulio = LocalDate.of(2024, 7, 1);
        LocalDate fechaFinalJulio = LocalDate.of(2024, 8, 1);
        Bson queryJulio = Filters.and(
                Filters.gte("fecha", fechaInicialJulio),
                Filters.lt("fecha", fechaFinalJulio));
        conexion.col_Ventas.find(queryJulio);
        FindIterable<Document> resultadoJulio = conexion.col_Ventas.find(queryJulio);
        for (Document doc : resultadoJulio) {
            int ingresos = doc.getInteger("ingreso");
            sumaIngresosJulio += ingresos;
        }

        LocalDate fechaInicialAgosto = LocalDate.of(2024, 8, 1);
        LocalDate fechaFinalAgosto = LocalDate.of(2024, 9, 1);
        Bson queryAgosto = Filters.and(
                Filters.gte("fecha", fechaInicialAgosto),
                Filters.lt("fecha", fechaFinalAgosto));
        conexion.col_Ventas.find(queryAgosto);
        FindIterable<Document> resultadoAgosto = conexion.col_Ventas.find(queryAgosto);
        for (Document doc : resultadoAgosto) {
            int ingresos = doc.getInteger("ingreso");
            sumaIngresosAgosto += ingresos;
        }

        LocalDate fechaInicialSeptiembre = LocalDate.of(2024, 9, 1);
        LocalDate fechaFinalSeptiembre = LocalDate.of(2024, 10, 1);
        Bson querySeptiembre = Filters.and(
                Filters.gte("fecha", fechaInicialSeptiembre),
                Filters.lt("fecha", fechaFinalSeptiembre));
        conexion.col_Ventas.find(querySeptiembre);
        FindIterable<Document> resultadoSeptiembre = conexion.col_Ventas.find(querySeptiembre);
        for (Document doc : resultadoSeptiembre) {
            int ingresos = doc.getInteger("ingreso");
            sumaIngresosSeptiembre += ingresos;
        }
        LocalDate fechaInicialOctubre = LocalDate.of(2024, 10, 1);
        LocalDate fechaFinalOctubre = LocalDate.of(2024, 11, 1);
        Bson queryOctubre = Filters.and(
                Filters.gte("fecha", fechaInicialOctubre),
                Filters.lt("fecha", fechaFinalOctubre));
        conexion.col_Ventas.find(queryOctubre);
        FindIterable<Document> resultadoOctubre = conexion.col_Ventas.find(queryOctubre);
        for (Document doc : resultadoOctubre) {
            int ingresos = doc.getInteger("ingreso");
            sumaIngresosOctubre += ingresos;
        }

        LocalDate fechaInicialNoviembre = LocalDate.of(2024, 11, 1);
        LocalDate fechaFinalNoviembre = LocalDate.of(2024, 12, 1);
        Bson queryNoviembre = Filters.and(
                Filters.gte("fecha", fechaInicialNoviembre),
                Filters.lt("fecha", fechaFinalNoviembre));
        conexion.col_Ventas.find(queryNoviembre);
        FindIterable<Document> resultadoNoviembre = conexion.col_Ventas.find(queryNoviembre);
        for (Document doc : resultadoNoviembre) {
            int ingresos = doc.getInteger("ingreso");
            sumaIngresosNoviembre += ingresos;
        }

        LocalDate fechaInicialDiciembre = LocalDate.of(2024, 12, 1);
        LocalDate fechaFinalDiciembre = LocalDate.of(2025, 1, 1);
        Bson queryDiciembre = Filters.and(
                Filters.gte("fecha", fechaInicialDiciembre),
                Filters.lt("fecha", fechaFinalDiciembre));
        conexion.col_Ventas.find(queryDiciembre);
        FindIterable<Document> resultadoDiciembre = conexion.col_Ventas.find(queryDiciembre);
        for (Document doc : resultadoDiciembre) {
            int ingresos = doc.getInteger("ingreso");
            sumaIngresosDiciembre += ingresos;
        }

        //Añadimos las columnas de la tabla
        String[] columnas = {"Meses", "Ingresos"};
        tabla.setColumnIdentifiers(columnas);

        //Añadimos las filas de la tabla
        Object[][] datos = {
            {"Enero", sumaIngresosEnero + "€"},
            {"Febrero", sumaIngresosFebrero + "€"},
            {"Marzo", sumaIngresosMarzo + "€"},
            {"Abril", sumaIngresosAbril + "€"},
            {"Mayo", sumaIngresosMayo + "€"},
            {"Junio", sumaIngresosJunio + "€"},
            {"Julio", sumaIngresosJulio + "€"},
            {"Agosto", sumaIngresosAgosto + "€"},
            {"Septiembre", sumaIngresosSeptiembre + "€"},
            {"Octubre", sumaIngresosOctubre + "€"},
            {"Noviembre", sumaIngresosNoviembre + "€"},
            {"Diciembre", sumaIngresosDiciembre + "€"}
        };
        for (Object[] fila : datos) {
            tabla.addRow(fila);
        }

        jTableIngresos.setModel(tabla);
    }

    private void generarGrafico() {
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        datos.addValue(sumaIngresosEnero, "Meses", "Enero");
        datos.addValue(sumaIngresosFebrero, "Meses", "Febrero");
        datos.addValue(sumaIngresosMarzo, "Meses", "Marzo");
        datos.addValue(sumaIngresosAbril, "Meses", "Abril");
        datos.addValue(sumaIngresosMayo, "Meses", "Mayo");
        datos.addValue(sumaIngresosJunio, "Meses", "Junio");
        datos.addValue(sumaIngresosJulio, "Meses", "Julio");
        datos.addValue(sumaIngresosAgosto, "Meses", "Agosto");
        datos.addValue(sumaIngresosSeptiembre, "Meses", "Septiembre");
        datos.addValue(sumaIngresosOctubre, "Meses", "Octubre");
        datos.addValue(sumaIngresosNoviembre, "Meses", "Noviembre");
        datos.addValue(sumaIngresosDiciembre, "Meses", "Diciembre");

        // Crear gráfico con los datos
        JFreeChart chart = ChartFactory.createBarChart(
                "Ingresos por Meses", // Título
                "Meses", // eje X
                "Ingresos", // eje Y
                datos // datos
        );
        //Dibujar el grafico
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(180, 180));
        jPanel2.add(chartPanel);
        jPanel2.add(Box.createVerticalStrut(60));

    }

    private void generarPdf() throws IOException {
        String archivo = "C:/Users/nesto/Desktop/InformeIngresosMensuales.pdf";
        String titulos = "CONCESIONARIOS NGG:Informe Beneficios Mensuales";
        String parrafo = "A continuacion se puede comprobar el registro de Ingresos mensuales realizado por la empresa ConesionarioNGG.Este documento contiene informacion privada,por lo tanto queda totalmente prohibido ser compartido,excepto con fines empresariales.";
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
            tablaPdf.addCell("MESES").setBold().setFontSize(18);
            tablaPdf.addCell("Ingresos").setBold().setFontSize(18);
            for (int i = 0; i < tabla.getRowCount(); i++) {
                tablaPdf.addCell((String) tabla.getValueAt(i, 0)).setFontSize(12);
                tablaPdf.addCell(tabla.getValueAt(i, 1).toString()).setFontSize(12);
            }

            tablaPdf.setHorizontalAlignment(HorizontalAlignment.CENTER).setMarginBottom(30);
            documento.add(tablaPdf);

            DefaultCategoryDataset datos = new DefaultCategoryDataset();
            datos.addValue(sumaIngresosEnero, "Meses", "Enero");
            datos.addValue(sumaIngresosFebrero, "Meses", "Febrero");
            datos.addValue(sumaIngresosMarzo, "Meses", "Marzo");
            datos.addValue(sumaIngresosAbril, "Meses", "Abril");
            datos.addValue(sumaIngresosMayo, "Meses", "Mayo");
            datos.addValue(sumaIngresosJunio, "Meses", "Junio");
            datos.addValue(sumaIngresosJulio, "Meses", "Julio");
            datos.addValue(sumaIngresosAgosto, "Meses", "Agosto");
            datos.addValue(sumaIngresosSeptiembre, "Meses", "Septiembre");
            datos.addValue(sumaIngresosOctubre, "Meses", "Octubre");
            datos.addValue(sumaIngresosNoviembre, "Meses", "Noviembre");
            datos.addValue(sumaIngresosDiciembre, "Meses", "Diciembre");
            // Crear gráfico con los datos
            JFreeChart chart = ChartFactory.createBarChart(
                    "Ingresos por Meses", // Título
                    "Meses", // eje X
                    "Ingresos", // eje Y
                    datos // datos
            );
            //Dibujamos la imagen del grafico
            BufferedImage bufferedImage = chart.createBufferedImage(900, 240);
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableIngresos;
    // End of variables declaration//GEN-END:variables
}
