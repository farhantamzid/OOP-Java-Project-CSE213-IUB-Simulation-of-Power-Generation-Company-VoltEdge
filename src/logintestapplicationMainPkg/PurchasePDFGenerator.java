/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logintestapplicationMainPkg;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class PurchasePDFGenerator {

    public static void generatePDF(List<PurchaseData> purchaseDataList, String fileName) {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream(fileName));
            document.open();

            Font font = FontFactory.getFont(FontFactory.TIMES_ROMAN, 12);

            for (PurchaseData purchaseData : purchaseDataList) {
                document.add(new Paragraph("Type of Energy = " + purchaseData.getEnergyType(), font));
                document.add(new Paragraph("Amount of Purchase = " + purchaseData.getAmountKWH(), font));
                document.add(new Paragraph("Total Due = " + purchaseData.getTotalPrice(), font));
                document.add(new Paragraph("Purchase Time = " + purchaseData.getPurchaseDate(), font));
                document.add(Chunk.NEWLINE); // Additional spacing
            }

            System.out.println("PDF generated successfully.");
        } catch (DocumentException | IOException e) {
            e.printStackTrace();
        } finally {
            if (document != null) {
                document.close();
            }
        }
    }
}

