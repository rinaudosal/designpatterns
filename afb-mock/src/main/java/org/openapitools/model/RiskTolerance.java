package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RiskTolerance
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class RiskTolerance   {
  /**
   * Yes or Neutral
   */
  public enum NotForInvestorsWithTheLowestRiskToleranceGermanyEnum {
    Y("Y"),
    
    NEUTRAL("NEUTRAL");

    private String value;

    NotForInvestorsWithTheLowestRiskToleranceGermanyEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static NotForInvestorsWithTheLowestRiskToleranceGermanyEnum fromValue(String text) {
      for (NotForInvestorsWithTheLowestRiskToleranceGermanyEnum b : NotForInvestorsWithTheLowestRiskToleranceGermanyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("notForInvestorsWithTheLowestRiskToleranceGermany")
  private NotForInvestorsWithTheLowestRiskToleranceGermanyEnum notForInvestorsWithTheLowestRiskToleranceGermany = null;

  @JsonProperty("riskToleranceForNonPriipsAndNonUcitsSpain")
  private Long riskToleranceForNonPriipsAndNonUcitsSpain = null;

  /**
   * Low/medium/high
   */
  public enum RiskToleranceInternalMethodologyForNonPriipsAndNonUcitsEnum {
    L("L"),
    
    M("M"),
    
    H("H");

    private String value;

    RiskToleranceInternalMethodologyForNonPriipsAndNonUcitsEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RiskToleranceInternalMethodologyForNonPriipsAndNonUcitsEnum fromValue(String text) {
      for (RiskToleranceInternalMethodologyForNonPriipsAndNonUcitsEnum b : RiskToleranceInternalMethodologyForNonPriipsAndNonUcitsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("riskToleranceInternalMethodologyForNonPriipsAndNonUcits")
  private RiskToleranceInternalMethodologyForNonPriipsAndNonUcitsEnum riskToleranceInternalMethodologyForNonPriipsAndNonUcits = null;

  @JsonProperty("riskTolerancePriipsMethodology")
  private Long riskTolerancePriipsMethodology = null;

  @JsonProperty("riskToleranceUcitsMetholodology")
  private Long riskToleranceUcitsMetholodology = null;

  public RiskTolerance notForInvestorsWithTheLowestRiskToleranceGermany(NotForInvestorsWithTheLowestRiskToleranceGermanyEnum notForInvestorsWithTheLowestRiskToleranceGermany) {
    this.notForInvestorsWithTheLowestRiskToleranceGermany = notForInvestorsWithTheLowestRiskToleranceGermany;
    return this;
  }

  /**
   * Yes or Neutral
   * @return notForInvestorsWithTheLowestRiskToleranceGermany
  **/
  @ApiModelProperty(value = "Yes or Neutral")


  public NotForInvestorsWithTheLowestRiskToleranceGermanyEnum getNotForInvestorsWithTheLowestRiskToleranceGermany() {
    return notForInvestorsWithTheLowestRiskToleranceGermany;
  }

  public void setNotForInvestorsWithTheLowestRiskToleranceGermany(NotForInvestorsWithTheLowestRiskToleranceGermanyEnum notForInvestorsWithTheLowestRiskToleranceGermany) {
    this.notForInvestorsWithTheLowestRiskToleranceGermany = notForInvestorsWithTheLowestRiskToleranceGermany;
  }

  public RiskTolerance riskToleranceForNonPriipsAndNonUcitsSpain(Long riskToleranceForNonPriipsAndNonUcitsSpain) {
    this.riskToleranceForNonPriipsAndNonUcitsSpain = riskToleranceForNonPriipsAndNonUcitsSpain;
    return this;
  }

  /**
   * Spanish SRI
   * @return riskToleranceForNonPriipsAndNonUcitsSpain
  **/
  @ApiModelProperty(value = "Spanish SRI")


  public Long getRiskToleranceForNonPriipsAndNonUcitsSpain() {
    return riskToleranceForNonPriipsAndNonUcitsSpain;
  }

  public void setRiskToleranceForNonPriipsAndNonUcitsSpain(Long riskToleranceForNonPriipsAndNonUcitsSpain) {
    this.riskToleranceForNonPriipsAndNonUcitsSpain = riskToleranceForNonPriipsAndNonUcitsSpain;
  }

  public RiskTolerance riskToleranceInternalMethodologyForNonPriipsAndNonUcits(RiskToleranceInternalMethodologyForNonPriipsAndNonUcitsEnum riskToleranceInternalMethodologyForNonPriipsAndNonUcits) {
    this.riskToleranceInternalMethodologyForNonPriipsAndNonUcits = riskToleranceInternalMethodologyForNonPriipsAndNonUcits;
    return this;
  }

  /**
   * Low/medium/high
   * @return riskToleranceInternalMethodologyForNonPriipsAndNonUcits
  **/
  @ApiModelProperty(value = "Low/medium/high")


  public RiskToleranceInternalMethodologyForNonPriipsAndNonUcitsEnum getRiskToleranceInternalMethodologyForNonPriipsAndNonUcits() {
    return riskToleranceInternalMethodologyForNonPriipsAndNonUcits;
  }

  public void setRiskToleranceInternalMethodologyForNonPriipsAndNonUcits(RiskToleranceInternalMethodologyForNonPriipsAndNonUcitsEnum riskToleranceInternalMethodologyForNonPriipsAndNonUcits) {
    this.riskToleranceInternalMethodologyForNonPriipsAndNonUcits = riskToleranceInternalMethodologyForNonPriipsAndNonUcits;
  }

  public RiskTolerance riskTolerancePriipsMethodology(Long riskTolerancePriipsMethodology) {
    this.riskTolerancePriipsMethodology = riskTolerancePriipsMethodology;
    return this;
  }

  /**
   * SRI
   * @return riskTolerancePriipsMethodology
  **/
  @ApiModelProperty(value = "SRI")


  public Long getRiskTolerancePriipsMethodology() {
    return riskTolerancePriipsMethodology;
  }

  public void setRiskTolerancePriipsMethodology(Long riskTolerancePriipsMethodology) {
    this.riskTolerancePriipsMethodology = riskTolerancePriipsMethodology;
  }

  public RiskTolerance riskToleranceUcitsMetholodology(Long riskToleranceUcitsMetholodology) {
    this.riskToleranceUcitsMetholodology = riskToleranceUcitsMetholodology;
    return this;
  }

  /**
   * SRRI
   * @return riskToleranceUcitsMetholodology
  **/
  @ApiModelProperty(value = "SRRI")


  public Long getRiskToleranceUcitsMetholodology() {
    return riskToleranceUcitsMetholodology;
  }

  public void setRiskToleranceUcitsMetholodology(Long riskToleranceUcitsMetholodology) {
    this.riskToleranceUcitsMetholodology = riskToleranceUcitsMetholodology;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskTolerance riskTolerance = (RiskTolerance) o;
    return Objects.equals(this.notForInvestorsWithTheLowestRiskToleranceGermany, riskTolerance.notForInvestorsWithTheLowestRiskToleranceGermany) &&
        Objects.equals(this.riskToleranceForNonPriipsAndNonUcitsSpain, riskTolerance.riskToleranceForNonPriipsAndNonUcitsSpain) &&
        Objects.equals(this.riskToleranceInternalMethodologyForNonPriipsAndNonUcits, riskTolerance.riskToleranceInternalMethodologyForNonPriipsAndNonUcits) &&
        Objects.equals(this.riskTolerancePriipsMethodology, riskTolerance.riskTolerancePriipsMethodology) &&
        Objects.equals(this.riskToleranceUcitsMetholodology, riskTolerance.riskToleranceUcitsMetholodology);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notForInvestorsWithTheLowestRiskToleranceGermany, riskToleranceForNonPriipsAndNonUcitsSpain, riskToleranceInternalMethodologyForNonPriipsAndNonUcits, riskTolerancePriipsMethodology, riskToleranceUcitsMetholodology);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskTolerance {\n");
    
    sb.append("    notForInvestorsWithTheLowestRiskToleranceGermany: ").append(toIndentedString(notForInvestorsWithTheLowestRiskToleranceGermany)).append("\n");
    sb.append("    riskToleranceForNonPriipsAndNonUcitsSpain: ").append(toIndentedString(riskToleranceForNonPriipsAndNonUcitsSpain)).append("\n");
    sb.append("    riskToleranceInternalMethodologyForNonPriipsAndNonUcits: ").append(toIndentedString(riskToleranceInternalMethodologyForNonPriipsAndNonUcits)).append("\n");
    sb.append("    riskTolerancePriipsMethodology: ").append(toIndentedString(riskTolerancePriipsMethodology)).append("\n");
    sb.append("    riskToleranceUcitsMetholodology: ").append(toIndentedString(riskToleranceUcitsMetholodology)).append("\n");
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

