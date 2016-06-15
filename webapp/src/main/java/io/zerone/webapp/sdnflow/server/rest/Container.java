package io.zerone.webapp.sdnflow.server.rest;

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

import com.sun.jersey.api.core.HttpContext;

import io.zerone.webapp.sdnflow.shared.ContainerReq;
import io.zerone.webapp.sdnflow.shared.ContainerRsp;
import io.zerone.webapp.sdnflow.shared.ContainerStats;
import io.zerone.webapp.sdnflow.shared.NetsetReq;
import io.zerone.webapp.sdnflow.shared.NetsetRsp;

@Path("/container")
public class Container {
  @Context
  HttpHeaders headers;

  @Context
  HttpContext context;

  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  public ContainerRsp 
  RegisterContainer(ContainerReq req) {
    return new ContainerRsp();
  }
  
  @GET
  @Path("/{cid}")
  @Produces(MediaType.APPLICATION_JSON)
  public ContainerStats
  QueryContainer(@PathParam("cid") String cid,
      @QueryParam("interval") Integer interval,
      @QueryParam("count") Integer count) {
    return new ContainerStats();
  }
  
  @POST
  @Path("/netset")
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  public NetsetRsp
  SetContainer(NetsetReq req) { // TODO: set default value or with query parameter
    return new NetsetRsp();
  }

  @POST
  @Path("/{cid}/netset")
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  public NetsetRsp
  SetContainer(@PathParam("cid") String cid, NetsetReq req) {
    return new NetsetRsp();
  }
  
}
