package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.EmployeeFilter;
import org.openapitools.model.PageFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed a {EmployeeFilter} and a {PageFilter}.
 */
@ApiModel(description = "A simple object composed a {EmployeeFilter} and a {PageFilter}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class EmployeeFilterAndPageFilter   {
  @JsonProperty("employeeFilter")
  private EmployeeFilter employeeFilter = null;

  @JsonProperty("pageFilter")
  private PageFilter pageFilter = null;

  public EmployeeFilterAndPageFilter employeeFilter(EmployeeFilter employeeFilter) {
    this.employeeFilter = employeeFilter;
    return this;
  }

  /**
   * Get employeeFilter
   * @return employeeFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public EmployeeFilter getEmployeeFilter() {
    return employeeFilter;
  }

  public void setEmployeeFilter(EmployeeFilter employeeFilter) {
    this.employeeFilter = employeeFilter;
  }

  public EmployeeFilterAndPageFilter pageFilter(PageFilter pageFilter) {
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
    EmployeeFilterAndPageFilter employeeFilterAndPageFilter = (EmployeeFilterAndPageFilter) o;
    return Objects.equals(this.employeeFilter, employeeFilterAndPageFilter.employeeFilter) &&
        Objects.equals(this.pageFilter, employeeFilterAndPageFilter.pageFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employeeFilter, pageFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeFilterAndPageFilter {\n");
    
    sb.append("    employeeFilter: ").append(toIndentedString(employeeFilter)).append("\n");
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

