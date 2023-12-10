/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Role;

import business.EcoSystem;
import business.Organization.Organization;
import business.Organization.PharmacyOrganization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;

import ui.Pharmacist.PharmacyOrgWorkAreaJPanel;

/**
 *
 * @author manal
 */
public class PharmacyRole extends Role {
    
    
 public PharmacyRole() {
        this.type = Role.RoleType.Pharmacy;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business) {
        this.type = Role.RoleType.Pharmacy;
        return new PharmacyOrgWorkAreaJPanel(userProcessContainer, account, (PharmacyOrganization) organization, business);
    }

}
