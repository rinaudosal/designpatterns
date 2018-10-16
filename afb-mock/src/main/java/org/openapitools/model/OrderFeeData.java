package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This object keeps specific information about fees applied to an oder. They are all expressed in {Order.currencyCode}
 */
@ApiModel(description = "This object keeps specific information about fees applied to an oder. They are all expressed in {Order.currencyCode}")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class OrderFeeData   {
  @JsonProperty("feePerDealingInstrument")
  private Double feePerDealingInstrument = null;

  @JsonProperty("firstOrderFeeAmount")
  private Double firstOrderFeeAmount = null;

  @JsonProperty("firstOrderFeePercentage")
  private Double firstOrderFeePercentage = null;

  @JsonProperty("secondOrderFeeAmount")
  private Double secondOrderFeeAmount = null;

  @JsonProperty("secondOrderFeePercentage")
  private Double secondOrderFeePercentage = null;

  public OrderFeeData feePerDealingInstrument(Double feePerDealingInstrument) {
    this.feePerDealingInstrument = feePerDealingInstrument;
    return this;
  }

  /**
   * Applied fee per {DealingInstrument}
   * @return feePerDealingInstrument
  **/
  @ApiModelProperty(value = "Applied fee per {DealingInstrument}")


  public Double getFeePerDealingInstrument() {
    return feePerDealingInstrument;
  }

  public void setFeePerDealingInstrument(Double feePerDealingInstrument) {
    this.feePerDealingInstrument = feePerDealingInstrument;
  }

  public OrderFeeData firstOrderFeeAmount(Double firstOrderFeeAmount) {
    this.firstOrderFeeAmount = firstOrderFeeAmount;
    return this;
  }

  /**
   * The amount of the first group of commission applied to the {Order} by the {Distributor}
   * @return firstOrderFeeAmount
  **/
  @ApiModelProperty(value = "The amount of the first group of commission applied to the {Order} by the {Distributor}")


  public Double getFirstOrderFeeAmount() {
    return firstOrderFeeAmount;
  }

  public void setFirstOrderFeeAmount(Double firstOrderFeeAmount) {
    this.firstOrderFeeAmount = firstOrderFeeAmount;
  }

  public OrderFeeData firstOrderFeePercentage(Double firstOrderFeePercentage) {
    this.firstOrderFeePercentage = firstOrderFeePercentage;
    return this;
  }

  /**
   * The percentage of the first group of commission applied to the {Order} by the {Distributor}
   * @return firstOrderFeePercentage
  **/
  @ApiModelProperty(value = "The percentage of the first group of commission applied to the {Order} by the {Distributor}")


  public Double getFirstOrderFeePercentage() {
    return firstOrderFeePercentage;
  }

  public void setFirstOrderFeePercentage(Double firstOrderFeePercentage) {
    this.firstOrderFeePercentage = firstOrderFeePercentage;
  }

  public OrderFeeData secondOrderFeeAmount(Double secondOrderFeeAmount) {
    this.secondOrderFeeAmount = secondOrderFeeAmount;
    return this;
  }

  /**
   * The amount of the second group of commission applied to the {Order} by the {Distributor}
   * @return secondOrderFeeAmount
  **/
  @ApiModelProperty(value = "The amount of the second group of commission applied to the {Order} by the {Distributor}")


  public Double getSecondOrderFeeAmount() {
    return secondOrderFeeAmount;
  }

  public void setSecondOrderFeeAmount(Double secondOrderFeeAmount) {
    this.secondOrderFeeAmount = secondOrderFeeAmount;
  }

  public OrderFeeData secondOrderFeePercentage(Double secondOrderFeePercentage) {
    this.secondOrderFeePercentage = secondOrderFeePercentage;
    return this;
  }

  /**
   * The percentage of the second group of commission applied to the {Order} by the {Distributor}
   * @return secondOrderFeePercentage
  **/
  @ApiModelProperty(value = "The percentage of the second group of commission applied to the {Order} by the {Distributor}")


  public Double getSecondOrderFeePercentage() {
    return secondOrderFeePercentage;
  }

  public void setSecondOrderFeePercentage(Double secondOrderFeePercentage) {
    this.secondOrderFeePercentage = secondOrderFeePercentage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderFeeData orderFeeData = (OrderFeeData) o;
    return Objects.equals(this.feePerDealingInstrument, orderFeeData.feePerDealingInstrument) &&
        Objects.equals(this.firstOrderFeeAmount, orderFeeData.firstOrderFeeAmount) &&
        Objects.equals(this.firstOrderFeePercentage, orderFeeData.firstOrderFeePercentage) &&
        Objects.equals(this.secondOrderFeeAmount, orderFeeData.secondOrderFeeAmount) &&
        Objects.equals(this.secondOrderFeePercentage, orderFeeData.secondOrderFeePercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feePerDealingInstrument, firstOrderFeeAmount, firstOrderFeePercentage, secondOrderFeeAmount, secondOrderFeePercentage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderFeeData {\n");
    
    sb.append("    feePerDealingInstrument: ").append(toIndentedString(feePerDealingInstrument)).append("\n");
    sb.append("    firstOrderFeeAmount: ").append(toIndentedString(firstOrderFeeAmount)).append("\n");
    sb.append("    firstOrderFeePercentage: ").append(toIndentedString(firstOrderFeePercentage)).append("\n");
    sb.append("    secondOrderFeeAmount: ").append(toIndentedString(secondOrderFeeAmount)).append("\n");
    sb.append("    secondOrderFeePercentage: ").append(toIndentedString(secondOrderFeePercentage)).append("\n");
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

