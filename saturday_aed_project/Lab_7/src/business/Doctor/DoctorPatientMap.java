package business.Doctor;

import business.Doctor.Appointment;
import business.Doctor.Doctor;
import business.Patient.Patient;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DoctorPatientMap {
    private Map<Doctor, Set<Patient>> doctorPatientMap;
    private Map<Doctor, Set<Appointment>> doctorAppointmentsMap;

    public Map<Doctor, Set<Patient>> getDoctorPatientMap() {
        return doctorPatientMap;
    }

    public void setDoctorPatientMap(Map<Doctor, Set<Patient>> doctorPatientMap) {
        this.doctorPatientMap = doctorPatientMap;
    }

    public Map<Doctor, Set<Appointment>> getDoctorAppointmentsMap() {
        return doctorAppointmentsMap;
    }

    public void setDoctorAppointmentsMap(Map<Doctor, Set<Appointment>> doctorAppointmentsMap) {
        this.doctorAppointmentsMap = doctorAppointmentsMap;
    }
    
    

    public DoctorPatientMap() {
        // Initialize the maps when the object is created
        doctorPatientMap = new HashMap<>();
        doctorAppointmentsMap = new HashMap<>();
    }

    // Method to add a patient to a doctor
    public void addPatientToDoctor(Doctor doctor, Patient patient) {
        // Check if the doctor already exists in the map
        if (!doctorPatientMap.containsKey(doctor)) {
            // If not, create a new set for the doctor
            doctorPatientMap.put(doctor, new HashSet<>());
        }
        System.out.println("I am here "+patient.getUsername());
        // Add the patient to the set associated with the doctor
        doctorPatientMap.get(doctor).add(patient);
    }

   

    public Set<Patient> getPatientsForDoctor(Doctor doctor) {
        // Retrieve the set of patients associated with the given doctor
        Set<Patient> patients = doctorPatientMap.get(doctor);

        // Check if the set is not null (doctor found in the map)
        if (patients != null) {
            // You may want to perform additional checks or processing here

            // Return the set of patients
            return patients;
        } else {
            // Return an empty set if the doctor is not found in the map
            return Collections.emptySet();
        }
    }

    public void addAppointmentToDoctor(Doctor doctor, Appointment appointment) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
      // Check if the doctor already exists in the map
        if (!doctorAppointmentsMap.containsKey(doctor)) {
            // If not, create a new set for the doctor
            doctorAppointmentsMap.put(doctor, new HashSet<>());
        }

        // Add the patient to the set associated with the doctor
        doctorAppointmentsMap.get(doctor).add(appointment);
    
    }

    
}
