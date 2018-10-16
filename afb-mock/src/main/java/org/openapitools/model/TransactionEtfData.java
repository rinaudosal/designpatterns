package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.model.EtfDealingData;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This object keeps specific information about transactions using ETFs as {DealingInstrument}
 */
@ApiModel(description = "This object keeps specific information about transactions using ETFs as {DealingInstrument}")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class TransactionEtfData   {
  @JsonProperty("brokerId")
  private Long brokerId = null;

  @JsonProperty("estimatedExchangeRate")
  private Double estimatedExchangeRate = null;

  @JsonProperty("estimatededExchangeRateToLocalCurrency")
  private Double estimatededExchangeRateToLocalCurrency = null;

  @JsonProperty("etfDealingData")
  private EtfDealingData etfDealingData = null;

  @JsonProperty("exchangeRateDate")
  private OffsetDateTime exchangeRateDate = null;

  @JsonProperty("stockExchangeId")
  private String stockExchangeId = null;

  public TransactionEtfData brokerId(Long brokerId) {
    this.brokerId = brokerId;
    return this;
  }

  /**
   * The Id of the {Broker} associated to the transaction
   * @return brokerId
  **/
  @ApiModelProperty(value = "The Id of the {Broker} associated to the transaction")


  public Long getBrokerId() {
    return brokerId;
  }

  public void setBrokerId(Long brokerId) {
    this.brokerId = brokerId;
  }

  public TransactionEtfData estimatedExchangeRate(Double estimatedExchangeRate) {
    this.estimatedExchangeRate = estimatedExchangeRate;
    return this;
  }

  /**
   * Estimated exchange rate applied when payment currency is different that the {DealingInstrument} currency. Defines the estimeted exchange rate between {Transaction.currencyCode} and {Transaction.paymentCurrencyCode}
   * @return estimatedExchangeRate
  **/
  @ApiModelProperty(value = "Estimated exchange rate applied when payment currency is different that the {DealingInstrument} currency. Defines the estimeted exchange rate between {Transaction.currencyCode} and {Transaction.paymentCurrencyCode}")


  public Double getEstimatedExchangeRate() {
    return estimatedExchangeRate;
  }

  public void setEstimatedExchangeRate(Double estimatedExchangeRate) {
    this.estimatedExchangeRate = estimatedExchangeRate;
  }

  public TransactionEtfData estimatededExchangeRateToLocalCurrency(Double estimatededExchangeRateToLocalCurrency) {
    this.estimatededExchangeRateToLocalCurrency = estimatededExchangeRateToLocalCurrency;
    return this;
  }

  /**
   * Estimated exchange Rate from {ETF} currency to local currency. Refers to the attribute {Transaction.localCurrencyCode}
   * @return estimatededExchangeRateToLocalCurrency
  **/
  @ApiModelProperty(value = "Estimated exchange Rate from {ETF} currency to local currency. Refers to the attribute {Transaction.localCurrencyCode}")


  public Double getEstimatededExchangeRateToLocalCurrency() {
    return estimatededExchangeRateToLocalCurrency;
  }

  public void setEstimatededExchangeRateToLocalCurrency(Double estimatededExchangeRateToLocalCurrency) {
    this.estimatededExchangeRateToLocalCurrency = estimatededExchangeRateToLocalCurrency;
  }

  public TransactionEtfData etfDealingData(EtfDealingData etfDealingData) {
    this.etfDealingData = etfDealingData;
    return this;
  }

  /**
   * Get etfDealingData
   * @return etfDealingData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public EtfDealingData getEtfDealingData() {
    return etfDealingData;
  }

  public void setEtfDealingData(EtfDealingData etfDealingData) {
    this.etfDealingData = etfDealingData;
  }

  public TransactionEtfData exchangeRateDate(OffsetDateTime exchangeRateDate) {
    this.exchangeRateDate = exchangeRateDate;
    return this;
  }

  /**
   * Defines the date used to calculate the estimated exchange rates.
   * @return exchangeRateDate
  **/
  @ApiModelProperty(value = "Defines the date used to calculate the estimated exchange rates.")

  @Valid

  public OffsetDateTime getExchangeRateDate() {
    return exchangeRateDate;
  }

  public void setExchangeRateDate(OffsetDateTime exchangeRateDate) {
    this.exchangeRateDate = exchangeRateDate;
  }

  public TransactionEtfData stockExchangeId(String stockExchangeId) {
    this.stockExchangeId = stockExchangeId;
    return this;
  }

  /**
   * Code of a stock exchange. Refer to {StockExchange}
   * @return stockExchangeId
  **/
  @ApiModelProperty(value = "Code of a stock exchange. Refer to {StockExchange}")


  public String getStockExchangeId() {
    return stockExchangeId;
  }

  public void setStockExchangeId(String stockExchangeId) {
    this.stockExchangeId = stockExchangeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionEtfData transactionEtfData = (TransactionEtfData) o;
    return Objects.equals(this.brokerId, transactionEtfData.brokerId) &&
        Objects.equals(this.estimatedExchangeRate, transactionEtfData.estimatedExchangeRate) &&
        Objects.equals(this.estimatededExchangeRateToLocalCurrency, transactionEtfData.estimatededExchangeRateToLocalCurrency) &&
        Objects.equals(this.etfDealingData, transactionEtfData.etfDealingData) &&
        Objects.equals(this.exchangeRateDate, transactionEtfData.exchangeRateDate) &&
        Objects.equals(this.stockExchangeId, transactionEtfData.stockExchangeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brokerId, estimatedExchangeRate, estimatededExchangeRateToLocalCurrency, etfDealingData, exchangeRateDate, stockExchangeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionEtfData {\n");
    
    sb.append("    brokerId: ").append(toIndentedString(brokerId)).append("\n");
    sb.append("    estimatedExchangeRate: ").append(toIndentedString(estimatedExchangeRate)).append("\n");
    sb.append("    estimatededExchangeRateToLocalCurrency: ").append(toIndentedString(estimatededExchangeRateToLocalCurrency)).append("\n");
    sb.append("    etfDealingData: ").append(toIndentedString(etfDealingData)).append("\n");
    sb.append("    exchangeRateDate: ").append(toIndentedString(exchangeRateDate)).append("\n");
    sb.append("    stockExchangeId: ").append(toIndentedString(stockExchangeId)).append("\n");
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

