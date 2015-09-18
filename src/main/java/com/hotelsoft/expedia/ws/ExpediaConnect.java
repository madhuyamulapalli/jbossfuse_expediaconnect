package com.hotelsoft.expedia.ws;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path(value="/")
public interface ExpediaConnect {

	@POST
	@Path(value="/")
	@Produces({MediaType.APPLICATION_XML})
	public String publishRates();
}
