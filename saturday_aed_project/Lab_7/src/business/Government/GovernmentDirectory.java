/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Government;

import java.util.ArrayList;

/**
 *
 * @author shrey
 */
public class GovernmentDirectory {
    
    private ArrayList<Government> governmentList;
    private GovernmentDirectory governmentDirectory;

    public ArrayList<Government> getGovernmentList() {
        return governmentList;
    }

    public void setGovernmentList(ArrayList<Government> governmentList) {
        this.governmentList = governmentList;
    }

    public GovernmentDirectory getGovernmentDirectory() {
        return governmentDirectory;
    }

    public void setGovernmentDirectory(GovernmentDirectory governmentDirectory) {
        this.governmentDirectory = governmentDirectory;
    }
    
    
}
