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
 * HistoricalPerformanceFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class HistoricalPerformanceFilter   {
  @JsonProperty("performanceFilter")
  private PerformanceFilter performanceFilter = null;

  @JsonProperty("performanceTypeCode")
  private String performanceTypeCode = null;

  public HistoricalPerformanceFilter performanceFilter(PerformanceFilter performanceFilter) {
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

  public HistoricalPerformanceFilter performanceTypeCode(String performanceTypeCode) {
    this.performanceTypeCode = performanceTypeCode;
    return this;
  }

  /**
   * PerformanceType catalog (annual, acumulate, quarterly,...). Refer to {listPerformanceTypes}
   * @return performanceTypeCode
  **/
  @ApiModelProperty(value = "PerformanceType catalog (annual, acumulate, quarterly,...). Refer to {listPerformanceTypes}")


  public String getPerformanceTypeCode() {
    return performanceTypeCode;
  }

  public void setPerformanceTypeCode(String performanceTypeCode) {
    this.performanceTypeCode = performanceTypeCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoricalPerformanceFilter historicalPerformanceFilter = (HistoricalPerformanceFilter) o;
    return Objects.equals(this.performanceFilter, historicalPerformanceFilter.performanceFilter) &&
        Objects.equals(this.performanceTypeCode, historicalPerformanceFilter.performanceTypeCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(performanceFilter, performanceTypeCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricalPerformanceFilter {\n");
    
    sb.append("    performanceFilter: ").append(toIndentedString(performanceFilter)).append("\n");
    sb.append("    performanceTypeCode: ").append(toIndentedString(performanceTypeCode)).append("\n");
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

