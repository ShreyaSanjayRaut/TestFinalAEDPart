/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Patient;

import business.Doctor.Appointment;
import business.Employee.Employee;
import business.Person.Person;
import business.Pharmacy.Order;

import business.UserAccount.UserAccount;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author manal
 */
public class Patient extends UserAccount {
    
    
     private List<Appointment> appointments;
     List<Order> orders;
     
     String location;
     String age;
     String bp;
     String allergy;
     String Email;

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBp() {
        return bp;
    }

    public void setBp(String bp) {
        this.bp = bp;
    }

    public String getAllergy() {
        return allergy;
    }

    public void setAllergy(String allergy) {
        this.allergy = allergy;
    }
    
     
   
   public Patient() {
       
        this.appointments = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

  
   

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }
    
     

    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    public boolean hasAppointmentOnDate(String appointmentDate) {
        System.out.println("business.Patient.Patient.hasAppointmentOnDate()");
        for (Appointment appointment : appointments) {
            if (appointment.getDate().equals(appointmentDate)) {
                return true;
            }
        }
        return false;
    }
}
