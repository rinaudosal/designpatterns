package com.github.rinaudosal.designpatterns.behavioral.chain;

import com.github.rinaudosal.designpatterns.behavioral.chain.Request.RequestType;

import java.util.logging.Logger;

/**
 * {@link DirectorRoleHandler} can be approve only CONFERENCE
 */
public class DirectorRoleHandler extends RoleHandler {

    @Override
    public String handleRequest(Request request) {
        if (request.getRequestType() == RequestType.CONFERENCE) {
            return String.format("Director has Approved the request %s with amount %s", request.getRequestType(), request.getAmount());
        } else {
            return successor.handleRequest(request);
        }
    }
}
