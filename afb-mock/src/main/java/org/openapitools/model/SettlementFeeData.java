package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contains data about fees associated to the {Settlement}
 */
@ApiModel(description = "Contains data about fees associated to the {Settlement}")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SettlementFeeData   {
  @JsonProperty("amount")
  private Double amount = null;

  @JsonProperty("appliedDealingFundHouseFee")
  private Double appliedDealingFundHouseFee = null;

  @JsonProperty("feePerDealingInstrument")
  private Double feePerDealingInstrument = null;

  public SettlementFeeData amount(Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Fee amount associated to the {Settlement} expressed in the {Settlement}'s {SettlementBasicData.currencyCode}
   * @return amount
  **/
  @ApiModelProperty(value = "Fee amount associated to the {Settlement} expressed in the {Settlement}'s {SettlementBasicData.currencyCode}")


  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public SettlementFeeData appliedDealingFundHouseFee(Double appliedDealingFundHouseFee) {
    this.appliedDealingFundHouseFee = appliedDealingFundHouseFee;
    return this;
  }

  /**
   * The {DealingFundHouse} fee amount associated to the {Settlement} expressed in the {Settlement}'s {SettlementBasicData.currencyCode}
   * @return appliedDealingFundHouseFee
  **/
  @ApiModelProperty(value = "The {DealingFundHouse} fee amount associated to the {Settlement} expressed in the {Settlement}'s {SettlementBasicData.currencyCode}")


  public Double getAppliedDealingFundHouseFee() {
    return appliedDealingFundHouseFee;
  }

  public void setAppliedDealingFundHouseFee(Double appliedDealingFundHouseFee) {
    this.appliedDealingFundHouseFee = appliedDealingFundHouseFee;
  }

  public SettlementFeeData feePerDealingInstrument(Double feePerDealingInstrument) {
    this.feePerDealingInstrument = feePerDealingInstrument;
    return this;
  }

  /**
   * The {DealingInstrument} fee amount associated to the {Settlement} expressed in the {Settlement}'s {SettlementBasicData.currencyCode}
   * @return feePerDealingInstrument
  **/
  @ApiModelProperty(value = "The {DealingInstrument} fee amount associated to the {Settlement} expressed in the {Settlement}'s {SettlementBasicData.currencyCode}")


  public Double getFeePerDealingInstrument() {
    return feePerDealingInstrument;
  }

  public void setFeePerDealingInstrument(Double feePerDealingInstrument) {
    this.feePerDealingInstrument = feePerDealingInstrument;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettlementFeeData settlementFeeData = (SettlementFeeData) o;
    return Objects.equals(this.amount, settlementFeeData.amount) &&
        Objects.equals(this.appliedDealingFundHouseFee, settlementFeeData.appliedDealingFundHouseFee) &&
        Objects.equals(this.feePerDealingInstrument, settlementFeeData.feePerDealingInstrument);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, appliedDealingFundHouseFee, feePerDealingInstrument);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettlementFeeData {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    appliedDealingFundHouseFee: ").append(toIndentedString(appliedDealingFundHouseFee)).append("\n");
    sb.append("    feePerDealingInstrument: ").append(toIndentedString(feePerDealingInstrument)).append("\n");
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

