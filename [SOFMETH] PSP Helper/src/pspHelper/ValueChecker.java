package pspHelper;


import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;

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
    
    public boolean checkNumberingTable(JTable table){
        int value = -1;
        boolean check = false;
        for(int i = 0; i < table.getRowCount(); i++){
            try{
                value = Integer.parseInt((String)table.getValueAt(i, 0));
                if (value>0)
                    check = true;
                else check = false;
            } catch (NumberFormatException e){
                JOptionPane.showMessageDialog(src, "Please enter a non-negative number for ID at row " + 
                        i + " column " + 0);
            }
            if (!check) break;
        }
        return check;
    }

}
