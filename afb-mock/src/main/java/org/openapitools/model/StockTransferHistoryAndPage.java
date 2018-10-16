package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Page;
import org.openapitools.model.StockTransferStatusChange;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {StockTransferStatusChange} and a {Page}.
 */
@ApiModel(description = "A simple object composed of an array of {StockTransferStatusChange} and a {Page}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class StockTransferHistoryAndPage   {
  @JsonProperty("history")
  @Valid
  private List<StockTransferStatusChange> history = null;

  @JsonProperty("page")
  private Page page = null;

  public StockTransferHistoryAndPage history(List<StockTransferStatusChange> history) {
    this.history = history;
    return this;
  }

  public StockTransferHistoryAndPage addHistoryItem(StockTransferStatusChange historyItem) {
    if (this.history == null) {
      this.history = new ArrayList<>();
    }
    this.history.add(historyItem);
    return this;
  }

  /**
   * The array of {StockTransferStatusChange}
   * @return history
  **/
  @ApiModelProperty(value = "The array of {StockTransferStatusChange}")

  @Valid

  public List<StockTransferStatusChange> getHistory() {
    return history;
  }

  public void setHistory(List<StockTransferStatusChange> history) {
    this.history = history;
  }

  public StockTransferHistoryAndPage page(Page page) {
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
    StockTransferHistoryAndPage stockTransferHistoryAndPage = (StockTransferHistoryAndPage) o;
    return Objects.equals(this.history, stockTransferHistoryAndPage.history) &&
        Objects.equals(this.page, stockTransferHistoryAndPage.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(history, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockTransferHistoryAndPage {\n");
    
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

