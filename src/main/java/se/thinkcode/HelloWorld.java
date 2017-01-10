package se.thinkcode;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/")
public class HelloWorld {
    @GET
    @Produces("text/plain")
    public String getMsg() {
        System.out.println("Message was called!");
        return "Hello, World!";
    }
}