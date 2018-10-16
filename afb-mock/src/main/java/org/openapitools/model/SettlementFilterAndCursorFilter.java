package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CursorFilter;
import org.openapitools.model.GroupedSettlementFilter;
import org.openapitools.model.SettlementFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of either a {SettlementFilter} or a {GroupedSettlementFilter} and a {CursorFilter}.
 */
@ApiModel(description = "A simple object composed of either a {SettlementFilter} or a {GroupedSettlementFilter} and a {CursorFilter}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SettlementFilterAndCursorFilter   {
  @JsonProperty("cursorFilter")
  private CursorFilter cursorFilter = null;

  @JsonProperty("groupedSettlementFilter")
  private GroupedSettlementFilter groupedSettlementFilter = null;

  @JsonProperty("settlementFilter")
  private SettlementFilter settlementFilter = null;

  public SettlementFilterAndCursorFilter cursorFilter(CursorFilter cursorFilter) {
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

  public SettlementFilterAndCursorFilter groupedSettlementFilter(GroupedSettlementFilter groupedSettlementFilter) {
    this.groupedSettlementFilter = groupedSettlementFilter;
    return this;
  }

  /**
   * Get groupedSettlementFilter
   * @return groupedSettlementFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public GroupedSettlementFilter getGroupedSettlementFilter() {
    return groupedSettlementFilter;
  }

  public void setGroupedSettlementFilter(GroupedSettlementFilter groupedSettlementFilter) {
    this.groupedSettlementFilter = groupedSettlementFilter;
  }

  public SettlementFilterAndCursorFilter settlementFilter(SettlementFilter settlementFilter) {
    this.settlementFilter = settlementFilter;
    return this;
  }

  /**
   * Get settlementFilter
   * @return settlementFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SettlementFilter getSettlementFilter() {
    return settlementFilter;
  }

  public void setSettlementFilter(SettlementFilter settlementFilter) {
    this.settlementFilter = settlementFilter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettlementFilterAndCursorFilter settlementFilterAndCursorFilter = (SettlementFilterAndCursorFilter) o;
    return Objects.equals(this.cursorFilter, settlementFilterAndCursorFilter.cursorFilter) &&
        Objects.equals(this.groupedSettlementFilter, settlementFilterAndCursorFilter.groupedSettlementFilter) &&
        Objects.equals(this.settlementFilter, settlementFilterAndCursorFilter.settlementFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursorFilter, groupedSettlementFilter, settlementFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettlementFilterAndCursorFilter {\n");
    
    sb.append("    cursorFilter: ").append(toIndentedString(cursorFilter)).append("\n");
    sb.append("    groupedSettlementFilter: ").append(toIndentedString(groupedSettlementFilter)).append("\n");
    sb.append("    settlementFilter: ").append(toIndentedString(settlementFilter)).append("\n");
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

