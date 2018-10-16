package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This object keeps specific information about {Operation} associated with Italian Retail Market entities
 */
@ApiModel(description = "This object keeps specific information about {Operation} associated with Italian Retail Market entities")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class OperationItalianRetailMarketData   {
  @JsonProperty("fiscalAccruedIncome")
  private Double fiscalAccruedIncome = null;

  @JsonProperty("fiscalShares")
  private Double fiscalShares = null;

  @JsonProperty("weightedAverageCost")
  private Double weightedAverageCost = null;

  @JsonProperty("weightedAveragePrice")
  private Double weightedAveragePrice = null;

  public OperationItalianRetailMarketData fiscalAccruedIncome(Double fiscalAccruedIncome) {
    this.fiscalAccruedIncome = fiscalAccruedIncome;
    return this;
  }

  /**
   * fiscal accrued income amount. Expressed in {Operation.currencyCode}
   * @return fiscalAccruedIncome
  **/
  @ApiModelProperty(value = "fiscal accrued income amount. Expressed in {Operation.currencyCode}")


  public Double getFiscalAccruedIncome() {
    return fiscalAccruedIncome;
  }

  public void setFiscalAccruedIncome(Double fiscalAccruedIncome) {
    this.fiscalAccruedIncome = fiscalAccruedIncome;
  }

  public OperationItalianRetailMarketData fiscalShares(Double fiscalShares) {
    this.fiscalShares = fiscalShares;
    return this;
  }

  /**
   * fiscal shares
   * @return fiscalShares
  **/
  @ApiModelProperty(value = "fiscal shares")


  public Double getFiscalShares() {
    return fiscalShares;
  }

  public void setFiscalShares(Double fiscalShares) {
    this.fiscalShares = fiscalShares;
  }

  public OperationItalianRetailMarketData weightedAverageCost(Double weightedAverageCost) {
    this.weightedAverageCost = weightedAverageCost;
    return this;
  }

  /**
   * Weighted average cost. Expressed in {Operation.currencyCode}
   * @return weightedAverageCost
  **/
  @ApiModelProperty(value = "Weighted average cost. Expressed in {Operation.currencyCode}")


  public Double getWeightedAverageCost() {
    return weightedAverageCost;
  }

  public void setWeightedAverageCost(Double weightedAverageCost) {
    this.weightedAverageCost = weightedAverageCost;
  }

  public OperationItalianRetailMarketData weightedAveragePrice(Double weightedAveragePrice) {
    this.weightedAveragePrice = weightedAveragePrice;
    return this;
  }

  /**
   * Weighted average price. Expressed in {Operation.currencyCode}
   * @return weightedAveragePrice
  **/
  @ApiModelProperty(value = "Weighted average price. Expressed in {Operation.currencyCode}")


  public Double getWeightedAveragePrice() {
    return weightedAveragePrice;
  }

  public void setWeightedAveragePrice(Double weightedAveragePrice) {
    this.weightedAveragePrice = weightedAveragePrice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationItalianRetailMarketData operationItalianRetailMarketData = (OperationItalianRetailMarketData) o;
    return Objects.equals(this.fiscalAccruedIncome, operationItalianRetailMarketData.fiscalAccruedIncome) &&
        Objects.equals(this.fiscalShares, operationItalianRetailMarketData.fiscalShares) &&
        Objects.equals(this.weightedAverageCost, operationItalianRetailMarketData.weightedAverageCost) &&
        Objects.equals(this.weightedAveragePrice, operationItalianRetailMarketData.weightedAveragePrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fiscalAccruedIncome, fiscalShares, weightedAverageCost, weightedAveragePrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationItalianRetailMarketData {\n");
    
    sb.append("    fiscalAccruedIncome: ").append(toIndentedString(fiscalAccruedIncome)).append("\n");
    sb.append("    fiscalShares: ").append(toIndentedString(fiscalShares)).append("\n");
    sb.append("    weightedAverageCost: ").append(toIndentedString(weightedAverageCost)).append("\n");
    sb.append("    weightedAveragePrice: ").append(toIndentedString(weightedAveragePrice)).append("\n");
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

