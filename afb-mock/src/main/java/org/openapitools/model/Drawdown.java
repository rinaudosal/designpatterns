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
 * Drawdown
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class Drawdown   {
  @JsonProperty("endDate")
  private OffsetDateTime endDate = null;

  @JsonProperty("numberOfMonthToLength")
  private Double numberOfMonthToLength = null;

  @JsonProperty("numberOfMonthToRecovery")
  private Double numberOfMonthToRecovery = null;

  @JsonProperty("startDate")
  private OffsetDateTime startDate = null;

  @JsonProperty("value")
  private Double value = null;

  public Drawdown endDate(OffsetDateTime endDate) {
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

  public Drawdown numberOfMonthToLength(Double numberOfMonthToLength) {
    this.numberOfMonthToLength = numberOfMonthToLength;
    return this;
  }

  /**
   * Get numberOfMonthToLength
   * @return numberOfMonthToLength
  **/
  @ApiModelProperty(value = "")


  public Double getNumberOfMonthToLength() {
    return numberOfMonthToLength;
  }

  public void setNumberOfMonthToLength(Double numberOfMonthToLength) {
    this.numberOfMonthToLength = numberOfMonthToLength;
  }

  public Drawdown numberOfMonthToRecovery(Double numberOfMonthToRecovery) {
    this.numberOfMonthToRecovery = numberOfMonthToRecovery;
    return this;
  }

  /**
   * Get numberOfMonthToRecovery
   * @return numberOfMonthToRecovery
  **/
  @ApiModelProperty(value = "")


  public Double getNumberOfMonthToRecovery() {
    return numberOfMonthToRecovery;
  }

  public void setNumberOfMonthToRecovery(Double numberOfMonthToRecovery) {
    this.numberOfMonthToRecovery = numberOfMonthToRecovery;
  }

  public Drawdown startDate(OffsetDateTime startDate) {
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

  public Drawdown value(Double value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")


  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Drawdown drawdown = (Drawdown) o;
    return Objects.equals(this.endDate, drawdown.endDate) &&
        Objects.equals(this.numberOfMonthToLength, drawdown.numberOfMonthToLength) &&
        Objects.equals(this.numberOfMonthToRecovery, drawdown.numberOfMonthToRecovery) &&
        Objects.equals(this.startDate, drawdown.startDate) &&
        Objects.equals(this.value, drawdown.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endDate, numberOfMonthToLength, numberOfMonthToRecovery, startDate, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Drawdown {\n");
    
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    numberOfMonthToLength: ").append(toIndentedString(numberOfMonthToLength)).append("\n");
    sb.append("    numberOfMonthToRecovery: ").append(toIndentedString(numberOfMonthToRecovery)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

