/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logintestapplicationMainPkg;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;

import java.io.FileOutputStream;
import java.util.List;

public class PDFGenerator {
    public static void generatePurchasePDF(List<PurchaseData> purchaseDataList, String pdfFilePath) throws FileNotFoundException {
        Document document = new Document();
        
        try {
            PdfWriter.getInstance(document, new FileOutputStream(pdfFilePath));
            document.open();
            
            Font font = FontFactory.getFont(FontFactory.COURIER, 16, BaseColor.BLACK);
            
            Paragraph title = new Paragraph("Purchase Data Report", font);
            title.setAlignment(Element.ALIGN_CENTER);
            document.add(title);
            document.add(Chunk.NEWLINE);
            
            for (PurchaseData purchaseData : purchaseDataList) {
                document.add(new Paragraph("Energy Type: " + purchaseData.getEnergyType(), font));
                document.add(new Paragraph("Amount KWH: " + purchaseData.getAmountKWH(), font));
                document.add(new Paragraph("Total Price: " + purchaseData.getTotalPrice(), font));
                document.add(new Paragraph("Purchase Date: " + purchaseData.getPurchaseDate().toString(), font));
                document.add(Chunk.NEWLINE);
            }
        } catch (DocumentException e) {
            e.printStackTrace();
        } finally {
            document.close();
        }
    }
}

