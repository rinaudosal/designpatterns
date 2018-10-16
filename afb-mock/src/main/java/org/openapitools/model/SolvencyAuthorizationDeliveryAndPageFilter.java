package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PageFilter;
import org.openapitools.model.SolvencyAuthorizationDeliverySearchFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed a {SolvencyAuthorizationDeliverySearchFilter} and a {PageFilter}.
 */
@ApiModel(description = "A simple object composed a {SolvencyAuthorizationDeliverySearchFilter} and a {PageFilter}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SolvencyAuthorizationDeliveryAndPageFilter   {
  @JsonProperty("filter")
  private SolvencyAuthorizationDeliverySearchFilter filter = null;

  @JsonProperty("pageFilter")
  private PageFilter pageFilter = null;

  public SolvencyAuthorizationDeliveryAndPageFilter filter(SolvencyAuthorizationDeliverySearchFilter filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Get filter
   * @return filter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SolvencyAuthorizationDeliverySearchFilter getFilter() {
    return filter;
  }

  public void setFilter(SolvencyAuthorizationDeliverySearchFilter filter) {
    this.filter = filter;
  }

  public SolvencyAuthorizationDeliveryAndPageFilter pageFilter(PageFilter pageFilter) {
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
    SolvencyAuthorizationDeliveryAndPageFilter solvencyAuthorizationDeliveryAndPageFilter = (SolvencyAuthorizationDeliveryAndPageFilter) o;
    return Objects.equals(this.filter, solvencyAuthorizationDeliveryAndPageFilter.filter) &&
        Objects.equals(this.pageFilter, solvencyAuthorizationDeliveryAndPageFilter.pageFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, pageFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SolvencyAuthorizationDeliveryAndPageFilter {\n");
    
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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

