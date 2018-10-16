package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.model.PageFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of some of {Composition} attributes and a {PageFilter}.
 */
@ApiModel(description = "A simple object composed of some of {Composition} attributes and a {PageFilter}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class CompositionFilterAndPageFilter   {
  @JsonProperty("endDate")
  private OffsetDateTime endDate = null;

  @JsonProperty("page")
  private PageFilter page = null;

  @JsonProperty("startDate")
  private OffsetDateTime startDate = null;

  public CompositionFilterAndPageFilter endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public CompositionFilterAndPageFilter page(PageFilter page) {
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

  public CompositionFilterAndPageFilter startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompositionFilterAndPageFilter compositionFilterAndPageFilter = (CompositionFilterAndPageFilter) o;
    return Objects.equals(this.endDate, compositionFilterAndPageFilter.endDate) &&
        Objects.equals(this.page, compositionFilterAndPageFilter.page) &&
        Objects.equals(this.startDate, compositionFilterAndPageFilter.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endDate, page, startDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompositionFilterAndPageFilter {\n");
    
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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

