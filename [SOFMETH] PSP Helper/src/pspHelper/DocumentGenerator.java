/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pspHelper;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;

/**
 *
 * @author Hannah
 */
public class DocumentGenerator {
    public static DocumentGenerator gen = new DocumentGenerator();
    private XWPFDocument doc;
            
    public void createNewDoc() {        
        doc = new XWPFDocument();
    }
    
    public void saveDoc() {
        FileOutputStream out;
        String timeStamp = new SimpleDateFormat("yyyyMMdd-HHmmss").format(Calendar.getInstance().getTime());
        
        try {
            out = new FileOutputStream(new File("FORM-" + timeStamp + ".docx"));
            doc.write(out);
            out.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Doc Saved");
    }
            
    public void addHeader(String strTitle, String student, String prof, String date, String sec, String lang) {
        // title
        XWPFParagraph title = doc.createParagraph();
        title.setAlignment(ParagraphAlignment.CENTER);
        XWPFRun run1 = title.createRun();
        run1.setBold(true);
        run1.setFontSize(14);
        run1.setText(strTitle); run1.addBreak(); 
        
        // general details
        XWPFParagraph general = doc.createParagraph();
        general.setAlignment(ParagraphAlignment.LEFT);
        XWPFRun run2 = general.createRun();
        run2.setText("Student: " + student); run2.addBreak();
        run2.setText("Professor: " + prof); run2.addBreak();
        run2.setText("Date: " + date); run2.addBreak();
        run2.setText("Section: " + sec); run2.addBreak();
        run2.setText("Language: " + lang); run2.addBreak();
    }
    
    public void addTable(String data[][]) {
        XWPFTable table = doc.createTable();
        XWPFTableRow row;
        int rows = data.length;
        int cols = data[0].length;
        
        for(int i = 0; i < rows; i++) {
            row = table.createRow();
            for(int j = 0; j < cols; j++) {
                row.addNewTableCell().setText(data[i][j]);
                //row.addNewTableCell().setText("   x   ");
            }
        }
        
        XWPFParagraph p = doc.createParagraph();
        XWPFRun run = p.createRun();
        run.addBreak();
    }
}
