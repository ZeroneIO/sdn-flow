package io.zerone.webapp.sdnflow.server.rest;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response.Status;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@Path("/event")
public class Events {
  private static Log log = LogFactory.getLog(Events.class);
  private static Format formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

  @Context
  HttpHeaders headers;

  @GET
  @Path("/{uid}")
  @Produces(MediaType.TEXT_PLAIN)
  public String getXml(@PathParam("uid") String uid, @QueryParam("q") String query) {
    String sendData = formatter.format(new Date());
    log.warn(sendData + ": read form for uid " + uid + " with query=" + query);
    /*
    if (entity == null) {
      return Response.status(Response.Status.NOT_FOUND).entity("Entity not found for UUID: " + uid).build();
    }
    */
    return "query=" + query;
  }
  
  /**
   * Process the provisioning updating. Produces the value list
   * values submitted.
   * 
   * @param formData the data from the form submission
   * @return status code name
   */
  @POST
  @Path("/{uid}")
  @Consumes(MediaType.APPLICATION_JSON)
  public String processForm(@PathParam("uid") String uid, String data) {
    StringBuffer sb = new StringBuffer();
    log.warn("set form for uid " + uid + " with form " + sb.toString());

    return Status.OK.name();
  }
  
}
