package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.HistoricalPerformance;
import org.openapitools.model.WeightedResourceReference;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * WeightedHistoricalPerformance
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class WeightedHistoricalPerformance   {
  @JsonProperty("historicalPerformance")
  private HistoricalPerformance historicalPerformance = null;

  @JsonProperty("instrument")
  private WeightedResourceReference instrument = null;

  public WeightedHistoricalPerformance historicalPerformance(HistoricalPerformance historicalPerformance) {
    this.historicalPerformance = historicalPerformance;
    return this;
  }

  /**
   * Get historicalPerformance
   * @return historicalPerformance
  **/
  @ApiModelProperty(value = "")

  @Valid

  public HistoricalPerformance getHistoricalPerformance() {
    return historicalPerformance;
  }

  public void setHistoricalPerformance(HistoricalPerformance historicalPerformance) {
    this.historicalPerformance = historicalPerformance;
  }

  public WeightedHistoricalPerformance instrument(WeightedResourceReference instrument) {
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
    WeightedHistoricalPerformance weightedHistoricalPerformance = (WeightedHistoricalPerformance) o;
    return Objects.equals(this.historicalPerformance, weightedHistoricalPerformance.historicalPerformance) &&
        Objects.equals(this.instrument, weightedHistoricalPerformance.instrument);
  }

  @Override
  public int hashCode() {
    return Objects.hash(historicalPerformance, instrument);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WeightedHistoricalPerformance {\n");
    
    sb.append("    historicalPerformance: ").append(toIndentedString(historicalPerformance)).append("\n");
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

