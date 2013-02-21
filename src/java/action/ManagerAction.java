/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import beans.ManagerForm;
import hibernate.LogisticHelper;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author SENATEUR
 */
public class ManagerAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";
     private static final String FAILURE = "failure";

   
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        ManagerForm managerForm = (ManagerForm) form;
        
        //check out the texts field 
        if(managerForm.getNom() == null || managerForm.getNom().isEmpty() ||
            managerForm.getPrenom() == null || managerForm.getPrenom().isEmpty() ||
            managerForm.getAdresse() == null || managerForm.getAdresse().isEmpty()||
            managerForm.getEmail() == null || managerForm.getEmail().isEmpty()|| 
            managerForm.getTelephone() == null || managerForm.getTelephone().isEmpty()||
            managerForm.getLogin() == null || managerForm.getLogin().isEmpty()||
            managerForm.getPassword() == null || managerForm.getPassword().isEmpty()){
            
            request.setAttribute("errorInscription","");
            return mapping.findForward(FAILURE);    
        }
        
        
          LogisticHelper helper = new LogisticHelper();
          helper.Insertion(managerForm.getNom(),
                  managerForm.getPrenom(), managerForm.getAdresse(),
                  managerForm.getTelephone(),managerForm.getEmail(),
                  managerForm.getPassword(),managerForm.getLogin());
        //if every text field is fill in then ok 
        return mapping.findForward(SUCCESS);
    }
}
