/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files;

import com.itextpdf.html2pdf.ConverterProperties;
import com.itextpdf.html2pdf.HtmlConverter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author wilmer
 */
public class MAINtEST {
    
   
    public  void convertir(){
        try {
            File file = new File("/home/wilmer/respaldo/var-respaldo/RedOne/HotspotContrller/RedOneHotspotController/src/files/ficha.html");
            File filPdf = new File("/home/wilmer/respaldo/var-respaldo/RedOne/HotspotContrller/RedOneHotspotController/src/files/ficha.pdf");
            ConverterProperties converterProperties = new ConverterProperties();
			HtmlConverter.convertToPdf(new FileInputStream(file), new FileOutputStream(filPdf),
					converterProperties);
            
        } catch (Exception e) {
            System.out.println("Error :"+e.getMessage());
        }
        
    }
    
}
