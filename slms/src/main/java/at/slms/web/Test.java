package at.slms.web;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.awt.*;
import java.io.Serializable;

@Path("test")
@Stateless
public class Test {

    @PersistenceContext
    private EntityManager em;

    @GET
    //@Produces(MediaType.APPLICATION_JSON)
    public Response testGetter() {

        return Response.ok("hi web")
                .build();
    }
}
