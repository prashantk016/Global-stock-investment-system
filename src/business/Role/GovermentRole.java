/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import UserInterface.Government.GovermentWorkAreaJPanel;
import business.EcoSystem;
import business.Organisation.Organisation;
import business.Useraccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Prashant Kabra (kabra.p@husky.neu.edu)
 */
public class GovermentRole extends Roles {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Object object, EcoSystem ecosystem) {
          return new GovermentWorkAreaJPanel(userProcessContainer, account, (Organisation) object, ecosystem);
   }

}