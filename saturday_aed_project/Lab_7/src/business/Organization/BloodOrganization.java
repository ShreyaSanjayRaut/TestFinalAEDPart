/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Organization;

import business.BloodBank.BloodDirectory;
import business.Doctor.DoctorDirectorty;
import business.Pharmacy.PharmacyDirectory;
import business.Role.BloodRole;
import business.Role.DoctorRole;
import business.Role.PharmacyRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author manal
 */
public class BloodOrganization extends Organization{
    
    private BloodDirectory bloodDirectory;

    public BloodOrganization() {
       super(Organization.Type.Blood.getValue()); 
        this.bloodDirectory = new BloodDirectory();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new BloodRole());
        return roles;
    }

    public BloodDirectory getBloodDirectory() {
        return bloodDirectory;
    }

    public void setBloodDirectory(BloodDirectory bloodDirectory) {
        this.bloodDirectory = bloodDirectory;
    }

   

    
    
    
    
     
}