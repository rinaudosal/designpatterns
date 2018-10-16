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
 * CashTransactionFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class CashTransactionFilter   {
  @JsonProperty("additionalReference")
  private String additionalReference = null;

  @JsonProperty("amountFrom")
  private Double amountFrom = null;

  @JsonProperty("amountTo")
  private Double amountTo = null;

  @JsonProperty("endDate")
  private OffsetDateTime endDate = null;

  @JsonProperty("startDate")
  private OffsetDateTime startDate = null;

  @JsonProperty("transactionTypeCode")
  private String transactionTypeCode = null;

  public CashTransactionFilter additionalReference(String additionalReference) {
    this.additionalReference = additionalReference;
    return this;
  }

  /**
   * Refers to any reference in {CashTransaction.additionalReference1}, {CashTransaction.additionalReference2},{CashTransaction.additionalReference3} or {CashTransaction.additionalReference4}
   * @return additionalReference
  **/
  @ApiModelProperty(value = "Refers to any reference in {CashTransaction.additionalReference1}, {CashTransaction.additionalReference2},{CashTransaction.additionalReference3} or {CashTransaction.additionalReference4}")


  public String getAdditionalReference() {
    return additionalReference;
  }

  public void setAdditionalReference(String additionalReference) {
    this.additionalReference = additionalReference;
  }

  public CashTransactionFilter amountFrom(Double amountFrom) {
    this.amountFrom = amountFrom;
    return this;
  }

  /**
   * Maximun amount of the {CashTransaction.amount} expressed in {CashTransaction.currencyCode}
   * @return amountFrom
  **/
  @ApiModelProperty(value = "Maximun amount of the {CashTransaction.amount} expressed in {CashTransaction.currencyCode}")


  public Double getAmountFrom() {
    return amountFrom;
  }

  public void setAmountFrom(Double amountFrom) {
    this.amountFrom = amountFrom;
  }

  public CashTransactionFilter amountTo(Double amountTo) {
    this.amountTo = amountTo;
    return this;
  }

  /**
   * Minimun amount of the {CashTransaction.amount} expressed in {CashTransaction.currencyCode}
   * @return amountTo
  **/
  @ApiModelProperty(value = "Minimun amount of the {CashTransaction.amount} expressed in {CashTransaction.currencyCode}")


  public Double getAmountTo() {
    return amountTo;
  }

  public void setAmountTo(Double amountTo) {
    this.amountTo = amountTo;
  }

  public CashTransactionFilter endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Latest date to look for {CashTransaction.valueDate}
   * @return endDate
  **/
  @ApiModelProperty(value = "Latest date to look for {CashTransaction.valueDate}")

  @Valid

  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public CashTransactionFilter startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Earliest date to look for {CashTransaction.valueDate}
   * @return startDate
  **/
  @ApiModelProperty(value = "Earliest date to look for {CashTransaction.valueDate}")

  @Valid

  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public CashTransactionFilter transactionTypeCode(String transactionTypeCode) {
    this.transactionTypeCode = transactionTypeCode;
    return this;
  }

  /**
   * The type of the {CashTransaction}. Refers to {listCashTransactionDetailedTypes}
   * @return transactionTypeCode
  **/
  @ApiModelProperty(value = "The type of the {CashTransaction}. Refers to {listCashTransactionDetailedTypes}")


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
    CashTransactionFilter cashTransactionFilter = (CashTransactionFilter) o;
    return Objects.equals(this.additionalReference, cashTransactionFilter.additionalReference) &&
        Objects.equals(this.amountFrom, cashTransactionFilter.amountFrom) &&
        Objects.equals(this.amountTo, cashTransactionFilter.amountTo) &&
        Objects.equals(this.endDate, cashTransactionFilter.endDate) &&
        Objects.equals(this.startDate, cashTransactionFilter.startDate) &&
        Objects.equals(this.transactionTypeCode, cashTransactionFilter.transactionTypeCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalReference, amountFrom, amountTo, endDate, startDate, transactionTypeCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashTransactionFilter {\n");
    
    sb.append("    additionalReference: ").append(toIndentedString(additionalReference)).append("\n");
    sb.append("    amountFrom: ").append(toIndentedString(amountFrom)).append("\n");
    sb.append("    amountTo: ").append(toIndentedString(amountTo)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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

