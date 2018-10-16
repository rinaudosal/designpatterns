package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AnnualPerformanceFilter;
import org.openapitools.model.CumulativePerformanceFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PerformanceSearchFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class PerformanceSearchFilter   {
  @JsonProperty("annual")
  private AnnualPerformanceFilter annual = null;

  @JsonProperty("cumulative")
  private CumulativePerformanceFilter cumulative = null;

  public PerformanceSearchFilter annual(AnnualPerformanceFilter annual) {
    this.annual = annual;
    return this;
  }

  /**
   * Get annual
   * @return annual
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AnnualPerformanceFilter getAnnual() {
    return annual;
  }

  public void setAnnual(AnnualPerformanceFilter annual) {
    this.annual = annual;
  }

  public PerformanceSearchFilter cumulative(CumulativePerformanceFilter cumulative) {
    this.cumulative = cumulative;
    return this;
  }

  /**
   * Get cumulative
   * @return cumulative
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CumulativePerformanceFilter getCumulative() {
    return cumulative;
  }

  public void setCumulative(CumulativePerformanceFilter cumulative) {
    this.cumulative = cumulative;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PerformanceSearchFilter performanceSearchFilter = (PerformanceSearchFilter) o;
    return Objects.equals(this.annual, performanceSearchFilter.annual) &&
        Objects.equals(this.cumulative, performanceSearchFilter.cumulative);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annual, cumulative);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PerformanceSearchFilter {\n");
    
    sb.append("    annual: ").append(toIndentedString(annual)).append("\n");
    sb.append("    cumulative: ").append(toIndentedString(cumulative)).append("\n");
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

