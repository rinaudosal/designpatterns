package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AfbCurrencyFilter;
import org.openapitools.model.PageFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AfbCurrencyFilterAndPageFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class AfbCurrencyFilterAndPageFilter   {
  @JsonProperty("afbCurrencyFilter")
  private AfbCurrencyFilter afbCurrencyFilter = null;

  @JsonProperty("pageFilter")
  private PageFilter pageFilter = null;

  public AfbCurrencyFilterAndPageFilter afbCurrencyFilter(AfbCurrencyFilter afbCurrencyFilter) {
    this.afbCurrencyFilter = afbCurrencyFilter;
    return this;
  }

  /**
   * Get afbCurrencyFilter
   * @return afbCurrencyFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AfbCurrencyFilter getAfbCurrencyFilter() {
    return afbCurrencyFilter;
  }

  public void setAfbCurrencyFilter(AfbCurrencyFilter afbCurrencyFilter) {
    this.afbCurrencyFilter = afbCurrencyFilter;
  }

  public AfbCurrencyFilterAndPageFilter pageFilter(PageFilter pageFilter) {
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
    AfbCurrencyFilterAndPageFilter afbCurrencyFilterAndPageFilter = (AfbCurrencyFilterAndPageFilter) o;
    return Objects.equals(this.afbCurrencyFilter, afbCurrencyFilterAndPageFilter.afbCurrencyFilter) &&
        Objects.equals(this.pageFilter, afbCurrencyFilterAndPageFilter.pageFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(afbCurrencyFilter, pageFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AfbCurrencyFilterAndPageFilter {\n");
    
    sb.append("    afbCurrencyFilter: ").append(toIndentedString(afbCurrencyFilter)).append("\n");
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

