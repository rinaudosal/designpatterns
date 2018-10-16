package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This object keeps specific information about fees applied to a SpanishTransfer. They are all expressed in {SpanishTransferItem.currencyCode}
 */
@ApiModel(description = "This object keeps specific information about fees applied to a SpanishTransfer. They are all expressed in {SpanishTransferItem.currencyCode}")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SpanishTransferFeeData   {
  @JsonProperty("firstSpanishTransferFeeAmount")
  private Double firstSpanishTransferFeeAmount = null;

  @JsonProperty("firstSpanishTransferFeePercentage")
  private Double firstSpanishTransferFeePercentage = null;

  @JsonProperty("secondSpanishTransferFeeAmount")
  private Double secondSpanishTransferFeeAmount = null;

  @JsonProperty("secondSpanishTransferFeePercentage")
  private Double secondSpanishTransferFeePercentage = null;

  public SpanishTransferFeeData firstSpanishTransferFeeAmount(Double firstSpanishTransferFeeAmount) {
    this.firstSpanishTransferFeeAmount = firstSpanishTransferFeeAmount;
    return this;
  }

  /**
   * The amount of the first group of commission applied to the {SpanishTransfer} by the {Distributor}
   * @return firstSpanishTransferFeeAmount
  **/
  @ApiModelProperty(value = "The amount of the first group of commission applied to the {SpanishTransfer} by the {Distributor}")


  public Double getFirstSpanishTransferFeeAmount() {
    return firstSpanishTransferFeeAmount;
  }

  public void setFirstSpanishTransferFeeAmount(Double firstSpanishTransferFeeAmount) {
    this.firstSpanishTransferFeeAmount = firstSpanishTransferFeeAmount;
  }

  public SpanishTransferFeeData firstSpanishTransferFeePercentage(Double firstSpanishTransferFeePercentage) {
    this.firstSpanishTransferFeePercentage = firstSpanishTransferFeePercentage;
    return this;
  }

  /**
   * The percentage of the first group of commission applied to the {SpanishTransfer} by the {Distributor}
   * @return firstSpanishTransferFeePercentage
  **/
  @ApiModelProperty(value = "The percentage of the first group of commission applied to the {SpanishTransfer} by the {Distributor}")


  public Double getFirstSpanishTransferFeePercentage() {
    return firstSpanishTransferFeePercentage;
  }

  public void setFirstSpanishTransferFeePercentage(Double firstSpanishTransferFeePercentage) {
    this.firstSpanishTransferFeePercentage = firstSpanishTransferFeePercentage;
  }

  public SpanishTransferFeeData secondSpanishTransferFeeAmount(Double secondSpanishTransferFeeAmount) {
    this.secondSpanishTransferFeeAmount = secondSpanishTransferFeeAmount;
    return this;
  }

  /**
   * The amount of the second group of commission applied to the {SpanishTransfer} by the {Distributor}
   * @return secondSpanishTransferFeeAmount
  **/
  @ApiModelProperty(value = "The amount of the second group of commission applied to the {SpanishTransfer} by the {Distributor}")


  public Double getSecondSpanishTransferFeeAmount() {
    return secondSpanishTransferFeeAmount;
  }

  public void setSecondSpanishTransferFeeAmount(Double secondSpanishTransferFeeAmount) {
    this.secondSpanishTransferFeeAmount = secondSpanishTransferFeeAmount;
  }

  public SpanishTransferFeeData secondSpanishTransferFeePercentage(Double secondSpanishTransferFeePercentage) {
    this.secondSpanishTransferFeePercentage = secondSpanishTransferFeePercentage;
    return this;
  }

  /**
   * The percentage of the second group of commission applied to the {SpanishTransfer} by the {Distributor}
   * @return secondSpanishTransferFeePercentage
  **/
  @ApiModelProperty(value = "The percentage of the second group of commission applied to the {SpanishTransfer} by the {Distributor}")


  public Double getSecondSpanishTransferFeePercentage() {
    return secondSpanishTransferFeePercentage;
  }

  public void setSecondSpanishTransferFeePercentage(Double secondSpanishTransferFeePercentage) {
    this.secondSpanishTransferFeePercentage = secondSpanishTransferFeePercentage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpanishTransferFeeData spanishTransferFeeData = (SpanishTransferFeeData) o;
    return Objects.equals(this.firstSpanishTransferFeeAmount, spanishTransferFeeData.firstSpanishTransferFeeAmount) &&
        Objects.equals(this.firstSpanishTransferFeePercentage, spanishTransferFeeData.firstSpanishTransferFeePercentage) &&
        Objects.equals(this.secondSpanishTransferFeeAmount, spanishTransferFeeData.secondSpanishTransferFeeAmount) &&
        Objects.equals(this.secondSpanishTransferFeePercentage, spanishTransferFeeData.secondSpanishTransferFeePercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstSpanishTransferFeeAmount, firstSpanishTransferFeePercentage, secondSpanishTransferFeeAmount, secondSpanishTransferFeePercentage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpanishTransferFeeData {\n");
    
    sb.append("    firstSpanishTransferFeeAmount: ").append(toIndentedString(firstSpanishTransferFeeAmount)).append("\n");
    sb.append("    firstSpanishTransferFeePercentage: ").append(toIndentedString(firstSpanishTransferFeePercentage)).append("\n");
    sb.append("    secondSpanishTransferFeeAmount: ").append(toIndentedString(secondSpanishTransferFeeAmount)).append("\n");
    sb.append("    secondSpanishTransferFeePercentage: ").append(toIndentedString(secondSpanishTransferFeePercentage)).append("\n");
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

