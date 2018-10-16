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

public class OperationalPortfolioOrderSettingsData   {
  @JsonProperty("errorCode")
  private String errorCode = null;

  @JsonProperty("statusOrderCode")
  private String statusOrderCode = null;

  public OperationalPortfolioOrderSettingsData errorCode(String errorCode) {
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

  public OperationalPortfolioOrderSettingsData statusOrderCode(String statusOrderCode) {
    this.statusOrderCode = statusOrderCode;
    return this;
  }

  /**
   * Operational portfolio order status. Refer to {listOperationalPortfolioOrderStatuses}
   * @return statusOrderCode
  **/
  @ApiModelProperty(value = "Operational portfolio order status. Refer to {listOperationalPortfolioOrderStatuses}")


  public String getStatusOrderCode() {
    return statusOrderCode;
  }

  public void setStatusOrderCode(String statusOrderCode) {
    this.statusOrderCode = statusOrderCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationalPortfolioOrderSettingsData operationalPortfolioOrderSettingsData = (OperationalPortfolioOrderSettingsData) o;
    return Objects.equals(this.errorCode, operationalPortfolioOrderSettingsData.errorCode) &&
        Objects.equals(this.statusOrderCode, operationalPortfolioOrderSettingsData.statusOrderCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, statusOrderCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationalPortfolioOrderSettingsData {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    statusOrderCode: ").append(toIndentedString(statusOrderCode)).append("\n");
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

