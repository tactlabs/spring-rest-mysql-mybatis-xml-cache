package org.tact.base.rest;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.tact.base.service.CityService;

@RestController
@RequestMapping(value = "/base")
public class BaseController {
	
	@Autowired
	private CityService cityService;
	
	/**
	 * 
	 * @return
	 * 
	 * Possible urls:
	 * 		http://localhost:1878/base/
	 */
    @GetMapping(value = "")
    public <T> T testBase() {
        Map<String, Object> map = new LinkedHashMap<String, Object>();
        map.put("one", "two");
        map.put("three", "four");
        map.put("five", "six");
        map.put("seven", "eight");
        
        return (T) map;
    }
    
    
    
    /**
     * 
     * @param state
     * @return
     * 
     * Possible urls:
	 * 		http://localhost:1878/base/city
     * 
     */
    @GetMapping(value = "/city")
    public <T> T getCityByState(
    		@RequestParam(value = "state")String state) {
        Map<String, Object> map = new LinkedHashMap<String, Object>();
        
        map.put("state", state);
        map.put("city", cityService.getCityByState(state));
        
        return (T) map;
    }
    
    /**
     * 
     * @param state
     * @return
     * 
     * Possible urls:
	 * 		http://localhost:1878/base/cities
     */
    @GetMapping(value = "/cities")
    public <T> T getCitiesByState(
    		@RequestParam(value = "state")String state) {
        Map<String, Object> map = new LinkedHashMap<String, Object>();
        
        map.put("state", state);
        map.put("cities", cityService.getCitiesByState(state));
        
        return (T) map;
    }
}
