/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.redone.reportes;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfImage;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.redone.modelos.HotspotUser;
import java.awt.Image;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.printing.PDFPageable;

/**
 *
 * @author Elliot
 */
public class pdfUsuariosCreados {

    List<HotspotUser> users = new ArrayList<>();
    ImageIcon icon;

    public pdfUsuariosCreados( List<HotspotUser> users,ImageIcon icon) {
        this.users = users;
        this.icon = icon;
    }

    public void generar_y_guardar(int opcion) {
        try {
            
            if (opcion == 1) {
                JFileChooser guardar = new JFileChooser();                
                guardar.setApproveButtonText("Guardar");
                guardar.showSaveDialog(null);
                String ruta = guardar.getSelectedFile().getPath();
                gerarDoc(ruta+".pdf",users,icon);

            } else if(opcion == 2) {
                PDDocument document;
                try {
                    String home = System.getProperty("user.home");
                    String separator = System.getProperty("file.separator");
                    
                    String ruta = home + separator + "dinamico.pdf";
                    gerarDoc(ruta,users,icon);
                                        
                    PrinterJob job = PrinterJob.getPrinterJob();
                    document = PDDocument.load(new File(ruta));

                    if (job.printDialog() == true) {
                        job.setPageable(new PDFPageable(document));
                        job.print();
                    }
                    
                   File file = new File(ruta);
                   if(file.exists()){
                       file.delete();
                   } 
                } catch (IOException ex) {
                   // Logger.getLogger(mainTest.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL GUARDAR ARCHIVO:" + e.getMessage(), "", JOptionPane.ERROR_MESSAGE);
        }
    }

    public Document gerarDoc(String ruta,List<HotspotUser>users,ImageIcon icono) {
        // Se crea el documento
        Document documento = new Document();
        try {
            documento = new Document(PageSize.A4.rotate());
            FileOutputStream archivo = new FileOutputStream(ruta);
            // lineas sera de 20. Esta llamada debe hacerse antes de abrir el documento
            PdfWriter writer = PdfWriter.getInstance(documento, archivo);
            documento.open();
          
            PdfPTable tabla = new PdfPTable(9);
          
            tabla.setWidths(new float[] {1.2f,0.8f,1,0.8f,0.9f,1.4f,0.8f,1,1});

            for (int i = 0; i < users.size(); i++) {
                
                HotspotUser user = users.get(i);
                
                PdfPCell image = new PdfPCell();
                image.addElement((Element) icono.getImage());
                JLabel label = new JLabel(icon);
                label.setText("hola");
                tabla.addCell(image);
            }
            documento.add(tabla);
            documento.close();
        } catch (Exception e) {
            System.out.println("Error al crear archivo:" + e.getMessage());
        }

        return documento;
    }
}
