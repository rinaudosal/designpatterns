package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RiskClassification;
import org.openapitools.model.WeightedResourceReference;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * WeightedRiskClassification
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class WeightedRiskClassification   {
  @JsonProperty("instrument")
  private WeightedResourceReference instrument = null;

  @JsonProperty("riskClassification")
  private RiskClassification riskClassification = null;

  public WeightedRiskClassification instrument(WeightedResourceReference instrument) {
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

  public WeightedRiskClassification riskClassification(RiskClassification riskClassification) {
    this.riskClassification = riskClassification;
    return this;
  }

  /**
   * Get riskClassification
   * @return riskClassification
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RiskClassification getRiskClassification() {
    return riskClassification;
  }

  public void setRiskClassification(RiskClassification riskClassification) {
    this.riskClassification = riskClassification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WeightedRiskClassification weightedRiskClassification = (WeightedRiskClassification) o;
    return Objects.equals(this.instrument, weightedRiskClassification.instrument) &&
        Objects.equals(this.riskClassification, weightedRiskClassification.riskClassification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instrument, riskClassification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WeightedRiskClassification {\n");
    
    sb.append("    instrument: ").append(toIndentedString(instrument)).append("\n");
    sb.append("    riskClassification: ").append(toIndentedString(riskClassification)).append("\n");
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

