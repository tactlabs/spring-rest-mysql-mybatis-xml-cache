package org.tact.base.service;

import java.util.List;

import org.tact.base.mybatis.domain.City;

public interface CityService {
	
	City getCityByState(String state);
	
	List<City> getCitiesByState(String state);
}
