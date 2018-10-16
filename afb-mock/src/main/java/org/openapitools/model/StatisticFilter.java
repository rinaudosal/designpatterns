package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PerformanceFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StatisticFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class StatisticFilter   {
  @JsonProperty("benchmarkId")
  private String benchmarkId = null;

  @JsonProperty("performanceFilter")
  private PerformanceFilter performanceFilter = null;

  public StatisticFilter benchmarkId(String benchmarkId) {
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

  public StatisticFilter performanceFilter(PerformanceFilter performanceFilter) {
    this.performanceFilter = performanceFilter;
    return this;
  }

  /**
   * Get performanceFilter
   * @return performanceFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PerformanceFilter getPerformanceFilter() {
    return performanceFilter;
  }

  public void setPerformanceFilter(PerformanceFilter performanceFilter) {
    this.performanceFilter = performanceFilter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatisticFilter statisticFilter = (StatisticFilter) o;
    return Objects.equals(this.benchmarkId, statisticFilter.benchmarkId) &&
        Objects.equals(this.performanceFilter, statisticFilter.performanceFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(benchmarkId, performanceFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatisticFilter {\n");
    
    sb.append("    benchmarkId: ").append(toIndentedString(benchmarkId)).append("\n");
    sb.append("    performanceFilter: ").append(toIndentedString(performanceFilter)).append("\n");
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

