/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Emergency;


import business.Employee.Employee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shrey
 */
public class EmergencyDirectory {
    
       private List<Emergency> emergencyList;

    public EmergencyDirectory() {
        emergencyList = new ArrayList<>();
    }

    public List<Emergency> getEmergencyList() {
        return emergencyList;
    }

    public Emergency createEmergency(Employee employee) {
        Emergency emergency = new Emergency(employee);
        emergencyList.add(emergency);
        emergency.setEmergencyID(employee.getName());
        return emergency;
    }

    public void setEmergencyList(List<Emergency> emergencyList) {
        this.emergencyList = emergencyList;
    }
}
