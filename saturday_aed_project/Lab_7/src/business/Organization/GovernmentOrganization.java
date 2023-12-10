/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Organization;

import business.Government.GovernmentDirectory;
import business.Role.GovernmentRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author shrey
 */
public class GovernmentOrganization extends Organization {

    public GovernmentDirectory getGovernmentDirectory() {
        if (governmentDirectory == null) {
        governmentDirectory = new GovernmentDirectory();
    }
    return governmentDirectory;
    }

    public void setGovernmentDirectory(GovernmentDirectory governmentDirectory) {
        this.governmentDirectory = governmentDirectory;
    }
    
    private GovernmentDirectory governmentDirectory;

    public GovernmentOrganization() {
          super(Organization.Type.Government.getValue());
          this.governmentDirectory = new GovernmentDirectory();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new GovernmentRole());
        return roles;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
        
   
}
