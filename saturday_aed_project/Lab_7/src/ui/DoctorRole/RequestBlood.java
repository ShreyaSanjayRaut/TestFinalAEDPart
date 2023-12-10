/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.DoctorRole;

import business.BloodBank.BloodBank;
import business.BloodBank.BloodDirectory;
import business.Doctor.Appointment;
import business.Doctor.BloodRequest;
import business.Doctor.Doctor;
import business.Doctor.DoctorDirectorty;
import business.Doctor.DoctorPatientMap;
import business.EcoSystem;
import business.Organization.BloodOrganization;
import business.Organization.Organization;
import business.Organization.PharmacyOrganization;
import business.Patient.Patient;
import business.Pharmacy.Pharmacist;
import business.Pharmacy.PharmacyDirectory;
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
public class RequestBlood extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private Doctor currentDoctor;
    private Patient selectedPatient;
    private Appointment selectedAppointment;
    private BloodBank selectedBloodBank;

    /**
     * Creates new form ManageAppointment
     */
    public RequestBlood(JPanel userProcessContainer, UserAccount account, EcoSystem business, Doctor doctor) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.userAccount = account;
        this.currentDoctor = doctor;

        populateBloodBankCombo();
        
        firstNameTxt.setText(currentDoctor.e.getName());

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
        units = new javax.swing.JPanel();
        requestButtonButton = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        firstNameTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        unit = new javax.swing.JTextField();
        bloodbanklist = new javax.swing.JComboBox<>();
        bloodbankLocation = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        bloodGroup = new javax.swing.JComboBox<>();
        labTest1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("SF Pro Display", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bloodlogo.png"))); // NOI18N
        jLabel1.setText("Request Blood");

        units.setBackground(new java.awt.Color(255, 255, 255));
        units.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requestButtonButton.setBackground(new java.awt.Color(10, 132, 255));
        requestButtonButton.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        requestButtonButton.setForeground(new java.awt.Color(255, 255, 255));
        requestButtonButton.setText("Request Blood");
        requestButtonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestButtonButtonActionPerformed(evt);
            }
        });
        units.add(requestButtonButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 200, 39));

        cancel.setBackground(new java.awt.Color(255, 55, 95));
        cancel.setFont(new java.awt.Font("SF Pro Text", 1, 14)); // NOI18N
        cancel.setForeground(new java.awt.Color(255, 255, 255));
        cancel.setText("Cancel Request");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        units.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 580, 190, 39));

        jLabel2.setFont(new java.awt.Font("SF Pro Display", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setText("Request Blood Form");
        units.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 380, 50));

        jLabel7.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(73, 84, 90));
        jLabel7.setText("Blood Bank");
        units.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 220, -1));

        firstNameTxt.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        units.add(firstNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 420, 30));

        jLabel8.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(73, 84, 90));
        jLabel8.setText("Doctor Name");
        units.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 220, -1));

        jLabel10.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(73, 84, 90));
        jLabel10.setText("Location");
        units.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 220, -1));

        jLabel11.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(73, 84, 90));
        jLabel11.setText("Units (oz)");
        units.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 220, -1));

        unit.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        unit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unitActionPerformed(evt);
            }
        });
        unit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                unitKeyPressed(evt);
            }
        });
        units.add(unit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 420, 30));

        bloodbanklist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodbanklistActionPerformed(evt);
            }
        });
        units.add(bloodbanklist, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 420, 30));

        bloodbankLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodbankLocationActionPerformed(evt);
            }
        });
        units.add(bloodbankLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 420, 30));

        jLabel9.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(73, 84, 90));
        jLabel9.setText("Blood Group");
        units.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 220, -1));

        bloodGroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));
        bloodGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodGroupActionPerformed(evt);
            }
        });
        units.add(bloodGroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 420, 30));

        labTest1.setBackground(new java.awt.Color(255, 55, 95));
        labTest1.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        labTest1.setForeground(new java.awt.Color(255, 255, 255));
        labTest1.setText("Place Request");
        labTest1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labTest1ActionPerformed(evt);
            }
        });
        units.add(labTest1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 180, 41));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Req Id", "Name", "Status", "Blood Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(units, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(units, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(612, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void labTest1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labTest1ActionPerformed
        // TODO add your handling code here:

        BloodRequest bloodRequest = new BloodRequest();

        if (unit.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "please enter all mandatory fields");
            return;
        }

        int z = 1 + (int) (Math.random() * 100);
        bloodRequest.setId(z);
        bloodRequest.setFirstName(firstNameTxt.getText());
     //   System.out.println(""+bloodbanklist.getSelectedItem().toString());
        bloodRequest.setBloodType(bloodGroup.getSelectedItem().toString());
        bloodRequest.setUnits(Integer.parseInt(unit.getText()));
        bloodRequest.setStatus("In Progress");
        bloodRequest.setBloodBankName(selectedBloodBank);

        bloodRequest.setDoctor(currentDoctor);
        selectedBloodBank.getListBloodRequests().add(bloodRequest);

        JOptionPane.showMessageDialog(null, "Blood Unit Requested Successfully!!");
       // jTable3.setModel(new DefaultTableModel(null, new String[]{"ID", "Center", "Status", "Blood Type", "Units requested"}));

        populateRequestTable(selectedBloodBank.getId());

    }//GEN-LAST:event_labTest1ActionPerformed

    private void requestButtonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestButtonButtonActionPerformed
        // TODO add your handling code here:
        //addBloodReq();

    }//GEN-LAST:event_requestButtonButtonActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:

        //  deleteBloodReq();
    }//GEN-LAST:event_cancelActionPerformed

    private void unitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unitActionPerformed

    private void unitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_unitKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            unit.setEditable(false);
            JOptionPane.showMessageDialog(null, "enter number");
        } else {
            unit.setEditable(true);
        }
    }//GEN-LAST:event_unitKeyPressed

    private void bloodbanklistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodbanklistActionPerformed
        // TODO add your handling code here:

        String selectedBb = (String) bloodbanklist.getSelectedItem();

      //  System.out.println("ui.DoctorRole.RequestBlood.bloodbanklistActionPerformed()"+selectedBb);
        //  bloodbankLocation.addItem();
        populateRequestTable(selectedBb);
    }//GEN-LAST:event_bloodbanklistActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable3MouseClicked

    private void bloodGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodGroupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bloodGroupActionPerformed

    private void bloodbankLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodbankLocationActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_bloodbankLocationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> bloodGroup;
    private javax.swing.JComboBox<String> bloodbankLocation;
    private javax.swing.JComboBox<String> bloodbanklist;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField firstNameTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable3;
    private javax.swing.JButton labTest1;
    private javax.swing.JButton requestButtonButton;
    private javax.swing.JTextField unit;
    private javax.swing.JPanel units;
    // End of variables declaration//GEN-END:variables

    private void populateRequestTable(String selctedBloodBankString) {
        DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
        model.setRowCount(0);

        BloodOrganization borg = null;
        ArrayList<Organization> org = business.getOrganizationDirectory().getOrganizationList();
        for (Organization o : org) {

            if (o instanceof BloodOrganization) {
                borg = (BloodOrganization) o;
                System.out.println("ui.DoctorRole.RequestBlood.populateBloodBankCombo()");
                break;
            }

        }
        BloodDirectory directory = borg.getBloodDirectory();

        for (BloodBank bloodBank : directory.getBloodBankArrayList()) {

            if (bloodBank.getId() != null && bloodBank.getId().equals(selctedBloodBankString)) {
                selectedBloodBank = bloodBank;
            }
        }

        if (selectedBloodBank != null) {
            
           // System.out.println("9989898");

            bloodbankLocation.addItem(selectedBloodBank.getLocation());

            if (selectedBloodBank.getListBloodRequests() != null) {
                // DefaultTableModel tableModel = new DefaultTableModel();
                for (BloodRequest req : selectedBloodBank.getListBloodRequests()) {

                    if(req.getDoctor()!=null && req.getDoctor().e.getEmail()!=null && currentDoctor.e.getEmail()!= null && currentDoctor.e.getEmail().equals(req.getDoctor().e.getEmail())){
                    // Retrieve patient information based on username from DoctorPatientMap
                    Object[] rowData = {
                        req.getId(),
                        req.getBloodBankName(),
                        req.getStatus(),
                        req.getBloodType()

                    };
                    model.addRow(rowData);
                    }
                }
            }
        }

        // jTable1.setModel(tableModel);
    }

    private void populateBloodBankCombo() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        BloodOrganization borg = null;
        ArrayList<Organization> org = business.getOrganizationDirectory().getOrganizationList();
        for (Organization o : org) {

            if (o instanceof BloodOrganization) {
                borg = (BloodOrganization) o;
                System.out.println("ui.DoctorRole.RequestBlood.populateBloodBankCombo()");
                break;
            }

        }
        BloodDirectory directory = borg.getBloodDirectory();

        for (BloodBank bloodBank : directory.getBloodBankArrayList()) {
            System.out.println("ui.DoctorRole.RequestBlood.populateBloodBankCombo()999");
            bloodbanklist.addItem(bloodBank.toString());
        }
    }

}