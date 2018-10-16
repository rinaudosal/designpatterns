package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Cursor;
import org.openapitools.model.OperationalPortfolioTransaction;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OperationalPortfolioTransactionAndCursor
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class OperationalPortfolioTransactionAndCursor   {
  @JsonProperty("cursor")
  private Cursor cursor = null;

  @JsonProperty("operationalPortfolioTransactions")
  @Valid
  private List<OperationalPortfolioTransaction> operationalPortfolioTransactions = null;

  public OperationalPortfolioTransactionAndCursor cursor(Cursor cursor) {
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

  public OperationalPortfolioTransactionAndCursor operationalPortfolioTransactions(List<OperationalPortfolioTransaction> operationalPortfolioTransactions) {
    this.operationalPortfolioTransactions = operationalPortfolioTransactions;
    return this;
  }

  public OperationalPortfolioTransactionAndCursor addOperationalPortfolioTransactionsItem(OperationalPortfolioTransaction operationalPortfolioTransactionsItem) {
    if (this.operationalPortfolioTransactions == null) {
      this.operationalPortfolioTransactions = new ArrayList<>();
    }
    this.operationalPortfolioTransactions.add(operationalPortfolioTransactionsItem);
    return this;
  }

  /**
   * Get operationalPortfolioTransactions
   * @return operationalPortfolioTransactions
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<OperationalPortfolioTransaction> getOperationalPortfolioTransactions() {
    return operationalPortfolioTransactions;
  }

  public void setOperationalPortfolioTransactions(List<OperationalPortfolioTransaction> operationalPortfolioTransactions) {
    this.operationalPortfolioTransactions = operationalPortfolioTransactions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationalPortfolioTransactionAndCursor operationalPortfolioTransactionAndCursor = (OperationalPortfolioTransactionAndCursor) o;
    return Objects.equals(this.cursor, operationalPortfolioTransactionAndCursor.cursor) &&
        Objects.equals(this.operationalPortfolioTransactions, operationalPortfolioTransactionAndCursor.operationalPortfolioTransactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursor, operationalPortfolioTransactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationalPortfolioTransactionAndCursor {\n");
    
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    operationalPortfolioTransactions: ").append(toIndentedString(operationalPortfolioTransactions)).append("\n");
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

