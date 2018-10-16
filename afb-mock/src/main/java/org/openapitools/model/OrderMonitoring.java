package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OrderMonitoring
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class OrderMonitoring   {
  @JsonProperty("awardedNetAmount")
  private Double awardedNetAmount = null;

  @JsonProperty("confirmationDate")
  private OffsetDateTime confirmationDate = null;

  @JsonProperty("externalReference")
  private Double externalReference = null;

  @JsonProperty("priceDate")
  private OffsetDateTime priceDate = null;

  @JsonProperty("requestedNetAmount")
  private Double requestedNetAmount = null;

  @JsonProperty("settlementDate")
  private OffsetDateTime settlementDate = null;

  @JsonProperty("statusCode")
  private String statusCode = null;

  @JsonProperty("transactionId")
  private Long transactionId = null;

  @JsonProperty("transactionTypeCode")
  private String transactionTypeCode = null;

  public OrderMonitoring awardedNetAmount(Double awardedNetAmount) {
    this.awardedNetAmount = awardedNetAmount;
    return this;
  }

  /**
   * Awarded net amount assigned to the transaction
   * @return awardedNetAmount
  **/
  @ApiModelProperty(value = "Awarded net amount assigned to the transaction")


  public Double getAwardedNetAmount() {
    return awardedNetAmount;
  }

  public void setAwardedNetAmount(Double awardedNetAmount) {
    this.awardedNetAmount = awardedNetAmount;
  }

  public OrderMonitoring confirmationDate(OffsetDateTime confirmationDate) {
    this.confirmationDate = confirmationDate;
    return this;
  }

  /**
   * Get confirmationDate
   * @return confirmationDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getConfirmationDate() {
    return confirmationDate;
  }

  public void setConfirmationDate(OffsetDateTime confirmationDate) {
    this.confirmationDate = confirmationDate;
  }

  public OrderMonitoring externalReference(Double externalReference) {
    this.externalReference = externalReference;
    return this;
  }

  /**
   * External Reference
   * @return externalReference
  **/
  @ApiModelProperty(value = "External Reference")


  public Double getExternalReference() {
    return externalReference;
  }

  public void setExternalReference(Double externalReference) {
    this.externalReference = externalReference;
  }

  public OrderMonitoring priceDate(OffsetDateTime priceDate) {
    this.priceDate = priceDate;
    return this;
  }

  /**
   * Get priceDate
   * @return priceDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getPriceDate() {
    return priceDate;
  }

  public void setPriceDate(OffsetDateTime priceDate) {
    this.priceDate = priceDate;
  }

  public OrderMonitoring requestedNetAmount(Double requestedNetAmount) {
    this.requestedNetAmount = requestedNetAmount;
    return this;
  }

  /**
   * Net amount requested in the transaction
   * @return requestedNetAmount
  **/
  @ApiModelProperty(value = "Net amount requested in the transaction")


  public Double getRequestedNetAmount() {
    return requestedNetAmount;
  }

  public void setRequestedNetAmount(Double requestedNetAmount) {
    this.requestedNetAmount = requestedNetAmount;
  }

  public OrderMonitoring settlementDate(OffsetDateTime settlementDate) {
    this.settlementDate = settlementDate;
    return this;
  }

  /**
   * Get settlementDate
   * @return settlementDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getSettlementDate() {
    return settlementDate;
  }

  public void setSettlementDate(OffsetDateTime settlementDate) {
    this.settlementDate = settlementDate;
  }

  public OrderMonitoring statusCode(String statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  /**
   * The status of {TransactionMonitoring}. Refer to {listOrderMonitoringStatuses}
   * @return statusCode
  **/
  @ApiModelProperty(value = "The status of {TransactionMonitoring}. Refer to {listOrderMonitoringStatuses}")


  public String getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }

  public OrderMonitoring transactionId(Long transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  /**
   * The id of the {Transaction}.
   * @return transactionId
  **/
  @ApiModelProperty(value = "The id of the {Transaction}.")


  public Long getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(Long transactionId) {
    this.transactionId = transactionId;
  }

  public OrderMonitoring transactionTypeCode(String transactionTypeCode) {
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
    OrderMonitoring orderMonitoring = (OrderMonitoring) o;
    return Objects.equals(this.awardedNetAmount, orderMonitoring.awardedNetAmount) &&
        Objects.equals(this.confirmationDate, orderMonitoring.confirmationDate) &&
        Objects.equals(this.externalReference, orderMonitoring.externalReference) &&
        Objects.equals(this.priceDate, orderMonitoring.priceDate) &&
        Objects.equals(this.requestedNetAmount, orderMonitoring.requestedNetAmount) &&
        Objects.equals(this.settlementDate, orderMonitoring.settlementDate) &&
        Objects.equals(this.statusCode, orderMonitoring.statusCode) &&
        Objects.equals(this.transactionId, orderMonitoring.transactionId) &&
        Objects.equals(this.transactionTypeCode, orderMonitoring.transactionTypeCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awardedNetAmount, confirmationDate, externalReference, priceDate, requestedNetAmount, settlementDate, statusCode, transactionId, transactionTypeCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderMonitoring {\n");
    
    sb.append("    awardedNetAmount: ").append(toIndentedString(awardedNetAmount)).append("\n");
    sb.append("    confirmationDate: ").append(toIndentedString(confirmationDate)).append("\n");
    sb.append("    externalReference: ").append(toIndentedString(externalReference)).append("\n");
    sb.append("    priceDate: ").append(toIndentedString(priceDate)).append("\n");
    sb.append("    requestedNetAmount: ").append(toIndentedString(requestedNetAmount)).append("\n");
    sb.append("    settlementDate: ").append(toIndentedString(settlementDate)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
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

