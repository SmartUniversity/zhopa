/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mkyong.customer.dao.impl;

import com.mkyong.customer.dao.UniversityDAO;
import com.mkyong.customer.model.University;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;

/**
 *
 * @author IGOR
 */
public class UniversityDAOImpl extends SimpleJdbcDaoSupport implements UniversityDAO {

    @Override
    public void insertUniversityDAO(University university) {
        String sql = "INSERT INTO UNIVERSITY " +
                     "(name, id_city) VALUES (?, ?)";
			 
	getSimpleJdbcTemplate().update(sql, university.getName(), university.getIdCity().getId());    
    }

    @Override
    public University getUniversityById(Integer id) {
        String sql = "SELECT * FROM CITY WHERE ID = ?";
		 
	University university = getSimpleJdbcTemplate().queryForObject(
				sql,ParameterizedBeanPropertyRowMapper.newInstance(University.class), id);
	
	return university;
    }
    
}
