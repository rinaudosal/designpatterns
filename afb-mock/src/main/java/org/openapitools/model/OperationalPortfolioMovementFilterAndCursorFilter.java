package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CursorFilter;
import org.openapitools.model.OperationalPortfolioMovementFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OperationalPortfolioMovementFilterAndCursorFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class OperationalPortfolioMovementFilterAndCursorFilter   {
  @JsonProperty("cursorFilter")
  private CursorFilter cursorFilter = null;

  @JsonProperty("operationalPortfolioMovementFilter")
  private OperationalPortfolioMovementFilter operationalPortfolioMovementFilter = null;

  public OperationalPortfolioMovementFilterAndCursorFilter cursorFilter(CursorFilter cursorFilter) {
    this.cursorFilter = cursorFilter;
    return this;
  }

  /**
   * Get cursorFilter
   * @return cursorFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CursorFilter getCursorFilter() {
    return cursorFilter;
  }

  public void setCursorFilter(CursorFilter cursorFilter) {
    this.cursorFilter = cursorFilter;
  }

  public OperationalPortfolioMovementFilterAndCursorFilter operationalPortfolioMovementFilter(OperationalPortfolioMovementFilter operationalPortfolioMovementFilter) {
    this.operationalPortfolioMovementFilter = operationalPortfolioMovementFilter;
    return this;
  }

  /**
   * Get operationalPortfolioMovementFilter
   * @return operationalPortfolioMovementFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OperationalPortfolioMovementFilter getOperationalPortfolioMovementFilter() {
    return operationalPortfolioMovementFilter;
  }

  public void setOperationalPortfolioMovementFilter(OperationalPortfolioMovementFilter operationalPortfolioMovementFilter) {
    this.operationalPortfolioMovementFilter = operationalPortfolioMovementFilter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationalPortfolioMovementFilterAndCursorFilter operationalPortfolioMovementFilterAndCursorFilter = (OperationalPortfolioMovementFilterAndCursorFilter) o;
    return Objects.equals(this.cursorFilter, operationalPortfolioMovementFilterAndCursorFilter.cursorFilter) &&
        Objects.equals(this.operationalPortfolioMovementFilter, operationalPortfolioMovementFilterAndCursorFilter.operationalPortfolioMovementFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursorFilter, operationalPortfolioMovementFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationalPortfolioMovementFilterAndCursorFilter {\n");
    
    sb.append("    cursorFilter: ").append(toIndentedString(cursorFilter)).append("\n");
    sb.append("    operationalPortfolioMovementFilter: ").append(toIndentedString(operationalPortfolioMovementFilter)).append("\n");
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

