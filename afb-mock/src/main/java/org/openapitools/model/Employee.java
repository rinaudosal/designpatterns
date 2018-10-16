package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.model.ResourceReference;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Employee
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class Employee   {
  @JsonProperty("areaId")
  private String areaId = null;

  @JsonProperty("areaName")
  private String areaName = null;

  @JsonProperty("companyId")
  private String companyId = null;

  @JsonProperty("companyName")
  private String companyName = null;

  @JsonProperty("countryId")
  private String countryId = null;

  @JsonProperty("countryName")
  private String countryName = null;

  @JsonProperty("departmentId")
  private String departmentId = null;

  @JsonProperty("departmentName")
  private String departmentName = null;

  @JsonProperty("email")
  private String email = null;

  /**
   * The {Employee}'s type.
   */
  public enum EmployeeTypeCodeEnum {
    NA("NA"),
    
    INTERNSHIP("INTERNSHIP"),
    
    CONTRACTOR("CONTRACTOR"),
    
    EMPLOYEE("EMPLOYEE");

    private String value;

    EmployeeTypeCodeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EmployeeTypeCodeEnum fromValue(String text) {
      for (EmployeeTypeCodeEnum b : EmployeeTypeCodeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("employeeTypeCode")
  private EmployeeTypeCodeEnum employeeTypeCode = null;

  @JsonProperty("endDate")
  private OffsetDateTime endDate = null;

  /**
   * The Id of the gender (defined as java enumerable)
   */
  public enum GenderCodeEnum {
    MALE("MALE"),
    
    FEMALE("FEMALE"),
    
    NA("NA");

    private String value;

    GenderCodeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static GenderCodeEnum fromValue(String text) {
      for (GenderCodeEnum b : GenderCodeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("genderCode")
  private GenderCodeEnum genderCode = null;

  @JsonProperty("globalName")
  private String globalName = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("imageUrl")
  private ResourceReference imageUrl = null;

  @JsonProperty("mobilePhone")
  private String mobilePhone = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("officeId")
  private String officeId = null;

  @JsonProperty("officeName")
  private String officeName = null;

  @JsonProperty("phone")
  private String phone = null;

  @JsonProperty("startDate")
  private OffsetDateTime startDate = null;

  @JsonProperty("surname")
  private String surname = null;

  public Employee areaId(String areaId) {
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

  public Employee areaName(String areaName) {
    this.areaName = areaName;
    return this;
  }

  /**
   * The {Employee}'s area name.
   * @return areaName
  **/
  @ApiModelProperty(value = "The {Employee}'s area name.")


  public String getAreaName() {
    return areaName;
  }

  public void setAreaName(String areaName) {
    this.areaName = areaName;
  }

  public Employee companyId(String companyId) {
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

  public Employee companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

  /**
   * The {Employee}'s company name.
   * @return companyName
  **/
  @ApiModelProperty(value = "The {Employee}'s company name.")


  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public Employee countryId(String countryId) {
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

  public Employee countryName(String countryName) {
    this.countryName = countryName;
    return this;
  }

  /**
   * The {Employee}'s country name.
   * @return countryName
  **/
  @ApiModelProperty(value = "The {Employee}'s country name.")


  public String getCountryName() {
    return countryName;
  }

  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }

  public Employee departmentId(String departmentId) {
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

  public Employee departmentName(String departmentName) {
    this.departmentName = departmentName;
    return this;
  }

  /**
   * The {Employee}'s department name.
   * @return departmentName
  **/
  @ApiModelProperty(value = "The {Employee}'s department name.")


  public String getDepartmentName() {
    return departmentName;
  }

  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }

  public Employee email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The {Employee}'s email.
   * @return email
  **/
  @ApiModelProperty(value = "The {Employee}'s email.")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Employee employeeTypeCode(EmployeeTypeCodeEnum employeeTypeCode) {
    this.employeeTypeCode = employeeTypeCode;
    return this;
  }

  /**
   * The {Employee}'s type.
   * @return employeeTypeCode
  **/
  @ApiModelProperty(value = "The {Employee}'s type.")


  public EmployeeTypeCodeEnum getEmployeeTypeCode() {
    return employeeTypeCode;
  }

  public void setEmployeeTypeCode(EmployeeTypeCodeEnum employeeTypeCode) {
    this.employeeTypeCode = employeeTypeCode;
  }

  public Employee endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * The {Employee}'s end date.
   * @return endDate
  **/
  @ApiModelProperty(value = "The {Employee}'s end date.")

  @Valid

  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public Employee genderCode(GenderCodeEnum genderCode) {
    this.genderCode = genderCode;
    return this;
  }

  /**
   * The Id of the gender (defined as java enumerable)
   * @return genderCode
  **/
  @ApiModelProperty(value = "The Id of the gender (defined as java enumerable)")


  public GenderCodeEnum getGenderCode() {
    return genderCode;
  }

  public void setGenderCode(GenderCodeEnum genderCode) {
    this.genderCode = genderCode;
  }

  public Employee globalName(String globalName) {
    this.globalName = globalName;
    return this;
  }

  /**
   * The {Employee}'s global name.
   * @return globalName
  **/
  @ApiModelProperty(value = "The {Employee}'s global name.")


  public String getGlobalName() {
    return globalName;
  }

  public void setGlobalName(String globalName) {
    this.globalName = globalName;
  }

  public Employee id(String id) {
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

  public Employee imageUrl(ResourceReference imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * Get imageUrl
   * @return imageUrl
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ResourceReference getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(ResourceReference imageUrl) {
    this.imageUrl = imageUrl;
  }

  public Employee mobilePhone(String mobilePhone) {
    this.mobilePhone = mobilePhone;
    return this;
  }

  /**
   * The {Employee}'s mobile phone number.
   * @return mobilePhone
  **/
  @ApiModelProperty(value = "The {Employee}'s mobile phone number.")


  public String getMobilePhone() {
    return mobilePhone;
  }

  public void setMobilePhone(String mobilePhone) {
    this.mobilePhone = mobilePhone;
  }

  public Employee name(String name) {
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

  public Employee officeId(String officeId) {
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

  public Employee officeName(String officeName) {
    this.officeName = officeName;
    return this;
  }

  /**
   * The {Employee}'s office name.
   * @return officeName
  **/
  @ApiModelProperty(value = "The {Employee}'s office name.")


  public String getOfficeName() {
    return officeName;
  }

  public void setOfficeName(String officeName) {
    this.officeName = officeName;
  }

  public Employee phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * The {Employee}'s phone number.
   * @return phone
  **/
  @ApiModelProperty(value = "The {Employee}'s phone number.")


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Employee startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * The {Employee}'s start date.
   * @return startDate
  **/
  @ApiModelProperty(value = "The {Employee}'s start date.")

  @Valid

  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public Employee surname(String surname) {
    this.surname = surname;
    return this;
  }

  /**
   * The {Employee}'s surname.
   * @return surname
  **/
  @ApiModelProperty(value = "The {Employee}'s surname.")


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
    Employee employee = (Employee) o;
    return Objects.equals(this.areaId, employee.areaId) &&
        Objects.equals(this.areaName, employee.areaName) &&
        Objects.equals(this.companyId, employee.companyId) &&
        Objects.equals(this.companyName, employee.companyName) &&
        Objects.equals(this.countryId, employee.countryId) &&
        Objects.equals(this.countryName, employee.countryName) &&
        Objects.equals(this.departmentId, employee.departmentId) &&
        Objects.equals(this.departmentName, employee.departmentName) &&
        Objects.equals(this.email, employee.email) &&
        Objects.equals(this.employeeTypeCode, employee.employeeTypeCode) &&
        Objects.equals(this.endDate, employee.endDate) &&
        Objects.equals(this.genderCode, employee.genderCode) &&
        Objects.equals(this.globalName, employee.globalName) &&
        Objects.equals(this.id, employee.id) &&
        Objects.equals(this.imageUrl, employee.imageUrl) &&
        Objects.equals(this.mobilePhone, employee.mobilePhone) &&
        Objects.equals(this.name, employee.name) &&
        Objects.equals(this.officeId, employee.officeId) &&
        Objects.equals(this.officeName, employee.officeName) &&
        Objects.equals(this.phone, employee.phone) &&
        Objects.equals(this.startDate, employee.startDate) &&
        Objects.equals(this.surname, employee.surname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(areaId, areaName, companyId, companyName, countryId, countryName, departmentId, departmentName, email, employeeTypeCode, endDate, genderCode, globalName, id, imageUrl, mobilePhone, name, officeId, officeName, phone, startDate, surname);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Employee {\n");
    
    sb.append("    areaId: ").append(toIndentedString(areaId)).append("\n");
    sb.append("    areaName: ").append(toIndentedString(areaName)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    countryId: ").append(toIndentedString(countryId)).append("\n");
    sb.append("    countryName: ").append(toIndentedString(countryName)).append("\n");
    sb.append("    departmentId: ").append(toIndentedString(departmentId)).append("\n");
    sb.append("    departmentName: ").append(toIndentedString(departmentName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    employeeTypeCode: ").append(toIndentedString(employeeTypeCode)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    genderCode: ").append(toIndentedString(genderCode)).append("\n");
    sb.append("    globalName: ").append(toIndentedString(globalName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    mobilePhone: ").append(toIndentedString(mobilePhone)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
    sb.append("    officeName: ").append(toIndentedString(officeName)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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

