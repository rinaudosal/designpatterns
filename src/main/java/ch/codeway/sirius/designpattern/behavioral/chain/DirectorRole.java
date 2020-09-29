package ch.codeway.sirius.designpattern.behavioral.chain;

import java.util.logging.Logger;

/**
 * {@link DirectorRole} can be approve only CONFERENCE
 */
public class DirectorRole extends HandlerRole {
    private static final Logger logger = Logger.getLogger(DirectorRole.class.getName());

    DirectorRole(HandlerRole successor) {
        super(successor);
    }

    @Override
    public HandlerRole handleRequest(Request request) {
        if (request.getRequestType() == RequestType.CONFERENCE) {
            logger.fine("Directors has Approved conferences");
            return this;
        } else {
            return successor.handleRequest(request);
        }
    }
}
