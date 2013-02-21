package beans;

import java.util.ArrayList;


/**
 *
 * @author SENATEUR
 */
public class CamionForm extends org.apache.struts.action.ActionForm {
    
    private String marque;

    public ArrayList<ChauffeurForm> getChauffeur() {
        return chauffeur;
    }

    public void setChauffeur(ArrayList<ChauffeurForm> chauffeur) {
        this.chauffeur = chauffeur;
    }
    private String model;
    private String CarteGrise;
    private String NumeroPlaque;
    private Boolean dispo;
    private String color;
    private ArrayList<ChauffeurForm> chauffeur;

    
    
   
    public CamionForm() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @return the marque
     */
    public String getMarque() {
        return marque;
    }

    /**
     * @param marque the marque to set
     */
    public void setMarque(String marque) {
        this.marque = marque;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the CarteGrise
     */
    public String getCarteGrise() {
        return CarteGrise;
    }

    /**
     * @param CarteGrise the CarteGrise to set
     */
    public void setCarteGrise(String CarteGrise) {
        this.CarteGrise = CarteGrise;
    }

    /**
     * @return the NumeroPlaque
     */
    public String getNumeroPlaque() {
        return NumeroPlaque;
    }

    /**
     * @param NumeroPlaque the NumeroPlaque to set
     */
    public void setNumeroPlaque(String NumeroPlaque) {
        this.NumeroPlaque = NumeroPlaque;
    }

    /**
     * @return the dispo
     */
    public Boolean getDispo() {
        return dispo;
    }

    /**
     * @param dispo the dispo to set
     */
    public void setDispo(Boolean dispo) {
        this.dispo = dispo;
    }

   
    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

   
  
}
