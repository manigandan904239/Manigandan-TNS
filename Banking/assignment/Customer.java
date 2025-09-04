package com.Banking.assignment;

public class Customer {

	    private int customerID;
	    private String name;
	    private String address;
	    private String contact;
	    
	
	    public Customer(int customerID, String name, String address, String contact) {
	        this.customerID = customerID;
	        this.name = name;
	        this.address = address;
	        this.contact = contact;
	    }
	    
	
	    public int getCustomerID() {
	        return customerID;
	    }
	    
	    public void setCustomerID(int customerID) {
	        this.customerID = customerID;
	    }

}
