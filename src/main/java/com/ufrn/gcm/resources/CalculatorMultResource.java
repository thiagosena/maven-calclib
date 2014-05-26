package com.ufrn.gcm.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import com.google.gson.Gson;


@Path("/mult")
public class CalculatorMultResource {
	
	@GET
	@Produces("application/json")
	public String mult(@QueryParam("valor1") float valor1, 
			@QueryParam("valor2") float valor2){
		
		return new Gson().toJson(valor1*valor2);
	}
}
