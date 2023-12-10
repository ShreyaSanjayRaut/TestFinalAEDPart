/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Role;

import business.EcoSystem;
import business.Organization.BloodOrganization;
import business.Organization.DoctorOrganization;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;

import ui.blood.BloodOrgWorkAreaJPanel;

/**
 *
 * @author manal
 */
public class BloodRole extends Role {

    public BloodRole() {
        this.type = Role.RoleType.Blood;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business) {
        this.type = Role.RoleType.Blood;
        return new BloodOrgWorkAreaJPanel(userProcessContainer, account, (BloodOrganization) organization, business);
    }

}
