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
 * This object keeps information about relevant dates related to the order.
 */
@ApiModel(description = "This object keeps information about relevant dates related to the order.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class OperationDateData   {
  @JsonProperty("orderedDate")
  private OffsetDateTime orderedDate = null;

  @JsonProperty("registrationDate")
  private OffsetDateTime registrationDate = null;

  public OperationDateData orderedDate(OffsetDateTime orderedDate) {
    this.orderedDate = orderedDate;
    return this;
  }

  /**
   * The {Operation}'s ordered date
   * @return orderedDate
  **/
  @ApiModelProperty(value = "The {Operation}'s ordered date")

  @Valid

  public OffsetDateTime getOrderedDate() {
    return orderedDate;
  }

  public void setOrderedDate(OffsetDateTime orderedDate) {
    this.orderedDate = orderedDate;
  }

  public OperationDateData registrationDate(OffsetDateTime registrationDate) {
    this.registrationDate = registrationDate;
    return this;
  }

  /**
   * The {Operation}'s registration date
   * @return registrationDate
  **/
  @ApiModelProperty(value = "The {Operation}'s registration date")

  @Valid

  public OffsetDateTime getRegistrationDate() {
    return registrationDate;
  }

  public void setRegistrationDate(OffsetDateTime registrationDate) {
    this.registrationDate = registrationDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationDateData operationDateData = (OperationDateData) o;
    return Objects.equals(this.orderedDate, operationDateData.orderedDate) &&
        Objects.equals(this.registrationDate, operationDateData.registrationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderedDate, registrationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationDateData {\n");
    
    sb.append("    orderedDate: ").append(toIndentedString(orderedDate)).append("\n");
    sb.append("    registrationDate: ").append(toIndentedString(registrationDate)).append("\n");
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

