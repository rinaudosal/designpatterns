package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SolvencyAuthorizationSearchFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SolvencyAuthorizationSearchFilter   {
  @JsonProperty("fundName")
  private String fundName = null;

  @JsonProperty("isin")
  private String isin = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("status")
  private String status = null;

  public SolvencyAuthorizationSearchFilter fundName(String fundName) {
    this.fundName = fundName;
    return this;
  }

  /**
   * The fund name to filter
   * @return fundName
  **/
  @ApiModelProperty(value = "The fund name to filter")


  public String getFundName() {
    return fundName;
  }

  public void setFundName(String fundName) {
    this.fundName = fundName;
  }

  public SolvencyAuthorizationSearchFilter isin(String isin) {
    this.isin = isin;
    return this;
  }

  /**
   * The isin to filter
   * @return isin
  **/
  @ApiModelProperty(value = "The isin to filter")


  public String getIsin() {
    return isin;
  }

  public void setIsin(String isin) {
    this.isin = isin;
  }

  public SolvencyAuthorizationSearchFilter name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name to filter (distributor or Fund Search Group)
   * @return name
  **/
  @ApiModelProperty(value = "The name to filter (distributor or Fund Search Group)")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SolvencyAuthorizationSearchFilter status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The status code to filter
   * @return status
  **/
  @ApiModelProperty(value = "The status code to filter")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SolvencyAuthorizationSearchFilter solvencyAuthorizationSearchFilter = (SolvencyAuthorizationSearchFilter) o;
    return Objects.equals(this.fundName, solvencyAuthorizationSearchFilter.fundName) &&
        Objects.equals(this.isin, solvencyAuthorizationSearchFilter.isin) &&
        Objects.equals(this.name, solvencyAuthorizationSearchFilter.name) &&
        Objects.equals(this.status, solvencyAuthorizationSearchFilter.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fundName, isin, name, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SolvencyAuthorizationSearchFilter {\n");
    
    sb.append("    fundName: ").append(toIndentedString(fundName)).append("\n");
    sb.append("    isin: ").append(toIndentedString(isin)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

