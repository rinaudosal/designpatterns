package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This is the object that was composed by all the allowed filters for the {Employee}&#39;s search.
 */
@ApiModel(description = "This is the object that was composed by all the allowed filters for the {Employee}'s search.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class EmployeeFilter   {
  @JsonProperty("areaId")
  private String areaId = null;

  @JsonProperty("companyId")
  private String companyId = null;

  @JsonProperty("countryId")
  private String countryId = null;

  @JsonProperty("departmentId")
  private String departmentId = null;

  @JsonProperty("endDateFrom")
  private OffsetDateTime endDateFrom = null;

  @JsonProperty("endDateTo")
  private OffsetDateTime endDateTo = null;

  @JsonProperty("globalName")
  private String globalName = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("officeId")
  private String officeId = null;

  @JsonProperty("startDateFrom")
  private OffsetDateTime startDateFrom = null;

  @JsonProperty("startDateTo")
  private OffsetDateTime startDateTo = null;

  @JsonProperty("surname")
  private String surname = null;

  public EmployeeFilter areaId(String areaId) {
    this.areaId = areaId;
    return this;
  }

  /**
   * The Id of the area
   * @return areaId
  **/
  @ApiModelProperty(value = "The Id of the area")


  public String getAreaId() {
    return areaId;
  }

  public void setAreaId(String areaId) {
    this.areaId = areaId;
  }

  public EmployeeFilter companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * The Id of the company
   * @return companyId
  **/
  @ApiModelProperty(value = "The Id of the company")


  public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }

  public EmployeeFilter countryId(String countryId) {
    this.countryId = countryId;
    return this;
  }

  /**
   * The Id of the country
   * @return countryId
  **/
  @ApiModelProperty(value = "The Id of the country")


  public String getCountryId() {
    return countryId;
  }

  public void setCountryId(String countryId) {
    this.countryId = countryId;
  }

  public EmployeeFilter departmentId(String departmentId) {
    this.departmentId = departmentId;
    return this;
  }

  /**
   * The Id of the department
   * @return departmentId
  **/
  @ApiModelProperty(value = "The Id of the department")


  public String getDepartmentId() {
    return departmentId;
  }

  public void setDepartmentId(String departmentId) {
    this.departmentId = departmentId;
  }

  public EmployeeFilter endDateFrom(OffsetDateTime endDateFrom) {
    this.endDateFrom = endDateFrom;
    return this;
  }

  /**
   * The {Employee}'s end date from.
   * @return endDateFrom
  **/
  @ApiModelProperty(value = "The {Employee}'s end date from.")

  @Valid

  public OffsetDateTime getEndDateFrom() {
    return endDateFrom;
  }

  public void setEndDateFrom(OffsetDateTime endDateFrom) {
    this.endDateFrom = endDateFrom;
  }

  public EmployeeFilter endDateTo(OffsetDateTime endDateTo) {
    this.endDateTo = endDateTo;
    return this;
  }

  /**
   * The {Employee}'s end date to.
   * @return endDateTo
  **/
  @ApiModelProperty(value = "The {Employee}'s end date to.")

  @Valid

  public OffsetDateTime getEndDateTo() {
    return endDateTo;
  }

  public void setEndDateTo(OffsetDateTime endDateTo) {
    this.endDateTo = endDateTo;
  }

  public EmployeeFilter globalName(String globalName) {
    this.globalName = globalName;
    return this;
  }

  /**
   * The {Employee}'s full name.
   * @return globalName
  **/
  @ApiModelProperty(value = "The {Employee}'s full name.")


  public String getGlobalName() {
    return globalName;
  }

  public void setGlobalName(String globalName) {
    this.globalName = globalName;
  }

  public EmployeeFilter id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The Id of the {Employee}
   * @return id
  **/
  @ApiModelProperty(value = "The Id of the {Employee}")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public EmployeeFilter name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The {Employee}'s name.
   * @return name
  **/
  @ApiModelProperty(value = "The {Employee}'s name.")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EmployeeFilter officeId(String officeId) {
    this.officeId = officeId;
    return this;
  }

  /**
   * The Id of the office
   * @return officeId
  **/
  @ApiModelProperty(value = "The Id of the office")


  public String getOfficeId() {
    return officeId;
  }

  public void setOfficeId(String officeId) {
    this.officeId = officeId;
  }

  public EmployeeFilter startDateFrom(OffsetDateTime startDateFrom) {
    this.startDateFrom = startDateFrom;
    return this;
  }

  /**
   * The {Employee}'s start date from.
   * @return startDateFrom
  **/
  @ApiModelProperty(value = "The {Employee}'s start date from.")

  @Valid

  public OffsetDateTime getStartDateFrom() {
    return startDateFrom;
  }

  public void setStartDateFrom(OffsetDateTime startDateFrom) {
    this.startDateFrom = startDateFrom;
  }

  public EmployeeFilter startDateTo(OffsetDateTime startDateTo) {
    this.startDateTo = startDateTo;
    return this;
  }

  /**
   * The {Employee}'s start date to.
   * @return startDateTo
  **/
  @ApiModelProperty(value = "The {Employee}'s start date to.")

  @Valid

  public OffsetDateTime getStartDateTo() {
    return startDateTo;
  }

  public void setStartDateTo(OffsetDateTime startDateTo) {
    this.startDateTo = startDateTo;
  }

  public EmployeeFilter surname(String surname) {
    this.surname = surname;
    return this;
  }

  /**
   * The {Employee}'s first surname.
   * @return surname
  **/
  @ApiModelProperty(value = "The {Employee}'s first surname.")


  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeeFilter employeeFilter = (EmployeeFilter) o;
    return Objects.equals(this.areaId, employeeFilter.areaId) &&
        Objects.equals(this.companyId, employeeFilter.companyId) &&
        Objects.equals(this.countryId, employeeFilter.countryId) &&
        Objects.equals(this.departmentId, employeeFilter.departmentId) &&
        Objects.equals(this.endDateFrom, employeeFilter.endDateFrom) &&
        Objects.equals(this.endDateTo, employeeFilter.endDateTo) &&
        Objects.equals(this.globalName, employeeFilter.globalName) &&
        Objects.equals(this.id, employeeFilter.id) &&
        Objects.equals(this.name, employeeFilter.name) &&
        Objects.equals(this.officeId, employeeFilter.officeId) &&
        Objects.equals(this.startDateFrom, employeeFilter.startDateFrom) &&
        Objects.equals(this.startDateTo, employeeFilter.startDateTo) &&
        Objects.equals(this.surname, employeeFilter.surname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(areaId, companyId, countryId, departmentId, endDateFrom, endDateTo, globalName, id, name, officeId, startDateFrom, startDateTo, surname);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeFilter {\n");
    
    sb.append("    areaId: ").append(toIndentedString(areaId)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    countryId: ").append(toIndentedString(countryId)).append("\n");
    sb.append("    departmentId: ").append(toIndentedString(departmentId)).append("\n");
    sb.append("    endDateFrom: ").append(toIndentedString(endDateFrom)).append("\n");
    sb.append("    endDateTo: ").append(toIndentedString(endDateTo)).append("\n");
    sb.append("    globalName: ").append(toIndentedString(globalName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
    sb.append("    startDateFrom: ").append(toIndentedString(startDateFrom)).append("\n");
    sb.append("    startDateTo: ").append(toIndentedString(startDateTo)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
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

