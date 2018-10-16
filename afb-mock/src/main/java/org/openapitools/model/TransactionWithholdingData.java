package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This object keeps specific information about withholdings applied in the transaction.
 */
@ApiModel(description = "This object keeps specific information about withholdings applied in the transaction.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class TransactionWithholdingData   {
  @JsonProperty("withheldAmount")
  private Double withheldAmount = null;

  @JsonProperty("withheldAmountInLocalCurrency")
  private Double withheldAmountInLocalCurrency = null;

  @JsonProperty("withholdingPercentage")
  private Double withholdingPercentage = null;

  public TransactionWithholdingData withheldAmount(Double withheldAmount) {
    this.withheldAmount = withheldAmount;
    return this;
  }

  /**
   * Withheld amount expressed in the {DealingInstrument} currency. Expressed in {Transaction.currencyCode}
   * @return withheldAmount
  **/
  @ApiModelProperty(value = "Withheld amount expressed in the {DealingInstrument} currency. Expressed in {Transaction.currencyCode}")


  public Double getWithheldAmount() {
    return withheldAmount;
  }

  public void setWithheldAmount(Double withheldAmount) {
    this.withheldAmount = withheldAmount;
  }

  public TransactionWithholdingData withheldAmountInLocalCurrency(Double withheldAmountInLocalCurrency) {
    this.withheldAmountInLocalCurrency = withheldAmountInLocalCurrency;
    return this;
  }

  /**
   * Withheld amount expressed in {Transaction.localCurrencyCode}
   * @return withheldAmountInLocalCurrency
  **/
  @ApiModelProperty(value = "Withheld amount expressed in {Transaction.localCurrencyCode}")


  public Double getWithheldAmountInLocalCurrency() {
    return withheldAmountInLocalCurrency;
  }

  public void setWithheldAmountInLocalCurrency(Double withheldAmountInLocalCurrency) {
    this.withheldAmountInLocalCurrency = withheldAmountInLocalCurrency;
  }

  public TransactionWithholdingData withholdingPercentage(Double withholdingPercentage) {
    this.withholdingPercentage = withholdingPercentage;
    return this;
  }

  /**
   * Withholding percentage
   * @return withholdingPercentage
  **/
  @ApiModelProperty(value = "Withholding percentage")


  public Double getWithholdingPercentage() {
    return withholdingPercentage;
  }

  public void setWithholdingPercentage(Double withholdingPercentage) {
    this.withholdingPercentage = withholdingPercentage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionWithholdingData transactionWithholdingData = (TransactionWithholdingData) o;
    return Objects.equals(this.withheldAmount, transactionWithholdingData.withheldAmount) &&
        Objects.equals(this.withheldAmountInLocalCurrency, transactionWithholdingData.withheldAmountInLocalCurrency) &&
        Objects.equals(this.withholdingPercentage, transactionWithholdingData.withholdingPercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(withheldAmount, withheldAmountInLocalCurrency, withholdingPercentage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionWithholdingData {\n");
    
    sb.append("    withheldAmount: ").append(toIndentedString(withheldAmount)).append("\n");
    sb.append("    withheldAmountInLocalCurrency: ").append(toIndentedString(withheldAmountInLocalCurrency)).append("\n");
    sb.append("    withholdingPercentage: ").append(toIndentedString(withholdingPercentage)).append("\n");
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

