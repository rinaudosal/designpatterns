package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Respose from HighCharts health checking service. 
 */
@ApiModel(description = "Respose from HighCharts health checking service. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class HealthResponse   {
  @JsonProperty("date")
  private String date = null;

  @JsonProperty("result")
  private String result = null;

  public HealthResponse date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Server's date of the response. 
   * @return date
  **/
  @ApiModelProperty(value = "Server's date of the response. ")


  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public HealthResponse result(String result) {
    this.result = result;
    return this;
  }

  /**
   * Status of the PhantomJS servers pool. 
   * @return result
  **/
  @ApiModelProperty(value = "Status of the PhantomJS servers pool. ")


  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HealthResponse healthResponse = (HealthResponse) o;
    return Objects.equals(this.date, healthResponse.date) &&
        Objects.equals(this.result, healthResponse.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HealthResponse {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

