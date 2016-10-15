/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mkyong.customer.dao;

import com.mkyong.customer.model.University;

/**
 *
 * @author IGOR
 */
public interface UniversityDAO {
    public void insertUniversityDAO(University university);
    public University getUniversityById(Integer id);
}
