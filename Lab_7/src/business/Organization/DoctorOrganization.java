/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Role.DoctorRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author sanketkesarkar
 */
public class DoctorOrganization extends Organization{

    public DoctorOrganization() {
        super(Organization.Type.Doctor.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DoctorRole());
        return roles;
    }
     
}