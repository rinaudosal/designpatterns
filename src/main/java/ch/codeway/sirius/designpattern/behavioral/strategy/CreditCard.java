package ch.codeway.sirius.designpattern.behavioral.strategy;

/**
 * Domain class that have {@link ValidationStrategy} example for validity of credit card
 */
public class CreditCard {

    private String number;
    private String date;
    private String cvv;

    /**
     * Strategy managed from the client, domain class don't know which strategy are applied
     */
    private ValidationStrategy strategy;


    /**
     * in constractor class Validation are required, because otherwire maybe have {@link NullPointerException}
     *
     * @param strategy the concrete strategy
     */
    public CreditCard(ValidationStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Boolean method that use strategy to check validity
     *
     * @return true if valid, false otherwise
     */
    public boolean isValid() {
        return strategy.isValid(this);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
}
