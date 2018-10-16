package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AnnualPerformance;
import org.openapitools.model.WeightedResourceReference;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * WeightedAnnualPerformance
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class WeightedAnnualPerformance   {
  @JsonProperty("annualPerformance")
  private AnnualPerformance annualPerformance = null;

  @JsonProperty("instrument")
  private WeightedResourceReference instrument = null;

  public WeightedAnnualPerformance annualPerformance(AnnualPerformance annualPerformance) {
    this.annualPerformance = annualPerformance;
    return this;
  }

  /**
   * Get annualPerformance
   * @return annualPerformance
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AnnualPerformance getAnnualPerformance() {
    return annualPerformance;
  }

  public void setAnnualPerformance(AnnualPerformance annualPerformance) {
    this.annualPerformance = annualPerformance;
  }

  public WeightedAnnualPerformance instrument(WeightedResourceReference instrument) {
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
    WeightedAnnualPerformance weightedAnnualPerformance = (WeightedAnnualPerformance) o;
    return Objects.equals(this.annualPerformance, weightedAnnualPerformance.annualPerformance) &&
        Objects.equals(this.instrument, weightedAnnualPerformance.instrument);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annualPerformance, instrument);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WeightedAnnualPerformance {\n");
    
    sb.append("    annualPerformance: ").append(toIndentedString(annualPerformance)).append("\n");
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

