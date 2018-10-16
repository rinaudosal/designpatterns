package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CompositionItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class CompositionItem   {
  @JsonProperty("dealingInstrumentId")
  private Long dealingInstrumentId = null;

  @JsonProperty("weight")
  private Double weight = null;

  public CompositionItem dealingInstrumentId(Long dealingInstrumentId) {
    this.dealingInstrumentId = dealingInstrumentId;
    return this;
  }

  /**
   * Get dealingInstrumentId
   * @return dealingInstrumentId
  **/
  @ApiModelProperty(value = "")


  public Long getDealingInstrumentId() {
    return dealingInstrumentId;
  }

  public void setDealingInstrumentId(Long dealingInstrumentId) {
    this.dealingInstrumentId = dealingInstrumentId;
  }

  public CompositionItem weight(Double weight) {
    this.weight = weight;
    return this;
  }

  /**
   * Get weight
   * @return weight
  **/
  @ApiModelProperty(value = "")


  public Double getWeight() {
    return weight;
  }

  public void setWeight(Double weight) {
    this.weight = weight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompositionItem compositionItem = (CompositionItem) o;
    return Objects.equals(this.dealingInstrumentId, compositionItem.dealingInstrumentId) &&
        Objects.equals(this.weight, compositionItem.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dealingInstrumentId, weight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompositionItem {\n");
    
    sb.append("    dealingInstrumentId: ").append(toIndentedString(dealingInstrumentId)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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

