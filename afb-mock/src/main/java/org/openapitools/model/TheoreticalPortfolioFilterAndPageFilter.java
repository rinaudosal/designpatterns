package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PageFilter;
import org.openapitools.model.TheoreticalPortfolioFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of a {TheoreticalPortfolioFilter} and a {PageFilter}.
 */
@ApiModel(description = "A simple object composed of a {TheoreticalPortfolioFilter} and a {PageFilter}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class TheoreticalPortfolioFilterAndPageFilter   {
  @JsonProperty("page")
  private PageFilter page = null;

  @JsonProperty("theoreticalPortfolioFilter")
  private TheoreticalPortfolioFilter theoreticalPortfolioFilter = null;

  public TheoreticalPortfolioFilterAndPageFilter page(PageFilter page) {
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

  public TheoreticalPortfolioFilterAndPageFilter theoreticalPortfolioFilter(TheoreticalPortfolioFilter theoreticalPortfolioFilter) {
    this.theoreticalPortfolioFilter = theoreticalPortfolioFilter;
    return this;
  }

  /**
   * Get theoreticalPortfolioFilter
   * @return theoreticalPortfolioFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public TheoreticalPortfolioFilter getTheoreticalPortfolioFilter() {
    return theoreticalPortfolioFilter;
  }

  public void setTheoreticalPortfolioFilter(TheoreticalPortfolioFilter theoreticalPortfolioFilter) {
    this.theoreticalPortfolioFilter = theoreticalPortfolioFilter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TheoreticalPortfolioFilterAndPageFilter theoreticalPortfolioFilterAndPageFilter = (TheoreticalPortfolioFilterAndPageFilter) o;
    return Objects.equals(this.page, theoreticalPortfolioFilterAndPageFilter.page) &&
        Objects.equals(this.theoreticalPortfolioFilter, theoreticalPortfolioFilterAndPageFilter.theoreticalPortfolioFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, theoreticalPortfolioFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TheoreticalPortfolioFilterAndPageFilter {\n");
    
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    theoreticalPortfolioFilter: ").append(toIndentedString(theoreticalPortfolioFilter)).append("\n");
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

