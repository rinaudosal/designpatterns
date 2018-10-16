package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.CalculationPeriod;
import org.openapitools.model.Page;
import org.openapitools.model.WeightedCumulativePerformance;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {WeightedCumulativePerformance} and a {Page}. Further more XXX {CalculationPeriod}
 */
@ApiModel(description = "A simple object composed of an array of {WeightedCumulativePerformance} and a {Page}. Further more XXX {CalculationPeriod}")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class WeightedCumulativePerformanceAndPage   {
  @JsonProperty("calculationPeriod")
  private CalculationPeriod calculationPeriod = null;

  @JsonProperty("page")
  private Page page = null;

  @JsonProperty("weightedCumulativePerformances")
  @Valid
  private List<WeightedCumulativePerformance> weightedCumulativePerformances = null;

  public WeightedCumulativePerformanceAndPage calculationPeriod(CalculationPeriod calculationPeriod) {
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

  public WeightedCumulativePerformanceAndPage page(Page page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   * @return page
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Page getPage() {
    return page;
  }

  public void setPage(Page page) {
    this.page = page;
  }

  public WeightedCumulativePerformanceAndPage weightedCumulativePerformances(List<WeightedCumulativePerformance> weightedCumulativePerformances) {
    this.weightedCumulativePerformances = weightedCumulativePerformances;
    return this;
  }

  public WeightedCumulativePerformanceAndPage addWeightedCumulativePerformancesItem(WeightedCumulativePerformance weightedCumulativePerformancesItem) {
    if (this.weightedCumulativePerformances == null) {
      this.weightedCumulativePerformances = new ArrayList<>();
    }
    this.weightedCumulativePerformances.add(weightedCumulativePerformancesItem);
    return this;
  }

  /**
   * The array of {WeightedCumulativePerformance}
   * @return weightedCumulativePerformances
  **/
  @ApiModelProperty(value = "The array of {WeightedCumulativePerformance}")

  @Valid

  public List<WeightedCumulativePerformance> getWeightedCumulativePerformances() {
    return weightedCumulativePerformances;
  }

  public void setWeightedCumulativePerformances(List<WeightedCumulativePerformance> weightedCumulativePerformances) {
    this.weightedCumulativePerformances = weightedCumulativePerformances;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WeightedCumulativePerformanceAndPage weightedCumulativePerformanceAndPage = (WeightedCumulativePerformanceAndPage) o;
    return Objects.equals(this.calculationPeriod, weightedCumulativePerformanceAndPage.calculationPeriod) &&
        Objects.equals(this.page, weightedCumulativePerformanceAndPage.page) &&
        Objects.equals(this.weightedCumulativePerformances, weightedCumulativePerformanceAndPage.weightedCumulativePerformances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calculationPeriod, page, weightedCumulativePerformances);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WeightedCumulativePerformanceAndPage {\n");
    
    sb.append("    calculationPeriod: ").append(toIndentedString(calculationPeriod)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    weightedCumulativePerformances: ").append(toIndentedString(weightedCumulativePerformances)).append("\n");
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

