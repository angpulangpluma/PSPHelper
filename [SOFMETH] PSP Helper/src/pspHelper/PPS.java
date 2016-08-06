/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pspHelper;

import java.awt.Font;

/**
 *
 * @author Hannah
 */
public class PPS extends javax.swing.JPanel {

    /**
     * Creates new form PSPf
     */
    public PPS() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        table5 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        table4 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        table3 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();

        setMinimumSize(new java.awt.Dimension(1057, 700));
        setPreferredSize(new java.awt.Dimension(1000, 1200));

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
        table5.setOpaque(false);
        table5.setRowHeight(27);
        table5.setRowSelectionAllowed(false);
        table5.getTableHeader().setResizingAllowed(false);
        table5.getTableHeader().setReorderingAllowed(false);
        table5.getTableHeader().setFont(new Font("Century Gothic", Font.PLAIN, 18));
        jScrollPane3.setViewportView(table5);

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
        table4.setOpaque(false);
        table4.setRowHeight(27);
        table4.setRowSelectionAllowed(false);
        table4.getTableHeader().setResizingAllowed(false);
        table4.getTableHeader().setReorderingAllowed(false);
        table4.getTableHeader().setFont(new Font("Century Gothic", Font.PLAIN, 18));
        jScrollPane2.setViewportView(table4);

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
        table3.setOpaque(false);
        table3.setRowHeight(27);
        table3.setRowSelectionAllowed(false);
        table3.getTableHeader().setResizingAllowed(false);
        table3.getTableHeader().setReorderingAllowed(false);
        table3.getTableHeader().setFont(new Font("Century Gothic", Font.PLAIN, 18));
        jScrollPane1.setViewportView(table3);

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
        table1.setOpaque(false);
        table1.setRowHeight(27);
        table1.setRowSelectionAllowed(false);
        table1.getTableHeader().setResizingAllowed(false);
        table1.getTableHeader().setReorderingAllowed(false);
        table1.getTableHeader().setFont(new Font("Century Gothic", Font.PLAIN, 18));
        jScrollPane4.setViewportView(table1);

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
        table2.setOpaque(false);
        table2.setRowHeight(27);
        table2.setRowSelectionAllowed(false);
        table2.getTableHeader().setResizingAllowed(false);
        table2.getTableHeader().setReorderingAllowed(false);
        table2.getTableHeader().setFont(new Font("Century Gothic", Font.PLAIN, 18));
        jScrollPane5.setViewportView(table2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1027, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane5))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable table1;
    private javax.swing.JTable table2;
    private javax.swing.JTable table3;
    private javax.swing.JTable table4;
    private javax.swing.JTable table5;
    // End of variables declaration//GEN-END:variables
}
