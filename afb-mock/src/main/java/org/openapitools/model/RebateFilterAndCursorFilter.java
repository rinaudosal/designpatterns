package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CursorFilter;
import org.openapitools.model.RebateFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RebateFilterAndCursorFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class RebateFilterAndCursorFilter   {
  @JsonProperty("cursorFilter")
  private CursorFilter cursorFilter = null;

  @JsonProperty("rebateFilter")
  private RebateFilter rebateFilter = null;

  public RebateFilterAndCursorFilter cursorFilter(CursorFilter cursorFilter) {
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

  public RebateFilterAndCursorFilter rebateFilter(RebateFilter rebateFilter) {
    this.rebateFilter = rebateFilter;
    return this;
  }

  /**
   * Get rebateFilter
   * @return rebateFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RebateFilter getRebateFilter() {
    return rebateFilter;
  }

  public void setRebateFilter(RebateFilter rebateFilter) {
    this.rebateFilter = rebateFilter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RebateFilterAndCursorFilter rebateFilterAndCursorFilter = (RebateFilterAndCursorFilter) o;
    return Objects.equals(this.cursorFilter, rebateFilterAndCursorFilter.cursorFilter) &&
        Objects.equals(this.rebateFilter, rebateFilterAndCursorFilter.rebateFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursorFilter, rebateFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RebateFilterAndCursorFilter {\n");
    
    sb.append("    cursorFilter: ").append(toIndentedString(cursorFilter)).append("\n");
    sb.append("    rebateFilter: ").append(toIndentedString(rebateFilter)).append("\n");
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

