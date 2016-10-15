package com.mkyong.customer.dao;

import java.util.List;
import com.mkyong.customer.model.Customer;

public interface UserDAO 
{

	public int findTotalCustomer();
        
        public void insert(String name, String sname, int univ, String photo, int cardNum, String pass);
	
}




