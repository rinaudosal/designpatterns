package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Price;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This object keeps specific information about transactions which include a prepaid amounts
 */
@ApiModel(description = "This object keeps specific information about transactions which include a prepaid amounts")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class TransactionPrepaidData   {
  @JsonProperty("estimatedPriceApplied")
  private Price estimatedPriceApplied = null;

  @JsonProperty("prepaidAmount")
  private Double prepaidAmount = null;

  public TransactionPrepaidData estimatedPriceApplied(Price estimatedPriceApplied) {
    this.estimatedPriceApplied = estimatedPriceApplied;
    return this;
  }

  /**
   * Get estimatedPriceApplied
   * @return estimatedPriceApplied
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Price getEstimatedPriceApplied() {
    return estimatedPriceApplied;
  }

  public void setEstimatedPriceApplied(Price estimatedPriceApplied) {
    this.estimatedPriceApplied = estimatedPriceApplied;
  }

  public TransactionPrepaidData prepaidAmount(Double prepaidAmount) {
    this.prepaidAmount = prepaidAmount;
    return this;
  }

  /**
   * Prepaid amount
   * @return prepaidAmount
  **/
  @ApiModelProperty(value = "Prepaid amount")


  public Double getPrepaidAmount() {
    return prepaidAmount;
  }

  public void setPrepaidAmount(Double prepaidAmount) {
    this.prepaidAmount = prepaidAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionPrepaidData transactionPrepaidData = (TransactionPrepaidData) o;
    return Objects.equals(this.estimatedPriceApplied, transactionPrepaidData.estimatedPriceApplied) &&
        Objects.equals(this.prepaidAmount, transactionPrepaidData.prepaidAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(estimatedPriceApplied, prepaidAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionPrepaidData {\n");
    
    sb.append("    estimatedPriceApplied: ").append(toIndentedString(estimatedPriceApplied)).append("\n");
    sb.append("    prepaidAmount: ").append(toIndentedString(prepaidAmount)).append("\n");
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

