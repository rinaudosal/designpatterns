package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The statistic for the different periods.
 */
@ApiModel(description = "The statistic for the different periods.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class PeriodStatistic   {
  @JsonProperty("fiveYears")
  private Double fiveYears = null;

  @JsonProperty("oneYear")
  private Double oneYear = null;

  @JsonProperty("period")
  private Double period = null;

  @JsonProperty("sixMonths")
  private Double sixMonths = null;

  @JsonProperty("threeMonths")
  private Double threeMonths = null;

  @JsonProperty("threeYears")
  private Double threeYears = null;

  @JsonProperty("twelveYears")
  private Double twelveYears = null;

  @JsonProperty("ytd")
  private Double ytd = null;

  public PeriodStatistic fiveYears(Double fiveYears) {
    this.fiveYears = fiveYears;
    return this;
  }

  /**
   * calculation statistics five year.
   * @return fiveYears
  **/
  @ApiModelProperty(value = "calculation statistics five year.")


  public Double getFiveYears() {
    return fiveYears;
  }

  public void setFiveYears(Double fiveYears) {
    this.fiveYears = fiveYears;
  }

  public PeriodStatistic oneYear(Double oneYear) {
    this.oneYear = oneYear;
    return this;
  }

  /**
   * calculation statistics one year.
   * @return oneYear
  **/
  @ApiModelProperty(value = "calculation statistics one year.")


  public Double getOneYear() {
    return oneYear;
  }

  public void setOneYear(Double oneYear) {
    this.oneYear = oneYear;
  }

  public PeriodStatistic period(Double period) {
    this.period = period;
    return this;
  }

  /**
   * Statistic calculated according to the date specified by the User.
   * @return period
  **/
  @ApiModelProperty(value = "Statistic calculated according to the date specified by the User.")


  public Double getPeriod() {
    return period;
  }

  public void setPeriod(Double period) {
    this.period = period;
  }

  public PeriodStatistic sixMonths(Double sixMonths) {
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

  public PeriodStatistic threeMonths(Double threeMonths) {
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

  public PeriodStatistic threeYears(Double threeYears) {
    this.threeYears = threeYears;
    return this;
  }

  /**
   * calculation statistics three year.
   * @return threeYears
  **/
  @ApiModelProperty(value = "calculation statistics three year.")


  public Double getThreeYears() {
    return threeYears;
  }

  public void setThreeYears(Double threeYears) {
    this.threeYears = threeYears;
  }

  public PeriodStatistic twelveYears(Double twelveYears) {
    this.twelveYears = twelveYears;
    return this;
  }

  /**
   * calculation statistics twelve years.
   * @return twelveYears
  **/
  @ApiModelProperty(value = "calculation statistics twelve years.")


  public Double getTwelveYears() {
    return twelveYears;
  }

  public void setTwelveYears(Double twelveYears) {
    this.twelveYears = twelveYears;
  }

  public PeriodStatistic ytd(Double ytd) {
    this.ytd = ytd;
    return this;
  }

  /**
   * Ytd
   * @return ytd
  **/
  @ApiModelProperty(value = "Ytd")


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
    PeriodStatistic periodStatistic = (PeriodStatistic) o;
    return Objects.equals(this.fiveYears, periodStatistic.fiveYears) &&
        Objects.equals(this.oneYear, periodStatistic.oneYear) &&
        Objects.equals(this.period, periodStatistic.period) &&
        Objects.equals(this.sixMonths, periodStatistic.sixMonths) &&
        Objects.equals(this.threeMonths, periodStatistic.threeMonths) &&
        Objects.equals(this.threeYears, periodStatistic.threeYears) &&
        Objects.equals(this.twelveYears, periodStatistic.twelveYears) &&
        Objects.equals(this.ytd, periodStatistic.ytd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fiveYears, oneYear, period, sixMonths, threeMonths, threeYears, twelveYears, ytd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PeriodStatistic {\n");
    
    sb.append("    fiveYears: ").append(toIndentedString(fiveYears)).append("\n");
    sb.append("    oneYear: ").append(toIndentedString(oneYear)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    sixMonths: ").append(toIndentedString(sixMonths)).append("\n");
    sb.append("    threeMonths: ").append(toIndentedString(threeMonths)).append("\n");
    sb.append("    threeYears: ").append(toIndentedString(threeYears)).append("\n");
    sb.append("    twelveYears: ").append(toIndentedString(twelveYears)).append("\n");
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

