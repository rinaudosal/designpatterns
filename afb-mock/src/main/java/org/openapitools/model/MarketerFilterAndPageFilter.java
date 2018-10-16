package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.MarketerFilter;
import org.openapitools.model.PageFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of either a {MarketFilter}  and a {PageFilter}.
 */
@ApiModel(description = "A simple object composed of either a {MarketFilter}  and a {PageFilter}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class MarketerFilterAndPageFilter   {
  @JsonProperty("marketerFilter")
  private MarketerFilter marketerFilter = null;

  @JsonProperty("pageFilter")
  private PageFilter pageFilter = null;

  public MarketerFilterAndPageFilter marketerFilter(MarketerFilter marketerFilter) {
    this.marketerFilter = marketerFilter;
    return this;
  }

  /**
   * Get marketerFilter
   * @return marketerFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public MarketerFilter getMarketerFilter() {
    return marketerFilter;
  }

  public void setMarketerFilter(MarketerFilter marketerFilter) {
    this.marketerFilter = marketerFilter;
  }

  public MarketerFilterAndPageFilter pageFilter(PageFilter pageFilter) {
    this.pageFilter = pageFilter;
    return this;
  }

  /**
   * Get pageFilter
   * @return pageFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PageFilter getPageFilter() {
    return pageFilter;
  }

  public void setPageFilter(PageFilter pageFilter) {
    this.pageFilter = pageFilter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarketerFilterAndPageFilter marketerFilterAndPageFilter = (MarketerFilterAndPageFilter) o;
    return Objects.equals(this.marketerFilter, marketerFilterAndPageFilter.marketerFilter) &&
        Objects.equals(this.pageFilter, marketerFilterAndPageFilter.pageFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketerFilter, pageFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarketerFilterAndPageFilter {\n");
    
    sb.append("    marketerFilter: ").append(toIndentedString(marketerFilter)).append("\n");
    sb.append("    pageFilter: ").append(toIndentedString(pageFilter)).append("\n");
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

