package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PageFilter;
import org.openapitools.model.PopularFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of a {PopularFilter} and a {PageFilter}.
 */
@ApiModel(description = "A simple object composed of a {PopularFilter} and a {PageFilter}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class PopularFilterAndPageFilter   {
  @JsonProperty("page")
  private PageFilter page = null;

  @JsonProperty("popular")
  private PopularFilter popular = null;

  public PopularFilterAndPageFilter page(PageFilter page) {
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

  public PopularFilterAndPageFilter popular(PopularFilter popular) {
    this.popular = popular;
    return this;
  }

  /**
   * Get popular
   * @return popular
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PopularFilter getPopular() {
    return popular;
  }

  public void setPopular(PopularFilter popular) {
    this.popular = popular;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PopularFilterAndPageFilter popularFilterAndPageFilter = (PopularFilterAndPageFilter) o;
    return Objects.equals(this.page, popularFilterAndPageFilter.page) &&
        Objects.equals(this.popular, popularFilterAndPageFilter.popular);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, popular);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PopularFilterAndPageFilter {\n");
    
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    popular: ").append(toIndentedString(popular)).append("\n");
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

