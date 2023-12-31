/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.Doctor.Doctor;
import business.Employee.Employee;
import business.Organization.AdminOrganization;
import business.Organization.DoctorOrganization;
import business.Organization.Organization;
import business.Patient.Patient;
import business.Role.AdminRole;
import business.UserAccount.UserAccount;
import business.Person.Person;
import business.Role.PatientRole;
import java.util.ArrayList;

/**
 *
 * @author manali
 */
public class ConfigureABusiness {

    public static EcoSystem configure() {

        EcoSystem ecosystem = EcoSystem.getInstance();

        ArrayList<Organization> orglist = ecosystem.getOrganizationDirectory().getOrganizationList();
        for (Organization org : orglist) {

            if (org instanceof AdminOrganization) {
                System.out.println("business.ConfigureABusiness.configure()" + org.getName());
                return ecosystem;
            }
        }

        AdminOrganization adminOrganization = new AdminOrganization();
        Employee employee = new Employee();
        employee.setName("Akeem of Zamunda");

        System.out.println("business.ConfigureABusiness.configure()1111111111");

        UserAccount account = new UserAccount();
        Person xeroxadminperson001 = new Person();
        xeroxadminperson001.setFirstName("Xerox");
        xeroxadminperson001.setLastName("Admin");
        xeroxadminperson001.setEmail("Xerox@gmail.com");
        xeroxadminperson001.setType("Admin");
        xeroxadminperson001.setPhoneNumber("111-222-4444");
        account.setUsername("ad");
        account.setPassword("ad");
        account.setPerson(xeroxadminperson001);
        account.setRole(new AdminRole());

        adminOrganization.getEmployeeDirectory().getEmployeeList().add(employee);
        adminOrganization.getUserAccountDirectory().getUserAccountList().add(account);

        ecosystem.getOrganizationDirectory().getOrganizationList().add(adminOrganization);
        
        
        Patient account2 = new Patient();
        Person patient = new Person();
        patient.setFirstName("patient");
        patient.setLastName("Admin");
        patient.setEmail("Xerox@gmail.com");
        patient.setType("Admin");
        patient.setPhoneNumber("111-222-4444");
        account2.setUsername("h");
        account2.setPassword("h");
        account2.setPerson(patient);
        account2.setRole(new PatientRole());
       
        
        ecosystem.getAccountDirectory().addUserAccount(account2, new PatientRole());

        return ecosystem;
    }

}
