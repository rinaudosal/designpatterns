package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Page;
import org.openapitools.model.TransactionStatusChange;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {TransactionStatusChange} and a {Page}.
 */
@ApiModel(description = "A simple object composed of an array of {TransactionStatusChange} and a {Page}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class TransactionHistoryAndPage   {
  @JsonProperty("history")
  @Valid
  private List<TransactionStatusChange> history = null;

  @JsonProperty("page")
  private Page page = null;

  public TransactionHistoryAndPage history(List<TransactionStatusChange> history) {
    this.history = history;
    return this;
  }

  public TransactionHistoryAndPage addHistoryItem(TransactionStatusChange historyItem) {
    if (this.history == null) {
      this.history = new ArrayList<>();
    }
    this.history.add(historyItem);
    return this;
  }

  /**
   * The array of {TransactionStatusChange}
   * @return history
  **/
  @ApiModelProperty(value = "The array of {TransactionStatusChange}")

  @Valid

  public List<TransactionStatusChange> getHistory() {
    return history;
  }

  public void setHistory(List<TransactionStatusChange> history) {
    this.history = history;
  }

  public TransactionHistoryAndPage page(Page page) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionHistoryAndPage transactionHistoryAndPage = (TransactionHistoryAndPage) o;
    return Objects.equals(this.history, transactionHistoryAndPage.history) &&
        Objects.equals(this.page, transactionHistoryAndPage.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(history, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionHistoryAndPage {\n");
    
    sb.append("    history: ").append(toIndentedString(history)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
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

