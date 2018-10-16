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
 * CashTransferFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class CashTransferFilter   {
  @JsonProperty("amountFrom")
  private Double amountFrom = null;

  @JsonProperty("amountTo")
  private Double amountTo = null;

  @JsonProperty("cashAccountId")
  private String cashAccountId = null;

  @JsonProperty("endOrderedDate")
  private OffsetDateTime endOrderedDate = null;

  @JsonProperty("endValueDate")
  private OffsetDateTime endValueDate = null;

  @JsonProperty("externalReference")
  private String externalReference = null;

  @JsonProperty("startOrderedDate")
  private OffsetDateTime startOrderedDate = null;

  @JsonProperty("startValueDate")
  private OffsetDateTime startValueDate = null;

  @JsonProperty("statusCode")
  private String statusCode = null;

  public CashTransferFilter amountFrom(Double amountFrom) {
    this.amountFrom = amountFrom;
    return this;
  }

  /**
   * Minimum amount of the {CashTransfer}
   * @return amountFrom
  **/
  @ApiModelProperty(value = "Minimum amount of the {CashTransfer}")


  public Double getAmountFrom() {
    return amountFrom;
  }

  public void setAmountFrom(Double amountFrom) {
    this.amountFrom = amountFrom;
  }

  public CashTransferFilter amountTo(Double amountTo) {
    this.amountTo = amountTo;
    return this;
  }

  /**
   * Maximum amount of the {CashTransfer}
   * @return amountTo
  **/
  @ApiModelProperty(value = "Maximum amount of the {CashTransfer}")


  public Double getAmountTo() {
    return amountTo;
  }

  public void setAmountTo(Double amountTo) {
    this.amountTo = amountTo;
  }

  public CashTransferFilter cashAccountId(String cashAccountId) {
    this.cashAccountId = cashAccountId;
    return this;
  }

  /**
   * The Id of the {CashAccount} used in the {CashTransfer} as the source account
   * @return cashAccountId
  **/
  @ApiModelProperty(value = "The Id of the {CashAccount} used in the {CashTransfer} as the source account")


  public String getCashAccountId() {
    return cashAccountId;
  }

  public void setCashAccountId(String cashAccountId) {
    this.cashAccountId = cashAccountId;
  }

  public CashTransferFilter endOrderedDate(OffsetDateTime endOrderedDate) {
    this.endOrderedDate = endOrderedDate;
    return this;
  }

  /**
   * The start date. Refers to {CashTransfer.orderedDate}
   * @return endOrderedDate
  **/
  @ApiModelProperty(value = "The start date. Refers to {CashTransfer.orderedDate}")

  @Valid

  public OffsetDateTime getEndOrderedDate() {
    return endOrderedDate;
  }

  public void setEndOrderedDate(OffsetDateTime endOrderedDate) {
    this.endOrderedDate = endOrderedDate;
  }

  public CashTransferFilter endValueDate(OffsetDateTime endValueDate) {
    this.endValueDate = endValueDate;
    return this;
  }

  /**
   * The end date. Refers to {CashTransfer.valueDate}
   * @return endValueDate
  **/
  @ApiModelProperty(value = "The end date. Refers to {CashTransfer.valueDate}")

  @Valid

  public OffsetDateTime getEndValueDate() {
    return endValueDate;
  }

  public void setEndValueDate(OffsetDateTime endValueDate) {
    this.endValueDate = endValueDate;
  }

  public CashTransferFilter externalReference(String externalReference) {
    this.externalReference = externalReference;
    return this;
  }

  /**
   * Refers to {CashTransfer.externalReference}
   * @return externalReference
  **/
  @ApiModelProperty(value = "Refers to {CashTransfer.externalReference}")


  public String getExternalReference() {
    return externalReference;
  }

  public void setExternalReference(String externalReference) {
    this.externalReference = externalReference;
  }

  public CashTransferFilter startOrderedDate(OffsetDateTime startOrderedDate) {
    this.startOrderedDate = startOrderedDate;
    return this;
  }

  /**
   * The start date. Refers to {CashTransfer.orderedDate}
   * @return startOrderedDate
  **/
  @ApiModelProperty(value = "The start date. Refers to {CashTransfer.orderedDate}")

  @Valid

  public OffsetDateTime getStartOrderedDate() {
    return startOrderedDate;
  }

  public void setStartOrderedDate(OffsetDateTime startOrderedDate) {
    this.startOrderedDate = startOrderedDate;
  }

  public CashTransferFilter startValueDate(OffsetDateTime startValueDate) {
    this.startValueDate = startValueDate;
    return this;
  }

  /**
   * The start date. Refers to {CashTransfer.valueDate}
   * @return startValueDate
  **/
  @ApiModelProperty(value = "The start date. Refers to {CashTransfer.valueDate}")

  @Valid

  public OffsetDateTime getStartValueDate() {
    return startValueDate;
  }

  public void setStartValueDate(OffsetDateTime startValueDate) {
    this.startValueDate = startValueDate;
  }

  public CashTransferFilter statusCode(String statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  /**
   * Status. Refers to {listCashTransferStatutes}
   * @return statusCode
  **/
  @ApiModelProperty(value = "Status. Refers to {listCashTransferStatutes}")


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
    CashTransferFilter cashTransferFilter = (CashTransferFilter) o;
    return Objects.equals(this.amountFrom, cashTransferFilter.amountFrom) &&
        Objects.equals(this.amountTo, cashTransferFilter.amountTo) &&
        Objects.equals(this.cashAccountId, cashTransferFilter.cashAccountId) &&
        Objects.equals(this.endOrderedDate, cashTransferFilter.endOrderedDate) &&
        Objects.equals(this.endValueDate, cashTransferFilter.endValueDate) &&
        Objects.equals(this.externalReference, cashTransferFilter.externalReference) &&
        Objects.equals(this.startOrderedDate, cashTransferFilter.startOrderedDate) &&
        Objects.equals(this.startValueDate, cashTransferFilter.startValueDate) &&
        Objects.equals(this.statusCode, cashTransferFilter.statusCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountFrom, amountTo, cashAccountId, endOrderedDate, endValueDate, externalReference, startOrderedDate, startValueDate, statusCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashTransferFilter {\n");
    
    sb.append("    amountFrom: ").append(toIndentedString(amountFrom)).append("\n");
    sb.append("    amountTo: ").append(toIndentedString(amountTo)).append("\n");
    sb.append("    cashAccountId: ").append(toIndentedString(cashAccountId)).append("\n");
    sb.append("    endOrderedDate: ").append(toIndentedString(endOrderedDate)).append("\n");
    sb.append("    endValueDate: ").append(toIndentedString(endValueDate)).append("\n");
    sb.append("    externalReference: ").append(toIndentedString(externalReference)).append("\n");
    sb.append("    startOrderedDate: ").append(toIndentedString(startOrderedDate)).append("\n");
    sb.append("    startValueDate: ").append(toIndentedString(startValueDate)).append("\n");
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

