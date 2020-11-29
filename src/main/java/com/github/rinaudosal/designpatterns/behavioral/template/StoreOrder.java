package com.github.rinaudosal.designpatterns.behavioral.template;


import lombok.extern.slf4j.Slf4j;

import java.util.UUID;

/**
 * Implementation of {@link OrderTemplate} template
 */
@Slf4j
public class StoreOrder extends OrderTemplate {

    @Override
    public void doCheckout(String productName) {
        setProductName(productName);
    }

    @Override
    public void doPayment(Double price) {
        setPrice(price);
    }

    @Override
    public void doDelivery(String address) {
        setAddress(address);
    }

    @Override
    public void doReceipt() {
        setReceiptNumber(UUID.randomUUID().toString());
    }
}
