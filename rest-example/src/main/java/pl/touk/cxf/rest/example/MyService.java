package pl.touk.cxf.rest.example;

import pl.touk.cxf.rest.example.model.Message;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("myService")
public interface MyService {

    @GET
    @Path("sayHello/{name}")
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHello(String name);

    @GET
    @Path("abc/{name}")
    @Produces(MediaType.TEXT_PLAIN)
    public String abc(@PathParam("name") String name);

    @GET
    @Path("getMessage/{name}")
    @Produces(MediaType.APPLICATION_XML)
    public Message message(@PathParam("name") String name);

    @POST
    @Path("postData")
    @Produces(MediaType.APPLICATION_XML)
    public Response postData(String username);

}