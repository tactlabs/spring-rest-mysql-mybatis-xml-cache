package org.tact.base.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.tact.base.mybatis.domain.City;
import org.tact.base.mybatis.mapper.CityMapper;
import org.tact.base.service.CityService;

@Service
public class CityServiceImpl implements CityService {
	
	@Autowired
    private CityMapper cityMapper;

	@Cacheable("city")
	@Override
	public City getCityByState(String state) {
		
		City city = cityMapper.findByState(state);
				
		return city;
	}

	@Cacheable("cities")
	@Override
	public List<City> getCitiesByState(String state) {
		
		List<City> cities = cityMapper.findMultipleCitiesByStates(state);
		
		return cities;
	}
}
