/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author SENATEUR
 */
public class Authentification extends org.apache.struts.action.ActionForm {
    
    private String login;
    private String password;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   
    
    
    
    public Authentification() {
        super();
        // TODO Auto-generated constructor stub
    }

    
}
