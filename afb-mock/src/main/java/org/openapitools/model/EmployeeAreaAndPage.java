package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.EmployeeArea;
import org.openapitools.model.Page;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {EmployeeArea} and a {Page}.
 */
@ApiModel(description = "A simple object composed of an array of {EmployeeArea} and a {Page}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class EmployeeAreaAndPage   {
  @JsonProperty("employeeAreas")
  @Valid
  private List<EmployeeArea> employeeAreas = null;

  @JsonProperty("page")
  private Page page = null;

  public EmployeeAreaAndPage employeeAreas(List<EmployeeArea> employeeAreas) {
    this.employeeAreas = employeeAreas;
    return this;
  }

  public EmployeeAreaAndPage addEmployeeAreasItem(EmployeeArea employeeAreasItem) {
    if (this.employeeAreas == null) {
      this.employeeAreas = new ArrayList<>();
    }
    this.employeeAreas.add(employeeAreasItem);
    return this;
  }

  /**
   * Get employeeAreas
   * @return employeeAreas
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<EmployeeArea> getEmployeeAreas() {
    return employeeAreas;
  }

  public void setEmployeeAreas(List<EmployeeArea> employeeAreas) {
    this.employeeAreas = employeeAreas;
  }

  public EmployeeAreaAndPage page(Page page) {
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
    EmployeeAreaAndPage employeeAreaAndPage = (EmployeeAreaAndPage) o;
    return Objects.equals(this.employeeAreas, employeeAreaAndPage.employeeAreas) &&
        Objects.equals(this.page, employeeAreaAndPage.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employeeAreas, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeAreaAndPage {\n");
    
    sb.append("    employeeAreas: ").append(toIndentedString(employeeAreas)).append("\n");
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

