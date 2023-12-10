package business.Pharmacy;

import business.Doctor.Doctor;
import business.Employee.Employee;
import business.Person.Person;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author manali
 */
public class Pharmacist {

    List<Medicine> medicineInventory;
    String licence;
    String location;
    
    public Employee e;
    private Map<Doctor, List<Order>> doctorOrders;

    private List<Order> listOrders;
    
    
    public Pharmacist(Employee e) {
        this.e = e;
        medicineInventory = new ArrayList<>();
        doctorOrders = new HashMap<>();
        System.out.println("business.Pharmacy.Pharmacist.<init>()");
        listOrders = new ArrayList<>();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    
    
    public Map<Doctor, List<Order>> getDoctorOrders() {
        return doctorOrders;
    }

    public void setDoctorOrders(Map<Doctor, List<Order>> doctorOrders) {
        this.doctorOrders = doctorOrders;
    }
    
    

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }

    public List<Medicine> getMedicineInventory() {
        return medicineInventory;
    }

    public void setMedicineInventory(List<Medicine> medicineInventory) {
        this.medicineInventory = medicineInventory;
    }

    @Override
    public String toString() {
        return e.getName();
    }

    public List<Order> getListOrders() {
        return listOrders;
    }

    public void setListOrders(List<Order> listOrders) {
        this.listOrders = listOrders;
    }

   
    
    
    

}
