package hibernate;
// Generated Aug 8, 2011 3:48:28 PM by Hibernate Tools 3.2.1.GA



/**
 * Manager generated by hbm2java
 */
public class Manager  implements java.io.Serializable {


     private Integer id;
     private String nom;
     private String prenom;
     private String adresse;
     private String tel;
     private String email;
     private String password;
     private String login;

    public Manager() {
    }

    public Manager(String nom, String prenom, String adresse, String tel, String email, String password, String login) {
       this.nom = nom;
       this.prenom = prenom;
       this.adresse = adresse;
       this.tel = tel;
       this.email = email;
       this.password = password;
       this.login = login;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNom() {
        return this.nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return this.prenom;
    }
    
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getAdresse() {
        return this.adresse;
    }
    
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public String getTel() {
        return this.tel;
    }
    
    public void setTel(String tel) {
        this.tel = tel;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getLogin() {
        return this.login;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }




}


