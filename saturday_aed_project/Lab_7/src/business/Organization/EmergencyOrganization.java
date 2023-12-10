/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Organization;

/**
 *
 * @author shrey
 */
import business.Role.Role;
import business.Emergency.EmergencyDirectory;
import business.Role.EmergencyRole;
import business.WorkQueue.Req_EmergencyDir;
import java.util.ArrayList;

public class EmergencyOrganization extends Organization {

    private EmergencyDirectory emergencyDirectory;
    private Req_EmergencyDir reqEmgDir;

    public EmergencyOrganization() {
        super(Organization.Type.Emergency.getValue());
        reqEmgDir = new Req_EmergencyDir();

        this.emergencyDirectory = new EmergencyDirectory();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new EmergencyRole());
        return roles;
    }

    public Req_EmergencyDir getReqEmgDir() {

        System.out.println("11****");
        if (reqEmgDir == null) {
            System.out.println("22****");
            reqEmgDir = new Req_EmergencyDir();
        }
        return reqEmgDir;
    }

    public void setReqEmgDir(Req_EmergencyDir reqEmgDir) {
        this.reqEmgDir = reqEmgDir;
    }

    public EmergencyDirectory getEmergencyDirectory() {
        if (emergencyDirectory == null) {
            emergencyDirectory = new EmergencyDirectory();
        }
        return emergencyDirectory;
    }

    public void setEmergencyDirectory(EmergencyDirectory emergencyDirectory) {
        this.emergencyDirectory = emergencyDirectory;
    }
}
