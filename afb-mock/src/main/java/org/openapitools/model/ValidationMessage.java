package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ValidationMessage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class ValidationMessage   {
  @JsonProperty("errorCode")
  private String errorCode = null;

  /**
   * It shows the result of the validation operation. If it is an error means that there is a blocker problem. So the add/update operation is not possible. If it is a warnig means that there is a potentially harmful situation, but the add/update operation are permitted
   */
  public enum StatusEnum {
    OK("OK"),
    
    ERROR("ERROR"),
    
    WARNING("WARNING");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  public ValidationMessage errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * This field  shows the reason of the ERROR/WARNING. It will be informed only if the status of the response is ERROR/WARNING. Refer to {listErrors}
   * @return errorCode
  **/
  @ApiModelProperty(value = "This field  shows the reason of the ERROR/WARNING. It will be informed only if the status of the response is ERROR/WARNING. Refer to {listErrors}")


  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public ValidationMessage status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * It shows the result of the validation operation. If it is an error means that there is a blocker problem. So the add/update operation is not possible. If it is a warnig means that there is a potentially harmful situation, but the add/update operation are permitted
   * @return status
  **/
  @ApiModelProperty(value = "It shows the result of the validation operation. If it is an error means that there is a blocker problem. So the add/update operation is not possible. If it is a warnig means that there is a potentially harmful situation, but the add/update operation are permitted")


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
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
    ValidationMessage validationMessage = (ValidationMessage) o;
    return Objects.equals(this.errorCode, validationMessage.errorCode) &&
        Objects.equals(this.status, validationMessage.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidationMessage {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
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

