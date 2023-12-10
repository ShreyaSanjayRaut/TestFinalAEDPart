package business.Doctor;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author manal
 */


import business.Patient.Patient;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Appointment {
    private int appointmentID;
    private String doctorName;
    private String date;
    private String time;
    private String status; // You might want to use an enum for status
    private  Patient patient;

    public Appointment(int id ,String doctorName, String date, String time,Patient patient) {
        this.appointmentID=id;
        this.doctorName = doctorName;
        this.date = date;
        this.time = time;
        this.status = "Scheduled"; // Set the initial status
        this.patient = patient;
    }

    // Getter and setter methods for the attributes

    public int getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(int appointmentID) {
        this.appointmentID = appointmentID;
    }

    
    
    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    

    // Additional methods as needed

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @Override
    public String toString() {
        return Integer.toString(appointmentID);
    }
    
    
}
