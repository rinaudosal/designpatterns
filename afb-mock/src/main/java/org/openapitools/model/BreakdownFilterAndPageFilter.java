package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BreakdownFilter;
import org.openapitools.model.PageFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of a {BreakdownFilter} and a {PageFilter}.
 */
@ApiModel(description = "A simple object composed of a {BreakdownFilter} and a {PageFilter}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class BreakdownFilterAndPageFilter   {
  @JsonProperty("breakdownFilter")
  private BreakdownFilter breakdownFilter = null;

  @JsonProperty("page")
  private PageFilter page = null;

  public BreakdownFilterAndPageFilter breakdownFilter(BreakdownFilter breakdownFilter) {
    this.breakdownFilter = breakdownFilter;
    return this;
  }

  /**
   * Get breakdownFilter
   * @return breakdownFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BreakdownFilter getBreakdownFilter() {
    return breakdownFilter;
  }

  public void setBreakdownFilter(BreakdownFilter breakdownFilter) {
    this.breakdownFilter = breakdownFilter;
  }

  public BreakdownFilterAndPageFilter page(PageFilter page) {
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
    BreakdownFilterAndPageFilter breakdownFilterAndPageFilter = (BreakdownFilterAndPageFilter) o;
    return Objects.equals(this.breakdownFilter, breakdownFilterAndPageFilter.breakdownFilter) &&
        Objects.equals(this.page, breakdownFilterAndPageFilter.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(breakdownFilter, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BreakdownFilterAndPageFilter {\n");
    
    sb.append("    breakdownFilter: ").append(toIndentedString(breakdownFilter)).append("\n");
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

