/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.EcoSystem;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author kunal
 */
public abstract class Role {

    public enum RoleType {
        Admin("Admin"),
        Doctor("Doctor"),
        LabAssistant("Lab Assistant"),
        Patient("Patient"),
        Pharmacy("Pharmacy"),
        Blood("Blood"),
        Emergency("Emergency"),
        Government("Government");

        private String value;

        private RoleType(String value) {
            this.value = value;
        }
 
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public RoleType type;

    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business);

    @Override
    public String toString() {
        return (type != null) ? this.type.getValue() : this.getClass().getName();
    }

}
