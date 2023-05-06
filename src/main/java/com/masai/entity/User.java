package com.masai.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(unique = true, length = 50, nullable = false)
    private String username;
    

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private String address;

    @Column(name = "mobile_no")
    private String mobileNumber;

    
    @Column(nullable = false, length = 50)
    private String password;
    
    @Column(name = "is_deleted", nullable = false)
    private int is_deleted;
    
    @ManyToMany(mappedBy="user", cascade=CascadeType.ALL)
    private List<Item> item;
    

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(int id, String username, String firstName, String lastName, String address, String mobileNumber,
			String password, int is_deleted, List<Item> item) {
		super();
		this.id = id;
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.password = password;
		this.is_deleted = is_deleted;
		this.item = item;
	}





	public int getIs_deleted() {
		return is_deleted;
	}


	public void setIs_deleted(int is_deleted) {
		this.is_deleted = is_deleted;
	}



	public List<Item> getItem() {
		return item;
	}

	
	public void setItem(List<Item> item) {
		this.item = item;
	}




	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}





	@Override
	public String toString() {
		return "id=" + id + ", username=" + username + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", address=" + address + ", mobileNumber=" + mobileNumber + ", password=" + password + ", is_deleted="
				+ is_deleted + ", item=" + item ;
	}


	
    
    
}