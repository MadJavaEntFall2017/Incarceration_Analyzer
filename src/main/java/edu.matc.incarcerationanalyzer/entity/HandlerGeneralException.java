package edu.matc.incarcerationanalyzer.entity;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class HandlerGeneralException implements ExceptionMapper<Throwable> {

    @Override
    public Response toResponse(Throwable e) {
        MessageForException messageForException = new MessageForException();
        messageForException.setCode(500);
        messageForException.setMessage("Something went wrong");
        messageForException.setInfo(e.getClass().getName());
        return Response.status(500).entity(messageForException).build();
    }
}
