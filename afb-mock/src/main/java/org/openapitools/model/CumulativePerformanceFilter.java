package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.NumberComparisonFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CumulativePerformanceFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class CumulativePerformanceFilter   {
  @JsonProperty("day")
  private NumberComparisonFilter day = null;

  @JsonProperty("fiveYears")
  private NumberComparisonFilter fiveYears = null;

  @JsonProperty("fromInception")
  private NumberComparisonFilter fromInception = null;

  @JsonProperty("oneMonth")
  private NumberComparisonFilter oneMonth = null;

  @JsonProperty("oneYear")
  private NumberComparisonFilter oneYear = null;

  @JsonProperty("sixMonths")
  private NumberComparisonFilter sixMonths = null;

  @JsonProperty("threeMonths")
  private NumberComparisonFilter threeMonths = null;

  @JsonProperty("threeYears")
  private NumberComparisonFilter threeYears = null;

  @JsonProperty("twoMonth")
  private NumberComparisonFilter twoMonth = null;

  @JsonProperty("week")
  private NumberComparisonFilter week = null;

  public CumulativePerformanceFilter day(NumberComparisonFilter day) {
    this.day = day;
    return this;
  }

  /**
   * Get day
   * @return day
  **/
  @ApiModelProperty(value = "")

  @Valid

  public NumberComparisonFilter getDay() {
    return day;
  }

  public void setDay(NumberComparisonFilter day) {
    this.day = day;
  }

  public CumulativePerformanceFilter fiveYears(NumberComparisonFilter fiveYears) {
    this.fiveYears = fiveYears;
    return this;
  }

  /**
   * Get fiveYears
   * @return fiveYears
  **/
  @ApiModelProperty(value = "")

  @Valid

  public NumberComparisonFilter getFiveYears() {
    return fiveYears;
  }

  public void setFiveYears(NumberComparisonFilter fiveYears) {
    this.fiveYears = fiveYears;
  }

  public CumulativePerformanceFilter fromInception(NumberComparisonFilter fromInception) {
    this.fromInception = fromInception;
    return this;
  }

  /**
   * Get fromInception
   * @return fromInception
  **/
  @ApiModelProperty(value = "")

  @Valid

  public NumberComparisonFilter getFromInception() {
    return fromInception;
  }

  public void setFromInception(NumberComparisonFilter fromInception) {
    this.fromInception = fromInception;
  }

  public CumulativePerformanceFilter oneMonth(NumberComparisonFilter oneMonth) {
    this.oneMonth = oneMonth;
    return this;
  }

  /**
   * Get oneMonth
   * @return oneMonth
  **/
  @ApiModelProperty(value = "")

  @Valid

  public NumberComparisonFilter getOneMonth() {
    return oneMonth;
  }

  public void setOneMonth(NumberComparisonFilter oneMonth) {
    this.oneMonth = oneMonth;
  }

  public CumulativePerformanceFilter oneYear(NumberComparisonFilter oneYear) {
    this.oneYear = oneYear;
    return this;
  }

  /**
   * Get oneYear
   * @return oneYear
  **/
  @ApiModelProperty(value = "")

  @Valid

  public NumberComparisonFilter getOneYear() {
    return oneYear;
  }

  public void setOneYear(NumberComparisonFilter oneYear) {
    this.oneYear = oneYear;
  }

  public CumulativePerformanceFilter sixMonths(NumberComparisonFilter sixMonths) {
    this.sixMonths = sixMonths;
    return this;
  }

  /**
   * Get sixMonths
   * @return sixMonths
  **/
  @ApiModelProperty(value = "")

  @Valid

  public NumberComparisonFilter getSixMonths() {
    return sixMonths;
  }

  public void setSixMonths(NumberComparisonFilter sixMonths) {
    this.sixMonths = sixMonths;
  }

  public CumulativePerformanceFilter threeMonths(NumberComparisonFilter threeMonths) {
    this.threeMonths = threeMonths;
    return this;
  }

  /**
   * Get threeMonths
   * @return threeMonths
  **/
  @ApiModelProperty(value = "")

  @Valid

  public NumberComparisonFilter getThreeMonths() {
    return threeMonths;
  }

  public void setThreeMonths(NumberComparisonFilter threeMonths) {
    this.threeMonths = threeMonths;
  }

  public CumulativePerformanceFilter threeYears(NumberComparisonFilter threeYears) {
    this.threeYears = threeYears;
    return this;
  }

  /**
   * Get threeYears
   * @return threeYears
  **/
  @ApiModelProperty(value = "")

  @Valid

  public NumberComparisonFilter getThreeYears() {
    return threeYears;
  }

  public void setThreeYears(NumberComparisonFilter threeYears) {
    this.threeYears = threeYears;
  }

  public CumulativePerformanceFilter twoMonth(NumberComparisonFilter twoMonth) {
    this.twoMonth = twoMonth;
    return this;
  }

  /**
   * Get twoMonth
   * @return twoMonth
  **/
  @ApiModelProperty(value = "")

  @Valid

  public NumberComparisonFilter getTwoMonth() {
    return twoMonth;
  }

  public void setTwoMonth(NumberComparisonFilter twoMonth) {
    this.twoMonth = twoMonth;
  }

  public CumulativePerformanceFilter week(NumberComparisonFilter week) {
    this.week = week;
    return this;
  }

  /**
   * Get week
   * @return week
  **/
  @ApiModelProperty(value = "")

  @Valid

  public NumberComparisonFilter getWeek() {
    return week;
  }

  public void setWeek(NumberComparisonFilter week) {
    this.week = week;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CumulativePerformanceFilter cumulativePerformanceFilter = (CumulativePerformanceFilter) o;
    return Objects.equals(this.day, cumulativePerformanceFilter.day) &&
        Objects.equals(this.fiveYears, cumulativePerformanceFilter.fiveYears) &&
        Objects.equals(this.fromInception, cumulativePerformanceFilter.fromInception) &&
        Objects.equals(this.oneMonth, cumulativePerformanceFilter.oneMonth) &&
        Objects.equals(this.oneYear, cumulativePerformanceFilter.oneYear) &&
        Objects.equals(this.sixMonths, cumulativePerformanceFilter.sixMonths) &&
        Objects.equals(this.threeMonths, cumulativePerformanceFilter.threeMonths) &&
        Objects.equals(this.threeYears, cumulativePerformanceFilter.threeYears) &&
        Objects.equals(this.twoMonth, cumulativePerformanceFilter.twoMonth) &&
        Objects.equals(this.week, cumulativePerformanceFilter.week);
  }

  @Override
  public int hashCode() {
    return Objects.hash(day, fiveYears, fromInception, oneMonth, oneYear, sixMonths, threeMonths, threeYears, twoMonth, week);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CumulativePerformanceFilter {\n");
    
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    fiveYears: ").append(toIndentedString(fiveYears)).append("\n");
    sb.append("    fromInception: ").append(toIndentedString(fromInception)).append("\n");
    sb.append("    oneMonth: ").append(toIndentedString(oneMonth)).append("\n");
    sb.append("    oneYear: ").append(toIndentedString(oneYear)).append("\n");
    sb.append("    sixMonths: ").append(toIndentedString(sixMonths)).append("\n");
    sb.append("    threeMonths: ").append(toIndentedString(threeMonths)).append("\n");
    sb.append("    threeYears: ").append(toIndentedString(threeYears)).append("\n");
    sb.append("    twoMonth: ").append(toIndentedString(twoMonth)).append("\n");
    sb.append("    week: ").append(toIndentedString(week)).append("\n");
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

