package com.varnaa.sellyo.resource;
import com.varnaa.sellyo.model.Item;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/items")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ItemResource {

    @GET
    @Path("/")
    public Response getItems(){
        // Todo: .findAll()
        List<Item> itemList = new ArrayList<>();
        return Response.ok(itemList, MediaType.APPLICATION_JSON).build();
    }

    @POST
    @Path("/")
    public Response postItem(Item item){
        // Todo: .save(item)
        return Response.ok(item).status(Response.Status.CREATED).build();
    }

    @PUT
    @Path("/")
    public Response putItem(Item item){
        // Todo: .update(item)
        return Response.ok(item).status(Response.Status.OK).build();
    }

    @PATCH
    @Path("{id}")
    public Response patchItem(@QueryParam("status") String status){
        // Todo: .patch(item)
        return Response.ok().build();
    }

    @DELETE
    @Path("{id}")
    public Response deleteItem(@PathParam("id") int id){
        // Todo: .delete(id)
        return Response.ok().build();
    }
}
