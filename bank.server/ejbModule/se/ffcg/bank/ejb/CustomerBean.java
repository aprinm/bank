package se.ffcg.bank.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import se.ffcg.bank.entities.Customer;

/**
 * Session Bean implementation class Customer
 */

@Stateless
public class CustomerBean {

        @PersistenceContext(unitName = "bank")
        private EntityManager em;
        
        /*private EntityManager getEntityManager(){
                if (emf == null){
                        emf = Persistence.createEntityManagerFactory("bank");
                }
                return emf.createEntityManager();
        }*/

        public Customer getCustomer(int customerId){
//              EntityManager em = getEntityManager();
                return em.find(Customer.class, customerId);
        }
        
        public String getCustomerName(int customerId){
                //EntityManager em = getEntityManager();
                Customer cust = em.find(Customer.class, customerId);
                return cust.getFirstName();
        }
}
