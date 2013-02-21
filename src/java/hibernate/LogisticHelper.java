/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernate;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author SENATEUR
 */
public class LogisticHelper {

    public List<Manager> getListAbonnee(){

        Session session_ = HibernateUtil.currentSession();
        List<Manager> lst = null;
        
        Query q = session_.createQuery("from mobileLogistic");
         lst = (List<Manager>) q.list();

         HibernateUtil.closeSession();

          if(lst.size() > 0  && lst.get(0) != null)
            return lst;
        else
            return null;
    }

    public void updateUserdnsmobile(int _idManager,String _nom,String _prenom,String adresse,String tel
            ,String email,String _password,String login){
        Session session_ = HibernateUtil.currentSession();
        Transaction tx = session_.beginTransaction();
       Manager struct = (Manager) session_.get(Manager.class,_idManager);

        if(struct != null){
            struct.setNom(_nom);
            struct.setPrenom(_prenom);
            struct.setAdresse(adresse);
            struct.setTel(tel);
            struct.setEmail(email);
            struct.setPassword(_password);
            struct.setLogin(login);
            session_.save(struct);
            tx.commit();
        }
        HibernateUtil.closeSession();
    }

      public void Insertion (String _nom,String _prenom,String adresse,String tel
            ,String email,String _password,String login){
        Session session_ = HibernateUtil.currentSession();
        Transaction tx =  session_.beginTransaction();

        Manager struct = new Manager();
        struct.setId(1); //auto-incr
        struct.setNom(_nom);
        struct.setPrenom(_prenom);
        struct.setTel(tel);
        struct .setAdresse(adresse);
        struct.setPassword(_password);
        struct.setEmail(email);
        struct.setLogin(login);
        session_.save(struct);

        tx.commit();
        HibernateUtil.closeSession();
    }

    public void Delete(int id) {
        Session session_ = HibernateUtil.currentSession();
        Transaction tx =  session_.beginTransaction();

        Manager p = new Manager();
        p = (Manager) session_.get(Manager.class, id);
        if(p != null)
            session_.delete(p);

        tx.commit();
        HibernateUtil.closeSession();
    }


}
