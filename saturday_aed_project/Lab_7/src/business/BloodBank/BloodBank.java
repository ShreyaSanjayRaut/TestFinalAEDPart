/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.BloodBank;

import business.Doctor.BloodRequest;
import business.Doctor.Doctor;
import business.Employee.Employee;
import business.Patient.BloodDonationRequest;
import business.Pharmacy.Order;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author manal
 */
public class BloodBank extends Employee {

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    String licence;
    String location;
    public Employee e;
    String id;
    List<BloodRequest> listBloodRequests;
    String Email;

    private Map<String, Integer> stock;
    
     List<BloodDonationRequest> listBloodDonationRequest;


    public BloodBank(Employee e) {
        this.e = e;
        this.stock = new HashMap<>();
        this.listBloodRequests = new ArrayList<>();
        this.listBloodDonationRequest = new ArrayList<>();
    }

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }

    public Employee getE() {
        return e;
    }

    public void setE(Employee e) {
        this.e = e;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Map<String, Integer> getStock() {
        return stock;
    }

    public void setStock(Map<String, Integer> stock) {
        this.stock = stock;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return  id;
    }

    public List<BloodRequest> getListBloodRequests() {
        return listBloodRequests;
    }

    public void setListBloodRequests(List<BloodRequest> listBloodRequests) {
        this.listBloodRequests = listBloodRequests;
    }

    public List<BloodDonationRequest> getListBloodDonationRequest() {
        return listBloodDonationRequest;
    }

    public void setListBloodDonationRequest(List<BloodDonationRequest> listBloodDonationRequest) {
        this.listBloodDonationRequest = listBloodDonationRequest;
    }
    
    
    
    

}
