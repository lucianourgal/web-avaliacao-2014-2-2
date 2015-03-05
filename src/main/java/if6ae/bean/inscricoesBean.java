/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if6ae.bean;

import if6ae.entity.inscricao;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author a951277
 */
@Stateless
public class inscricoesBean {

        EntityManagerFactory emf;
    
public EntityManagerFactory getEmf(){
if(emf==null)
         emf = 
   Persistence.createEntityManagerFactory("inscricao");

return emf;
}    
    
    public List<inscricao> getInscricoes(){
     EntityManager em = getEmf().createEntityManager();

List<inscricao> p =
em.createQuery("select p from inscricao p").getResultList();
    
     
     return p;
    
    }
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
