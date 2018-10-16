package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RiskClassification
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class RiskClassification   {
  @JsonProperty("benchmarkPerformance")
  private Double benchmarkPerformance = null;

  @JsonProperty("benchmarkVolatility")
  private Double benchmarkVolatility = null;

  @JsonProperty("instrumentPerformance")
  private Double instrumentPerformance = null;

  @JsonProperty("instrumentVolatility")
  private Double instrumentVolatility = null;

  public RiskClassification benchmarkPerformance(Double benchmarkPerformance) {
    this.benchmarkPerformance = benchmarkPerformance;
    return this;
  }

  /**
   * Get benchmarkPerformance
   * @return benchmarkPerformance
  **/
  @ApiModelProperty(value = "")


  public Double getBenchmarkPerformance() {
    return benchmarkPerformance;
  }

  public void setBenchmarkPerformance(Double benchmarkPerformance) {
    this.benchmarkPerformance = benchmarkPerformance;
  }

  public RiskClassification benchmarkVolatility(Double benchmarkVolatility) {
    this.benchmarkVolatility = benchmarkVolatility;
    return this;
  }

  /**
   * Get benchmarkVolatility
   * @return benchmarkVolatility
  **/
  @ApiModelProperty(value = "")


  public Double getBenchmarkVolatility() {
    return benchmarkVolatility;
  }

  public void setBenchmarkVolatility(Double benchmarkVolatility) {
    this.benchmarkVolatility = benchmarkVolatility;
  }

  public RiskClassification instrumentPerformance(Double instrumentPerformance) {
    this.instrumentPerformance = instrumentPerformance;
    return this;
  }

  /**
   * Get instrumentPerformance
   * @return instrumentPerformance
  **/
  @ApiModelProperty(value = "")


  public Double getInstrumentPerformance() {
    return instrumentPerformance;
  }

  public void setInstrumentPerformance(Double instrumentPerformance) {
    this.instrumentPerformance = instrumentPerformance;
  }

  public RiskClassification instrumentVolatility(Double instrumentVolatility) {
    this.instrumentVolatility = instrumentVolatility;
    return this;
  }

  /**
   * Get instrumentVolatility
   * @return instrumentVolatility
  **/
  @ApiModelProperty(value = "")


  public Double getInstrumentVolatility() {
    return instrumentVolatility;
  }

  public void setInstrumentVolatility(Double instrumentVolatility) {
    this.instrumentVolatility = instrumentVolatility;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskClassification riskClassification = (RiskClassification) o;
    return Objects.equals(this.benchmarkPerformance, riskClassification.benchmarkPerformance) &&
        Objects.equals(this.benchmarkVolatility, riskClassification.benchmarkVolatility) &&
        Objects.equals(this.instrumentPerformance, riskClassification.instrumentPerformance) &&
        Objects.equals(this.instrumentVolatility, riskClassification.instrumentVolatility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(benchmarkPerformance, benchmarkVolatility, instrumentPerformance, instrumentVolatility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskClassification {\n");
    
    sb.append("    benchmarkPerformance: ").append(toIndentedString(benchmarkPerformance)).append("\n");
    sb.append("    benchmarkVolatility: ").append(toIndentedString(benchmarkVolatility)).append("\n");
    sb.append("    instrumentPerformance: ").append(toIndentedString(instrumentPerformance)).append("\n");
    sb.append("    instrumentVolatility: ").append(toIndentedString(instrumentVolatility)).append("\n");
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

