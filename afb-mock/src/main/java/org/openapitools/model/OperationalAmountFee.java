package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OperationalAmountFee
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class OperationalAmountFee   {
  @JsonProperty("amountFrom")
  private Double amountFrom = null;

  @JsonProperty("amountTo")
  private Double amountTo = null;

  @JsonProperty("percentage")
  private String percentage = null;

  public OperationalAmountFee amountFrom(Double amountFrom) {
    this.amountFrom = amountFrom;
    return this;
  }

  /**
   * Minimum amount of the {OperationalAmountFee}
   * @return amountFrom
  **/
  @ApiModelProperty(value = "Minimum amount of the {OperationalAmountFee}")


  public Double getAmountFrom() {
    return amountFrom;
  }

  public void setAmountFrom(Double amountFrom) {
    this.amountFrom = amountFrom;
  }

  public OperationalAmountFee amountTo(Double amountTo) {
    this.amountTo = amountTo;
    return this;
  }

  /**
   * Maximum amount of the {OperationalAmountFee}
   * @return amountTo
  **/
  @ApiModelProperty(value = "Maximum amount of the {OperationalAmountFee}")


  public Double getAmountTo() {
    return amountTo;
  }

  public void setAmountTo(Double amountTo) {
    this.amountTo = amountTo;
  }

  public OperationalAmountFee percentage(String percentage) {
    this.percentage = percentage;
    return this;
  }

  /**
   * Fee %
   * @return percentage
  **/
  @ApiModelProperty(value = "Fee %")


  public String getPercentage() {
    return percentage;
  }

  public void setPercentage(String percentage) {
    this.percentage = percentage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationalAmountFee operationalAmountFee = (OperationalAmountFee) o;
    return Objects.equals(this.amountFrom, operationalAmountFee.amountFrom) &&
        Objects.equals(this.amountTo, operationalAmountFee.amountTo) &&
        Objects.equals(this.percentage, operationalAmountFee.percentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountFrom, amountTo, percentage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationalAmountFee {\n");
    
    sb.append("    amountFrom: ").append(toIndentedString(amountFrom)).append("\n");
    sb.append("    amountTo: ").append(toIndentedString(amountTo)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
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

