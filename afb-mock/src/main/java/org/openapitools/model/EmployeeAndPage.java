package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Employee;
import org.openapitools.model.Page;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {Employee} and a {Page}.
 */
@ApiModel(description = "A simple object composed of an array of {Employee} and a {Page}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class EmployeeAndPage   {
  @JsonProperty("employees")
  @Valid
  private List<Employee> employees = null;

  @JsonProperty("page")
  private Page page = null;

  public EmployeeAndPage employees(List<Employee> employees) {
    this.employees = employees;
    return this;
  }

  public EmployeeAndPage addEmployeesItem(Employee employeesItem) {
    if (this.employees == null) {
      this.employees = new ArrayList<>();
    }
    this.employees.add(employeesItem);
    return this;
  }

  /**
   * Get employees
   * @return employees
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Employee> getEmployees() {
    return employees;
  }

  public void setEmployees(List<Employee> employees) {
    this.employees = employees;
  }

  public EmployeeAndPage page(Page page) {
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
    EmployeeAndPage employeeAndPage = (EmployeeAndPage) o;
    return Objects.equals(this.employees, employeeAndPage.employees) &&
        Objects.equals(this.page, employeeAndPage.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employees, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeAndPage {\n");
    
    sb.append("    employees: ").append(toIndentedString(employees)).append("\n");
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

