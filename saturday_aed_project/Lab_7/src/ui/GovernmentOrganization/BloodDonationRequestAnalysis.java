/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui.GovernmentOrganization;

import business.BloodBank.BloodBank;
import business.BloodBank.BloodDirectory;
import business.EcoSystem;
import business.Organization.BloodOrganization;
import business.Organization.DoctorOrganization;
import business.Organization.Organization;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author shrey
 */
public class BloodDonationRequestAnalysis extends javax.swing.JFrame {

    private final EcoSystem business;

    /**
     * Creates new form BloodDonationRequestAnalysis
     */
    public BloodDonationRequestAnalysis(String title, EcoSystem business) {
        super(title);
        this.business = business;
        DefaultCategoryDataset dataset = createDataset(); // Create dataset with blood donation request data
        JFreeChart chart = createChart(dataset); // Create bar chart
        ChartPanel chartPanel = new ChartPanel(chart);
        setContentPane(chartPanel);
        initComponents();
    }

    
     private DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        int completedCount = 0;
        int pendingCount = 0;
        Organization org = null;

        // Assuming bloodBankList is a list of BloodBankOrganization objects
        for (Organization organization : business.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof DoctorOrganization) {
                org = organization;
                break;
            }
        }

        if (org != null) {
            DoctorOrganization bloodBankOrg = (DoctorOrganization) org;
            System.out.println("bloodBankOrg: " + bloodBankOrg);
           
          /*  for (BloodBank bloodRequest :  bloodBankOrg.getDoctorDirectory().getDoctorList().) {
                System.out.println("bloodRequest: " + bloodRequest);
                System.out.println("bloodRequest status: " + bloodRequest.);

                if (bloodRequest.getStatus().equalsIgnoreCase("completed")) {
                    completedCount++;
                } else if (bloodRequest.getStatus().equalsIgnoreCase("sent")) {
                    pendingCount++;
                }
            }*/
        }

        // Add counts to the dataset
        dataset.addValue(completedCount, "Status", "Completed");
        dataset.addValue(pendingCount, "Status", "Sent");

        return dataset;
    }

    private JFreeChart createChart(DefaultCategoryDataset dataset) {
        JFreeChart chart = ChartFactory.createBarChart(
                "Blood Donation Request Analysis", // Chart title
                "Status",                          // X-axis label
                "Number of Requests",              // Y-axis label
                dataset                            // Dataset
        );
        return chart;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BloodDonationRequestAnalysis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BloodDonationRequestAnalysis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BloodDonationRequestAnalysis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BloodDonationRequestAnalysis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            //    new BloodDonationRequestAnalysis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
