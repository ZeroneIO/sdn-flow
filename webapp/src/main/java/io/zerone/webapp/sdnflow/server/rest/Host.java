package io.zerone.webapp.sdnflow.server.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import io.zerone.webapp.sdnflow.shared.ContainerReq;
import io.zerone.webapp.sdnflow.shared.ContainerRsp;
import io.zerone.webapp.sdnflow.shared.HostStats;
import io.zerone.webapp.sdnflow.shared.NetsetReq;
import io.zerone.webapp.sdnflow.shared.NetsetRsp;

@Path("/host")
public class Host {
  
  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  public ContainerRsp 
  RegisterHost(ContainerReq req) {
    return new ContainerRsp();
  }
  
  @GET
  @Path("/{ip}")
  @Produces(MediaType.APPLICATION_JSON)
  public HostStats
  QueryContainer(@PathParam("ip") String host_ip,
      @QueryParam("interval") Integer interval,
      @QueryParam("count") Integer count) {
    return new HostStats();
  }
  
  @POST
  @Path("/{ip}/netset")
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  public NetsetRsp 
  SetContainer(@PathParam("ip") String host_ip, NetsetReq req) {
    return new NetsetRsp();
  }

}
