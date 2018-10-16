package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CalculationPeriod;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CumulativePerformance
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class CumulativePerformance   {
  @JsonProperty("calculationPeriod")
  private CalculationPeriod calculationPeriod = null;

  @JsonProperty("day")
  private Double day = null;

  @JsonProperty("fiveYears")
  private Double fiveYears = null;

  @JsonProperty("fromInception")
  private Double fromInception = null;

  @JsonProperty("mtd")
  private Double mtd = null;

  @JsonProperty("oneMonth")
  private Double oneMonth = null;

  @JsonProperty("oneYear")
  private Double oneYear = null;

  @JsonProperty("sixMonths")
  private Double sixMonths = null;

  @JsonProperty("threeMonths")
  private Double threeMonths = null;

  @JsonProperty("threeYears")
  private Double threeYears = null;

  @JsonProperty("twelveYears")
  private Double twelveYears = null;

  @JsonProperty("twoMonth")
  private Double twoMonth = null;

  @JsonProperty("week")
  private Double week = null;

  public CumulativePerformance calculationPeriod(CalculationPeriod calculationPeriod) {
    this.calculationPeriod = calculationPeriod;
    return this;
  }

  /**
   * Get calculationPeriod
   * @return calculationPeriod
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CalculationPeriod getCalculationPeriod() {
    return calculationPeriod;
  }

  public void setCalculationPeriod(CalculationPeriod calculationPeriod) {
    this.calculationPeriod = calculationPeriod;
  }

  public CumulativePerformance day(Double day) {
    this.day = day;
    return this;
  }

  /**
   * Day
   * @return day
  **/
  @ApiModelProperty(value = "Day")


  public Double getDay() {
    return day;
  }

  public void setDay(Double day) {
    this.day = day;
  }

  public CumulativePerformance fiveYears(Double fiveYears) {
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

  public CumulativePerformance fromInception(Double fromInception) {
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

  public CumulativePerformance mtd(Double mtd) {
    this.mtd = mtd;
    return this;
  }

  /**
   * month to date
   * @return mtd
  **/
  @ApiModelProperty(value = "month to date")


  public Double getMtd() {
    return mtd;
  }

  public void setMtd(Double mtd) {
    this.mtd = mtd;
  }

  public CumulativePerformance oneMonth(Double oneMonth) {
    this.oneMonth = oneMonth;
    return this;
  }

  /**
   * One month
   * @return oneMonth
  **/
  @ApiModelProperty(value = "One month")


  public Double getOneMonth() {
    return oneMonth;
  }

  public void setOneMonth(Double oneMonth) {
    this.oneMonth = oneMonth;
  }

  public CumulativePerformance oneYear(Double oneYear) {
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

  public CumulativePerformance sixMonths(Double sixMonths) {
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

  public CumulativePerformance threeMonths(Double threeMonths) {
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

  public CumulativePerformance threeYears(Double threeYears) {
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

  public CumulativePerformance twelveYears(Double twelveYears) {
    this.twelveYears = twelveYears;
    return this;
  }

  /**
   * Twelve years
   * @return twelveYears
  **/
  @ApiModelProperty(value = "Twelve years")


  public Double getTwelveYears() {
    return twelveYears;
  }

  public void setTwelveYears(Double twelveYears) {
    this.twelveYears = twelveYears;
  }

  public CumulativePerformance twoMonth(Double twoMonth) {
    this.twoMonth = twoMonth;
    return this;
  }

  /**
   * Two month
   * @return twoMonth
  **/
  @ApiModelProperty(value = "Two month")


  public Double getTwoMonth() {
    return twoMonth;
  }

  public void setTwoMonth(Double twoMonth) {
    this.twoMonth = twoMonth;
  }

  public CumulativePerformance week(Double week) {
    this.week = week;
    return this;
  }

  /**
   * Week
   * @return week
  **/
  @ApiModelProperty(value = "Week")


  public Double getWeek() {
    return week;
  }

  public void setWeek(Double week) {
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
    CumulativePerformance cumulativePerformance = (CumulativePerformance) o;
    return Objects.equals(this.calculationPeriod, cumulativePerformance.calculationPeriod) &&
        Objects.equals(this.day, cumulativePerformance.day) &&
        Objects.equals(this.fiveYears, cumulativePerformance.fiveYears) &&
        Objects.equals(this.fromInception, cumulativePerformance.fromInception) &&
        Objects.equals(this.mtd, cumulativePerformance.mtd) &&
        Objects.equals(this.oneMonth, cumulativePerformance.oneMonth) &&
        Objects.equals(this.oneYear, cumulativePerformance.oneYear) &&
        Objects.equals(this.sixMonths, cumulativePerformance.sixMonths) &&
        Objects.equals(this.threeMonths, cumulativePerformance.threeMonths) &&
        Objects.equals(this.threeYears, cumulativePerformance.threeYears) &&
        Objects.equals(this.twelveYears, cumulativePerformance.twelveYears) &&
        Objects.equals(this.twoMonth, cumulativePerformance.twoMonth) &&
        Objects.equals(this.week, cumulativePerformance.week);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calculationPeriod, day, fiveYears, fromInception, mtd, oneMonth, oneYear, sixMonths, threeMonths, threeYears, twelveYears, twoMonth, week);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CumulativePerformance {\n");
    
    sb.append("    calculationPeriod: ").append(toIndentedString(calculationPeriod)).append("\n");
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    fiveYears: ").append(toIndentedString(fiveYears)).append("\n");
    sb.append("    fromInception: ").append(toIndentedString(fromInception)).append("\n");
    sb.append("    mtd: ").append(toIndentedString(mtd)).append("\n");
    sb.append("    oneMonth: ").append(toIndentedString(oneMonth)).append("\n");
    sb.append("    oneYear: ").append(toIndentedString(oneYear)).append("\n");
    sb.append("    sixMonths: ").append(toIndentedString(sixMonths)).append("\n");
    sb.append("    threeMonths: ").append(toIndentedString(threeMonths)).append("\n");
    sb.append("    threeYears: ").append(toIndentedString(threeYears)).append("\n");
    sb.append("    twelveYears: ").append(toIndentedString(twelveYears)).append("\n");
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

