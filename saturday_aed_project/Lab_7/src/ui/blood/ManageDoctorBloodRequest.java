/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.blood;

import business.BloodBank.BloodBank;
import ui.DoctorRole.*;
import business.Doctor.Appointment;
import business.Doctor.Doctor;
import business.Doctor.DoctorDirectorty;
import business.Doctor.DoctorPatientMap;
import business.EcoSystem;
import business.Patient.Patient;
import business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author manal
 */
public class ManageDoctorBloodRequest extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private Doctor doctor;
    private Patient selectedPatient;
    private Appointment selectedAppointment;
    private BloodBank currentBloodBank;

    /**
     * Creates new form ManageAppointment
     */
    public ManageDoctorBloodRequest(JPanel userProcessContainer, UserAccount account, EcoSystem business, BloodBank currentBloodBank) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.userAccount = account;
        this.currentBloodBank = currentBloodBank;
        
        
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        labTest1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("SF Pro Display", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bloodlogo.png"))); // NOI18N
        jLabel1.setText("Blood Request");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Status", "Date", "Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setSelectionBackground(new java.awt.Color(204, 204, 255));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        labTest1.setBackground(new java.awt.Color(255, 55, 95));
        labTest1.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        labTest1.setForeground(new java.awt.Color(255, 255, 255));
        labTest1.setText("Process ");
        labTest1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labTest1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labTest1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 814, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(575, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labTest1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(438, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void labTest1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labTest1ActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = jTable1.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row to process.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        selectedAppointment= (Appointment) model.getValueAt(selectedRowIndex, 0);
        
        selectedAppointment.setStatus("Processed");
        
         JOptionPane.showMessageDialog(null, "Doctor has processed the request.");

         populateAppointmentTable();

       
      
        
    }//GEN-LAST:event_labTest1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton labTest1;
    // End of variables declaration//GEN-END:variables

    private void populateAppointmentTable() {
        Set<Appointment> doctorAppointmentsMap = doctor.getMap().getDoctorAppointmentsMap().get(doctor);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        // DefaultTableModel tableModel = new DefaultTableModel();
        for (Appointment appointment : doctorAppointmentsMap) {
            String patientUsername = appointment.getPatient().getUsername();
            // Retrieve patient information based on username from DoctorPatientMap

            Object[] rowData = {
                appointment,
                patientUsername,
                appointment.getStatus(),
                appointment.getDate(),
                appointment.getTime()
            };
            model.addRow(rowData);
        }

        // jTable1.setModel(tableModel);
    }

}
