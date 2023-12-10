/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Lab;

/**
 *
 * @author shrey
 */

import business.Employee.Employee;
import java.util.ArrayList;
import java.util.List;

public class LabDirectory {
    private ArrayList<Lab> labList;
    
    
    public LabDirectory() {
        labList = new ArrayList<>();
    }
    
    public ArrayList<Lab> getLabList() {
        return labList;
    }
    
    public Lab createLab(Employee employee) {
        Lab lab = new Lab(employee);
        lab.setLabName(employee.getName());
        labList.add(lab);
        return lab;
    }

    public void setLabList(ArrayList<Lab> labList) {
        this.labList = labList;
    }

    
}
