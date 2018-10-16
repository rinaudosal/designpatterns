package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AnnualPerformance;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AnnualBenchmarkAndInstrumentPerformance
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class AnnualBenchmarkAndInstrumentPerformance   {
  @JsonProperty("benchmarkId")
  private String benchmarkId = null;

  @JsonProperty("benchmarkPerformance")
  private AnnualPerformance benchmarkPerformance = null;

  @JsonProperty("instrumentPerformance")
  private AnnualPerformance instrumentPerformance = null;

  public AnnualBenchmarkAndInstrumentPerformance benchmarkId(String benchmarkId) {
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

  public AnnualBenchmarkAndInstrumentPerformance benchmarkPerformance(AnnualPerformance benchmarkPerformance) {
    this.benchmarkPerformance = benchmarkPerformance;
    return this;
  }

  /**
   * Get benchmarkPerformance
   * @return benchmarkPerformance
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AnnualPerformance getBenchmarkPerformance() {
    return benchmarkPerformance;
  }

  public void setBenchmarkPerformance(AnnualPerformance benchmarkPerformance) {
    this.benchmarkPerformance = benchmarkPerformance;
  }

  public AnnualBenchmarkAndInstrumentPerformance instrumentPerformance(AnnualPerformance instrumentPerformance) {
    this.instrumentPerformance = instrumentPerformance;
    return this;
  }

  /**
   * Get instrumentPerformance
   * @return instrumentPerformance
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AnnualPerformance getInstrumentPerformance() {
    return instrumentPerformance;
  }

  public void setInstrumentPerformance(AnnualPerformance instrumentPerformance) {
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
    AnnualBenchmarkAndInstrumentPerformance annualBenchmarkAndInstrumentPerformance = (AnnualBenchmarkAndInstrumentPerformance) o;
    return Objects.equals(this.benchmarkId, annualBenchmarkAndInstrumentPerformance.benchmarkId) &&
        Objects.equals(this.benchmarkPerformance, annualBenchmarkAndInstrumentPerformance.benchmarkPerformance) &&
        Objects.equals(this.instrumentPerformance, annualBenchmarkAndInstrumentPerformance.instrumentPerformance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(benchmarkId, benchmarkPerformance, instrumentPerformance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnnualBenchmarkAndInstrumentPerformance {\n");
    
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

