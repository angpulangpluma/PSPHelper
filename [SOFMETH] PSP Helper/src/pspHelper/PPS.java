/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pspHelper;

import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static pspHelper.DocumentGenerator.gen;

/**
 *
 * @author Hannah
 */
public class PPS extends javax.swing.JPanel {

    private int type;
    
    public PPS(int type) {
        initComponents();
        this.type = type;
        switch(type) {
            case 1: 
                remove(pane0); 
                remove(pane1); 
                remove(pane2); 
                remove(pane3);
                remove(pane7); break;
            case 2: 
            case 3: 
                remove(pane0); 
                remove(pane1);
                remove(pane2); break;
            case 4: remove(pane1); break;
            case 5: remove(pane0); break;
        }
        repaint(); revalidate();
    }
    
    public void generate() {
        switch(type) {
            case 1: gen.addTable(table6); 
                    gen.addTable(table4); 
                    gen.addTable(table5); break;
            
            case 2: 
            case 3: gen.addTable(table7); 
                    gen.addTable(table3); 
                    gen.addTable(table4); 
                    gen.addTable(table5); break;
                    
            case 4: gen.addTable(table0); 
                    gen.addTable(table3); 
                    gen.addTable(table2); 
                    gen.addTable(table4);
                    gen.addTable(table5); break;
                    
            case 5: gen.addTable(table1); 
                    gen.addTable(table2); 
                    gen.addTable(table3); 
                    gen.addTable(table4); 
                    gen.addTable(table5); break;
        }
    }
    
    /*
    private String[][] getData(JTable table) {
        
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
    
        int rows = dtm.getRowCount()+1;
        int cols = dtm.getColumnCount();
        String data[][] = new String[rows][cols];
        String temp;
        
        System.out.println("rows: " + rows);
        System.out.println("cols: " + cols);
        
        for(int i = 0; i < cols; i++)
            data[0][i] = table.getColumnName(i);
        
        for(int i = 1; i < rows-1; i++) {
            for(int j = 0; j < cols; j++) {
                if(table.getValueAt(i, j) == null)
                    data[i][j] = "   SAMPLE   ";
                else
                    data[i][j] = table.getValueAt(i, j).toString().trim();
            }
        }
        return data;
    }
    */

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pane0 = new javax.swing.JScrollPane();
        table0 = new javax.swing.JTable();
        pane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        pane7 = new javax.swing.JScrollPane();
        table7 = new javax.swing.JTable();
        pane2 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        pane6 = new javax.swing.JScrollPane();
        table6 = new javax.swing.JTable();
        pane3 = new javax.swing.JScrollPane();
        table3 = new javax.swing.JTable();
        pane4 = new javax.swing.JScrollPane();
        table4 = new javax.swing.JTable();
        pane5 = new javax.swing.JScrollPane();
        table5 = new javax.swing.JTable();

        setMinimumSize(new java.awt.Dimension(1057, 0));
        setPreferredSize(new java.awt.Dimension(1057, 1200));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        pane0.setMaximumSize(new java.awt.Dimension(1057, 80));
        pane0.setMinimumSize(new java.awt.Dimension(1057, 80));
        pane0.setPreferredSize(new java.awt.Dimension(1057, 80));

        table0.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        table0.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"LOC/Hour", null, null, null}
            },
            new String [] {
                "Summary", "Plan", "Actual", "To Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table0.setFocusable(false);
        table0.setGridColor(new java.awt.Color(204, 204, 204));
        table0.setMaximumSize(new java.awt.Dimension(1057, 27));
        table0.setMinimumSize(new java.awt.Dimension(1057, 27));
        table0.setOpaque(false);
        table0.setPreferredSize(new java.awt.Dimension(1027, 27));
        table0.setRowHeight(27);
        table0.setRowSelectionAllowed(false);
        table0.getTableHeader().setResizingAllowed(false);
        table0.getTableHeader().setReorderingAllowed(false);
        table0.getTableHeader().setFont(new Font("Century Gothic", Font.PLAIN, 18));
        pane0.setViewportView(table0);

        add(pane0);

        pane1.setMinimumSize(new java.awt.Dimension(1027, 50));
        pane1.setPreferredSize(new java.awt.Dimension(1027, 350));

        table1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"LOC/Hour", null, null, null},
                {"Planned Time", null, null, null},
                {"Actual Time", null, null, null},
                {"Cost Performance Index", null, null, null},
                {"% Reused", null, null, null},
                {"% New Reused", null, null, null}
            },
            new String [] {
                "Summary", "Plan", "Actual", "To Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table1.setFocusable(false);
        table1.setGridColor(new java.awt.Color(204, 204, 204));
        table1.setMinimumSize(new java.awt.Dimension(1027, 162));
        table1.setOpaque(false);
        table1.setPreferredSize(new java.awt.Dimension(1057, 162));
        table1.setRowHeight(27);
        table1.setRowSelectionAllowed(false);
        table1.getTableHeader().setResizingAllowed(false);
        table1.getTableHeader().setReorderingAllowed(false);
        table0.getTableHeader().setFont(new Font("Century Gothic", Font.PLAIN, 18));
        pane1.setViewportView(table1);

        add(pane1);

        pane7.setMinimumSize(new java.awt.Dimension(1027, 50));
        pane7.setPreferredSize(new java.awt.Dimension(1027, 450));

        table7.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        table7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Base (B)", null, null, null},
                {"  Deleted (D)", null, null, null},
                {"  Modified (M)", null, null, null},
                {"  Added (A)", null, null, null},
                {"  Reused (R)", null, null, null},
                {"Total New and Changed (N)", null, null, null},
                {"Total LOC (T)", null, null, null},
                {"Total Reused", null, null, null}
            },
            new String [] {
                "Program Size", "Plan", "Actual", "To Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                if (columnIndex==1 && rowIndex!=5)
                return false;
                else return canEdit [columnIndex];
            }
        });
        table7.setFocusable(false);
        table7.setGridColor(new java.awt.Color(204, 204, 204));
        table7.setMaximumSize(new java.awt.Dimension(2147483647, 216));
        table7.setMinimumSize(new java.awt.Dimension(1027, 216));
        table7.setOpaque(false);
        table7.setPreferredSize(new java.awt.Dimension(1027, 216));
        table7.setRowHeight(27);
        table7.setRowSelectionAllowed(false);
        table7.getTableHeader().setResizingAllowed(false);
        table7.getTableHeader().setReorderingAllowed(false);
        table7.getTableHeader().setFont(new Font("Century Gothic", Font.PLAIN, 18));
        pane7.setViewportView(table7);
        if (table7.getColumnModel().getColumnCount() > 0) {
            table7.getColumnModel().getColumn(0).setHeaderValue("Program Size");
            table7.getColumnModel().getColumn(1).setHeaderValue("Plan");
            table7.getColumnModel().getColumn(2).setHeaderValue("Actual");
            table7.getColumnModel().getColumn(3).setHeaderValue("To Date");
        }

        add(pane7);

        pane2.setMinimumSize(new java.awt.Dimension(1027, 50));
        pane2.setPreferredSize(new java.awt.Dimension(1027, 450));

        table2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Base (B)", null, null, null},
                {"  Deleted (D)", null, null, null},
                {"  Modified (M)", null, null, null},
                {"  Added (A)", null, null, null},
                {"  Reused (R)", null, null, null},
                {"Total New and Changed (N)", null, null, null},
                {"Total LOC (T)", null, null, null},
                {"Total Reused", null, null, null}
            },
            new String [] {
                "Program Size", "Plan", "Actual", "To Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table2.setFocusable(false);
        table2.setGridColor(new java.awt.Color(204, 204, 204));
        table2.setMaximumSize(new java.awt.Dimension(2147483647, 216));
        table2.setMinimumSize(new java.awt.Dimension(1027, 216));
        table2.setOpaque(false);
        table2.setPreferredSize(new java.awt.Dimension(1027, 216));
        table2.setRowHeight(27);
        table2.setRowSelectionAllowed(false);
        table2.getTableHeader().setResizingAllowed(false);
        table2.getTableHeader().setReorderingAllowed(false);
        table2.getTableHeader().setFont(new Font("Century Gothic", Font.PLAIN, 18));
        pane2.setViewportView(table2);
        if (table2.getColumnModel().getColumnCount() > 0) {
            table2.getColumnModel().getColumn(0).setHeaderValue("Program Size");
            table2.getColumnModel().getColumn(1).setHeaderValue("Plan");
            table2.getColumnModel().getColumn(2).setHeaderValue("Actual");
            table2.getColumnModel().getColumn(3).setHeaderValue("To Date");
        }

        add(pane2);

        pane6.setMinimumSize(new java.awt.Dimension(1027, 50));
        pane6.setPreferredSize(new java.awt.Dimension(1027, 360));

        table6.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        table6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Planning", null, null, null},
                {"Design", null, null, null},
                {"Code", null, null, null},
                {"Compile", null, null, null},
                {"Test", null, null, null},
                {"Postmortem", null, null, null},
                {"Total", null, null, null}
            },
            new String [] {
                "Time in Phase(Min.)", "Plan", "To Date", "To Date %"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                if (columnIndex==1 &&
                    rowIndex>=0 && rowIndex<=5){
                    return false;
                }
                else return canEdit [columnIndex];
            }
        });
        table6.setFocusable(false);
        table6.setGridColor(new java.awt.Color(204, 204, 204));
        table6.setMinimumSize(new java.awt.Dimension(1027, 189));
        table6.setOpaque(false);
        table6.setPreferredSize(new java.awt.Dimension(1027, 189));
        table6.setRowHeight(27);
        table6.setRowSelectionAllowed(false);
        table6.getTableHeader().setResizingAllowed(false);
        table6.getTableHeader().setReorderingAllowed(false);
        table6.getTableHeader().setFont(new Font("Century Gothic", Font.PLAIN, 18));
        pane6.setViewportView(table6);

        add(pane6);

        pane3.setMinimumSize(new java.awt.Dimension(1027, 50));
        pane3.setPreferredSize(new java.awt.Dimension(1027, 360));

        table3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        table3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Planning", null, null, null},
                {"Design", null, null, null},
                {"Code", null, null, null},
                {"Compile", null, null, null},
                {"Test", null, null, null},
                {"Postmortem", null, null, null},
                {"Total", null, null, null}
            },
            new String [] {
                "Time in Phase(Min.)", "Plan", "To Date", "To Date %"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table3.setFocusable(false);
        table3.setGridColor(new java.awt.Color(204, 204, 204));
        table3.setMinimumSize(new java.awt.Dimension(1027, 189));
        table3.setOpaque(false);
        table3.setPreferredSize(new java.awt.Dimension(1027, 189));
        table3.setRowHeight(27);
        table3.setRowSelectionAllowed(false);
        table3.getTableHeader().setResizingAllowed(false);
        table3.getTableHeader().setReorderingAllowed(false);
        table3.getTableHeader().setFont(new Font("Century Gothic", Font.PLAIN, 18));
        pane3.setViewportView(table3);

        add(pane3);

        pane4.setMinimumSize(new java.awt.Dimension(1027, 50));
        pane4.setPreferredSize(new java.awt.Dimension(1027, 320));

        table4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        table4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Planning", null, null},
                {"Design", null, null},
                {"Code", null, null},
                {"Compile", null, null},
                {"Test", null, null},
                {"Total", null, null}
            },
            new String [] {
                "Defects Injected", "To Date", "To Date %"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table4.setFocusable(false);
        table4.setGridColor(new java.awt.Color(204, 204, 204));
        table4.setMinimumSize(new java.awt.Dimension(1027, 162));
        table4.setOpaque(false);
        table4.setPreferredSize(new java.awt.Dimension(1027, 162));
        table4.setRowHeight(27);
        table4.setRowSelectionAllowed(false);
        table4.getTableHeader().setResizingAllowed(false);
        table4.getTableHeader().setReorderingAllowed(false);
        table4.getTableHeader().setFont(new Font("Century Gothic", Font.PLAIN, 18));
        pane4.setViewportView(table4);

        add(pane4);

        pane5.setMinimumSize(new java.awt.Dimension(1027, 50));
        pane5.setPreferredSize(new java.awt.Dimension(1027, 350));

        table5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        table5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Planning", null, null},
                {"Design", null, null},
                {"Code", null, null},
                {"Compile", null, null},
                {"Test", null, null},
                {"Total Development", null, null},
                {"After Development", null, null}
            },
            new String [] {
                "Defects Removed", "To Date", "To Date %"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table5.setFocusable(false);
        table5.setGridColor(new java.awt.Color(204, 204, 204));
        table5.setMinimumSize(new java.awt.Dimension(1027, 189));
        table5.setOpaque(false);
        table5.setPreferredSize(new java.awt.Dimension(1027, 189));
        table5.setRowHeight(27);
        table5.setRowSelectionAllowed(false);
        table5.getTableHeader().setResizingAllowed(false);
        table5.getTableHeader().setReorderingAllowed(false);
        table5.getTableHeader().setFont(new Font("Century Gothic", Font.PLAIN, 18));
        pane5.setViewportView(table5);

        add(pane5);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane pane0;
    private javax.swing.JScrollPane pane1;
    private javax.swing.JScrollPane pane2;
    private javax.swing.JScrollPane pane3;
    private javax.swing.JScrollPane pane4;
    private javax.swing.JScrollPane pane5;
    private javax.swing.JScrollPane pane6;
    private javax.swing.JScrollPane pane7;
    private javax.swing.JTable table0;
    private javax.swing.JTable table1;
    private javax.swing.JTable table2;
    private javax.swing.JTable table3;
    private javax.swing.JTable table4;
    private javax.swing.JTable table5;
    private javax.swing.JTable table6;
    private javax.swing.JTable table7;
    // End of variables declaration//GEN-END:variables
}
