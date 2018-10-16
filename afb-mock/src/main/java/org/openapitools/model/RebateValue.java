package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RebateValue
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class RebateValue   {
  @JsonProperty("amount")
  private Double amount = null;

  @JsonProperty("currencyCode")
  private String currencyCode = null;

  @JsonProperty("date")
  private OffsetDateTime date = null;

  public RebateValue amount(Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Rebate amount
   * @return amount
  **/
  @ApiModelProperty(value = "Rebate amount")


  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public RebateValue currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * The currency to show the {Rebate}'s amount. Refer to {listCurrencies}
   * @return currencyCode
  **/
  @ApiModelProperty(value = "The currency to show the {Rebate}'s amount. Refer to {listCurrencies}")


  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public RebateValue date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

  /**
   * The {Rebate} valuation date
   * @return date
  **/
  @ApiModelProperty(value = "The {Rebate} valuation date")

  @Valid

  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RebateValue rebateValue = (RebateValue) o;
    return Objects.equals(this.amount, rebateValue.amount) &&
        Objects.equals(this.currencyCode, rebateValue.currencyCode) &&
        Objects.equals(this.date, rebateValue.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currencyCode, date);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RebateValue {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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

