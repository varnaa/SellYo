package com.varnaa.sellyo.resource;

import com.varnaa.sellyo.model.User;

import javax.validation.Valid;
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
        return Response.ok("{'id':'1', 'firstName':'Varnaa'}", "application/json").build();
    }

    @POST
    @Path("/")
    public Response postUser(User user){
        // Todo: Database .save(user)
        System.out.println(user.getFirstName());
        return Response.accepted(user).status(Response.Status.CREATED).build();
    }

    @PUT
    @Path("/")
    public Response putUser(User user){
        // Todo: Database .update(user)
        return Response.accepted(user).status(Response.Status.OK).build();
    }

    @DELETE
    @Path("{id}")
    public Response deleteUser(User user){
        // Todo: Database .delete(user)
        return Response.ok().build();
    }


}