/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Organization;

import business.Doctor.DoctorDirectorty;
import business.Pharmacy.PharmacyDirectory;
import business.Role.DoctorRole;
import business.Role.PharmacyRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author manal
 */
public class PharmacyOrganization extends Organization{
    
    private PharmacyDirectory pharmacyDirectory;

    public PharmacyOrganization() {
       super(Organization.Type.Pharmacy.getValue()); 
        this.pharmacyDirectory = new PharmacyDirectory();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new PharmacyRole());
        return roles;
    }

    public PharmacyDirectory getPharmacyDirectory() {
        return pharmacyDirectory;
    }

    public void setPharmacyDirectory(PharmacyDirectory pharmacyDirectory) {
        this.pharmacyDirectory = pharmacyDirectory;
    }

    
    
    
     
}