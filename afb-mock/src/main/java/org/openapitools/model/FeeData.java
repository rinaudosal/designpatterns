package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FeeData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class FeeData   {
  @JsonProperty("appliedDistributionFee")
  private Double appliedDistributionFee = null;

  @JsonProperty("appliedManagementFee")
  private Double appliedManagementFee = null;

  @JsonProperty("feesCorrelationPercentage")
  private Double feesCorrelationPercentage = null;

  @JsonProperty("totalFeeApplied")
  private Double totalFeeApplied = null;

  public FeeData appliedDistributionFee(Double appliedDistributionFee) {
    this.appliedDistributionFee = appliedDistributionFee;
    return this;
  }

  /**
   * The distribution fee percentage applied
   * @return appliedDistributionFee
  **/
  @ApiModelProperty(value = "The distribution fee percentage applied")


  public Double getAppliedDistributionFee() {
    return appliedDistributionFee;
  }

  public void setAppliedDistributionFee(Double appliedDistributionFee) {
    this.appliedDistributionFee = appliedDistributionFee;
  }

  public FeeData appliedManagementFee(Double appliedManagementFee) {
    this.appliedManagementFee = appliedManagementFee;
    return this;
  }

  /**
   * The management fee percentage applied
   * @return appliedManagementFee
  **/
  @ApiModelProperty(value = "The management fee percentage applied")


  public Double getAppliedManagementFee() {
    return appliedManagementFee;
  }

  public void setAppliedManagementFee(Double appliedManagementFee) {
    this.appliedManagementFee = appliedManagementFee;
  }

  public FeeData feesCorrelationPercentage(Double feesCorrelationPercentage) {
    this.feesCorrelationPercentage = feesCorrelationPercentage;
    return this;
  }

  /**
   * The percentage of the correlation between the {FeeData.appliedDistributionFee} and the {FeeData.appliedManagementFee}
   * @return feesCorrelationPercentage
  **/
  @ApiModelProperty(value = "The percentage of the correlation between the {FeeData.appliedDistributionFee} and the {FeeData.appliedManagementFee}")


  public Double getFeesCorrelationPercentage() {
    return feesCorrelationPercentage;
  }

  public void setFeesCorrelationPercentage(Double feesCorrelationPercentage) {
    this.feesCorrelationPercentage = feesCorrelationPercentage;
  }

  public FeeData totalFeeApplied(Double totalFeeApplied) {
    this.totalFeeApplied = totalFeeApplied;
    return this;
  }

  /**
   * The total fee applied
   * @return totalFeeApplied
  **/
  @ApiModelProperty(value = "The total fee applied")


  public Double getTotalFeeApplied() {
    return totalFeeApplied;
  }

  public void setTotalFeeApplied(Double totalFeeApplied) {
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
    FeeData feeData = (FeeData) o;
    return Objects.equals(this.appliedDistributionFee, feeData.appliedDistributionFee) &&
        Objects.equals(this.appliedManagementFee, feeData.appliedManagementFee) &&
        Objects.equals(this.feesCorrelationPercentage, feeData.feesCorrelationPercentage) &&
        Objects.equals(this.totalFeeApplied, feeData.totalFeeApplied);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appliedDistributionFee, appliedManagementFee, feesCorrelationPercentage, totalFeeApplied);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeeData {\n");
    
    sb.append("    appliedDistributionFee: ").append(toIndentedString(appliedDistributionFee)).append("\n");
    sb.append("    appliedManagementFee: ").append(toIndentedString(appliedManagementFee)).append("\n");
    sb.append("    feesCorrelationPercentage: ").append(toIndentedString(feesCorrelationPercentage)).append("\n");
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

