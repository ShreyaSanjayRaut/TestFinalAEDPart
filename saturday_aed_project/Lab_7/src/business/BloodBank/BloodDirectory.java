package business.BloodBank;
import business.Pharmacy.*;
import business.Doctor.Doctor;
import business.Employee.Employee;
import java.util.*;

/**
 *
 * @author shreya
 */
public class BloodDirectory {
    
    ArrayList<BloodBank> bloodBankArrayList;
    
    // Getter and Setter for java

    public ArrayList<BloodBank> getBloodBankArrayList() {
        return bloodBankArrayList;
    }

    public void setBloodBankArrayList(ArrayList<BloodBank> bloodBankArrayList) {
        this.bloodBankArrayList = bloodBankArrayList;
    }

  
    // Adding the items to the pharmaList
    public void addToBlood(BloodBank bloodBank) {
        bloodBankArrayList.add(bloodBank);
    }
    
    // Removing the items from the pharmaList
    public void removeFromBlood(BloodBank bloodBank) {
        bloodBankArrayList.remove(bloodBank);
    }
    
    public BloodBank createBloodBank(Employee e) {
        BloodBank p = new BloodBank(e);
        bloodBankArrayList.add(p);
        return p;
    }

    public BloodDirectory() {
        this.bloodBankArrayList = new ArrayList<>();
    };
    
    
}
