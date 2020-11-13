package com.github.rinaudosal.designpatterns.behavioral.strategy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CreditCardStrategyTest {


    @Test
    public void americanExpressValid() {
        CreditCard amexCard = new CreditCard(new AmexStrategy());

        amexCard.setNumber("379185883464283"); //valid amex
        amexCard.setDate("04/2020");
        amexCard.setCvv("123");

        Assertions.assertThat(amexCard.isValid()).isTrue();
    }

    @Test
    public void americanExpressInvalid() {
        CreditCard amexCard = new CreditCard(new AmexStrategy());

        amexCard.setNumber("379185883464282"); //invalid amex
        amexCard.setDate("04/2017");
        amexCard.setCvv("234");

        Assertions.assertThat(amexCard.isValid()).isFalse();
    }

    @Test
    public void visaValid() {
        CreditCard visaCard = new CreditCard(new VisaStrategy());

        visaCard.setNumber("4539589763663402");
        visaCard.setDate("05/2018");
        visaCard.setCvv("324");

        Assertions.assertThat(visaCard.isValid()).isTrue();
    }

    @Test
    public void visaInvalid() {
        CreditCard visaCard = new CreditCard(new VisaStrategy());

        visaCard.setNumber("453958976366340299");
        visaCard.setDate("05/2018");
        visaCard.setCvv("324");

        Assertions.assertThat(visaCard.isValid()).isFalse();
    }
}
