package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.EmployeeDepartment;
import org.openapitools.model.Page;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {EmployeeDepartment} and a {Page}.
 */
@ApiModel(description = "A simple object composed of an array of {EmployeeDepartment} and a {Page}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class EmployeeDepartmentAndPage   {
  @JsonProperty("employeeDepartments")
  @Valid
  private List<EmployeeDepartment> employeeDepartments = null;

  @JsonProperty("page")
  private Page page = null;

  public EmployeeDepartmentAndPage employeeDepartments(List<EmployeeDepartment> employeeDepartments) {
    this.employeeDepartments = employeeDepartments;
    return this;
  }

  public EmployeeDepartmentAndPage addEmployeeDepartmentsItem(EmployeeDepartment employeeDepartmentsItem) {
    if (this.employeeDepartments == null) {
      this.employeeDepartments = new ArrayList<>();
    }
    this.employeeDepartments.add(employeeDepartmentsItem);
    return this;
  }

  /**
   * Get employeeDepartments
   * @return employeeDepartments
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<EmployeeDepartment> getEmployeeDepartments() {
    return employeeDepartments;
  }

  public void setEmployeeDepartments(List<EmployeeDepartment> employeeDepartments) {
    this.employeeDepartments = employeeDepartments;
  }

  public EmployeeDepartmentAndPage page(Page page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   * @return page
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Page getPage() {
    return page;
  }

  public void setPage(Page page) {
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
    EmployeeDepartmentAndPage employeeDepartmentAndPage = (EmployeeDepartmentAndPage) o;
    return Objects.equals(this.employeeDepartments, employeeDepartmentAndPage.employeeDepartments) &&
        Objects.equals(this.page, employeeDepartmentAndPage.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employeeDepartments, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeDepartmentAndPage {\n");
    
    sb.append("    employeeDepartments: ").append(toIndentedString(employeeDepartments)).append("\n");
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

