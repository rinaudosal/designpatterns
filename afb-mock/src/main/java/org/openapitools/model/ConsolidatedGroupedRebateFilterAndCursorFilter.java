package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConsolidatedGroupedRebateFilter;
import org.openapitools.model.CursorFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ConsolidatedGroupedRebateFilterAndCursorFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class ConsolidatedGroupedRebateFilterAndCursorFilter   {
  @JsonProperty("consolidatedGroupedRebateFilter")
  private ConsolidatedGroupedRebateFilter consolidatedGroupedRebateFilter = null;

  @JsonProperty("cursorFilter")
  private CursorFilter cursorFilter = null;

  public ConsolidatedGroupedRebateFilterAndCursorFilter consolidatedGroupedRebateFilter(ConsolidatedGroupedRebateFilter consolidatedGroupedRebateFilter) {
    this.consolidatedGroupedRebateFilter = consolidatedGroupedRebateFilter;
    return this;
  }

  /**
   * Get consolidatedGroupedRebateFilter
   * @return consolidatedGroupedRebateFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConsolidatedGroupedRebateFilter getConsolidatedGroupedRebateFilter() {
    return consolidatedGroupedRebateFilter;
  }

  public void setConsolidatedGroupedRebateFilter(ConsolidatedGroupedRebateFilter consolidatedGroupedRebateFilter) {
    this.consolidatedGroupedRebateFilter = consolidatedGroupedRebateFilter;
  }

  public ConsolidatedGroupedRebateFilterAndCursorFilter cursorFilter(CursorFilter cursorFilter) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsolidatedGroupedRebateFilterAndCursorFilter consolidatedGroupedRebateFilterAndCursorFilter = (ConsolidatedGroupedRebateFilterAndCursorFilter) o;
    return Objects.equals(this.consolidatedGroupedRebateFilter, consolidatedGroupedRebateFilterAndCursorFilter.consolidatedGroupedRebateFilter) &&
        Objects.equals(this.cursorFilter, consolidatedGroupedRebateFilterAndCursorFilter.cursorFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consolidatedGroupedRebateFilter, cursorFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsolidatedGroupedRebateFilterAndCursorFilter {\n");
    
    sb.append("    consolidatedGroupedRebateFilter: ").append(toIndentedString(consolidatedGroupedRebateFilter)).append("\n");
    sb.append("    cursorFilter: ").append(toIndentedString(cursorFilter)).append("\n");
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

