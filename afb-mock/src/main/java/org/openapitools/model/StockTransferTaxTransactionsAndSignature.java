package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Signature;
import org.openapitools.model.StockTransferTaxTransactions;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StockTransferTaxTransactionsAndSignature
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class StockTransferTaxTransactionsAndSignature   {
  @JsonProperty("signature")
  private Signature signature = null;

  @JsonProperty("stockTransferTaxTransactions")
  private StockTransferTaxTransactions stockTransferTaxTransactions = null;

  public StockTransferTaxTransactionsAndSignature signature(Signature signature) {
    this.signature = signature;
    return this;
  }

  /**
   * Get signature
   * @return signature
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Signature getSignature() {
    return signature;
  }

  public void setSignature(Signature signature) {
    this.signature = signature;
  }

  public StockTransferTaxTransactionsAndSignature stockTransferTaxTransactions(StockTransferTaxTransactions stockTransferTaxTransactions) {
    this.stockTransferTaxTransactions = stockTransferTaxTransactions;
    return this;
  }

  /**
   * Get stockTransferTaxTransactions
   * @return stockTransferTaxTransactions
  **/
  @ApiModelProperty(value = "")

  @Valid

  public StockTransferTaxTransactions getStockTransferTaxTransactions() {
    return stockTransferTaxTransactions;
  }

  public void setStockTransferTaxTransactions(StockTransferTaxTransactions stockTransferTaxTransactions) {
    this.stockTransferTaxTransactions = stockTransferTaxTransactions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StockTransferTaxTransactionsAndSignature stockTransferTaxTransactionsAndSignature = (StockTransferTaxTransactionsAndSignature) o;
    return Objects.equals(this.signature, stockTransferTaxTransactionsAndSignature.signature) &&
        Objects.equals(this.stockTransferTaxTransactions, stockTransferTaxTransactionsAndSignature.stockTransferTaxTransactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signature, stockTransferTaxTransactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockTransferTaxTransactionsAndSignature {\n");
    
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    stockTransferTaxTransactions: ").append(toIndentedString(stockTransferTaxTransactions)).append("\n");
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

