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
 * Narratives
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class Narratives   {
  @JsonProperty("capitalGuarantee")
  private String capitalGuarantee = null;

  @JsonProperty("capitalGuaranteeEarlyExitConditions")
  private OffsetDateTime capitalGuaranteeEarlyExitConditions = null;

  @JsonProperty("capitalGuaranteeLevel")
  private Double capitalGuaranteeLevel = null;

  @JsonProperty("capitalGuaranteeLimitations")
  private String capitalGuaranteeLimitations = null;

  @JsonProperty("capitalGuaranteePortfolio")
  private String capitalGuaranteePortfolio = null;

  /**
   * Cf Art.14a + annex 1
   */
  public enum ComprehensionAlertPortfolioEnum {
    Y("Y"),
    
    N("N");

    private String value;

    ComprehensionAlertPortfolioEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ComprehensionAlertPortfolioEnum fromValue(String text) {
      for (ComprehensionAlertPortfolioEnum b : ComprehensionAlertPortfolioEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("comprehensionAlertPortfolio")
  private ComprehensionAlertPortfolioEnum comprehensionAlertPortfolio = null;

  @JsonProperty("intendedTargetMarketRetailInvestorPortfolio")
  private String intendedTargetMarketRetailInvestorPortfolio = null;

  @JsonProperty("investmentObjectivePortfolio")
  private String investmentObjectivePortfolio = null;

  @JsonProperty("otherComment")
  private String otherComment = null;

  @JsonProperty("otherMateriallyRelevantRiskNarrativePortfolio")
  private String otherMateriallyRelevantRiskNarrativePortfolio = null;

  @JsonProperty("portfolioPerformanceFeesNarrative")
  private String portfolioPerformanceFeesNarrative = null;

  @JsonProperty("portolioCarriedInterestNarrative")
  private String portolioCarriedInterestNarrative = null;

  @JsonProperty("possibleMaximumLossPortfolio")
  private Double possibleMaximumLossPortfolio = null;

  @JsonProperty("referenceLanguage")
  private String referenceLanguage = null;

  @JsonProperty("riskNarrativePortfolio")
  private String riskNarrativePortfolio = null;

  @JsonProperty("typeOfUnderlyingInvestmentOption")
  private String typeOfUnderlyingInvestmentOption = null;

  public Narratives capitalGuarantee(String capitalGuarantee) {
    this.capitalGuarantee = capitalGuarantee;
    return this;
  }

  /**
   * Boolean to identify whether the portfolio has a general capital guarantee or not.
   * @return capitalGuarantee
  **/
  @ApiModelProperty(value = "Boolean to identify whether the portfolio has a general capital guarantee or not.")


  public String getCapitalGuarantee() {
    return capitalGuarantee;
  }

  public void setCapitalGuarantee(String capitalGuarantee) {
    this.capitalGuarantee = capitalGuarantee;
  }

  public Narratives capitalGuaranteeEarlyExitConditions(OffsetDateTime capitalGuaranteeEarlyExitConditions) {
    this.capitalGuaranteeEarlyExitConditions = capitalGuaranteeEarlyExitConditions;
    return this;
  }

  /**
   * Date before which the early exit conditions apply.
   * @return capitalGuaranteeEarlyExitConditions
  **/
  @ApiModelProperty(value = "Date before which the early exit conditions apply.")

  @Valid

  public OffsetDateTime getCapitalGuaranteeEarlyExitConditions() {
    return capitalGuaranteeEarlyExitConditions;
  }

  public void setCapitalGuaranteeEarlyExitConditions(OffsetDateTime capitalGuaranteeEarlyExitConditions) {
    this.capitalGuaranteeEarlyExitConditions = capitalGuaranteeEarlyExitConditions;
  }

  public Narratives capitalGuaranteeLevel(Double capitalGuaranteeLevel) {
    this.capitalGuaranteeLevel = capitalGuaranteeLevel;
    return this;
  }

  /**
   * Capital Guarantee level. Minimum amount will be paid at redemption in%. Cf annex 3, point 7, Element F
   * @return capitalGuaranteeLevel
  **/
  @ApiModelProperty(value = "Capital Guarantee level. Minimum amount will be paid at redemption in%. Cf annex 3, point 7, Element F")


  public Double getCapitalGuaranteeLevel() {
    return capitalGuaranteeLevel;
  }

  public void setCapitalGuaranteeLevel(Double capitalGuaranteeLevel) {
    this.capitalGuaranteeLevel = capitalGuaranteeLevel;
  }

  public Narratives capitalGuaranteeLimitations(String capitalGuaranteeLimitations) {
    this.capitalGuaranteeLimitations = capitalGuaranteeLimitations;
    return this;
  }

  /**
   * Insert a brief explanation of the guarantee limits of the product with a maximum of 300 characters in plain language. The field shall contain well-formulated text which can be used directly by the insurer in the KID according to article 14 of the regulation.
   * @return capitalGuaranteeLimitations
  **/
  @ApiModelProperty(value = "Insert a brief explanation of the guarantee limits of the product with a maximum of 300 characters in plain language. The field shall contain well-formulated text which can be used directly by the insurer in the KID according to article 14 of the regulation.")


  public String getCapitalGuaranteeLimitations() {
    return capitalGuaranteeLimitations;
  }

  public void setCapitalGuaranteeLimitations(String capitalGuaranteeLimitations) {
    this.capitalGuaranteeLimitations = capitalGuaranteeLimitations;
  }

  public Narratives capitalGuaranteePortfolio(String capitalGuaranteePortfolio) {
    this.capitalGuaranteePortfolio = capitalGuaranteePortfolio;
    return this;
  }

  /**
   * Characteristics of the guarantee, open ended or fixed maturity, daily or monthly lockin, monthly reset, constant guarantee, reference value (highest NAV, NAV of start period,�), other particularities, name of the guarantor
   * @return capitalGuaranteePortfolio
  **/
  @ApiModelProperty(value = "Characteristics of the guarantee, open ended or fixed maturity, daily or monthly lockin, monthly reset, constant guarantee, reference value (highest NAV, NAV of start period,�), other particularities, name of the guarantor")


  public String getCapitalGuaranteePortfolio() {
    return capitalGuaranteePortfolio;
  }

  public void setCapitalGuaranteePortfolio(String capitalGuaranteePortfolio) {
    this.capitalGuaranteePortfolio = capitalGuaranteePortfolio;
  }

  public Narratives comprehensionAlertPortfolio(ComprehensionAlertPortfolioEnum comprehensionAlertPortfolio) {
    this.comprehensionAlertPortfolio = comprehensionAlertPortfolio;
    return this;
  }

  /**
   * Cf Art.14a + annex 1
   * @return comprehensionAlertPortfolio
  **/
  @ApiModelProperty(value = "Cf Art.14a + annex 1")


  public ComprehensionAlertPortfolioEnum getComprehensionAlertPortfolio() {
    return comprehensionAlertPortfolio;
  }

  public void setComprehensionAlertPortfolio(ComprehensionAlertPortfolioEnum comprehensionAlertPortfolio) {
    this.comprehensionAlertPortfolio = comprehensionAlertPortfolio;
  }

  public Narratives intendedTargetMarketRetailInvestorPortfolio(String intendedTargetMarketRetailInvestorPortfolio) {
    this.intendedTargetMarketRetailInvestorPortfolio = intendedTargetMarketRetailInvestorPortfolio;
    return this;
  }

  /**
   * Text in reference language, as proposed by the asset manager. The description of the type of retail investor to whom the PRIIP is intended to be marketed in the section entitled �What is this product?� of the key information document shall include information on the target retail investors identified by the PRIIP manufacturer, in particular depending on the needs, characteristics and objectives of the type of client for whom the PRIIPs is compatible. This determination shall be based upon the ability of retail investors to bear investment loss and their investment horizon preferences, their theoretical knowledge of, and past experience with PRIIPs, the financial markets as well as the needs, characteristics and objectives of potential end clients.
   * @return intendedTargetMarketRetailInvestorPortfolio
  **/
  @ApiModelProperty(value = "Text in reference language, as proposed by the asset manager. The description of the type of retail investor to whom the PRIIP is intended to be marketed in the section entitled �What is this product?� of the key information document shall include information on the target retail investors identified by the PRIIP manufacturer, in particular depending on the needs, characteristics and objectives of the type of client for whom the PRIIPs is compatible. This determination shall be based upon the ability of retail investors to bear investment loss and their investment horizon preferences, their theoretical knowledge of, and past experience with PRIIPs, the financial markets as well as the needs, characteristics and objectives of potential end clients.")


  public String getIntendedTargetMarketRetailInvestorPortfolio() {
    return intendedTargetMarketRetailInvestorPortfolio;
  }

  public void setIntendedTargetMarketRetailInvestorPortfolio(String intendedTargetMarketRetailInvestorPortfolio) {
    this.intendedTargetMarketRetailInvestorPortfolio = intendedTargetMarketRetailInvestorPortfolio;
  }

  public Narratives investmentObjectivePortfolio(String investmentObjectivePortfolio) {
    this.investmentObjectivePortfolio = investmentObjectivePortfolio;
    return this;
  }

  /**
   * Text in reference language, as proposed by the asset manager. Information stating the objectives of the PRIIP and the means for achieving those objectives in the section entitled �What is this product?� of the key information document shall be summarised in a brief, clear and easily understandable manner. That information shall identify the main factors upon which return depends, the underlying investment assets or reference values, and how the return is determined, as well as the relationship between the PRIIP�s return and that of the underlying investment assets or reference values.
   * @return investmentObjectivePortfolio
  **/
  @ApiModelProperty(value = "Text in reference language, as proposed by the asset manager. Information stating the objectives of the PRIIP and the means for achieving those objectives in the section entitled �What is this product?� of the key information document shall be summarised in a brief, clear and easily understandable manner. That information shall identify the main factors upon which return depends, the underlying investment assets or reference values, and how the return is determined, as well as the relationship between the PRIIP�s return and that of the underlying investment assets or reference values.")


  public String getInvestmentObjectivePortfolio() {
    return investmentObjectivePortfolio;
  }

  public void setInvestmentObjectivePortfolio(String investmentObjectivePortfolio) {
    this.investmentObjectivePortfolio = investmentObjectivePortfolio;
  }

  public Narratives otherComment(String otherComment) {
    this.otherComment = otherComment;
    return this;
  }

  /**
   * This field shall be used only under exceptional circumstances and requires a manual review and might block automatic processing. This field is usually empty.
   * @return otherComment
  **/
  @ApiModelProperty(value = "This field shall be used only under exceptional circumstances and requires a manual review and might block automatic processing. This field is usually empty.")


  public String getOtherComment() {
    return otherComment;
  }

  public void setOtherComment(String otherComment) {
    this.otherComment = otherComment;
  }

  public Narratives otherMateriallyRelevantRiskNarrativePortfolio(String otherMateriallyRelevantRiskNarrativePortfolio) {
    this.otherMateriallyRelevantRiskNarrativePortfolio = otherMateriallyRelevantRiskNarrativePortfolio;
    return this;
  }

  /**
   * Text in reference language, as proposed by the asset managers.  (Element E) [Where applicable, element h] [Other risks materially relevant to the PRIIP not included in the summary risk indicator to be explained with a maximum of 200 characters]. The field shall contain well-formulated text which can be used directly by the insurer in the KID according to article 14 of the regulation.
   * @return otherMateriallyRelevantRiskNarrativePortfolio
  **/
  @ApiModelProperty(value = "Text in reference language, as proposed by the asset managers.  (Element E) [Where applicable, element h] [Other risks materially relevant to the PRIIP not included in the summary risk indicator to be explained with a maximum of 200 characters]. The field shall contain well-formulated text which can be used directly by the insurer in the KID according to article 14 of the regulation.")


  public String getOtherMateriallyRelevantRiskNarrativePortfolio() {
    return otherMateriallyRelevantRiskNarrativePortfolio;
  }

  public void setOtherMateriallyRelevantRiskNarrativePortfolio(String otherMateriallyRelevantRiskNarrativePortfolio) {
    this.otherMateriallyRelevantRiskNarrativePortfolio = otherMateriallyRelevantRiskNarrativePortfolio;
  }

  public Narratives portfolioPerformanceFeesNarrative(String portfolioPerformanceFeesNarrative) {
    this.portfolioPerformanceFeesNarrative = portfolioPerformanceFeesNarrative;
    return this;
  }

  /**
   * Describes the outperformance of your product and shall be a well-formulated text. It shall be possible to enter the field into the sentence below. (annex VII  Table 2 ) \"The impact of the performance fee. We take these from your investment if the product outperforms its benchmark [y by x%].\"
   * @return portfolioPerformanceFeesNarrative
  **/
  @ApiModelProperty(value = "Describes the outperformance of your product and shall be a well-formulated text. It shall be possible to enter the field into the sentence below. (annex VII  Table 2 ) \"The impact of the performance fee. We take these from your investment if the product outperforms its benchmark [y by x%].\"")


  public String getPortfolioPerformanceFeesNarrative() {
    return portfolioPerformanceFeesNarrative;
  }

  public void setPortfolioPerformanceFeesNarrative(String portfolioPerformanceFeesNarrative) {
    this.portfolioPerformanceFeesNarrative = portfolioPerformanceFeesNarrative;
  }

  public Narratives portolioCarriedInterestNarrative(String portolioCarriedInterestNarrative) {
    this.portolioCarriedInterestNarrative = portolioCarriedInterestNarrative;
    return this;
  }

  /**
   * Describes the outperformance of your product and shall be a well-formulated text. It shall be possible to enter the field into the sentence below. (annex VII  Table 2 ) \"The impact of the carried interest We take these from your investment if the product outperforms its benchmark [y by x%].\"
   * @return portolioCarriedInterestNarrative
  **/
  @ApiModelProperty(value = "Describes the outperformance of your product and shall be a well-formulated text. It shall be possible to enter the field into the sentence below. (annex VII  Table 2 ) \"The impact of the carried interest We take these from your investment if the product outperforms its benchmark [y by x%].\"")


  public String getPortolioCarriedInterestNarrative() {
    return portolioCarriedInterestNarrative;
  }

  public void setPortolioCarriedInterestNarrative(String portolioCarriedInterestNarrative) {
    this.portolioCarriedInterestNarrative = portolioCarriedInterestNarrative;
  }

  public Narratives possibleMaximumLossPortfolio(Double possibleMaximumLossPortfolio) {
    this.possibleMaximumLossPortfolio = possibleMaximumLossPortfolio;
    return this;
  }

  /**
   * No description
   * @return possibleMaximumLossPortfolio
  **/
  @ApiModelProperty(value = "No description")


  public Double getPossibleMaximumLossPortfolio() {
    return possibleMaximumLossPortfolio;
  }

  public void setPossibleMaximumLossPortfolio(Double possibleMaximumLossPortfolio) {
    this.possibleMaximumLossPortfolio = possibleMaximumLossPortfolio;
  }

  public Narratives referenceLanguage(String referenceLanguage) {
    this.referenceLanguage = referenceLanguage;
    return this;
  }

  /**
   * Language in which all narratives/texts of this set of data are written
   * @return referenceLanguage
  **/
  @ApiModelProperty(value = "Language in which all narratives/texts of this set of data are written")


  public String getReferenceLanguage() {
    return referenceLanguage;
  }

  public void setReferenceLanguage(String referenceLanguage) {
    this.referenceLanguage = referenceLanguage;
  }

  public Narratives riskNarrativePortfolio(String riskNarrativePortfolio) {
    this.riskNarrativePortfolio = riskNarrativePortfolio;
    return this;
  }

  /**
   * Text in reference language, as proposed by the asset manager [insert a brief explanation of the classification of the product with a maximum of 300 characters in plain language]. The field shall contain well-formulated text which can be used directly by the insurer in the KID according to article 14 of the regulation
   * @return riskNarrativePortfolio
  **/
  @ApiModelProperty(value = "Text in reference language, as proposed by the asset manager [insert a brief explanation of the classification of the product with a maximum of 300 characters in plain language]. The field shall contain well-formulated text which can be used directly by the insurer in the KID according to article 14 of the regulation")


  public String getRiskNarrativePortfolio() {
    return riskNarrativePortfolio;
  }

  public void setRiskNarrativePortfolio(String riskNarrativePortfolio) {
    this.riskNarrativePortfolio = riskNarrativePortfolio;
  }

  public Narratives typeOfUnderlyingInvestmentOption(String typeOfUnderlyingInvestmentOption) {
    this.typeOfUnderlyingInvestmentOption = typeOfUnderlyingInvestmentOption;
    return this;
  }

  /**
   * Understandable to the customer
   * @return typeOfUnderlyingInvestmentOption
  **/
  @ApiModelProperty(value = "Understandable to the customer")


  public String getTypeOfUnderlyingInvestmentOption() {
    return typeOfUnderlyingInvestmentOption;
  }

  public void setTypeOfUnderlyingInvestmentOption(String typeOfUnderlyingInvestmentOption) {
    this.typeOfUnderlyingInvestmentOption = typeOfUnderlyingInvestmentOption;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Narratives narratives = (Narratives) o;
    return Objects.equals(this.capitalGuarantee, narratives.capitalGuarantee) &&
        Objects.equals(this.capitalGuaranteeEarlyExitConditions, narratives.capitalGuaranteeEarlyExitConditions) &&
        Objects.equals(this.capitalGuaranteeLevel, narratives.capitalGuaranteeLevel) &&
        Objects.equals(this.capitalGuaranteeLimitations, narratives.capitalGuaranteeLimitations) &&
        Objects.equals(this.capitalGuaranteePortfolio, narratives.capitalGuaranteePortfolio) &&
        Objects.equals(this.comprehensionAlertPortfolio, narratives.comprehensionAlertPortfolio) &&
        Objects.equals(this.intendedTargetMarketRetailInvestorPortfolio, narratives.intendedTargetMarketRetailInvestorPortfolio) &&
        Objects.equals(this.investmentObjectivePortfolio, narratives.investmentObjectivePortfolio) &&
        Objects.equals(this.otherComment, narratives.otherComment) &&
        Objects.equals(this.otherMateriallyRelevantRiskNarrativePortfolio, narratives.otherMateriallyRelevantRiskNarrativePortfolio) &&
        Objects.equals(this.portfolioPerformanceFeesNarrative, narratives.portfolioPerformanceFeesNarrative) &&
        Objects.equals(this.portolioCarriedInterestNarrative, narratives.portolioCarriedInterestNarrative) &&
        Objects.equals(this.possibleMaximumLossPortfolio, narratives.possibleMaximumLossPortfolio) &&
        Objects.equals(this.referenceLanguage, narratives.referenceLanguage) &&
        Objects.equals(this.riskNarrativePortfolio, narratives.riskNarrativePortfolio) &&
        Objects.equals(this.typeOfUnderlyingInvestmentOption, narratives.typeOfUnderlyingInvestmentOption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capitalGuarantee, capitalGuaranteeEarlyExitConditions, capitalGuaranteeLevel, capitalGuaranteeLimitations, capitalGuaranteePortfolio, comprehensionAlertPortfolio, intendedTargetMarketRetailInvestorPortfolio, investmentObjectivePortfolio, otherComment, otherMateriallyRelevantRiskNarrativePortfolio, portfolioPerformanceFeesNarrative, portolioCarriedInterestNarrative, possibleMaximumLossPortfolio, referenceLanguage, riskNarrativePortfolio, typeOfUnderlyingInvestmentOption);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Narratives {\n");
    
    sb.append("    capitalGuarantee: ").append(toIndentedString(capitalGuarantee)).append("\n");
    sb.append("    capitalGuaranteeEarlyExitConditions: ").append(toIndentedString(capitalGuaranteeEarlyExitConditions)).append("\n");
    sb.append("    capitalGuaranteeLevel: ").append(toIndentedString(capitalGuaranteeLevel)).append("\n");
    sb.append("    capitalGuaranteeLimitations: ").append(toIndentedString(capitalGuaranteeLimitations)).append("\n");
    sb.append("    capitalGuaranteePortfolio: ").append(toIndentedString(capitalGuaranteePortfolio)).append("\n");
    sb.append("    comprehensionAlertPortfolio: ").append(toIndentedString(comprehensionAlertPortfolio)).append("\n");
    sb.append("    intendedTargetMarketRetailInvestorPortfolio: ").append(toIndentedString(intendedTargetMarketRetailInvestorPortfolio)).append("\n");
    sb.append("    investmentObjectivePortfolio: ").append(toIndentedString(investmentObjectivePortfolio)).append("\n");
    sb.append("    otherComment: ").append(toIndentedString(otherComment)).append("\n");
    sb.append("    otherMateriallyRelevantRiskNarrativePortfolio: ").append(toIndentedString(otherMateriallyRelevantRiskNarrativePortfolio)).append("\n");
    sb.append("    portfolioPerformanceFeesNarrative: ").append(toIndentedString(portfolioPerformanceFeesNarrative)).append("\n");
    sb.append("    portolioCarriedInterestNarrative: ").append(toIndentedString(portolioCarriedInterestNarrative)).append("\n");
    sb.append("    possibleMaximumLossPortfolio: ").append(toIndentedString(possibleMaximumLossPortfolio)).append("\n");
    sb.append("    referenceLanguage: ").append(toIndentedString(referenceLanguage)).append("\n");
    sb.append("    riskNarrativePortfolio: ").append(toIndentedString(riskNarrativePortfolio)).append("\n");
    sb.append("    typeOfUnderlyingInvestmentOption: ").append(toIndentedString(typeOfUnderlyingInvestmentOption)).append("\n");
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

