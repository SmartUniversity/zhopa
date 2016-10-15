/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mkyong.customer.dao.impl;

import com.mkyong.customer.dao.UserDAO;
import com.mkyong.customer.model.Customer;
import com.mkyong.customer.model.CustomerRowMapper;
import com.mkyong.customer.model.Users;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 *
 * @author Antony
 */
public class UsersDAO extends JdbcDaoSupport implements UserDAO {
    
    public int findTotalCustomer(){
		
		String sql = "SELECT COUNT(*) FROM USERS";
		 
		int total = getJdbcTemplate().queryForInt(sql);
				
		return total;
	}
    
    public void insert(String name, String sname, int univ, String photo, int cardNum, String pass){
        String sql = "INSERT INTO USERS " +
                     "(user_name, user_surname, id_univ, photo, card_number, password) VALUES (?, ?, ?, ?, ?, ?)";
			 
	getJdbcTemplate().update(sql, new Object[] { 
            name,
            sname,
            univ,
            photo,
            cardNum,
            pass
        });
    }
    
    public void insertEvent(Integer userId, String ne, String desc, String c, String d1, String d2){
        
        String sql = "INSERT INTO events " +
                     "(id_user,name,photo,text,start_date,end_date,cost) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            Date thedate1 = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH).parse(d1);
            Date thedate2 = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH).parse(d2);
       
        getJdbcTemplate().update(sql, new Object[] { 
            6, ne, "photo", desc, thedate1, thedate2, c
        });
        } catch (ParseException ex) {
            Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
