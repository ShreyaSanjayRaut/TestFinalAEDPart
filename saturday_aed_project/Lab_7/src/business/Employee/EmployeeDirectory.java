/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Employee;

import business.Doctor.DoctorDirectorty;
import business.Emergency.EmergencyDirectory;
import business.Lab.LabDirectory;
import java.util.ArrayList;

/**
 *
 * @author manali
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeList;
    private DoctorDirectorty docDirectory;
    private LabDirectory labDirectory;
    private EmergencyDirectory emergencyDirectory;

    public EmergencyDirectory getEmergencyDirectory() {
        return emergencyDirectory;
    }

    public void setEmergencyDirectory(EmergencyDirectory emergencyDirectory) {
        this.emergencyDirectory = emergencyDirectory;
    }
    
    

    public DoctorDirectorty getDocDirectory() {
        return docDirectory;
    }

    public LabDirectory getLabDirectory() {
        return labDirectory;
    }

    public void setLabDirectory(LabDirectory labDirectory) {
        this.labDirectory = labDirectory;
    }

    public void setDocDirectory(DoctorDirectorty docDirectory) {
        this.docDirectory = docDirectory;
    }

    public EmployeeDirectory() {
        employeeList = new ArrayList<>();
        docDirectory = new DoctorDirectorty();
        labDirectory = new LabDirectory();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee createEmployee(String name){
        Employee employee = new Employee();
        employee.setName(name);
        employeeList.add(employee);
        return employee;
    }
    
    
}