package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.EmployeeOffice;
import org.openapitools.model.Page;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {EmployeeOffice} and a {Page}.
 */
@ApiModel(description = "A simple object composed of an array of {EmployeeOffice} and a {Page}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class EmployeeOfficeAndPage   {
  @JsonProperty("employeeOffices")
  @Valid
  private List<EmployeeOffice> employeeOffices = null;

  @JsonProperty("page")
  private Page page = null;

  public EmployeeOfficeAndPage employeeOffices(List<EmployeeOffice> employeeOffices) {
    this.employeeOffices = employeeOffices;
    return this;
  }

  public EmployeeOfficeAndPage addEmployeeOfficesItem(EmployeeOffice employeeOfficesItem) {
    if (this.employeeOffices == null) {
      this.employeeOffices = new ArrayList<>();
    }
    this.employeeOffices.add(employeeOfficesItem);
    return this;
  }

  /**
   * Get employeeOffices
   * @return employeeOffices
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<EmployeeOffice> getEmployeeOffices() {
    return employeeOffices;
  }

  public void setEmployeeOffices(List<EmployeeOffice> employeeOffices) {
    this.employeeOffices = employeeOffices;
  }

  public EmployeeOfficeAndPage page(Page page) {
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
    EmployeeOfficeAndPage employeeOfficeAndPage = (EmployeeOfficeAndPage) o;
    return Objects.equals(this.employeeOffices, employeeOfficeAndPage.employeeOffices) &&
        Objects.equals(this.page, employeeOfficeAndPage.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employeeOffices, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeOfficeAndPage {\n");
    
    sb.append("    employeeOffices: ").append(toIndentedString(employeeOffices)).append("\n");
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

