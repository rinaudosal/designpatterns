package com.github.rinaudosal.designpatterns.behavioral.template;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * Template class to contain Algorithm for process the orders
 */
@Slf4j
@Getter
@Setter
public abstract class OrderTemplate {

    private String productName;
    private Double price;
    private String receiptNumber;
    private String address;
    private boolean isGift;

    public abstract void doCheckout(String productName);

    public abstract void doPayment(Double price);

    public abstract void doReceipt();

    public abstract void doDelivery(String address);

    public final void wrapGift() {
        this.isGift = true;
    }

    /**
     * Algorithm for process orders. Template are immutable, but the methods called are abstract
     */
    public final void processOrder(String productName, Double price, String address, boolean isGift) {
        doCheckout(productName);
        doPayment(price);
        if (isGift) {
            wrapGift();
        } else {
            doReceipt();
        }

        doDelivery(address);
    }

}
