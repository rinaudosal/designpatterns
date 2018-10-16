package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Fees
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class Fees   {
  @JsonProperty("afbAppliedRedemption")
  private Double afbAppliedRedemption = null;

  @JsonProperty("afbAppliedSubscription")
  private Double afbAppliedSubscription = null;

  @JsonProperty("annualManagement")
  private Double annualManagement = null;

  @JsonProperty("distribution")
  private Double distribution = null;

  @JsonProperty("maximumRedemption")
  private Double maximumRedemption = null;

  @JsonProperty("maximumSubcription")
  private Double maximumSubcription = null;

  @JsonProperty("ongoingCharge")
  private Double ongoingCharge = null;

  @JsonProperty("ongoingChargeDate")
  private OffsetDateTime ongoingChargeDate = null;

  @JsonProperty("others")
  private Double others = null;

  @JsonProperty("performance")
  private Double performance = null;

  @JsonProperty("total")
  private Double total = null;

  public Fees afbAppliedRedemption(Double afbAppliedRedemption) {
    this.afbAppliedRedemption = afbAppliedRedemption;
    return this;
  }

  /**
   * Fee for AFB Applied Redemption.
   * @return afbAppliedRedemption
  **/
  @ApiModelProperty(value = "Fee for AFB Applied Redemption.")


  public Double getAfbAppliedRedemption() {
    return afbAppliedRedemption;
  }

  public void setAfbAppliedRedemption(Double afbAppliedRedemption) {
    this.afbAppliedRedemption = afbAppliedRedemption;
  }

  public Fees afbAppliedSubscription(Double afbAppliedSubscription) {
    this.afbAppliedSubscription = afbAppliedSubscription;
    return this;
  }

  /**
   * Fee for AFB Applied Subscription.
   * @return afbAppliedSubscription
  **/
  @ApiModelProperty(value = "Fee for AFB Applied Subscription.")


  public Double getAfbAppliedSubscription() {
    return afbAppliedSubscription;
  }

  public void setAfbAppliedSubscription(Double afbAppliedSubscription) {
    this.afbAppliedSubscription = afbAppliedSubscription;
  }

  public Fees annualManagement(Double annualManagement) {
    this.annualManagement = annualManagement;
    return this;
  }

  /**
   * Annual Management fee.
   * @return annualManagement
  **/
  @ApiModelProperty(value = "Annual Management fee.")


  public Double getAnnualManagement() {
    return annualManagement;
  }

  public void setAnnualManagement(Double annualManagement) {
    this.annualManagement = annualManagement;
  }

  public Fees distribution(Double distribution) {
    this.distribution = distribution;
    return this;
  }

  /**
   * Distribution fee.
   * @return distribution
  **/
  @ApiModelProperty(value = "Distribution fee.")


  public Double getDistribution() {
    return distribution;
  }

  public void setDistribution(Double distribution) {
    this.distribution = distribution;
  }

  public Fees maximumRedemption(Double maximumRedemption) {
    this.maximumRedemption = maximumRedemption;
    return this;
  }

  /**
   * Maximum redemption fee.
   * @return maximumRedemption
  **/
  @ApiModelProperty(value = "Maximum redemption fee.")


  public Double getMaximumRedemption() {
    return maximumRedemption;
  }

  public void setMaximumRedemption(Double maximumRedemption) {
    this.maximumRedemption = maximumRedemption;
  }

  public Fees maximumSubcription(Double maximumSubcription) {
    this.maximumSubcription = maximumSubcription;
    return this;
  }

  /**
   * Maximum subscription fee.
   * @return maximumSubcription
  **/
  @ApiModelProperty(value = "Maximum subscription fee.")


  public Double getMaximumSubcription() {
    return maximumSubcription;
  }

  public void setMaximumSubcription(Double maximumSubcription) {
    this.maximumSubcription = maximumSubcription;
  }

  public Fees ongoingCharge(Double ongoingCharge) {
    this.ongoingCharge = ongoingCharge;
    return this;
  }

  /**
   * ongoing charge
   * @return ongoingCharge
  **/
  @ApiModelProperty(value = "ongoing charge")


  public Double getOngoingCharge() {
    return ongoingCharge;
  }

  public void setOngoingCharge(Double ongoingCharge) {
    this.ongoingCharge = ongoingCharge;
  }

  public Fees ongoingChargeDate(OffsetDateTime ongoingChargeDate) {
    this.ongoingChargeDate = ongoingChargeDate;
    return this;
  }

  /**
   * ongoing charge
   * @return ongoingChargeDate
  **/
  @ApiModelProperty(value = "ongoing charge")

  @Valid

  public OffsetDateTime getOngoingChargeDate() {
    return ongoingChargeDate;
  }

  public void setOngoingChargeDate(OffsetDateTime ongoingChargeDate) {
    this.ongoingChargeDate = ongoingChargeDate;
  }

  public Fees others(Double others) {
    this.others = others;
    return this;
  }

  /**
   * Others fee.
   * @return others
  **/
  @ApiModelProperty(value = "Others fee.")


  public Double getOthers() {
    return others;
  }

  public void setOthers(Double others) {
    this.others = others;
  }

  public Fees performance(Double performance) {
    this.performance = performance;
    return this;
  }

  /**
   * Performance fee.
   * @return performance
  **/
  @ApiModelProperty(value = "Performance fee.")


  public Double getPerformance() {
    return performance;
  }

  public void setPerformance(Double performance) {
    this.performance = performance;
  }

  public Fees total(Double total) {
    this.total = total;
    return this;
  }

  /**
   * Total fee.
   * @return total
  **/
  @ApiModelProperty(value = "Total fee.")


  public Double getTotal() {
    return total;
  }

  public void setTotal(Double total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Fees fees = (Fees) o;
    return Objects.equals(this.afbAppliedRedemption, fees.afbAppliedRedemption) &&
        Objects.equals(this.afbAppliedSubscription, fees.afbAppliedSubscription) &&
        Objects.equals(this.annualManagement, fees.annualManagement) &&
        Objects.equals(this.distribution, fees.distribution) &&
        Objects.equals(this.maximumRedemption, fees.maximumRedemption) &&
        Objects.equals(this.maximumSubcription, fees.maximumSubcription) &&
        Objects.equals(this.ongoingCharge, fees.ongoingCharge) &&
        Objects.equals(this.ongoingChargeDate, fees.ongoingChargeDate) &&
        Objects.equals(this.others, fees.others) &&
        Objects.equals(this.performance, fees.performance) &&
        Objects.equals(this.total, fees.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(afbAppliedRedemption, afbAppliedSubscription, annualManagement, distribution, maximumRedemption, maximumSubcription, ongoingCharge, ongoingChargeDate, others, performance, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Fees {\n");
    
    sb.append("    afbAppliedRedemption: ").append(toIndentedString(afbAppliedRedemption)).append("\n");
    sb.append("    afbAppliedSubscription: ").append(toIndentedString(afbAppliedSubscription)).append("\n");
    sb.append("    annualManagement: ").append(toIndentedString(annualManagement)).append("\n");
    sb.append("    distribution: ").append(toIndentedString(distribution)).append("\n");
    sb.append("    maximumRedemption: ").append(toIndentedString(maximumRedemption)).append("\n");
    sb.append("    maximumSubcription: ").append(toIndentedString(maximumSubcription)).append("\n");
    sb.append("    ongoingCharge: ").append(toIndentedString(ongoingCharge)).append("\n");
    sb.append("    ongoingChargeDate: ").append(toIndentedString(ongoingChargeDate)).append("\n");
    sb.append("    others: ").append(toIndentedString(others)).append("\n");
    sb.append("    performance: ").append(toIndentedString(performance)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

