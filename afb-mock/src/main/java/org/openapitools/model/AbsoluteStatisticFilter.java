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
 * The &#x60;AbsoluteStatistic&#x60; object contains the intrinsic statistics related to an instrument.
 */
@ApiModel(description = "The `AbsoluteStatistic` object contains the intrinsic statistics related to an instrument.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class AbsoluteStatisticFilter   {
  @JsonProperty("maxDrawdown")
  private NumberComparisonFilter maxDrawdown = null;

  @JsonProperty("performance")
  private NumberComparisonFilter performance = null;

  @JsonProperty("sharpeRatio")
  private NumberComparisonFilter sharpeRatio = null;

  @JsonProperty("volatility")
  private NumberComparisonFilter volatility = null;

  public AbsoluteStatisticFilter maxDrawdown(NumberComparisonFilter maxDrawdown) {
    this.maxDrawdown = maxDrawdown;
    return this;
  }

  /**
   * Get maxDrawdown
   * @return maxDrawdown
  **/
  @ApiModelProperty(value = "")

  @Valid

  public NumberComparisonFilter getMaxDrawdown() {
    return maxDrawdown;
  }

  public void setMaxDrawdown(NumberComparisonFilter maxDrawdown) {
    this.maxDrawdown = maxDrawdown;
  }

  public AbsoluteStatisticFilter performance(NumberComparisonFilter performance) {
    this.performance = performance;
    return this;
  }

  /**
   * Get performance
   * @return performance
  **/
  @ApiModelProperty(value = "")

  @Valid

  public NumberComparisonFilter getPerformance() {
    return performance;
  }

  public void setPerformance(NumberComparisonFilter performance) {
    this.performance = performance;
  }

  public AbsoluteStatisticFilter sharpeRatio(NumberComparisonFilter sharpeRatio) {
    this.sharpeRatio = sharpeRatio;
    return this;
  }

  /**
   * Get sharpeRatio
   * @return sharpeRatio
  **/
  @ApiModelProperty(value = "")

  @Valid

  public NumberComparisonFilter getSharpeRatio() {
    return sharpeRatio;
  }

  public void setSharpeRatio(NumberComparisonFilter sharpeRatio) {
    this.sharpeRatio = sharpeRatio;
  }

  public AbsoluteStatisticFilter volatility(NumberComparisonFilter volatility) {
    this.volatility = volatility;
    return this;
  }

  /**
   * Get volatility
   * @return volatility
  **/
  @ApiModelProperty(value = "")

  @Valid

  public NumberComparisonFilter getVolatility() {
    return volatility;
  }

  public void setVolatility(NumberComparisonFilter volatility) {
    this.volatility = volatility;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AbsoluteStatisticFilter absoluteStatisticFilter = (AbsoluteStatisticFilter) o;
    return Objects.equals(this.maxDrawdown, absoluteStatisticFilter.maxDrawdown) &&
        Objects.equals(this.performance, absoluteStatisticFilter.performance) &&
        Objects.equals(this.sharpeRatio, absoluteStatisticFilter.sharpeRatio) &&
        Objects.equals(this.volatility, absoluteStatisticFilter.volatility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxDrawdown, performance, sharpeRatio, volatility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbsoluteStatisticFilter {\n");
    
    sb.append("    maxDrawdown: ").append(toIndentedString(maxDrawdown)).append("\n");
    sb.append("    performance: ").append(toIndentedString(performance)).append("\n");
    sb.append("    sharpeRatio: ").append(toIndentedString(sharpeRatio)).append("\n");
    sb.append("    volatility: ").append(toIndentedString(volatility)).append("\n");
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

