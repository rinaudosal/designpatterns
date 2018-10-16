package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Price;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This object keeps specific information about reinvestemt operations in dividend transactions.
 */
@ApiModel(description = "This object keeps specific information about reinvestemt operations in dividend transactions.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class TransactionReinvestmentData   {
  @JsonProperty("reinvestedAmount")
  private Double reinvestedAmount = null;

  @JsonProperty("reinvestedShares")
  private Double reinvestedShares = null;

  @JsonProperty("reinvestmentPrice")
  private Price reinvestmentPrice = null;

  @JsonProperty("reinvestmentTransactionExternalReference")
  private String reinvestmentTransactionExternalReference = null;

  @JsonProperty("reinvestmentWithheldAmount")
  private Double reinvestmentWithheldAmount = null;

  @JsonProperty("reinvestmentWithheldAmountInLocalCurrency")
  private Double reinvestmentWithheldAmountInLocalCurrency = null;

  @JsonProperty("reinvestmentWithheldPercentage")
  private Double reinvestmentWithheldPercentage = null;

  public TransactionReinvestmentData reinvestedAmount(Double reinvestedAmount) {
    this.reinvestedAmount = reinvestedAmount;
    return this;
  }

  /**
   * The amount related to the reinvestment transaction. Expressed in {Transaction.currencyCode}
   * @return reinvestedAmount
  **/
  @ApiModelProperty(value = "The amount related to the reinvestment transaction. Expressed in {Transaction.currencyCode}")


  public Double getReinvestedAmount() {
    return reinvestedAmount;
  }

  public void setReinvestedAmount(Double reinvestedAmount) {
    this.reinvestedAmount = reinvestedAmount;
  }

  public TransactionReinvestmentData reinvestedShares(Double reinvestedShares) {
    this.reinvestedShares = reinvestedShares;
    return this;
  }

  /**
   * The shares related to the reinvestment transaction.
   * @return reinvestedShares
  **/
  @ApiModelProperty(value = "The shares related to the reinvestment transaction.")


  public Double getReinvestedShares() {
    return reinvestedShares;
  }

  public void setReinvestedShares(Double reinvestedShares) {
    this.reinvestedShares = reinvestedShares;
  }

  public TransactionReinvestmentData reinvestmentPrice(Price reinvestmentPrice) {
    this.reinvestmentPrice = reinvestmentPrice;
    return this;
  }

  /**
   * Get reinvestmentPrice
   * @return reinvestmentPrice
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Price getReinvestmentPrice() {
    return reinvestmentPrice;
  }

  public void setReinvestmentPrice(Price reinvestmentPrice) {
    this.reinvestmentPrice = reinvestmentPrice;
  }

  public TransactionReinvestmentData reinvestmentTransactionExternalReference(String reinvestmentTransactionExternalReference) {
    this.reinvestmentTransactionExternalReference = reinvestmentTransactionExternalReference;
    return this;
  }

  /**
   * Defines the external referennce related to the reinvestment transaction.
   * @return reinvestmentTransactionExternalReference
  **/
  @ApiModelProperty(value = "Defines the external referennce related to the reinvestment transaction.")


  public String getReinvestmentTransactionExternalReference() {
    return reinvestmentTransactionExternalReference;
  }

  public void setReinvestmentTransactionExternalReference(String reinvestmentTransactionExternalReference) {
    this.reinvestmentTransactionExternalReference = reinvestmentTransactionExternalReference;
  }

  public TransactionReinvestmentData reinvestmentWithheldAmount(Double reinvestmentWithheldAmount) {
    this.reinvestmentWithheldAmount = reinvestmentWithheldAmount;
    return this;
  }

  /**
   * Withheld amount from the reinvestment transaction, in the {DealingInstrument} currency. Expressed in {Transaction.currencyCode}
   * @return reinvestmentWithheldAmount
  **/
  @ApiModelProperty(value = "Withheld amount from the reinvestment transaction, in the {DealingInstrument} currency. Expressed in {Transaction.currencyCode}")


  public Double getReinvestmentWithheldAmount() {
    return reinvestmentWithheldAmount;
  }

  public void setReinvestmentWithheldAmount(Double reinvestmentWithheldAmount) {
    this.reinvestmentWithheldAmount = reinvestmentWithheldAmount;
  }

  public TransactionReinvestmentData reinvestmentWithheldAmountInLocalCurrency(Double reinvestmentWithheldAmountInLocalCurrency) {
    this.reinvestmentWithheldAmountInLocalCurrency = reinvestmentWithheldAmountInLocalCurrency;
    return this;
  }

  /**
   * Withheld amount in local currency applied to the reinvestment transaction. Expressed in {Transaction.localCurrencyCode}
   * @return reinvestmentWithheldAmountInLocalCurrency
  **/
  @ApiModelProperty(value = "Withheld amount in local currency applied to the reinvestment transaction. Expressed in {Transaction.localCurrencyCode}")


  public Double getReinvestmentWithheldAmountInLocalCurrency() {
    return reinvestmentWithheldAmountInLocalCurrency;
  }

  public void setReinvestmentWithheldAmountInLocalCurrency(Double reinvestmentWithheldAmountInLocalCurrency) {
    this.reinvestmentWithheldAmountInLocalCurrency = reinvestmentWithheldAmountInLocalCurrency;
  }

  public TransactionReinvestmentData reinvestmentWithheldPercentage(Double reinvestmentWithheldPercentage) {
    this.reinvestmentWithheldPercentage = reinvestmentWithheldPercentage;
    return this;
  }

  /**
   * Withheld percentage applied to the reinvestment transaction.
   * @return reinvestmentWithheldPercentage
  **/
  @ApiModelProperty(value = "Withheld percentage applied to the reinvestment transaction.")


  public Double getReinvestmentWithheldPercentage() {
    return reinvestmentWithheldPercentage;
  }

  public void setReinvestmentWithheldPercentage(Double reinvestmentWithheldPercentage) {
    this.reinvestmentWithheldPercentage = reinvestmentWithheldPercentage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionReinvestmentData transactionReinvestmentData = (TransactionReinvestmentData) o;
    return Objects.equals(this.reinvestedAmount, transactionReinvestmentData.reinvestedAmount) &&
        Objects.equals(this.reinvestedShares, transactionReinvestmentData.reinvestedShares) &&
        Objects.equals(this.reinvestmentPrice, transactionReinvestmentData.reinvestmentPrice) &&
        Objects.equals(this.reinvestmentTransactionExternalReference, transactionReinvestmentData.reinvestmentTransactionExternalReference) &&
        Objects.equals(this.reinvestmentWithheldAmount, transactionReinvestmentData.reinvestmentWithheldAmount) &&
        Objects.equals(this.reinvestmentWithheldAmountInLocalCurrency, transactionReinvestmentData.reinvestmentWithheldAmountInLocalCurrency) &&
        Objects.equals(this.reinvestmentWithheldPercentage, transactionReinvestmentData.reinvestmentWithheldPercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reinvestedAmount, reinvestedShares, reinvestmentPrice, reinvestmentTransactionExternalReference, reinvestmentWithheldAmount, reinvestmentWithheldAmountInLocalCurrency, reinvestmentWithheldPercentage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionReinvestmentData {\n");
    
    sb.append("    reinvestedAmount: ").append(toIndentedString(reinvestedAmount)).append("\n");
    sb.append("    reinvestedShares: ").append(toIndentedString(reinvestedShares)).append("\n");
    sb.append("    reinvestmentPrice: ").append(toIndentedString(reinvestmentPrice)).append("\n");
    sb.append("    reinvestmentTransactionExternalReference: ").append(toIndentedString(reinvestmentTransactionExternalReference)).append("\n");
    sb.append("    reinvestmentWithheldAmount: ").append(toIndentedString(reinvestmentWithheldAmount)).append("\n");
    sb.append("    reinvestmentWithheldAmountInLocalCurrency: ").append(toIndentedString(reinvestmentWithheldAmountInLocalCurrency)).append("\n");
    sb.append("    reinvestmentWithheldPercentage: ").append(toIndentedString(reinvestmentWithheldPercentage)).append("\n");
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

