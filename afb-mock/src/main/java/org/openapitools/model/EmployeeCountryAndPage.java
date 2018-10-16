package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.EmployeeCountry;
import org.openapitools.model.Page;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {EmployeeCountry} and a {Page}.
 */
@ApiModel(description = "A simple object composed of an array of {EmployeeCountry} and a {Page}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class EmployeeCountryAndPage   {
  @JsonProperty("employeeCountries")
  @Valid
  private List<EmployeeCountry> employeeCountries = null;

  @JsonProperty("page")
  private Page page = null;

  public EmployeeCountryAndPage employeeCountries(List<EmployeeCountry> employeeCountries) {
    this.employeeCountries = employeeCountries;
    return this;
  }

  public EmployeeCountryAndPage addEmployeeCountriesItem(EmployeeCountry employeeCountriesItem) {
    if (this.employeeCountries == null) {
      this.employeeCountries = new ArrayList<>();
    }
    this.employeeCountries.add(employeeCountriesItem);
    return this;
  }

  /**
   * Get employeeCountries
   * @return employeeCountries
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<EmployeeCountry> getEmployeeCountries() {
    return employeeCountries;
  }

  public void setEmployeeCountries(List<EmployeeCountry> employeeCountries) {
    this.employeeCountries = employeeCountries;
  }

  public EmployeeCountryAndPage page(Page page) {
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
    EmployeeCountryAndPage employeeCountryAndPage = (EmployeeCountryAndPage) o;
    return Objects.equals(this.employeeCountries, employeeCountryAndPage.employeeCountries) &&
        Objects.equals(this.page, employeeCountryAndPage.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employeeCountries, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeCountryAndPage {\n");
    
    sb.append("    employeeCountries: ").append(toIndentedString(employeeCountries)).append("\n");
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

