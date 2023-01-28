package rabindra.fromTXTtoPDF;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.codec.Base64.OutputStream;

public class TxtToPDF {

	public static void main(String[] args) throws IOException, DocumentException {

		String file ="/home/oaker/eclipse-workspace/JAVA2023/src/rabindra/fromTXTtoPDF";
		try {
            String txtFile = file+"/txtfile.txt";
            String pdfFile = file+"/pdfFile1.pdf";
            
            FileReader fr = new FileReader(txtFile);
            BufferedReader br = new BufferedReader(fr);

            String line;
            StringBuilder sb = new StringBuilder();

            while ((line = br.readLine()) != null) {
                sb.append(line);
                sb.append(System.getProperty("line.separator"));
            }

            String text = sb.toString();
            br.close();

            Document pdfDoc = new Document();
            PdfWriter.getInstance(pdfDoc, new FileOutputStream(pdfFile));
            pdfDoc.open();
            pdfDoc.setPageSize(PageSize.A4);
            pdfDoc.setMargins(72, 72, 72, 72);
            pdfDoc.setMarginMirroring(false);

            Paragraph p = new Paragraph(text);
            pdfDoc.add(p);

            pdfDoc.close();
            System.out.println("PDF created successfully!");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        } catch (DocumentException e) {
            System.out.println("DocumentException: " + e.getMessage());
        }
    }

}
