package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PageFilter;
import org.openapitools.model.RebatePriceFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RebatePriceFilterAndPageFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class RebatePriceFilterAndPageFilter   {
  @JsonProperty("pageFilter")
  private PageFilter pageFilter = null;

  @JsonProperty("rebatePriceFilter")
  private RebatePriceFilter rebatePriceFilter = null;

  public RebatePriceFilterAndPageFilter pageFilter(PageFilter pageFilter) {
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

  public RebatePriceFilterAndPageFilter rebatePriceFilter(RebatePriceFilter rebatePriceFilter) {
    this.rebatePriceFilter = rebatePriceFilter;
    return this;
  }

  /**
   * Get rebatePriceFilter
   * @return rebatePriceFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RebatePriceFilter getRebatePriceFilter() {
    return rebatePriceFilter;
  }

  public void setRebatePriceFilter(RebatePriceFilter rebatePriceFilter) {
    this.rebatePriceFilter = rebatePriceFilter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RebatePriceFilterAndPageFilter rebatePriceFilterAndPageFilter = (RebatePriceFilterAndPageFilter) o;
    return Objects.equals(this.pageFilter, rebatePriceFilterAndPageFilter.pageFilter) &&
        Objects.equals(this.rebatePriceFilter, rebatePriceFilterAndPageFilter.rebatePriceFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageFilter, rebatePriceFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RebatePriceFilterAndPageFilter {\n");
    
    sb.append("    pageFilter: ").append(toIndentedString(pageFilter)).append("\n");
    sb.append("    rebatePriceFilter: ").append(toIndentedString(rebatePriceFilter)).append("\n");
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

