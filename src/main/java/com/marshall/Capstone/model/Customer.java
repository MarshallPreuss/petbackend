package com.marshall.Capstone.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="customer")
public class Customer {
	
	
	@Id
    @GeneratedValue
    @Column(name = "cust_id")
    private Long id;
 
	 @Column(name = "cust_name")
    private String custName;
 
	@Column(name = "cust_address")
    private String custAddress;
 
    public Customer() {
    	super();
    }
 
    public Customer(String custName, String custAddress) {
		super();
		this.custName = custName;
		this.custAddress = custAddress;
	}


	//Getters and setters
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustAddress() {
		return custAddress;
	}

	public void setPCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}

	
}