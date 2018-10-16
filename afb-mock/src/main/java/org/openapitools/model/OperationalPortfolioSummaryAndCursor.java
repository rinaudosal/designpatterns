package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Cursor;
import org.openapitools.model.OperationalPortfolioSummary;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {OperationalPortfolioSummary} and {Cursor}.
 */
@ApiModel(description = "A simple object composed of an array of {OperationalPortfolioSummary} and {Cursor}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class OperationalPortfolioSummaryAndCursor   {
  @JsonProperty("cursor")
  private Cursor cursor = null;

  @JsonProperty("operationalPortfolioSummaries")
  @Valid
  private List<OperationalPortfolioSummary> operationalPortfolioSummaries = null;

  public OperationalPortfolioSummaryAndCursor cursor(Cursor cursor) {
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

  public OperationalPortfolioSummaryAndCursor operationalPortfolioSummaries(List<OperationalPortfolioSummary> operationalPortfolioSummaries) {
    this.operationalPortfolioSummaries = operationalPortfolioSummaries;
    return this;
  }

  public OperationalPortfolioSummaryAndCursor addOperationalPortfolioSummariesItem(OperationalPortfolioSummary operationalPortfolioSummariesItem) {
    if (this.operationalPortfolioSummaries == null) {
      this.operationalPortfolioSummaries = new ArrayList<>();
    }
    this.operationalPortfolioSummaries.add(operationalPortfolioSummariesItem);
    return this;
  }

  /**
   * The array of {OperationalPortfolioSummary}
   * @return operationalPortfolioSummaries
  **/
  @ApiModelProperty(value = "The array of {OperationalPortfolioSummary}")

  @Valid

  public List<OperationalPortfolioSummary> getOperationalPortfolioSummaries() {
    return operationalPortfolioSummaries;
  }

  public void setOperationalPortfolioSummaries(List<OperationalPortfolioSummary> operationalPortfolioSummaries) {
    this.operationalPortfolioSummaries = operationalPortfolioSummaries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationalPortfolioSummaryAndCursor operationalPortfolioSummaryAndCursor = (OperationalPortfolioSummaryAndCursor) o;
    return Objects.equals(this.cursor, operationalPortfolioSummaryAndCursor.cursor) &&
        Objects.equals(this.operationalPortfolioSummaries, operationalPortfolioSummaryAndCursor.operationalPortfolioSummaries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursor, operationalPortfolioSummaries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationalPortfolioSummaryAndCursor {\n");
    
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    operationalPortfolioSummaries: ").append(toIndentedString(operationalPortfolioSummaries)).append("\n");
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

