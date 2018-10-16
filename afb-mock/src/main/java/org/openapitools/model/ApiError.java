package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ApiError
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class ApiError   {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("transaction_id")
  private String transactionId = null;

  public ApiError code(String code) {
    this.code = code;
    return this;
  }

  /**
   * A unique identifier for the type of error.
   * @return code
  **/
  @ApiModelProperty(value = "A unique identifier for the type of error.")


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ApiError message(String message) {
    this.message = message;
    return this;
  }

  /**
   * A message explaining the error and its possible resolution
   * @return message
  **/
  @ApiModelProperty(value = "A message explaining the error and its possible resolution")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ApiError transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  /**
   * A transaction id for error response. Used to easily match an API user debugging their application to the errors on the server side, as discoverable by the operations team running the API.
   * @return transactionId
  **/
  @ApiModelProperty(value = "A transaction id for error response. Used to easily match an API user debugging their application to the errors on the server side, as discoverable by the operations team running the API.")


  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiError apiError = (ApiError) o;
    return Objects.equals(this.code, apiError.code) &&
        Objects.equals(this.message, apiError.message) &&
        Objects.equals(this.transactionId, apiError.transactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, transactionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiError {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
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

