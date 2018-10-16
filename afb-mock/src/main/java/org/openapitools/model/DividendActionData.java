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
 * DividendActionData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class DividendActionData   {
  @JsonProperty("associatedTo")
  private String associatedTo = null;

  @JsonProperty("currencyCode")
  private String currencyCode = null;

  @JsonProperty("cutoffDate")
  private OffsetDateTime cutoffDate = null;

  @JsonProperty("dividendActionType")
  private String dividendActionType = null;

  @JsonProperty("dividendValue")
  private Double dividendValue = null;

  @JsonProperty("paymentDate")
  private OffsetDateTime paymentDate = null;

  @JsonProperty("retentionType")
  private String retentionType = null;

  @JsonProperty("settlementDate")
  private OffsetDateTime settlementDate = null;

  public DividendActionData associatedTo(String associatedTo) {
    this.associatedTo = associatedTo;
    return this;
  }

  /**
   * Refers to
   * @return associatedTo
  **/
  @ApiModelProperty(value = "Refers to")


  public String getAssociatedTo() {
    return associatedTo;
  }

  public void setAssociatedTo(String associatedTo) {
    this.associatedTo = associatedTo;
  }

  public DividendActionData currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * currency fund. Refer to {listCurrencies}
   * @return currencyCode
  **/
  @ApiModelProperty(value = "currency fund. Refer to {listCurrencies}")


  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public DividendActionData cutoffDate(OffsetDateTime cutoffDate) {
    this.cutoffDate = cutoffDate;
    return this;
  }

  /**
   * Get cutoffDate
   * @return cutoffDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getCutoffDate() {
    return cutoffDate;
  }

  public void setCutoffDate(OffsetDateTime cutoffDate) {
    this.cutoffDate = cutoffDate;
  }

  public DividendActionData dividendActionType(String dividendActionType) {
    this.dividendActionType = dividendActionType;
    return this;
  }

  /**
   * Divident type. E (estimation), D (definitive) and N (undefined)
   * @return dividendActionType
  **/
  @ApiModelProperty(value = "Divident type. E (estimation), D (definitive) and N (undefined)")


  public String getDividendActionType() {
    return dividendActionType;
  }

  public void setDividendActionType(String dividendActionType) {
    this.dividendActionType = dividendActionType;
  }

  public DividendActionData dividendValue(Double dividendValue) {
    this.dividendValue = dividendValue;
    return this;
  }

  /**
   * Get dividendValue
   * @return dividendValue
  **/
  @ApiModelProperty(value = "")


  public Double getDividendValue() {
    return dividendValue;
  }

  public void setDividendValue(Double dividendValue) {
    this.dividendValue = dividendValue;
  }

  public DividendActionData paymentDate(OffsetDateTime paymentDate) {
    this.paymentDate = paymentDate;
    return this;
  }

  /**
   * Get paymentDate
   * @return paymentDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getPaymentDate() {
    return paymentDate;
  }

  public void setPaymentDate(OffsetDateTime paymentDate) {
    this.paymentDate = paymentDate;
  }

  public DividendActionData retentionType(String retentionType) {
    this.retentionType = retentionType;
    return this;
  }

  /**
   * Gross or Net dividend in UK
   * @return retentionType
  **/
  @ApiModelProperty(value = "Gross or Net dividend in UK")


  public String getRetentionType() {
    return retentionType;
  }

  public void setRetentionType(String retentionType) {
    this.retentionType = retentionType;
  }

  public DividendActionData settlementDate(OffsetDateTime settlementDate) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DividendActionData dividendActionData = (DividendActionData) o;
    return Objects.equals(this.associatedTo, dividendActionData.associatedTo) &&
        Objects.equals(this.currencyCode, dividendActionData.currencyCode) &&
        Objects.equals(this.cutoffDate, dividendActionData.cutoffDate) &&
        Objects.equals(this.dividendActionType, dividendActionData.dividendActionType) &&
        Objects.equals(this.dividendValue, dividendActionData.dividendValue) &&
        Objects.equals(this.paymentDate, dividendActionData.paymentDate) &&
        Objects.equals(this.retentionType, dividendActionData.retentionType) &&
        Objects.equals(this.settlementDate, dividendActionData.settlementDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(associatedTo, currencyCode, cutoffDate, dividendActionType, dividendValue, paymentDate, retentionType, settlementDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DividendActionData {\n");
    
    sb.append("    associatedTo: ").append(toIndentedString(associatedTo)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    cutoffDate: ").append(toIndentedString(cutoffDate)).append("\n");
    sb.append("    dividendActionType: ").append(toIndentedString(dividendActionType)).append("\n");
    sb.append("    dividendValue: ").append(toIndentedString(dividendValue)).append("\n");
    sb.append("    paymentDate: ").append(toIndentedString(paymentDate)).append("\n");
    sb.append("    retentionType: ").append(toIndentedString(retentionType)).append("\n");
    sb.append("    settlementDate: ").append(toIndentedString(settlementDate)).append("\n");
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

