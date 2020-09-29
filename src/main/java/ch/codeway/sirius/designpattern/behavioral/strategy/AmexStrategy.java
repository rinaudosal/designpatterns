package ch.codeway.sirius.designpattern.behavioral.strategy;

/**
 * Validation of AmericanExpress credit card
 */
public class AmexStrategy extends ValidationStrategy {

    @Override
    public boolean isValid(CreditCard creditCard) {
        boolean isValid = creditCard.getNumber().startsWith("37") ||
            creditCard.getNumber().startsWith("34");

        if (isValid) {
            isValid = creditCard.getNumber().length() == 15;
        }

        if (isValid) {
            isValid = passesLuhn(creditCard.getNumber());
        }

        return isValid;
    }

}
