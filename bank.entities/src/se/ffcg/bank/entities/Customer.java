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

   
}
