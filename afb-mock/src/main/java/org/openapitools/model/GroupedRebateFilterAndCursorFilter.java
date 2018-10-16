package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CursorFilter;
import org.openapitools.model.GroupedRebateFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GroupedRebateFilterAndCursorFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class GroupedRebateFilterAndCursorFilter   {
  @JsonProperty("cursorFilter")
  private CursorFilter cursorFilter = null;

  @JsonProperty("groupedRebateFilter")
  private GroupedRebateFilter groupedRebateFilter = null;

  public GroupedRebateFilterAndCursorFilter cursorFilter(CursorFilter cursorFilter) {
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

  public GroupedRebateFilterAndCursorFilter groupedRebateFilter(GroupedRebateFilter groupedRebateFilter) {
    this.groupedRebateFilter = groupedRebateFilter;
    return this;
  }

  /**
   * Get groupedRebateFilter
   * @return groupedRebateFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public GroupedRebateFilter getGroupedRebateFilter() {
    return groupedRebateFilter;
  }

  public void setGroupedRebateFilter(GroupedRebateFilter groupedRebateFilter) {
    this.groupedRebateFilter = groupedRebateFilter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupedRebateFilterAndCursorFilter groupedRebateFilterAndCursorFilter = (GroupedRebateFilterAndCursorFilter) o;
    return Objects.equals(this.cursorFilter, groupedRebateFilterAndCursorFilter.cursorFilter) &&
        Objects.equals(this.groupedRebateFilter, groupedRebateFilterAndCursorFilter.groupedRebateFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursorFilter, groupedRebateFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupedRebateFilterAndCursorFilter {\n");
    
    sb.append("    cursorFilter: ").append(toIndentedString(cursorFilter)).append("\n");
    sb.append("    groupedRebateFilter: ").append(toIndentedString(groupedRebateFilter)).append("\n");
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

