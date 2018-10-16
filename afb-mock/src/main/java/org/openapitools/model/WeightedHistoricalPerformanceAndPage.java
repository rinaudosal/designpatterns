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
import org.openapitools.model.WeightedHistoricalPerformance;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {WeightedHistoricalPerformance} and a {Page}.
 */
@ApiModel(description = "A simple object composed of an array of {WeightedHistoricalPerformance} and a {Page}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class WeightedHistoricalPerformanceAndPage   {
  @JsonProperty("calculationPeriod")
  private CalculationPeriod calculationPeriod = null;

  @JsonProperty("page")
  private Page page = null;

  @JsonProperty("weightedHistoricalPerformance")
  @Valid
  private List<WeightedHistoricalPerformance> weightedHistoricalPerformance = null;

  public WeightedHistoricalPerformanceAndPage calculationPeriod(CalculationPeriod calculationPeriod) {
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

  public WeightedHistoricalPerformanceAndPage page(Page page) {
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

  public WeightedHistoricalPerformanceAndPage weightedHistoricalPerformance(List<WeightedHistoricalPerformance> weightedHistoricalPerformance) {
    this.weightedHistoricalPerformance = weightedHistoricalPerformance;
    return this;
  }

  public WeightedHistoricalPerformanceAndPage addWeightedHistoricalPerformanceItem(WeightedHistoricalPerformance weightedHistoricalPerformanceItem) {
    if (this.weightedHistoricalPerformance == null) {
      this.weightedHistoricalPerformance = new ArrayList<>();
    }
    this.weightedHistoricalPerformance.add(weightedHistoricalPerformanceItem);
    return this;
  }

  /**
   * The array of {WeightedHistoricalPerformance}
   * @return weightedHistoricalPerformance
  **/
  @ApiModelProperty(value = "The array of {WeightedHistoricalPerformance}")

  @Valid

  public List<WeightedHistoricalPerformance> getWeightedHistoricalPerformance() {
    return weightedHistoricalPerformance;
  }

  public void setWeightedHistoricalPerformance(List<WeightedHistoricalPerformance> weightedHistoricalPerformance) {
    this.weightedHistoricalPerformance = weightedHistoricalPerformance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WeightedHistoricalPerformanceAndPage weightedHistoricalPerformanceAndPage = (WeightedHistoricalPerformanceAndPage) o;
    return Objects.equals(this.calculationPeriod, weightedHistoricalPerformanceAndPage.calculationPeriod) &&
        Objects.equals(this.page, weightedHistoricalPerformanceAndPage.page) &&
        Objects.equals(this.weightedHistoricalPerformance, weightedHistoricalPerformanceAndPage.weightedHistoricalPerformance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calculationPeriod, page, weightedHistoricalPerformance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WeightedHistoricalPerformanceAndPage {\n");
    
    sb.append("    calculationPeriod: ").append(toIndentedString(calculationPeriod)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    weightedHistoricalPerformance: ").append(toIndentedString(weightedHistoricalPerformance)).append("\n");
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

