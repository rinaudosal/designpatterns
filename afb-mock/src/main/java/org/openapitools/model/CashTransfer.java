package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CashDateData;
import org.openapitools.model.FinancialInstitution;
import org.openapitools.model.SenderToReceiverInformationData;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CashTransfer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class CashTransfer   {
  @JsonProperty("amount")
  private Double amount = null;

  @JsonProperty("beneficiaryInstitution")
  private FinancialInstitution beneficiaryInstitution = null;

  @JsonProperty("cashAccountAliasName")
  private String cashAccountAliasName = null;

  @JsonProperty("cashDateData")
  private CashDateData cashDateData = null;

  @JsonProperty("cashTransferSource")
  private String cashTransferSource = null;

  @JsonProperty("chargeAccountIban")
  private String chargeAccountIban = null;

  @JsonProperty("currencyCode")
  private String currencyCode = null;

  @JsonProperty("externalReference")
  private String externalReference = null;

  @JsonProperty("failureCode")
  private String failureCode = null;

  @JsonProperty("orderedBy")
  private String orderedBy = null;

  @JsonProperty("senderToReceiverInformation")
  private SenderToReceiverInformationData senderToReceiverInformation = null;

  @JsonProperty("statusCode")
  private String statusCode = null;

  public CashTransfer amount(Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The {CashTransfer} amount expressed in {CashTransfer.currencyCode}
   * @return amount
  **/
  @ApiModelProperty(value = "The {CashTransfer} amount expressed in {CashTransfer.currencyCode}")


  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public CashTransfer beneficiaryInstitution(FinancialInstitution beneficiaryInstitution) {
    this.beneficiaryInstitution = beneficiaryInstitution;
    return this;
  }

  /**
   * Get beneficiaryInstitution
   * @return beneficiaryInstitution
  **/
  @ApiModelProperty(value = "")

  @Valid

  public FinancialInstitution getBeneficiaryInstitution() {
    return beneficiaryInstitution;
  }

  public void setBeneficiaryInstitution(FinancialInstitution beneficiaryInstitution) {
    this.beneficiaryInstitution = beneficiaryInstitution;
  }

  public CashTransfer cashAccountAliasName(String cashAccountAliasName) {
    this.cashAccountAliasName = cashAccountAliasName;
    return this;
  }

  /**
   * The name of the {CashAccountAlias} used in the {CashTransfer}.
   * @return cashAccountAliasName
  **/
  @ApiModelProperty(value = "The name of the {CashAccountAlias} used in the {CashTransfer}.")


  public String getCashAccountAliasName() {
    return cashAccountAliasName;
  }

  public void setCashAccountAliasName(String cashAccountAliasName) {
    this.cashAccountAliasName = cashAccountAliasName;
  }

  public CashTransfer cashDateData(CashDateData cashDateData) {
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

  public CashTransfer cashTransferSource(String cashTransferSource) {
    this.cashTransferSource = cashTransferSource;
    return this;
  }

  /**
   * The source used to ordered the {CashTransfers}. Refers to {listCashTransferSources}
   * @return cashTransferSource
  **/
  @ApiModelProperty(value = "The source used to ordered the {CashTransfers}. Refers to {listCashTransferSources}")


  public String getCashTransferSource() {
    return cashTransferSource;
  }

  public void setCashTransferSource(String cashTransferSource) {
    this.cashTransferSource = cashTransferSource;
  }

  public CashTransfer chargeAccountIban(String chargeAccountIban) {
    this.chargeAccountIban = chargeAccountIban;
    return this;
  }

  /**
   * The iban associated to the charge {CashAccount}
   * @return chargeAccountIban
  **/
  @ApiModelProperty(value = "The iban associated to the charge {CashAccount}")


  public String getChargeAccountIban() {
    return chargeAccountIban;
  }

  public void setChargeAccountIban(String chargeAccountIban) {
    this.chargeAccountIban = chargeAccountIban;
  }

  public CashTransfer currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * The currency associated to the {CashTransfer}. Refers to {listCurrencies}
   * @return currencyCode
  **/
  @ApiModelProperty(value = "The currency associated to the {CashTransfer}. Refers to {listCurrencies}")


  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public CashTransfer externalReference(String externalReference) {
    this.externalReference = externalReference;
    return this;
  }

  /**
   * The external reference of the {CashTransfer}
   * @return externalReference
  **/
  @ApiModelProperty(value = "The external reference of the {CashTransfer}")


  public String getExternalReference() {
    return externalReference;
  }

  public void setExternalReference(String externalReference) {
    this.externalReference = externalReference;
  }

  public CashTransfer failureCode(String failureCode) {
    this.failureCode = failureCode;
    return this;
  }

  /**
   * Failure code. Only informed if {CashTransfer.statusCode} is ERROR
   * @return failureCode
  **/
  @ApiModelProperty(value = "Failure code. Only informed if {CashTransfer.statusCode} is ERROR")


  public String getFailureCode() {
    return failureCode;
  }

  public void setFailureCode(String failureCode) {
    this.failureCode = failureCode;
  }

  public CashTransfer orderedBy(String orderedBy) {
    this.orderedBy = orderedBy;
    return this;
  }

  /**
   * The name of the user who ordered the {CashTransfer}
   * @return orderedBy
  **/
  @ApiModelProperty(value = "The name of the user who ordered the {CashTransfer}")


  public String getOrderedBy() {
    return orderedBy;
  }

  public void setOrderedBy(String orderedBy) {
    this.orderedBy = orderedBy;
  }

  public CashTransfer senderToReceiverInformation(SenderToReceiverInformationData senderToReceiverInformation) {
    this.senderToReceiverInformation = senderToReceiverInformation;
    return this;
  }

  /**
   * Get senderToReceiverInformation
   * @return senderToReceiverInformation
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SenderToReceiverInformationData getSenderToReceiverInformation() {
    return senderToReceiverInformation;
  }

  public void setSenderToReceiverInformation(SenderToReceiverInformationData senderToReceiverInformation) {
    this.senderToReceiverInformation = senderToReceiverInformation;
  }

  public CashTransfer statusCode(String statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  /**
   * The current status of the {CashTransfer}. Refers to {listCashTransferStatutes}
   * @return statusCode
  **/
  @ApiModelProperty(value = "The current status of the {CashTransfer}. Refers to {listCashTransferStatutes}")


  public String getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CashTransfer cashTransfer = (CashTransfer) o;
    return Objects.equals(this.amount, cashTransfer.amount) &&
        Objects.equals(this.beneficiaryInstitution, cashTransfer.beneficiaryInstitution) &&
        Objects.equals(this.cashAccountAliasName, cashTransfer.cashAccountAliasName) &&
        Objects.equals(this.cashDateData, cashTransfer.cashDateData) &&
        Objects.equals(this.cashTransferSource, cashTransfer.cashTransferSource) &&
        Objects.equals(this.chargeAccountIban, cashTransfer.chargeAccountIban) &&
        Objects.equals(this.currencyCode, cashTransfer.currencyCode) &&
        Objects.equals(this.externalReference, cashTransfer.externalReference) &&
        Objects.equals(this.failureCode, cashTransfer.failureCode) &&
        Objects.equals(this.orderedBy, cashTransfer.orderedBy) &&
        Objects.equals(this.senderToReceiverInformation, cashTransfer.senderToReceiverInformation) &&
        Objects.equals(this.statusCode, cashTransfer.statusCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, beneficiaryInstitution, cashAccountAliasName, cashDateData, cashTransferSource, chargeAccountIban, currencyCode, externalReference, failureCode, orderedBy, senderToReceiverInformation, statusCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashTransfer {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    beneficiaryInstitution: ").append(toIndentedString(beneficiaryInstitution)).append("\n");
    sb.append("    cashAccountAliasName: ").append(toIndentedString(cashAccountAliasName)).append("\n");
    sb.append("    cashDateData: ").append(toIndentedString(cashDateData)).append("\n");
    sb.append("    cashTransferSource: ").append(toIndentedString(cashTransferSource)).append("\n");
    sb.append("    chargeAccountIban: ").append(toIndentedString(chargeAccountIban)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    externalReference: ").append(toIndentedString(externalReference)).append("\n");
    sb.append("    failureCode: ").append(toIndentedString(failureCode)).append("\n");
    sb.append("    orderedBy: ").append(toIndentedString(orderedBy)).append("\n");
    sb.append("    senderToReceiverInformation: ").append(toIndentedString(senderToReceiverInformation)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
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

