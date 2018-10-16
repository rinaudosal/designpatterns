package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ExternalStockTransferData;
import org.openapitools.model.InternalStockTransferData;
import org.openapitools.model.StockTransferBasicData;
import org.openapitools.model.StockTransferItalianRetailMarketData;
import org.openapitools.model.StockTransferSettingsData;
import org.openapitools.model.StockTransferSharesData;
import org.openapitools.model.StockTransferTransactionData;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StockTransfer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class StockTransfer   {
  @JsonProperty("currencyCode")
  private String currencyCode = null;

  @JsonProperty("externalStockTransferData")
  private ExternalStockTransferData externalStockTransferData = null;

  @JsonProperty("historyAccessible")
  private Boolean historyAccessible = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("intermediaryBic")
  private String intermediaryBic = null;

  @JsonProperty("internalStockTransferData")
  private InternalStockTransferData internalStockTransferData = null;

  @JsonProperty("senderBic")
  private String senderBic = null;

  @JsonProperty("stockTransferBasicData")
  private StockTransferBasicData stockTransferBasicData = null;

  @JsonProperty("stockTransferItalianRetailMarketData")
  private StockTransferItalianRetailMarketData stockTransferItalianRetailMarketData = null;

  @JsonProperty("stockTransferSettingsData")
  private StockTransferSettingsData stockTransferSettingsData = null;

  @JsonProperty("stockTransferSharesData")
  private StockTransferSharesData stockTransferSharesData = null;

  @JsonProperty("stockTransferTransactionData")
  private StockTransferTransactionData stockTransferTransactionData = null;

  @JsonProperty("swiftText")
  private String swiftText = null;

  public StockTransfer currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * The currency associated to the {StockTransfer}. Refers to the {Transaction.currencyCode}
   * @return currencyCode
  **/
  @ApiModelProperty(value = "The currency associated to the {StockTransfer}. Refers to the {Transaction.currencyCode}")


  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public StockTransfer externalStockTransferData(ExternalStockTransferData externalStockTransferData) {
    this.externalStockTransferData = externalStockTransferData;
    return this;
  }

  /**
   * Get externalStockTransferData
   * @return externalStockTransferData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ExternalStockTransferData getExternalStockTransferData() {
    return externalStockTransferData;
  }

  public void setExternalStockTransferData(ExternalStockTransferData externalStockTransferData) {
    this.externalStockTransferData = externalStockTransferData;
  }

  public StockTransfer historyAccessible(Boolean historyAccessible) {
    this.historyAccessible = historyAccessible;
    return this;
  }

  /**
   * Indicates whether it is possible to consult the transaction history of the transaction.
   * @return historyAccessible
  **/
  @ApiModelProperty(value = "Indicates whether it is possible to consult the transaction history of the transaction.")


  public Boolean getHistoryAccessible() {
    return historyAccessible;
  }

  public void setHistoryAccessible(Boolean historyAccessible) {
    this.historyAccessible = historyAccessible;
  }

  public StockTransfer id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The Id of the {StockTransfer}
   * @return id
  **/
  @ApiModelProperty(value = "The Id of the {StockTransfer}")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public StockTransfer intermediaryBic(String intermediaryBic) {
    this.intermediaryBic = intermediaryBic;
    return this;
  }

  /**
   * The intermediry's BIC code.
   * @return intermediaryBic
  **/
  @ApiModelProperty(value = "The intermediry's BIC code.")


  public String getIntermediaryBic() {
    return intermediaryBic;
  }

  public void setIntermediaryBic(String intermediaryBic) {
    this.intermediaryBic = intermediaryBic;
  }

  public StockTransfer internalStockTransferData(InternalStockTransferData internalStockTransferData) {
    this.internalStockTransferData = internalStockTransferData;
    return this;
  }

  /**
   * Get internalStockTransferData
   * @return internalStockTransferData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public InternalStockTransferData getInternalStockTransferData() {
    return internalStockTransferData;
  }

  public void setInternalStockTransferData(InternalStockTransferData internalStockTransferData) {
    this.internalStockTransferData = internalStockTransferData;
  }

  public StockTransfer senderBic(String senderBic) {
    this.senderBic = senderBic;
    return this;
  }

  /**
   * The sender's BIC code.
   * @return senderBic
  **/
  @ApiModelProperty(value = "The sender's BIC code.")


  public String getSenderBic() {
    return senderBic;
  }

  public void setSenderBic(String senderBic) {
    this.senderBic = senderBic;
  }

  public StockTransfer stockTransferBasicData(StockTransferBasicData stockTransferBasicData) {
    this.stockTransferBasicData = stockTransferBasicData;
    return this;
  }

  /**
   * Get stockTransferBasicData
   * @return stockTransferBasicData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public StockTransferBasicData getStockTransferBasicData() {
    return stockTransferBasicData;
  }

  public void setStockTransferBasicData(StockTransferBasicData stockTransferBasicData) {
    this.stockTransferBasicData = stockTransferBasicData;
  }

  public StockTransfer stockTransferItalianRetailMarketData(StockTransferItalianRetailMarketData stockTransferItalianRetailMarketData) {
    this.stockTransferItalianRetailMarketData = stockTransferItalianRetailMarketData;
    return this;
  }

  /**
   * Get stockTransferItalianRetailMarketData
   * @return stockTransferItalianRetailMarketData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public StockTransferItalianRetailMarketData getStockTransferItalianRetailMarketData() {
    return stockTransferItalianRetailMarketData;
  }

  public void setStockTransferItalianRetailMarketData(StockTransferItalianRetailMarketData stockTransferItalianRetailMarketData) {
    this.stockTransferItalianRetailMarketData = stockTransferItalianRetailMarketData;
  }

  public StockTransfer stockTransferSettingsData(StockTransferSettingsData stockTransferSettingsData) {
    this.stockTransferSettingsData = stockTransferSettingsData;
    return this;
  }

  /**
   * Get stockTransferSettingsData
   * @return stockTransferSettingsData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public StockTransferSettingsData getStockTransferSettingsData() {
    return stockTransferSettingsData;
  }

  public void setStockTransferSettingsData(StockTransferSettingsData stockTransferSettingsData) {
    this.stockTransferSettingsData = stockTransferSettingsData;
  }

  public StockTransfer stockTransferSharesData(StockTransferSharesData stockTransferSharesData) {
    this.stockTransferSharesData = stockTransferSharesData;
    return this;
  }

  /**
   * Get stockTransferSharesData
   * @return stockTransferSharesData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public StockTransferSharesData getStockTransferSharesData() {
    return stockTransferSharesData;
  }

  public void setStockTransferSharesData(StockTransferSharesData stockTransferSharesData) {
    this.stockTransferSharesData = stockTransferSharesData;
  }

  public StockTransfer stockTransferTransactionData(StockTransferTransactionData stockTransferTransactionData) {
    this.stockTransferTransactionData = stockTransferTransactionData;
    return this;
  }

  /**
   * Get stockTransferTransactionData
   * @return stockTransferTransactionData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public StockTransferTransactionData getStockTransferTransactionData() {
    return stockTransferTransactionData;
  }

  public void setStockTransferTransactionData(StockTransferTransactionData stockTransferTransactionData) {
    this.stockTransferTransactionData = stockTransferTransactionData;
  }

  public StockTransfer swiftText(String swiftText) {
    this.swiftText = swiftText;
    return this;
  }

  /**
   * The {SWIFT} text associated to the {StockTransfer}. It's used only when {StockTransfer} was ordered via {SWIFT}
   * @return swiftText
  **/
  @ApiModelProperty(value = "The {SWIFT} text associated to the {StockTransfer}. It's used only when {StockTransfer} was ordered via {SWIFT}")


  public String getSwiftText() {
    return swiftText;
  }

  public void setSwiftText(String swiftText) {
    this.swiftText = swiftText;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StockTransfer stockTransfer = (StockTransfer) o;
    return Objects.equals(this.currencyCode, stockTransfer.currencyCode) &&
        Objects.equals(this.externalStockTransferData, stockTransfer.externalStockTransferData) &&
        Objects.equals(this.historyAccessible, stockTransfer.historyAccessible) &&
        Objects.equals(this.id, stockTransfer.id) &&
        Objects.equals(this.intermediaryBic, stockTransfer.intermediaryBic) &&
        Objects.equals(this.internalStockTransferData, stockTransfer.internalStockTransferData) &&
        Objects.equals(this.senderBic, stockTransfer.senderBic) &&
        Objects.equals(this.stockTransferBasicData, stockTransfer.stockTransferBasicData) &&
        Objects.equals(this.stockTransferItalianRetailMarketData, stockTransfer.stockTransferItalianRetailMarketData) &&
        Objects.equals(this.stockTransferSettingsData, stockTransfer.stockTransferSettingsData) &&
        Objects.equals(this.stockTransferSharesData, stockTransfer.stockTransferSharesData) &&
        Objects.equals(this.stockTransferTransactionData, stockTransfer.stockTransferTransactionData) &&
        Objects.equals(this.swiftText, stockTransfer.swiftText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, externalStockTransferData, historyAccessible, id, intermediaryBic, internalStockTransferData, senderBic, stockTransferBasicData, stockTransferItalianRetailMarketData, stockTransferSettingsData, stockTransferSharesData, stockTransferTransactionData, swiftText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockTransfer {\n");
    
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    externalStockTransferData: ").append(toIndentedString(externalStockTransferData)).append("\n");
    sb.append("    historyAccessible: ").append(toIndentedString(historyAccessible)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    intermediaryBic: ").append(toIndentedString(intermediaryBic)).append("\n");
    sb.append("    internalStockTransferData: ").append(toIndentedString(internalStockTransferData)).append("\n");
    sb.append("    senderBic: ").append(toIndentedString(senderBic)).append("\n");
    sb.append("    stockTransferBasicData: ").append(toIndentedString(stockTransferBasicData)).append("\n");
    sb.append("    stockTransferItalianRetailMarketData: ").append(toIndentedString(stockTransferItalianRetailMarketData)).append("\n");
    sb.append("    stockTransferSettingsData: ").append(toIndentedString(stockTransferSettingsData)).append("\n");
    sb.append("    stockTransferSharesData: ").append(toIndentedString(stockTransferSharesData)).append("\n");
    sb.append("    stockTransferTransactionData: ").append(toIndentedString(stockTransferTransactionData)).append("\n");
    sb.append("    swiftText: ").append(toIndentedString(swiftText)).append("\n");
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

