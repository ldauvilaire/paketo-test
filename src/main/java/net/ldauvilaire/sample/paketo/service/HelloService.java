package net.ldauvilaire.sample.paketo.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/sayHello")
public interface HelloService {
  @GET
  @Path("")
  @Produces(MediaType.TEXT_PLAIN)
  String welcome();
}
