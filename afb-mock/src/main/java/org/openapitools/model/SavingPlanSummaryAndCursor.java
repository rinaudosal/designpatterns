package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Cursor;
import org.openapitools.model.SavingPlanSummary;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SavingPlanSummaryAndCursor
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SavingPlanSummaryAndCursor   {
  @JsonProperty("cursor")
  private Cursor cursor = null;

  @JsonProperty("savingPlanSummaries")
  @Valid
  private List<SavingPlanSummary> savingPlanSummaries = null;

  public SavingPlanSummaryAndCursor cursor(Cursor cursor) {
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

  public SavingPlanSummaryAndCursor savingPlanSummaries(List<SavingPlanSummary> savingPlanSummaries) {
    this.savingPlanSummaries = savingPlanSummaries;
    return this;
  }

  public SavingPlanSummaryAndCursor addSavingPlanSummariesItem(SavingPlanSummary savingPlanSummariesItem) {
    if (this.savingPlanSummaries == null) {
      this.savingPlanSummaries = new ArrayList<>();
    }
    this.savingPlanSummaries.add(savingPlanSummariesItem);
    return this;
  }

  /**
   * The array of {SavingPlanSummary}
   * @return savingPlanSummaries
  **/
  @ApiModelProperty(value = "The array of {SavingPlanSummary}")

  @Valid

  public List<SavingPlanSummary> getSavingPlanSummaries() {
    return savingPlanSummaries;
  }

  public void setSavingPlanSummaries(List<SavingPlanSummary> savingPlanSummaries) {
    this.savingPlanSummaries = savingPlanSummaries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SavingPlanSummaryAndCursor savingPlanSummaryAndCursor = (SavingPlanSummaryAndCursor) o;
    return Objects.equals(this.cursor, savingPlanSummaryAndCursor.cursor) &&
        Objects.equals(this.savingPlanSummaries, savingPlanSummaryAndCursor.savingPlanSummaries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursor, savingPlanSummaries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SavingPlanSummaryAndCursor {\n");
    
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    savingPlanSummaries: ").append(toIndentedString(savingPlanSummaries)).append("\n");
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

