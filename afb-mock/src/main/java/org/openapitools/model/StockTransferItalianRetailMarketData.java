package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This object keeps information about Italian Retail Market specific data related to the {StockTransfer}.
 */
@ApiModel(description = "This object keeps information about Italian Retail Market specific data related to the {StockTransfer}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class StockTransferItalianRetailMarketData   {
  @JsonProperty("weightedAverageCost")
  private Double weightedAverageCost = null;

  @JsonProperty("weightedAveragePrice")
  private Double weightedAveragePrice = null;

  @JsonProperty("withheldAmount")
  private Double withheldAmount = null;

  public StockTransferItalianRetailMarketData weightedAverageCost(Double weightedAverageCost) {
    this.weightedAverageCost = weightedAverageCost;
    return this;
  }

  /**
   * Weighted average cost. Expressed in {StockTransfer.currencyCode}
   * @return weightedAverageCost
  **/
  @ApiModelProperty(value = "Weighted average cost. Expressed in {StockTransfer.currencyCode}")


  public Double getWeightedAverageCost() {
    return weightedAverageCost;
  }

  public void setWeightedAverageCost(Double weightedAverageCost) {
    this.weightedAverageCost = weightedAverageCost;
  }

  public StockTransferItalianRetailMarketData weightedAveragePrice(Double weightedAveragePrice) {
    this.weightedAveragePrice = weightedAveragePrice;
    return this;
  }

  /**
   * Weighted average price. Expressed in {StockTransfer.currencyCode}
   * @return weightedAveragePrice
  **/
  @ApiModelProperty(value = "Weighted average price. Expressed in {StockTransfer.currencyCode}")


  public Double getWeightedAveragePrice() {
    return weightedAveragePrice;
  }

  public void setWeightedAveragePrice(Double weightedAveragePrice) {
    this.weightedAveragePrice = weightedAveragePrice;
  }

  public StockTransferItalianRetailMarketData withheldAmount(Double withheldAmount) {
    this.withheldAmount = withheldAmount;
    return this;
  }

  /**
   * Withheld amount expressed in {StockTransfer.currencyCode}
   * @return withheldAmount
  **/
  @ApiModelProperty(value = "Withheld amount expressed in {StockTransfer.currencyCode}")


  public Double getWithheldAmount() {
    return withheldAmount;
  }

  public void setWithheldAmount(Double withheldAmount) {
    this.withheldAmount = withheldAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StockTransferItalianRetailMarketData stockTransferItalianRetailMarketData = (StockTransferItalianRetailMarketData) o;
    return Objects.equals(this.weightedAverageCost, stockTransferItalianRetailMarketData.weightedAverageCost) &&
        Objects.equals(this.weightedAveragePrice, stockTransferItalianRetailMarketData.weightedAveragePrice) &&
        Objects.equals(this.withheldAmount, stockTransferItalianRetailMarketData.withheldAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(weightedAverageCost, weightedAveragePrice, withheldAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockTransferItalianRetailMarketData {\n");
    
    sb.append("    weightedAverageCost: ").append(toIndentedString(weightedAverageCost)).append("\n");
    sb.append("    weightedAveragePrice: ").append(toIndentedString(weightedAveragePrice)).append("\n");
    sb.append("    withheldAmount: ").append(toIndentedString(withheldAmount)).append("\n");
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

