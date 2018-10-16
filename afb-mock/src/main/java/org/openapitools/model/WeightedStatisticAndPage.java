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
import org.openapitools.model.WeightedStatistic;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {WeightedStatistic} and a {Page}. Further more XXX {CalculationPeriod}
 */
@ApiModel(description = "A simple object composed of an array of {WeightedStatistic} and a {Page}. Further more XXX {CalculationPeriod}")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class WeightedStatisticAndPage   {
  @JsonProperty("calculationPeriod")
  private CalculationPeriod calculationPeriod = null;

  @JsonProperty("page")
  private Page page = null;

  @JsonProperty("weightedStatistics")
  @Valid
  private List<WeightedStatistic> weightedStatistics = null;

  public WeightedStatisticAndPage calculationPeriod(CalculationPeriod calculationPeriod) {
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

  public WeightedStatisticAndPage page(Page page) {
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

  public WeightedStatisticAndPage weightedStatistics(List<WeightedStatistic> weightedStatistics) {
    this.weightedStatistics = weightedStatistics;
    return this;
  }

  public WeightedStatisticAndPage addWeightedStatisticsItem(WeightedStatistic weightedStatisticsItem) {
    if (this.weightedStatistics == null) {
      this.weightedStatistics = new ArrayList<>();
    }
    this.weightedStatistics.add(weightedStatisticsItem);
    return this;
  }

  /**
   * The array of {WeightedStatistic}
   * @return weightedStatistics
  **/
  @ApiModelProperty(value = "The array of {WeightedStatistic}")

  @Valid

  public List<WeightedStatistic> getWeightedStatistics() {
    return weightedStatistics;
  }

  public void setWeightedStatistics(List<WeightedStatistic> weightedStatistics) {
    this.weightedStatistics = weightedStatistics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WeightedStatisticAndPage weightedStatisticAndPage = (WeightedStatisticAndPage) o;
    return Objects.equals(this.calculationPeriod, weightedStatisticAndPage.calculationPeriod) &&
        Objects.equals(this.page, weightedStatisticAndPage.page) &&
        Objects.equals(this.weightedStatistics, weightedStatisticAndPage.weightedStatistics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calculationPeriod, page, weightedStatistics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WeightedStatisticAndPage {\n");
    
    sb.append("    calculationPeriod: ").append(toIndentedString(calculationPeriod)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    weightedStatistics: ").append(toIndentedString(weightedStatistics)).append("\n");
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

