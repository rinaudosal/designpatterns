package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.PageFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed a by a list of Isin and a {PageFilter}.
 */
@ApiModel(description = "A simple object composed a by a list of Isin and a {PageFilter}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SolvencyAuthorizationByIsinAndPageFilter   {
  @JsonProperty("isins")
  @Valid
  private List<String> isins = null;

  @JsonProperty("pageFilter")
  private PageFilter pageFilter = null;

  public SolvencyAuthorizationByIsinAndPageFilter isins(List<String> isins) {
    this.isins = isins;
    return this;
  }

  public SolvencyAuthorizationByIsinAndPageFilter addIsinsItem(String isinsItem) {
    if (this.isins == null) {
      this.isins = new ArrayList<>();
    }
    this.isins.add(isinsItem);
    return this;
  }

  /**
   * The array of fund isin
   * @return isins
  **/
  @ApiModelProperty(value = "The array of fund isin")


  public List<String> getIsins() {
    return isins;
  }

  public void setIsins(List<String> isins) {
    this.isins = isins;
  }

  public SolvencyAuthorizationByIsinAndPageFilter pageFilter(PageFilter pageFilter) {
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
    SolvencyAuthorizationByIsinAndPageFilter solvencyAuthorizationByIsinAndPageFilter = (SolvencyAuthorizationByIsinAndPageFilter) o;
    return Objects.equals(this.isins, solvencyAuthorizationByIsinAndPageFilter.isins) &&
        Objects.equals(this.pageFilter, solvencyAuthorizationByIsinAndPageFilter.pageFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isins, pageFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SolvencyAuthorizationByIsinAndPageFilter {\n");
    
    sb.append("    isins: ").append(toIndentedString(isins)).append("\n");
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

