/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mkyong.customer.dao;

import com.mkyong.customer.model.City;

/**
 *
 * @author IGOR
 */
public interface CityDAO {
    public void insertCityDAO(City city);
    public City getCityDAOById(Integer id);
}
