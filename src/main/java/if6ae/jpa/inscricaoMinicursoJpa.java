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
public class inscricaoMinicursoJpa {
    
        EntityManagerFactory emf;
    
public EntityManagerFactory getEmf(){
if(emf==null)
         emf = 
   Persistence.createEntityManagerFactory("inscricao");

return emf;
}   
    
    //retornar a lista das inscrições em minicurso associadas a um determinado número de inscrição.
    public List<inscricao> findInscricaoMinicursoByNumero (int n){
    
    EntityManager em = getEmf().createEntityManager();

List<inscricao> p =
em.createQuery("select p from inscricao p where minicurso = :minicurso;").getResultList();
    em.setProperty("minicurso", n);
     
     return p;
        
    }
    
}
