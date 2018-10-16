package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AfbCountryFilter;
import org.openapitools.model.PageFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AfbCountryFilterAndPageFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class AfbCountryFilterAndPageFilter   {
  @JsonProperty("afbCountryFilter")
  private AfbCountryFilter afbCountryFilter = null;

  @JsonProperty("pageFilter")
  private PageFilter pageFilter = null;

  public AfbCountryFilterAndPageFilter afbCountryFilter(AfbCountryFilter afbCountryFilter) {
    this.afbCountryFilter = afbCountryFilter;
    return this;
  }

  /**
   * Get afbCountryFilter
   * @return afbCountryFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AfbCountryFilter getAfbCountryFilter() {
    return afbCountryFilter;
  }

  public void setAfbCountryFilter(AfbCountryFilter afbCountryFilter) {
    this.afbCountryFilter = afbCountryFilter;
  }

  public AfbCountryFilterAndPageFilter pageFilter(PageFilter pageFilter) {
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
    AfbCountryFilterAndPageFilter afbCountryFilterAndPageFilter = (AfbCountryFilterAndPageFilter) o;
    return Objects.equals(this.afbCountryFilter, afbCountryFilterAndPageFilter.afbCountryFilter) &&
        Objects.equals(this.pageFilter, afbCountryFilterAndPageFilter.pageFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(afbCountryFilter, pageFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AfbCountryFilterAndPageFilter {\n");
    
    sb.append("    afbCountryFilter: ").append(toIndentedString(afbCountryFilter)).append("\n");
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

