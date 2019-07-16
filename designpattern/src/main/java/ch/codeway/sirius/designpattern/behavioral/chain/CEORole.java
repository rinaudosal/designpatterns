package ch.codeway.sirius.designpattern.behavioral.chain;

import java.util.logging.Logger;

/**
 * CEO Role can be approve all request
 */
public class CEORole extends HandlerRole {
    private static final Logger logger = Logger.getLogger(CEORole.class.getName());

    CEORole(HandlerRole successor) {
        super(successor);
    }

    @Override
    public HandlerRole handleRequest(Request request) {
        logger.fine("CEOs has approved anything they want");
        return this;
    }
}
