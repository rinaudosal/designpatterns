package ch.codeway.sirius.designpattern.behavioral.template;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Implementation of {@link OrderTemplate} template
 */
public class WebOrder extends OrderTemplate {
    private static final Logger log = LoggerFactory.getLogger(StoreOrder.class);

    @Override
    public void doCheckout() {
        log.info("Get items from cart,");
        log.info("Set gift preferences,");
        log.info("Set delivery address,");
        log.info("Set billing address.");
    }

    @Override
    public void doPayment() {
        log.info("Process payment without Card present");
    }

    @Override
    public void doDelivery() {
        log.info("Ship the item to address");
    }

    @Override
    public void doReceipt() {
        log.info("Email receipt");
    }

}
