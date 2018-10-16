package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ImpersonationFilter;
import org.openapitools.model.PageFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ImpersonationFilterAndPageFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class ImpersonationFilterAndPageFilter   {
  @JsonProperty("impersonationFilter")
  private ImpersonationFilter impersonationFilter = null;

  @JsonProperty("pageFilter")
  private PageFilter pageFilter = null;

  public ImpersonationFilterAndPageFilter impersonationFilter(ImpersonationFilter impersonationFilter) {
    this.impersonationFilter = impersonationFilter;
    return this;
  }

  /**
   * Get impersonationFilter
   * @return impersonationFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ImpersonationFilter getImpersonationFilter() {
    return impersonationFilter;
  }

  public void setImpersonationFilter(ImpersonationFilter impersonationFilter) {
    this.impersonationFilter = impersonationFilter;
  }

  public ImpersonationFilterAndPageFilter pageFilter(PageFilter pageFilter) {
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
    ImpersonationFilterAndPageFilter impersonationFilterAndPageFilter = (ImpersonationFilterAndPageFilter) o;
    return Objects.equals(this.impersonationFilter, impersonationFilterAndPageFilter.impersonationFilter) &&
        Objects.equals(this.pageFilter, impersonationFilterAndPageFilter.pageFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(impersonationFilter, pageFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImpersonationFilterAndPageFilter {\n");
    
    sb.append("    impersonationFilter: ").append(toIndentedString(impersonationFilter)).append("\n");
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

