package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.EvolutionBreakdownFilter;
import org.openapitools.model.PageFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of a {EvolutionBreakdownFilter} and a {PageFilter}.
 */
@ApiModel(description = "A simple object composed of a {EvolutionBreakdownFilter} and a {PageFilter}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class EvolutionBreakdownFilterAndPageFilter   {
  @JsonProperty("evolutionBreakdownFilter")
  private EvolutionBreakdownFilter evolutionBreakdownFilter = null;

  @JsonProperty("page")
  private PageFilter page = null;

  public EvolutionBreakdownFilterAndPageFilter evolutionBreakdownFilter(EvolutionBreakdownFilter evolutionBreakdownFilter) {
    this.evolutionBreakdownFilter = evolutionBreakdownFilter;
    return this;
  }

  /**
   * Get evolutionBreakdownFilter
   * @return evolutionBreakdownFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public EvolutionBreakdownFilter getEvolutionBreakdownFilter() {
    return evolutionBreakdownFilter;
  }

  public void setEvolutionBreakdownFilter(EvolutionBreakdownFilter evolutionBreakdownFilter) {
    this.evolutionBreakdownFilter = evolutionBreakdownFilter;
  }

  public EvolutionBreakdownFilterAndPageFilter page(PageFilter page) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvolutionBreakdownFilterAndPageFilter evolutionBreakdownFilterAndPageFilter = (EvolutionBreakdownFilterAndPageFilter) o;
    return Objects.equals(this.evolutionBreakdownFilter, evolutionBreakdownFilterAndPageFilter.evolutionBreakdownFilter) &&
        Objects.equals(this.page, evolutionBreakdownFilterAndPageFilter.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evolutionBreakdownFilter, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvolutionBreakdownFilterAndPageFilter {\n");
    
    sb.append("    evolutionBreakdownFilter: ").append(toIndentedString(evolutionBreakdownFilter)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
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

