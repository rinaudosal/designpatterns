package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.CashTransaction;
import org.openapitools.model.Page;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CashTransactionAndPage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class CashTransactionAndPage   {
  @JsonProperty("page")
  private Page page = null;

  @JsonProperty("transactions")
  @Valid
  private List<CashTransaction> transactions = null;

  public CashTransactionAndPage page(Page page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   * @return page
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Page getPage() {
    return page;
  }

  public void setPage(Page page) {
    this.page = page;
  }

  public CashTransactionAndPage transactions(List<CashTransaction> transactions) {
    this.transactions = transactions;
    return this;
  }

  public CashTransactionAndPage addTransactionsItem(CashTransaction transactionsItem) {
    if (this.transactions == null) {
      this.transactions = new ArrayList<>();
    }
    this.transactions.add(transactionsItem);
    return this;
  }

  /**
   * Get transactions
   * @return transactions
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<CashTransaction> getTransactions() {
    return transactions;
  }

  public void setTransactions(List<CashTransaction> transactions) {
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
    CashTransactionAndPage cashTransactionAndPage = (CashTransactionAndPage) o;
    return Objects.equals(this.page, cashTransactionAndPage.page) &&
        Objects.equals(this.transactions, cashTransactionAndPage.transactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, transactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashTransactionAndPage {\n");
    
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
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

