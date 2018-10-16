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
 * HistoricalPerformance
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class HistoricalPerformance   {
  @JsonProperty("date")
  private OffsetDateTime date = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("value")
  private Double value = null;

  public HistoricalPerformance date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

  /**
   * Date
   * @return date
  **/
  @ApiModelProperty(value = "Date")

  @Valid

  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public HistoricalPerformance name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Serial Name
   * @return name
  **/
  @ApiModelProperty(value = "Serial Name")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public HistoricalPerformance value(Double value) {
    this.value = value;
    return this;
  }

  /**
   * Value
   * @return value
  **/
  @ApiModelProperty(value = "Value")


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
    HistoricalPerformance historicalPerformance = (HistoricalPerformance) o;
    return Objects.equals(this.date, historicalPerformance.date) &&
        Objects.equals(this.name, historicalPerformance.name) &&
        Objects.equals(this.value, historicalPerformance.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, name, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricalPerformance {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

