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
 * CostsAndChargesExAnte
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class CostsAndChargesExAnte   {
  @JsonProperty("financialInstrumentDistributionFee")
  private Double financialInstrumentDistributionFee = null;

  @JsonProperty("financialInstrumentIncidentalCostsExAnte")
  private Double financialInstrumentIncidentalCostsExAnte = null;

  @JsonProperty("financialInstrumentManagementFee")
  private Double financialInstrumentManagementFee = null;

  @JsonProperty("financialInstrumentOngoingCosts")
  private Double financialInstrumentOngoingCosts = null;

  @JsonProperty("financialInstrumentTransactionCostsExAnte")
  private Double financialInstrumentTransactionCostsExAnte = null;

  @JsonProperty("oneOffCostFinancialInstrumentEntryCost")
  private Double oneOffCostFinancialInstrumentEntryCost = null;

  @JsonProperty("oneOffCostFinancialInstrumentExitCostStructuredSecuritiesPriorRhp")
  private Double oneOffCostFinancialInstrumentExitCostStructuredSecuritiesPriorRhp = null;

  @JsonProperty("oneOffCostFinancialInstrumentMaximumEntryCostAcquired")
  private Double oneOffCostFinancialInstrumentMaximumEntryCostAcquired = null;

  @JsonProperty("oneOffCostFinancialInstrumentMaximumEntryCostFixedAmountItaly")
  private Double oneOffCostFinancialInstrumentMaximumEntryCostFixedAmountItaly = null;

  @JsonProperty("oneOffCostsFinancialInstrumentMaximumExitCost")
  private Double oneOffCostsFinancialInstrumentMaximumExitCost = null;

  @JsonProperty("oneOffCostsFinancialInstrumentMaximumExitCostAcquired")
  private Double oneOffCostsFinancialInstrumentMaximumExitCostAcquired = null;

  @JsonProperty("oneOffCostsFinancialInstrumentMaximumExitCostFixedAmountItaly")
  private Double oneOffCostsFinancialInstrumentMaximumExitCostFixedAmountItaly = null;

  @JsonProperty("oneOffCostsFinancialInstrumentTypicalExitCost")
  private Double oneOffCostsFinancialInstrumentTypicalExitCost = null;

  /**
   * Unit quotation in Units figures or Percentage quotation of the amount to be invested
   */
  public enum StructuredSecuritiesQuotationEnum {
    U("U"),
    
    P("P");

    private String value;

    StructuredSecuritiesQuotationEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StructuredSecuritiesQuotationEnum fromValue(String text) {
      for (StructuredSecuritiesQuotationEnum b : StructuredSecuritiesQuotationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("structuredSecuritiesQuotation")
  private StructuredSecuritiesQuotationEnum structuredSecuritiesQuotation = null;

  public CostsAndChargesExAnte financialInstrumentDistributionFee(Double financialInstrumentDistributionFee) {
    this.financialInstrumentDistributionFee = financialInstrumentDistributionFee;
    return this;
  }

  /**
   * Expressed as a percentage of NAV / Notional of the Financial Product / per annum.
   * @return financialInstrumentDistributionFee
  **/
  @ApiModelProperty(value = "Expressed as a percentage of NAV / Notional of the Financial Product / per annum.")


  public Double getFinancialInstrumentDistributionFee() {
    return financialInstrumentDistributionFee;
  }

  public void setFinancialInstrumentDistributionFee(Double financialInstrumentDistributionFee) {
    this.financialInstrumentDistributionFee = financialInstrumentDistributionFee;
  }

  public CostsAndChargesExAnte financialInstrumentIncidentalCostsExAnte(Double financialInstrumentIncidentalCostsExAnte) {
    this.financialInstrumentIncidentalCostsExAnte = financialInstrumentIncidentalCostsExAnte;
    return this;
  }

  /**
   * Expressed as a percentage of NAV of the Financial Product. Includes performance fees and others costs Ex ante
   * @return financialInstrumentIncidentalCostsExAnte
  **/
  @ApiModelProperty(value = "Expressed as a percentage of NAV of the Financial Product. Includes performance fees and others costs Ex ante")


  public Double getFinancialInstrumentIncidentalCostsExAnte() {
    return financialInstrumentIncidentalCostsExAnte;
  }

  public void setFinancialInstrumentIncidentalCostsExAnte(Double financialInstrumentIncidentalCostsExAnte) {
    this.financialInstrumentIncidentalCostsExAnte = financialInstrumentIncidentalCostsExAnte;
  }

  public CostsAndChargesExAnte financialInstrumentManagementFee(Double financialInstrumentManagementFee) {
    this.financialInstrumentManagementFee = financialInstrumentManagementFee;
    return this;
  }

  /**
   * About Funds, expressed as a percentage of NAV of the Financial Product / per annum. Ex Ante. About Structured Securities, expressed as a  percentage of NAV / Notional of the Financial Product / per annum.
   * @return financialInstrumentManagementFee
  **/
  @ApiModelProperty(value = "About Funds, expressed as a percentage of NAV of the Financial Product / per annum. Ex Ante. About Structured Securities, expressed as a  percentage of NAV / Notional of the Financial Product / per annum.")


  public Double getFinancialInstrumentManagementFee() {
    return financialInstrumentManagementFee;
  }

  public void setFinancialInstrumentManagementFee(Double financialInstrumentManagementFee) {
    this.financialInstrumentManagementFee = financialInstrumentManagementFee;
  }

  public CostsAndChargesExAnte financialInstrumentOngoingCosts(Double financialInstrumentOngoingCosts) {
    this.financialInstrumentOngoingCosts = financialInstrumentOngoingCosts;
    return this;
  }

  /**
   * About Funds, expressed as a percentage of NAV of the Financial Product / per annum. Ex ante. About Structured Securities, expressed as a percentage of NAV / Notional (or currency  amount for Absolute quotation) of the Financial Product / always per annum.
   * @return financialInstrumentOngoingCosts
  **/
  @ApiModelProperty(value = "About Funds, expressed as a percentage of NAV of the Financial Product / per annum. Ex ante. About Structured Securities, expressed as a percentage of NAV / Notional (or currency  amount for Absolute quotation) of the Financial Product / always per annum.")


  public Double getFinancialInstrumentOngoingCosts() {
    return financialInstrumentOngoingCosts;
  }

  public void setFinancialInstrumentOngoingCosts(Double financialInstrumentOngoingCosts) {
    this.financialInstrumentOngoingCosts = financialInstrumentOngoingCosts;
  }

  public CostsAndChargesExAnte financialInstrumentTransactionCostsExAnte(Double financialInstrumentTransactionCostsExAnte) {
    this.financialInstrumentTransactionCostsExAnte = financialInstrumentTransactionCostsExAnte;
    return this;
  }

  /**
   * Expressed as a percentage of NAV of the Financial Product . Ex Ante
   * @return financialInstrumentTransactionCostsExAnte
  **/
  @ApiModelProperty(value = "Expressed as a percentage of NAV of the Financial Product . Ex Ante")


  public Double getFinancialInstrumentTransactionCostsExAnte() {
    return financialInstrumentTransactionCostsExAnte;
  }

  public void setFinancialInstrumentTransactionCostsExAnte(Double financialInstrumentTransactionCostsExAnte) {
    this.financialInstrumentTransactionCostsExAnte = financialInstrumentTransactionCostsExAnte;
  }

  public CostsAndChargesExAnte oneOffCostFinancialInstrumentEntryCost(Double oneOffCostFinancialInstrumentEntryCost) {
    this.oneOffCostFinancialInstrumentEntryCost = oneOffCostFinancialInstrumentEntryCost;
    return this;
  }

  /**
   * About Funds, maximum not acquired to the fund (ETF are excluded). Expressed as a percentage of the amount to be invested. About Structured Securities, Ask Price - Fair Value  ( as of Reporting Date )
   * @return oneOffCostFinancialInstrumentEntryCost
  **/
  @ApiModelProperty(value = "About Funds, maximum not acquired to the fund (ETF are excluded). Expressed as a percentage of the amount to be invested. About Structured Securities, Ask Price - Fair Value  ( as of Reporting Date )")


  public Double getOneOffCostFinancialInstrumentEntryCost() {
    return oneOffCostFinancialInstrumentEntryCost;
  }

  public void setOneOffCostFinancialInstrumentEntryCost(Double oneOffCostFinancialInstrumentEntryCost) {
    this.oneOffCostFinancialInstrumentEntryCost = oneOffCostFinancialInstrumentEntryCost;
  }

  public CostsAndChargesExAnte oneOffCostFinancialInstrumentExitCostStructuredSecuritiesPriorRhp(Double oneOffCostFinancialInstrumentExitCostStructuredSecuritiesPriorRhp) {
    this.oneOffCostFinancialInstrumentExitCostStructuredSecuritiesPriorRhp = oneOffCostFinancialInstrumentExitCostStructuredSecuritiesPriorRhp;
    return this;
  }

  /**
   * Fixed amount
   * @return oneOffCostFinancialInstrumentExitCostStructuredSecuritiesPriorRhp
  **/
  @ApiModelProperty(value = "Fixed amount")


  public Double getOneOffCostFinancialInstrumentExitCostStructuredSecuritiesPriorRhp() {
    return oneOffCostFinancialInstrumentExitCostStructuredSecuritiesPriorRhp;
  }

  public void setOneOffCostFinancialInstrumentExitCostStructuredSecuritiesPriorRhp(Double oneOffCostFinancialInstrumentExitCostStructuredSecuritiesPriorRhp) {
    this.oneOffCostFinancialInstrumentExitCostStructuredSecuritiesPriorRhp = oneOffCostFinancialInstrumentExitCostStructuredSecuritiesPriorRhp;
  }

  public CostsAndChargesExAnte oneOffCostFinancialInstrumentMaximumEntryCostAcquired(Double oneOffCostFinancialInstrumentMaximumEntryCostAcquired) {
    this.oneOffCostFinancialInstrumentMaximumEntryCostAcquired = oneOffCostFinancialInstrumentMaximumEntryCostAcquired;
    return this;
  }

  /**
   * Subscription fees acquired to the fund Expressed as a percentage of the amount to be invested
   * @return oneOffCostFinancialInstrumentMaximumEntryCostAcquired
  **/
  @ApiModelProperty(value = "Subscription fees acquired to the fund Expressed as a percentage of the amount to be invested")


  public Double getOneOffCostFinancialInstrumentMaximumEntryCostAcquired() {
    return oneOffCostFinancialInstrumentMaximumEntryCostAcquired;
  }

  public void setOneOffCostFinancialInstrumentMaximumEntryCostAcquired(Double oneOffCostFinancialInstrumentMaximumEntryCostAcquired) {
    this.oneOffCostFinancialInstrumentMaximumEntryCostAcquired = oneOffCostFinancialInstrumentMaximumEntryCostAcquired;
  }

  public CostsAndChargesExAnte oneOffCostFinancialInstrumentMaximumEntryCostFixedAmountItaly(Double oneOffCostFinancialInstrumentMaximumEntryCostFixedAmountItaly) {
    this.oneOffCostFinancialInstrumentMaximumEntryCostFixedAmountItaly = oneOffCostFinancialInstrumentMaximumEntryCostFixedAmountItaly;
    return this;
  }

  /**
   * Maximum fixed amount per subscription, not incorporated. Flat fee definied by the manufacturer
   * @return oneOffCostFinancialInstrumentMaximumEntryCostFixedAmountItaly
  **/
  @ApiModelProperty(value = "Maximum fixed amount per subscription, not incorporated. Flat fee definied by the manufacturer")


  public Double getOneOffCostFinancialInstrumentMaximumEntryCostFixedAmountItaly() {
    return oneOffCostFinancialInstrumentMaximumEntryCostFixedAmountItaly;
  }

  public void setOneOffCostFinancialInstrumentMaximumEntryCostFixedAmountItaly(Double oneOffCostFinancialInstrumentMaximumEntryCostFixedAmountItaly) {
    this.oneOffCostFinancialInstrumentMaximumEntryCostFixedAmountItaly = oneOffCostFinancialInstrumentMaximumEntryCostFixedAmountItaly;
  }

  public CostsAndChargesExAnte oneOffCostsFinancialInstrumentMaximumExitCost(Double oneOffCostsFinancialInstrumentMaximumExitCost) {
    this.oneOffCostsFinancialInstrumentMaximumExitCost = oneOffCostsFinancialInstrumentMaximumExitCost;
    return this;
  }

  /**
   * Maximum not acquired to the fund  (ETF are excluded). Expressed as a percentage of the NAV
   * @return oneOffCostsFinancialInstrumentMaximumExitCost
  **/
  @ApiModelProperty(value = "Maximum not acquired to the fund  (ETF are excluded). Expressed as a percentage of the NAV")


  public Double getOneOffCostsFinancialInstrumentMaximumExitCost() {
    return oneOffCostsFinancialInstrumentMaximumExitCost;
  }

  public void setOneOffCostsFinancialInstrumentMaximumExitCost(Double oneOffCostsFinancialInstrumentMaximumExitCost) {
    this.oneOffCostsFinancialInstrumentMaximumExitCost = oneOffCostsFinancialInstrumentMaximumExitCost;
  }

  public CostsAndChargesExAnte oneOffCostsFinancialInstrumentMaximumExitCostAcquired(Double oneOffCostsFinancialInstrumentMaximumExitCostAcquired) {
    this.oneOffCostsFinancialInstrumentMaximumExitCostAcquired = oneOffCostsFinancialInstrumentMaximumExitCostAcquired;
    return this;
  }

  /**
   * Maximum  (ETF are excluded). Subscription fees acquired to the fund  Expressed as a percentage of the NAV
   * @return oneOffCostsFinancialInstrumentMaximumExitCostAcquired
  **/
  @ApiModelProperty(value = "Maximum  (ETF are excluded). Subscription fees acquired to the fund  Expressed as a percentage of the NAV")


  public Double getOneOffCostsFinancialInstrumentMaximumExitCostAcquired() {
    return oneOffCostsFinancialInstrumentMaximumExitCostAcquired;
  }

  public void setOneOffCostsFinancialInstrumentMaximumExitCostAcquired(Double oneOffCostsFinancialInstrumentMaximumExitCostAcquired) {
    this.oneOffCostsFinancialInstrumentMaximumExitCostAcquired = oneOffCostsFinancialInstrumentMaximumExitCostAcquired;
  }

  public CostsAndChargesExAnte oneOffCostsFinancialInstrumentMaximumExitCostFixedAmountItaly(Double oneOffCostsFinancialInstrumentMaximumExitCostFixedAmountItaly) {
    this.oneOffCostsFinancialInstrumentMaximumExitCostFixedAmountItaly = oneOffCostsFinancialInstrumentMaximumExitCostFixedAmountItaly;
    return this;
  }

  /**
   * Maximum fixed amount per redemption, not incorporated. Flat fee definied by the manufacturer
   * @return oneOffCostsFinancialInstrumentMaximumExitCostFixedAmountItaly
  **/
  @ApiModelProperty(value = "Maximum fixed amount per redemption, not incorporated. Flat fee definied by the manufacturer")


  public Double getOneOffCostsFinancialInstrumentMaximumExitCostFixedAmountItaly() {
    return oneOffCostsFinancialInstrumentMaximumExitCostFixedAmountItaly;
  }

  public void setOneOffCostsFinancialInstrumentMaximumExitCostFixedAmountItaly(Double oneOffCostsFinancialInstrumentMaximumExitCostFixedAmountItaly) {
    this.oneOffCostsFinancialInstrumentMaximumExitCostFixedAmountItaly = oneOffCostsFinancialInstrumentMaximumExitCostFixedAmountItaly;
  }

  public CostsAndChargesExAnte oneOffCostsFinancialInstrumentTypicalExitCost(Double oneOffCostsFinancialInstrumentTypicalExitCost) {
    this.oneOffCostsFinancialInstrumentTypicalExitCost = oneOffCostsFinancialInstrumentTypicalExitCost;
    return this;
  }

  /**
   * About Fund, current exit cost linked to the RHP or Time to Maturity or 1Y (V) or 3Y(S) or 5Y (M L)  (the value of 05080_Time_Horizon). About Structured Securities, Exit cost at the RHP ( typically 0% )
   * @return oneOffCostsFinancialInstrumentTypicalExitCost
  **/
  @ApiModelProperty(value = "About Fund, current exit cost linked to the RHP or Time to Maturity or 1Y (V) or 3Y(S) or 5Y (M L)  (the value of 05080_Time_Horizon). About Structured Securities, Exit cost at the RHP ( typically 0% )")


  public Double getOneOffCostsFinancialInstrumentTypicalExitCost() {
    return oneOffCostsFinancialInstrumentTypicalExitCost;
  }

  public void setOneOffCostsFinancialInstrumentTypicalExitCost(Double oneOffCostsFinancialInstrumentTypicalExitCost) {
    this.oneOffCostsFinancialInstrumentTypicalExitCost = oneOffCostsFinancialInstrumentTypicalExitCost;
  }

  public CostsAndChargesExAnte structuredSecuritiesQuotation(StructuredSecuritiesQuotationEnum structuredSecuritiesQuotation) {
    this.structuredSecuritiesQuotation = structuredSecuritiesQuotation;
    return this;
  }

  /**
   * Unit quotation in Units figures or Percentage quotation of the amount to be invested
   * @return structuredSecuritiesQuotation
  **/
  @ApiModelProperty(value = "Unit quotation in Units figures or Percentage quotation of the amount to be invested")


  public StructuredSecuritiesQuotationEnum getStructuredSecuritiesQuotation() {
    return structuredSecuritiesQuotation;
  }

  public void setStructuredSecuritiesQuotation(StructuredSecuritiesQuotationEnum structuredSecuritiesQuotation) {
    this.structuredSecuritiesQuotation = structuredSecuritiesQuotation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CostsAndChargesExAnte costsAndChargesExAnte = (CostsAndChargesExAnte) o;
    return Objects.equals(this.financialInstrumentDistributionFee, costsAndChargesExAnte.financialInstrumentDistributionFee) &&
        Objects.equals(this.financialInstrumentIncidentalCostsExAnte, costsAndChargesExAnte.financialInstrumentIncidentalCostsExAnte) &&
        Objects.equals(this.financialInstrumentManagementFee, costsAndChargesExAnte.financialInstrumentManagementFee) &&
        Objects.equals(this.financialInstrumentOngoingCosts, costsAndChargesExAnte.financialInstrumentOngoingCosts) &&
        Objects.equals(this.financialInstrumentTransactionCostsExAnte, costsAndChargesExAnte.financialInstrumentTransactionCostsExAnte) &&
        Objects.equals(this.oneOffCostFinancialInstrumentEntryCost, costsAndChargesExAnte.oneOffCostFinancialInstrumentEntryCost) &&
        Objects.equals(this.oneOffCostFinancialInstrumentExitCostStructuredSecuritiesPriorRhp, costsAndChargesExAnte.oneOffCostFinancialInstrumentExitCostStructuredSecuritiesPriorRhp) &&
        Objects.equals(this.oneOffCostFinancialInstrumentMaximumEntryCostAcquired, costsAndChargesExAnte.oneOffCostFinancialInstrumentMaximumEntryCostAcquired) &&
        Objects.equals(this.oneOffCostFinancialInstrumentMaximumEntryCostFixedAmountItaly, costsAndChargesExAnte.oneOffCostFinancialInstrumentMaximumEntryCostFixedAmountItaly) &&
        Objects.equals(this.oneOffCostsFinancialInstrumentMaximumExitCost, costsAndChargesExAnte.oneOffCostsFinancialInstrumentMaximumExitCost) &&
        Objects.equals(this.oneOffCostsFinancialInstrumentMaximumExitCostAcquired, costsAndChargesExAnte.oneOffCostsFinancialInstrumentMaximumExitCostAcquired) &&
        Objects.equals(this.oneOffCostsFinancialInstrumentMaximumExitCostFixedAmountItaly, costsAndChargesExAnte.oneOffCostsFinancialInstrumentMaximumExitCostFixedAmountItaly) &&
        Objects.equals(this.oneOffCostsFinancialInstrumentTypicalExitCost, costsAndChargesExAnte.oneOffCostsFinancialInstrumentTypicalExitCost) &&
        Objects.equals(this.structuredSecuritiesQuotation, costsAndChargesExAnte.structuredSecuritiesQuotation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(financialInstrumentDistributionFee, financialInstrumentIncidentalCostsExAnte, financialInstrumentManagementFee, financialInstrumentOngoingCosts, financialInstrumentTransactionCostsExAnte, oneOffCostFinancialInstrumentEntryCost, oneOffCostFinancialInstrumentExitCostStructuredSecuritiesPriorRhp, oneOffCostFinancialInstrumentMaximumEntryCostAcquired, oneOffCostFinancialInstrumentMaximumEntryCostFixedAmountItaly, oneOffCostsFinancialInstrumentMaximumExitCost, oneOffCostsFinancialInstrumentMaximumExitCostAcquired, oneOffCostsFinancialInstrumentMaximumExitCostFixedAmountItaly, oneOffCostsFinancialInstrumentTypicalExitCost, structuredSecuritiesQuotation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CostsAndChargesExAnte {\n");
    
    sb.append("    financialInstrumentDistributionFee: ").append(toIndentedString(financialInstrumentDistributionFee)).append("\n");
    sb.append("    financialInstrumentIncidentalCostsExAnte: ").append(toIndentedString(financialInstrumentIncidentalCostsExAnte)).append("\n");
    sb.append("    financialInstrumentManagementFee: ").append(toIndentedString(financialInstrumentManagementFee)).append("\n");
    sb.append("    financialInstrumentOngoingCosts: ").append(toIndentedString(financialInstrumentOngoingCosts)).append("\n");
    sb.append("    financialInstrumentTransactionCostsExAnte: ").append(toIndentedString(financialInstrumentTransactionCostsExAnte)).append("\n");
    sb.append("    oneOffCostFinancialInstrumentEntryCost: ").append(toIndentedString(oneOffCostFinancialInstrumentEntryCost)).append("\n");
    sb.append("    oneOffCostFinancialInstrumentExitCostStructuredSecuritiesPriorRhp: ").append(toIndentedString(oneOffCostFinancialInstrumentExitCostStructuredSecuritiesPriorRhp)).append("\n");
    sb.append("    oneOffCostFinancialInstrumentMaximumEntryCostAcquired: ").append(toIndentedString(oneOffCostFinancialInstrumentMaximumEntryCostAcquired)).append("\n");
    sb.append("    oneOffCostFinancialInstrumentMaximumEntryCostFixedAmountItaly: ").append(toIndentedString(oneOffCostFinancialInstrumentMaximumEntryCostFixedAmountItaly)).append("\n");
    sb.append("    oneOffCostsFinancialInstrumentMaximumExitCost: ").append(toIndentedString(oneOffCostsFinancialInstrumentMaximumExitCost)).append("\n");
    sb.append("    oneOffCostsFinancialInstrumentMaximumExitCostAcquired: ").append(toIndentedString(oneOffCostsFinancialInstrumentMaximumExitCostAcquired)).append("\n");
    sb.append("    oneOffCostsFinancialInstrumentMaximumExitCostFixedAmountItaly: ").append(toIndentedString(oneOffCostsFinancialInstrumentMaximumExitCostFixedAmountItaly)).append("\n");
    sb.append("    oneOffCostsFinancialInstrumentTypicalExitCost: ").append(toIndentedString(oneOffCostsFinancialInstrumentTypicalExitCost)).append("\n");
    sb.append("    structuredSecuritiesQuotation: ").append(toIndentedString(structuredSecuritiesQuotation)).append("\n");
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

