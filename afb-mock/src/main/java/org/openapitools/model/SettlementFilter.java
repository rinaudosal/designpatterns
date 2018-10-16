package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SettlementFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SettlementFilter   {
  @JsonProperty("currencyCode")
  private String currencyCode = null;

  /**
   * The Id of the {Fund} or {ETF}
   */
  public enum DealingInstrumentTypeEnum {
    FUND("FUND"),
    
    ETF("ETF");

    private String value;

    DealingInstrumentTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DealingInstrumentTypeEnum fromValue(String text) {
      for (DealingInstrumentTypeEnum b : DealingInstrumentTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("dealingInstrumentType")
  private DealingInstrumentTypeEnum dealingInstrumentType = null;

  @JsonProperty("externalReference")
  private String externalReference = null;

  @JsonProperty("paymentFromDate")
  private OffsetDateTime paymentFromDate = null;

  @JsonProperty("paymentToDate")
  private OffsetDateTime paymentToDate = null;

  @JsonProperty("productId")
  private Long productId = null;

  @JsonProperty("settlementStatusCode")
  private String settlementStatusCode = null;

  @JsonProperty("settlementTransactionTypeCode")
  private String settlementTransactionTypeCode = null;

  @JsonProperty("transactionExternalReference")
  private String transactionExternalReference = null;

  public SettlementFilter currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * The {Settlement}'s currency. Refer to {listCurrencies}
   * @return currencyCode
  **/
  @ApiModelProperty(value = "The {Settlement}'s currency. Refer to {listCurrencies}")


  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public SettlementFilter dealingInstrumentType(DealingInstrumentTypeEnum dealingInstrumentType) {
    this.dealingInstrumentType = dealingInstrumentType;
    return this;
  }

  /**
   * The Id of the {Fund} or {ETF}
   * @return dealingInstrumentType
  **/
  @ApiModelProperty(value = "The Id of the {Fund} or {ETF}")


  public DealingInstrumentTypeEnum getDealingInstrumentType() {
    return dealingInstrumentType;
  }

  public void setDealingInstrumentType(DealingInstrumentTypeEnum dealingInstrumentType) {
    this.dealingInstrumentType = dealingInstrumentType;
  }

  public SettlementFilter externalReference(String externalReference) {
    this.externalReference = externalReference;
    return this;
  }

  /**
   * The {Settlement.SettlementBasicData.externalReference}.
   * @return externalReference
  **/
  @ApiModelProperty(value = "The {Settlement.SettlementBasicData.externalReference}.")


  public String getExternalReference() {
    return externalReference;
  }

  public void setExternalReference(String externalReference) {
    this.externalReference = externalReference;
  }

  public SettlementFilter paymentFromDate(OffsetDateTime paymentFromDate) {
    this.paymentFromDate = paymentFromDate;
    return this;
  }

  /**
   * The date used to search settlements with a {SettlementDateData.paymentDate} date after that this.
   * @return paymentFromDate
  **/
  @ApiModelProperty(value = "The date used to search settlements with a {SettlementDateData.paymentDate} date after that this.")

  @Valid

  public OffsetDateTime getPaymentFromDate() {
    return paymentFromDate;
  }

  public void setPaymentFromDate(OffsetDateTime paymentFromDate) {
    this.paymentFromDate = paymentFromDate;
  }

  public SettlementFilter paymentToDate(OffsetDateTime paymentToDate) {
    this.paymentToDate = paymentToDate;
    return this;
  }

  /**
   * The date used to search settlements with a {SettlementDateData.paymentDate} date before that this.
   * @return paymentToDate
  **/
  @ApiModelProperty(value = "The date used to search settlements with a {SettlementDateData.paymentDate} date before that this.")

  @Valid

  public OffsetDateTime getPaymentToDate() {
    return paymentToDate;
  }

  public void setPaymentToDate(OffsetDateTime paymentToDate) {
    this.paymentToDate = paymentToDate;
  }

  public SettlementFilter productId(Long productId) {
    this.productId = productId;
    return this;
  }

  /**
   * The Id of the {Product}
   * @return productId
  **/
  @ApiModelProperty(value = "The Id of the {Product}")


  public Long getProductId() {
    return productId;
  }

  public void setProductId(Long productId) {
    this.productId = productId;
  }

  public SettlementFilter settlementStatusCode(String settlementStatusCode) {
    this.settlementStatusCode = settlementStatusCode;
    return this;
  }

  /**
   * The {Settlement}'s status. Refer to {listSettlementStatuses}
   * @return settlementStatusCode
  **/
  @ApiModelProperty(value = "The {Settlement}'s status. Refer to {listSettlementStatuses}")


  public String getSettlementStatusCode() {
    return settlementStatusCode;
  }

  public void setSettlementStatusCode(String settlementStatusCode) {
    this.settlementStatusCode = settlementStatusCode;
  }

  public SettlementFilter settlementTransactionTypeCode(String settlementTransactionTypeCode) {
    this.settlementTransactionTypeCode = settlementTransactionTypeCode;
    return this;
  }

  /**
   * The settlement type. Refer to {listSettlementTransactionTypes}
   * @return settlementTransactionTypeCode
  **/
  @ApiModelProperty(value = "The settlement type. Refer to {listSettlementTransactionTypes}")


  public String getSettlementTransactionTypeCode() {
    return settlementTransactionTypeCode;
  }

  public void setSettlementTransactionTypeCode(String settlementTransactionTypeCode) {
    this.settlementTransactionTypeCode = settlementTransactionTypeCode;
  }

  public SettlementFilter transactionExternalReference(String transactionExternalReference) {
    this.transactionExternalReference = transactionExternalReference;
    return this;
  }

  /**
   * External reference of the {Transaction} associated to the {Settlement}.
   * @return transactionExternalReference
  **/
  @ApiModelProperty(value = "External reference of the {Transaction} associated to the {Settlement}.")


  public String getTransactionExternalReference() {
    return transactionExternalReference;
  }

  public void setTransactionExternalReference(String transactionExternalReference) {
    this.transactionExternalReference = transactionExternalReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettlementFilter settlementFilter = (SettlementFilter) o;
    return Objects.equals(this.currencyCode, settlementFilter.currencyCode) &&
        Objects.equals(this.dealingInstrumentType, settlementFilter.dealingInstrumentType) &&
        Objects.equals(this.externalReference, settlementFilter.externalReference) &&
        Objects.equals(this.paymentFromDate, settlementFilter.paymentFromDate) &&
        Objects.equals(this.paymentToDate, settlementFilter.paymentToDate) &&
        Objects.equals(this.productId, settlementFilter.productId) &&
        Objects.equals(this.settlementStatusCode, settlementFilter.settlementStatusCode) &&
        Objects.equals(this.settlementTransactionTypeCode, settlementFilter.settlementTransactionTypeCode) &&
        Objects.equals(this.transactionExternalReference, settlementFilter.transactionExternalReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, dealingInstrumentType, externalReference, paymentFromDate, paymentToDate, productId, settlementStatusCode, settlementTransactionTypeCode, transactionExternalReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettlementFilter {\n");
    
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    dealingInstrumentType: ").append(toIndentedString(dealingInstrumentType)).append("\n");
    sb.append("    externalReference: ").append(toIndentedString(externalReference)).append("\n");
    sb.append("    paymentFromDate: ").append(toIndentedString(paymentFromDate)).append("\n");
    sb.append("    paymentToDate: ").append(toIndentedString(paymentToDate)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    settlementStatusCode: ").append(toIndentedString(settlementStatusCode)).append("\n");
    sb.append("    settlementTransactionTypeCode: ").append(toIndentedString(settlementTransactionTypeCode)).append("\n");
    sb.append("    transactionExternalReference: ").append(toIndentedString(transactionExternalReference)).append("\n");
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

