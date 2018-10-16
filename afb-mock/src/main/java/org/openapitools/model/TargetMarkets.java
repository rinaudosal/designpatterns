package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AbilityToBearLosses;
import org.openapitools.model.ClientObjectivesAndNeeds;
import org.openapitools.model.InverstorType;
import org.openapitools.model.KnowledgeAndOrExperience;
import org.openapitools.model.RiskTolerance;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TargetMarkets
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class TargetMarkets   {
  @JsonProperty("abilityToBearLosses")
  private AbilityToBearLosses abilityToBearLosses = null;

  @JsonProperty("clientObjectivesAndNeeds")
  private ClientObjectivesAndNeeds clientObjectivesAndNeeds = null;

  @JsonProperty("inverstorType")
  private InverstorType inverstorType = null;

  @JsonProperty("knowledgeAndOrExperience")
  private KnowledgeAndOrExperience knowledgeAndOrExperience = null;

  @JsonProperty("riskTolerance")
  private RiskTolerance riskTolerance = null;

  public TargetMarkets abilityToBearLosses(AbilityToBearLosses abilityToBearLosses) {
    this.abilityToBearLosses = abilityToBearLosses;
    return this;
  }

  /**
   * Get abilityToBearLosses
   * @return abilityToBearLosses
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AbilityToBearLosses getAbilityToBearLosses() {
    return abilityToBearLosses;
  }

  public void setAbilityToBearLosses(AbilityToBearLosses abilityToBearLosses) {
    this.abilityToBearLosses = abilityToBearLosses;
  }

  public TargetMarkets clientObjectivesAndNeeds(ClientObjectivesAndNeeds clientObjectivesAndNeeds) {
    this.clientObjectivesAndNeeds = clientObjectivesAndNeeds;
    return this;
  }

  /**
   * Get clientObjectivesAndNeeds
   * @return clientObjectivesAndNeeds
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ClientObjectivesAndNeeds getClientObjectivesAndNeeds() {
    return clientObjectivesAndNeeds;
  }

  public void setClientObjectivesAndNeeds(ClientObjectivesAndNeeds clientObjectivesAndNeeds) {
    this.clientObjectivesAndNeeds = clientObjectivesAndNeeds;
  }

  public TargetMarkets inverstorType(InverstorType inverstorType) {
    this.inverstorType = inverstorType;
    return this;
  }

  /**
   * Get inverstorType
   * @return inverstorType
  **/
  @ApiModelProperty(value = "")

  @Valid

  public InverstorType getInverstorType() {
    return inverstorType;
  }

  public void setInverstorType(InverstorType inverstorType) {
    this.inverstorType = inverstorType;
  }

  public TargetMarkets knowledgeAndOrExperience(KnowledgeAndOrExperience knowledgeAndOrExperience) {
    this.knowledgeAndOrExperience = knowledgeAndOrExperience;
    return this;
  }

  /**
   * Get knowledgeAndOrExperience
   * @return knowledgeAndOrExperience
  **/
  @ApiModelProperty(value = "")

  @Valid

  public KnowledgeAndOrExperience getKnowledgeAndOrExperience() {
    return knowledgeAndOrExperience;
  }

  public void setKnowledgeAndOrExperience(KnowledgeAndOrExperience knowledgeAndOrExperience) {
    this.knowledgeAndOrExperience = knowledgeAndOrExperience;
  }

  public TargetMarkets riskTolerance(RiskTolerance riskTolerance) {
    this.riskTolerance = riskTolerance;
    return this;
  }

  /**
   * Get riskTolerance
   * @return riskTolerance
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RiskTolerance getRiskTolerance() {
    return riskTolerance;
  }

  public void setRiskTolerance(RiskTolerance riskTolerance) {
    this.riskTolerance = riskTolerance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetMarkets targetMarkets = (TargetMarkets) o;
    return Objects.equals(this.abilityToBearLosses, targetMarkets.abilityToBearLosses) &&
        Objects.equals(this.clientObjectivesAndNeeds, targetMarkets.clientObjectivesAndNeeds) &&
        Objects.equals(this.inverstorType, targetMarkets.inverstorType) &&
        Objects.equals(this.knowledgeAndOrExperience, targetMarkets.knowledgeAndOrExperience) &&
        Objects.equals(this.riskTolerance, targetMarkets.riskTolerance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abilityToBearLosses, clientObjectivesAndNeeds, inverstorType, knowledgeAndOrExperience, riskTolerance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetMarkets {\n");
    
    sb.append("    abilityToBearLosses: ").append(toIndentedString(abilityToBearLosses)).append("\n");
    sb.append("    clientObjectivesAndNeeds: ").append(toIndentedString(clientObjectivesAndNeeds)).append("\n");
    sb.append("    inverstorType: ").append(toIndentedString(inverstorType)).append("\n");
    sb.append("    knowledgeAndOrExperience: ").append(toIndentedString(knowledgeAndOrExperience)).append("\n");
    sb.append("    riskTolerance: ").append(toIndentedString(riskTolerance)).append("\n");
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

