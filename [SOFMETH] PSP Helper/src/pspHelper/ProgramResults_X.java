/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pspHelper;

import java.awt.Font;
import static pspHelper.DocumentGenerator.gen;

/**
 *
 * @author Hannah
 */
public class ProgramResults_X extends javax.swing.JPanel {

    /**
     * Creates new form ProgramResults_X
     */
    public ProgramResults_X() {
        initComponents();
    }
    
    public void generate() {
        gen.addTable(table0);
    }

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

        pane0.setMinimumSize(new java.awt.Dimension(1057, 350));

        table0.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        table0.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "99"},
                {"2", "123"},
                {"3", "150"},
                {"4", "222"},
                {"5", "301"}
            },
            new String [] {
                "Program Number", "Lines of Code"
            }
        ));
        table0.setFocusable(false);
        table0.setGridColor(new java.awt.Color(204, 204, 204));
        table0.setMinimumSize(new java.awt.Dimension(1057, 350));
        table0.setOpaque(false);
        table0.setPreferredSize(new java.awt.Dimension(1057, 350));
        table0.setRowHeight(40);
        table0.setRowSelectionAllowed(false);
        table0.getTableHeader().setResizingAllowed(false);
        table0.getTableHeader().setReorderingAllowed(false);
        table0.getTableHeader().setFont(new Font("Century Gothic", Font.PLAIN, 18));
        pane0.setViewportView(table0);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pane0, javax.swing.GroupLayout.DEFAULT_SIZE, 1057, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pane0, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane pane0;
    private javax.swing.JTable table0;
    // End of variables declaration//GEN-END:variables
}