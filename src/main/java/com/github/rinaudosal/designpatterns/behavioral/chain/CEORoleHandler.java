package com.github.rinaudosal.designpatterns.behavioral.chain;

/**
 * CEO Role can be approve all request
 */
public class CEORoleHandler extends RoleHandler {

    @Override
    public String handleRequest(Request request) {
        return String.format("CEO has Approved the request %s with amount %s", request.getRequestType(), request.getAmount());
    }
}
