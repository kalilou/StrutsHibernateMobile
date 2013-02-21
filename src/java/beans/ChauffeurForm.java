/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.ArrayList;


/**
 *
 * @author SENATEUR
 */
public class ChauffeurForm extends org.apache.struts.action.ActionForm {
    
    private String nom;
    private String prenom;
    private String adresse;
    private String telephone;
    private String email;
    private ArrayList<CamionForm> camion;

   
    public ChauffeurForm() {
        super();
        // TODO Auto-generated constructor stub
    }

    public ArrayList<CamionForm> getCamion() {
        return camion;
    }

    public void setCamion(ArrayList<CamionForm> camion) {
        this.camion = camion;
    }

   
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * @return the adresse
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * @param adresse the adresse to set
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    /**
     * @return the telephone
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * @param telephone the telephone to set
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
