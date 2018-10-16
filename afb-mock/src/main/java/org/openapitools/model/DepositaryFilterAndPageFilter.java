package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.DepositaryFilter;
import org.openapitools.model.PageFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DepositaryFilterAndPageFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class DepositaryFilterAndPageFilter   {
  @JsonProperty("depositaryFilter")
  private DepositaryFilter depositaryFilter = null;

  @JsonProperty("page")
  private PageFilter page = null;

  public DepositaryFilterAndPageFilter depositaryFilter(DepositaryFilter depositaryFilter) {
    this.depositaryFilter = depositaryFilter;
    return this;
  }

  /**
   * Get depositaryFilter
   * @return depositaryFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DepositaryFilter getDepositaryFilter() {
    return depositaryFilter;
  }

  public void setDepositaryFilter(DepositaryFilter depositaryFilter) {
    this.depositaryFilter = depositaryFilter;
  }

  public DepositaryFilterAndPageFilter page(PageFilter page) {
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
    DepositaryFilterAndPageFilter depositaryFilterAndPageFilter = (DepositaryFilterAndPageFilter) o;
    return Objects.equals(this.depositaryFilter, depositaryFilterAndPageFilter.depositaryFilter) &&
        Objects.equals(this.page, depositaryFilterAndPageFilter.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depositaryFilter, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositaryFilterAndPageFilter {\n");
    
    sb.append("    depositaryFilter: ").append(toIndentedString(depositaryFilter)).append("\n");
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

