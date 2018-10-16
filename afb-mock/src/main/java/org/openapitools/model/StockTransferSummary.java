package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.StockTransferBasicData;
import org.openapitools.model.StockTransferSettingsData;
import org.openapitools.model.StockTransferSharesData;
import org.openapitools.model.StockTransferTransactionData;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StockTransferSummary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class StockTransferSummary   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("stockTransferBasicData")
  private StockTransferBasicData stockTransferBasicData = null;

  @JsonProperty("stockTransferSettingsData")
  private StockTransferSettingsData stockTransferSettingsData = null;

  @JsonProperty("stockTransferSharesData")
  private StockTransferSharesData stockTransferSharesData = null;

  @JsonProperty("stockTransferTransactionData")
  private StockTransferTransactionData stockTransferTransactionData = null;

  public StockTransferSummary id(String id) {
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

  public StockTransferSummary stockTransferBasicData(StockTransferBasicData stockTransferBasicData) {
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

  public StockTransferSummary stockTransferSettingsData(StockTransferSettingsData stockTransferSettingsData) {
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

  public StockTransferSummary stockTransferSharesData(StockTransferSharesData stockTransferSharesData) {
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

  public StockTransferSummary stockTransferTransactionData(StockTransferTransactionData stockTransferTransactionData) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StockTransferSummary stockTransferSummary = (StockTransferSummary) o;
    return Objects.equals(this.id, stockTransferSummary.id) &&
        Objects.equals(this.stockTransferBasicData, stockTransferSummary.stockTransferBasicData) &&
        Objects.equals(this.stockTransferSettingsData, stockTransferSummary.stockTransferSettingsData) &&
        Objects.equals(this.stockTransferSharesData, stockTransferSummary.stockTransferSharesData) &&
        Objects.equals(this.stockTransferTransactionData, stockTransferSummary.stockTransferTransactionData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, stockTransferBasicData, stockTransferSettingsData, stockTransferSharesData, stockTransferTransactionData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockTransferSummary {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    stockTransferBasicData: ").append(toIndentedString(stockTransferBasicData)).append("\n");
    sb.append("    stockTransferSettingsData: ").append(toIndentedString(stockTransferSettingsData)).append("\n");
    sb.append("    stockTransferSharesData: ").append(toIndentedString(stockTransferSharesData)).append("\n");
    sb.append("    stockTransferTransactionData: ").append(toIndentedString(stockTransferTransactionData)).append("\n");
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

