/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.DoctorRole;

import business.Doctor.Doctor;
import business.EcoSystem;
import business.Organization.Organization;
import business.Organization.PharmacyOrganization;
import business.Patient.Patient;
import business.Pharmacy.Medicine;
import business.Pharmacy.Order;
import business.Pharmacy.OrderStatus;
import business.Pharmacy.Pharmacist;
import business.Pharmacy.PharmacyDirectory;
import business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author manal
 */
public class RequestPresciption extends javax.swing.JPanel {

    /**
     * Creates new form RequestPresciption
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private Doctor doctor;
    private Pharmacist currentPharmacist;
    private Patient patient;
    List<Medicine> selectedMedicines;

    public RequestPresciption(JPanel userProcessContainer, UserAccount account, EcoSystem business, Doctor doctor, Patient patient) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.userAccount = account;
        this.doctor = doctor;
        this.patient = patient;
        populatePharma();

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
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtablemed = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jtablemed.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Medicine Name", "Price ($)"
            }
        ));
        jtablemed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtablemedMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtablemed);

        jButton1.setBackground(new java.awt.Color(255, 55, 95));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Place Order");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(255, 55, 95));
        btnBack.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("Select Pharmacist :");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/medicine-3d-render-icon-illustration-png.png"))); // NOI18N
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBack))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addContainerGap(2458, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:

        String currentPharmacist2 = (String) jComboBox1.getSelectedItem();

        populateTable(currentPharmacist2);
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int size = jtablemed.getRowCount();
        int selectedrows[] = jtablemed.getSelectedRows();
        selectedMedicines = new ArrayList<>();

        if (selectedrows.length < 0 || selectedrows.length > size - 1) {
            return;
        } else {

            for (int selectedRow : selectedrows) {
                Medicine medicine = (Medicine) jtablemed.getValueAt(selectedRow, 0);

                selectedMedicines.add(medicine);
            }
        }

        int orderID = currentPharmacist.getListOrders().size() + 1;
        Order order = new Order();
        //int randomId = 1 + (int) (Math.random() * 100);
        order.setOrderID(orderID);
        order.setDoctor(doctor);
        order.setMedicines(selectedMedicines);
        order.setPatient(patient);
        order.setStatus(OrderStatus.PENDING);
        order.setPharmacist(currentPharmacist);

        currentPharmacist.getListOrders().add(order);

        JOptionPane.showMessageDialog(null, "Order is placed");

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtablemedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtablemedMouseClicked
        // TODO add your handling code here:


    }//GEN-LAST:event_jtablemedMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);

        //  dwjp.populateRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void populateTable(String currentPharmacist) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        PharmacyOrganization porg = null;
        ArrayList<Organization> org = business.getOrganizationDirectory().getOrganizationList();
        for (Organization o : org) {

            if (o instanceof PharmacyOrganization) {
                porg = (PharmacyOrganization) o;
                break;
            }

        }
        PharmacyDirectory directory = porg.getPharmacyDirectory();

        for (Pharmacist p : directory.getPharmaArrayList()) {
            if (p.e.getName().equals(currentPharmacist)) {
                this.currentPharmacist = p;
            }
        }
        DefaultTableModel model = (DefaultTableModel) jtablemed.getModel();
        model.setRowCount(0);

        for (Medicine medicine : this.currentPharmacist.getMedicineInventory()) {
            Object[] rowData = {
                medicine,
                medicine.getCost()
            };
            model.addRow(rowData);
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtablemed;
    // End of variables declaration//GEN-END:variables

    private void populatePharma() {

        PharmacyOrganization porg = null;
        ArrayList<Organization> org = business.getOrganizationDirectory().getOrganizationList();
        for (Organization o : org) {

            if (o instanceof PharmacyOrganization) {
                porg = (PharmacyOrganization) o;
                break;
            }

        }
        PharmacyDirectory directory = porg.getPharmacyDirectory();

        for (Pharmacist pharmacist : directory.getPharmaArrayList()) {

            jComboBox1.addItem(pharmacist.toString());
        }

    }
}