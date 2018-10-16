package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.model.SettlementAmountData;
import org.openapitools.model.SettlementBasicData;
import org.openapitools.model.SettlementCapitalGainedData;
import org.openapitools.model.SettlementDateData;
import org.openapitools.model.SettlementEtfData;
import org.openapitools.model.SettlementFeeData;
import org.openapitools.model.SettlementSettingsData;
import org.openapitools.model.SettlementSharesData;
import org.openapitools.model.SettlementsWithholdingData;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This object contains the summary of the Settlement information
 */
@ApiModel(description = "This object contains the summary of the Settlement information")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SettlementSummary   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("nav")
  private Double nav = null;

  @JsonProperty("navDate")
  private OffsetDateTime navDate = null;

  @JsonProperty("pendingAmount")
  private Double pendingAmount = null;

  @JsonProperty("settledAmount")
  private Double settledAmount = null;

  @JsonProperty("settlementAmountData")
  private SettlementAmountData settlementAmountData = null;

  @JsonProperty("settlementBasicData")
  private SettlementBasicData settlementBasicData = null;

  @JsonProperty("settlementCapitalGainedData")
  private SettlementCapitalGainedData settlementCapitalGainedData = null;

  @JsonProperty("settlementDateData")
  private SettlementDateData settlementDateData = null;

  @JsonProperty("settlementEtfData")
  private SettlementEtfData settlementEtfData = null;

  @JsonProperty("settlementFeeData")
  private SettlementFeeData settlementFeeData = null;

  @JsonProperty("settlementSettingsData")
  private SettlementSettingsData settlementSettingsData = null;

  @JsonProperty("settlementSharesData")
  private SettlementSharesData settlementSharesData = null;

  @JsonProperty("settlementsWithholdingData")
  private SettlementsWithholdingData settlementsWithholdingData = null;

  public SettlementSummary id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The Id of the {Settlement}.
   * @return id
  **/
  @ApiModelProperty(value = "The Id of the {Settlement}.")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SettlementSummary nav(Double nav) {
    this.nav = nav;
    return this;
  }

  /**
   * The {NAV} date used in the {Transaction} associated to the {Settlement}. This refers to the {Settlement}'s {Price.value}
   * @return nav
  **/
  @ApiModelProperty(value = "The {NAV} date used in the {Transaction} associated to the {Settlement}. This refers to the {Settlement}'s {Price.value}")


  public Double getNav() {
    return nav;
  }

  public void setNav(Double nav) {
    this.nav = nav;
  }

  public SettlementSummary navDate(OffsetDateTime navDate) {
    this.navDate = navDate;
    return this;
  }

  /**
   * The {NAV} date used in the {Transaction} associated to the {Settlement}. This refers to the {Settlement}'s {Price.date}
   * @return navDate
  **/
  @ApiModelProperty(value = "The {NAV} date used in the {Transaction} associated to the {Settlement}. This refers to the {Settlement}'s {Price.date}")

  @Valid

  public OffsetDateTime getNavDate() {
    return navDate;
  }

  public void setNavDate(OffsetDateTime navDate) {
    this.navDate = navDate;
  }

  public SettlementSummary pendingAmount(Double pendingAmount) {
    this.pendingAmount = pendingAmount;
    return this;
  }

  /**
   * The amount that is pending to be settled expressed in the {Settlement}'s {SettlementBasicData.currencyCode}. This refers to {SettlementAmountData.settledAmount}. It is only valid for {Settlement} whose {SettlementSettingsData.grouped} is set to `true`
   * @return pendingAmount
  **/
  @ApiModelProperty(value = "The amount that is pending to be settled expressed in the {Settlement}'s {SettlementBasicData.currencyCode}. This refers to {SettlementAmountData.settledAmount}. It is only valid for {Settlement} whose {SettlementSettingsData.grouped} is set to `true`")


  public Double getPendingAmount() {
    return pendingAmount;
  }

  public void setPendingAmount(Double pendingAmount) {
    this.pendingAmount = pendingAmount;
  }

  public SettlementSummary settledAmount(Double settledAmount) {
    this.settledAmount = settledAmount;
    return this;
  }

  /**
   * The settled amount expressed in the {Settlement}'s {SettlementBasicData.currencyCode}. This refers to {SettlementAmountData.settledAmount}.
   * @return settledAmount
  **/
  @ApiModelProperty(value = "The settled amount expressed in the {Settlement}'s {SettlementBasicData.currencyCode}. This refers to {SettlementAmountData.settledAmount}.")


  public Double getSettledAmount() {
    return settledAmount;
  }

  public void setSettledAmount(Double settledAmount) {
    this.settledAmount = settledAmount;
  }

  public SettlementSummary settlementAmountData(SettlementAmountData settlementAmountData) {
    this.settlementAmountData = settlementAmountData;
    return this;
  }

  /**
   * Get settlementAmountData
   * @return settlementAmountData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SettlementAmountData getSettlementAmountData() {
    return settlementAmountData;
  }

  public void setSettlementAmountData(SettlementAmountData settlementAmountData) {
    this.settlementAmountData = settlementAmountData;
  }

  public SettlementSummary settlementBasicData(SettlementBasicData settlementBasicData) {
    this.settlementBasicData = settlementBasicData;
    return this;
  }

  /**
   * Get settlementBasicData
   * @return settlementBasicData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SettlementBasicData getSettlementBasicData() {
    return settlementBasicData;
  }

  public void setSettlementBasicData(SettlementBasicData settlementBasicData) {
    this.settlementBasicData = settlementBasicData;
  }

  public SettlementSummary settlementCapitalGainedData(SettlementCapitalGainedData settlementCapitalGainedData) {
    this.settlementCapitalGainedData = settlementCapitalGainedData;
    return this;
  }

  /**
   * Get settlementCapitalGainedData
   * @return settlementCapitalGainedData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SettlementCapitalGainedData getSettlementCapitalGainedData() {
    return settlementCapitalGainedData;
  }

  public void setSettlementCapitalGainedData(SettlementCapitalGainedData settlementCapitalGainedData) {
    this.settlementCapitalGainedData = settlementCapitalGainedData;
  }

  public SettlementSummary settlementDateData(SettlementDateData settlementDateData) {
    this.settlementDateData = settlementDateData;
    return this;
  }

  /**
   * Get settlementDateData
   * @return settlementDateData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SettlementDateData getSettlementDateData() {
    return settlementDateData;
  }

  public void setSettlementDateData(SettlementDateData settlementDateData) {
    this.settlementDateData = settlementDateData;
  }

  public SettlementSummary settlementEtfData(SettlementEtfData settlementEtfData) {
    this.settlementEtfData = settlementEtfData;
    return this;
  }

  /**
   * Get settlementEtfData
   * @return settlementEtfData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SettlementEtfData getSettlementEtfData() {
    return settlementEtfData;
  }

  public void setSettlementEtfData(SettlementEtfData settlementEtfData) {
    this.settlementEtfData = settlementEtfData;
  }

  public SettlementSummary settlementFeeData(SettlementFeeData settlementFeeData) {
    this.settlementFeeData = settlementFeeData;
    return this;
  }

  /**
   * Get settlementFeeData
   * @return settlementFeeData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SettlementFeeData getSettlementFeeData() {
    return settlementFeeData;
  }

  public void setSettlementFeeData(SettlementFeeData settlementFeeData) {
    this.settlementFeeData = settlementFeeData;
  }

  public SettlementSummary settlementSettingsData(SettlementSettingsData settlementSettingsData) {
    this.settlementSettingsData = settlementSettingsData;
    return this;
  }

  /**
   * Get settlementSettingsData
   * @return settlementSettingsData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SettlementSettingsData getSettlementSettingsData() {
    return settlementSettingsData;
  }

  public void setSettlementSettingsData(SettlementSettingsData settlementSettingsData) {
    this.settlementSettingsData = settlementSettingsData;
  }

  public SettlementSummary settlementSharesData(SettlementSharesData settlementSharesData) {
    this.settlementSharesData = settlementSharesData;
    return this;
  }

  /**
   * Get settlementSharesData
   * @return settlementSharesData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SettlementSharesData getSettlementSharesData() {
    return settlementSharesData;
  }

  public void setSettlementSharesData(SettlementSharesData settlementSharesData) {
    this.settlementSharesData = settlementSharesData;
  }

  public SettlementSummary settlementsWithholdingData(SettlementsWithholdingData settlementsWithholdingData) {
    this.settlementsWithholdingData = settlementsWithholdingData;
    return this;
  }

  /**
   * Get settlementsWithholdingData
   * @return settlementsWithholdingData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SettlementsWithholdingData getSettlementsWithholdingData() {
    return settlementsWithholdingData;
  }

  public void setSettlementsWithholdingData(SettlementsWithholdingData settlementsWithholdingData) {
    this.settlementsWithholdingData = settlementsWithholdingData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettlementSummary settlementSummary = (SettlementSummary) o;
    return Objects.equals(this.id, settlementSummary.id) &&
        Objects.equals(this.nav, settlementSummary.nav) &&
        Objects.equals(this.navDate, settlementSummary.navDate) &&
        Objects.equals(this.pendingAmount, settlementSummary.pendingAmount) &&
        Objects.equals(this.settledAmount, settlementSummary.settledAmount) &&
        Objects.equals(this.settlementAmountData, settlementSummary.settlementAmountData) &&
        Objects.equals(this.settlementBasicData, settlementSummary.settlementBasicData) &&
        Objects.equals(this.settlementCapitalGainedData, settlementSummary.settlementCapitalGainedData) &&
        Objects.equals(this.settlementDateData, settlementSummary.settlementDateData) &&
        Objects.equals(this.settlementEtfData, settlementSummary.settlementEtfData) &&
        Objects.equals(this.settlementFeeData, settlementSummary.settlementFeeData) &&
        Objects.equals(this.settlementSettingsData, settlementSummary.settlementSettingsData) &&
        Objects.equals(this.settlementSharesData, settlementSummary.settlementSharesData) &&
        Objects.equals(this.settlementsWithholdingData, settlementSummary.settlementsWithholdingData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nav, navDate, pendingAmount, settledAmount, settlementAmountData, settlementBasicData, settlementCapitalGainedData, settlementDateData, settlementEtfData, settlementFeeData, settlementSettingsData, settlementSharesData, settlementsWithholdingData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettlementSummary {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nav: ").append(toIndentedString(nav)).append("\n");
    sb.append("    navDate: ").append(toIndentedString(navDate)).append("\n");
    sb.append("    pendingAmount: ").append(toIndentedString(pendingAmount)).append("\n");
    sb.append("    settledAmount: ").append(toIndentedString(settledAmount)).append("\n");
    sb.append("    settlementAmountData: ").append(toIndentedString(settlementAmountData)).append("\n");
    sb.append("    settlementBasicData: ").append(toIndentedString(settlementBasicData)).append("\n");
    sb.append("    settlementCapitalGainedData: ").append(toIndentedString(settlementCapitalGainedData)).append("\n");
    sb.append("    settlementDateData: ").append(toIndentedString(settlementDateData)).append("\n");
    sb.append("    settlementEtfData: ").append(toIndentedString(settlementEtfData)).append("\n");
    sb.append("    settlementFeeData: ").append(toIndentedString(settlementFeeData)).append("\n");
    sb.append("    settlementSettingsData: ").append(toIndentedString(settlementSettingsData)).append("\n");
    sb.append("    settlementSharesData: ").append(toIndentedString(settlementSharesData)).append("\n");
    sb.append("    settlementsWithholdingData: ").append(toIndentedString(settlementsWithholdingData)).append("\n");
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

