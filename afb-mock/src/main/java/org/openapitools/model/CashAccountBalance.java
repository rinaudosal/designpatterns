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
 * CashAccountBalance
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class CashAccountBalance   {
  @JsonProperty("endBalance")
  private Double endBalance = null;

  @JsonProperty("endDate")
  private OffsetDateTime endDate = null;

  @JsonProperty("startBalance")
  private Double startBalance = null;

  @JsonProperty("startDate")
  private OffsetDateTime startDate = null;

  public CashAccountBalance endBalance(Double endBalance) {
    this.endBalance = endBalance;
    return this;
  }

  /**
   * The End Balance of the {CashAccount} expressed in {CashAccount.currencyCode}
   * @return endBalance
  **/
  @ApiModelProperty(value = "The End Balance of the {CashAccount} expressed in {CashAccount.currencyCode}")


  public Double getEndBalance() {
    return endBalance;
  }

  public void setEndBalance(Double endBalance) {
    this.endBalance = endBalance;
  }

  public CashAccountBalance endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * End date of the period associated to the `CashAccountBalance`
   * @return endDate
  **/
  @ApiModelProperty(value = "End date of the period associated to the `CashAccountBalance`")

  @Valid

  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public CashAccountBalance startBalance(Double startBalance) {
    this.startBalance = startBalance;
    return this;
  }

  /**
   * The Start Balance of the {CashAccount} expressed in {CashAccount.currencyCode}
   * @return startBalance
  **/
  @ApiModelProperty(value = "The Start Balance of the {CashAccount} expressed in {CashAccount.currencyCode}")


  public Double getStartBalance() {
    return startBalance;
  }

  public void setStartBalance(Double startBalance) {
    this.startBalance = startBalance;
  }

  public CashAccountBalance startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Start date of the period associated to the `CashAccountBalance`
   * @return startDate
  **/
  @ApiModelProperty(value = "Start date of the period associated to the `CashAccountBalance`")

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
    CashAccountBalance cashAccountBalance = (CashAccountBalance) o;
    return Objects.equals(this.endBalance, cashAccountBalance.endBalance) &&
        Objects.equals(this.endDate, cashAccountBalance.endDate) &&
        Objects.equals(this.startBalance, cashAccountBalance.startBalance) &&
        Objects.equals(this.startDate, cashAccountBalance.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endBalance, endDate, startBalance, startDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashAccountBalance {\n");
    
    sb.append("    endBalance: ").append(toIndentedString(endBalance)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    startBalance: ").append(toIndentedString(startBalance)).append("\n");
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

