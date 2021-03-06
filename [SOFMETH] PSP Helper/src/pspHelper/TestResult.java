/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pspHelper;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import static pspHelper.DocumentGenerator.gen;

/**
 *
 * @author Hannah
 */
public class TestResult extends javax.swing.JPanel {

    ArrayList<TestResultTemplate> tests;
    JPanel testPanel;
    
    /**
     * Creates new form TestResult
     */
    public TestResult() {
        initComponents();
        tests = new ArrayList<>();
        testPanel = new JPanel();
        //testPanel.setMinimumSize(new Dimension(1042, 800));
        testPanel.setPreferredSize(new Dimension(1042, 570));
        testPanel.setLayout(new FlowLayout());
        add();
    }
    
    private void add() {
        TestResultTemplate newTest = new TestResultTemplate(tests.size()+1);
        newTest.setVisible(true);
        tests.add(newTest);
        testPanel.add(newTest);
        
        testPanel.setPreferredSize(new Dimension(1042, 570*tests.size()));
        scrollPane.setViewportView(testPanel);
        scrollPane.repaint(); scrollPane.revalidate();
        repaint(); revalidate();
        System.out.println("+ A D D");
    }
    
    public void generate() {
        TestResultTemplate t;
        for(int i = 0; i < tests.size(); i++) {
            t = tests.get(i);
            String str = 
                    "Test Name/Number:  " + t.number.getText() + "\n" +
                    "Test Objective:  " + t.objective.getText() + "\n" +
                    "Test Description:  " + t.desc.getText() + "\n" +
                    "Test Conditions:  " + t.conditions.getText() + "\n" +
                    "Expected Results:  " + t.expected.getText() + "\n" +
                    "Actual Results:  " + t.actual.getText();
            gen.addParagraph(str);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        scrollPane = new javax.swing.JScrollPane();

        setMaximumSize(new java.awt.Dimension(1042, 457));
        setMinimumSize(new java.awt.Dimension(1042, 457));
        setPreferredSize(new java.awt.Dimension(1042, 457));

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ADD");
        jButton1.setBorder(null);
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        scrollPane.setBackground(new java.awt.Color(255, 255, 255));
        scrollPane.setBorder(null);
        scrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setMinimumSize(new java.awt.Dimension(1042, 800));
        scrollPane.setPreferredSize(new java.awt.Dimension(1042, 800));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        add();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane scrollPane;
    // End of variables declaration//GEN-END:variables
}
