package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConsolidatedRebateFilter;
import org.openapitools.model.CursorFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ConsolidatedRebateFilterAndCursorFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class ConsolidatedRebateFilterAndCursorFilter   {
  @JsonProperty("consolidatedRebateFilter")
  private ConsolidatedRebateFilter consolidatedRebateFilter = null;

  @JsonProperty("cursorFilter")
  private CursorFilter cursorFilter = null;

  public ConsolidatedRebateFilterAndCursorFilter consolidatedRebateFilter(ConsolidatedRebateFilter consolidatedRebateFilter) {
    this.consolidatedRebateFilter = consolidatedRebateFilter;
    return this;
  }

  /**
   * Get consolidatedRebateFilter
   * @return consolidatedRebateFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConsolidatedRebateFilter getConsolidatedRebateFilter() {
    return consolidatedRebateFilter;
  }

  public void setConsolidatedRebateFilter(ConsolidatedRebateFilter consolidatedRebateFilter) {
    this.consolidatedRebateFilter = consolidatedRebateFilter;
  }

  public ConsolidatedRebateFilterAndCursorFilter cursorFilter(CursorFilter cursorFilter) {
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
    ConsolidatedRebateFilterAndCursorFilter consolidatedRebateFilterAndCursorFilter = (ConsolidatedRebateFilterAndCursorFilter) o;
    return Objects.equals(this.consolidatedRebateFilter, consolidatedRebateFilterAndCursorFilter.consolidatedRebateFilter) &&
        Objects.equals(this.cursorFilter, consolidatedRebateFilterAndCursorFilter.cursorFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consolidatedRebateFilter, cursorFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsolidatedRebateFilterAndCursorFilter {\n");
    
    sb.append("    consolidatedRebateFilter: ").append(toIndentedString(consolidatedRebateFilter)).append("\n");
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

