package pl.touk.cxf.rest.example;

import pl.touk.cxf.rest.example.model.Message;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("myService")
public class MyServiceImpl implements MyService {

    @GET
    @Path("sayHello/{name}")
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHello(@PathParam("name") String name) {
        return "My name is " + name;
    }

    @GET
    @Path("abc/{name}")
    @Produces(MediaType.TEXT_PLAIN)
    public String abc(@PathParam("name") String name) {
        return "My name is " + name;
    }

    @GET
    @Path("getMessage/{name}")
    @Produces(MediaType.APPLICATION_XML)
    public Message message(@PathParam("name") String name) {
        return new Message("My name is " + name);
    }

    @POST
    @Path("postData")
    @Produces(MediaType.APPLICATION_XML)
    public Response postData(String username) {
        String [] response = {username};
        return Response.ok(response).build();
    }

}