package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contains data about different amounts associated tothe {Transaction.transactionAmountData} that originated the {Settlement}
 */
@ApiModel(description = "Contains data about different amounts associated tothe {Transaction.transactionAmountData} that originated the {Settlement}")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SettlementAmountData   {
  @JsonProperty("awardedGrossAmount")
  private Double awardedGrossAmount = null;

  @JsonProperty("awardedNetAmount")
  private Double awardedNetAmount = null;

  @JsonProperty("requestedGrossAmount")
  private Double requestedGrossAmount = null;

  @JsonProperty("requestedNetAmount")
  private Double requestedNetAmount = null;

  @JsonProperty("settledAmount")
  private Double settledAmount = null;

  public SettlementAmountData awardedGrossAmount(Double awardedGrossAmount) {
    this.awardedGrossAmount = awardedGrossAmount;
    return this;
  }

  /**
   * Gross amount awarded in the {Settlement} expressed in the {Settlement}'s {SettlementBasicData.currencyCode}. This amount refers to {TransactionAmountData.awardedGrossAmount}
   * @return awardedGrossAmount
  **/
  @ApiModelProperty(value = "Gross amount awarded in the {Settlement} expressed in the {Settlement}'s {SettlementBasicData.currencyCode}. This amount refers to {TransactionAmountData.awardedGrossAmount}")


  public Double getAwardedGrossAmount() {
    return awardedGrossAmount;
  }

  public void setAwardedGrossAmount(Double awardedGrossAmount) {
    this.awardedGrossAmount = awardedGrossAmount;
  }

  public SettlementAmountData awardedNetAmount(Double awardedNetAmount) {
    this.awardedNetAmount = awardedNetAmount;
    return this;
  }

  /**
   * Net amount awarded in the {Settlement} expressed in the {Settlement}'s {SettlementBasicData.currencyCode}. This amount refers to {TransactionAmountData.awardedNetAmount}
   * @return awardedNetAmount
  **/
  @ApiModelProperty(value = "Net amount awarded in the {Settlement} expressed in the {Settlement}'s {SettlementBasicData.currencyCode}. This amount refers to {TransactionAmountData.awardedNetAmount}")


  public Double getAwardedNetAmount() {
    return awardedNetAmount;
  }

  public void setAwardedNetAmount(Double awardedNetAmount) {
    this.awardedNetAmount = awardedNetAmount;
  }

  public SettlementAmountData requestedGrossAmount(Double requestedGrossAmount) {
    this.requestedGrossAmount = requestedGrossAmount;
    return this;
  }

  /**
   * Gross amount requested in the {Settlement} expressed in the {Settlement}'s {SettlementBasicData.currencyCode}. This amount refers to {TransactionAmountData.requestedGrossAmount}
   * @return requestedGrossAmount
  **/
  @ApiModelProperty(value = "Gross amount requested in the {Settlement} expressed in the {Settlement}'s {SettlementBasicData.currencyCode}. This amount refers to {TransactionAmountData.requestedGrossAmount}")


  public Double getRequestedGrossAmount() {
    return requestedGrossAmount;
  }

  public void setRequestedGrossAmount(Double requestedGrossAmount) {
    this.requestedGrossAmount = requestedGrossAmount;
  }

  public SettlementAmountData requestedNetAmount(Double requestedNetAmount) {
    this.requestedNetAmount = requestedNetAmount;
    return this;
  }

  /**
   * Net amount requested in the {Settlement} expressed in the {Settlement}'s {SettlementBasicData.currencyCode}. This amount refers to {TransactionAmountData.requestedNetAmount}
   * @return requestedNetAmount
  **/
  @ApiModelProperty(value = "Net amount requested in the {Settlement} expressed in the {Settlement}'s {SettlementBasicData.currencyCode}. This amount refers to {TransactionAmountData.requestedNetAmount}")


  public Double getRequestedNetAmount() {
    return requestedNetAmount;
  }

  public void setRequestedNetAmount(Double requestedNetAmount) {
    this.requestedNetAmount = requestedNetAmount;
  }

  public SettlementAmountData settledAmount(Double settledAmount) {
    this.settledAmount = settledAmount;
    return this;
  }

  /**
   * The settled amount  expressed in the {Settlement}'s {SettlementBasicData.currencyCode}. This amount refers to {TransactionAmountData.settledAmount}
   * @return settledAmount
  **/
  @ApiModelProperty(value = "The settled amount  expressed in the {Settlement}'s {SettlementBasicData.currencyCode}. This amount refers to {TransactionAmountData.settledAmount}")


  public Double getSettledAmount() {
    return settledAmount;
  }

  public void setSettledAmount(Double settledAmount) {
    this.settledAmount = settledAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettlementAmountData settlementAmountData = (SettlementAmountData) o;
    return Objects.equals(this.awardedGrossAmount, settlementAmountData.awardedGrossAmount) &&
        Objects.equals(this.awardedNetAmount, settlementAmountData.awardedNetAmount) &&
        Objects.equals(this.requestedGrossAmount, settlementAmountData.requestedGrossAmount) &&
        Objects.equals(this.requestedNetAmount, settlementAmountData.requestedNetAmount) &&
        Objects.equals(this.settledAmount, settlementAmountData.settledAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awardedGrossAmount, awardedNetAmount, requestedGrossAmount, requestedNetAmount, settledAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettlementAmountData {\n");
    
    sb.append("    awardedGrossAmount: ").append(toIndentedString(awardedGrossAmount)).append("\n");
    sb.append("    awardedNetAmount: ").append(toIndentedString(awardedNetAmount)).append("\n");
    sb.append("    requestedGrossAmount: ").append(toIndentedString(requestedGrossAmount)).append("\n");
    sb.append("    requestedNetAmount: ").append(toIndentedString(requestedNetAmount)).append("\n");
    sb.append("    settledAmount: ").append(toIndentedString(settledAmount)).append("\n");
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

