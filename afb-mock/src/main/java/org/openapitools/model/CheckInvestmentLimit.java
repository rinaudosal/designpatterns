package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CheckInvestmentLimit
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class CheckInvestmentLimit   {
  @JsonProperty("failsRiskLevel")
  private Boolean failsRiskLevel = null;

  @JsonProperty("featureTypeCode")
  private String featureTypeCode = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("investmentLimitRiskLevelCode")
  private String investmentLimitRiskLevelCode = null;

  @JsonProperty("percentage")
  private Double percentage = null;

  public CheckInvestmentLimit failsRiskLevel(Boolean failsRiskLevel) {
    this.failsRiskLevel = failsRiskLevel;
    return this;
  }

  /**
   * Get failsRiskLevel
   * @return failsRiskLevel
  **/
  @ApiModelProperty(value = "")


  public Boolean getFailsRiskLevel() {
    return failsRiskLevel;
  }

  public void setFailsRiskLevel(Boolean failsRiskLevel) {
    this.failsRiskLevel = failsRiskLevel;
  }

  public CheckInvestmentLimit featureTypeCode(String featureTypeCode) {
    this.featureTypeCode = featureTypeCode;
    return this;
  }

  /**
   * The feature of InvestmentLimit. Refer to {listInvestmentLimitFeaturesByDistributor}
   * @return featureTypeCode
  **/
  @ApiModelProperty(value = "The feature of InvestmentLimit. Refer to {listInvestmentLimitFeaturesByDistributor}")


  public String getFeatureTypeCode() {
    return featureTypeCode;
  }

  public void setFeatureTypeCode(String featureTypeCode) {
    this.featureTypeCode = featureTypeCode;
  }

  public CheckInvestmentLimit id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The Id of the {Feature}
   * @return id
  **/
  @ApiModelProperty(value = "The Id of the {Feature}")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CheckInvestmentLimit investmentLimitRiskLevelCode(String investmentLimitRiskLevelCode) {
    this.investmentLimitRiskLevelCode = investmentLimitRiskLevelCode;
    return this;
  }

  /**
   * The feature of InvestmentLimit. Refer to {listInvestmentLimitRiskLevels}
   * @return investmentLimitRiskLevelCode
  **/
  @ApiModelProperty(value = "The feature of InvestmentLimit. Refer to {listInvestmentLimitRiskLevels}")


  public String getInvestmentLimitRiskLevelCode() {
    return investmentLimitRiskLevelCode;
  }

  public void setInvestmentLimitRiskLevelCode(String investmentLimitRiskLevelCode) {
    this.investmentLimitRiskLevelCode = investmentLimitRiskLevelCode;
  }

  public CheckInvestmentLimit percentage(Double percentage) {
    this.percentage = percentage;
    return this;
  }

  /**
   * Get percentage
   * @return percentage
  **/
  @ApiModelProperty(value = "")


  public Double getPercentage() {
    return percentage;
  }

  public void setPercentage(Double percentage) {
    this.percentage = percentage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckInvestmentLimit checkInvestmentLimit = (CheckInvestmentLimit) o;
    return Objects.equals(this.failsRiskLevel, checkInvestmentLimit.failsRiskLevel) &&
        Objects.equals(this.featureTypeCode, checkInvestmentLimit.featureTypeCode) &&
        Objects.equals(this.id, checkInvestmentLimit.id) &&
        Objects.equals(this.investmentLimitRiskLevelCode, checkInvestmentLimit.investmentLimitRiskLevelCode) &&
        Objects.equals(this.percentage, checkInvestmentLimit.percentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failsRiskLevel, featureTypeCode, id, investmentLimitRiskLevelCode, percentage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckInvestmentLimit {\n");
    
    sb.append("    failsRiskLevel: ").append(toIndentedString(failsRiskLevel)).append("\n");
    sb.append("    featureTypeCode: ").append(toIndentedString(featureTypeCode)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    investmentLimitRiskLevelCode: ").append(toIndentedString(investmentLimitRiskLevelCode)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
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

