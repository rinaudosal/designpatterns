package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RiskAssessment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class RiskAssessment   {
  @JsonProperty("crm")
  private Long crm = null;

  /**
   * Indicator to alert if there is a credit risk
   */
  public enum ExistingCreditRiskEnum {
    Y("Y"),
    
    N("N");

    private String value;

    ExistingCreditRiskEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ExistingCreditRiskEnum fromValue(String text) {
      for (ExistingCreditRiskEnum b : ExistingCreditRiskEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("existingCreditRisk")
  private ExistingCreditRiskEnum existingCreditRisk = null;

  @JsonProperty("flexVevHistorical")
  private Double flexVevHistorical = null;

  @JsonProperty("flexVevRefAssetAllocation")
  private Double flexVevRefAssetAllocation = null;

  @JsonProperty("flexVevRiskLimit")
  private Double flexVevRiskLimit = null;

  /**
   * Indicator to alert if the portfolio is flexible. If the annex 2 section 14 of the regulation applies
   */
  public enum IsFlexibleEnum {
    Y("Y"),
    
    N("N");

    private String value;

    IsFlexibleEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static IsFlexibleEnum fromValue(String text) {
      for (IsFlexibleEnum b : IsFlexibleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("isFlexible")
  private IsFlexibleEnum isFlexible = null;

  /**
   * Indicator to alert if there is a relevant risk limit fro flexible funds
   */
  public enum IsRiskLimitRelevantEnum {
    Y("Y"),
    
    N("N");

    private String value;

    IsRiskLimitRelevantEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static IsRiskLimitRelevantEnum fromValue(String text) {
      for (IsRiskLimitRelevantEnum b : IsRiskLimitRelevantEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("isRiskLimitRelevant")
  private IsRiskLimitRelevantEnum isRiskLimitRelevant = null;

  /**
   * Risk of Liquidity at the level of the fund or the portfolio, also used for narrative M = material liquidity risk, I = illiquid, L = no liquidity issue.
   */
  public enum LiquidityRiskEnum {
    M("M"),
    
    I("I"),
    
    L("L");

    private String value;

    LiquidityRiskEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static LiquidityRiskEnum fromValue(String text) {
      for (LiquidityRiskEnum b : LiquidityRiskEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("liquidityRisk")
  private LiquidityRiskEnum liquidityRisk = null;

  @JsonProperty("maturityDate")
  private OffsetDateTime maturityDate = null;

  @JsonProperty("mrm")
  private Long mrm = null;

  @JsonProperty("portfolioVevReference")
  private Double portfolioVevReference = null;

  @JsonProperty("recommendedHoldingPeriod")
  private String recommendedHoldingPeriod = null;

  @JsonProperty("sri")
  private Long sri = null;

  @JsonProperty("valuationFrequency")
  private Long valuationFrequency = null;

  public RiskAssessment crm(Long crm) {
    this.crm = crm;
    return this;
  }

  /**
   * Credit Risk measure of the fund or the portfolio
   * @return crm
  **/
  @ApiModelProperty(value = "Credit Risk measure of the fund or the portfolio")


  public Long getCrm() {
    return crm;
  }

  public void setCrm(Long crm) {
    this.crm = crm;
  }

  public RiskAssessment existingCreditRisk(ExistingCreditRiskEnum existingCreditRisk) {
    this.existingCreditRisk = existingCreditRisk;
    return this;
  }

  /**
   * Indicator to alert if there is a credit risk
   * @return existingCreditRisk
  **/
  @ApiModelProperty(value = "Indicator to alert if there is a credit risk")


  public ExistingCreditRiskEnum getExistingCreditRisk() {
    return existingCreditRisk;
  }

  public void setExistingCreditRisk(ExistingCreditRiskEnum existingCreditRisk) {
    this.existingCreditRisk = existingCreditRisk;
  }

  public RiskAssessment flexVevHistorical(Double flexVevHistorical) {
    this.flexVevHistorical = flexVevHistorical;
    return this;
  }

  /**
   * VaR Equivalent Volatility of the portfolio
   * @return flexVevHistorical
  **/
  @ApiModelProperty(value = "VaR Equivalent Volatility of the portfolio")


  public Double getFlexVevHistorical() {
    return flexVevHistorical;
  }

  public void setFlexVevHistorical(Double flexVevHistorical) {
    this.flexVevHistorical = flexVevHistorical;
  }

  public RiskAssessment flexVevRefAssetAllocation(Double flexVevRefAssetAllocation) {
    this.flexVevRefAssetAllocation = flexVevRefAssetAllocation;
    return this;
  }

  /**
   * VaR Equivalent volatility of the reference asset allocation of the portfolio
   * @return flexVevRefAssetAllocation
  **/
  @ApiModelProperty(value = "VaR Equivalent volatility of the reference asset allocation of the portfolio")


  public Double getFlexVevRefAssetAllocation() {
    return flexVevRefAssetAllocation;
  }

  public void setFlexVevRefAssetAllocation(Double flexVevRefAssetAllocation) {
    this.flexVevRefAssetAllocation = flexVevRefAssetAllocation;
  }

  public RiskAssessment flexVevRiskLimit(Double flexVevRiskLimit) {
    this.flexVevRiskLimit = flexVevRiskLimit;
    return this;
  }

  /**
   * VaR Equivalent volatility of the risk limit of the portfolio
   * @return flexVevRiskLimit
  **/
  @ApiModelProperty(value = "VaR Equivalent volatility of the risk limit of the portfolio")


  public Double getFlexVevRiskLimit() {
    return flexVevRiskLimit;
  }

  public void setFlexVevRiskLimit(Double flexVevRiskLimit) {
    this.flexVevRiskLimit = flexVevRiskLimit;
  }

  public RiskAssessment isFlexible(IsFlexibleEnum isFlexible) {
    this.isFlexible = isFlexible;
    return this;
  }

  /**
   * Indicator to alert if the portfolio is flexible. If the annex 2 section 14 of the regulation applies
   * @return isFlexible
  **/
  @ApiModelProperty(value = "Indicator to alert if the portfolio is flexible. If the annex 2 section 14 of the regulation applies")


  public IsFlexibleEnum getIsFlexible() {
    return isFlexible;
  }

  public void setIsFlexible(IsFlexibleEnum isFlexible) {
    this.isFlexible = isFlexible;
  }

  public RiskAssessment isRiskLimitRelevant(IsRiskLimitRelevantEnum isRiskLimitRelevant) {
    this.isRiskLimitRelevant = isRiskLimitRelevant;
    return this;
  }

  /**
   * Indicator to alert if there is a relevant risk limit fro flexible funds
   * @return isRiskLimitRelevant
  **/
  @ApiModelProperty(value = "Indicator to alert if there is a relevant risk limit fro flexible funds")


  public IsRiskLimitRelevantEnum getIsRiskLimitRelevant() {
    return isRiskLimitRelevant;
  }

  public void setIsRiskLimitRelevant(IsRiskLimitRelevantEnum isRiskLimitRelevant) {
    this.isRiskLimitRelevant = isRiskLimitRelevant;
  }

  public RiskAssessment liquidityRisk(LiquidityRiskEnum liquidityRisk) {
    this.liquidityRisk = liquidityRisk;
    return this;
  }

  /**
   * Risk of Liquidity at the level of the fund or the portfolio, also used for narrative M = material liquidity risk, I = illiquid, L = no liquidity issue.
   * @return liquidityRisk
  **/
  @ApiModelProperty(value = "Risk of Liquidity at the level of the fund or the portfolio, also used for narrative M = material liquidity risk, I = illiquid, L = no liquidity issue.")


  public LiquidityRiskEnum getLiquidityRisk() {
    return liquidityRisk;
  }

  public void setLiquidityRisk(LiquidityRiskEnum liquidityRisk) {
    this.liquidityRisk = liquidityRisk;
  }

  public RiskAssessment maturityDate(OffsetDateTime maturityDate) {
    this.maturityDate = maturityDate;
    return this;
  }

  /**
   * Date of Maturity
   * @return maturityDate
  **/
  @ApiModelProperty(value = "Date of Maturity")

  @Valid

  public OffsetDateTime getMaturityDate() {
    return maturityDate;
  }

  public void setMaturityDate(OffsetDateTime maturityDate) {
    this.maturityDate = maturityDate;
  }

  public RiskAssessment mrm(Long mrm) {
    this.mrm = mrm;
    return this;
  }

  /**
   * Market Risk Measure of the fund or portfolio
   * @return mrm
  **/
  @ApiModelProperty(value = "Market Risk Measure of the fund or portfolio")


  public Long getMrm() {
    return mrm;
  }

  public void setMrm(Long mrm) {
    this.mrm = mrm;
  }

  public RiskAssessment portfolioVevReference(Double portfolioVevReference) {
    this.portfolioVevReference = portfolioVevReference;
    return this;
  }

  /**
   * VEV of the Portfolio/Share Class
   * @return portfolioVevReference
  **/
  @ApiModelProperty(value = "VEV of the Portfolio/Share Class")


  public Double getPortfolioVevReference() {
    return portfolioVevReference;
  }

  public void setPortfolioVevReference(Double portfolioVevReference) {
    this.portfolioVevReference = portfolioVevReference;
  }

  public RiskAssessment recommendedHoldingPeriod(String recommendedHoldingPeriod) {
    this.recommendedHoldingPeriod = recommendedHoldingPeriod;
    return this;
  }

  /**
   * Recommended holding period of the fund
   * @return recommendedHoldingPeriod
  **/
  @ApiModelProperty(value = "Recommended holding period of the fund")


  public String getRecommendedHoldingPeriod() {
    return recommendedHoldingPeriod;
  }

  public void setRecommendedHoldingPeriod(String recommendedHoldingPeriod) {
    this.recommendedHoldingPeriod = recommendedHoldingPeriod;
  }

  public RiskAssessment sri(Long sri) {
    this.sri = sri;
    return this;
  }

  /**
   * Summary Indicator Risk of the fund or the portfolio
   * @return sri
  **/
  @ApiModelProperty(value = "Summary Indicator Risk of the fund or the portfolio")


  public Long getSri() {
    return sri;
  }

  public void setSri(Long sri) {
    this.sri = sri;
  }

  public RiskAssessment valuationFrequency(Long valuationFrequency) {
    this.valuationFrequency = valuationFrequency;
    return this;
  }

  /**
   * Number of valuation days per year for the portfolio or fund or share class.
   * @return valuationFrequency
  **/
  @ApiModelProperty(value = "Number of valuation days per year for the portfolio or fund or share class.")


  public Long getValuationFrequency() {
    return valuationFrequency;
  }

  public void setValuationFrequency(Long valuationFrequency) {
    this.valuationFrequency = valuationFrequency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskAssessment riskAssessment = (RiskAssessment) o;
    return Objects.equals(this.crm, riskAssessment.crm) &&
        Objects.equals(this.existingCreditRisk, riskAssessment.existingCreditRisk) &&
        Objects.equals(this.flexVevHistorical, riskAssessment.flexVevHistorical) &&
        Objects.equals(this.flexVevRefAssetAllocation, riskAssessment.flexVevRefAssetAllocation) &&
        Objects.equals(this.flexVevRiskLimit, riskAssessment.flexVevRiskLimit) &&
        Objects.equals(this.isFlexible, riskAssessment.isFlexible) &&
        Objects.equals(this.isRiskLimitRelevant, riskAssessment.isRiskLimitRelevant) &&
        Objects.equals(this.liquidityRisk, riskAssessment.liquidityRisk) &&
        Objects.equals(this.maturityDate, riskAssessment.maturityDate) &&
        Objects.equals(this.mrm, riskAssessment.mrm) &&
        Objects.equals(this.portfolioVevReference, riskAssessment.portfolioVevReference) &&
        Objects.equals(this.recommendedHoldingPeriod, riskAssessment.recommendedHoldingPeriod) &&
        Objects.equals(this.sri, riskAssessment.sri) &&
        Objects.equals(this.valuationFrequency, riskAssessment.valuationFrequency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(crm, existingCreditRisk, flexVevHistorical, flexVevRefAssetAllocation, flexVevRiskLimit, isFlexible, isRiskLimitRelevant, liquidityRisk, maturityDate, mrm, portfolioVevReference, recommendedHoldingPeriod, sri, valuationFrequency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskAssessment {\n");
    
    sb.append("    crm: ").append(toIndentedString(crm)).append("\n");
    sb.append("    existingCreditRisk: ").append(toIndentedString(existingCreditRisk)).append("\n");
    sb.append("    flexVevHistorical: ").append(toIndentedString(flexVevHistorical)).append("\n");
    sb.append("    flexVevRefAssetAllocation: ").append(toIndentedString(flexVevRefAssetAllocation)).append("\n");
    sb.append("    flexVevRiskLimit: ").append(toIndentedString(flexVevRiskLimit)).append("\n");
    sb.append("    isFlexible: ").append(toIndentedString(isFlexible)).append("\n");
    sb.append("    isRiskLimitRelevant: ").append(toIndentedString(isRiskLimitRelevant)).append("\n");
    sb.append("    liquidityRisk: ").append(toIndentedString(liquidityRisk)).append("\n");
    sb.append("    maturityDate: ").append(toIndentedString(maturityDate)).append("\n");
    sb.append("    mrm: ").append(toIndentedString(mrm)).append("\n");
    sb.append("    portfolioVevReference: ").append(toIndentedString(portfolioVevReference)).append("\n");
    sb.append("    recommendedHoldingPeriod: ").append(toIndentedString(recommendedHoldingPeriod)).append("\n");
    sb.append("    sri: ").append(toIndentedString(sri)).append("\n");
    sb.append("    valuationFrequency: ").append(toIndentedString(valuationFrequency)).append("\n");
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

