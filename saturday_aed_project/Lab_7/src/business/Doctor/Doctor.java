package business.Doctor;

import business.Employee.Employee;
import business.Person.Person;

import java.util.List;

/**
 *
 * @author manali
 */
public class Doctor  {

    String specialization;
    String hospital;
    public Employee e;
    DoctorPatientMap map;
    String location;
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
    

    public DoctorPatientMap getMap() {
        return map;
    }

    public void setMap(DoctorPatientMap map) {
        this.map = map;
    }
   
    public Doctor(Employee e)
    {
        this.e = e;
        map = new DoctorPatientMap();
    }
    

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getHospital() {
        return hospital;
    }
    
    
    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

   

}
