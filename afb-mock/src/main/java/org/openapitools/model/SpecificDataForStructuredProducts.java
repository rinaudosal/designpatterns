package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SpecificDataForStructuredProducts
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SpecificDataForStructuredProducts   {
  @JsonProperty("incidentalCostsPortfolioCarriedInterestsRiy")
  private String incidentalCostsPortfolioCarriedInterestsRiy = null;

  @JsonProperty("incidentalCostsPortfolioPerformanceFeesRiy")
  private Double incidentalCostsPortfolioPerformanceFeesRiy = null;

  @JsonProperty("oneOffCostsPortfolioEntryCostRiy")
  private Double oneOffCostsPortfolioEntryCostRiy = null;

  @JsonProperty("oneOffCostsPortfolioExitCostRiy")
  private Double oneOffCostsPortfolioExitCostRiy = null;

  @JsonProperty("ongoingCostsOtherOngoingCostsRiy")
  private Double ongoingCostsOtherOngoingCostsRiy = null;

  @JsonProperty("ongoingCostsPortfolioTransactionCostsRiy")
  private Double ongoingCostsPortfolioTransactionCostsRiy = null;

  @JsonProperty("riy1Year")
  private Double riy1Year = null;

  @JsonProperty("riyHalfRhp")
  private Double riyHalfRhp = null;

  @JsonProperty("riyRhp")
  private Double riyRhp = null;

  @JsonProperty("totalCost1Year")
  private Double totalCost1Year = null;

  @JsonProperty("totalCostHalfRhp")
  private Double totalCostHalfRhp = null;

  @JsonProperty("totalCostRhp")
  private Double totalCostRhp = null;

  public SpecificDataForStructuredProducts incidentalCostsPortfolioCarriedInterestsRiy(String incidentalCostsPortfolioCarriedInterestsRiy) {
    this.incidentalCostsPortfolioCarriedInterestsRiy = incidentalCostsPortfolioCarriedInterestsRiy;
    return this;
  }

  /**
   * RIY in case the investor cashes in at the middle of the RHP, as requested in the \"Costs over time\" table.
   * @return incidentalCostsPortfolioCarriedInterestsRiy
  **/
  @ApiModelProperty(value = "RIY in case the investor cashes in at the middle of the RHP, as requested in the \"Costs over time\" table.")


  public String getIncidentalCostsPortfolioCarriedInterestsRiy() {
    return incidentalCostsPortfolioCarriedInterestsRiy;
  }

  public void setIncidentalCostsPortfolioCarriedInterestsRiy(String incidentalCostsPortfolioCarriedInterestsRiy) {
    this.incidentalCostsPortfolioCarriedInterestsRiy = incidentalCostsPortfolioCarriedInterestsRiy;
  }

  public SpecificDataForStructuredProducts incidentalCostsPortfolioPerformanceFeesRiy(Double incidentalCostsPortfolioPerformanceFeesRiy) {
    this.incidentalCostsPortfolioPerformanceFeesRiy = incidentalCostsPortfolioPerformanceFeesRiy;
    return this;
  }

  /**
   * The performance fees in RIY terms, as requested in the \"Composition of costs\" table.
   * @return incidentalCostsPortfolioPerformanceFeesRiy
  **/
  @ApiModelProperty(value = "The performance fees in RIY terms, as requested in the \"Composition of costs\" table.")


  public Double getIncidentalCostsPortfolioPerformanceFeesRiy() {
    return incidentalCostsPortfolioPerformanceFeesRiy;
  }

  public void setIncidentalCostsPortfolioPerformanceFeesRiy(Double incidentalCostsPortfolioPerformanceFeesRiy) {
    this.incidentalCostsPortfolioPerformanceFeesRiy = incidentalCostsPortfolioPerformanceFeesRiy;
  }

  public SpecificDataForStructuredProducts oneOffCostsPortfolioEntryCostRiy(Double oneOffCostsPortfolioEntryCostRiy) {
    this.oneOffCostsPortfolioEntryCostRiy = oneOffCostsPortfolioEntryCostRiy;
    return this;
  }

  /**
   * The entry cost in RIY terms, as requested in the \"Composition of costs\" table.
   * @return oneOffCostsPortfolioEntryCostRiy
  **/
  @ApiModelProperty(value = "The entry cost in RIY terms, as requested in the \"Composition of costs\" table.")


  public Double getOneOffCostsPortfolioEntryCostRiy() {
    return oneOffCostsPortfolioEntryCostRiy;
  }

  public void setOneOffCostsPortfolioEntryCostRiy(Double oneOffCostsPortfolioEntryCostRiy) {
    this.oneOffCostsPortfolioEntryCostRiy = oneOffCostsPortfolioEntryCostRiy;
  }

  public SpecificDataForStructuredProducts oneOffCostsPortfolioExitCostRiy(Double oneOffCostsPortfolioExitCostRiy) {
    this.oneOffCostsPortfolioExitCostRiy = oneOffCostsPortfolioExitCostRiy;
    return this;
  }

  /**
   * The exit cost in RIY terms, as requested in the \"Composition of costs\" table.
   * @return oneOffCostsPortfolioExitCostRiy
  **/
  @ApiModelProperty(value = "The exit cost in RIY terms, as requested in the \"Composition of costs\" table.")


  public Double getOneOffCostsPortfolioExitCostRiy() {
    return oneOffCostsPortfolioExitCostRiy;
  }

  public void setOneOffCostsPortfolioExitCostRiy(Double oneOffCostsPortfolioExitCostRiy) {
    this.oneOffCostsPortfolioExitCostRiy = oneOffCostsPortfolioExitCostRiy;
  }

  public SpecificDataForStructuredProducts ongoingCostsOtherOngoingCostsRiy(Double ongoingCostsOtherOngoingCostsRiy) {
    this.ongoingCostsOtherOngoingCostsRiy = ongoingCostsOtherOngoingCostsRiy;
    return this;
  }

  /**
   * The other ongoing costs in RIY terms, as requested in the \"Composition of costs\" table.
   * @return ongoingCostsOtherOngoingCostsRiy
  **/
  @ApiModelProperty(value = "The other ongoing costs in RIY terms, as requested in the \"Composition of costs\" table.")


  public Double getOngoingCostsOtherOngoingCostsRiy() {
    return ongoingCostsOtherOngoingCostsRiy;
  }

  public void setOngoingCostsOtherOngoingCostsRiy(Double ongoingCostsOtherOngoingCostsRiy) {
    this.ongoingCostsOtherOngoingCostsRiy = ongoingCostsOtherOngoingCostsRiy;
  }

  public SpecificDataForStructuredProducts ongoingCostsPortfolioTransactionCostsRiy(Double ongoingCostsPortfolioTransactionCostsRiy) {
    this.ongoingCostsPortfolioTransactionCostsRiy = ongoingCostsPortfolioTransactionCostsRiy;
    return this;
  }

  /**
   * The portfolio transaction costs in RIY terms, as requested in the \"Composition of costs\" table.
   * @return ongoingCostsPortfolioTransactionCostsRiy
  **/
  @ApiModelProperty(value = "The portfolio transaction costs in RIY terms, as requested in the \"Composition of costs\" table.")


  public Double getOngoingCostsPortfolioTransactionCostsRiy() {
    return ongoingCostsPortfolioTransactionCostsRiy;
  }

  public void setOngoingCostsPortfolioTransactionCostsRiy(Double ongoingCostsPortfolioTransactionCostsRiy) {
    this.ongoingCostsPortfolioTransactionCostsRiy = ongoingCostsPortfolioTransactionCostsRiy;
  }

  public SpecificDataForStructuredProducts riy1Year(Double riy1Year) {
    this.riy1Year = riy1Year;
    return this;
  }

  /**
   * RIY in case the investor cashes in after one year, as requested in the \"Costs over time\" table.
   * @return riy1Year
  **/
  @ApiModelProperty(value = "RIY in case the investor cashes in after one year, as requested in the \"Costs over time\" table.")


  public Double getRiy1Year() {
    return riy1Year;
  }

  public void setRiy1Year(Double riy1Year) {
    this.riy1Year = riy1Year;
  }

  public SpecificDataForStructuredProducts riyHalfRhp(Double riyHalfRhp) {
    this.riyHalfRhp = riyHalfRhp;
    return this;
  }

  /**
   * RIY in case the investor cashes in at the middle of the RHP, as requested in the \"Costs over time\" table.
   * @return riyHalfRhp
  **/
  @ApiModelProperty(value = "RIY in case the investor cashes in at the middle of the RHP, as requested in the \"Costs over time\" table.")


  public Double getRiyHalfRhp() {
    return riyHalfRhp;
  }

  public void setRiyHalfRhp(Double riyHalfRhp) {
    this.riyHalfRhp = riyHalfRhp;
  }

  public SpecificDataForStructuredProducts riyRhp(Double riyRhp) {
    this.riyRhp = riyRhp;
    return this;
  }

  /**
   * RIY in case the investor cashes in at the RHP, as requested in the \"Costs over time\" table.
   * @return riyRhp
  **/
  @ApiModelProperty(value = "RIY in case the investor cashes in at the RHP, as requested in the \"Costs over time\" table.")


  public Double getRiyRhp() {
    return riyRhp;
  }

  public void setRiyRhp(Double riyRhp) {
    this.riyRhp = riyRhp;
  }

  public SpecificDataForStructuredProducts totalCost1Year(Double totalCost1Year) {
    this.totalCost1Year = totalCost1Year;
    return this;
  }

  /**
   * Total cost in 00060_Share_Class_Currency terms in case the investor cashes in after one year, as requested in the \"Costs over time\" table. Rebased to 1.
   * @return totalCost1Year
  **/
  @ApiModelProperty(value = "Total cost in 00060_Share_Class_Currency terms in case the investor cashes in after one year, as requested in the \"Costs over time\" table. Rebased to 1.")


  public Double getTotalCost1Year() {
    return totalCost1Year;
  }

  public void setTotalCost1Year(Double totalCost1Year) {
    this.totalCost1Year = totalCost1Year;
  }

  public SpecificDataForStructuredProducts totalCostHalfRhp(Double totalCostHalfRhp) {
    this.totalCostHalfRhp = totalCostHalfRhp;
    return this;
  }

  /**
   * Total cost in 00060_Share_Class_Currency terms in case the investor cashes in at the middle of the RHP, as requested in the \"Costs over time\" table.
   * @return totalCostHalfRhp
  **/
  @ApiModelProperty(value = "Total cost in 00060_Share_Class_Currency terms in case the investor cashes in at the middle of the RHP, as requested in the \"Costs over time\" table.")


  public Double getTotalCostHalfRhp() {
    return totalCostHalfRhp;
  }

  public void setTotalCostHalfRhp(Double totalCostHalfRhp) {
    this.totalCostHalfRhp = totalCostHalfRhp;
  }

  public SpecificDataForStructuredProducts totalCostRhp(Double totalCostRhp) {
    this.totalCostRhp = totalCostRhp;
    return this;
  }

  /**
   * Total cost in 00060_Share_Class_Currency terms in case the investor cashes in at the RHP, as requested in the \"Costs over time\" table.
   * @return totalCostRhp
  **/
  @ApiModelProperty(value = "Total cost in 00060_Share_Class_Currency terms in case the investor cashes in at the RHP, as requested in the \"Costs over time\" table.")


  public Double getTotalCostRhp() {
    return totalCostRhp;
  }

  public void setTotalCostRhp(Double totalCostRhp) {
    this.totalCostRhp = totalCostRhp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpecificDataForStructuredProducts specificDataForStructuredProducts = (SpecificDataForStructuredProducts) o;
    return Objects.equals(this.incidentalCostsPortfolioCarriedInterestsRiy, specificDataForStructuredProducts.incidentalCostsPortfolioCarriedInterestsRiy) &&
        Objects.equals(this.incidentalCostsPortfolioPerformanceFeesRiy, specificDataForStructuredProducts.incidentalCostsPortfolioPerformanceFeesRiy) &&
        Objects.equals(this.oneOffCostsPortfolioEntryCostRiy, specificDataForStructuredProducts.oneOffCostsPortfolioEntryCostRiy) &&
        Objects.equals(this.oneOffCostsPortfolioExitCostRiy, specificDataForStructuredProducts.oneOffCostsPortfolioExitCostRiy) &&
        Objects.equals(this.ongoingCostsOtherOngoingCostsRiy, specificDataForStructuredProducts.ongoingCostsOtherOngoingCostsRiy) &&
        Objects.equals(this.ongoingCostsPortfolioTransactionCostsRiy, specificDataForStructuredProducts.ongoingCostsPortfolioTransactionCostsRiy) &&
        Objects.equals(this.riy1Year, specificDataForStructuredProducts.riy1Year) &&
        Objects.equals(this.riyHalfRhp, specificDataForStructuredProducts.riyHalfRhp) &&
        Objects.equals(this.riyRhp, specificDataForStructuredProducts.riyRhp) &&
        Objects.equals(this.totalCost1Year, specificDataForStructuredProducts.totalCost1Year) &&
        Objects.equals(this.totalCostHalfRhp, specificDataForStructuredProducts.totalCostHalfRhp) &&
        Objects.equals(this.totalCostRhp, specificDataForStructuredProducts.totalCostRhp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(incidentalCostsPortfolioCarriedInterestsRiy, incidentalCostsPortfolioPerformanceFeesRiy, oneOffCostsPortfolioEntryCostRiy, oneOffCostsPortfolioExitCostRiy, ongoingCostsOtherOngoingCostsRiy, ongoingCostsPortfolioTransactionCostsRiy, riy1Year, riyHalfRhp, riyRhp, totalCost1Year, totalCostHalfRhp, totalCostRhp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecificDataForStructuredProducts {\n");
    
    sb.append("    incidentalCostsPortfolioCarriedInterestsRiy: ").append(toIndentedString(incidentalCostsPortfolioCarriedInterestsRiy)).append("\n");
    sb.append("    incidentalCostsPortfolioPerformanceFeesRiy: ").append(toIndentedString(incidentalCostsPortfolioPerformanceFeesRiy)).append("\n");
    sb.append("    oneOffCostsPortfolioEntryCostRiy: ").append(toIndentedString(oneOffCostsPortfolioEntryCostRiy)).append("\n");
    sb.append("    oneOffCostsPortfolioExitCostRiy: ").append(toIndentedString(oneOffCostsPortfolioExitCostRiy)).append("\n");
    sb.append("    ongoingCostsOtherOngoingCostsRiy: ").append(toIndentedString(ongoingCostsOtherOngoingCostsRiy)).append("\n");
    sb.append("    ongoingCostsPortfolioTransactionCostsRiy: ").append(toIndentedString(ongoingCostsPortfolioTransactionCostsRiy)).append("\n");
    sb.append("    riy1Year: ").append(toIndentedString(riy1Year)).append("\n");
    sb.append("    riyHalfRhp: ").append(toIndentedString(riyHalfRhp)).append("\n");
    sb.append("    riyRhp: ").append(toIndentedString(riyRhp)).append("\n");
    sb.append("    totalCost1Year: ").append(toIndentedString(totalCost1Year)).append("\n");
    sb.append("    totalCostHalfRhp: ").append(toIndentedString(totalCostHalfRhp)).append("\n");
    sb.append("    totalCostRhp: ").append(toIndentedString(totalCostRhp)).append("\n");
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

