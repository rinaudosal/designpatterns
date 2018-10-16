package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.model.FiscalSimulationBasicData;
import org.openapitools.model.Price;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Object used to keep the results of a fiscal simulation
 */
@ApiModel(description = "Object used to keep the results of a fiscal simulation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class FiscalSimulationBreakdown   {
  @JsonProperty("basicData")
  private FiscalSimulationBasicData basicData = null;

  @JsonProperty("deduction")
  private Double deduction = null;

  @JsonProperty("deductionInLocalCurrency")
  private Double deductionInLocalCurrency = null;

  @JsonProperty("exchangeRateApplied")
  private Double exchangeRateApplied = null;

  @JsonProperty("fee")
  private Double fee = null;

  @JsonProperty("initialAmount")
  private Double initialAmount = null;

  @JsonProperty("orderNumber")
  private Long orderNumber = null;

  @JsonProperty("price")
  private Price price = null;

  @JsonProperty("redeemedShares")
  private Double redeemedShares = null;

  @JsonProperty("shareholderDocument")
  private String shareholderDocument = null;

  @JsonProperty("transactionOrderedDate")
  private OffsetDateTime transactionOrderedDate = null;

  public FiscalSimulationBreakdown basicData(FiscalSimulationBasicData basicData) {
    this.basicData = basicData;
    return this;
  }

  /**
   * Get basicData
   * @return basicData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public FiscalSimulationBasicData getBasicData() {
    return basicData;
  }

  public void setBasicData(FiscalSimulationBasicData basicData) {
    this.basicData = basicData;
  }

  public FiscalSimulationBreakdown deduction(Double deduction) {
    this.deduction = deduction;
    return this;
  }

  /**
   * The deducted amount expressed in {FiscalSimulation.FiscalSimulationBasicData.currencyCode}
   * @return deduction
  **/
  @ApiModelProperty(value = "The deducted amount expressed in {FiscalSimulation.FiscalSimulationBasicData.currencyCode}")


  public Double getDeduction() {
    return deduction;
  }

  public void setDeduction(Double deduction) {
    this.deduction = deduction;
  }

  public FiscalSimulationBreakdown deductionInLocalCurrency(Double deductionInLocalCurrency) {
    this.deductionInLocalCurrency = deductionInLocalCurrency;
    return this;
  }

  /**
   * The deducted amount expressed in {FiscalSimulation.FiscalSimulationBasicData.localCurrencyCode}
   * @return deductionInLocalCurrency
  **/
  @ApiModelProperty(value = "The deducted amount expressed in {FiscalSimulation.FiscalSimulationBasicData.localCurrencyCode}")


  public Double getDeductionInLocalCurrency() {
    return deductionInLocalCurrency;
  }

  public void setDeductionInLocalCurrency(Double deductionInLocalCurrency) {
    this.deductionInLocalCurrency = deductionInLocalCurrency;
  }

  public FiscalSimulationBreakdown exchangeRateApplied(Double exchangeRateApplied) {
    this.exchangeRateApplied = exchangeRateApplied;
    return this;
  }

  /**
   * The exchante rate applied to do the simulation.
   * @return exchangeRateApplied
  **/
  @ApiModelProperty(value = "The exchante rate applied to do the simulation.")


  public Double getExchangeRateApplied() {
    return exchangeRateApplied;
  }

  public void setExchangeRateApplied(Double exchangeRateApplied) {
    this.exchangeRateApplied = exchangeRateApplied;
  }

  public FiscalSimulationBreakdown fee(Double fee) {
    this.fee = fee;
    return this;
  }

  /**
   * Total fee amount expressed in {FiscalSimulation.FiscalSimulationBasicData.currencyCode}
   * @return fee
  **/
  @ApiModelProperty(value = "Total fee amount expressed in {FiscalSimulation.FiscalSimulationBasicData.currencyCode}")


  public Double getFee() {
    return fee;
  }

  public void setFee(Double fee) {
    this.fee = fee;
  }

  public FiscalSimulationBreakdown initialAmount(Double initialAmount) {
    this.initialAmount = initialAmount;
    return this;
  }

  /**
   * The initial amount expressed in {FiscalSimulation.FiscalSimulationBasicData.currencyCode}
   * @return initialAmount
  **/
  @ApiModelProperty(value = "The initial amount expressed in {FiscalSimulation.FiscalSimulationBasicData.currencyCode}")


  public Double getInitialAmount() {
    return initialAmount;
  }

  public void setInitialAmount(Double initialAmount) {
    this.initialAmount = initialAmount;
  }

  public FiscalSimulationBreakdown orderNumber(Long orderNumber) {
    this.orderNumber = orderNumber;
    return this;
  }

  /**
   * The ordinal number of this item within de set of all
   * @return orderNumber
  **/
  @ApiModelProperty(value = "The ordinal number of this item within de set of all")


  public Long getOrderNumber() {
    return orderNumber;
  }

  public void setOrderNumber(Long orderNumber) {
    this.orderNumber = orderNumber;
  }

  public FiscalSimulationBreakdown price(Price price) {
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

  public FiscalSimulationBreakdown redeemedShares(Double redeemedShares) {
    this.redeemedShares = redeemedShares;
    return this;
  }

  /**
   * Redeemed shares.
   * @return redeemedShares
  **/
  @ApiModelProperty(value = "Redeemed shares.")


  public Double getRedeemedShares() {
    return redeemedShares;
  }

  public void setRedeemedShares(Double redeemedShares) {
    this.redeemedShares = redeemedShares;
  }

  public FiscalSimulationBreakdown shareholderDocument(String shareholderDocument) {
    this.shareholderDocument = shareholderDocument;
    return this;
  }

  /**
   * The document of the {Client} used as {Contract} shareholder in the simulation
   * @return shareholderDocument
  **/
  @ApiModelProperty(value = "The document of the {Client} used as {Contract} shareholder in the simulation")


  public String getShareholderDocument() {
    return shareholderDocument;
  }

  public void setShareholderDocument(String shareholderDocument) {
    this.shareholderDocument = shareholderDocument;
  }

  public FiscalSimulationBreakdown transactionOrderedDate(OffsetDateTime transactionOrderedDate) {
    this.transactionOrderedDate = transactionOrderedDate;
    return this;
  }

  /**
   * The date of the {Transaction} associated to this item.
   * @return transactionOrderedDate
  **/
  @ApiModelProperty(value = "The date of the {Transaction} associated to this item.")

  @Valid

  public OffsetDateTime getTransactionOrderedDate() {
    return transactionOrderedDate;
  }

  public void setTransactionOrderedDate(OffsetDateTime transactionOrderedDate) {
    this.transactionOrderedDate = transactionOrderedDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FiscalSimulationBreakdown fiscalSimulationBreakdown = (FiscalSimulationBreakdown) o;
    return Objects.equals(this.basicData, fiscalSimulationBreakdown.basicData) &&
        Objects.equals(this.deduction, fiscalSimulationBreakdown.deduction) &&
        Objects.equals(this.deductionInLocalCurrency, fiscalSimulationBreakdown.deductionInLocalCurrency) &&
        Objects.equals(this.exchangeRateApplied, fiscalSimulationBreakdown.exchangeRateApplied) &&
        Objects.equals(this.fee, fiscalSimulationBreakdown.fee) &&
        Objects.equals(this.initialAmount, fiscalSimulationBreakdown.initialAmount) &&
        Objects.equals(this.orderNumber, fiscalSimulationBreakdown.orderNumber) &&
        Objects.equals(this.price, fiscalSimulationBreakdown.price) &&
        Objects.equals(this.redeemedShares, fiscalSimulationBreakdown.redeemedShares) &&
        Objects.equals(this.shareholderDocument, fiscalSimulationBreakdown.shareholderDocument) &&
        Objects.equals(this.transactionOrderedDate, fiscalSimulationBreakdown.transactionOrderedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(basicData, deduction, deductionInLocalCurrency, exchangeRateApplied, fee, initialAmount, orderNumber, price, redeemedShares, shareholderDocument, transactionOrderedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FiscalSimulationBreakdown {\n");
    
    sb.append("    basicData: ").append(toIndentedString(basicData)).append("\n");
    sb.append("    deduction: ").append(toIndentedString(deduction)).append("\n");
    sb.append("    deductionInLocalCurrency: ").append(toIndentedString(deductionInLocalCurrency)).append("\n");
    sb.append("    exchangeRateApplied: ").append(toIndentedString(exchangeRateApplied)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    initialAmount: ").append(toIndentedString(initialAmount)).append("\n");
    sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    redeemedShares: ").append(toIndentedString(redeemedShares)).append("\n");
    sb.append("    shareholderDocument: ").append(toIndentedString(shareholderDocument)).append("\n");
    sb.append("    transactionOrderedDate: ").append(toIndentedString(transactionOrderedDate)).append("\n");
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

