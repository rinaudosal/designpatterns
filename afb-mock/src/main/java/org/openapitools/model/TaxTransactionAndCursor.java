package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Cursor;
import org.openapitools.model.TaxTransaction;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {TaxTransaction} and a {Cursor}.
 */
@ApiModel(description = "A simple object composed of an array of {TaxTransaction} and a {Cursor}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class TaxTransactionAndCursor   {
  @JsonProperty("cursor")
  private Cursor cursor = null;

  @JsonProperty("taxTransactions")
  @Valid
  private List<TaxTransaction> taxTransactions = null;

  public TaxTransactionAndCursor cursor(Cursor cursor) {
    this.cursor = cursor;
    return this;
  }

  /**
   * Get cursor
   * @return cursor
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Cursor getCursor() {
    return cursor;
  }

  public void setCursor(Cursor cursor) {
    this.cursor = cursor;
  }

  public TaxTransactionAndCursor taxTransactions(List<TaxTransaction> taxTransactions) {
    this.taxTransactions = taxTransactions;
    return this;
  }

  public TaxTransactionAndCursor addTaxTransactionsItem(TaxTransaction taxTransactionsItem) {
    if (this.taxTransactions == null) {
      this.taxTransactions = new ArrayList<>();
    }
    this.taxTransactions.add(taxTransactionsItem);
    return this;
  }

  /**
   * The array of {TaxTransaction}
   * @return taxTransactions
  **/
  @ApiModelProperty(value = "The array of {TaxTransaction}")

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
    TaxTransactionAndCursor taxTransactionAndCursor = (TaxTransactionAndCursor) o;
    return Objects.equals(this.cursor, taxTransactionAndCursor.cursor) &&
        Objects.equals(this.taxTransactions, taxTransactionAndCursor.taxTransactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursor, taxTransactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxTransactionAndCursor {\n");
    
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
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

