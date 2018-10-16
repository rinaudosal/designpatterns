package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PageFilter;
import org.openapitools.model.SpanishTransferRequestsDatesFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SpanishTransferRequestsDatesFilterAndPageFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SpanishTransferRequestsDatesFilterAndPageFilter   {
  @JsonProperty("pageFilter")
  private PageFilter pageFilter = null;

  @JsonProperty("spanishTransferRequestsDatesFilter")
  private SpanishTransferRequestsDatesFilter spanishTransferRequestsDatesFilter = null;

  public SpanishTransferRequestsDatesFilterAndPageFilter pageFilter(PageFilter pageFilter) {
    this.pageFilter = pageFilter;
    return this;
  }

  /**
   * Get pageFilter
   * @return pageFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PageFilter getPageFilter() {
    return pageFilter;
  }

  public void setPageFilter(PageFilter pageFilter) {
    this.pageFilter = pageFilter;
  }

  public SpanishTransferRequestsDatesFilterAndPageFilter spanishTransferRequestsDatesFilter(SpanishTransferRequestsDatesFilter spanishTransferRequestsDatesFilter) {
    this.spanishTransferRequestsDatesFilter = spanishTransferRequestsDatesFilter;
    return this;
  }

  /**
   * Get spanishTransferRequestsDatesFilter
   * @return spanishTransferRequestsDatesFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SpanishTransferRequestsDatesFilter getSpanishTransferRequestsDatesFilter() {
    return spanishTransferRequestsDatesFilter;
  }

  public void setSpanishTransferRequestsDatesFilter(SpanishTransferRequestsDatesFilter spanishTransferRequestsDatesFilter) {
    this.spanishTransferRequestsDatesFilter = spanishTransferRequestsDatesFilter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpanishTransferRequestsDatesFilterAndPageFilter spanishTransferRequestsDatesFilterAndPageFilter = (SpanishTransferRequestsDatesFilterAndPageFilter) o;
    return Objects.equals(this.pageFilter, spanishTransferRequestsDatesFilterAndPageFilter.pageFilter) &&
        Objects.equals(this.spanishTransferRequestsDatesFilter, spanishTransferRequestsDatesFilterAndPageFilter.spanishTransferRequestsDatesFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageFilter, spanishTransferRequestsDatesFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpanishTransferRequestsDatesFilterAndPageFilter {\n");
    
    sb.append("    pageFilter: ").append(toIndentedString(pageFilter)).append("\n");
    sb.append("    spanishTransferRequestsDatesFilter: ").append(toIndentedString(spanishTransferRequestsDatesFilter)).append("\n");
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

