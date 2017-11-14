package edu.matc.incarcerationanalyzer.entity;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class HandlerNullPointerException implements ExceptionMapper<NullPointerException> {


    @Override
    public Response toResponse(NullPointerException e) {
        MessageForException messageForException = new MessageForException();
        messageForException.setCode(500);
        messageForException.setMessage("Id doesnt exist in database");
        messageForException.setInfo(e.getClass().getName());
        return Response.status(500).entity(messageForException).build();
    }
}
