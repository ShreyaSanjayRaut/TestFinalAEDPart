/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.UserAccount;

import business.Person.Person;
import business.Employee.Employee;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author manali
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password, Person person, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setPerson(person);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public void addUserAccount(UserAccount userAccount, Role role){
        
        userAccountList.add(userAccount);
    }

    public boolean checkIfUsernameIsUnique(String text) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
    return true;
    }
    
    
    
}
