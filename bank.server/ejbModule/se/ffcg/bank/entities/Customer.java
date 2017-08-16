package se.ffcg.bank.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Customer
 *
 */
@Entity
public class Customer implements Serializable {

        private static final long serialVersionUID = 1L;

        public Customer() {
                super();
        }
        

        private int customerId;
        private int ssn;
        private String username;
        private String password;
        private String address;
        private String firstName;
        private String lastName;

        public Customer(int customerId, Integer ssn, String username, String password, String firstName, String lastName, String address){
                this.customerId=customerId;
                this.ssn=ssn;
                this.username=username;
                this.password=password;
                this.firstName= firstName;
                this.address=address;
        }
        
        @Id
        @GeneratedValue(strategy=GenerationType.AUTO)
        public int getCustomerId(){
                return this.customerId;
        }
        
        public int getSsn(){
                return this.ssn;
        }
        
        public String getUsername(){
                return this.username;
        }
        
        public String getPassword(){
                return this.password;
        }
        public String getFirstName(){
                return this.firstName;
        }
        
        public String getLastName(){
                return this.lastName;
        }
        
        public String getAddress(){
                return this.address;
        }
        public void setCustomerId(Integer customerId){
                this.customerId=customerId;
        }
        
        public void setSsn(Integer ssn){
                this.ssn=ssn;
        }
        
        public void setUsername(String userName){
                this.username=userName;
        }
        
        public void setPassword(String password){
                this.password=password;
        }
        
        public void setFirstName(String firstName){
                this.firstName = firstName;
        }
        
        public void setLastName(String lastName){
                this.lastName = lastName;
        }
        
        public void setAddress(String address){
                this.address=address;
        }

        @Override
        public int hashCode() {
                final int prime = 31;
                int result = 1;
                result = prime * result + ((address == null) ? 0 : address.hashCode());
                result = prime * result + customerId;
                result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
                result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
                result = prime * result + ((password == null) ? 0 : password.hashCode());
                result = prime * result + ssn;
                result = prime * result + ((username == null) ? 0 : username.hashCode());
                return result;
        }

        @Override
        public boolean equals(Object obj) {
                if (this == obj)
                        return true;
                if (obj == null)
                        return false;
                if (getClass() != obj.getClass())
                        return false;
                Customer other = (Customer) obj;
                if (address == null) {
                        if (other.address != null)
                                return false;
                } else if (!address.equals(other.address))
                        return false;
                if (customerId != other.customerId)
                        return false;
                if (firstName == null) {
                        if (other.firstName != null)
                                return false;
                } else if (!firstName.equals(other.firstName))
                        return false;
                if (lastName == null) {
                        if (other.lastName != null)
                                return false;
                } else if (!lastName.equals(other.lastName))
                        return false;
                if (password == null) {
                        if (other.password != null)
                                return false;
                } else if (!password.equals(other.password))
                        return false;
                if (ssn != other.ssn)
                        return false;
                if (username == null) {
                        if (other.username != null)
                                return false;
                } else if (!username.equals(other.username))
                        return false;
                return true;
        }

   
}