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
 * A {Benchmark}&#39;s valuation.
 */
@ApiModel(description = "A {Benchmark}'s valuation.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class ValuationBenchmark   {
  @JsonProperty("benchmarkId")
  private String benchmarkId = null;

  @JsonProperty("change")
  private Double change = null;

  @JsonProperty("changePercentage")
  private Double changePercentage = null;

  @JsonProperty("date")
  private OffsetDateTime date = null;

  @JsonProperty("endWeekRange")
  private Double endWeekRange = null;

  @JsonProperty("previousClose")
  private Double previousClose = null;

  @JsonProperty("startWeekRange")
  private Double startWeekRange = null;

  @JsonProperty("value")
  private Double value = null;

  public ValuationBenchmark benchmarkId(String benchmarkId) {
    this.benchmarkId = benchmarkId;
    return this;
  }

  /**
   * The unique identificator for this {Benchmark}
   * @return benchmarkId
  **/
  @ApiModelProperty(value = "The unique identificator for this {Benchmark}")


  public String getBenchmarkId() {
    return benchmarkId;
  }

  public void setBenchmarkId(String benchmarkId) {
    this.benchmarkId = benchmarkId;
  }

  public ValuationBenchmark change(Double change) {
    this.change = change;
    return this;
  }

  /**
   * Get change
   * @return change
  **/
  @ApiModelProperty(value = "")


  public Double getChange() {
    return change;
  }

  public void setChange(Double change) {
    this.change = change;
  }

  public ValuationBenchmark changePercentage(Double changePercentage) {
    this.changePercentage = changePercentage;
    return this;
  }

  /**
   * Get changePercentage
   * @return changePercentage
  **/
  @ApiModelProperty(value = "")


  public Double getChangePercentage() {
    return changePercentage;
  }

  public void setChangePercentage(Double changePercentage) {
    this.changePercentage = changePercentage;
  }

  public ValuationBenchmark date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

  /**
   * Date to show fee
   * @return date
  **/
  @ApiModelProperty(value = "Date to show fee")

  @Valid

  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public ValuationBenchmark endWeekRange(Double endWeekRange) {
    this.endWeekRange = endWeekRange;
    return this;
  }

  /**
   * Get endWeekRange
   * @return endWeekRange
  **/
  @ApiModelProperty(value = "")


  public Double getEndWeekRange() {
    return endWeekRange;
  }

  public void setEndWeekRange(Double endWeekRange) {
    this.endWeekRange = endWeekRange;
  }

  public ValuationBenchmark previousClose(Double previousClose) {
    this.previousClose = previousClose;
    return this;
  }

  /**
   * Get previousClose
   * @return previousClose
  **/
  @ApiModelProperty(value = "")


  public Double getPreviousClose() {
    return previousClose;
  }

  public void setPreviousClose(Double previousClose) {
    this.previousClose = previousClose;
  }

  public ValuationBenchmark startWeekRange(Double startWeekRange) {
    this.startWeekRange = startWeekRange;
    return this;
  }

  /**
   * Get startWeekRange
   * @return startWeekRange
  **/
  @ApiModelProperty(value = "")


  public Double getStartWeekRange() {
    return startWeekRange;
  }

  public void setStartWeekRange(Double startWeekRange) {
    this.startWeekRange = startWeekRange;
  }

  public ValuationBenchmark value(Double value) {
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
    ValuationBenchmark valuationBenchmark = (ValuationBenchmark) o;
    return Objects.equals(this.benchmarkId, valuationBenchmark.benchmarkId) &&
        Objects.equals(this.change, valuationBenchmark.change) &&
        Objects.equals(this.changePercentage, valuationBenchmark.changePercentage) &&
        Objects.equals(this.date, valuationBenchmark.date) &&
        Objects.equals(this.endWeekRange, valuationBenchmark.endWeekRange) &&
        Objects.equals(this.previousClose, valuationBenchmark.previousClose) &&
        Objects.equals(this.startWeekRange, valuationBenchmark.startWeekRange) &&
        Objects.equals(this.value, valuationBenchmark.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(benchmarkId, change, changePercentage, date, endWeekRange, previousClose, startWeekRange, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValuationBenchmark {\n");
    
    sb.append("    benchmarkId: ").append(toIndentedString(benchmarkId)).append("\n");
    sb.append("    change: ").append(toIndentedString(change)).append("\n");
    sb.append("    changePercentage: ").append(toIndentedString(changePercentage)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    endWeekRange: ").append(toIndentedString(endWeekRange)).append("\n");
    sb.append("    previousClose: ").append(toIndentedString(previousClose)).append("\n");
    sb.append("    startWeekRange: ").append(toIndentedString(startWeekRange)).append("\n");
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

