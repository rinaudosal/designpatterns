package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This object keeps information about specific attributes of the operatin.
 */
@ApiModel(description = "This object keeps information about specific attributes of the operatin.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class OperationSettingsData   {
  @JsonProperty("errorCode")
  private String errorCode = null;

  @JsonProperty("showDetails")
  private Boolean showDetails = null;

  @JsonProperty("statusCode")
  private String statusCode = null;

  public OperationSettingsData errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * The {Operation}. Refer to {listErrors}
   * @return errorCode
  **/
  @ApiModelProperty(value = "The {Operation}. Refer to {listErrors}")


  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public OperationSettingsData showDetails(Boolean showDetails) {
    this.showDetails = showDetails;
    return this;
  }

  /**
   * Indicates whether the operations details are available.
   * @return showDetails
  **/
  @ApiModelProperty(value = "Indicates whether the operations details are available.")


  public Boolean getShowDetails() {
    return showDetails;
  }

  public void setShowDetails(Boolean showDetails) {
    this.showDetails = showDetails;
  }

  public OperationSettingsData statusCode(String statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  /**
   * operation status code. Refer to {listTransactionStatuses}
   * @return statusCode
  **/
  @ApiModelProperty(value = "operation status code. Refer to {listTransactionStatuses}")


  public String getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationSettingsData operationSettingsData = (OperationSettingsData) o;
    return Objects.equals(this.errorCode, operationSettingsData.errorCode) &&
        Objects.equals(this.showDetails, operationSettingsData.showDetails) &&
        Objects.equals(this.statusCode, operationSettingsData.statusCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, showDetails, statusCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationSettingsData {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    showDetails: ").append(toIndentedString(showDetails)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
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

