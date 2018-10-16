package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This object keeps specific information about different amounts associated to the transaction. All expressed in {Transaction.currencyCode}
 */
@ApiModel(description = "This object keeps specific information about different amounts associated to the transaction. All expressed in {Transaction.currencyCode}")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class TransactionAmountData   {
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

  public TransactionAmountData awardedGrossAmount(Double awardedGrossAmount) {
    this.awardedGrossAmount = awardedGrossAmount;
    return this;
  }

  /**
   * Awarded gross amount assigned to the transaction
   * @return awardedGrossAmount
  **/
  @ApiModelProperty(value = "Awarded gross amount assigned to the transaction")


  public Double getAwardedGrossAmount() {
    return awardedGrossAmount;
  }

  public void setAwardedGrossAmount(Double awardedGrossAmount) {
    this.awardedGrossAmount = awardedGrossAmount;
  }

  public TransactionAmountData awardedNetAmount(Double awardedNetAmount) {
    this.awardedNetAmount = awardedNetAmount;
    return this;
  }

  /**
   * Awarded net amount assigned to the transaction
   * @return awardedNetAmount
  **/
  @ApiModelProperty(value = "Awarded net amount assigned to the transaction")


  public Double getAwardedNetAmount() {
    return awardedNetAmount;
  }

  public void setAwardedNetAmount(Double awardedNetAmount) {
    this.awardedNetAmount = awardedNetAmount;
  }

  public TransactionAmountData requestedGrossAmount(Double requestedGrossAmount) {
    this.requestedGrossAmount = requestedGrossAmount;
    return this;
  }

  /**
   * Gross amount requested in the transaction
   * @return requestedGrossAmount
  **/
  @ApiModelProperty(value = "Gross amount requested in the transaction")


  public Double getRequestedGrossAmount() {
    return requestedGrossAmount;
  }

  public void setRequestedGrossAmount(Double requestedGrossAmount) {
    this.requestedGrossAmount = requestedGrossAmount;
  }

  public TransactionAmountData requestedNetAmount(Double requestedNetAmount) {
    this.requestedNetAmount = requestedNetAmount;
    return this;
  }

  /**
   * Net amount requested in the transaction
   * @return requestedNetAmount
  **/
  @ApiModelProperty(value = "Net amount requested in the transaction")


  public Double getRequestedNetAmount() {
    return requestedNetAmount;
  }

  public void setRequestedNetAmount(Double requestedNetAmount) {
    this.requestedNetAmount = requestedNetAmount;
  }

  public TransactionAmountData settledAmount(Double settledAmount) {
    this.settledAmount = settledAmount;
    return this;
  }

  /**
   * Settled amount in payment currency
   * @return settledAmount
  **/
  @ApiModelProperty(value = "Settled amount in payment currency")


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
    TransactionAmountData transactionAmountData = (TransactionAmountData) o;
    return Objects.equals(this.awardedGrossAmount, transactionAmountData.awardedGrossAmount) &&
        Objects.equals(this.awardedNetAmount, transactionAmountData.awardedNetAmount) &&
        Objects.equals(this.requestedGrossAmount, transactionAmountData.requestedGrossAmount) &&
        Objects.equals(this.requestedNetAmount, transactionAmountData.requestedNetAmount) &&
        Objects.equals(this.settledAmount, transactionAmountData.settledAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awardedGrossAmount, awardedNetAmount, requestedGrossAmount, requestedNetAmount, settledAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionAmountData {\n");
    
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

