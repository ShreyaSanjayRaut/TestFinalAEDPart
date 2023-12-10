/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.PatientRole;

import business.Doctor.Appointment;
import business.Doctor.Doctor;

import business.Doctor.DoctorPatientMap;
import business.EcoSystem;
import business.Organization.DoctorOrganization;
import business.Organization.Organization;
import business.Patient.Patient;
import business.Person.Person;
import business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import static java.time.Clock.system;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import ui.DoctorRole.RequestPresciption;

/**
 *
 * @author manal
 */
public class ManageMyRecordJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageDoctorAppointment
     */
    private JPanel workArea;
    private DoctorOrganization organization;
    private EcoSystem business;
    private UserAccount userAccount;
    private Doctor currentDoctor;
    ArrayList<Doctor> docList;

    public ManageMyRecordJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        initComponents();

        this.workArea = userProcessContainer;
        this.business = business;
        this.userAccount = account;

//        populateSpecialization();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        container = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDocAvail = new javax.swing.JTable();
        bookAppointment = new javax.swing.JButton();

        container.setBackground(new java.awt.Color(250, 249, 251));
        container.setPreferredSize(new java.awt.Dimension(1160, 750));
        container.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SF Pro Display", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("My Health Records");
        container.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 280, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("SF Pro Text", 0, 16)); // NOI18N
        jLabel2.setText("Date");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 102, -1));
        jPanel2.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 160, 36));

        container.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 730, 140));

        tblDocAvail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Blood Pressure", "Heart Rate", "Respiratory rate ", "Temperature", "Date"
            }
        ));
        tblDocAvail.setSelectionBackground(new java.awt.Color(204, 204, 255));
        jScrollPane1.setViewportView(tblDocAvail);

        container.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 730, 140));

        bookAppointment.setBackground(new java.awt.Color(255, 55, 95));
        bookAppointment.setFont(new java.awt.Font("SF Pro", 1, 18)); // NOI18N
        bookAppointment.setForeground(new java.awt.Color(255, 255, 255));
        bookAppointment.setText("Add Record");
        bookAppointment.setBorder(null);
        bookAppointment.setFocusPainted(false);
        bookAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookAppointmentActionPerformed(evt);
            }
        });
        container.add(bookAppointment, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 220, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, 831, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(container, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bookAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookAppointmentActionPerformed
        // TODO add your handling code here:

        bookDocAppointment();
    }//GEN-LAST:event_bookAppointmentActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookAppointment;
    private javax.swing.JPanel container;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDocAvail;
    // End of variables declaration//GEN-END:variables

   
    private void bookDocAppointment() {
        DefaultTableModel model = (DefaultTableModel) tblDocAvail.getModel();
        int selectedRow = tblDocAvail.getSelectedRow();

        
    }

    private boolean isAlreadyBooked(String doctorName, String appointmentDate) {

        Doctor doctor = getDoctorByName(doctorName);
        DoctorPatientMap doctorPatientMap = doctor.getMap();
        Set<Patient> patients = doctorPatientMap.getDoctorPatientMap().get(doctor);
        if (patients != null) {
            for (Patient patient : patients) {

                if (patient != null && patient.hasAppointmentOnDate(appointmentDate)) {
                    System.out.println("ui.PatientRole.ManageDoctorAppointment.isAlreadyBooked()");
                    return true;
                }
            }
        }
        return false;
    }

    private Doctor getDoctorByName(String doctorName) {
        for (Doctor doctor : docList) {
            if (doctor.e.getName().equals(doctorName)) {
                return doctor;
            }
        }
        return null;
    }

// Method to check if a particular doctor is available at a given date and specialization
    public boolean isVerify(String doctorName, String appointmentDate, String specialization) {
        Doctor doctor = getDoctorByName(doctorName);

// Check if the doctor is found
        if (doctor != null) {
            // Check if the doctor's map is not null
            if (doctor.getMap() != null) {
                DoctorPatientMap doctorMap = doctor.getMap();

                // Check if the doctor's appointments map is not null
                if (doctorMap.getDoctorAppointmentsMap() != null) {
                    Set<Appointment> doctorAppointments = doctorMap.getDoctorAppointmentsMap().get(doctor);

                    // Check if the doctor's appointment set is not null
                    if (doctorAppointments != null) {
                        for (Appointment appointment : doctorAppointments) {
                            // Check if the doctor name, date, and specialization match an existing appointment
                            if (appointment.getDoctorName().equals(doctorName)
                                    && appointment.getDate().equals(appointmentDate)) {
                                System.out.println("i am here in appointment");
                                return false; // Doctor is not available at the specified date and time
                            }
                        }
                    }
                }
            }
        }

        return true; // Default to true if any necessary objects are null or not found
    }

    private void cancelAppoint() {
        //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

    }
}
