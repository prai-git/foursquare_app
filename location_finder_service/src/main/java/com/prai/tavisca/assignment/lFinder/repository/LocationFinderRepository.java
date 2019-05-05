package com.prai.tavisca.assignment.lFinder.repository;

import java.util.Random;

import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(path = "/api/v1/locatoins/explore")
public class LocationFinderRepository {
	
	// &query=food&near=Sydney&v=20182507
	
	@CrossOrigin
	@GetMapping(path="/", produces = "application/json")
    public ResponseEntity<Object> getLocations(@RequestParam(name = "limit") Integer limit, @RequestParam(name = "query") String query, @RequestParam(name = "near") String near)
    {
		StringBuffer req = new StringBuffer();
		req.append("https://api.foursquare.com/v2/venues/explore?client_id=PMHC2WA1VCBHVYOPPSJ0QSBYTLRF4PNJ04OWVWV0PZJ0QFIR&client_secret=CULSZZ44YAEBOWBFGPB4BF5ISRXXSNYR0EE3JV3CNE2ZWHV0");
		if(!StringUtils.isEmpty(query)) {
			req.append("&query=").append(query);
		}
		
		if(!StringUtils.isEmpty(near)) {
			req.append("&near=").append(near);
		}
		
		if(!StringUtils.isEmpty(limit)) {
			req.append("&limit=").append(limit);
		}
		
		req.append("&v=20182507");
		
		
		RestTemplate restTemplate = new RestTemplate();
        Object location = restTemplate.getForObject(req.toString(), Object.class);
        
        return ResponseEntity.ok().body(location);
        
    }
	
}
