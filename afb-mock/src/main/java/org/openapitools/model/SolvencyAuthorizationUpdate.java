package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.SolvencyAuthorization;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {SolvencyAuthorization} distributor ids, an array of {SolvencyAuthorization} distributor intermediate ids, an array of {SolvencyAuthorization} fund ids and a {SolvencyStatus} code.
 */
@ApiModel(description = "A simple object composed of an array of {SolvencyAuthorization} distributor ids, an array of {SolvencyAuthorization} distributor intermediate ids, an array of {SolvencyAuthorization} fund ids and a {SolvencyStatus} code.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SolvencyAuthorizationUpdate   {
  @JsonProperty("solvencyAuthorizations")
  @Valid
  private List<SolvencyAuthorization> solvencyAuthorizations = null;

  @JsonProperty("status")
  private String status = null;

  public SolvencyAuthorizationUpdate solvencyAuthorizations(List<SolvencyAuthorization> solvencyAuthorizations) {
    this.solvencyAuthorizations = solvencyAuthorizations;
    return this;
  }

  public SolvencyAuthorizationUpdate addSolvencyAuthorizationsItem(SolvencyAuthorization solvencyAuthorizationsItem) {
    if (this.solvencyAuthorizations == null) {
      this.solvencyAuthorizations = new ArrayList<>();
    }
    this.solvencyAuthorizations.add(solvencyAuthorizationsItem);
    return this;
  }

  /**
   * The array of {SolvencyAuthorization} distributor ids
   * @return solvencyAuthorizations
  **/
  @ApiModelProperty(value = "The array of {SolvencyAuthorization} distributor ids")

  @Valid

  public List<SolvencyAuthorization> getSolvencyAuthorizations() {
    return solvencyAuthorizations;
  }

  public void setSolvencyAuthorizations(List<SolvencyAuthorization> solvencyAuthorizations) {
    this.solvencyAuthorizations = solvencyAuthorizations;
  }

  public SolvencyAuthorizationUpdate status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The status code
   * @return status
  **/
  @ApiModelProperty(value = "The status code")


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
    SolvencyAuthorizationUpdate solvencyAuthorizationUpdate = (SolvencyAuthorizationUpdate) o;
    return Objects.equals(this.solvencyAuthorizations, solvencyAuthorizationUpdate.solvencyAuthorizations) &&
        Objects.equals(this.status, solvencyAuthorizationUpdate.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(solvencyAuthorizations, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SolvencyAuthorizationUpdate {\n");
    
    sb.append("    solvencyAuthorizations: ").append(toIndentedString(solvencyAuthorizations)).append("\n");
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

