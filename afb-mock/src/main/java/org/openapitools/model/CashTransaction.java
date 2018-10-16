package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AdditionalReferences;
import org.openapitools.model.CashDateData;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CashTransaction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class CashTransaction   {
  @JsonProperty("accountBalance")
  private Double accountBalance = null;

  @JsonProperty("additionalReferences")
  private AdditionalReferences additionalReferences = null;

  @JsonProperty("amount")
  private Double amount = null;

  @JsonProperty("cashAccountId")
  private String cashAccountId = null;

  @JsonProperty("cashClientId")
  private String cashClientId = null;

  @JsonProperty("cashDateData")
  private CashDateData cashDateData = null;

  @JsonProperty("cashTransactionTypeCode")
  private String cashTransactionTypeCode = null;

  @JsonProperty("currencyCode")
  private String currencyCode = null;

  @JsonProperty("externalReference")
  private String externalReference = null;

  @JsonProperty("id")
  private String id = null;

  public CashTransaction accountBalance(Double accountBalance) {
    this.accountBalance = accountBalance;
    return this;
  }

  /**
   * The balance of the {CashAccount} after the {CashTransaction},  expressed in {CashTransaction.currencyCode}
   * @return accountBalance
  **/
  @ApiModelProperty(value = "The balance of the {CashAccount} after the {CashTransaction},  expressed in {CashTransaction.currencyCode}")


  public Double getAccountBalance() {
    return accountBalance;
  }

  public void setAccountBalance(Double accountBalance) {
    this.accountBalance = accountBalance;
  }

  public CashTransaction additionalReferences(AdditionalReferences additionalReferences) {
    this.additionalReferences = additionalReferences;
    return this;
  }

  /**
   * Get additionalReferences
   * @return additionalReferences
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AdditionalReferences getAdditionalReferences() {
    return additionalReferences;
  }

  public void setAdditionalReferences(AdditionalReferences additionalReferences) {
    this.additionalReferences = additionalReferences;
  }

  public CashTransaction amount(Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Transaction amount expressed in {CashTransaction.currencyCode}
   * @return amount
  **/
  @ApiModelProperty(value = "Transaction amount expressed in {CashTransaction.currencyCode}")


  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public CashTransaction cashAccountId(String cashAccountId) {
    this.cashAccountId = cashAccountId;
    return this;
  }

  /**
   * The Id of the {CashAccount}
   * @return cashAccountId
  **/
  @ApiModelProperty(value = "The Id of the {CashAccount}")


  public String getCashAccountId() {
    return cashAccountId;
  }

  public void setCashAccountId(String cashAccountId) {
    this.cashAccountId = cashAccountId;
  }

  public CashTransaction cashClientId(String cashClientId) {
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

  public CashTransaction cashDateData(CashDateData cashDateData) {
    this.cashDateData = cashDateData;
    return this;
  }

  /**
   * Get cashDateData
   * @return cashDateData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CashDateData getCashDateData() {
    return cashDateData;
  }

  public void setCashDateData(CashDateData cashDateData) {
    this.cashDateData = cashDateData;
  }

  public CashTransaction cashTransactionTypeCode(String cashTransactionTypeCode) {
    this.cashTransactionTypeCode = cashTransactionTypeCode;
    return this;
  }

  /**
   * The type of the {CashTransaction}. Refers to {listCashTransactionTypes}
   * @return cashTransactionTypeCode
  **/
  @ApiModelProperty(value = "The type of the {CashTransaction}. Refers to {listCashTransactionTypes}")


  public String getCashTransactionTypeCode() {
    return cashTransactionTypeCode;
  }

  public void setCashTransactionTypeCode(String cashTransactionTypeCode) {
    this.cashTransactionTypeCode = cashTransactionTypeCode;
  }

  public CashTransaction currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * The currency associated to the {CashTransaction}. Refers to {listCurrencies}
   * @return currencyCode
  **/
  @ApiModelProperty(value = "The currency associated to the {CashTransaction}. Refers to {listCurrencies}")


  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public CashTransaction externalReference(String externalReference) {
    this.externalReference = externalReference;
    return this;
  }

  /**
   * The external Reference associated to the {CashTransaction}
   * @return externalReference
  **/
  @ApiModelProperty(value = "The external Reference associated to the {CashTransaction}")


  public String getExternalReference() {
    return externalReference;
  }

  public void setExternalReference(String externalReference) {
    this.externalReference = externalReference;
  }

  public CashTransaction id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the {CashTransaction}
   * @return id
  **/
  @ApiModelProperty(value = "The id of the {CashTransaction}")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CashTransaction cashTransaction = (CashTransaction) o;
    return Objects.equals(this.accountBalance, cashTransaction.accountBalance) &&
        Objects.equals(this.additionalReferences, cashTransaction.additionalReferences) &&
        Objects.equals(this.amount, cashTransaction.amount) &&
        Objects.equals(this.cashAccountId, cashTransaction.cashAccountId) &&
        Objects.equals(this.cashClientId, cashTransaction.cashClientId) &&
        Objects.equals(this.cashDateData, cashTransaction.cashDateData) &&
        Objects.equals(this.cashTransactionTypeCode, cashTransaction.cashTransactionTypeCode) &&
        Objects.equals(this.currencyCode, cashTransaction.currencyCode) &&
        Objects.equals(this.externalReference, cashTransaction.externalReference) &&
        Objects.equals(this.id, cashTransaction.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountBalance, additionalReferences, amount, cashAccountId, cashClientId, cashDateData, cashTransactionTypeCode, currencyCode, externalReference, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashTransaction {\n");
    
    sb.append("    accountBalance: ").append(toIndentedString(accountBalance)).append("\n");
    sb.append("    additionalReferences: ").append(toIndentedString(additionalReferences)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    cashAccountId: ").append(toIndentedString(cashAccountId)).append("\n");
    sb.append("    cashClientId: ").append(toIndentedString(cashClientId)).append("\n");
    sb.append("    cashDateData: ").append(toIndentedString(cashDateData)).append("\n");
    sb.append("    cashTransactionTypeCode: ").append(toIndentedString(cashTransactionTypeCode)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    externalReference: ").append(toIndentedString(externalReference)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

