package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Page;
import org.openapitools.model.SpanishTransferStatusChange;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SpanishTransferHistoryAndPage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SpanishTransferHistoryAndPage   {
  @JsonProperty("history")
  @Valid
  private List<SpanishTransferStatusChange> history = null;

  @JsonProperty("page")
  private Page page = null;

  public SpanishTransferHistoryAndPage history(List<SpanishTransferStatusChange> history) {
    this.history = history;
    return this;
  }

  public SpanishTransferHistoryAndPage addHistoryItem(SpanishTransferStatusChange historyItem) {
    if (this.history == null) {
      this.history = new ArrayList<>();
    }
    this.history.add(historyItem);
    return this;
  }

  /**
   * Get history
   * @return history
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<SpanishTransferStatusChange> getHistory() {
    return history;
  }

  public void setHistory(List<SpanishTransferStatusChange> history) {
    this.history = history;
  }

  public SpanishTransferHistoryAndPage page(Page page) {
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
    SpanishTransferHistoryAndPage spanishTransferHistoryAndPage = (SpanishTransferHistoryAndPage) o;
    return Objects.equals(this.history, spanishTransferHistoryAndPage.history) &&
        Objects.equals(this.page, spanishTransferHistoryAndPage.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(history, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpanishTransferHistoryAndPage {\n");
    
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

