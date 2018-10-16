package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.TaxTransaction;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StockTransferTaxTransactions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class StockTransferTaxTransactions   {
  @JsonProperty("currencyCode")
  private String currencyCode = null;

  @JsonProperty("feeDate")
  private OffsetDateTime feeDate = null;

  @JsonProperty("taxTransactions")
  @Valid
  private List<TaxTransaction> taxTransactions = null;

  public StockTransferTaxTransactions currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * The currency code associated to all {TaxTransaction}s ot the {StockTransfer}. Refer to {listCurrencies}
   * @return currencyCode
  **/
  @ApiModelProperty(value = "The currency code associated to all {TaxTransaction}s ot the {StockTransfer}. Refer to {listCurrencies}")


  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public StockTransferTaxTransactions feeDate(OffsetDateTime feeDate) {
    this.feeDate = feeDate;
    return this;
  }

  /**
   * The fee date associated to all {TaxTransaction}s ot the {StockTransfer}.
   * @return feeDate
  **/
  @ApiModelProperty(value = "The fee date associated to all {TaxTransaction}s ot the {StockTransfer}.")

  @Valid

  public OffsetDateTime getFeeDate() {
    return feeDate;
  }

  public void setFeeDate(OffsetDateTime feeDate) {
    this.feeDate = feeDate;
  }

  public StockTransferTaxTransactions taxTransactions(List<TaxTransaction> taxTransactions) {
    this.taxTransactions = taxTransactions;
    return this;
  }

  public StockTransferTaxTransactions addTaxTransactionsItem(TaxTransaction taxTransactionsItem) {
    if (this.taxTransactions == null) {
      this.taxTransactions = new ArrayList<>();
    }
    this.taxTransactions.add(taxTransactionsItem);
    return this;
  }

  /**
   * Get taxTransactions
   * @return taxTransactions
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<TaxTransaction> getTaxTransactions() {
    return taxTransactions;
  }

  public void setTaxTransactions(List<TaxTransaction> taxTransactions) {
    this.taxTransactions = taxTransactions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StockTransferTaxTransactions stockTransferTaxTransactions = (StockTransferTaxTransactions) o;
    return Objects.equals(this.currencyCode, stockTransferTaxTransactions.currencyCode) &&
        Objects.equals(this.feeDate, stockTransferTaxTransactions.feeDate) &&
        Objects.equals(this.taxTransactions, stockTransferTaxTransactions.taxTransactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, feeDate, taxTransactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockTransferTaxTransactions {\n");
    
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    feeDate: ").append(toIndentedString(feeDate)).append("\n");
    sb.append("    taxTransactions: ").append(toIndentedString(taxTransactions)).append("\n");
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

