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
 * WhiteListItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class WhiteListItem   {
  @JsonProperty("endDate")
  private OffsetDateTime endDate = null;

  @JsonProperty("percentage")
  private Double percentage = null;

  @JsonProperty("startDate")
  private OffsetDateTime startDate = null;

  public WhiteListItem endDate(OffsetDateTime endDate) {
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

  public WhiteListItem percentage(Double percentage) {
    this.percentage = percentage;
    return this;
  }

  /**
   * Get percentage
   * @return percentage
  **/
  @ApiModelProperty(value = "")


  public Double getPercentage() {
    return percentage;
  }

  public void setPercentage(Double percentage) {
    this.percentage = percentage;
  }

  public WhiteListItem startDate(OffsetDateTime startDate) {
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
    WhiteListItem whiteListItem = (WhiteListItem) o;
    return Objects.equals(this.endDate, whiteListItem.endDate) &&
        Objects.equals(this.percentage, whiteListItem.percentage) &&
        Objects.equals(this.startDate, whiteListItem.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endDate, percentage, startDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhiteListItem {\n");
    
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
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

