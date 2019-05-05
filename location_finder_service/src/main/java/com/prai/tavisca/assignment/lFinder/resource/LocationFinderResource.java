package com.prai.tavisca.assignment.lFinder.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;

import com.prai.tavisca.assignment.lFinder.service.LocationFinderService;


@RestController
@RequestMapping(path = "/api/v1/locations/explore")
public class LocationFinderResource {
	
	@Autowired
	private LocationFinderService service;
	
	
	@CrossOrigin
	@GetMapping(path="/", produces = "application/json")
    public ResponseEntity<Object> getLocations(@RequestParam(name = "limit") Integer limit, @RequestParam(name = "query") String query, @RequestParam(name = "near") String near)
    {
		try {
			Object locations = service.getLocations(limit, query, near);
			return ResponseEntity.ok().body(locations);
		} catch(RestClientException ex) {
			return ResponseEntity.badRequest().build();
		}
        
    }
	
}
