package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CalculationPeriod;
import org.openapitools.model.PeriodStatistic;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The &#x60;AbsoluteStatistic&#x60; object contains the intrinsic statistics related to an instrument.
 */
@ApiModel(description = "The `AbsoluteStatistic` object contains the intrinsic statistics related to an instrument.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class AbsoluteStatistic   {
  @JsonProperty("calculationPeriod")
  private CalculationPeriod calculationPeriod = null;

  @JsonProperty("maxDrawdown")
  private PeriodStatistic maxDrawdown = null;

  @JsonProperty("performance")
  private PeriodStatistic performance = null;

  @JsonProperty("returnOnRevenue")
  private PeriodStatistic returnOnRevenue = null;

  @JsonProperty("sharpeRatio")
  private PeriodStatistic sharpeRatio = null;

  @JsonProperty("volatility")
  private PeriodStatistic volatility = null;

  public AbsoluteStatistic calculationPeriod(CalculationPeriod calculationPeriod) {
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

  public AbsoluteStatistic maxDrawdown(PeriodStatistic maxDrawdown) {
    this.maxDrawdown = maxDrawdown;
    return this;
  }

  /**
   * Get maxDrawdown
   * @return maxDrawdown
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PeriodStatistic getMaxDrawdown() {
    return maxDrawdown;
  }

  public void setMaxDrawdown(PeriodStatistic maxDrawdown) {
    this.maxDrawdown = maxDrawdown;
  }

  public AbsoluteStatistic performance(PeriodStatistic performance) {
    this.performance = performance;
    return this;
  }

  /**
   * Get performance
   * @return performance
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PeriodStatistic getPerformance() {
    return performance;
  }

  public void setPerformance(PeriodStatistic performance) {
    this.performance = performance;
  }

  public AbsoluteStatistic returnOnRevenue(PeriodStatistic returnOnRevenue) {
    this.returnOnRevenue = returnOnRevenue;
    return this;
  }

  /**
   * Get returnOnRevenue
   * @return returnOnRevenue
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PeriodStatistic getReturnOnRevenue() {
    return returnOnRevenue;
  }

  public void setReturnOnRevenue(PeriodStatistic returnOnRevenue) {
    this.returnOnRevenue = returnOnRevenue;
  }

  public AbsoluteStatistic sharpeRatio(PeriodStatistic sharpeRatio) {
    this.sharpeRatio = sharpeRatio;
    return this;
  }

  /**
   * Get sharpeRatio
   * @return sharpeRatio
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PeriodStatistic getSharpeRatio() {
    return sharpeRatio;
  }

  public void setSharpeRatio(PeriodStatistic sharpeRatio) {
    this.sharpeRatio = sharpeRatio;
  }

  public AbsoluteStatistic volatility(PeriodStatistic volatility) {
    this.volatility = volatility;
    return this;
  }

  /**
   * Get volatility
   * @return volatility
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PeriodStatistic getVolatility() {
    return volatility;
  }

  public void setVolatility(PeriodStatistic volatility) {
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
    AbsoluteStatistic absoluteStatistic = (AbsoluteStatistic) o;
    return Objects.equals(this.calculationPeriod, absoluteStatistic.calculationPeriod) &&
        Objects.equals(this.maxDrawdown, absoluteStatistic.maxDrawdown) &&
        Objects.equals(this.performance, absoluteStatistic.performance) &&
        Objects.equals(this.returnOnRevenue, absoluteStatistic.returnOnRevenue) &&
        Objects.equals(this.sharpeRatio, absoluteStatistic.sharpeRatio) &&
        Objects.equals(this.volatility, absoluteStatistic.volatility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calculationPeriod, maxDrawdown, performance, returnOnRevenue, sharpeRatio, volatility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbsoluteStatistic {\n");
    
    sb.append("    calculationPeriod: ").append(toIndentedString(calculationPeriod)).append("\n");
    sb.append("    maxDrawdown: ").append(toIndentedString(maxDrawdown)).append("\n");
    sb.append("    performance: ").append(toIndentedString(performance)).append("\n");
    sb.append("    returnOnRevenue: ").append(toIndentedString(returnOnRevenue)).append("\n");
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

