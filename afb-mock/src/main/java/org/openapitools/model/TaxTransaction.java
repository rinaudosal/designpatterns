package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.model.AssociatedTransactionData;
import org.openapitools.model.Price;
import org.openapitools.model.TaxTransactionSpanishMarketData;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TaxTransaction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class TaxTransaction   {
  @JsonProperty("amount")
  private Double amount = null;

  @JsonProperty("associatedTransaction")
  private AssociatedTransactionData associatedTransaction = null;

  @JsonProperty("exchangeRateApplied")
  private Double exchangeRateApplied = null;

  @JsonProperty("fee")
  private Double fee = null;

  @JsonProperty("orderNumber")
  private Double orderNumber = null;

  @JsonProperty("price")
  private Price price = null;

  @JsonProperty("shares")
  private Double shares = null;

  @JsonProperty("spanishMarketData")
  private TaxTransactionSpanishMarketData spanishMarketData = null;

  @JsonProperty("valueDate")
  private OffsetDateTime valueDate = null;

  public TaxTransaction amount(Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The amount of the {TaxTaxaction} expressed in {Transaction.currencyCode} of the {TaxTaxaction.associatedTransaction}
   * @return amount
  **/
  @ApiModelProperty(value = "The amount of the {TaxTaxaction} expressed in {Transaction.currencyCode} of the {TaxTaxaction.associatedTransaction}")


  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public TaxTransaction associatedTransaction(AssociatedTransactionData associatedTransaction) {
    this.associatedTransaction = associatedTransaction;
    return this;
  }

  /**
   * Get associatedTransaction
   * @return associatedTransaction
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AssociatedTransactionData getAssociatedTransaction() {
    return associatedTransaction;
  }

  public void setAssociatedTransaction(AssociatedTransactionData associatedTransaction) {
    this.associatedTransaction = associatedTransaction;
  }

  public TaxTransaction exchangeRateApplied(Double exchangeRateApplied) {
    this.exchangeRateApplied = exchangeRateApplied;
    return this;
  }

  /**
   * The exchangeRate applide in the {TaxTaxaction}
   * @return exchangeRateApplied
  **/
  @ApiModelProperty(value = "The exchangeRate applide in the {TaxTaxaction}")


  public Double getExchangeRateApplied() {
    return exchangeRateApplied;
  }

  public void setExchangeRateApplied(Double exchangeRateApplied) {
    this.exchangeRateApplied = exchangeRateApplied;
  }

  public TaxTransaction fee(Double fee) {
    this.fee = fee;
    return this;
  }

  /**
   * The fee amount applied expressed in {Transaction.currencyCode} of the {TaxTaxaction.associatedTransaction}
   * @return fee
  **/
  @ApiModelProperty(value = "The fee amount applied expressed in {Transaction.currencyCode} of the {TaxTaxaction.associatedTransaction}")


  public Double getFee() {
    return fee;
  }

  public void setFee(Double fee) {
    this.fee = fee;
  }

  public TaxTransaction orderNumber(Double orderNumber) {
    this.orderNumber = orderNumber;
    return this;
  }

  /**
   * The ordinal number of this {TaxTransaction} within the set of all.
   * @return orderNumber
  **/
  @ApiModelProperty(value = "The ordinal number of this {TaxTransaction} within the set of all.")


  public Double getOrderNumber() {
    return orderNumber;
  }

  public void setOrderNumber(Double orderNumber) {
    this.orderNumber = orderNumber;
  }

  public TaxTransaction price(Price price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Price getPrice() {
    return price;
  }

  public void setPrice(Price price) {
    this.price = price;
  }

  public TaxTransaction shares(Double shares) {
    this.shares = shares;
    return this;
  }

  /**
   * The shares of the {TaxTaxaction}
   * @return shares
  **/
  @ApiModelProperty(value = "The shares of the {TaxTaxaction}")


  public Double getShares() {
    return shares;
  }

  public void setShares(Double shares) {
    this.shares = shares;
  }

  public TaxTransaction spanishMarketData(TaxTransactionSpanishMarketData spanishMarketData) {
    this.spanishMarketData = spanishMarketData;
    return this;
  }

  /**
   * Get spanishMarketData
   * @return spanishMarketData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public TaxTransactionSpanishMarketData getSpanishMarketData() {
    return spanishMarketData;
  }

  public void setSpanishMarketData(TaxTransactionSpanishMarketData spanishMarketData) {
    this.spanishMarketData = spanishMarketData;
  }

  public TaxTransaction valueDate(OffsetDateTime valueDate) {
    this.valueDate = valueDate;
    return this;
  }

  /**
   * The date associated to the {TaxTaxaction}
   * @return valueDate
  **/
  @ApiModelProperty(value = "The date associated to the {TaxTaxaction}")

  @Valid

  public OffsetDateTime getValueDate() {
    return valueDate;
  }

  public void setValueDate(OffsetDateTime valueDate) {
    this.valueDate = valueDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxTransaction taxTransaction = (TaxTransaction) o;
    return Objects.equals(this.amount, taxTransaction.amount) &&
        Objects.equals(this.associatedTransaction, taxTransaction.associatedTransaction) &&
        Objects.equals(this.exchangeRateApplied, taxTransaction.exchangeRateApplied) &&
        Objects.equals(this.fee, taxTransaction.fee) &&
        Objects.equals(this.orderNumber, taxTransaction.orderNumber) &&
        Objects.equals(this.price, taxTransaction.price) &&
        Objects.equals(this.shares, taxTransaction.shares) &&
        Objects.equals(this.spanishMarketData, taxTransaction.spanishMarketData) &&
        Objects.equals(this.valueDate, taxTransaction.valueDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, associatedTransaction, exchangeRateApplied, fee, orderNumber, price, shares, spanishMarketData, valueDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxTransaction {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    associatedTransaction: ").append(toIndentedString(associatedTransaction)).append("\n");
    sb.append("    exchangeRateApplied: ").append(toIndentedString(exchangeRateApplied)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    shares: ").append(toIndentedString(shares)).append("\n");
    sb.append("    spanishMarketData: ").append(toIndentedString(spanishMarketData)).append("\n");
    sb.append("    valueDate: ").append(toIndentedString(valueDate)).append("\n");
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

