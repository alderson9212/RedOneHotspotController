/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.redone.reportes;

import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import com.redone.modelos.HotspotUser;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;

/**
 *
 * @author Elliot
 */
public class mainTest {

    
    
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("C:\\Users\\Elliot\\Documents\\NetBeansProjects\\ApiMikrotik\\src\\Imagenes\\wifi.png");
        List<HotspotUser> lista = new ArrayList<>();
        HotspotUser hot = new HotspotUser();
        hot.setUsername("hola");
        hot.setPassword("mundo");
        hot.setPerfil("hora");
        lista.add(hot);
        // Se crea el documento

        try {
            FileOutputStream archivo = new FileOutputStream("C:\\Users\\Elliot\\Documents\\img.pdf");
            // lineas sera de 20. Esta llamada debe hacerse antes de abrir el documento
            PdfWriter writer = new PdfWriter("C:\\Users\\Elliot\\Documents\\archi.pdf");
            PdfDocument pdfDoc = new PdfDocument(writer);
            Document documento = new Document(pdfDoc);

             for (int i = 0; i < lista.size(); i++) {
                System.out.println("entro");
                HotspotUser user = lista.get(i);
                 System.out.println(""+icon.getImage());
                ImageData imageData = ImageDataFactory.create("C:\\Users\\Elliot\\Documents\\NetBeansProjects\\ApiMikrotik\\src\\Imagenes\\wifi.png");

                // Creating imagedata from image on disk(from given
                // path) using ImageData object
                Image img = new Image(imageData);                
                documento.add(img);
            }
            documento.close();
        } catch (Exception e) {
            System.out.println("Error al crear archivo:" + e.getMessage());
        }

    }
}
