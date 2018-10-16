package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MinimunInvestmet
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class MinimunInvestmet   {
  @JsonProperty("amount")
  private Double amount = null;

  @JsonProperty("unitShares")
  private Double unitShares = null;

  public MinimunInvestmet amount(Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * This amount is expresed in {OperationalDetails.dealingCurrencyCode}
   * @return amount
  **/
  @ApiModelProperty(value = "This amount is expresed in {OperationalDetails.dealingCurrencyCode}")


  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public MinimunInvestmet unitShares(Double unitShares) {
    this.unitShares = unitShares;
    return this;
  }

  /**
   * Get unitShares
   * @return unitShares
  **/
  @ApiModelProperty(value = "")


  public Double getUnitShares() {
    return unitShares;
  }

  public void setUnitShares(Double unitShares) {
    this.unitShares = unitShares;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MinimunInvestmet minimunInvestmet = (MinimunInvestmet) o;
    return Objects.equals(this.amount, minimunInvestmet.amount) &&
        Objects.equals(this.unitShares, minimunInvestmet.unitShares);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, unitShares);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MinimunInvestmet {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    unitShares: ").append(toIndentedString(unitShares)).append("\n");
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

