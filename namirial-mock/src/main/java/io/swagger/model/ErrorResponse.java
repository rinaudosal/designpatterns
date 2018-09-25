package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ErrorResponse model for the documentation
 */
@ApiModel(description = "ErrorResponse model for the documentation")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-25T08:34:40.705Z")

public class ErrorResponse   {
  @JsonProperty("msg")
  private String msg = null;

  @JsonProperty("path")
  private String path = null;

  @JsonProperty("status")
  private Integer status = null;

  @JsonProperty("timestamp")
  private String timestamp = null;

  public ErrorResponse msg(String msg) {
    this.msg = msg;
    return this;
  }

  /**
   * Error message.
   * @return msg
  **/
  @ApiModelProperty(example = "Request method 'GET' not supported", value = "Error message.")


  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public ErrorResponse path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Request object.
   * @return path
  **/
  @ApiModelProperty(example = "/v1/otps/request", value = "Request object.")


  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public ErrorResponse status(Integer status) {
    this.status = status;
    return this;
  }

  /**
   * Error status.
   * @return status
  **/
  @ApiModelProperty(example = "500", value = "Error status.")


  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public ErrorResponse timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * timestamp of error
   * @return timestamp
  **/
  @ApiModelProperty(example = "2018-08-10 17:00:15.189", value = "timestamp of error")


  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorResponse errorResponse = (ErrorResponse) o;
    return Objects.equals(this.msg, errorResponse.msg) &&
        Objects.equals(this.path, errorResponse.path) &&
        Objects.equals(this.status, errorResponse.status) &&
        Objects.equals(this.timestamp, errorResponse.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(msg, path, status, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorResponse {\n");
    
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

