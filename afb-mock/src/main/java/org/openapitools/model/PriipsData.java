package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Costs;
import org.openapitools.model.GeneralPortfolioInformation;
import org.openapitools.model.Narratives;
import org.openapitools.model.PerformanceScenario;
import org.openapitools.model.RiskAssessment;
import org.openapitools.model.SpecificDataForGermanCat;
import org.openapitools.model.SpecificDataForStructuredProducts;
import org.openapitools.model.SpecificUcitsDataForInsurersForMop;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PriipsData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class PriipsData   {
  @JsonProperty("costs")
  private Costs costs = null;

  @JsonProperty("generalPortfolioInformation")
  private GeneralPortfolioInformation generalPortfolioInformation = null;

  @JsonProperty("narratives")
  private Narratives narratives = null;

  @JsonProperty("performanceScenario")
  private PerformanceScenario performanceScenario = null;

  @JsonProperty("riskAssessment")
  private RiskAssessment riskAssessment = null;

  @JsonProperty("specificDataForGermanCat")
  private SpecificDataForGermanCat specificDataForGermanCat = null;

  @JsonProperty("specificDataForStructuredProducts")
  private SpecificDataForStructuredProducts specificDataForStructuredProducts = null;

  @JsonProperty("specificUcitsDataForInsurersForMop")
  private SpecificUcitsDataForInsurersForMop specificUcitsDataForInsurersForMop = null;

  public PriipsData costs(Costs costs) {
    this.costs = costs;
    return this;
  }

  /**
   * Get costs
   * @return costs
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Costs getCosts() {
    return costs;
  }

  public void setCosts(Costs costs) {
    this.costs = costs;
  }

  public PriipsData generalPortfolioInformation(GeneralPortfolioInformation generalPortfolioInformation) {
    this.generalPortfolioInformation = generalPortfolioInformation;
    return this;
  }

  /**
   * Get generalPortfolioInformation
   * @return generalPortfolioInformation
  **/
  @ApiModelProperty(value = "")

  @Valid

  public GeneralPortfolioInformation getGeneralPortfolioInformation() {
    return generalPortfolioInformation;
  }

  public void setGeneralPortfolioInformation(GeneralPortfolioInformation generalPortfolioInformation) {
    this.generalPortfolioInformation = generalPortfolioInformation;
  }

  public PriipsData narratives(Narratives narratives) {
    this.narratives = narratives;
    return this;
  }

  /**
   * Get narratives
   * @return narratives
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Narratives getNarratives() {
    return narratives;
  }

  public void setNarratives(Narratives narratives) {
    this.narratives = narratives;
  }

  public PriipsData performanceScenario(PerformanceScenario performanceScenario) {
    this.performanceScenario = performanceScenario;
    return this;
  }

  /**
   * Get performanceScenario
   * @return performanceScenario
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PerformanceScenario getPerformanceScenario() {
    return performanceScenario;
  }

  public void setPerformanceScenario(PerformanceScenario performanceScenario) {
    this.performanceScenario = performanceScenario;
  }

  public PriipsData riskAssessment(RiskAssessment riskAssessment) {
    this.riskAssessment = riskAssessment;
    return this;
  }

  /**
   * Get riskAssessment
   * @return riskAssessment
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RiskAssessment getRiskAssessment() {
    return riskAssessment;
  }

  public void setRiskAssessment(RiskAssessment riskAssessment) {
    this.riskAssessment = riskAssessment;
  }

  public PriipsData specificDataForGermanCat(SpecificDataForGermanCat specificDataForGermanCat) {
    this.specificDataForGermanCat = specificDataForGermanCat;
    return this;
  }

  /**
   * Get specificDataForGermanCat
   * @return specificDataForGermanCat
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SpecificDataForGermanCat getSpecificDataForGermanCat() {
    return specificDataForGermanCat;
  }

  public void setSpecificDataForGermanCat(SpecificDataForGermanCat specificDataForGermanCat) {
    this.specificDataForGermanCat = specificDataForGermanCat;
  }

  public PriipsData specificDataForStructuredProducts(SpecificDataForStructuredProducts specificDataForStructuredProducts) {
    this.specificDataForStructuredProducts = specificDataForStructuredProducts;
    return this;
  }

  /**
   * Get specificDataForStructuredProducts
   * @return specificDataForStructuredProducts
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SpecificDataForStructuredProducts getSpecificDataForStructuredProducts() {
    return specificDataForStructuredProducts;
  }

  public void setSpecificDataForStructuredProducts(SpecificDataForStructuredProducts specificDataForStructuredProducts) {
    this.specificDataForStructuredProducts = specificDataForStructuredProducts;
  }

  public PriipsData specificUcitsDataForInsurersForMop(SpecificUcitsDataForInsurersForMop specificUcitsDataForInsurersForMop) {
    this.specificUcitsDataForInsurersForMop = specificUcitsDataForInsurersForMop;
    return this;
  }

  /**
   * Get specificUcitsDataForInsurersForMop
   * @return specificUcitsDataForInsurersForMop
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SpecificUcitsDataForInsurersForMop getSpecificUcitsDataForInsurersForMop() {
    return specificUcitsDataForInsurersForMop;
  }

  public void setSpecificUcitsDataForInsurersForMop(SpecificUcitsDataForInsurersForMop specificUcitsDataForInsurersForMop) {
    this.specificUcitsDataForInsurersForMop = specificUcitsDataForInsurersForMop;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriipsData priipsData = (PriipsData) o;
    return Objects.equals(this.costs, priipsData.costs) &&
        Objects.equals(this.generalPortfolioInformation, priipsData.generalPortfolioInformation) &&
        Objects.equals(this.narratives, priipsData.narratives) &&
        Objects.equals(this.performanceScenario, priipsData.performanceScenario) &&
        Objects.equals(this.riskAssessment, priipsData.riskAssessment) &&
        Objects.equals(this.specificDataForGermanCat, priipsData.specificDataForGermanCat) &&
        Objects.equals(this.specificDataForStructuredProducts, priipsData.specificDataForStructuredProducts) &&
        Objects.equals(this.specificUcitsDataForInsurersForMop, priipsData.specificUcitsDataForInsurersForMop);
  }

  @Override
  public int hashCode() {
    return Objects.hash(costs, generalPortfolioInformation, narratives, performanceScenario, riskAssessment, specificDataForGermanCat, specificDataForStructuredProducts, specificUcitsDataForInsurersForMop);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriipsData {\n");
    
    sb.append("    costs: ").append(toIndentedString(costs)).append("\n");
    sb.append("    generalPortfolioInformation: ").append(toIndentedString(generalPortfolioInformation)).append("\n");
    sb.append("    narratives: ").append(toIndentedString(narratives)).append("\n");
    sb.append("    performanceScenario: ").append(toIndentedString(performanceScenario)).append("\n");
    sb.append("    riskAssessment: ").append(toIndentedString(riskAssessment)).append("\n");
    sb.append("    specificDataForGermanCat: ").append(toIndentedString(specificDataForGermanCat)).append("\n");
    sb.append("    specificDataForStructuredProducts: ").append(toIndentedString(specificDataForStructuredProducts)).append("\n");
    sb.append("    specificUcitsDataForInsurersForMop: ").append(toIndentedString(specificUcitsDataForInsurersForMop)).append("\n");
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

