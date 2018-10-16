package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.DealingInstrument;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DealingInstrumentNotification
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class DealingInstrumentNotification   {
  @JsonProperty("dealingInstrument")
  private DealingInstrument dealingInstrument = null;

  @JsonProperty("weightPercentage")
  private Double weightPercentage = null;

  public DealingInstrumentNotification dealingInstrument(DealingInstrument dealingInstrument) {
    this.dealingInstrument = dealingInstrument;
    return this;
  }

  /**
   * Get dealingInstrument
   * @return dealingInstrument
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DealingInstrument getDealingInstrument() {
    return dealingInstrument;
  }

  public void setDealingInstrument(DealingInstrument dealingInstrument) {
    this.dealingInstrument = dealingInstrument;
  }

  public DealingInstrumentNotification weightPercentage(Double weightPercentage) {
    this.weightPercentage = weightPercentage;
    return this;
  }

  /**
   * Weight Percentage refer to {Notification}
   * @return weightPercentage
  **/
  @ApiModelProperty(value = "Weight Percentage refer to {Notification}")


  public Double getWeightPercentage() {
    return weightPercentage;
  }

  public void setWeightPercentage(Double weightPercentage) {
    this.weightPercentage = weightPercentage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DealingInstrumentNotification dealingInstrumentNotification = (DealingInstrumentNotification) o;
    return Objects.equals(this.dealingInstrument, dealingInstrumentNotification.dealingInstrument) &&
        Objects.equals(this.weightPercentage, dealingInstrumentNotification.weightPercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dealingInstrument, weightPercentage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DealingInstrumentNotification {\n");
    
    sb.append("    dealingInstrument: ").append(toIndentedString(dealingInstrument)).append("\n");
    sb.append("    weightPercentage: ").append(toIndentedString(weightPercentage)).append("\n");
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

