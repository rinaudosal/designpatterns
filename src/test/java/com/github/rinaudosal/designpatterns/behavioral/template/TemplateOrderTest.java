package com.github.rinaudosal.designpatterns.behavioral.template;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TemplateOrderTest {
    private OrderTemplate target;

    @Test
    void giftWrappedCorrectlyForStoreOrder(){
        target = new StoreOrder();

        target.processOrder("lavatrice", Double.valueOf("123.00"), "mail@mail.com", true);

        assertThat(target.getAddress()).isEqualTo("mail@mail.com");
        assertThat(target.getPrice()).isEqualTo(Double.valueOf("123.00"));
        assertThat(target.getProductName()).isEqualTo("lavatrice");
        assertThat(target.getReceiptNumber()).isNull();
        assertThat(target.isGift()).isTrue();
    }

    @Test
    void giftWrappedCorrectlyForWebOrder(){
        target = new WebOrder();

        target.processOrder("lavatrice", Double.valueOf("123.00"), "mail@mail.com", true);

        assertThat(target.getAddress()).isEqualTo("mail@mail.com");
        assertThat(target.getPrice()).isEqualTo(Double.valueOf("123.00"));
        assertThat(target.getProductName()).isEqualTo("lavatrice");
        assertThat(target.getReceiptNumber()).isNull();
        assertThat(target.isGift()).isTrue();
    }

    @Test
    void orderSentCorrectlyForWebOrder(){
        target = new WebOrder();

        target.processOrder("lavatrice", Double.valueOf("123.00"), "mail@mail.com", false);

        assertThat(target.getAddress()).isEqualTo("mail@mail.com");
        assertThat(target.getPrice()).isEqualTo(Double.valueOf("123.00"));
        assertThat(target.getProductName()).isEqualTo("lavatrice");
        assertThat(target.getReceiptNumber()).isNotEmpty();
        assertThat(target.isGift()).isFalse();
    }

    @Test
    void orderSentCorrectlyForStoreOrder(){
        target = new StoreOrder();

        target.processOrder("lavatrice", Double.valueOf("123.00"), "mail@mail.com", false);

        assertThat(target.getAddress()).isEqualTo("mail@mail.com");
        assertThat(target.getPrice()).isEqualTo(Double.valueOf("123.00"));
        assertThat(target.getProductName()).isEqualTo("lavatrice");
        assertThat(target.getReceiptNumber()).isNotEmpty();
        assertThat(target.isGift()).isFalse();
    }
}
