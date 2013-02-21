/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import beans.Authentification;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author SENATEUR
 */
public class AuthentificationAction extends org.apache.struts.action.Action {

    
    
    
    /* forward name="success" path="" */
    private static final String SUCCESS = "success";
    private static final String FAILURE = "failure";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

    Authentification AutForm = (Authentification) form;
        
        //check out the texts field 
        if(
            
            AutForm.getLogin() == null || AutForm.getLogin().isEmpty()||
            AutForm.getPassword() == null || AutForm.getPassword().isEmpty()){
            
            request.setAttribute("errorConnexion","");
            return mapping.findForward(FAILURE);    
        }
        
        //if every text field is fill in then ok 
        return mapping.findForward(SUCCESS);
    }
}
