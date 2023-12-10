/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Emergency;

import business.Employee.Employee;

/**
 *
 * @author shrey
 */
public class Emergency {

    private String emergencyID;
    private String location;
    private String emergencyType;
    public Employee e;
    public String phoneNumber;
    String Email;
    String Status;

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Emergency(Employee e) {
        this.e = e;
    }

    public Employee getE() {
        return e;
    }

    public void setE(Employee e) {
        this.e = e;
    }

    public Emergency(String ambulanceID, String location, String emergencyType) {
        this.emergencyID = ambulanceID;
        this.location = location;
        this.emergencyType = emergencyType;
    }

    public String getEmergencyID() {
        return emergencyID;
    }

    public void setEmergencyID(String ambulanceID) {
        this.emergencyID = ambulanceID;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEmergencyType() {
        return emergencyType;
    }

    public void setEmergencyType(String emergencyType) {
        this.emergencyType = emergencyType;
    }

    @Override
    public String toString() {
        return "Emergency{"
                + "emergencyID='" + emergencyID + '\''
                + ", location='" + location + '\''
                + ", emergencyType='" + emergencyType + '\''
                + '}';
    }

}
