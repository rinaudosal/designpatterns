package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RiskScoreScorecardFeature
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class RiskScoreScorecardFeature   {
  @JsonProperty("featureId")
  private Long featureId = null;

  @JsonProperty("operationalPortfolioId")
  private Long operationalPortfolioId = null;

  @JsonProperty("riskScore")
  private Long riskScore = null;

  public RiskScoreScorecardFeature featureId(Long featureId) {
    this.featureId = featureId;
    return this;
  }

  /**
   * The Id of the {Feature}
   * @return featureId
  **/
  @ApiModelProperty(value = "The Id of the {Feature}")


  public Long getFeatureId() {
    return featureId;
  }

  public void setFeatureId(Long featureId) {
    this.featureId = featureId;
  }

  public RiskScoreScorecardFeature operationalPortfolioId(Long operationalPortfolioId) {
    this.operationalPortfolioId = operationalPortfolioId;
    return this;
  }

  /**
   * The Id of the {OperationalPortfolio}
   * @return operationalPortfolioId
  **/
  @ApiModelProperty(value = "The Id of the {OperationalPortfolio}")


  public Long getOperationalPortfolioId() {
    return operationalPortfolioId;
  }

  public void setOperationalPortfolioId(Long operationalPortfolioId) {
    this.operationalPortfolioId = operationalPortfolioId;
  }

  public RiskScoreScorecardFeature riskScore(Long riskScore) {
    this.riskScore = riskScore;
    return this;
  }

  /**
   * The risk score refer to {Scorecard}
   * @return riskScore
  **/
  @ApiModelProperty(value = "The risk score refer to {Scorecard}")


  public Long getRiskScore() {
    return riskScore;
  }

  public void setRiskScore(Long riskScore) {
    this.riskScore = riskScore;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskScoreScorecardFeature riskScoreScorecardFeature = (RiskScoreScorecardFeature) o;
    return Objects.equals(this.featureId, riskScoreScorecardFeature.featureId) &&
        Objects.equals(this.operationalPortfolioId, riskScoreScorecardFeature.operationalPortfolioId) &&
        Objects.equals(this.riskScore, riskScoreScorecardFeature.riskScore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(featureId, operationalPortfolioId, riskScore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskScoreScorecardFeature {\n");
    
    sb.append("    featureId: ").append(toIndentedString(featureId)).append("\n");
    sb.append("    operationalPortfolioId: ").append(toIndentedString(operationalPortfolioId)).append("\n");
    sb.append("    riskScore: ").append(toIndentedString(riskScore)).append("\n");
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

