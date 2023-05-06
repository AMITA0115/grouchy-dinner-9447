package com.masai.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "items")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int item_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user; 

    private String name;

    private double price;

    private int quantity;

    private String description;

    @Column(name = "sold_status")
    private int soldStatus;

    private String category;
    
    @OneToMany(mappedBy="item", cascade = CascadeType.ALL)
    private Set<Transaction> transactionSet;

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

	public Item(int item_id, User user, String name, double price, int quantity, String description, int soldStatus,
			String category, Set<Transaction> transactionSet) {
		super();
		this.item_id = item_id;
		this.user = user;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.description = description;
		this.soldStatus = soldStatus;
		this.category = category;
		this.transactionSet = transactionSet;
	}




	public Set<Transaction> getTransactionSet() {
		return transactionSet;
	}




	public void setTransactionSet(Set<Transaction> transactionSet) {
		this.transactionSet = transactionSet;
	}




	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getSoldStatus() {
		return soldStatus;
	}

	public void setSoldStatus(int soldStatus) {
		this.soldStatus = soldStatus;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "item_id=" + item_id + ", user=" + user + ", name=" + name + ", price=" + price + ", quantity="
				+ quantity + ", description=" + description + ", soldStatus=" + soldStatus + ", category=" + category
				;
	}

	
	 
    
    

   
}

