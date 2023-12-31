/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Pharmacist;

import business.EcoSystem;
import business.Organization.PharmacyOrganization;
import business.Pharmacy.Medicine;
import business.Pharmacy.Order;
import business.Pharmacy.OrderStatus;
import business.Pharmacy.Pharmacist;
import business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author manal
 */
public class ProcessOrderForPatient extends javax.swing.JPanel {

    /**
     * Creates new form ProcessOrderForPatient
     */
    private JPanel workArea;
    private PharmacyOrganization organization;
    private EcoSystem business;
    private UserAccount userAccount;
    private Pharmacist currentPharmacist;
    private Order selectedOrder;

    public ProcessOrderForPatient(JPanel workArea, UserAccount account, EcoSystem business, Pharmacist pharma) {
        initComponents();

        this.workArea = workArea;
        this.business = business;
        this.userAccount = account;
        this.currentPharmacist = pharma;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        updateStatus = new javax.swing.JButton();
        updateStatus1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Patient Name", "Doctor Name", "Order Status"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(255, 153, 102));
        jTable1.setSelectionBackground(new java.awt.Color(255, 204, 153));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        updateStatus.setBackground(new java.awt.Color(255, 55, 95));
        updateStatus.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        updateStatus.setForeground(new java.awt.Color(255, 255, 255));
        updateStatus.setText("Update as Deliver");
        updateStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateStatusActionPerformed(evt);
            }
        });

        updateStatus1.setBackground(new java.awt.Color(255, 55, 95));
        updateStatus1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        updateStatus1.setForeground(new java.awt.Color(255, 255, 255));
        updateStatus1.setText("Update as Processed");
        updateStatus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateStatus1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("SF Pro Display", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 255));
        jLabel4.setText("Process Order  ");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/manage medicine request.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(updateStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(updateStatus1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateStatus1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(594, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 405, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:

        // displayOrder();
    }//GEN-LAST:event_jTable1MouseClicked

    private void updateStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateStatusActionPerformed
        // TODO add your handling code here:

        int selectedRowIndex = jTable1.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row to process.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        selectedOrder = (Order) model.getValueAt(selectedRowIndex, 0);
        selectedOrder.setStatus(OrderStatus.DELIVERED);
        List<Order> orders = null;
        if (selectedOrder.getPatient().getOrders() == null) {
            orders = new ArrayList();
           
            orders.add(selectedOrder);
            selectedOrder.getPatient().setOrders(orders);

        } else {

            selectedOrder.getPatient().getOrders().add(selectedOrder);
        }

        JOptionPane.showMessageDialog(null, "Order status is  delivered.");
        
        populateTable();
    }//GEN-LAST:event_updateStatusActionPerformed

    private void updateStatus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateStatus1ActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = jTable1.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row to process.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        selectedOrder = (Order) model.getValueAt(selectedRowIndex, 0);
        selectedOrder.setStatus(OrderStatus.PROCESSED);
        List<Order> orders = null;
        if (selectedOrder.getPatient().getOrders() == null) {
            orders = new ArrayList();
            orders.add(selectedOrder);
            selectedOrder.getPatient().setOrders(orders);

        } else {

            selectedOrder.getPatient().getOrders().add(selectedOrder);
        }

        JOptionPane.showMessageDialog(null, "Order status is  processed.");
        
        populateTable();
        
    }//GEN-LAST:event_updateStatus1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton updateStatus;
    private javax.swing.JButton updateStatus1;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

        List<Order> listOfOrders = currentPharmacist.getListOrders();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        for (Order order : listOfOrders) {

            Object[] rowData = {
                order,
                order.getPatient().getUsername(),
                order.getDoctor().e.getName(),
                order.getStatus()
            };
            model.addRow(rowData);
        }

    }

}
