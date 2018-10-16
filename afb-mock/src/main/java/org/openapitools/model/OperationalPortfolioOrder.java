package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.model.OperationalPortfolioDealingInstrument;
import org.openapitools.model.OperationalPortfolioMovementFeeData;
import org.openapitools.model.OperationalPortfolioOrderSettingsData;
import org.openapitools.model.ResourceReference;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OperationalPortfolioOrder
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class OperationalPortfolioOrder   {
  @JsonProperty("associatedPriceDate")
  private OffsetDateTime associatedPriceDate = null;

  @JsonProperty("authorizationOrderTypeCode")
  private String authorizationOrderTypeCode = null;

  @JsonProperty("awardedAmount")
  private Double awardedAmount = null;

  @JsonProperty("awardedShares")
  private Double awardedShares = null;

  @JsonProperty("currencyCode")
  private String currencyCode = null;

  @JsonProperty("externalReference")
  private Long externalReference = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("operationalPortfolioAssociatedDealingFundHouse")
  private ResourceReference operationalPortfolioAssociatedDealingFundHouse = null;

  @JsonProperty("operationalPortfolioAssociatedDealingInstrument")
  private OperationalPortfolioDealingInstrument operationalPortfolioAssociatedDealingInstrument = null;

  @JsonProperty("operationalPortfolioDealingFundHouse")
  private ResourceReference operationalPortfolioDealingFundHouse = null;

  @JsonProperty("operationalPortfolioDealingInstrument")
  private OperationalPortfolioDealingInstrument operationalPortfolioDealingInstrument = null;

  @JsonProperty("operationalPortfolioMovementFeeData")
  private OperationalPortfolioMovementFeeData operationalPortfolioMovementFeeData = null;

  @JsonProperty("operationalPortfolioOrderOriginCode")
  private String operationalPortfolioOrderOriginCode = null;

  @JsonProperty("operationalPortfolioOrderSettingsData")
  private OperationalPortfolioOrderSettingsData operationalPortfolioOrderSettingsData = null;

  @JsonProperty("operationalPortfolioPhaseCode")
  private String operationalPortfolioPhaseCode = null;

  @JsonProperty("orderMonitoringStatusCode")
  private String orderMonitoringStatusCode = null;

  @JsonProperty("priceDate")
  private OffsetDateTime priceDate = null;

  @JsonProperty("priceValue")
  private String priceValue = null;

  @JsonProperty("requestedAmount")
  private Double requestedAmount = null;

  @JsonProperty("requestedShares")
  private Double requestedShares = null;

  @JsonProperty("settlementDate")
  private OffsetDateTime settlementDate = null;

  @JsonProperty("spanishTransferId")
  private String spanishTransferId = null;

  @JsonProperty("transactionTypeCode")
  private String transactionTypeCode = null;

  public OperationalPortfolioOrder associatedPriceDate(OffsetDateTime associatedPriceDate) {
    this.associatedPriceDate = associatedPriceDate;
    return this;
  }

  /**
   * The price date associated to the {OperationalPortfolioOrder}.
   * @return associatedPriceDate
  **/
  @ApiModelProperty(value = "The price date associated to the {OperationalPortfolioOrder}.")

  @Valid

  public OffsetDateTime getAssociatedPriceDate() {
    return associatedPriceDate;
  }

  public void setAssociatedPriceDate(OffsetDateTime associatedPriceDate) {
    this.associatedPriceDate = associatedPriceDate;
  }

  public OperationalPortfolioOrder authorizationOrderTypeCode(String authorizationOrderTypeCode) {
    this.authorizationOrderTypeCode = authorizationOrderTypeCode;
    return this;
  }

  /**
   * The status of {TransactionMonitoring}. Refer to {listAuthorizationOrderTypes}
   * @return authorizationOrderTypeCode
  **/
  @ApiModelProperty(value = "The status of {TransactionMonitoring}. Refer to {listAuthorizationOrderTypes}")


  public String getAuthorizationOrderTypeCode() {
    return authorizationOrderTypeCode;
  }

  public void setAuthorizationOrderTypeCode(String authorizationOrderTypeCode) {
    this.authorizationOrderTypeCode = authorizationOrderTypeCode;
  }

  public OperationalPortfolioOrder awardedAmount(Double awardedAmount) {
    this.awardedAmount = awardedAmount;
    return this;
  }

  /**
   * Amount awarded in the {OperationalPortfolioOrder}.
   * @return awardedAmount
  **/
  @ApiModelProperty(value = "Amount awarded in the {OperationalPortfolioOrder}.")


  public Double getAwardedAmount() {
    return awardedAmount;
  }

  public void setAwardedAmount(Double awardedAmount) {
    this.awardedAmount = awardedAmount;
  }

  public OperationalPortfolioOrder awardedShares(Double awardedShares) {
    this.awardedShares = awardedShares;
    return this;
  }

  /**
   * Shares requested in the {OperationalPortfolioOrder}
   * @return awardedShares
  **/
  @ApiModelProperty(value = "Shares requested in the {OperationalPortfolioOrder}")


  public Double getAwardedShares() {
    return awardedShares;
  }

  public void setAwardedShares(Double awardedShares) {
    this.awardedShares = awardedShares;
  }

  public OperationalPortfolioOrder currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * The currency associated to the {OperationalPortfolioOrder}. Refer to {listCurrencies}
   * @return currencyCode
  **/
  @ApiModelProperty(value = "The currency associated to the {OperationalPortfolioOrder}. Refer to {listCurrencies}")


  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public OperationalPortfolioOrder externalReference(Long externalReference) {
    this.externalReference = externalReference;
    return this;
  }

  /**
   * The External Reference of the {OperationalPortfolioOrder}
   * @return externalReference
  **/
  @ApiModelProperty(value = "The External Reference of the {OperationalPortfolioOrder}")


  public Long getExternalReference() {
    return externalReference;
  }

  public void setExternalReference(Long externalReference) {
    this.externalReference = externalReference;
  }

  public OperationalPortfolioOrder id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * The Id of the {OperationalPortfolioOrder}
   * @return id
  **/
  @ApiModelProperty(value = "The Id of the {OperationalPortfolioOrder}")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public OperationalPortfolioOrder operationalPortfolioAssociatedDealingFundHouse(ResourceReference operationalPortfolioAssociatedDealingFundHouse) {
    this.operationalPortfolioAssociatedDealingFundHouse = operationalPortfolioAssociatedDealingFundHouse;
    return this;
  }

  /**
   * Get operationalPortfolioAssociatedDealingFundHouse
   * @return operationalPortfolioAssociatedDealingFundHouse
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ResourceReference getOperationalPortfolioAssociatedDealingFundHouse() {
    return operationalPortfolioAssociatedDealingFundHouse;
  }

  public void setOperationalPortfolioAssociatedDealingFundHouse(ResourceReference operationalPortfolioAssociatedDealingFundHouse) {
    this.operationalPortfolioAssociatedDealingFundHouse = operationalPortfolioAssociatedDealingFundHouse;
  }

  public OperationalPortfolioOrder operationalPortfolioAssociatedDealingInstrument(OperationalPortfolioDealingInstrument operationalPortfolioAssociatedDealingInstrument) {
    this.operationalPortfolioAssociatedDealingInstrument = operationalPortfolioAssociatedDealingInstrument;
    return this;
  }

  /**
   * Get operationalPortfolioAssociatedDealingInstrument
   * @return operationalPortfolioAssociatedDealingInstrument
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OperationalPortfolioDealingInstrument getOperationalPortfolioAssociatedDealingInstrument() {
    return operationalPortfolioAssociatedDealingInstrument;
  }

  public void setOperationalPortfolioAssociatedDealingInstrument(OperationalPortfolioDealingInstrument operationalPortfolioAssociatedDealingInstrument) {
    this.operationalPortfolioAssociatedDealingInstrument = operationalPortfolioAssociatedDealingInstrument;
  }

  public OperationalPortfolioOrder operationalPortfolioDealingFundHouse(ResourceReference operationalPortfolioDealingFundHouse) {
    this.operationalPortfolioDealingFundHouse = operationalPortfolioDealingFundHouse;
    return this;
  }

  /**
   * Get operationalPortfolioDealingFundHouse
   * @return operationalPortfolioDealingFundHouse
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ResourceReference getOperationalPortfolioDealingFundHouse() {
    return operationalPortfolioDealingFundHouse;
  }

  public void setOperationalPortfolioDealingFundHouse(ResourceReference operationalPortfolioDealingFundHouse) {
    this.operationalPortfolioDealingFundHouse = operationalPortfolioDealingFundHouse;
  }

  public OperationalPortfolioOrder operationalPortfolioDealingInstrument(OperationalPortfolioDealingInstrument operationalPortfolioDealingInstrument) {
    this.operationalPortfolioDealingInstrument = operationalPortfolioDealingInstrument;
    return this;
  }

  /**
   * Get operationalPortfolioDealingInstrument
   * @return operationalPortfolioDealingInstrument
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OperationalPortfolioDealingInstrument getOperationalPortfolioDealingInstrument() {
    return operationalPortfolioDealingInstrument;
  }

  public void setOperationalPortfolioDealingInstrument(OperationalPortfolioDealingInstrument operationalPortfolioDealingInstrument) {
    this.operationalPortfolioDealingInstrument = operationalPortfolioDealingInstrument;
  }

  public OperationalPortfolioOrder operationalPortfolioMovementFeeData(OperationalPortfolioMovementFeeData operationalPortfolioMovementFeeData) {
    this.operationalPortfolioMovementFeeData = operationalPortfolioMovementFeeData;
    return this;
  }

  /**
   * Get operationalPortfolioMovementFeeData
   * @return operationalPortfolioMovementFeeData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OperationalPortfolioMovementFeeData getOperationalPortfolioMovementFeeData() {
    return operationalPortfolioMovementFeeData;
  }

  public void setOperationalPortfolioMovementFeeData(OperationalPortfolioMovementFeeData operationalPortfolioMovementFeeData) {
    this.operationalPortfolioMovementFeeData = operationalPortfolioMovementFeeData;
  }

  public OperationalPortfolioOrder operationalPortfolioOrderOriginCode(String operationalPortfolioOrderOriginCode) {
    this.operationalPortfolioOrderOriginCode = operationalPortfolioOrderOriginCode;
    return this;
  }

  /**
   * The status of {TransactionMonitoring}. Refer to {listOperationalPortfolioOrderOrigins}
   * @return operationalPortfolioOrderOriginCode
  **/
  @ApiModelProperty(value = "The status of {TransactionMonitoring}. Refer to {listOperationalPortfolioOrderOrigins}")


  public String getOperationalPortfolioOrderOriginCode() {
    return operationalPortfolioOrderOriginCode;
  }

  public void setOperationalPortfolioOrderOriginCode(String operationalPortfolioOrderOriginCode) {
    this.operationalPortfolioOrderOriginCode = operationalPortfolioOrderOriginCode;
  }

  public OperationalPortfolioOrder operationalPortfolioOrderSettingsData(OperationalPortfolioOrderSettingsData operationalPortfolioOrderSettingsData) {
    this.operationalPortfolioOrderSettingsData = operationalPortfolioOrderSettingsData;
    return this;
  }

  /**
   * Get operationalPortfolioOrderSettingsData
   * @return operationalPortfolioOrderSettingsData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OperationalPortfolioOrderSettingsData getOperationalPortfolioOrderSettingsData() {
    return operationalPortfolioOrderSettingsData;
  }

  public void setOperationalPortfolioOrderSettingsData(OperationalPortfolioOrderSettingsData operationalPortfolioOrderSettingsData) {
    this.operationalPortfolioOrderSettingsData = operationalPortfolioOrderSettingsData;
  }

  public OperationalPortfolioOrder operationalPortfolioPhaseCode(String operationalPortfolioPhaseCode) {
    this.operationalPortfolioPhaseCode = operationalPortfolioPhaseCode;
    return this;
  }

  /**
   * Authorization phase in order to indicate possible extra authorizations. Refer to {listOperationalPortfolioAuthorizationPhases}
   * @return operationalPortfolioPhaseCode
  **/
  @ApiModelProperty(value = "Authorization phase in order to indicate possible extra authorizations. Refer to {listOperationalPortfolioAuthorizationPhases}")


  public String getOperationalPortfolioPhaseCode() {
    return operationalPortfolioPhaseCode;
  }

  public void setOperationalPortfolioPhaseCode(String operationalPortfolioPhaseCode) {
    this.operationalPortfolioPhaseCode = operationalPortfolioPhaseCode;
  }

  public OperationalPortfolioOrder orderMonitoringStatusCode(String orderMonitoringStatusCode) {
    this.orderMonitoringStatusCode = orderMonitoringStatusCode;
    return this;
  }

  /**
   * The status of {TransactionMonitoring}. Refer to {listOrderMonitoringStatuses}
   * @return orderMonitoringStatusCode
  **/
  @ApiModelProperty(value = "The status of {TransactionMonitoring}. Refer to {listOrderMonitoringStatuses}")


  public String getOrderMonitoringStatusCode() {
    return orderMonitoringStatusCode;
  }

  public void setOrderMonitoringStatusCode(String orderMonitoringStatusCode) {
    this.orderMonitoringStatusCode = orderMonitoringStatusCode;
  }

  public OperationalPortfolioOrder priceDate(OffsetDateTime priceDate) {
    this.priceDate = priceDate;
    return this;
  }

  /**
   * Price date in the {OperationalPortfolioOrder}.
   * @return priceDate
  **/
  @ApiModelProperty(value = "Price date in the {OperationalPortfolioOrder}.")

  @Valid

  public OffsetDateTime getPriceDate() {
    return priceDate;
  }

  public void setPriceDate(OffsetDateTime priceDate) {
    this.priceDate = priceDate;
  }

  public OperationalPortfolioOrder priceValue(String priceValue) {
    this.priceValue = priceValue;
    return this;
  }

  /**
   * Price value
   * @return priceValue
  **/
  @ApiModelProperty(value = "Price value")


  public String getPriceValue() {
    return priceValue;
  }

  public void setPriceValue(String priceValue) {
    this.priceValue = priceValue;
  }

  public OperationalPortfolioOrder requestedAmount(Double requestedAmount) {
    this.requestedAmount = requestedAmount;
    return this;
  }

  /**
   * Amount requested in the {OperationalPortfolioOrder}.
   * @return requestedAmount
  **/
  @ApiModelProperty(value = "Amount requested in the {OperationalPortfolioOrder}.")


  public Double getRequestedAmount() {
    return requestedAmount;
  }

  public void setRequestedAmount(Double requestedAmount) {
    this.requestedAmount = requestedAmount;
  }

  public OperationalPortfolioOrder requestedShares(Double requestedShares) {
    this.requestedShares = requestedShares;
    return this;
  }

  /**
   * Shares requested in the {OperationalPortfolioOrder}
   * @return requestedShares
  **/
  @ApiModelProperty(value = "Shares requested in the {OperationalPortfolioOrder}")


  public Double getRequestedShares() {
    return requestedShares;
  }

  public void setRequestedShares(Double requestedShares) {
    this.requestedShares = requestedShares;
  }

  public OperationalPortfolioOrder settlementDate(OffsetDateTime settlementDate) {
    this.settlementDate = settlementDate;
    return this;
  }

  /**
   * The {Settlement} date
   * @return settlementDate
  **/
  @ApiModelProperty(value = "The {Settlement} date")

  @Valid

  public OffsetDateTime getSettlementDate() {
    return settlementDate;
  }

  public void setSettlementDate(OffsetDateTime settlementDate) {
    this.settlementDate = settlementDate;
  }

  public OperationalPortfolioOrder spanishTransferId(String spanishTransferId) {
    this.spanishTransferId = spanishTransferId;
    return this;
  }

  /**
   * The Id of the {SpanishTransfer}
   * @return spanishTransferId
  **/
  @ApiModelProperty(value = "The Id of the {SpanishTransfer}")


  public String getSpanishTransferId() {
    return spanishTransferId;
  }

  public void setSpanishTransferId(String spanishTransferId) {
    this.spanishTransferId = spanishTransferId;
  }

  public OperationalPortfolioOrder transactionTypeCode(String transactionTypeCode) {
    this.transactionTypeCode = transactionTypeCode;
    return this;
  }

  /**
   * Transaction type. Refer to {listTransactionTypes}
   * @return transactionTypeCode
  **/
  @ApiModelProperty(value = "Transaction type. Refer to {listTransactionTypes}")


  public String getTransactionTypeCode() {
    return transactionTypeCode;
  }

  public void setTransactionTypeCode(String transactionTypeCode) {
    this.transactionTypeCode = transactionTypeCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationalPortfolioOrder operationalPortfolioOrder = (OperationalPortfolioOrder) o;
    return Objects.equals(this.associatedPriceDate, operationalPortfolioOrder.associatedPriceDate) &&
        Objects.equals(this.authorizationOrderTypeCode, operationalPortfolioOrder.authorizationOrderTypeCode) &&
        Objects.equals(this.awardedAmount, operationalPortfolioOrder.awardedAmount) &&
        Objects.equals(this.awardedShares, operationalPortfolioOrder.awardedShares) &&
        Objects.equals(this.currencyCode, operationalPortfolioOrder.currencyCode) &&
        Objects.equals(this.externalReference, operationalPortfolioOrder.externalReference) &&
        Objects.equals(this.id, operationalPortfolioOrder.id) &&
        Objects.equals(this.operationalPortfolioAssociatedDealingFundHouse, operationalPortfolioOrder.operationalPortfolioAssociatedDealingFundHouse) &&
        Objects.equals(this.operationalPortfolioAssociatedDealingInstrument, operationalPortfolioOrder.operationalPortfolioAssociatedDealingInstrument) &&
        Objects.equals(this.operationalPortfolioDealingFundHouse, operationalPortfolioOrder.operationalPortfolioDealingFundHouse) &&
        Objects.equals(this.operationalPortfolioDealingInstrument, operationalPortfolioOrder.operationalPortfolioDealingInstrument) &&
        Objects.equals(this.operationalPortfolioMovementFeeData, operationalPortfolioOrder.operationalPortfolioMovementFeeData) &&
        Objects.equals(this.operationalPortfolioOrderOriginCode, operationalPortfolioOrder.operationalPortfolioOrderOriginCode) &&
        Objects.equals(this.operationalPortfolioOrderSettingsData, operationalPortfolioOrder.operationalPortfolioOrderSettingsData) &&
        Objects.equals(this.operationalPortfolioPhaseCode, operationalPortfolioOrder.operationalPortfolioPhaseCode) &&
        Objects.equals(this.orderMonitoringStatusCode, operationalPortfolioOrder.orderMonitoringStatusCode) &&
        Objects.equals(this.priceDate, operationalPortfolioOrder.priceDate) &&
        Objects.equals(this.priceValue, operationalPortfolioOrder.priceValue) &&
        Objects.equals(this.requestedAmount, operationalPortfolioOrder.requestedAmount) &&
        Objects.equals(this.requestedShares, operationalPortfolioOrder.requestedShares) &&
        Objects.equals(this.settlementDate, operationalPortfolioOrder.settlementDate) &&
        Objects.equals(this.spanishTransferId, operationalPortfolioOrder.spanishTransferId) &&
        Objects.equals(this.transactionTypeCode, operationalPortfolioOrder.transactionTypeCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(associatedPriceDate, authorizationOrderTypeCode, awardedAmount, awardedShares, currencyCode, externalReference, id, operationalPortfolioAssociatedDealingFundHouse, operationalPortfolioAssociatedDealingInstrument, operationalPortfolioDealingFundHouse, operationalPortfolioDealingInstrument, operationalPortfolioMovementFeeData, operationalPortfolioOrderOriginCode, operationalPortfolioOrderSettingsData, operationalPortfolioPhaseCode, orderMonitoringStatusCode, priceDate, priceValue, requestedAmount, requestedShares, settlementDate, spanishTransferId, transactionTypeCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationalPortfolioOrder {\n");
    
    sb.append("    associatedPriceDate: ").append(toIndentedString(associatedPriceDate)).append("\n");
    sb.append("    authorizationOrderTypeCode: ").append(toIndentedString(authorizationOrderTypeCode)).append("\n");
    sb.append("    awardedAmount: ").append(toIndentedString(awardedAmount)).append("\n");
    sb.append("    awardedShares: ").append(toIndentedString(awardedShares)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    externalReference: ").append(toIndentedString(externalReference)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    operationalPortfolioAssociatedDealingFundHouse: ").append(toIndentedString(operationalPortfolioAssociatedDealingFundHouse)).append("\n");
    sb.append("    operationalPortfolioAssociatedDealingInstrument: ").append(toIndentedString(operationalPortfolioAssociatedDealingInstrument)).append("\n");
    sb.append("    operationalPortfolioDealingFundHouse: ").append(toIndentedString(operationalPortfolioDealingFundHouse)).append("\n");
    sb.append("    operationalPortfolioDealingInstrument: ").append(toIndentedString(operationalPortfolioDealingInstrument)).append("\n");
    sb.append("    operationalPortfolioMovementFeeData: ").append(toIndentedString(operationalPortfolioMovementFeeData)).append("\n");
    sb.append("    operationalPortfolioOrderOriginCode: ").append(toIndentedString(operationalPortfolioOrderOriginCode)).append("\n");
    sb.append("    operationalPortfolioOrderSettingsData: ").append(toIndentedString(operationalPortfolioOrderSettingsData)).append("\n");
    sb.append("    operationalPortfolioPhaseCode: ").append(toIndentedString(operationalPortfolioPhaseCode)).append("\n");
    sb.append("    orderMonitoringStatusCode: ").append(toIndentedString(orderMonitoringStatusCode)).append("\n");
    sb.append("    priceDate: ").append(toIndentedString(priceDate)).append("\n");
    sb.append("    priceValue: ").append(toIndentedString(priceValue)).append("\n");
    sb.append("    requestedAmount: ").append(toIndentedString(requestedAmount)).append("\n");
    sb.append("    requestedShares: ").append(toIndentedString(requestedShares)).append("\n");
    sb.append("    settlementDate: ").append(toIndentedString(settlementDate)).append("\n");
    sb.append("    spanishTransferId: ").append(toIndentedString(spanishTransferId)).append("\n");
    sb.append("    transactionTypeCode: ").append(toIndentedString(transactionTypeCode)).append("\n");
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

