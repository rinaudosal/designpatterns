package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Cursor;
import org.openapitools.model.OperationalPortfolioComposition;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {OperationalPortfolioComposition} and a {Cursor}.
 */
@ApiModel(description = "A simple object composed of an array of {OperationalPortfolioComposition} and a {Cursor}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class OperationalPortfolioCompositionAndCursor   {
  @JsonProperty("cursor")
  private Cursor cursor = null;

  @JsonProperty("operationalPortfolioCompositions")
  @Valid
  private List<OperationalPortfolioComposition> operationalPortfolioCompositions = null;

  public OperationalPortfolioCompositionAndCursor cursor(Cursor cursor) {
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

  public OperationalPortfolioCompositionAndCursor operationalPortfolioCompositions(List<OperationalPortfolioComposition> operationalPortfolioCompositions) {
    this.operationalPortfolioCompositions = operationalPortfolioCompositions;
    return this;
  }

  public OperationalPortfolioCompositionAndCursor addOperationalPortfolioCompositionsItem(OperationalPortfolioComposition operationalPortfolioCompositionsItem) {
    if (this.operationalPortfolioCompositions == null) {
      this.operationalPortfolioCompositions = new ArrayList<>();
    }
    this.operationalPortfolioCompositions.add(operationalPortfolioCompositionsItem);
    return this;
  }

  /**
   * The array of {OperationalPortfolioComposition}
   * @return operationalPortfolioCompositions
  **/
  @ApiModelProperty(value = "The array of {OperationalPortfolioComposition}")

  @Valid

  public List<OperationalPortfolioComposition> getOperationalPortfolioCompositions() {
    return operationalPortfolioCompositions;
  }

  public void setOperationalPortfolioCompositions(List<OperationalPortfolioComposition> operationalPortfolioCompositions) {
    this.operationalPortfolioCompositions = operationalPortfolioCompositions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationalPortfolioCompositionAndCursor operationalPortfolioCompositionAndCursor = (OperationalPortfolioCompositionAndCursor) o;
    return Objects.equals(this.cursor, operationalPortfolioCompositionAndCursor.cursor) &&
        Objects.equals(this.operationalPortfolioCompositions, operationalPortfolioCompositionAndCursor.operationalPortfolioCompositions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursor, operationalPortfolioCompositions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationalPortfolioCompositionAndCursor {\n");
    
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    operationalPortfolioCompositions: ").append(toIndentedString(operationalPortfolioCompositions)).append("\n");
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

