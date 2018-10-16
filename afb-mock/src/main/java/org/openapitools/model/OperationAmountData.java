package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This object keeps specific information about different amounts associated to the {Operation}. All expressed in {Operation.currencyCode}
 */
@ApiModel(description = "This object keeps specific information about different amounts associated to the {Operation}. All expressed in {Operation.currencyCode}")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class OperationAmountData   {
  @JsonProperty("requestedGrossAmount")
  private Double requestedGrossAmount = null;

  @JsonProperty("requestedNetAmount")
  private Double requestedNetAmount = null;

  public OperationAmountData requestedGrossAmount(Double requestedGrossAmount) {
    this.requestedGrossAmount = requestedGrossAmount;
    return this;
  }

  /**
   * Gross amount requested in the {Operation}
   * @return requestedGrossAmount
  **/
  @ApiModelProperty(value = "Gross amount requested in the {Operation}")


  public Double getRequestedGrossAmount() {
    return requestedGrossAmount;
  }

  public void setRequestedGrossAmount(Double requestedGrossAmount) {
    this.requestedGrossAmount = requestedGrossAmount;
  }

  public OperationAmountData requestedNetAmount(Double requestedNetAmount) {
    this.requestedNetAmount = requestedNetAmount;
    return this;
  }

  /**
   * Net amount requested in the {Operation}
   * @return requestedNetAmount
  **/
  @ApiModelProperty(value = "Net amount requested in the {Operation}")


  public Double getRequestedNetAmount() {
    return requestedNetAmount;
  }

  public void setRequestedNetAmount(Double requestedNetAmount) {
    this.requestedNetAmount = requestedNetAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationAmountData operationAmountData = (OperationAmountData) o;
    return Objects.equals(this.requestedGrossAmount, operationAmountData.requestedGrossAmount) &&
        Objects.equals(this.requestedNetAmount, operationAmountData.requestedNetAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestedGrossAmount, requestedNetAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationAmountData {\n");
    
    sb.append("    requestedGrossAmount: ").append(toIndentedString(requestedGrossAmount)).append("\n");
    sb.append("    requestedNetAmount: ").append(toIndentedString(requestedNetAmount)).append("\n");
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

