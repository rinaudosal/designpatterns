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
import org.openapitools.model.WeightedRiskClassification;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {WeightedRiskClassification} and a {Page}.  Further more XXX {CalculationPeriod}
 */
@ApiModel(description = "A simple object composed of an array of {WeightedRiskClassification} and a {Page}.  Further more XXX {CalculationPeriod}")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class WeightedRiskClassificationAndPage   {
  @JsonProperty("calculationPeriod")
  private CalculationPeriod calculationPeriod = null;

  @JsonProperty("page")
  private Page page = null;

  @JsonProperty("weightedRiskClassifications")
  @Valid
  private List<WeightedRiskClassification> weightedRiskClassifications = null;

  public WeightedRiskClassificationAndPage calculationPeriod(CalculationPeriod calculationPeriod) {
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

  public WeightedRiskClassificationAndPage page(Page page) {
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

  public WeightedRiskClassificationAndPage weightedRiskClassifications(List<WeightedRiskClassification> weightedRiskClassifications) {
    this.weightedRiskClassifications = weightedRiskClassifications;
    return this;
  }

  public WeightedRiskClassificationAndPage addWeightedRiskClassificationsItem(WeightedRiskClassification weightedRiskClassificationsItem) {
    if (this.weightedRiskClassifications == null) {
      this.weightedRiskClassifications = new ArrayList<>();
    }
    this.weightedRiskClassifications.add(weightedRiskClassificationsItem);
    return this;
  }

  /**
   * The array of {WeightedRiskClassification}
   * @return weightedRiskClassifications
  **/
  @ApiModelProperty(value = "The array of {WeightedRiskClassification}")

  @Valid

  public List<WeightedRiskClassification> getWeightedRiskClassifications() {
    return weightedRiskClassifications;
  }

  public void setWeightedRiskClassifications(List<WeightedRiskClassification> weightedRiskClassifications) {
    this.weightedRiskClassifications = weightedRiskClassifications;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WeightedRiskClassificationAndPage weightedRiskClassificationAndPage = (WeightedRiskClassificationAndPage) o;
    return Objects.equals(this.calculationPeriod, weightedRiskClassificationAndPage.calculationPeriod) &&
        Objects.equals(this.page, weightedRiskClassificationAndPage.page) &&
        Objects.equals(this.weightedRiskClassifications, weightedRiskClassificationAndPage.weightedRiskClassifications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calculationPeriod, page, weightedRiskClassifications);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WeightedRiskClassificationAndPage {\n");
    
    sb.append("    calculationPeriod: ").append(toIndentedString(calculationPeriod)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    weightedRiskClassifications: ").append(toIndentedString(weightedRiskClassifications)).append("\n");
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

