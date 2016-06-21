package lf.ask.rs;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import lf.ask.pojo.HipchatRequestMessage;
import lf.ask.pojo.HipchatResponseMessage;

/**
 * 
 * @author Achyut Pokhrel <achyutpokhrel@lftechnology.com>
 *
 */
@Path("/ask")
public class HipchatRs {

    @Inject
    private HipchatResponseMessage responseMessage;

    @Path("/")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response ask(HipchatRequestMessage requestMessage) {
        responseMessage.setMessage(requestMessage.getItem().getMessage().getMessage());
        return Response.status(Response.Status.OK).entity(responseMessage).build();
    }

}
