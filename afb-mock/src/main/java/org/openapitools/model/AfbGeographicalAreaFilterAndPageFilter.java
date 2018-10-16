package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AfbGeographicalAreaFilter;
import org.openapitools.model.PageFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AfbGeographicalAreaFilterAndPageFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class AfbGeographicalAreaFilterAndPageFilter   {
  @JsonProperty("afbGeographicalAreaFilter")
  private AfbGeographicalAreaFilter afbGeographicalAreaFilter = null;

  @JsonProperty("pageFilter")
  private PageFilter pageFilter = null;

  public AfbGeographicalAreaFilterAndPageFilter afbGeographicalAreaFilter(AfbGeographicalAreaFilter afbGeographicalAreaFilter) {
    this.afbGeographicalAreaFilter = afbGeographicalAreaFilter;
    return this;
  }

  /**
   * Get afbGeographicalAreaFilter
   * @return afbGeographicalAreaFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AfbGeographicalAreaFilter getAfbGeographicalAreaFilter() {
    return afbGeographicalAreaFilter;
  }

  public void setAfbGeographicalAreaFilter(AfbGeographicalAreaFilter afbGeographicalAreaFilter) {
    this.afbGeographicalAreaFilter = afbGeographicalAreaFilter;
  }

  public AfbGeographicalAreaFilterAndPageFilter pageFilter(PageFilter pageFilter) {
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
    AfbGeographicalAreaFilterAndPageFilter afbGeographicalAreaFilterAndPageFilter = (AfbGeographicalAreaFilterAndPageFilter) o;
    return Objects.equals(this.afbGeographicalAreaFilter, afbGeographicalAreaFilterAndPageFilter.afbGeographicalAreaFilter) &&
        Objects.equals(this.pageFilter, afbGeographicalAreaFilterAndPageFilter.pageFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(afbGeographicalAreaFilter, pageFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AfbGeographicalAreaFilterAndPageFilter {\n");
    
    sb.append("    afbGeographicalAreaFilter: ").append(toIndentedString(afbGeographicalAreaFilter)).append("\n");
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

