/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package business.Role;

import business.EcoSystem;
import business.Organization.EmergencyOrganization;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import ui.Emergency.EmergencyWorkAreaPanel;
import javax.swing.JPanel;

/**
 *
 * @author shrey
 */
public class EmergencyRole extends Role {
    
        public EmergencyRole() {
        this.type = Role.RoleType.Emergency; // Set the RoleType for EmergencyRole
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business) {
        this.type = Role.RoleType.Emergency; // Set the RoleType for EmergencyRole
        return new EmergencyWorkAreaPanel(userProcessContainer, account,(EmergencyOrganization) organization,   business);
      
    }
}
