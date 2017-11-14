package edu.matc.incarcerationanalyzer.entity;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class HandlerNumberFormatException implements ExceptionMapper<NumberFormatException> {

    @Override
    public Response toResponse(NumberFormatException e) {
        MessageForException messageForException = new MessageForException();
        messageForException.setCode(500);
        messageForException.setMessage("that input format is not acceptable");
        messageForException.setInfo(e.getClass().getName());
        return Response.status(500).entity(messageForException).build();
    }
}
