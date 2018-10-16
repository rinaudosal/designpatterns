package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CursorFilter;
import org.openapitools.model.SpanishTransferFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SpanishTransferFilterAndCursorFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SpanishTransferFilterAndCursorFilter   {
  @JsonProperty("cursorFilter")
  private CursorFilter cursorFilter = null;

  @JsonProperty("spanishTransferFilter")
  private SpanishTransferFilter spanishTransferFilter = null;

  public SpanishTransferFilterAndCursorFilter cursorFilter(CursorFilter cursorFilter) {
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

  public SpanishTransferFilterAndCursorFilter spanishTransferFilter(SpanishTransferFilter spanishTransferFilter) {
    this.spanishTransferFilter = spanishTransferFilter;
    return this;
  }

  /**
   * Get spanishTransferFilter
   * @return spanishTransferFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SpanishTransferFilter getSpanishTransferFilter() {
    return spanishTransferFilter;
  }

  public void setSpanishTransferFilter(SpanishTransferFilter spanishTransferFilter) {
    this.spanishTransferFilter = spanishTransferFilter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpanishTransferFilterAndCursorFilter spanishTransferFilterAndCursorFilter = (SpanishTransferFilterAndCursorFilter) o;
    return Objects.equals(this.cursorFilter, spanishTransferFilterAndCursorFilter.cursorFilter) &&
        Objects.equals(this.spanishTransferFilter, spanishTransferFilterAndCursorFilter.spanishTransferFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursorFilter, spanishTransferFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpanishTransferFilterAndCursorFilter {\n");
    
    sb.append("    cursorFilter: ").append(toIndentedString(cursorFilter)).append("\n");
    sb.append("    spanishTransferFilter: ").append(toIndentedString(spanishTransferFilter)).append("\n");
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

