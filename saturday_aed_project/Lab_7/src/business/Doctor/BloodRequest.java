/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Doctor;

import business.BloodBank.BloodBank;

/**
 *
 * @author manal
 */
public class BloodRequest {
    
    String status;
    int id;
    String bloodType;
    Doctor  doctor;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

   

    BloodBank bloodBankName;
    int units;
    String firstName;

    public BloodBank getBloodBankName() {
        return bloodBankName;
    }

    public void setBloodBankName(BloodBank bloodBankName) {
        this.bloodBankName = bloodBankName;
    }

    
  

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return Integer.toString(id);
    }
    
    

    
}
