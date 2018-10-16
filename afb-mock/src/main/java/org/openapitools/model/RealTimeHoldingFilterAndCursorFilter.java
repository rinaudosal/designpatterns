package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CursorFilter;
import org.openapitools.model.RealTimeHoldingFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Defines the search criteria to obtain the valuations of the fund positions.
 */
@ApiModel(description = "Defines the search criteria to obtain the valuations of the fund positions.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class RealTimeHoldingFilterAndCursorFilter   {
  @JsonProperty("cursorFilter")
  private CursorFilter cursorFilter = null;

  @JsonProperty("realTimeHoldingFilter")
  private RealTimeHoldingFilter realTimeHoldingFilter = null;

  public RealTimeHoldingFilterAndCursorFilter cursorFilter(CursorFilter cursorFilter) {
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

  public RealTimeHoldingFilterAndCursorFilter realTimeHoldingFilter(RealTimeHoldingFilter realTimeHoldingFilter) {
    this.realTimeHoldingFilter = realTimeHoldingFilter;
    return this;
  }

  /**
   * Get realTimeHoldingFilter
   * @return realTimeHoldingFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RealTimeHoldingFilter getRealTimeHoldingFilter() {
    return realTimeHoldingFilter;
  }

  public void setRealTimeHoldingFilter(RealTimeHoldingFilter realTimeHoldingFilter) {
    this.realTimeHoldingFilter = realTimeHoldingFilter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealTimeHoldingFilterAndCursorFilter realTimeHoldingFilterAndCursorFilter = (RealTimeHoldingFilterAndCursorFilter) o;
    return Objects.equals(this.cursorFilter, realTimeHoldingFilterAndCursorFilter.cursorFilter) &&
        Objects.equals(this.realTimeHoldingFilter, realTimeHoldingFilterAndCursorFilter.realTimeHoldingFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursorFilter, realTimeHoldingFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealTimeHoldingFilterAndCursorFilter {\n");
    
    sb.append("    cursorFilter: ").append(toIndentedString(cursorFilter)).append("\n");
    sb.append("    realTimeHoldingFilter: ").append(toIndentedString(realTimeHoldingFilter)).append("\n");
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

