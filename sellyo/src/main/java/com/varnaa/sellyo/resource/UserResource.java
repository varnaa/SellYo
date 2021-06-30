package com.varnaa.sellyo.resource;

import com.varnaa.sellyo.model.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserResource {

    @GET
    @Path("{id}")
    public Response getUser(@PathParam("id") String id){
        return null;
    }
}