package business.Organization;

import business.Employee.EmployeeDirectory;
import business.Lab.LabDirectory;
import business.Role.LabAssistantRole;
import business.Role.Role;
import java.util.ArrayList;

public class LabOrganization extends Organization {
    
    private LabDirectory labDirectory;

    public LabOrganization() {
    super(Organization.Type.Lab.getValue());
    this.labDirectory = new LabDirectory();
}
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new LabAssistantRole());
        return roles;
    }

    public LabDirectory getLabDirectory() {
    if (labDirectory == null) {
        labDirectory = new LabDirectory();
    }
    return labDirectory;
}
    public void setLabDirectory(LabDirectory labDirectory) {
        this.labDirectory = labDirectory;
    }
}
