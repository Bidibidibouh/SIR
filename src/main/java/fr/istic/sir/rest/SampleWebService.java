package fr.istic.sir.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import jpa.Heater;
import jpa.Home;

@Path("/hello")
public class SampleWebService {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHello() {
        return "Hello, how are you?";
    }
    
    @GET
	@Path("/home")
	@Produces(MediaType.APPLICATION_JSON)
	public Home getHome() {
		Home h = new Home();
		h.setIdHome(1);
		Heater h1 = new Heater(1,500);
		Heater h2 = new Heater(2,600);
		h.addHeaters(h1);
		h.addHeaters(h2);
		return h;
	}
}
