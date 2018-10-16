package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CumulativePerformance;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CumulativeBenchmarkAndInstrumentPerformance
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class CumulativeBenchmarkAndInstrumentPerformance   {
  @JsonProperty("benchmarkId")
  private String benchmarkId = null;

  @JsonProperty("benchmarkPerformance")
  private CumulativePerformance benchmarkPerformance = null;

  @JsonProperty("instrumentPerformance")
  private CumulativePerformance instrumentPerformance = null;

  public CumulativeBenchmarkAndInstrumentPerformance benchmarkId(String benchmarkId) {
    this.benchmarkId = benchmarkId;
    return this;
  }

  /**
   * The Id of the {Benchmark}
   * @return benchmarkId
  **/
  @ApiModelProperty(value = "The Id of the {Benchmark}")


  public String getBenchmarkId() {
    return benchmarkId;
  }

  public void setBenchmarkId(String benchmarkId) {
    this.benchmarkId = benchmarkId;
  }

  public CumulativeBenchmarkAndInstrumentPerformance benchmarkPerformance(CumulativePerformance benchmarkPerformance) {
    this.benchmarkPerformance = benchmarkPerformance;
    return this;
  }

  /**
   * Get benchmarkPerformance
   * @return benchmarkPerformance
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CumulativePerformance getBenchmarkPerformance() {
    return benchmarkPerformance;
  }

  public void setBenchmarkPerformance(CumulativePerformance benchmarkPerformance) {
    this.benchmarkPerformance = benchmarkPerformance;
  }

  public CumulativeBenchmarkAndInstrumentPerformance instrumentPerformance(CumulativePerformance instrumentPerformance) {
    this.instrumentPerformance = instrumentPerformance;
    return this;
  }

  /**
   * Get instrumentPerformance
   * @return instrumentPerformance
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CumulativePerformance getInstrumentPerformance() {
    return instrumentPerformance;
  }

  public void setInstrumentPerformance(CumulativePerformance instrumentPerformance) {
    this.instrumentPerformance = instrumentPerformance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CumulativeBenchmarkAndInstrumentPerformance cumulativeBenchmarkAndInstrumentPerformance = (CumulativeBenchmarkAndInstrumentPerformance) o;
    return Objects.equals(this.benchmarkId, cumulativeBenchmarkAndInstrumentPerformance.benchmarkId) &&
        Objects.equals(this.benchmarkPerformance, cumulativeBenchmarkAndInstrumentPerformance.benchmarkPerformance) &&
        Objects.equals(this.instrumentPerformance, cumulativeBenchmarkAndInstrumentPerformance.instrumentPerformance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(benchmarkId, benchmarkPerformance, instrumentPerformance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CumulativeBenchmarkAndInstrumentPerformance {\n");
    
    sb.append("    benchmarkId: ").append(toIndentedString(benchmarkId)).append("\n");
    sb.append("    benchmarkPerformance: ").append(toIndentedString(benchmarkPerformance)).append("\n");
    sb.append("    instrumentPerformance: ").append(toIndentedString(instrumentPerformance)).append("\n");
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

