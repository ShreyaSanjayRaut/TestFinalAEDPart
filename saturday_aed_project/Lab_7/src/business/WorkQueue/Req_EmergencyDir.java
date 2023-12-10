/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author shrey
 */
public class Req_EmergencyDir {
    private ArrayList<Req_Emergency> emergencyUserList;

    public Req_EmergencyDir() {
        emergencyUserList = new ArrayList<>(); // Initialize the list in the constructor
    }

      public void addEmergencyUser(Req_Emergency user){
        emergencyUserList.add(user);
    }
    
    public void removeEmergencyUser(Req_Emergency user){
        emergencyUserList.remove(user);
    }

    public ArrayList<Req_Emergency> getEmergencyUserList() {
        return emergencyUserList;
    }

    public void setEmergencyUserList(ArrayList<Req_Emergency> emergencyUserList) {
        this.emergencyUserList = emergencyUserList;
    }
    
    
}
