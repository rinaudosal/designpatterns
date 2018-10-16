package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Distribution;
import org.openapitools.model.RedemptionDetail;
import org.openapitools.model.SubscriptionDetail;
import org.openapitools.model.WhiteListItem;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OperationalDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class OperationalDetails   {
  @JsonProperty("cashAmountDecimalPlaces")
  private Integer cashAmountDecimalPlaces = null;

  @JsonProperty("dealingCurrencyCode")
  private String dealingCurrencyCode = null;

  @JsonProperty("distribution")
  private Distribution distribution = null;

  /**
   * Gets or Sets historicOrForwardPricing
   */
  public enum HistoricOrForwardPricingEnum {
    HISTORIC("HISTORIC"),
    
    FORWARD("FORWARD");

    private String value;

    HistoricOrForwardPricingEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static HistoricOrForwardPricingEnum fromValue(String text) {
      for (HistoricOrForwardPricingEnum b : HistoricOrForwardPricingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("historicOrForwardPricing")
  private HistoricOrForwardPricingEnum historicOrForwardPricing = null;

  @JsonProperty("pricesDecimalPlaces")
  private Integer pricesDecimalPlaces = null;

  /**
   * Gets or Sets pricingType
   */
  public enum PricingTypeEnum {
    SINGLE("SINGLE"),
    
    DUAL("DUAL");

    private String value;

    PricingTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PricingTypeEnum fromValue(String text) {
      for (PricingTypeEnum b : PricingTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("pricingType")
  private PricingTypeEnum pricingType = null;

  @JsonProperty("redemptionDetail")
  private RedemptionDetail redemptionDetail = null;

  @JsonProperty("subscriptionDetail")
  private SubscriptionDetail subscriptionDetail = null;

  /**
   * Gets or Sets subscriptionType
   */
  public enum SubscriptionTypeEnum {
    NA("NA"),
    
    AMOUNT("AMOUNT"),
    
    SHARES("SHARES");

    private String value;

    SubscriptionTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SubscriptionTypeEnum fromValue(String text) {
      for (SubscriptionTypeEnum b : SubscriptionTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("subscriptionType")
  private SubscriptionTypeEnum subscriptionType = null;

  @JsonProperty("unitSharesDecimalPlaces")
  private Integer unitSharesDecimalPlaces = null;

  @JsonProperty("whiteList")
  @Valid
  private List<WhiteListItem> whiteList = null;

  public OperationalDetails cashAmountDecimalPlaces(Integer cashAmountDecimalPlaces) {
    this.cashAmountDecimalPlaces = cashAmountDecimalPlaces;
    return this;
  }

  /**
   * Get cashAmountDecimalPlaces
   * @return cashAmountDecimalPlaces
  **/
  @ApiModelProperty(value = "")


  public Integer getCashAmountDecimalPlaces() {
    return cashAmountDecimalPlaces;
  }

  public void setCashAmountDecimalPlaces(Integer cashAmountDecimalPlaces) {
    this.cashAmountDecimalPlaces = cashAmountDecimalPlaces;
  }

  public OperationalDetails dealingCurrencyCode(String dealingCurrencyCode) {
    this.dealingCurrencyCode = dealingCurrencyCode;
    return this;
  }

  /**
   * The {Fund}'s dealing currency. Refer to {listCurrencies}
   * @return dealingCurrencyCode
  **/
  @ApiModelProperty(value = "The {Fund}'s dealing currency. Refer to {listCurrencies}")


  public String getDealingCurrencyCode() {
    return dealingCurrencyCode;
  }

  public void setDealingCurrencyCode(String dealingCurrencyCode) {
    this.dealingCurrencyCode = dealingCurrencyCode;
  }

  public OperationalDetails distribution(Distribution distribution) {
    this.distribution = distribution;
    return this;
  }

  /**
   * Get distribution
   * @return distribution
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Distribution getDistribution() {
    return distribution;
  }

  public void setDistribution(Distribution distribution) {
    this.distribution = distribution;
  }

  public OperationalDetails historicOrForwardPricing(HistoricOrForwardPricingEnum historicOrForwardPricing) {
    this.historicOrForwardPricing = historicOrForwardPricing;
    return this;
  }

  /**
   * Get historicOrForwardPricing
   * @return historicOrForwardPricing
  **/
  @ApiModelProperty(value = "")


  public HistoricOrForwardPricingEnum getHistoricOrForwardPricing() {
    return historicOrForwardPricing;
  }

  public void setHistoricOrForwardPricing(HistoricOrForwardPricingEnum historicOrForwardPricing) {
    this.historicOrForwardPricing = historicOrForwardPricing;
  }

  public OperationalDetails pricesDecimalPlaces(Integer pricesDecimalPlaces) {
    this.pricesDecimalPlaces = pricesDecimalPlaces;
    return this;
  }

  /**
   * Get pricesDecimalPlaces
   * @return pricesDecimalPlaces
  **/
  @ApiModelProperty(value = "")


  public Integer getPricesDecimalPlaces() {
    return pricesDecimalPlaces;
  }

  public void setPricesDecimalPlaces(Integer pricesDecimalPlaces) {
    this.pricesDecimalPlaces = pricesDecimalPlaces;
  }

  public OperationalDetails pricingType(PricingTypeEnum pricingType) {
    this.pricingType = pricingType;
    return this;
  }

  /**
   * Get pricingType
   * @return pricingType
  **/
  @ApiModelProperty(value = "")


  public PricingTypeEnum getPricingType() {
    return pricingType;
  }

  public void setPricingType(PricingTypeEnum pricingType) {
    this.pricingType = pricingType;
  }

  public OperationalDetails redemptionDetail(RedemptionDetail redemptionDetail) {
    this.redemptionDetail = redemptionDetail;
    return this;
  }

  /**
   * Get redemptionDetail
   * @return redemptionDetail
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RedemptionDetail getRedemptionDetail() {
    return redemptionDetail;
  }

  public void setRedemptionDetail(RedemptionDetail redemptionDetail) {
    this.redemptionDetail = redemptionDetail;
  }

  public OperationalDetails subscriptionDetail(SubscriptionDetail subscriptionDetail) {
    this.subscriptionDetail = subscriptionDetail;
    return this;
  }

  /**
   * Get subscriptionDetail
   * @return subscriptionDetail
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SubscriptionDetail getSubscriptionDetail() {
    return subscriptionDetail;
  }

  public void setSubscriptionDetail(SubscriptionDetail subscriptionDetail) {
    this.subscriptionDetail = subscriptionDetail;
  }

  public OperationalDetails subscriptionType(SubscriptionTypeEnum subscriptionType) {
    this.subscriptionType = subscriptionType;
    return this;
  }

  /**
   * Get subscriptionType
   * @return subscriptionType
  **/
  @ApiModelProperty(value = "")


  public SubscriptionTypeEnum getSubscriptionType() {
    return subscriptionType;
  }

  public void setSubscriptionType(SubscriptionTypeEnum subscriptionType) {
    this.subscriptionType = subscriptionType;
  }

  public OperationalDetails unitSharesDecimalPlaces(Integer unitSharesDecimalPlaces) {
    this.unitSharesDecimalPlaces = unitSharesDecimalPlaces;
    return this;
  }

  /**
   * Get unitSharesDecimalPlaces
   * @return unitSharesDecimalPlaces
  **/
  @ApiModelProperty(value = "")


  public Integer getUnitSharesDecimalPlaces() {
    return unitSharesDecimalPlaces;
  }

  public void setUnitSharesDecimalPlaces(Integer unitSharesDecimalPlaces) {
    this.unitSharesDecimalPlaces = unitSharesDecimalPlaces;
  }

  public OperationalDetails whiteList(List<WhiteListItem> whiteList) {
    this.whiteList = whiteList;
    return this;
  }

  public OperationalDetails addWhiteListItem(WhiteListItem whiteListItem) {
    if (this.whiteList == null) {
      this.whiteList = new ArrayList<>();
    }
    this.whiteList.add(whiteListItem);
    return this;
  }

  /**
   * The array of {WhiteListItem}, this attribute is always empty except for the Italian market.
   * @return whiteList
  **/
  @ApiModelProperty(value = "The array of {WhiteListItem}, this attribute is always empty except for the Italian market.")

  @Valid

  public List<WhiteListItem> getWhiteList() {
    return whiteList;
  }

  public void setWhiteList(List<WhiteListItem> whiteList) {
    this.whiteList = whiteList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationalDetails operationalDetails = (OperationalDetails) o;
    return Objects.equals(this.cashAmountDecimalPlaces, operationalDetails.cashAmountDecimalPlaces) &&
        Objects.equals(this.dealingCurrencyCode, operationalDetails.dealingCurrencyCode) &&
        Objects.equals(this.distribution, operationalDetails.distribution) &&
        Objects.equals(this.historicOrForwardPricing, operationalDetails.historicOrForwardPricing) &&
        Objects.equals(this.pricesDecimalPlaces, operationalDetails.pricesDecimalPlaces) &&
        Objects.equals(this.pricingType, operationalDetails.pricingType) &&
        Objects.equals(this.redemptionDetail, operationalDetails.redemptionDetail) &&
        Objects.equals(this.subscriptionDetail, operationalDetails.subscriptionDetail) &&
        Objects.equals(this.subscriptionType, operationalDetails.subscriptionType) &&
        Objects.equals(this.unitSharesDecimalPlaces, operationalDetails.unitSharesDecimalPlaces) &&
        Objects.equals(this.whiteList, operationalDetails.whiteList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cashAmountDecimalPlaces, dealingCurrencyCode, distribution, historicOrForwardPricing, pricesDecimalPlaces, pricingType, redemptionDetail, subscriptionDetail, subscriptionType, unitSharesDecimalPlaces, whiteList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationalDetails {\n");
    
    sb.append("    cashAmountDecimalPlaces: ").append(toIndentedString(cashAmountDecimalPlaces)).append("\n");
    sb.append("    dealingCurrencyCode: ").append(toIndentedString(dealingCurrencyCode)).append("\n");
    sb.append("    distribution: ").append(toIndentedString(distribution)).append("\n");
    sb.append("    historicOrForwardPricing: ").append(toIndentedString(historicOrForwardPricing)).append("\n");
    sb.append("    pricesDecimalPlaces: ").append(toIndentedString(pricesDecimalPlaces)).append("\n");
    sb.append("    pricingType: ").append(toIndentedString(pricingType)).append("\n");
    sb.append("    redemptionDetail: ").append(toIndentedString(redemptionDetail)).append("\n");
    sb.append("    subscriptionDetail: ").append(toIndentedString(subscriptionDetail)).append("\n");
    sb.append("    subscriptionType: ").append(toIndentedString(subscriptionType)).append("\n");
    sb.append("    unitSharesDecimalPlaces: ").append(toIndentedString(unitSharesDecimalPlaces)).append("\n");
    sb.append("    whiteList: ").append(toIndentedString(whiteList)).append("\n");
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

