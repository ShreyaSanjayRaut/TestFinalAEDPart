/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;


import business.EcoSystem;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import ui.AdministrativeRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author kunal
 */
public class AdminRole extends Role{

    public AdminRole(){
        this.type = RoleType.Admin;
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business) {
        
        return new AdminWorkAreaJPanel(userProcessContainer, business);
    }

    
    
}
