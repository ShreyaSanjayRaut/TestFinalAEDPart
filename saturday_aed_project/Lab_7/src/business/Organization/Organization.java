/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Doctor.DoctorDirectorty;
import business.Employee.EmployeeDirectory;
import business.Role.Role;
import business.UserAccount.UserAccountDirectory;
import business.WorkQueue.Req_EmergencyDir;
import business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author kunal
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter;
        private Req_EmergencyDir reqEmgDir;

    //private DoctorDirectorty doctorDirectory;

    public enum Type {
        Admin("Admin Organization") {
//            //@Override
//            public Organization createOrganization() {
//                return new AdminOrganization();
//            }
        }, Doctor("Doctor Organization") {
//            public Organization createOrganization() {
//                return new DoctorOrganization();
//            }
        }, Lab("Lab Organization") {
//            public Organization createOrganization() {
//                return new LabOrganization();
//            }
        },
         Pharmacy("Pharmacy Organization") {
//            public Organization createOrganization() {
//                return new DoctorOrganization();
//            }
        },
        Blood("Blood Organization") {
//            public Organization createOrganization() {
//                return new DoctorOrganization();
//            }
        },
        Emergency("Emergency Organization") {
//            public Organization createOrganization() {
//                return new DoctorOrganization();
//            }
        },
        Government("Government Organization") {
//            public Organization createOrganization() {
//                return new DoctorOrganization();
//            }
        };
        
        private String value;

        private Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
//        public Organization createOrganization(Type t) {
//            return t.createOrganization();
//        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
                reqEmgDir = new Req_EmergencyDir();

        employeeDirectory = new EmployeeDirectory();
      //  doctorDirectory = new DoctorDirectorty();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();

    public UserAccountDirectory getUserAccountDirectory() {

        return userAccountDirectory;
    }

   
    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
     public Req_EmergencyDir getReqEmgDir() {
        System.out.println("1****");
        if (reqEmgDir == null) {
             System.out.println("2****");
        reqEmgDir = new Req_EmergencyDir();
    }
    return reqEmgDir;
    }

    public void setReqEmgDir(Req_EmergencyDir reqEmgDir) {
        this.reqEmgDir = reqEmgDir;
    }

}
