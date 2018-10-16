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
 * This object keeps specific information about transactions associated with Italian Retail Market entities
 */
@ApiModel(description = "This object keeps specific information about transactions associated with Italian Retail Market entities")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class TransactionItalianRetailMarketData   {
  @JsonProperty("confirmationLetter")
  private Boolean confirmationLetter = null;

  /**
   * defines fee charge type between \"FRONTLOAD\", \"BACKLOAD\"
   */
  public enum FeeChargeOptionEnum {
    FRONTLOAD("FRONTLOAD"),
    
    BACKLOAD("BACKLOAD");

    private String value;

    FeeChargeOptionEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FeeChargeOptionEnum fromValue(String text) {
      for (FeeChargeOptionEnum b : FeeChargeOptionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("feeChargeOption")
  private FeeChargeOptionEnum feeChargeOption = null;

  @JsonProperty("fiscalAccruedIncome")
  private Double fiscalAccruedIncome = null;

  @JsonProperty("fiscalShares")
  private Double fiscalShares = null;

  @JsonProperty("reductionFeePercentage")
  private Double reductionFeePercentage = null;

  @JsonProperty("weightedAverageCost")
  private Double weightedAverageCost = null;

  @JsonProperty("weightedAveragePrice")
  private Double weightedAveragePrice = null;

  public TransactionItalianRetailMarketData confirmationLetter(Boolean confirmationLetter) {
    this.confirmationLetter = confirmationLetter;
    return this;
  }

  /**
   * Indicates whether the transaction has an associated \"Confirmation Letter\", which was sent by post
   * @return confirmationLetter
  **/
  @ApiModelProperty(value = "Indicates whether the transaction has an associated \"Confirmation Letter\", which was sent by post")


  public Boolean getConfirmationLetter() {
    return confirmationLetter;
  }

  public void setConfirmationLetter(Boolean confirmationLetter) {
    this.confirmationLetter = confirmationLetter;
  }

  public TransactionItalianRetailMarketData feeChargeOption(FeeChargeOptionEnum feeChargeOption) {
    this.feeChargeOption = feeChargeOption;
    return this;
  }

  /**
   * defines fee charge type between \"FRONTLOAD\", \"BACKLOAD\"
   * @return feeChargeOption
  **/
  @ApiModelProperty(value = "defines fee charge type between \"FRONTLOAD\", \"BACKLOAD\"")


  public FeeChargeOptionEnum getFeeChargeOption() {
    return feeChargeOption;
  }

  public void setFeeChargeOption(FeeChargeOptionEnum feeChargeOption) {
    this.feeChargeOption = feeChargeOption;
  }

  public TransactionItalianRetailMarketData fiscalAccruedIncome(Double fiscalAccruedIncome) {
    this.fiscalAccruedIncome = fiscalAccruedIncome;
    return this;
  }

  /**
   * fiscal accrued income amount. Expressed in {Transaction.currencyCode}
   * @return fiscalAccruedIncome
  **/
  @ApiModelProperty(value = "fiscal accrued income amount. Expressed in {Transaction.currencyCode}")


  public Double getFiscalAccruedIncome() {
    return fiscalAccruedIncome;
  }

  public void setFiscalAccruedIncome(Double fiscalAccruedIncome) {
    this.fiscalAccruedIncome = fiscalAccruedIncome;
  }

  public TransactionItalianRetailMarketData fiscalShares(Double fiscalShares) {
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

  public TransactionItalianRetailMarketData reductionFeePercentage(Double reductionFeePercentage) {
    this.reductionFeePercentage = reductionFeePercentage;
    return this;
  }

  /**
   * Percentage of reduction applied to the fee amount.
   * @return reductionFeePercentage
  **/
  @ApiModelProperty(value = "Percentage of reduction applied to the fee amount.")


  public Double getReductionFeePercentage() {
    return reductionFeePercentage;
  }

  public void setReductionFeePercentage(Double reductionFeePercentage) {
    this.reductionFeePercentage = reductionFeePercentage;
  }

  public TransactionItalianRetailMarketData weightedAverageCost(Double weightedAverageCost) {
    this.weightedAverageCost = weightedAverageCost;
    return this;
  }

  /**
   * Weighted average cost. Expressed in {Transaction.currencyCode}
   * @return weightedAverageCost
  **/
  @ApiModelProperty(value = "Weighted average cost. Expressed in {Transaction.currencyCode}")


  public Double getWeightedAverageCost() {
    return weightedAverageCost;
  }

  public void setWeightedAverageCost(Double weightedAverageCost) {
    this.weightedAverageCost = weightedAverageCost;
  }

  public TransactionItalianRetailMarketData weightedAveragePrice(Double weightedAveragePrice) {
    this.weightedAveragePrice = weightedAveragePrice;
    return this;
  }

  /**
   * Weighted average price. Expressed in {Transaction.currencyCode}
   * @return weightedAveragePrice
  **/
  @ApiModelProperty(value = "Weighted average price. Expressed in {Transaction.currencyCode}")


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
    TransactionItalianRetailMarketData transactionItalianRetailMarketData = (TransactionItalianRetailMarketData) o;
    return Objects.equals(this.confirmationLetter, transactionItalianRetailMarketData.confirmationLetter) &&
        Objects.equals(this.feeChargeOption, transactionItalianRetailMarketData.feeChargeOption) &&
        Objects.equals(this.fiscalAccruedIncome, transactionItalianRetailMarketData.fiscalAccruedIncome) &&
        Objects.equals(this.fiscalShares, transactionItalianRetailMarketData.fiscalShares) &&
        Objects.equals(this.reductionFeePercentage, transactionItalianRetailMarketData.reductionFeePercentage) &&
        Objects.equals(this.weightedAverageCost, transactionItalianRetailMarketData.weightedAverageCost) &&
        Objects.equals(this.weightedAveragePrice, transactionItalianRetailMarketData.weightedAveragePrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confirmationLetter, feeChargeOption, fiscalAccruedIncome, fiscalShares, reductionFeePercentage, weightedAverageCost, weightedAveragePrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionItalianRetailMarketData {\n");
    
    sb.append("    confirmationLetter: ").append(toIndentedString(confirmationLetter)).append("\n");
    sb.append("    feeChargeOption: ").append(toIndentedString(feeChargeOption)).append("\n");
    sb.append("    fiscalAccruedIncome: ").append(toIndentedString(fiscalAccruedIncome)).append("\n");
    sb.append("    fiscalShares: ").append(toIndentedString(fiscalShares)).append("\n");
    sb.append("    reductionFeePercentage: ").append(toIndentedString(reductionFeePercentage)).append("\n");
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

