package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CalculatorPerformance
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class CalculatorPerformance   {
  @JsonProperty("fiveYears")
  private Double fiveYears = null;

  @JsonProperty("fromInception")
  private Double fromInception = null;

  @JsonProperty("oneYear")
  private Double oneYear = null;

  @JsonProperty("sixMonths")
  private Double sixMonths = null;

  @JsonProperty("threeMonths")
  private Double threeMonths = null;

  @JsonProperty("threeYears")
  private Double threeYears = null;

  @JsonProperty("ytd")
  private Double ytd = null;

  public CalculatorPerformance fiveYears(Double fiveYears) {
    this.fiveYears = fiveYears;
    return this;
  }

  /**
   * Five years
   * @return fiveYears
  **/
  @ApiModelProperty(value = "Five years")


  public Double getFiveYears() {
    return fiveYears;
  }

  public void setFiveYears(Double fiveYears) {
    this.fiveYears = fiveYears;
  }

  public CalculatorPerformance fromInception(Double fromInception) {
    this.fromInception = fromInception;
    return this;
  }

  /**
   * From inception
   * @return fromInception
  **/
  @ApiModelProperty(value = "From inception")


  public Double getFromInception() {
    return fromInception;
  }

  public void setFromInception(Double fromInception) {
    this.fromInception = fromInception;
  }

  public CalculatorPerformance oneYear(Double oneYear) {
    this.oneYear = oneYear;
    return this;
  }

  /**
   * One year
   * @return oneYear
  **/
  @ApiModelProperty(value = "One year")


  public Double getOneYear() {
    return oneYear;
  }

  public void setOneYear(Double oneYear) {
    this.oneYear = oneYear;
  }

  public CalculatorPerformance sixMonths(Double sixMonths) {
    this.sixMonths = sixMonths;
    return this;
  }

  /**
   * Six months
   * @return sixMonths
  **/
  @ApiModelProperty(value = "Six months")


  public Double getSixMonths() {
    return sixMonths;
  }

  public void setSixMonths(Double sixMonths) {
    this.sixMonths = sixMonths;
  }

  public CalculatorPerformance threeMonths(Double threeMonths) {
    this.threeMonths = threeMonths;
    return this;
  }

  /**
   * Three months
   * @return threeMonths
  **/
  @ApiModelProperty(value = "Three months")


  public Double getThreeMonths() {
    return threeMonths;
  }

  public void setThreeMonths(Double threeMonths) {
    this.threeMonths = threeMonths;
  }

  public CalculatorPerformance threeYears(Double threeYears) {
    this.threeYears = threeYears;
    return this;
  }

  /**
   * Three years
   * @return threeYears
  **/
  @ApiModelProperty(value = "Three years")


  public Double getThreeYears() {
    return threeYears;
  }

  public void setThreeYears(Double threeYears) {
    this.threeYears = threeYears;
  }

  public CalculatorPerformance ytd(Double ytd) {
    this.ytd = ytd;
    return this;
  }

  /**
   * YTD
   * @return ytd
  **/
  @ApiModelProperty(value = "YTD")


  public Double getYtd() {
    return ytd;
  }

  public void setYtd(Double ytd) {
    this.ytd = ytd;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalculatorPerformance calculatorPerformance = (CalculatorPerformance) o;
    return Objects.equals(this.fiveYears, calculatorPerformance.fiveYears) &&
        Objects.equals(this.fromInception, calculatorPerformance.fromInception) &&
        Objects.equals(this.oneYear, calculatorPerformance.oneYear) &&
        Objects.equals(this.sixMonths, calculatorPerformance.sixMonths) &&
        Objects.equals(this.threeMonths, calculatorPerformance.threeMonths) &&
        Objects.equals(this.threeYears, calculatorPerformance.threeYears) &&
        Objects.equals(this.ytd, calculatorPerformance.ytd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fiveYears, fromInception, oneYear, sixMonths, threeMonths, threeYears, ytd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalculatorPerformance {\n");
    
    sb.append("    fiveYears: ").append(toIndentedString(fiveYears)).append("\n");
    sb.append("    fromInception: ").append(toIndentedString(fromInception)).append("\n");
    sb.append("    oneYear: ").append(toIndentedString(oneYear)).append("\n");
    sb.append("    sixMonths: ").append(toIndentedString(sixMonths)).append("\n");
    sb.append("    threeMonths: ").append(toIndentedString(threeMonths)).append("\n");
    sb.append("    threeYears: ").append(toIndentedString(threeYears)).append("\n");
    sb.append("    ytd: ").append(toIndentedString(ytd)).append("\n");
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
