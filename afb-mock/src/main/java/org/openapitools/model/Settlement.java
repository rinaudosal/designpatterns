package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Price;
import org.openapitools.model.ResourceReference;
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
 * This object contains the details of the Settlement information
 */
@ApiModel(description = "This object contains the details of the Settlement information")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class Settlement   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("price")
  private Price price = null;

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

  @JsonProperty("transaction")
  private ResourceReference transaction = null;

  public Settlement id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The Id of the settlement
   * @return id
  **/
  @ApiModelProperty(value = "The Id of the settlement")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Settlement price(Price price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Price getPrice() {
    return price;
  }

  public void setPrice(Price price) {
    this.price = price;
  }

  public Settlement settlementAmountData(SettlementAmountData settlementAmountData) {
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

  public Settlement settlementBasicData(SettlementBasicData settlementBasicData) {
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

  public Settlement settlementCapitalGainedData(SettlementCapitalGainedData settlementCapitalGainedData) {
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

  public Settlement settlementDateData(SettlementDateData settlementDateData) {
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

  public Settlement settlementEtfData(SettlementEtfData settlementEtfData) {
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

  public Settlement settlementFeeData(SettlementFeeData settlementFeeData) {
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

  public Settlement settlementSettingsData(SettlementSettingsData settlementSettingsData) {
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

  public Settlement settlementSharesData(SettlementSharesData settlementSharesData) {
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

  public Settlement settlementsWithholdingData(SettlementsWithholdingData settlementsWithholdingData) {
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

  public Settlement transaction(ResourceReference transaction) {
    this.transaction = transaction;
    return this;
  }

  /**
   * Get transaction
   * @return transaction
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ResourceReference getTransaction() {
    return transaction;
  }

  public void setTransaction(ResourceReference transaction) {
    this.transaction = transaction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Settlement settlement = (Settlement) o;
    return Objects.equals(this.id, settlement.id) &&
        Objects.equals(this.price, settlement.price) &&
        Objects.equals(this.settlementAmountData, settlement.settlementAmountData) &&
        Objects.equals(this.settlementBasicData, settlement.settlementBasicData) &&
        Objects.equals(this.settlementCapitalGainedData, settlement.settlementCapitalGainedData) &&
        Objects.equals(this.settlementDateData, settlement.settlementDateData) &&
        Objects.equals(this.settlementEtfData, settlement.settlementEtfData) &&
        Objects.equals(this.settlementFeeData, settlement.settlementFeeData) &&
        Objects.equals(this.settlementSettingsData, settlement.settlementSettingsData) &&
        Objects.equals(this.settlementSharesData, settlement.settlementSharesData) &&
        Objects.equals(this.settlementsWithholdingData, settlement.settlementsWithholdingData) &&
        Objects.equals(this.transaction, settlement.transaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, price, settlementAmountData, settlementBasicData, settlementCapitalGainedData, settlementDateData, settlementEtfData, settlementFeeData, settlementSettingsData, settlementSharesData, settlementsWithholdingData, transaction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Settlement {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    settlementAmountData: ").append(toIndentedString(settlementAmountData)).append("\n");
    sb.append("    settlementBasicData: ").append(toIndentedString(settlementBasicData)).append("\n");
    sb.append("    settlementCapitalGainedData: ").append(toIndentedString(settlementCapitalGainedData)).append("\n");
    sb.append("    settlementDateData: ").append(toIndentedString(settlementDateData)).append("\n");
    sb.append("    settlementEtfData: ").append(toIndentedString(settlementEtfData)).append("\n");
    sb.append("    settlementFeeData: ").append(toIndentedString(settlementFeeData)).append("\n");
    sb.append("    settlementSettingsData: ").append(toIndentedString(settlementSettingsData)).append("\n");
    sb.append("    settlementSharesData: ").append(toIndentedString(settlementSharesData)).append("\n");
    sb.append("    settlementsWithholdingData: ").append(toIndentedString(settlementsWithholdingData)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
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

