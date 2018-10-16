package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Cursor;
import org.openapitools.model.StockTransferSummary;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StockTransferSummaryAndCursor
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class StockTransferSummaryAndCursor   {
  @JsonProperty("cursor")
  private Cursor cursor = null;

  @JsonProperty("summaries")
  @Valid
  private List<StockTransferSummary> summaries = null;

  public StockTransferSummaryAndCursor cursor(Cursor cursor) {
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

  public StockTransferSummaryAndCursor summaries(List<StockTransferSummary> summaries) {
    this.summaries = summaries;
    return this;
  }

  public StockTransferSummaryAndCursor addSummariesItem(StockTransferSummary summariesItem) {
    if (this.summaries == null) {
      this.summaries = new ArrayList<>();
    }
    this.summaries.add(summariesItem);
    return this;
  }

  /**
   * Get summaries
   * @return summaries
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<StockTransferSummary> getSummaries() {
    return summaries;
  }

  public void setSummaries(List<StockTransferSummary> summaries) {
    this.summaries = summaries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StockTransferSummaryAndCursor stockTransferSummaryAndCursor = (StockTransferSummaryAndCursor) o;
    return Objects.equals(this.cursor, stockTransferSummaryAndCursor.cursor) &&
        Objects.equals(this.summaries, stockTransferSummaryAndCursor.summaries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursor, summaries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockTransferSummaryAndCursor {\n");
    
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    summaries: ").append(toIndentedString(summaries)).append("\n");
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

