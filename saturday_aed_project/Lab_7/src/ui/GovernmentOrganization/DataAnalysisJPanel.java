/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.GovernmentOrganization;

import business.EcoSystem;
import business.Organization.GovernmentOrganization;
import business.Organization.LabOrganization;
import business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import ui.LabAssistantRole.ManageLabProfile;

/**
 *
 * @author shrey
 */
public class DataAnalysisJPanel extends javax.swing.JPanel {

    private final EcoSystem business;

    /**
     * Creates new form DataAnalysisJPanel
     */
    public DataAnalysisJPanel(JPanel userProcessContainer, UserAccount account, GovernmentOrganization organization, EcoSystem business) {
        initComponents();
        this.business = business;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        timeLabel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rightPanel = new javax.swing.JPanel();
        Appointments = new javax.swing.JPanel();
        profile = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rightPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        jPanel6.setBackground(new java.awt.Color(249, 252, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        timeLabel.setFont(new java.awt.Font("SF Pro Display", 1, 36)); // NOI18N
        timeLabel.setText("3:45 PM");
        jPanel6.add(timeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 20, -1, -1));

        jLabel10.setFont(new java.awt.Font("SF Pro Display", 1, 36)); // NOI18N
        jLabel10.setText("Data Analysis");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 500, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        jLabel7.setText("jLabel6");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, -1));

        rightPanel.setBackground(new java.awt.Color(255, 255, 255));
        rightPanel.setLayout(new java.awt.CardLayout());

        Appointments.setBackground(new java.awt.Color(255, 255, 255));
        Appointments.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        profile.setBackground(new java.awt.Color(255, 255, 255));
        profile.setPreferredSize(new java.awt.Dimension(100, 48));
        profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                profileMousePressed(evt);
            }
        });
        profile.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Patient Analysis");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        profile.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 20, 190, -1));

        Appointments.add(profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 50));
        Appointments.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Lab Request Analysis");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        Appointments.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 200, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Emergency Requset Analysis");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        Appointments.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 260, 40));

        rightPanel1.setBackground(new java.awt.Color(255, 255, 255));
        rightPanel1.setLayout(new java.awt.CardLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/govimage.jpg"))); // NOI18N
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        rightPanel1.add(jLabel5, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Appointments, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rightPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Appointments, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rightPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void profileMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMousePressed
        // TODO add your handling code here:
        //ad  appointments();

    }//GEN-LAST:event_profileMousePressed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
               SwingUtilities.invokeLater(() -> {
            PatientDataAnalysis example = new PatientDataAnalysis("Patient Data Bar Chart",  business);
            example.setSize(800, 600);
            example.setLocationRelativeTo(null);
            example.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            example.setVisible(true);
        });

    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
          SwingUtilities.invokeLater(() -> {
            LabRequestAnalysis example = new LabRequestAnalysis("Lab Request Bar Chart",business);
            example.setSize(800, 600);
            example.setLocationRelativeTo(null);
            example.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            example.setVisible(true);
        });
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
         SwingUtilities.invokeLater(() -> {
            EmergencyRequestAnalysis example = new EmergencyRequestAnalysis("Emergency Request Bar Chart",business);
            example.setSize(800, 600);
            example.setLocationRelativeTo(null);
            example.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            example.setVisible(true);
        });
    }//GEN-LAST:event_jLabel4MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Appointments;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel profile;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JPanel rightPanel1;
    private javax.swing.JLabel timeLabel;
    // End of variables declaration//GEN-END:variables
}