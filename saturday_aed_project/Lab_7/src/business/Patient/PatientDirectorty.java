/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Patient;


import business.Doctor.*;
import business.Employee.Employee;
import business.Person.Person;
import java.util.ArrayList;

/**
 *
 * @author manali
 */
public class PatientDirectorty {

    private ArrayList<Patient> patientList;

    public PatientDirectorty() {
        patientList = new ArrayList<>();
    }

   

    public Patient createPatient(Person person) {
        Patient p = new Patient();
        
        patientList.add(p);
        return p;
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }
    
    
    
    

   
    
  
   
    
   

   

}
