package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CashTransactionInterestDateData;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CashTransactionInterest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class CashTransactionInterest   {
  @JsonProperty("accountBalance")
  private Double accountBalance = null;

  @JsonProperty("amount")
  private Double amount = null;

  @JsonProperty("cashAccountId")
  private String cashAccountId = null;

  @JsonProperty("cashClientId")
  private String cashClientId = null;

  @JsonProperty("cashTransactionId")
  private String cashTransactionId = null;

  @JsonProperty("cashTransactionInterestDateData")
  private CashTransactionInterestDateData cashTransactionInterestDateData = null;

  @JsonProperty("iban")
  private String iban = null;

  @JsonProperty("interestTypeCode")
  private String interestTypeCode = null;

  @JsonProperty("numberOfDays")
  private Long numberOfDays = null;

  @JsonProperty("ratePercentage")
  private Double ratePercentage = null;

  public CashTransactionInterest accountBalance(Double accountBalance) {
    this.accountBalance = accountBalance;
    return this;
  }

  /**
   * The balance of the {CashAccount} after the {CashTransaction}
   * @return accountBalance
  **/
  @ApiModelProperty(value = "The balance of the {CashAccount} after the {CashTransaction}")


  public Double getAccountBalance() {
    return accountBalance;
  }

  public void setAccountBalance(Double accountBalance) {
    this.accountBalance = accountBalance;
  }

  public CashTransactionInterest amount(Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Amount the {CashTransaction}'s interest
   * @return amount
  **/
  @ApiModelProperty(value = "Amount the {CashTransaction}'s interest")


  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public CashTransactionInterest cashAccountId(String cashAccountId) {
    this.cashAccountId = cashAccountId;
    return this;
  }

  /**
   * The Id of the associated {CashAccount}
   * @return cashAccountId
  **/
  @ApiModelProperty(value = "The Id of the associated {CashAccount}")


  public String getCashAccountId() {
    return cashAccountId;
  }

  public void setCashAccountId(String cashAccountId) {
    this.cashAccountId = cashAccountId;
  }

  public CashTransactionInterest cashClientId(String cashClientId) {
    this.cashClientId = cashClientId;
    return this;
  }

  /**
   * The Id of the associated {CashClient}
   * @return cashClientId
  **/
  @ApiModelProperty(value = "The Id of the associated {CashClient}")


  public String getCashClientId() {
    return cashClientId;
  }

  public void setCashClientId(String cashClientId) {
    this.cashClientId = cashClientId;
  }

  public CashTransactionInterest cashTransactionId(String cashTransactionId) {
    this.cashTransactionId = cashTransactionId;
    return this;
  }

  /**
   * The Id of the associated {CashTransaction}
   * @return cashTransactionId
  **/
  @ApiModelProperty(value = "The Id of the associated {CashTransaction}")


  public String getCashTransactionId() {
    return cashTransactionId;
  }

  public void setCashTransactionId(String cashTransactionId) {
    this.cashTransactionId = cashTransactionId;
  }

  public CashTransactionInterest cashTransactionInterestDateData(CashTransactionInterestDateData cashTransactionInterestDateData) {
    this.cashTransactionInterestDateData = cashTransactionInterestDateData;
    return this;
  }

  /**
   * Get cashTransactionInterestDateData
   * @return cashTransactionInterestDateData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CashTransactionInterestDateData getCashTransactionInterestDateData() {
    return cashTransactionInterestDateData;
  }

  public void setCashTransactionInterestDateData(CashTransactionInterestDateData cashTransactionInterestDateData) {
    this.cashTransactionInterestDateData = cashTransactionInterestDateData;
  }

  public CashTransactionInterest iban(String iban) {
    this.iban = iban;
    return this;
  }

  /**
   * The 'International Bank Account Number' associated {CashTransaction}
   * @return iban
  **/
  @ApiModelProperty(value = "The 'International Bank Account Number' associated {CashTransaction}")


  public String getIban() {
    return iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }

  public CashTransactionInterest interestTypeCode(String interestTypeCode) {
    this.interestTypeCode = interestTypeCode;
    return this;
  }

  /**
   * The type insterest. Refers to {listCashInterestTypes}
   * @return interestTypeCode
  **/
  @ApiModelProperty(value = "The type insterest. Refers to {listCashInterestTypes}")


  public String getInterestTypeCode() {
    return interestTypeCode;
  }

  public void setInterestTypeCode(String interestTypeCode) {
    this.interestTypeCode = interestTypeCode;
  }

  public CashTransactionInterest numberOfDays(Long numberOfDays) {
    this.numberOfDays = numberOfDays;
    return this;
  }

  /**
   * Number of Days applied to the {CashTransactionInterest}
   * @return numberOfDays
  **/
  @ApiModelProperty(value = "Number of Days applied to the {CashTransactionInterest}")


  public Long getNumberOfDays() {
    return numberOfDays;
  }

  public void setNumberOfDays(Long numberOfDays) {
    this.numberOfDays = numberOfDays;
  }

  public CashTransactionInterest ratePercentage(Double ratePercentage) {
    this.ratePercentage = ratePercentage;
    return this;
  }

  /**
   * Defines the percentage of the transaction detail for interest
   * @return ratePercentage
  **/
  @ApiModelProperty(value = "Defines the percentage of the transaction detail for interest")


  public Double getRatePercentage() {
    return ratePercentage;
  }

  public void setRatePercentage(Double ratePercentage) {
    this.ratePercentage = ratePercentage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CashTransactionInterest cashTransactionInterest = (CashTransactionInterest) o;
    return Objects.equals(this.accountBalance, cashTransactionInterest.accountBalance) &&
        Objects.equals(this.amount, cashTransactionInterest.amount) &&
        Objects.equals(this.cashAccountId, cashTransactionInterest.cashAccountId) &&
        Objects.equals(this.cashClientId, cashTransactionInterest.cashClientId) &&
        Objects.equals(this.cashTransactionId, cashTransactionInterest.cashTransactionId) &&
        Objects.equals(this.cashTransactionInterestDateData, cashTransactionInterest.cashTransactionInterestDateData) &&
        Objects.equals(this.iban, cashTransactionInterest.iban) &&
        Objects.equals(this.interestTypeCode, cashTransactionInterest.interestTypeCode) &&
        Objects.equals(this.numberOfDays, cashTransactionInterest.numberOfDays) &&
        Objects.equals(this.ratePercentage, cashTransactionInterest.ratePercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountBalance, amount, cashAccountId, cashClientId, cashTransactionId, cashTransactionInterestDateData, iban, interestTypeCode, numberOfDays, ratePercentage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashTransactionInterest {\n");
    
    sb.append("    accountBalance: ").append(toIndentedString(accountBalance)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    cashAccountId: ").append(toIndentedString(cashAccountId)).append("\n");
    sb.append("    cashClientId: ").append(toIndentedString(cashClientId)).append("\n");
    sb.append("    cashTransactionId: ").append(toIndentedString(cashTransactionId)).append("\n");
    sb.append("    cashTransactionInterestDateData: ").append(toIndentedString(cashTransactionInterestDateData)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    interestTypeCode: ").append(toIndentedString(interestTypeCode)).append("\n");
    sb.append("    numberOfDays: ").append(toIndentedString(numberOfDays)).append("\n");
    sb.append("    ratePercentage: ").append(toIndentedString(ratePercentage)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

