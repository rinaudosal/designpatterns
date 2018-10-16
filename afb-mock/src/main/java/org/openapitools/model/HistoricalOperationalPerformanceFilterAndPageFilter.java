package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.HistoricalOperationalPerformanceFilter;
import org.openapitools.model.PageFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of a {HistoricalOperationalPerformanceFilter} and a {PageFilter}.
 */
@ApiModel(description = "A simple object composed of a {HistoricalOperationalPerformanceFilter} and a {PageFilter}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class HistoricalOperationalPerformanceFilterAndPageFilter   {
  @JsonProperty("historicalOperationalPerformanceFilter")
  private HistoricalOperationalPerformanceFilter historicalOperationalPerformanceFilter = null;

  @JsonProperty("page")
  private PageFilter page = null;

  public HistoricalOperationalPerformanceFilterAndPageFilter historicalOperationalPerformanceFilter(HistoricalOperationalPerformanceFilter historicalOperationalPerformanceFilter) {
    this.historicalOperationalPerformanceFilter = historicalOperationalPerformanceFilter;
    return this;
  }

  /**
   * Get historicalOperationalPerformanceFilter
   * @return historicalOperationalPerformanceFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public HistoricalOperationalPerformanceFilter getHistoricalOperationalPerformanceFilter() {
    return historicalOperationalPerformanceFilter;
  }

  public void setHistoricalOperationalPerformanceFilter(HistoricalOperationalPerformanceFilter historicalOperationalPerformanceFilter) {
    this.historicalOperationalPerformanceFilter = historicalOperationalPerformanceFilter;
  }

  public HistoricalOperationalPerformanceFilterAndPageFilter page(PageFilter page) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoricalOperationalPerformanceFilterAndPageFilter historicalOperationalPerformanceFilterAndPageFilter = (HistoricalOperationalPerformanceFilterAndPageFilter) o;
    return Objects.equals(this.historicalOperationalPerformanceFilter, historicalOperationalPerformanceFilterAndPageFilter.historicalOperationalPerformanceFilter) &&
        Objects.equals(this.page, historicalOperationalPerformanceFilterAndPageFilter.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(historicalOperationalPerformanceFilter, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricalOperationalPerformanceFilterAndPageFilter {\n");
    
    sb.append("    historicalOperationalPerformanceFilter: ").append(toIndentedString(historicalOperationalPerformanceFilter)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
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

