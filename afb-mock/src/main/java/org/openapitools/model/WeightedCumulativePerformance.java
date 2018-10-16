package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CumulativePerformance;
import org.openapitools.model.WeightedResourceReference;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * WeightedCumulativePerformance
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class WeightedCumulativePerformance   {
  @JsonProperty("cumulativePerformance")
  private CumulativePerformance cumulativePerformance = null;

  @JsonProperty("instrument")
  private WeightedResourceReference instrument = null;

  public WeightedCumulativePerformance cumulativePerformance(CumulativePerformance cumulativePerformance) {
    this.cumulativePerformance = cumulativePerformance;
    return this;
  }

  /**
   * Get cumulativePerformance
   * @return cumulativePerformance
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CumulativePerformance getCumulativePerformance() {
    return cumulativePerformance;
  }

  public void setCumulativePerformance(CumulativePerformance cumulativePerformance) {
    this.cumulativePerformance = cumulativePerformance;
  }

  public WeightedCumulativePerformance instrument(WeightedResourceReference instrument) {
    this.instrument = instrument;
    return this;
  }

  /**
   * Get instrument
   * @return instrument
  **/
  @ApiModelProperty(value = "")

  @Valid

  public WeightedResourceReference getInstrument() {
    return instrument;
  }

  public void setInstrument(WeightedResourceReference instrument) {
    this.instrument = instrument;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WeightedCumulativePerformance weightedCumulativePerformance = (WeightedCumulativePerformance) o;
    return Objects.equals(this.cumulativePerformance, weightedCumulativePerformance.cumulativePerformance) &&
        Objects.equals(this.instrument, weightedCumulativePerformance.instrument);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cumulativePerformance, instrument);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WeightedCumulativePerformance {\n");
    
    sb.append("    cumulativePerformance: ").append(toIndentedString(cumulativePerformance)).append("\n");
    sb.append("    instrument: ").append(toIndentedString(instrument)).append("\n");
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

