package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.DistributorFilter;
import org.openapitools.model.PageFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DistributorFilterAndPageFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class DistributorFilterAndPageFilter   {
  @JsonProperty("distributorFilter")
  private DistributorFilter distributorFilter = null;

  @JsonProperty("page")
  private PageFilter page = null;

  public DistributorFilterAndPageFilter distributorFilter(DistributorFilter distributorFilter) {
    this.distributorFilter = distributorFilter;
    return this;
  }

  /**
   * Get distributorFilter
   * @return distributorFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DistributorFilter getDistributorFilter() {
    return distributorFilter;
  }

  public void setDistributorFilter(DistributorFilter distributorFilter) {
    this.distributorFilter = distributorFilter;
  }

  public DistributorFilterAndPageFilter page(PageFilter page) {
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
    DistributorFilterAndPageFilter distributorFilterAndPageFilter = (DistributorFilterAndPageFilter) o;
    return Objects.equals(this.distributorFilter, distributorFilterAndPageFilter.distributorFilter) &&
        Objects.equals(this.page, distributorFilterAndPageFilter.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distributorFilter, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DistributorFilterAndPageFilter {\n");
    
    sb.append("    distributorFilter: ").append(toIndentedString(distributorFilter)).append("\n");
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

