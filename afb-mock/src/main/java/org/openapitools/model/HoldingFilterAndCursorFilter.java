package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CursorFilter;
import org.openapitools.model.HoldingFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * HoldingFilterAndCursorFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class HoldingFilterAndCursorFilter   {
  @JsonProperty("cursorFilter")
  private CursorFilter cursorFilter = null;

  @JsonProperty("holdingFilter")
  private HoldingFilter holdingFilter = null;

  public HoldingFilterAndCursorFilter cursorFilter(CursorFilter cursorFilter) {
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

  public HoldingFilterAndCursorFilter holdingFilter(HoldingFilter holdingFilter) {
    this.holdingFilter = holdingFilter;
    return this;
  }

  /**
   * Get holdingFilter
   * @return holdingFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public HoldingFilter getHoldingFilter() {
    return holdingFilter;
  }

  public void setHoldingFilter(HoldingFilter holdingFilter) {
    this.holdingFilter = holdingFilter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HoldingFilterAndCursorFilter holdingFilterAndCursorFilter = (HoldingFilterAndCursorFilter) o;
    return Objects.equals(this.cursorFilter, holdingFilterAndCursorFilter.cursorFilter) &&
        Objects.equals(this.holdingFilter, holdingFilterAndCursorFilter.holdingFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursorFilter, holdingFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HoldingFilterAndCursorFilter {\n");
    
    sb.append("    cursorFilter: ").append(toIndentedString(cursorFilter)).append("\n");
    sb.append("    holdingFilter: ").append(toIndentedString(holdingFilter)).append("\n");
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

