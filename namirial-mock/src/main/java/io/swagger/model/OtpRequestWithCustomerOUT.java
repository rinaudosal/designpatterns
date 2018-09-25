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
 * Output model for the request of the first otp
 */
@ApiModel(description = "Output model for the request of the first otp")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-25T08:34:40.705Z")

public class OtpRequestWithCustomerOUT   {
  @JsonProperty("holderId")
  private Integer holderId = null;

  @JsonProperty("requestId")
  private String requestId = null;

  public OtpRequestWithCustomerOUT holderId(Integer holderId) {
    this.holderId = holderId;
    return this;
  }

  /**
   * holderId
   * @return holderId
  **/
  @ApiModelProperty(example = "123456", value = "holderId")


  public Integer getHolderId() {
    return holderId;
  }

  public void setHolderId(Integer holderId) {
    this.holderId = holderId;
  }

  public OtpRequestWithCustomerOUT requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

  /**
   * requestId
   * @return requestId
  **/
  @ApiModelProperty(example = "RECN2018080874219574", value = "requestId")


  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OtpRequestWithCustomerOUT otpRequestWithCustomerOUT = (OtpRequestWithCustomerOUT) o;
    return Objects.equals(this.holderId, otpRequestWithCustomerOUT.holderId) &&
        Objects.equals(this.requestId, otpRequestWithCustomerOUT.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(holderId, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtpRequestWithCustomerOUT {\n");
    
    sb.append("    holderId: ").append(toIndentedString(holderId)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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

