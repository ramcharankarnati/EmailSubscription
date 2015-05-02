package com.rest;

import Util.Email;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

/**
 * Created by rajeevgurram on 5/2/15.
 */
@Path("/email")
public class EmailSubscription {
    @GET
    @Path("/subscribe")
    @Produces("application/javascript")
    public Response emailSubscribe(@QueryParam("email") String email){
        Email.sendFromGMail(email);
        return Response.ok("Success")
                .header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
                .header("Access-Control-Allow-Credentials", "true")
                .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
                .header("Access-Control-Max-Age", "1209600")
                .build();
    }
}
