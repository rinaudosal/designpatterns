package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Cursor;
import org.openapitools.model.HaltedTransaction;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {HaltedTransaction} and a {Cursor}.
 */
@ApiModel(description = "A simple object composed of an array of {HaltedTransaction} and a {Cursor}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class HaltedTransactionAndCursor   {
  @JsonProperty("cursor")
  private Cursor cursor = null;

  @JsonProperty("transactions")
  @Valid
  private List<HaltedTransaction> transactions = null;

  public HaltedTransactionAndCursor cursor(Cursor cursor) {
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

  public HaltedTransactionAndCursor transactions(List<HaltedTransaction> transactions) {
    this.transactions = transactions;
    return this;
  }

  public HaltedTransactionAndCursor addTransactionsItem(HaltedTransaction transactionsItem) {
    if (this.transactions == null) {
      this.transactions = new ArrayList<>();
    }
    this.transactions.add(transactionsItem);
    return this;
  }

  /**
   * The array of {HaltedTransaction}
   * @return transactions
  **/
  @ApiModelProperty(value = "The array of {HaltedTransaction}")

  @Valid

  public List<HaltedTransaction> getTransactions() {
    return transactions;
  }

  public void setTransactions(List<HaltedTransaction> transactions) {
    this.transactions = transactions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HaltedTransactionAndCursor haltedTransactionAndCursor = (HaltedTransactionAndCursor) o;
    return Objects.equals(this.cursor, haltedTransactionAndCursor.cursor) &&
        Objects.equals(this.transactions, haltedTransactionAndCursor.transactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursor, transactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HaltedTransactionAndCursor {\n");
    
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
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

