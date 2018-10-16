package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.EmployeeCompany;
import org.openapitools.model.Page;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {EmployeeCompany} and a {Page}.
 */
@ApiModel(description = "A simple object composed of an array of {EmployeeCompany} and a {Page}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class EmployeeCompanyAndPage   {
  @JsonProperty("employeeCompanies")
  @Valid
  private List<EmployeeCompany> employeeCompanies = null;

  @JsonProperty("page")
  private Page page = null;

  public EmployeeCompanyAndPage employeeCompanies(List<EmployeeCompany> employeeCompanies) {
    this.employeeCompanies = employeeCompanies;
    return this;
  }

  public EmployeeCompanyAndPage addEmployeeCompaniesItem(EmployeeCompany employeeCompaniesItem) {
    if (this.employeeCompanies == null) {
      this.employeeCompanies = new ArrayList<>();
    }
    this.employeeCompanies.add(employeeCompaniesItem);
    return this;
  }

  /**
   * Get employeeCompanies
   * @return employeeCompanies
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<EmployeeCompany> getEmployeeCompanies() {
    return employeeCompanies;
  }

  public void setEmployeeCompanies(List<EmployeeCompany> employeeCompanies) {
    this.employeeCompanies = employeeCompanies;
  }

  public EmployeeCompanyAndPage page(Page page) {
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
    EmployeeCompanyAndPage employeeCompanyAndPage = (EmployeeCompanyAndPage) o;
    return Objects.equals(this.employeeCompanies, employeeCompanyAndPage.employeeCompanies) &&
        Objects.equals(this.page, employeeCompanyAndPage.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employeeCompanies, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeCompanyAndPage {\n");
    
    sb.append("    employeeCompanies: ").append(toIndentedString(employeeCompanies)).append("\n");
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

