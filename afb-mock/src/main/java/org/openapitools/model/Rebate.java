package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BasicRebate;
import org.openapitools.model.Price;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Rebate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class Rebate   {
  @JsonProperty("appliedDealingFundHouseFee")
  private Double appliedDealingFundHouseFee = null;

  @JsonProperty("aum")
  private Double aum = null;

  @JsonProperty("basicRebate")
  private BasicRebate basicRebate = null;

  @JsonProperty("basisPoints")
  private Double basisPoints = null;

  @JsonProperty("exchangeRateApplied")
  private Double exchangeRateApplied = null;

  @JsonProperty("price")
  private Price price = null;

  @JsonProperty("rebatePercentage")
  private Double rebatePercentage = null;

  @JsonProperty("shares")
  private Double shares = null;

  public Rebate appliedDealingFundHouseFee(Double appliedDealingFundHouseFee) {
    this.appliedDealingFundHouseFee = appliedDealingFundHouseFee;
    return this;
  }

  /**
   * The amount of the {DealingFundHouse}'s fee applied. It is expressed in the {Rebate.value}'s {RebateValue.currencyCode}.
   * @return appliedDealingFundHouseFee
  **/
  @ApiModelProperty(value = "The amount of the {DealingFundHouse}'s fee applied. It is expressed in the {Rebate.value}'s {RebateValue.currencyCode}.")


  public Double getAppliedDealingFundHouseFee() {
    return appliedDealingFundHouseFee;
  }

  public void setAppliedDealingFundHouseFee(Double appliedDealingFundHouseFee) {
    this.appliedDealingFundHouseFee = appliedDealingFundHouseFee;
  }

  public Rebate aum(Double aum) {
    this.aum = aum;
    return this;
  }

  /**
   * Aum associated to the rebat. It is expressed in the {Rebate.value}'s {RebateValue.currencyCode}.
   * @return aum
  **/
  @ApiModelProperty(value = "Aum associated to the rebat. It is expressed in the {Rebate.value}'s {RebateValue.currencyCode}.")


  public Double getAum() {
    return aum;
  }

  public void setAum(Double aum) {
    this.aum = aum;
  }

  public Rebate basicRebate(BasicRebate basicRebate) {
    this.basicRebate = basicRebate;
    return this;
  }

  /**
   * Get basicRebate
   * @return basicRebate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BasicRebate getBasicRebate() {
    return basicRebate;
  }

  public void setBasicRebate(BasicRebate basicRebate) {
    this.basicRebate = basicRebate;
  }

  public Rebate basisPoints(Double basisPoints) {
    this.basisPoints = basisPoints;
    return this;
  }

  /**
   * The {Rebate} basis points value (BPS)
   * @return basisPoints
  **/
  @ApiModelProperty(value = "The {Rebate} basis points value (BPS)")


  public Double getBasisPoints() {
    return basisPoints;
  }

  public void setBasisPoints(Double basisPoints) {
    this.basisPoints = basisPoints;
  }

  public Rebate exchangeRateApplied(Double exchangeRateApplied) {
    this.exchangeRateApplied = exchangeRateApplied;
    return this;
  }

  /**
   * Exchange rate applied to calculate the {Rebate}'s value. Refers to the attribute the {Rebate.value}'s {RebateValue.currencyCode}. The Exchange rate is always between `EUR` and the {Rebate.value}'s {RebateValue.currencyCode}.
   * @return exchangeRateApplied
  **/
  @ApiModelProperty(value = "Exchange rate applied to calculate the {Rebate}'s value. Refers to the attribute the {Rebate.value}'s {RebateValue.currencyCode}. The Exchange rate is always between `EUR` and the {Rebate.value}'s {RebateValue.currencyCode}.")


  public Double getExchangeRateApplied() {
    return exchangeRateApplied;
  }

  public void setExchangeRateApplied(Double exchangeRateApplied) {
    this.exchangeRateApplied = exchangeRateApplied;
  }

  public Rebate price(Price price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Price getPrice() {
    return price;
  }

  public void setPrice(Price price) {
    this.price = price;
  }

  public Rebate rebatePercentage(Double rebatePercentage) {
    this.rebatePercentage = rebatePercentage;
    return this;
  }

  /**
   * The value of the {Rebate} percentage
   * @return rebatePercentage
  **/
  @ApiModelProperty(value = "The value of the {Rebate} percentage")


  public Double getRebatePercentage() {
    return rebatePercentage;
  }

  public void setRebatePercentage(Double rebatePercentage) {
    this.rebatePercentage = rebatePercentage;
  }

  public Rebate shares(Double shares) {
    this.shares = shares;
    return this;
  }

  /**
   * Number of shares
   * @return shares
  **/
  @ApiModelProperty(value = "Number of shares")


  public Double getShares() {
    return shares;
  }

  public void setShares(Double shares) {
    this.shares = shares;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rebate rebate = (Rebate) o;
    return Objects.equals(this.appliedDealingFundHouseFee, rebate.appliedDealingFundHouseFee) &&
        Objects.equals(this.aum, rebate.aum) &&
        Objects.equals(this.basicRebate, rebate.basicRebate) &&
        Objects.equals(this.basisPoints, rebate.basisPoints) &&
        Objects.equals(this.exchangeRateApplied, rebate.exchangeRateApplied) &&
        Objects.equals(this.price, rebate.price) &&
        Objects.equals(this.rebatePercentage, rebate.rebatePercentage) &&
        Objects.equals(this.shares, rebate.shares);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appliedDealingFundHouseFee, aum, basicRebate, basisPoints, exchangeRateApplied, price, rebatePercentage, shares);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rebate {\n");
    
    sb.append("    appliedDealingFundHouseFee: ").append(toIndentedString(appliedDealingFundHouseFee)).append("\n");
    sb.append("    aum: ").append(toIndentedString(aum)).append("\n");
    sb.append("    basicRebate: ").append(toIndentedString(basicRebate)).append("\n");
    sb.append("    basisPoints: ").append(toIndentedString(basisPoints)).append("\n");
    sb.append("    exchangeRateApplied: ").append(toIndentedString(exchangeRateApplied)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    rebatePercentage: ").append(toIndentedString(rebatePercentage)).append("\n");
    sb.append("    shares: ").append(toIndentedString(shares)).append("\n");
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

