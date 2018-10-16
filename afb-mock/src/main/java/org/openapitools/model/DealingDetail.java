package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DealingDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class DealingDetail   {
  @JsonProperty("byAmount")
  private Boolean byAmount = null;

  @JsonProperty("byShares")
  private Boolean byShares = null;

  @JsonProperty("dealingCutoffTime")
  private String dealingCutoffTime = null;

  @JsonProperty("dealingFrequencyCode")
  private String dealingFrequencyCode = null;

  @JsonProperty("orderPrenotification")
  private String orderPrenotification = null;

  @JsonProperty("recalculation")
  private Boolean recalculation = null;

  @JsonProperty("roundingAmountCode")
  private String roundingAmountCode = null;

  @JsonProperty("roundingUnitSharesCode")
  private String roundingUnitSharesCode = null;

  @JsonProperty("settlementPeriod")
  private String settlementPeriod = null;

  public DealingDetail byAmount(Boolean byAmount) {
    this.byAmount = byAmount;
    return this;
  }

  /**
   * Get byAmount
   * @return byAmount
  **/
  @ApiModelProperty(value = "")


  public Boolean getByAmount() {
    return byAmount;
  }

  public void setByAmount(Boolean byAmount) {
    this.byAmount = byAmount;
  }

  public DealingDetail byShares(Boolean byShares) {
    this.byShares = byShares;
    return this;
  }

  /**
   * Get byShares
   * @return byShares
  **/
  @ApiModelProperty(value = "")


  public Boolean getByShares() {
    return byShares;
  }

  public void setByShares(Boolean byShares) {
    this.byShares = byShares;
  }

  public DealingDetail dealingCutoffTime(String dealingCutoffTime) {
    this.dealingCutoffTime = dealingCutoffTime;
    return this;
  }

  /**
   * Times are expressed in Central European Time(CET) 24H format (hh:mm) where \"hh\" represents the hours and \"mm\" the minutes
   * @return dealingCutoffTime
  **/
  @ApiModelProperty(value = "Times are expressed in Central European Time(CET) 24H format (hh:mm) where \"hh\" represents the hours and \"mm\" the minutes")


  public String getDealingCutoffTime() {
    return dealingCutoffTime;
  }

  public void setDealingCutoffTime(String dealingCutoffTime) {
    this.dealingCutoffTime = dealingCutoffTime;
  }

  public DealingDetail dealingFrequencyCode(String dealingFrequencyCode) {
    this.dealingFrequencyCode = dealingFrequencyCode;
    return this;
  }

  /**
   * Refer to {listFrequencies}
   * @return dealingFrequencyCode
  **/
  @ApiModelProperty(value = "Refer to {listFrequencies}")


  public String getDealingFrequencyCode() {
    return dealingFrequencyCode;
  }

  public void setDealingFrequencyCode(String dealingFrequencyCode) {
    this.dealingFrequencyCode = dealingFrequencyCode;
  }

  public DealingDetail orderPrenotification(String orderPrenotification) {
    this.orderPrenotification = orderPrenotification;
    return this;
  }

  /**
   * Get orderPrenotification
   * @return orderPrenotification
  **/
  @ApiModelProperty(value = "")


  public String getOrderPrenotification() {
    return orderPrenotification;
  }

  public void setOrderPrenotification(String orderPrenotification) {
    this.orderPrenotification = orderPrenotification;
  }

  public DealingDetail recalculation(Boolean recalculation) {
    this.recalculation = recalculation;
    return this;
  }

  /**
   * Get recalculation
   * @return recalculation
  **/
  @ApiModelProperty(value = "")


  public Boolean getRecalculation() {
    return recalculation;
  }

  public void setRecalculation(Boolean recalculation) {
    this.recalculation = recalculation;
  }

  public DealingDetail roundingAmountCode(String roundingAmountCode) {
    this.roundingAmountCode = roundingAmountCode;
    return this;
  }

  /**
   * Refer to {listRoundingTypes}
   * @return roundingAmountCode
  **/
  @ApiModelProperty(value = "Refer to {listRoundingTypes}")


  public String getRoundingAmountCode() {
    return roundingAmountCode;
  }

  public void setRoundingAmountCode(String roundingAmountCode) {
    this.roundingAmountCode = roundingAmountCode;
  }

  public DealingDetail roundingUnitSharesCode(String roundingUnitSharesCode) {
    this.roundingUnitSharesCode = roundingUnitSharesCode;
    return this;
  }

  /**
   * Refer to {listRoundingTypes}
   * @return roundingUnitSharesCode
  **/
  @ApiModelProperty(value = "Refer to {listRoundingTypes}")


  public String getRoundingUnitSharesCode() {
    return roundingUnitSharesCode;
  }

  public void setRoundingUnitSharesCode(String roundingUnitSharesCode) {
    this.roundingUnitSharesCode = roundingUnitSharesCode;
  }

  public DealingDetail settlementPeriod(String settlementPeriod) {
    this.settlementPeriod = settlementPeriod;
    return this;
  }

  /**
   * Get settlementPeriod
   * @return settlementPeriod
  **/
  @ApiModelProperty(value = "")


  public String getSettlementPeriod() {
    return settlementPeriod;
  }

  public void setSettlementPeriod(String settlementPeriod) {
    this.settlementPeriod = settlementPeriod;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DealingDetail dealingDetail = (DealingDetail) o;
    return Objects.equals(this.byAmount, dealingDetail.byAmount) &&
        Objects.equals(this.byShares, dealingDetail.byShares) &&
        Objects.equals(this.dealingCutoffTime, dealingDetail.dealingCutoffTime) &&
        Objects.equals(this.dealingFrequencyCode, dealingDetail.dealingFrequencyCode) &&
        Objects.equals(this.orderPrenotification, dealingDetail.orderPrenotification) &&
        Objects.equals(this.recalculation, dealingDetail.recalculation) &&
        Objects.equals(this.roundingAmountCode, dealingDetail.roundingAmountCode) &&
        Objects.equals(this.roundingUnitSharesCode, dealingDetail.roundingUnitSharesCode) &&
        Objects.equals(this.settlementPeriod, dealingDetail.settlementPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(byAmount, byShares, dealingCutoffTime, dealingFrequencyCode, orderPrenotification, recalculation, roundingAmountCode, roundingUnitSharesCode, settlementPeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DealingDetail {\n");
    
    sb.append("    byAmount: ").append(toIndentedString(byAmount)).append("\n");
    sb.append("    byShares: ").append(toIndentedString(byShares)).append("\n");
    sb.append("    dealingCutoffTime: ").append(toIndentedString(dealingCutoffTime)).append("\n");
    sb.append("    dealingFrequencyCode: ").append(toIndentedString(dealingFrequencyCode)).append("\n");
    sb.append("    orderPrenotification: ").append(toIndentedString(orderPrenotification)).append("\n");
    sb.append("    recalculation: ").append(toIndentedString(recalculation)).append("\n");
    sb.append("    roundingAmountCode: ").append(toIndentedString(roundingAmountCode)).append("\n");
    sb.append("    roundingUnitSharesCode: ").append(toIndentedString(roundingUnitSharesCode)).append("\n");
    sb.append("    settlementPeriod: ").append(toIndentedString(settlementPeriod)).append("\n");
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

