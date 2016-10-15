package com.mkyong.customer.dao;

import com.mkyong.customer.model.Users;

public interface UserDAO 
{

	public int findTotalCustomer();
        
        public void insert(String name, String sname, int univ, String photo, int cardNum, String pass);
        
        public void insertEvent(Integer userId, String ne, String desc, String c, String d1, String d2);
        
	
}




