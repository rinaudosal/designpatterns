package com.github.rinaudosal.designpatterns.behavioral.strategy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CreditCardStrategyTest {

    @Test
    public void americanExpress37Valid() {
        CreditCard amexCard = new CreditCard(new AmexStrategy());

        amexCard.setNumber("379185883464283"); //valid amex
        amexCard.setDate("04/2020");
        amexCard.setCvv("123");

        assertThat(amexCard.isValid()).isTrue();
        assertThat(amexCard.getNumber()).isEqualTo("379185883464283");
        assertThat(amexCard.getDate()).isEqualTo("04/2020");
        assertThat(amexCard.getCvv()).isEqualTo("123");
    }
    @Test
    public void americanExpress34InValid() {
        CreditCard amexCard = new CreditCard(new AmexStrategy());

        amexCard.setNumber("349185883464283"); //invalid amex
        amexCard.setDate("04/2020");
        amexCard.setCvv("123");

        assertThat(amexCard.isValid()).isFalse();
        assertThat(amexCard.getNumber()).isEqualTo("349185883464283");
        assertThat(amexCard.getDate()).isEqualTo("04/2020");
        assertThat(amexCard.getCvv()).isEqualTo("123");
    }

    @Test
    public void americanExpressInvalid() {
        CreditCard amexCard = new CreditCard(new AmexStrategy());

        amexCard.setNumber("379185883464282"); //invalid amex
        amexCard.setDate("04/2017");
        amexCard.setCvv("234");

        assertThat(amexCard.isValid()).isFalse();
        assertThat(amexCard.getNumber()).isEqualTo("379185883464282");
        assertThat(amexCard.getDate()).isEqualTo("04/2017");
        assertThat(amexCard.getCvv()).isEqualTo("234");

    }

    @Test
    public void visaValid() {
        CreditCard visaCard = new CreditCard(new VisaStrategy());

        visaCard.setNumber("4539589763663402");
        visaCard.setDate("05/2018");
        visaCard.setCvv("324");

        assertThat(visaCard.isValid()).isTrue();
        assertThat(visaCard.getNumber()).isEqualTo("4539589763663402");
        assertThat(visaCard.getDate()).isEqualTo("05/2018");
        assertThat(visaCard.getCvv()).isEqualTo("324");
    }

    @Test
    public void visaInvalid() {
        CreditCard visaCard = new CreditCard(new VisaStrategy());

        visaCard.setNumber("453958976366340299");
        visaCard.setDate("05/2018");
        visaCard.setCvv("324");

        assertThat(visaCard.isValid()).isFalse();
        assertThat(visaCard.getNumber()).isEqualTo("453958976366340299");
        assertThat(visaCard.getDate()).isEqualTo("05/2018");
        assertThat(visaCard.getCvv()).isEqualTo("324");
    }
}
