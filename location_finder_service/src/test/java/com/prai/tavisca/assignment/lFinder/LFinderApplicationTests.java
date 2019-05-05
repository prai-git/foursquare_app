package com.prai.tavisca.assignment.lFinder;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.prai.tavisca.assignment.lFinder.service.LocationFinderService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LFinderApplicationTests {

	@Autowired
	private LocationFinderService service;
	
	@Test
	public void contextLoads() {
		assertNotNull(service.getLocations(2, "food", "Sydney"));	
	}
	
	@Test
	public void contextLoads2() {
		assertNotNull(service.getLocations(12, "food", "Sydney"));	
	}

}
