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
 * CostsAndChargesExPost
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class CostsAndChargesExPost   {
  @JsonProperty("beginningOfCalculationPeriod")
  private OffsetDateTime beginningOfCalculationPeriod = null;

  @JsonProperty("endOfCalculationPeriod")
  private OffsetDateTime endOfCalculationPeriod = null;

  @JsonProperty("financialInstrumentDistributionFeeExPost")
  private Double financialInstrumentDistributionFeeExPost = null;

  @JsonProperty("financialInstrumentIncidentalCostsExPost")
  private Double financialInstrumentIncidentalCostsExPost = null;

  @JsonProperty("financialInstrumentManagementFeeExPost")
  private Double financialInstrumentManagementFeeExPost = null;

  @JsonProperty("financialInstrumentOngoingCostsExPost")
  private Double financialInstrumentOngoingCostsExPost = null;

  @JsonProperty("financialInstrumentTransactionCostsExPost")
  private Double financialInstrumentTransactionCostsExPost = null;

  @JsonProperty("ftructuredSecuritiesOngoingCostsExPostAccumulated")
  private Double ftructuredSecuritiesOngoingCostsExPostAccumulated = null;

  @JsonProperty("oneOffCostStructuredSecuritiesEntryCostExPost")
  private Double oneOffCostStructuredSecuritiesEntryCostExPost = null;

  @JsonProperty("oneOffCostsStructuredSecuritiesExitCostExPost")
  private Double oneOffCostsStructuredSecuritiesExitCostExPost = null;

  public CostsAndChargesExPost beginningOfCalculationPeriod(OffsetDateTime beginningOfCalculationPeriod) {
    this.beginningOfCalculationPeriod = beginningOfCalculationPeriod;
    return this;
  }

  /**
   * Date of beginning of calculation period
   * @return beginningOfCalculationPeriod
  **/
  @ApiModelProperty(value = "Date of beginning of calculation period")

  @Valid

  public OffsetDateTime getBeginningOfCalculationPeriod() {
    return beginningOfCalculationPeriod;
  }

  public void setBeginningOfCalculationPeriod(OffsetDateTime beginningOfCalculationPeriod) {
    this.beginningOfCalculationPeriod = beginningOfCalculationPeriod;
  }

  public CostsAndChargesExPost endOfCalculationPeriod(OffsetDateTime endOfCalculationPeriod) {
    this.endOfCalculationPeriod = endOfCalculationPeriod;
    return this;
  }

  /**
   * Date of end of calculation period
   * @return endOfCalculationPeriod
  **/
  @ApiModelProperty(value = "Date of end of calculation period")

  @Valid

  public OffsetDateTime getEndOfCalculationPeriod() {
    return endOfCalculationPeriod;
  }

  public void setEndOfCalculationPeriod(OffsetDateTime endOfCalculationPeriod) {
    this.endOfCalculationPeriod = endOfCalculationPeriod;
  }

  public CostsAndChargesExPost financialInstrumentDistributionFeeExPost(Double financialInstrumentDistributionFeeExPost) {
    this.financialInstrumentDistributionFeeExPost = financialInstrumentDistributionFeeExPost;
    return this;
  }

  /**
   * Definition tbd as a percentage of NAV of the Financial Product / per annum. Occured costs over one year
   * @return financialInstrumentDistributionFeeExPost
  **/
  @ApiModelProperty(value = "Definition tbd as a percentage of NAV of the Financial Product / per annum. Occured costs over one year")


  public Double getFinancialInstrumentDistributionFeeExPost() {
    return financialInstrumentDistributionFeeExPost;
  }

  public void setFinancialInstrumentDistributionFeeExPost(Double financialInstrumentDistributionFeeExPost) {
    this.financialInstrumentDistributionFeeExPost = financialInstrumentDistributionFeeExPost;
  }

  public CostsAndChargesExPost financialInstrumentIncidentalCostsExPost(Double financialInstrumentIncidentalCostsExPost) {
    this.financialInstrumentIncidentalCostsExPost = financialInstrumentIncidentalCostsExPost;
    return this;
  }

  /**
   * Definition tbd  as a percentage of NAV of the Financial Product. Occured costs over one year
   * @return financialInstrumentIncidentalCostsExPost
  **/
  @ApiModelProperty(value = "Definition tbd  as a percentage of NAV of the Financial Product. Occured costs over one year")


  public Double getFinancialInstrumentIncidentalCostsExPost() {
    return financialInstrumentIncidentalCostsExPost;
  }

  public void setFinancialInstrumentIncidentalCostsExPost(Double financialInstrumentIncidentalCostsExPost) {
    this.financialInstrumentIncidentalCostsExPost = financialInstrumentIncidentalCostsExPost;
  }

  public CostsAndChargesExPost financialInstrumentManagementFeeExPost(Double financialInstrumentManagementFeeExPost) {
    this.financialInstrumentManagementFeeExPost = financialInstrumentManagementFeeExPost;
    return this;
  }

  /**
   * About Funds, definition tbd as a percentage of NAV of the Financial Product / per annum. Occured costs over one year. About Structured Securities, expressed as a  percentege of NAV / Notional of the Financial Product / per annum
   * @return financialInstrumentManagementFeeExPost
  **/
  @ApiModelProperty(value = "About Funds, definition tbd as a percentage of NAV of the Financial Product / per annum. Occured costs over one year. About Structured Securities, expressed as a  percentege of NAV / Notional of the Financial Product / per annum")


  public Double getFinancialInstrumentManagementFeeExPost() {
    return financialInstrumentManagementFeeExPost;
  }

  public void setFinancialInstrumentManagementFeeExPost(Double financialInstrumentManagementFeeExPost) {
    this.financialInstrumentManagementFeeExPost = financialInstrumentManagementFeeExPost;
  }

  public CostsAndChargesExPost financialInstrumentOngoingCostsExPost(Double financialInstrumentOngoingCostsExPost) {
    this.financialInstrumentOngoingCostsExPost = financialInstrumentOngoingCostsExPost;
    return this;
  }

  /**
   * About Funds, definition tbd as a percentage of NAV of the Financial Product / per annum. Occured costs over one year. About Structured Securities, expressed as a percentage of NAV / Notional (or currency  amount for Absolute quotation) of the Financial Product / always per annum.
   * @return financialInstrumentOngoingCostsExPost
  **/
  @ApiModelProperty(value = "About Funds, definition tbd as a percentage of NAV of the Financial Product / per annum. Occured costs over one year. About Structured Securities, expressed as a percentage of NAV / Notional (or currency  amount for Absolute quotation) of the Financial Product / always per annum.")


  public Double getFinancialInstrumentOngoingCostsExPost() {
    return financialInstrumentOngoingCostsExPost;
  }

  public void setFinancialInstrumentOngoingCostsExPost(Double financialInstrumentOngoingCostsExPost) {
    this.financialInstrumentOngoingCostsExPost = financialInstrumentOngoingCostsExPost;
  }

  public CostsAndChargesExPost financialInstrumentTransactionCostsExPost(Double financialInstrumentTransactionCostsExPost) {
    this.financialInstrumentTransactionCostsExPost = financialInstrumentTransactionCostsExPost;
    return this;
  }

  /**
   * Definition tbd  as a percentage of NAV of the Financial Product .Occured costs over one year
   * @return financialInstrumentTransactionCostsExPost
  **/
  @ApiModelProperty(value = "Definition tbd  as a percentage of NAV of the Financial Product .Occured costs over one year")


  public Double getFinancialInstrumentTransactionCostsExPost() {
    return financialInstrumentTransactionCostsExPost;
  }

  public void setFinancialInstrumentTransactionCostsExPost(Double financialInstrumentTransactionCostsExPost) {
    this.financialInstrumentTransactionCostsExPost = financialInstrumentTransactionCostsExPost;
  }

  public CostsAndChargesExPost ftructuredSecuritiesOngoingCostsExPostAccumulated(Double ftructuredSecuritiesOngoingCostsExPostAccumulated) {
    this.ftructuredSecuritiesOngoingCostsExPostAccumulated = ftructuredSecuritiesOngoingCostsExPostAccumulated;
    return this;
  }

  /**
   * Sum of each daily Recurring Product Costs
   * @return ftructuredSecuritiesOngoingCostsExPostAccumulated
  **/
  @ApiModelProperty(value = "Sum of each daily Recurring Product Costs")


  public Double getFtructuredSecuritiesOngoingCostsExPostAccumulated() {
    return ftructuredSecuritiesOngoingCostsExPostAccumulated;
  }

  public void setFtructuredSecuritiesOngoingCostsExPostAccumulated(Double ftructuredSecuritiesOngoingCostsExPostAccumulated) {
    this.ftructuredSecuritiesOngoingCostsExPostAccumulated = ftructuredSecuritiesOngoingCostsExPostAccumulated;
  }

  public CostsAndChargesExPost oneOffCostStructuredSecuritiesEntryCostExPost(Double oneOffCostStructuredSecuritiesEntryCostExPost) {
    this.oneOffCostStructuredSecuritiesEntryCostExPost = oneOffCostStructuredSecuritiesEntryCostExPost;
    return this;
  }

  /**
   * Fixed Amount
   * @return oneOffCostStructuredSecuritiesEntryCostExPost
  **/
  @ApiModelProperty(value = "Fixed Amount")


  public Double getOneOffCostStructuredSecuritiesEntryCostExPost() {
    return oneOffCostStructuredSecuritiesEntryCostExPost;
  }

  public void setOneOffCostStructuredSecuritiesEntryCostExPost(Double oneOffCostStructuredSecuritiesEntryCostExPost) {
    this.oneOffCostStructuredSecuritiesEntryCostExPost = oneOffCostStructuredSecuritiesEntryCostExPost;
  }

  public CostsAndChargesExPost oneOffCostsStructuredSecuritiesExitCostExPost(Double oneOffCostsStructuredSecuritiesExitCostExPost) {
    this.oneOffCostsStructuredSecuritiesExitCostExPost = oneOffCostsStructuredSecuritiesExitCostExPost;
    return this;
  }

  /**
   * Fixed Amount
   * @return oneOffCostsStructuredSecuritiesExitCostExPost
  **/
  @ApiModelProperty(value = "Fixed Amount")


  public Double getOneOffCostsStructuredSecuritiesExitCostExPost() {
    return oneOffCostsStructuredSecuritiesExitCostExPost;
  }

  public void setOneOffCostsStructuredSecuritiesExitCostExPost(Double oneOffCostsStructuredSecuritiesExitCostExPost) {
    this.oneOffCostsStructuredSecuritiesExitCostExPost = oneOffCostsStructuredSecuritiesExitCostExPost;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CostsAndChargesExPost costsAndChargesExPost = (CostsAndChargesExPost) o;
    return Objects.equals(this.beginningOfCalculationPeriod, costsAndChargesExPost.beginningOfCalculationPeriod) &&
        Objects.equals(this.endOfCalculationPeriod, costsAndChargesExPost.endOfCalculationPeriod) &&
        Objects.equals(this.financialInstrumentDistributionFeeExPost, costsAndChargesExPost.financialInstrumentDistributionFeeExPost) &&
        Objects.equals(this.financialInstrumentIncidentalCostsExPost, costsAndChargesExPost.financialInstrumentIncidentalCostsExPost) &&
        Objects.equals(this.financialInstrumentManagementFeeExPost, costsAndChargesExPost.financialInstrumentManagementFeeExPost) &&
        Objects.equals(this.financialInstrumentOngoingCostsExPost, costsAndChargesExPost.financialInstrumentOngoingCostsExPost) &&
        Objects.equals(this.financialInstrumentTransactionCostsExPost, costsAndChargesExPost.financialInstrumentTransactionCostsExPost) &&
        Objects.equals(this.ftructuredSecuritiesOngoingCostsExPostAccumulated, costsAndChargesExPost.ftructuredSecuritiesOngoingCostsExPostAccumulated) &&
        Objects.equals(this.oneOffCostStructuredSecuritiesEntryCostExPost, costsAndChargesExPost.oneOffCostStructuredSecuritiesEntryCostExPost) &&
        Objects.equals(this.oneOffCostsStructuredSecuritiesExitCostExPost, costsAndChargesExPost.oneOffCostsStructuredSecuritiesExitCostExPost);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beginningOfCalculationPeriod, endOfCalculationPeriod, financialInstrumentDistributionFeeExPost, financialInstrumentIncidentalCostsExPost, financialInstrumentManagementFeeExPost, financialInstrumentOngoingCostsExPost, financialInstrumentTransactionCostsExPost, ftructuredSecuritiesOngoingCostsExPostAccumulated, oneOffCostStructuredSecuritiesEntryCostExPost, oneOffCostsStructuredSecuritiesExitCostExPost);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CostsAndChargesExPost {\n");
    
    sb.append("    beginningOfCalculationPeriod: ").append(toIndentedString(beginningOfCalculationPeriod)).append("\n");
    sb.append("    endOfCalculationPeriod: ").append(toIndentedString(endOfCalculationPeriod)).append("\n");
    sb.append("    financialInstrumentDistributionFeeExPost: ").append(toIndentedString(financialInstrumentDistributionFeeExPost)).append("\n");
    sb.append("    financialInstrumentIncidentalCostsExPost: ").append(toIndentedString(financialInstrumentIncidentalCostsExPost)).append("\n");
    sb.append("    financialInstrumentManagementFeeExPost: ").append(toIndentedString(financialInstrumentManagementFeeExPost)).append("\n");
    sb.append("    financialInstrumentOngoingCostsExPost: ").append(toIndentedString(financialInstrumentOngoingCostsExPost)).append("\n");
    sb.append("    financialInstrumentTransactionCostsExPost: ").append(toIndentedString(financialInstrumentTransactionCostsExPost)).append("\n");
    sb.append("    ftructuredSecuritiesOngoingCostsExPostAccumulated: ").append(toIndentedString(ftructuredSecuritiesOngoingCostsExPostAccumulated)).append("\n");
    sb.append("    oneOffCostStructuredSecuritiesEntryCostExPost: ").append(toIndentedString(oneOffCostStructuredSecuritiesEntryCostExPost)).append("\n");
    sb.append("    oneOffCostsStructuredSecuritiesExitCostExPost: ").append(toIndentedString(oneOffCostsStructuredSecuritiesExitCostExPost)).append("\n");
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

