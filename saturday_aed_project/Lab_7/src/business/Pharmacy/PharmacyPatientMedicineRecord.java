/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Pharmacy;

import business.Doctor.Doctor;
import business.Patient.Patient;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author manal
 */
public class PharmacyPatientMedicineRecord {

    Patient patient;
    Pharmacist pharma;
    Doctor doctor;

    String status;
    
    
    List<Medicine> medicinesList;

    public PharmacyPatientMedicineRecord(List<Medicine> medicinesList) {
        this.medicinesList = new ArrayList<>();
    
    }
    
    

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Pharmacist getPharma() {
        return pharma;
    }

    public void setPharma(Pharmacist pharma) {
        this.pharma = pharma;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
  
    
}
