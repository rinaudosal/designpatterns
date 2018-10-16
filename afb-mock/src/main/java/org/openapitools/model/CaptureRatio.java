package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CaptureRatio
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class CaptureRatio   {
  @JsonProperty("downCaptureRatio")
  private Double downCaptureRatio = null;

  @JsonProperty("downMonth")
  private Double downMonth = null;

  @JsonProperty("downPerformance")
  private Double downPerformance = null;

  @JsonProperty("totalPerformance")
  private Double totalPerformance = null;

  @JsonProperty("upCaptureRatio")
  private Double upCaptureRatio = null;

  @JsonProperty("upMonth")
  private Double upMonth = null;

  @JsonProperty("upPerformance")
  private Double upPerformance = null;

  public CaptureRatio downCaptureRatio(Double downCaptureRatio) {
    this.downCaptureRatio = downCaptureRatio;
    return this;
  }

  /**
   * Get downCaptureRatio
   * @return downCaptureRatio
  **/
  @ApiModelProperty(value = "")


  public Double getDownCaptureRatio() {
    return downCaptureRatio;
  }

  public void setDownCaptureRatio(Double downCaptureRatio) {
    this.downCaptureRatio = downCaptureRatio;
  }

  public CaptureRatio downMonth(Double downMonth) {
    this.downMonth = downMonth;
    return this;
  }

  /**
   * Get downMonth
   * @return downMonth
  **/
  @ApiModelProperty(value = "")


  public Double getDownMonth() {
    return downMonth;
  }

  public void setDownMonth(Double downMonth) {
    this.downMonth = downMonth;
  }

  public CaptureRatio downPerformance(Double downPerformance) {
    this.downPerformance = downPerformance;
    return this;
  }

  /**
   * Get downPerformance
   * @return downPerformance
  **/
  @ApiModelProperty(value = "")


  public Double getDownPerformance() {
    return downPerformance;
  }

  public void setDownPerformance(Double downPerformance) {
    this.downPerformance = downPerformance;
  }

  public CaptureRatio totalPerformance(Double totalPerformance) {
    this.totalPerformance = totalPerformance;
    return this;
  }

  /**
   * Get totalPerformance
   * @return totalPerformance
  **/
  @ApiModelProperty(value = "")


  public Double getTotalPerformance() {
    return totalPerformance;
  }

  public void setTotalPerformance(Double totalPerformance) {
    this.totalPerformance = totalPerformance;
  }

  public CaptureRatio upCaptureRatio(Double upCaptureRatio) {
    this.upCaptureRatio = upCaptureRatio;
    return this;
  }

  /**
   * Get upCaptureRatio
   * @return upCaptureRatio
  **/
  @ApiModelProperty(value = "")


  public Double getUpCaptureRatio() {
    return upCaptureRatio;
  }

  public void setUpCaptureRatio(Double upCaptureRatio) {
    this.upCaptureRatio = upCaptureRatio;
  }

  public CaptureRatio upMonth(Double upMonth) {
    this.upMonth = upMonth;
    return this;
  }

  /**
   * Get upMonth
   * @return upMonth
  **/
  @ApiModelProperty(value = "")


  public Double getUpMonth() {
    return upMonth;
  }

  public void setUpMonth(Double upMonth) {
    this.upMonth = upMonth;
  }

  public CaptureRatio upPerformance(Double upPerformance) {
    this.upPerformance = upPerformance;
    return this;
  }

  /**
   * Get upPerformance
   * @return upPerformance
  **/
  @ApiModelProperty(value = "")


  public Double getUpPerformance() {
    return upPerformance;
  }

  public void setUpPerformance(Double upPerformance) {
    this.upPerformance = upPerformance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaptureRatio captureRatio = (CaptureRatio) o;
    return Objects.equals(this.downCaptureRatio, captureRatio.downCaptureRatio) &&
        Objects.equals(this.downMonth, captureRatio.downMonth) &&
        Objects.equals(this.downPerformance, captureRatio.downPerformance) &&
        Objects.equals(this.totalPerformance, captureRatio.totalPerformance) &&
        Objects.equals(this.upCaptureRatio, captureRatio.upCaptureRatio) &&
        Objects.equals(this.upMonth, captureRatio.upMonth) &&
        Objects.equals(this.upPerformance, captureRatio.upPerformance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(downCaptureRatio, downMonth, downPerformance, totalPerformance, upCaptureRatio, upMonth, upPerformance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaptureRatio {\n");
    
    sb.append("    downCaptureRatio: ").append(toIndentedString(downCaptureRatio)).append("\n");
    sb.append("    downMonth: ").append(toIndentedString(downMonth)).append("\n");
    sb.append("    downPerformance: ").append(toIndentedString(downPerformance)).append("\n");
    sb.append("    totalPerformance: ").append(toIndentedString(totalPerformance)).append("\n");
    sb.append("    upCaptureRatio: ").append(toIndentedString(upCaptureRatio)).append("\n");
    sb.append("    upMonth: ").append(toIndentedString(upMonth)).append("\n");
    sb.append("    upPerformance: ").append(toIndentedString(upPerformance)).append("\n");
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

