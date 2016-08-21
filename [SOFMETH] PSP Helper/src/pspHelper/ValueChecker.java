package pspHelper;


import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marienne Lopez
 */
public class ValueChecker {
    
    JFrame src;
    
    public ValueChecker(JFrame src){
        this.src = src;
    }
    
    public void setSourceFrame(JFrame src){
        this.src = src;
    }
    
    public boolean checkNumericValueTable(JTable table, int colIndex, int startingRow){
        int value = -1;
        int i;
        boolean check = false;
//        System.out.println("Number of rows in the table: " + table.getRowCount());
        for (i = startingRow; i < table.getRowCount(); i++){
//            System.out.println("Value at row " + (i+1) + " column " + (colIndex+1) + ": " + 
//                    table.getValueAt(i, colIndex).toString() + "(" + table.getValueAt(i, colIndex).toString().length()+ ")");
            if(table.getValueAt(i, colIndex).toString().length()>0){
//                System.out.println("Got in!");
                try{
                    value = Integer.parseInt((String)table.getValueAt(i, colIndex));
                    if (value > 0)
                        check = true;
                    else check = false;
                } catch (NumberFormatException e){
    //                JOptionPane.showMessageDialog(src, "Please enter a non-negative number at row " +
    //                            (i+1) + " column " + (colIndex+1));
                    check = false;
                }
            } else check = true;
            if (!check) {
                JOptionPane.showMessageDialog(src, "Please enter a non-negative number at row " +
                                (i+1) + " column " + (colIndex+1));
                break;
            }
        }
        if (!check)
            JOptionPane.showMessageDialog(src, "Please enter a non-negative number at row " +
                            (i+1) + " column " + (colIndex+1));
//        else System.out.println("All checks out!");
        return check;
    }
    
    public boolean checkNumericValueText(JTextField input){
        boolean check = false;
        int value = -1;
        
        if (input.getText().length()>0){
            try{
                value = Integer.parseInt(input.getText());
            } catch (NumberFormatException e){
                check = false;
            }
        } else check = true;
        if (!check)
            JOptionPane.showMessageDialog(src, "Please enter a valid number for input.");
        return check;
    }
    
    public boolean checkTimeValueTable(JTable table, int colIndex, int startingRow){
        boolean check = false;
        Date date = null;
        int i;
//        System.out.println("Number of rows in the table: " + table.getRowCount());
        for (i = startingRow; i < table.getRowCount(); i++){
//            System.out.println("Value at row " + (i+1) + " column " + (colIndex+1) + ": " + 
//                    table.getValueAt(i, colIndex).toString() + "(" + table.getValueAt(i, colIndex).toString().length()+ ")");
            if(table.getValueAt(i, colIndex).toString().length()>0){
//                System.out.println("Got in!");
                try{
                    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
                    sdf.setLenient(false);
                    date = sdf.parse(table.getValueAt(i, colIndex).toString());
                    if(!table.getValueAt(i, colIndex).toString().equals(sdf.format(date)))
                        check = false;
                } catch (Exception e){
    //                JOptionPane.showMessageDialog(src, "Please enter a non-negative number at row " +
    //                            (i+1) + " column " + (colIndex+1));
                    check = false;
                }
            } else check = true;
            if (!check) {
//                JOptionPane.showMessageDialog(src, "Please enter a time in the format \"HH:mm\" at row " +
//                                (i+1) + " column " + (colIndex+1));
                break;
            }
        }
        if (!check)
            JOptionPane.showMessageDialog(src, "Please enter a time in the format \"HH:mm\" at row " +
                                (i+1) + " column " + (colIndex+1));
        else System.out.println("All checks out!");
        return check;
    }
    
    public boolean checkDateValueTable(JTable table, int colIndex, int startingRow){
        boolean check = false;
        Date date = null;
        int i;
//        System.out.println("Number of rows in the table: " + table.getRowCount());
        for (i = startingRow; i < table.getRowCount(); i++){
//            System.out.println("Value at row " + (i+1) + " column " + (colIndex+1) + ": " + 
//                    table.getValueAt(i, colIndex).toString() + "(" + table.getValueAt(i, colIndex).toString().length()+ ")");
            if(table.getValueAt(i, colIndex).toString().length()>0){
//                System.out.println("Got in!");
                try{
                    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
                    sdf.setLenient(false);
                    date = sdf.parse(table.getValueAt(i, colIndex).toString());
                    if(!table.getValueAt(i, colIndex).toString().equals(sdf.format(date)))
                        check = false;
                } catch (Exception e){
    //                JOptionPane.showMessageDialog(src, "Please enter a non-negative number at row " +
    //                            (i+1) + " column " + (colIndex+1));
                    check = false;
                }
            } else check = true;
            if (!check) {
                JOptionPane.showMessageDialog(src, "Please enter a time in the format \"MM/dd/yyyy\" at row " +
                                (i+1) + " column " + (colIndex+1));
                break;
            }
        }
        if (!check)
            JOptionPane.showMessageDialog(src, "Please enter a non-negative number at row " +
                            (i+1) + " column " + (colIndex+1));
        else System.out.println("All checks out!");
        return check;
    }
    

}
