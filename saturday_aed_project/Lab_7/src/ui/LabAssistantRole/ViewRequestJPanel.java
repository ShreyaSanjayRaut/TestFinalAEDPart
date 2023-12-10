/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.LabAssistantRole;

import business.Lab.Lab;
import business.Organization.LabOrganization;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import business.WorkQueue.LabTestWorkRequest;
import business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shrey
 */
public class ViewRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewRequestJPanel
     */
    private JPanel userProcessContainer;

    private UserAccount userAccount;
    private LabOrganization labOrganization;

    public ViewRequestJPanel(JPanel userProcessContainer, UserAccount account, Organization organization) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.labOrganization = (LabOrganization) organization;

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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblWorkRequests = new javax.swing.JTable();
        btnRefresh = new javax.swing.JButton();
        btnAssign = new javax.swing.JButton();
        btnProcess = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        tblWorkRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblWorkRequests);

        btnRefresh.setBackground(new java.awt.Color(255, 55, 95));
        btnRefresh.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnAssign.setBackground(new java.awt.Color(255, 55, 95));
        btnAssign.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAssign.setForeground(new java.awt.Color(255, 255, 255));
        btnAssign.setText("Assign to me");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        btnProcess.setBackground(new java.awt.Color(255, 55, 95));
        btnProcess.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnProcess.setForeground(new java.awt.Color(255, 255, 255));
        btnProcess.setText("Process");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/labtest2.png"))); // NOI18N
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRefresh)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAssign)
                        .addGap(26, 26, 26)
                        .addComponent(btnProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(463, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(499, 499, 499)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRefresh)
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAssign)
                            .addComponent(btnProcess))))
                .addContainerGap(119, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        populateTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblWorkRequests.getModel();

        model.setRowCount(0);
//System.out.println("labOrganization.getWorkQueue().getWorkRequestList()"+labOrganization.getWorkQueue().getWorkRequestList());

        for (WorkRequest request : labOrganization.getWorkQueue().getWorkRequestList()) {
            Lab requestLab = request.getLab(); // Get the Lab associated with the request
            // System.out.println("requestLab: " + requestLab);
            //  System.out.println("user name is****" + userAccount.getUsername());
            if (requestLab != null && requestLab.getLabName().equals(userAccount.getUsername())) {

                //System.out.println("request: " + request);
                Object[] row = new Object[4];
                row[0] = request;
                row[1] = request.getSender().getUsername();   //getEmployee().getName();
                row[2] = request.getReceiver() == null ? null : request.getReceiver().getUsername();
                row[3] = request.getStatus();

                model.addRow(row);

            }
        }

        /*    for (WorkRequest request : labOrganization.getWorkQueue().getWorkRequestList()) {
            System.out.println("user name is****"+userAccount.getUsername());
            
            
            System.out.println("request"+request.getLab().getLabName());
            Object[] row = new Object[4];
            row[0] = request;
            row[1] = request.getSender().getUsername();   //getEmployee().getName();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getUsername();
            row[3] = request.getStatus();

            model.addRow(row);
            
        }*/
    }

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed

        int selectedRow = tblWorkRequests.getSelectedRow();

        if (selectedRow >= 0) {
            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
            if (request.getMessage().equalsIgnoreCase("Completed")) {
                JOptionPane.showMessageDialog(null, "Request already processed.");
                return;
            } else {
                request.setReceiver(userAccount);
                request.setStatus("Pending");
                populateTable();

            }

        } else {
            JOptionPane.showMessageDialog(null, "Choose a reuest to process.");
            return;
        }

    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed

        int selectedRow = tblWorkRequests.getSelectedRow();

        if (selectedRow >= 0) {
            LabTestWorkRequest request = (LabTestWorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);

            request.setStatus("Processing");

            ProcessWorkRequestJPanel processWorkRequestJPanel = new ProcessWorkRequestJPanel(userProcessContainer, request);
            userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);

        } else {
            JOptionPane.showMessageDialog(null, "Please select a request message to process.");
            return;
        }
    }//GEN-LAST:event_btnProcessActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnProcess;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblWorkRequests;
    // End of variables declaration//GEN-END:variables
}
