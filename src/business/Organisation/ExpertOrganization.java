/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organisation;

/**
 *
 * @author Prashant Kabra (kabra.p@husky.neu.edu)
 */
public class ExpertOrganization extends Organisation {

    public ExpertOrganization(String name) {
        super(OrganisationType.Experts, name);
    }

}