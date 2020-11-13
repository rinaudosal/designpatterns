package com.github.rinaudosal.designpatterns.behavioral.chain;

import java.util.logging.Logger;

public class VPRole extends HandlerRole {
    private static final Logger logger = Logger.getLogger(CEORole.class.getName());

    VPRole(HandlerRole successor) {
        super(successor);
    }

    @Override
    public HandlerRole handleRequest(Request request) {
        if (request.getRequestType() == RequestType.PURCHASE) {
            if (request.getAmount() < 1500) {
                logger.fine("VPs has approved purchases because are below 1500");
                return this;
            } else {
                return successor.handleRequest(request);
            }
        }

        throw new UnsupportedOperationException("Request cannot be processed");

    }
}
