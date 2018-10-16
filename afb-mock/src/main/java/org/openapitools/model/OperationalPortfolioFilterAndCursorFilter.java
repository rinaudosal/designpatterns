package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CursorFilter;
import org.openapitools.model.OperationalPortfolioFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of either a {RiskControlAlarmFilter} and a {CursorFilter}.
 */
@ApiModel(description = "A simple object composed of either a {RiskControlAlarmFilter} and a {CursorFilter}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class OperationalPortfolioFilterAndCursorFilter   {
  @JsonProperty("cursorFilter")
  private CursorFilter cursorFilter = null;

  @JsonProperty("operationalPortfolioFilter")
  private OperationalPortfolioFilter operationalPortfolioFilter = null;

  public OperationalPortfolioFilterAndCursorFilter cursorFilter(CursorFilter cursorFilter) {
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

  public OperationalPortfolioFilterAndCursorFilter operationalPortfolioFilter(OperationalPortfolioFilter operationalPortfolioFilter) {
    this.operationalPortfolioFilter = operationalPortfolioFilter;
    return this;
  }

  /**
   * Get operationalPortfolioFilter
   * @return operationalPortfolioFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OperationalPortfolioFilter getOperationalPortfolioFilter() {
    return operationalPortfolioFilter;
  }

  public void setOperationalPortfolioFilter(OperationalPortfolioFilter operationalPortfolioFilter) {
    this.operationalPortfolioFilter = operationalPortfolioFilter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationalPortfolioFilterAndCursorFilter operationalPortfolioFilterAndCursorFilter = (OperationalPortfolioFilterAndCursorFilter) o;
    return Objects.equals(this.cursorFilter, operationalPortfolioFilterAndCursorFilter.cursorFilter) &&
        Objects.equals(this.operationalPortfolioFilter, operationalPortfolioFilterAndCursorFilter.operationalPortfolioFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursorFilter, operationalPortfolioFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationalPortfolioFilterAndCursorFilter {\n");
    
    sb.append("    cursorFilter: ").append(toIndentedString(cursorFilter)).append("\n");
    sb.append("    operationalPortfolioFilter: ").append(toIndentedString(operationalPortfolioFilter)).append("\n");
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

