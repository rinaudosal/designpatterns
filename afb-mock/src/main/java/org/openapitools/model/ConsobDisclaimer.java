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
 * ConsobDisclaimer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class ConsobDisclaimer   {
  @JsonProperty("endDate")
  private OffsetDateTime endDate = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("startDate")
  private OffsetDateTime startDate = null;

  public ConsobDisclaimer endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public ConsobDisclaimer message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ConsobDisclaimer startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsobDisclaimer consobDisclaimer = (ConsobDisclaimer) o;
    return Objects.equals(this.endDate, consobDisclaimer.endDate) &&
        Objects.equals(this.message, consobDisclaimer.message) &&
        Objects.equals(this.startDate, consobDisclaimer.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endDate, message, startDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsobDisclaimer {\n");
    
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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

