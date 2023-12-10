/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.EcoSystem;
import business.Organization.Organization;
import business.UserAccount.UserAccount;

import javax.swing.JPanel;
import ui.PatientRole.PatientWorkAreaPanel;

/**
 *
 * @author raunak
 */
public class PatientRole extends Role {

    public PatientRole() {
        this.type = Role.RoleType.Patient;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business) {
        this.type = Role.RoleType.Patient;
        return new PatientWorkAreaPanel(userProcessContainer, account, business);
    }

}
