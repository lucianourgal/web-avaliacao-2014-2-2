/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if6ae.jpa;

import if6ae.entity.inscricao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author a951277
 */
public class inscricaoJpa {

    EntityManagerFactory emf;
    
public EntityManagerFactory getEmf(){
if(emf==null)
         emf = 
   Persistence.createEntityManagerFactory("inscricao");

return emf;
}    
    
    
 public inscricao findByNumero (int n){
 


EntityManager em = getEmf().createEntityManager();

inscricao p = em.find(inscricao.class, n);
     
     
     return p;
 }   
    
    
}
