package com.ufrn.gcm.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import com.google.gson.Gson;


@Path("/div")
public class CalculatorDivResource {
		
	@GET
	@Produces("application/json")
	public String div(@QueryParam("valor1") float valor1, 
			@QueryParam("valor2") float valor2) throws Exception{
		
		if(valor2 == 0)
			throw new Exception("Nao pode efetuar uma divisao por zero!");
		
		return new Gson().toJson(valor1/valor2);
	}
	
}
