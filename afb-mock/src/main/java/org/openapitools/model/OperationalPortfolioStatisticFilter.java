package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OperationalPortfolioPerformanceFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OperationalPortfolioStatisticFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class OperationalPortfolioStatisticFilter   {
  @JsonProperty("benchmarkId")
  private String benchmarkId = null;

  @JsonProperty("operationalPortfolioPerformanceFilter")
  private OperationalPortfolioPerformanceFilter operationalPortfolioPerformanceFilter = null;

  public OperationalPortfolioStatisticFilter benchmarkId(String benchmarkId) {
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

  public OperationalPortfolioStatisticFilter operationalPortfolioPerformanceFilter(OperationalPortfolioPerformanceFilter operationalPortfolioPerformanceFilter) {
    this.operationalPortfolioPerformanceFilter = operationalPortfolioPerformanceFilter;
    return this;
  }

  /**
   * Get operationalPortfolioPerformanceFilter
   * @return operationalPortfolioPerformanceFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OperationalPortfolioPerformanceFilter getOperationalPortfolioPerformanceFilter() {
    return operationalPortfolioPerformanceFilter;
  }

  public void setOperationalPortfolioPerformanceFilter(OperationalPortfolioPerformanceFilter operationalPortfolioPerformanceFilter) {
    this.operationalPortfolioPerformanceFilter = operationalPortfolioPerformanceFilter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationalPortfolioStatisticFilter operationalPortfolioStatisticFilter = (OperationalPortfolioStatisticFilter) o;
    return Objects.equals(this.benchmarkId, operationalPortfolioStatisticFilter.benchmarkId) &&
        Objects.equals(this.operationalPortfolioPerformanceFilter, operationalPortfolioStatisticFilter.operationalPortfolioPerformanceFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(benchmarkId, operationalPortfolioPerformanceFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationalPortfolioStatisticFilter {\n");
    
    sb.append("    benchmarkId: ").append(toIndentedString(benchmarkId)).append("\n");
    sb.append("    operationalPortfolioPerformanceFilter: ").append(toIndentedString(operationalPortfolioPerformanceFilter)).append("\n");
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

