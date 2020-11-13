package com.github.rinaudosal.designpatterns.behavioral.template;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Implementation of {@link OrderTemplate} template
 */
public class StoreOrder extends OrderTemplate {
    private static final Logger log = LoggerFactory.getLogger(StoreOrder.class);

    @Override
    public void doCheckout() {
        log.info("Ring up items from cart.");
    }

    @Override
    public void doPayment() {
        log.info("Process payment with Card present");
    }

    @Override
    public void doDelivery() {
        log.info("Bag items at counter");
    }

    @Override
    public void doReceipt() {
        log.info("Print receipt");
    }
}
