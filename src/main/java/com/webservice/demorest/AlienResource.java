package com.webservice.demorest;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path ("aliens")  // Means: Whenever I call "aliens", I want to call the following resource. (http://localhost:8585/demorest/webapi/aliens) 
public class AlienResource {
	
	@GET 
	@Produces(MediaType.APPLICATION_XML)	// 500 Internal Error if this not provided. We have to mention what type of data we are expecting
	public List <Alien> getAlien() {
		System.out.println("getAlien() called the first time!!");
		Alien a1 = new Alien();
		a1.setName("Azeez");
		a1.setPoints(100);
		
		System.out.println("getAlien() called the second time!!");
		Alien a2 = new Alien();
		a2.setName("Ryan");
		a2.setPoints(80);
		
		// If only one object -> return a1;
		
		List <Alien> myAliens = Arrays.asList(a1, a2);
		
		return myAliens;		
						
	}
}
