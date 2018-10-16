package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PageFilter;
import org.openapitools.model.PerformanceFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of a {PerformanceFilter} and a {PageFilter}.
 */
@ApiModel(description = "A simple object composed of a {PerformanceFilter} and a {PageFilter}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class PerformanceFilterAndPageFilter   {
  @JsonProperty("page")
  private PageFilter page = null;

  @JsonProperty("performance")
  private PerformanceFilter performance = null;

  public PerformanceFilterAndPageFilter page(PageFilter page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   * @return page
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PageFilter getPage() {
    return page;
  }

  public void setPage(PageFilter page) {
    this.page = page;
  }

  public PerformanceFilterAndPageFilter performance(PerformanceFilter performance) {
    this.performance = performance;
    return this;
  }

  /**
   * Get performance
   * @return performance
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PerformanceFilter getPerformance() {
    return performance;
  }

  public void setPerformance(PerformanceFilter performance) {
    this.performance = performance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PerformanceFilterAndPageFilter performanceFilterAndPageFilter = (PerformanceFilterAndPageFilter) o;
    return Objects.equals(this.page, performanceFilterAndPageFilter.page) &&
        Objects.equals(this.performance, performanceFilterAndPageFilter.performance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, performance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PerformanceFilterAndPageFilter {\n");
    
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    performance: ").append(toIndentedString(performance)).append("\n");
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

