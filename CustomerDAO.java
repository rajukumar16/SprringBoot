package com.nfdil.com;

import java.util.List;

public interface CustomerDAO {
	
	//Insert Customer's Record Database
	public void addCustomer(Customer cust);
	
	//Display Customer's Record Database
	public List<Customer> getAllCustomers();

}
