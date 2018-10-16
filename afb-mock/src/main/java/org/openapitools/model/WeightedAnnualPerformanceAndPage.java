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
import org.openapitools.model.WeightedAnnualPerformance;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {WeightedAnnualPerformance} and a {Page}. Further more XXX {CalculationPeriod}
 */
@ApiModel(description = "A simple object composed of an array of {WeightedAnnualPerformance} and a {Page}. Further more XXX {CalculationPeriod}")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class WeightedAnnualPerformanceAndPage   {
  @JsonProperty("calculationPeriod")
  private CalculationPeriod calculationPeriod = null;

  @JsonProperty("page")
  private Page page = null;

  @JsonProperty("weightedAndAnnualPerformances")
  @Valid
  private List<WeightedAnnualPerformance> weightedAndAnnualPerformances = null;

  public WeightedAnnualPerformanceAndPage calculationPeriod(CalculationPeriod calculationPeriod) {
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

  public WeightedAnnualPerformanceAndPage page(Page page) {
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

  public WeightedAnnualPerformanceAndPage weightedAndAnnualPerformances(List<WeightedAnnualPerformance> weightedAndAnnualPerformances) {
    this.weightedAndAnnualPerformances = weightedAndAnnualPerformances;
    return this;
  }

  public WeightedAnnualPerformanceAndPage addWeightedAndAnnualPerformancesItem(WeightedAnnualPerformance weightedAndAnnualPerformancesItem) {
    if (this.weightedAndAnnualPerformances == null) {
      this.weightedAndAnnualPerformances = new ArrayList<>();
    }
    this.weightedAndAnnualPerformances.add(weightedAndAnnualPerformancesItem);
    return this;
  }

  /**
   * The array of {WeightedAnnualPerformance}
   * @return weightedAndAnnualPerformances
  **/
  @ApiModelProperty(value = "The array of {WeightedAnnualPerformance}")

  @Valid

  public List<WeightedAnnualPerformance> getWeightedAndAnnualPerformances() {
    return weightedAndAnnualPerformances;
  }

  public void setWeightedAndAnnualPerformances(List<WeightedAnnualPerformance> weightedAndAnnualPerformances) {
    this.weightedAndAnnualPerformances = weightedAndAnnualPerformances;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WeightedAnnualPerformanceAndPage weightedAnnualPerformanceAndPage = (WeightedAnnualPerformanceAndPage) o;
    return Objects.equals(this.calculationPeriod, weightedAnnualPerformanceAndPage.calculationPeriod) &&
        Objects.equals(this.page, weightedAnnualPerformanceAndPage.page) &&
        Objects.equals(this.weightedAndAnnualPerformances, weightedAnnualPerformanceAndPage.weightedAndAnnualPerformances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calculationPeriod, page, weightedAndAnnualPerformances);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WeightedAnnualPerformanceAndPage {\n");
    
    sb.append("    calculationPeriod: ").append(toIndentedString(calculationPeriod)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    weightedAndAnnualPerformances: ").append(toIndentedString(weightedAndAnnualPerformances)).append("\n");
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

