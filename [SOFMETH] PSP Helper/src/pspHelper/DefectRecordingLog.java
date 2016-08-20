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
public class DefectRecordingLog extends javax.swing.JPanel {

    private int count;
    
    /**
     * Creates new form DefectRecordingLog
     */
    public DefectRecordingLog() {
        initComponents();
        count = 1;
    }
    
    public void generate() {
        gen.addTable(table0);
    }
    
    public JTable getDRLTable(){
        return table0;
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
        jButton1 = new javax.swing.JButton();

        setMaximumSize(null);
        setMinimumSize(new java.awt.Dimension(1057, 400));
        setPreferredSize(new java.awt.Dimension(1057, 400));

        pane0.setMinimumSize(new java.awt.Dimension(1057, 350));

        table0.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        table0.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "1", null, null, null, null, null, null}
            },
            new String [] {
                "Date", "Number", "Type", "Inject", "Remove", "Fix Time", "Fix Defect", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table0.setFocusable(false);
        table0.setGridColor(new java.awt.Color(204, 204, 204));
        table0.setMinimumSize(new java.awt.Dimension(1057, 350));
        table0.setOpaque(false);
        table0.setPreferredSize(new java.awt.Dimension(1057, 350));
        table0.setRowHeight(100);
        table0.setRowSelectionAllowed(false);
        table0.getTableHeader().setResizingAllowed(false);
        table0.getTableHeader().setReorderingAllowed(false);
        table0.getTableHeader().setFont(new Font("Century Gothic", Font.PLAIN, 18));
        pane0.setViewportView(table0);

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ADD ROWS");
        jButton1.setBorder(null);
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pane0, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pane0, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                .addGap(14, 14, 14)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) table0.getModel();
        count++;
        dtm.addRow(new Object[] {"", count, "", "", "", "", "", ""});
        repaint(); revalidate();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane pane0;
    private javax.swing.JTable table0;
    // End of variables declaration//GEN-END:variables
}
