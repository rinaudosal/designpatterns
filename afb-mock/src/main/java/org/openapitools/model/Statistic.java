package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AbsoluteStatistic;
import org.openapitools.model.RelativeStatistic;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Statistic
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class Statistic   {
  @JsonProperty("benchmarkId")
  private String benchmarkId = null;

  @JsonProperty("benchmarkStatistic")
  private AbsoluteStatistic benchmarkStatistic = null;

  @JsonProperty("instrumentStatistic")
  private AbsoluteStatistic instrumentStatistic = null;

  @JsonProperty("relative")
  private RelativeStatistic relative = null;

  public Statistic benchmarkId(String benchmarkId) {
    this.benchmarkId = benchmarkId;
    return this;
  }

  /**
   * The Id of the {Benchmark}
   * @return benchmarkId
  **/
  @ApiModelProperty(value = "The Id of the {Benchmark}")


  public String getBenchmarkId() {
    return benchmarkId;
  }

  public void setBenchmarkId(String benchmarkId) {
    this.benchmarkId = benchmarkId;
  }

  public Statistic benchmarkStatistic(AbsoluteStatistic benchmarkStatistic) {
    this.benchmarkStatistic = benchmarkStatistic;
    return this;
  }

  /**
   * Get benchmarkStatistic
   * @return benchmarkStatistic
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AbsoluteStatistic getBenchmarkStatistic() {
    return benchmarkStatistic;
  }

  public void setBenchmarkStatistic(AbsoluteStatistic benchmarkStatistic) {
    this.benchmarkStatistic = benchmarkStatistic;
  }

  public Statistic instrumentStatistic(AbsoluteStatistic instrumentStatistic) {
    this.instrumentStatistic = instrumentStatistic;
    return this;
  }

  /**
   * Get instrumentStatistic
   * @return instrumentStatistic
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AbsoluteStatistic getInstrumentStatistic() {
    return instrumentStatistic;
  }

  public void setInstrumentStatistic(AbsoluteStatistic instrumentStatistic) {
    this.instrumentStatistic = instrumentStatistic;
  }

  public Statistic relative(RelativeStatistic relative) {
    this.relative = relative;
    return this;
  }

  /**
   * Get relative
   * @return relative
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RelativeStatistic getRelative() {
    return relative;
  }

  public void setRelative(RelativeStatistic relative) {
    this.relative = relative;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Statistic statistic = (Statistic) o;
    return Objects.equals(this.benchmarkId, statistic.benchmarkId) &&
        Objects.equals(this.benchmarkStatistic, statistic.benchmarkStatistic) &&
        Objects.equals(this.instrumentStatistic, statistic.instrumentStatistic) &&
        Objects.equals(this.relative, statistic.relative);
  }

  @Override
  public int hashCode() {
    return Objects.hash(benchmarkId, benchmarkStatistic, instrumentStatistic, relative);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Statistic {\n");
    
    sb.append("    benchmarkId: ").append(toIndentedString(benchmarkId)).append("\n");
    sb.append("    benchmarkStatistic: ").append(toIndentedString(benchmarkStatistic)).append("\n");
    sb.append("    instrumentStatistic: ").append(toIndentedString(instrumentStatistic)).append("\n");
    sb.append("    relative: ").append(toIndentedString(relative)).append("\n");
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

