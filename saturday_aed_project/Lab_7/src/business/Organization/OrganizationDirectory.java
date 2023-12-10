/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author kunal
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            System.out.println("business.Organization.OrganizationDirectory.createOrganization()");
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Lab.getValue())){
            organization = new LabOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.Pharmacy.getValue())){
            organization = new PharmacyOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Blood.getValue())){
            organization = new BloodOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Emergency.getValue())){
            organization = new EmergencyOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.Government.getValue())){
            organization = new GovernmentOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
    
    
    public Organization findOrganization(String name){
        
        for(Organization org : organizationList)
        {
            if(org.getName().equals(name))
            {
                return org;
            }
        }
        return null;
        
        
    }
    
}