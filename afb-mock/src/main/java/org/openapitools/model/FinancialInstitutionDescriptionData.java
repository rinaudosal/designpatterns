package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FinancialInstitutionDescriptionData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class FinancialInstitutionDescriptionData   {
  @JsonProperty("description1")
  private String description1 = null;

  @JsonProperty("description2")
  private String description2 = null;

  @JsonProperty("description3")
  private String description3 = null;

  @JsonProperty("description4")
  private String description4 = null;

  public FinancialInstitutionDescriptionData description1(String description1) {
    this.description1 = description1;
    return this;
  }

  /**
   * Description 1, according to `SWIFT` messages for Standards MT
   * @return description1
  **/
  @ApiModelProperty(value = "Description 1, according to `SWIFT` messages for Standards MT")


  public String getDescription1() {
    return description1;
  }

  public void setDescription1(String description1) {
    this.description1 = description1;
  }

  public FinancialInstitutionDescriptionData description2(String description2) {
    this.description2 = description2;
    return this;
  }

  /**
   * Description 2, according to `SWIFT` messages for Standards MT
   * @return description2
  **/
  @ApiModelProperty(value = "Description 2, according to `SWIFT` messages for Standards MT")


  public String getDescription2() {
    return description2;
  }

  public void setDescription2(String description2) {
    this.description2 = description2;
  }

  public FinancialInstitutionDescriptionData description3(String description3) {
    this.description3 = description3;
    return this;
  }

  /**
   * Description 3, according to `SWIFT` messages for Standards MT
   * @return description3
  **/
  @ApiModelProperty(value = "Description 3, according to `SWIFT` messages for Standards MT")


  public String getDescription3() {
    return description3;
  }

  public void setDescription3(String description3) {
    this.description3 = description3;
  }

  public FinancialInstitutionDescriptionData description4(String description4) {
    this.description4 = description4;
    return this;
  }

  /**
   * Description 4, according to `SWIFT` messages for Standards MT
   * @return description4
  **/
  @ApiModelProperty(value = "Description 4, according to `SWIFT` messages for Standards MT")


  public String getDescription4() {
    return description4;
  }

  public void setDescription4(String description4) {
    this.description4 = description4;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinancialInstitutionDescriptionData financialInstitutionDescriptionData = (FinancialInstitutionDescriptionData) o;
    return Objects.equals(this.description1, financialInstitutionDescriptionData.description1) &&
        Objects.equals(this.description2, financialInstitutionDescriptionData.description2) &&
        Objects.equals(this.description3, financialInstitutionDescriptionData.description3) &&
        Objects.equals(this.description4, financialInstitutionDescriptionData.description4);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description1, description2, description3, description4);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinancialInstitutionDescriptionData {\n");
    
    sb.append("    description1: ").append(toIndentedString(description1)).append("\n");
    sb.append("    description2: ").append(toIndentedString(description2)).append("\n");
    sb.append("    description3: ").append(toIndentedString(description3)).append("\n");
    sb.append("    description4: ").append(toIndentedString(description4)).append("\n");
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

