/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess.DAO;

import DataAccess.Entity.Account;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author root
 */
public class AccountDAO {
    
    public Account persist(Account account) {
        
        EntityManager em;
        EntityManagerFactory emf;
        emf = Persistence.createEntityManagerFactory("BancoPU");
        em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        try{
            em.persist(account);
            em.getTransaction().commit();
        } catch(Exception e){
            em.getTransaction().rollback();
        } finally {
            em.close();
            return account;
        } 
    }
    
}
