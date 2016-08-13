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
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STTblWidth;

/**
 *
 * @author Hannah
 */
public class DocumentGenerator {
    public static DocumentGenerator gen = new DocumentGenerator();
    private XWPFDocument doc;
    private String type;
            
    public void createNewDoc(String type) {        
        doc = new XWPFDocument();
        this.type = type;
    }
    
    public void saveDoc() {
        FileOutputStream out;
        String timeStamp = new SimpleDateFormat("yyyyMMdd-HHmmss").format(Calendar.getInstance().getTime());
        
        try {
            out = new FileOutputStream(new File(type + "-" + timeStamp + ".docx"));
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
    
    public void addTable(JTable jtable) {
        String data[][] = getData(jtable);
        XWPFTable table = doc.createTable();
        XWPFTableRow row;
        int rows = data.length;
        int cols = data[0].length;
        
        for(int i = 0; i < rows; i++) {
            row = table.createRow();
            for(int j = 0; j < cols; j++) {
                //table.getRow(i).getCell(j).getCTTc().addNewTcPr().addNewTcW().setW(BigInteger.valueOf(2000));
                row.addNewTableCell().setText(data[i][j]);
            }
        }
        
        XWPFParagraph p = doc.createParagraph();
        XWPFRun run = p.createRun();
        run.addBreak();
        
        CTTblWidth width = table.getCTTbl().addNewTblPr().addNewTblW();
        width.setType(STTblWidth.DXA);
        width.setW(BigInteger.valueOf(9072));
    }
    
    private String[][] getData(JTable table) {
        
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
    
        int rows = dtm.getRowCount()+1;
        int cols = dtm.getColumnCount();
        String data[][] = new String[rows][cols];
        
        System.out.println("rows: " + rows);
        System.out.println("cols: " + cols);
        
        for(int i = 0; i < cols; i++) {
            data[0][i] = table.getColumnName(i);
            System.out.println(i +" - "+table.getColumnName(i));
        }
        
        for(int i = 0; i < rows-1; i++) {
            for(int j = 0; j < cols; j++) {
                if(table.getValueAt(i, j) == null)
                    data[i+1][j] = "            ";
                else
                    data[i+1][j] = table.getValueAt(i, j).toString().trim();
                
                System.out.println(j +" - "+data[i+1][j]);
            }
        } 
        return data;
    }
}
