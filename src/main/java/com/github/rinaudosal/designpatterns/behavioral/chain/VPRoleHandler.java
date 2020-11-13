package com.github.rinaudosal.designpatterns.behavioral.chain;

import com.github.rinaudosal.designpatterns.behavioral.chain.Request.RequestType;

public class VPRoleHandler extends RoleHandler {

    @Override
    public String handleRequest(Request request) {
        if (request.getRequestType() == RequestType.PURCHASE) {
            if (request.getAmount() <= 1500) {
                return String.format("VPs has Approved the request %s with amount %s", request.getRequestType(), request.getAmount());
            } else {
                return successor.handleRequest(request);
            }
        }

        throw new UnsupportedOperationException("Request cannot be processed");

    }
}
