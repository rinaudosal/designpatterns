package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.DateComparisonFilter;
import org.openapitools.model.NumberComparisonFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FeesSearchFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class FeesSearchFilter   {
  @JsonProperty("afbAppliedRedemption")
  private NumberComparisonFilter afbAppliedRedemption = null;

  @JsonProperty("afbAppliedSubscription")
  private NumberComparisonFilter afbAppliedSubscription = null;

  @JsonProperty("annual")
  private NumberComparisonFilter annual = null;

  @JsonProperty("distribution")
  private NumberComparisonFilter distribution = null;

  @JsonProperty("exitMax")
  private NumberComparisonFilter exitMax = null;

  @JsonProperty("initialMax")
  private NumberComparisonFilter initialMax = null;

  @JsonProperty("operatingCashFlow")
  private NumberComparisonFilter operatingCashFlow = null;

  @JsonProperty("operatingCashFlowDate")
  private DateComparisonFilter operatingCashFlowDate = null;

  @JsonProperty("performance")
  private NumberComparisonFilter performance = null;

  @JsonProperty("totalFeeApplied")
  private NumberComparisonFilter totalFeeApplied = null;

  public FeesSearchFilter afbAppliedRedemption(NumberComparisonFilter afbAppliedRedemption) {
    this.afbAppliedRedemption = afbAppliedRedemption;
    return this;
  }

  /**
   * Get afbAppliedRedemption
   * @return afbAppliedRedemption
  **/
  @ApiModelProperty(value = "")

  @Valid

  public NumberComparisonFilter getAfbAppliedRedemption() {
    return afbAppliedRedemption;
  }

  public void setAfbAppliedRedemption(NumberComparisonFilter afbAppliedRedemption) {
    this.afbAppliedRedemption = afbAppliedRedemption;
  }

  public FeesSearchFilter afbAppliedSubscription(NumberComparisonFilter afbAppliedSubscription) {
    this.afbAppliedSubscription = afbAppliedSubscription;
    return this;
  }

  /**
   * Get afbAppliedSubscription
   * @return afbAppliedSubscription
  **/
  @ApiModelProperty(value = "")

  @Valid

  public NumberComparisonFilter getAfbAppliedSubscription() {
    return afbAppliedSubscription;
  }

  public void setAfbAppliedSubscription(NumberComparisonFilter afbAppliedSubscription) {
    this.afbAppliedSubscription = afbAppliedSubscription;
  }

  public FeesSearchFilter annual(NumberComparisonFilter annual) {
    this.annual = annual;
    return this;
  }

  /**
   * Get annual
   * @return annual
  **/
  @ApiModelProperty(value = "")

  @Valid

  public NumberComparisonFilter getAnnual() {
    return annual;
  }

  public void setAnnual(NumberComparisonFilter annual) {
    this.annual = annual;
  }

  public FeesSearchFilter distribution(NumberComparisonFilter distribution) {
    this.distribution = distribution;
    return this;
  }

  /**
   * Get distribution
   * @return distribution
  **/
  @ApiModelProperty(value = "")

  @Valid

  public NumberComparisonFilter getDistribution() {
    return distribution;
  }

  public void setDistribution(NumberComparisonFilter distribution) {
    this.distribution = distribution;
  }

  public FeesSearchFilter exitMax(NumberComparisonFilter exitMax) {
    this.exitMax = exitMax;
    return this;
  }

  /**
   * Get exitMax
   * @return exitMax
  **/
  @ApiModelProperty(value = "")

  @Valid

  public NumberComparisonFilter getExitMax() {
    return exitMax;
  }

  public void setExitMax(NumberComparisonFilter exitMax) {
    this.exitMax = exitMax;
  }

  public FeesSearchFilter initialMax(NumberComparisonFilter initialMax) {
    this.initialMax = initialMax;
    return this;
  }

  /**
   * Get initialMax
   * @return initialMax
  **/
  @ApiModelProperty(value = "")

  @Valid

  public NumberComparisonFilter getInitialMax() {
    return initialMax;
  }

  public void setInitialMax(NumberComparisonFilter initialMax) {
    this.initialMax = initialMax;
  }

  public FeesSearchFilter operatingCashFlow(NumberComparisonFilter operatingCashFlow) {
    this.operatingCashFlow = operatingCashFlow;
    return this;
  }

  /**
   * Get operatingCashFlow
   * @return operatingCashFlow
  **/
  @ApiModelProperty(value = "")

  @Valid

  public NumberComparisonFilter getOperatingCashFlow() {
    return operatingCashFlow;
  }

  public void setOperatingCashFlow(NumberComparisonFilter operatingCashFlow) {
    this.operatingCashFlow = operatingCashFlow;
  }

  public FeesSearchFilter operatingCashFlowDate(DateComparisonFilter operatingCashFlowDate) {
    this.operatingCashFlowDate = operatingCashFlowDate;
    return this;
  }

  /**
   * Get operatingCashFlowDate
   * @return operatingCashFlowDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DateComparisonFilter getOperatingCashFlowDate() {
    return operatingCashFlowDate;
  }

  public void setOperatingCashFlowDate(DateComparisonFilter operatingCashFlowDate) {
    this.operatingCashFlowDate = operatingCashFlowDate;
  }

  public FeesSearchFilter performance(NumberComparisonFilter performance) {
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

  public FeesSearchFilter totalFeeApplied(NumberComparisonFilter totalFeeApplied) {
    this.totalFeeApplied = totalFeeApplied;
    return this;
  }

  /**
   * Get totalFeeApplied
   * @return totalFeeApplied
  **/
  @ApiModelProperty(value = "")

  @Valid

  public NumberComparisonFilter getTotalFeeApplied() {
    return totalFeeApplied;
  }

  public void setTotalFeeApplied(NumberComparisonFilter totalFeeApplied) {
    this.totalFeeApplied = totalFeeApplied;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeesSearchFilter feesSearchFilter = (FeesSearchFilter) o;
    return Objects.equals(this.afbAppliedRedemption, feesSearchFilter.afbAppliedRedemption) &&
        Objects.equals(this.afbAppliedSubscription, feesSearchFilter.afbAppliedSubscription) &&
        Objects.equals(this.annual, feesSearchFilter.annual) &&
        Objects.equals(this.distribution, feesSearchFilter.distribution) &&
        Objects.equals(this.exitMax, feesSearchFilter.exitMax) &&
        Objects.equals(this.initialMax, feesSearchFilter.initialMax) &&
        Objects.equals(this.operatingCashFlow, feesSearchFilter.operatingCashFlow) &&
        Objects.equals(this.operatingCashFlowDate, feesSearchFilter.operatingCashFlowDate) &&
        Objects.equals(this.performance, feesSearchFilter.performance) &&
        Objects.equals(this.totalFeeApplied, feesSearchFilter.totalFeeApplied);
  }

  @Override
  public int hashCode() {
    return Objects.hash(afbAppliedRedemption, afbAppliedSubscription, annual, distribution, exitMax, initialMax, operatingCashFlow, operatingCashFlowDate, performance, totalFeeApplied);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeesSearchFilter {\n");
    
    sb.append("    afbAppliedRedemption: ").append(toIndentedString(afbAppliedRedemption)).append("\n");
    sb.append("    afbAppliedSubscription: ").append(toIndentedString(afbAppliedSubscription)).append("\n");
    sb.append("    annual: ").append(toIndentedString(annual)).append("\n");
    sb.append("    distribution: ").append(toIndentedString(distribution)).append("\n");
    sb.append("    exitMax: ").append(toIndentedString(exitMax)).append("\n");
    sb.append("    initialMax: ").append(toIndentedString(initialMax)).append("\n");
    sb.append("    operatingCashFlow: ").append(toIndentedString(operatingCashFlow)).append("\n");
    sb.append("    operatingCashFlowDate: ").append(toIndentedString(operatingCashFlowDate)).append("\n");
    sb.append("    performance: ").append(toIndentedString(performance)).append("\n");
    sb.append("    totalFeeApplied: ").append(toIndentedString(totalFeeApplied)).append("\n");
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

