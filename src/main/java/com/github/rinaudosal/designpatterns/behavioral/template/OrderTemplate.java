package com.github.rinaudosal.designpatterns.behavioral.template;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Template class to contain Algorithm for process the orders
 */
public abstract class OrderTemplate {
    private static final Logger log = LoggerFactory.getLogger(OrderTemplate.class);

    private boolean isGift;

    public abstract void doCheckout();

    public abstract void doPayment();

    public abstract void doReceipt();

    public abstract void doDelivery();

    public final void wrapGift() {
        log.info("Gift wrapped.");
    }

    /**
     * Algorithm for process orders. Template are immutable, but the methods called are abstract
     */
    public final void processOrder() {
        doCheckout();
        doPayment();
        if (isGift) {
            wrapGift();
        } else {
            doReceipt();
        }

        doDelivery();
    }

    public boolean isGift() {
        return isGift;
    }

    public void setGift(boolean gift) {
        isGift = gift;
    }
}
