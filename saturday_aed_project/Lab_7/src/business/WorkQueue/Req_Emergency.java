/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.WorkQueue;

import business.Emergency.Emergency;
import business.UserAccount.UserAccount;

/**
 *
 * @author shreya
 */
public class Req_Emergency {

    int id;
    Emergency emergencyId;
   
    String status;
     private UserAccount user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Emergency getEmergencyID() {
        return emergencyId;
    }

    public void setEmergencyID(Emergency emergency) {
        this.emergencyId = emergency;
    }

    public UserAccount getUserId() {
        return user;
    }

    public void setUserId(UserAccount userId) {
        this.user = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    String response;
    String name;
    String location;

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
