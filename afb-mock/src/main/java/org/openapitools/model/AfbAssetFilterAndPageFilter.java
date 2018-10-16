package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AfbAssetFilter;
import org.openapitools.model.PageFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AfbAssetFilterAndPageFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class AfbAssetFilterAndPageFilter   {
  @JsonProperty("afbAssetFilter")
  private AfbAssetFilter afbAssetFilter = null;

  @JsonProperty("pageFilter")
  private PageFilter pageFilter = null;

  public AfbAssetFilterAndPageFilter afbAssetFilter(AfbAssetFilter afbAssetFilter) {
    this.afbAssetFilter = afbAssetFilter;
    return this;
  }

  /**
   * Get afbAssetFilter
   * @return afbAssetFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AfbAssetFilter getAfbAssetFilter() {
    return afbAssetFilter;
  }

  public void setAfbAssetFilter(AfbAssetFilter afbAssetFilter) {
    this.afbAssetFilter = afbAssetFilter;
  }

  public AfbAssetFilterAndPageFilter pageFilter(PageFilter pageFilter) {
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
    AfbAssetFilterAndPageFilter afbAssetFilterAndPageFilter = (AfbAssetFilterAndPageFilter) o;
    return Objects.equals(this.afbAssetFilter, afbAssetFilterAndPageFilter.afbAssetFilter) &&
        Objects.equals(this.pageFilter, afbAssetFilterAndPageFilter.pageFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(afbAssetFilter, pageFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AfbAssetFilterAndPageFilter {\n");
    
    sb.append("    afbAssetFilter: ").append(toIndentedString(afbAssetFilter)).append("\n");
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

