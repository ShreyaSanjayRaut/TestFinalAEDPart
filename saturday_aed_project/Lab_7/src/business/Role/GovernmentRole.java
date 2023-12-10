/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Role;

import business.EcoSystem;
import business.Organization.GovernmentOrganization;
import business.Organization.Organization;
import business.Organization.PharmacyOrganization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.GovernmentOrganization.DataAnalysisJPanel;

/**
 *
 * @author shrey
 */
public class GovernmentRole extends Role {

    public GovernmentRole() {
        this.type = Role.RoleType.Government;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business) {
        this.type = Role.RoleType.Government;
        return new DataAnalysisJPanel(userProcessContainer, account, (GovernmentOrganization) organization, business);
    }

}
