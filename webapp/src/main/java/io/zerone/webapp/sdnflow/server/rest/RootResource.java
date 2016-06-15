package io.zerone.webapp.sdnflow.server.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.sun.jersey.api.core.HttpContext;
import com.sun.jersey.core.util.Base64;

/**
 *
 */
@Path("/")
public class RootResource {
    protected static Log log = LogFactory.getLog(RootResource.class);
    public static final String CONTENT = "SDN Flow Control\n";
  
    @Context
    HttpContext context;

    @GET
    public Response login(
        @Context HttpHeaders headers, 
        @QueryParam("source") String source) {
        // you can get username form HttpHeaders
        log.debug("Service: GET / User: " + getUser(headers));

        String npath = source;   // node path (URI)
        String uid = getUid(npath);

        return Response.ok(CONTENT).type(MediaType.TEXT_HTML).build();
    }

    private String getUser(HttpHeaders headers) {
        // this is a very minimalistic and "naive" code; if you plan to use it
        // add necessary checks (see
        // com.sun.jersey.samples.https_grizzly.auth.SecurityFilter)
        List<String> header = headers.getRequestHeader("authorization");
        if (header == null) {
            log.warn("No authorization header");
            return "";
        }
        String auth = header.get(0);
        auth = auth.substring("Basic ".length());
        String[] values = new String(Base64.base64Decode(auth)).split(":");

        log.debug("login with username=" + values[0] + ", pass=" + values[1]);
        return values[0];
    }

    public static String getUid(String npath) {
        // TODO: use generated UID
        return Integer.toHexString(npath.hashCode());
    }

    public static boolean checkNodeState(HttpContext context, String source) {
        final String key = "DATA_SOURCE";
        if (!context.getProperties().containsKey(key)) {
            // TODO xiaofeng 12-04-08: context not working ???
            context.getProperties().put(key, source);
            return false;
        }
        return true;
    }
}
