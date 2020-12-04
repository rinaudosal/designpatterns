package com.github.rinaudosal.designpatterns.creational.abstractfactory;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CreditCardFactoryTest {

    @Test
    void richPeopleHaveAmexCreditCard() {
        assertThat(CreditCardFactory.getCreditCardFactory(700)).isInstanceOf(AmexFactory.class);
    }

    @Test
    void poorPeopleHaveAmexCreditCard() {
        assertThat(CreditCardFactory.getCreditCardFactory(10)).isInstanceOf(VisaFactory.class);
    }

    @Test
    void iReceiveAmexGoldCardCorrectly() {
        CreditCardFactory creditCardFactory = CreditCardFactory.getCreditCardFactory(1000);
        CreditCard creditCard = creditCardFactory.getCreditCard(CardType.GOLD);

        assertThat(creditCard).isInstanceOf(AmexCard.class);
        assertThat(creditCard.number()).startsWith("54");
        assertThat(creditCard.type()).isEqualTo(CardType.GOLD);
        assertThat(creditCard.cvv()).hasSize(3);
    }

    @Test
    void iReceiveVisaPlatinumCardCorrectly() {
        CreditCardFactory creditCardFactory = CreditCardFactory.getCreditCardFactory(10);
        CreditCard creditCard = creditCardFactory.getCreditCard(CardType.PLATINUM);

        assertThat(creditCard).isInstanceOf(VisaCard.class);
        assertThat(creditCard.number()).startsWith("45");
        assertThat(creditCard.type()).isEqualTo(CardType.PLATINUM);
        assertThat(creditCard.cvv()).hasSize(3);
    }
}
