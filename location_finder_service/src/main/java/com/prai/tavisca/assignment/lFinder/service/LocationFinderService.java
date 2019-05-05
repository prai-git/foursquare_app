package com.prai.tavisca.assignment.lFinder.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Service
public class LocationFinderService {
	
	public Object getLocations(Integer limit, String query, String near)throws RestClientException {
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
