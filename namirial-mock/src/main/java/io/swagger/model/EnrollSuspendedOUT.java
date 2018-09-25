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
 * Output model for enrollment of certificates.
 */
@ApiModel(description = "Output model for enrollment of certificates.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-25T08:34:40.705Z")

public class EnrollSuspendedOUT   {
  @JsonProperty("certificateMimeType")
  private String certificateMimeType = null;

  @JsonProperty("deviceNumber")
  private String deviceNumber = null;

  @JsonProperty("enrolledCertificate")
  private String enrolledCertificate = null;

  @JsonProperty("otpId")
  private Integer otpId = null;

  public EnrollSuspendedOUT certificateMimeType(String certificateMimeType) {
    this.certificateMimeType = certificateMimeType;
    return this;
  }

  /**
   * Mime type of 'enrolledCertificate'.
   * @return certificateMimeType
  **/
  @ApiModelProperty(value = "Mime type of 'enrolledCertificate'.")


  public String getCertificateMimeType() {
    return certificateMimeType;
  }

  public void setCertificateMimeType(String certificateMimeType) {
    this.certificateMimeType = certificateMimeType;
  }

  public EnrollSuspendedOUT deviceNumber(String deviceNumber) {
    this.deviceNumber = deviceNumber;
    return this;
  }

  /**
   * deviceNumber associate with the request.
   * @return deviceNumber
  **/
  @ApiModelProperty(value = "deviceNumber associate with the request.")


  public String getDeviceNumber() {
    return deviceNumber;
  }

  public void setDeviceNumber(String deviceNumber) {
    this.deviceNumber = deviceNumber;
  }


  /**
   * Certificate producted.Associate with the request.
   * @return enrolledCertificate
  **/
  @ApiModelProperty(value = "Certificate producted.Associate with the request.")

@Pattern(regexp="^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?$") 
  public String getEnrolledCertificate() {
    return enrolledCertificate;
  }

  public void setEnrolledCertificate(String enrolledCertificate) {
    this.enrolledCertificate = enrolledCertificate;
  }

  public EnrollSuspendedOUT otpId(Integer otpId) {
    this.otpId = otpId;
    return this;
  }

  /**
   * OtpId associate with the holder.
   * @return otpId
  **/
  @ApiModelProperty(value = "OtpId associate with the holder.")


  public Integer getOtpId() {
    return otpId;
  }

  public void setOtpId(Integer otpId) {
    this.otpId = otpId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnrollSuspendedOUT enrollSuspendedOUT = (EnrollSuspendedOUT) o;
    return Objects.equals(this.certificateMimeType, enrollSuspendedOUT.certificateMimeType) &&
        Objects.equals(this.deviceNumber, enrollSuspendedOUT.deviceNumber) &&
        Objects.equals(this.enrolledCertificate, enrollSuspendedOUT.enrolledCertificate) &&
        Objects.equals(this.otpId, enrollSuspendedOUT.otpId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificateMimeType, deviceNumber, enrolledCertificate, otpId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnrollSuspendedOUT {\n");
    
    sb.append("    certificateMimeType: ").append(toIndentedString(certificateMimeType)).append("\n");
    sb.append("    deviceNumber: ").append(toIndentedString(deviceNumber)).append("\n");
    sb.append("    enrolledCertificate: ").append(toIndentedString(enrolledCertificate)).append("\n");
    sb.append("    otpId: ").append(toIndentedString(otpId)).append("\n");
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

