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
 * ConsolidatedRebateFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class ConsolidatedRebateFilter   {
  @JsonProperty("currencyCode")
  private String currencyCode = null;

  /**
   * Indicator to choose between {DealingInstrument} currency, payment currency or other, in which case the {ConsolidatedRebateFilter.currencyCode} must contain a valid currencyCode (see {listRebateCurrencies} for a list of valid {Rebate} currencies)
   */
  public enum CurrencyPolicyEnum {
    INSTRUMENT_CURRENCY("INSTRUMENT_CURRENCY"),
    
    PAYMENT_CURRENCY("PAYMENT_CURRENCY"),
    
    OTHER("OTHER");

    private String value;

    CurrencyPolicyEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CurrencyPolicyEnum fromValue(String text) {
      for (CurrencyPolicyEnum b : CurrencyPolicyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("currencyPolicy")
  private CurrencyPolicyEnum currencyPolicy = null;

  @JsonProperty("dealingFundHouseId")
  private Long dealingFundHouseId = null;

  @JsonProperty("dealingInstrumentId")
  private Long dealingInstrumentId = null;

  /**
   * Indicates whether the search will be on {Fund} or {ETF}
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

  @JsonProperty("endDate")
  private OffsetDateTime endDate = null;

  @JsonProperty("productId")
  private Long productId = null;

  @JsonProperty("startDate")
  private OffsetDateTime startDate = null;

  public ConsolidatedRebateFilter currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * The currency in which to express the {Rebate}. Only used if the value of {ConsolidatedRebateFilter.currencyPolicy} is `OTHER`.
   * @return currencyCode
  **/
  @ApiModelProperty(value = "The currency in which to express the {Rebate}. Only used if the value of {ConsolidatedRebateFilter.currencyPolicy} is `OTHER`.")


  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public ConsolidatedRebateFilter currencyPolicy(CurrencyPolicyEnum currencyPolicy) {
    this.currencyPolicy = currencyPolicy;
    return this;
  }

  /**
   * Indicator to choose between {DealingInstrument} currency, payment currency or other, in which case the {ConsolidatedRebateFilter.currencyCode} must contain a valid currencyCode (see {listRebateCurrencies} for a list of valid {Rebate} currencies)
   * @return currencyPolicy
  **/
  @ApiModelProperty(value = "Indicator to choose between {DealingInstrument} currency, payment currency or other, in which case the {ConsolidatedRebateFilter.currencyCode} must contain a valid currencyCode (see {listRebateCurrencies} for a list of valid {Rebate} currencies)")


  public CurrencyPolicyEnum getCurrencyPolicy() {
    return currencyPolicy;
  }

  public void setCurrencyPolicy(CurrencyPolicyEnum currencyPolicy) {
    this.currencyPolicy = currencyPolicy;
  }

  public ConsolidatedRebateFilter dealingFundHouseId(Long dealingFundHouseId) {
    this.dealingFundHouseId = dealingFundHouseId;
    return this;
  }

  /**
   * The Id of the {DealingFundHouse}
   * @return dealingFundHouseId
  **/
  @ApiModelProperty(value = "The Id of the {DealingFundHouse}")


  public Long getDealingFundHouseId() {
    return dealingFundHouseId;
  }

  public void setDealingFundHouseId(Long dealingFundHouseId) {
    this.dealingFundHouseId = dealingFundHouseId;
  }

  public ConsolidatedRebateFilter dealingInstrumentId(Long dealingInstrumentId) {
    this.dealingInstrumentId = dealingInstrumentId;
    return this;
  }

  /**
   * The Id of the {DealingInstrument}
   * @return dealingInstrumentId
  **/
  @ApiModelProperty(value = "The Id of the {DealingInstrument}")


  public Long getDealingInstrumentId() {
    return dealingInstrumentId;
  }

  public void setDealingInstrumentId(Long dealingInstrumentId) {
    this.dealingInstrumentId = dealingInstrumentId;
  }

  public ConsolidatedRebateFilter dealingInstrumentType(DealingInstrumentTypeEnum dealingInstrumentType) {
    this.dealingInstrumentType = dealingInstrumentType;
    return this;
  }

  /**
   * Indicates whether the search will be on {Fund} or {ETF}
   * @return dealingInstrumentType
  **/
  @ApiModelProperty(value = "Indicates whether the search will be on {Fund} or {ETF}")


  public DealingInstrumentTypeEnum getDealingInstrumentType() {
    return dealingInstrumentType;
  }

  public void setDealingInstrumentType(DealingInstrumentTypeEnum dealingInstrumentType) {
    this.dealingInstrumentType = dealingInstrumentType;
  }

  public ConsolidatedRebateFilter endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * The higher limit to search rebates. Refer to {Rebate.valueDate}.
   * @return endDate
  **/
  @ApiModelProperty(value = "The higher limit to search rebates. Refer to {Rebate.valueDate}.")

  @Valid

  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public ConsolidatedRebateFilter productId(Long productId) {
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

  public ConsolidatedRebateFilter startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * The lower limit to search rebates. Refer to {Rebate.valueDate}.
   * @return startDate
  **/
  @ApiModelProperty(value = "The lower limit to search rebates. Refer to {Rebate.valueDate}.")

  @Valid

  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsolidatedRebateFilter consolidatedRebateFilter = (ConsolidatedRebateFilter) o;
    return Objects.equals(this.currencyCode, consolidatedRebateFilter.currencyCode) &&
        Objects.equals(this.currencyPolicy, consolidatedRebateFilter.currencyPolicy) &&
        Objects.equals(this.dealingFundHouseId, consolidatedRebateFilter.dealingFundHouseId) &&
        Objects.equals(this.dealingInstrumentId, consolidatedRebateFilter.dealingInstrumentId) &&
        Objects.equals(this.dealingInstrumentType, consolidatedRebateFilter.dealingInstrumentType) &&
        Objects.equals(this.endDate, consolidatedRebateFilter.endDate) &&
        Objects.equals(this.productId, consolidatedRebateFilter.productId) &&
        Objects.equals(this.startDate, consolidatedRebateFilter.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, currencyPolicy, dealingFundHouseId, dealingInstrumentId, dealingInstrumentType, endDate, productId, startDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsolidatedRebateFilter {\n");
    
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    currencyPolicy: ").append(toIndentedString(currencyPolicy)).append("\n");
    sb.append("    dealingFundHouseId: ").append(toIndentedString(dealingFundHouseId)).append("\n");
    sb.append("    dealingInstrumentId: ").append(toIndentedString(dealingInstrumentId)).append("\n");
    sb.append("    dealingInstrumentType: ").append(toIndentedString(dealingInstrumentType)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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

