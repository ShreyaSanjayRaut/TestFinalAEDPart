/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Lab;

import business.Employee.Employee;

/**
 *
 * @author shrey
 */
public class Lab {
    
    String LabName;
    String Location;
    String phoneNumber;
    String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public Employee e;
    
    public Lab(Employee e)
    {
        this.e = e;
    }

    public String getLabName() {
        return LabName;
    }

    @Override
    public String toString() {
        return "Lab{" + "LabName=" + LabName + ", Location=" + Location + ", e=" + e + '}';
    }

    public void setLabName(String LabName) {
        this.LabName = LabName;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public Employee getE() {
        return e;
    }

    public void setE(Employee e) {
        this.e = e;
    }
    
    
}
