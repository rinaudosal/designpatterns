package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This object keeps specific information about different amounts associated to the order. All expressed in {Order.currencyCode}
 */
@ApiModel(description = "This object keeps specific information about different amounts associated to the order. All expressed in {Order.currencyCode}")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class OrderAmountData   {
  @JsonProperty("awardedGrossAmount")
  private Double awardedGrossAmount = null;

  @JsonProperty("awardedGrossAmountInLocalCurrency")
  private Double awardedGrossAmountInLocalCurrency = null;

  @JsonProperty("requestedGrossAmount")
  private Double requestedGrossAmount = null;

  public OrderAmountData awardedGrossAmount(Double awardedGrossAmount) {
    this.awardedGrossAmount = awardedGrossAmount;
    return this;
  }

  /**
   * Awarded gross amount assigned to the {Order}. Expressed in {Order.currencyCode}
   * @return awardedGrossAmount
  **/
  @ApiModelProperty(value = "Awarded gross amount assigned to the {Order}. Expressed in {Order.currencyCode}")


  public Double getAwardedGrossAmount() {
    return awardedGrossAmount;
  }

  public void setAwardedGrossAmount(Double awardedGrossAmount) {
    this.awardedGrossAmount = awardedGrossAmount;
  }

  public OrderAmountData awardedGrossAmountInLocalCurrency(Double awardedGrossAmountInLocalCurrency) {
    this.awardedGrossAmountInLocalCurrency = awardedGrossAmountInLocalCurrency;
    return this;
  }

  /**
   * Awarded gross amount assigned to the {Order}. Expressed in {Order.localCurrencyCode}
   * @return awardedGrossAmountInLocalCurrency
  **/
  @ApiModelProperty(value = "Awarded gross amount assigned to the {Order}. Expressed in {Order.localCurrencyCode}")


  public Double getAwardedGrossAmountInLocalCurrency() {
    return awardedGrossAmountInLocalCurrency;
  }

  public void setAwardedGrossAmountInLocalCurrency(Double awardedGrossAmountInLocalCurrency) {
    this.awardedGrossAmountInLocalCurrency = awardedGrossAmountInLocalCurrency;
  }

  public OrderAmountData requestedGrossAmount(Double requestedGrossAmount) {
    this.requestedGrossAmount = requestedGrossAmount;
    return this;
  }

  /**
   * Gross amount requested in the {Order}. Expressed in {Order.localCurrencyCode}
   * @return requestedGrossAmount
  **/
  @ApiModelProperty(value = "Gross amount requested in the {Order}. Expressed in {Order.localCurrencyCode}")


  public Double getRequestedGrossAmount() {
    return requestedGrossAmount;
  }

  public void setRequestedGrossAmount(Double requestedGrossAmount) {
    this.requestedGrossAmount = requestedGrossAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderAmountData orderAmountData = (OrderAmountData) o;
    return Objects.equals(this.awardedGrossAmount, orderAmountData.awardedGrossAmount) &&
        Objects.equals(this.awardedGrossAmountInLocalCurrency, orderAmountData.awardedGrossAmountInLocalCurrency) &&
        Objects.equals(this.requestedGrossAmount, orderAmountData.requestedGrossAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awardedGrossAmount, awardedGrossAmountInLocalCurrency, requestedGrossAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderAmountData {\n");
    
    sb.append("    awardedGrossAmount: ").append(toIndentedString(awardedGrossAmount)).append("\n");
    sb.append("    awardedGrossAmountInLocalCurrency: ").append(toIndentedString(awardedGrossAmountInLocalCurrency)).append("\n");
    sb.append("    requestedGrossAmount: ").append(toIndentedString(requestedGrossAmount)).append("\n");
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

