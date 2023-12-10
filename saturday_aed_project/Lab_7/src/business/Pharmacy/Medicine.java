/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Pharmacy;

/**
 *
 * @author manal
 */
public class Medicine {
    
    String medicineName;
    String cost;

    public Medicine(String medicineName, String cost) {
        this.medicineName = medicineName;
        this.cost = cost;
    }
    
    

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    
    
    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return medicineName;
    }
    
    
            
    
}
