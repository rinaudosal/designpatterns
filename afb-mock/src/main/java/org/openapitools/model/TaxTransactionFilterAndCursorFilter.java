package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CursorFilter;
import org.openapitools.model.TaxTransactionFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TaxTransactionFilterAndCursorFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class TaxTransactionFilterAndCursorFilter   {
  @JsonProperty("cursorFilter")
  private CursorFilter cursorFilter = null;

  @JsonProperty("taxTransactionFilter")
  private TaxTransactionFilter taxTransactionFilter = null;

  public TaxTransactionFilterAndCursorFilter cursorFilter(CursorFilter cursorFilter) {
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

  public TaxTransactionFilterAndCursorFilter taxTransactionFilter(TaxTransactionFilter taxTransactionFilter) {
    this.taxTransactionFilter = taxTransactionFilter;
    return this;
  }

  /**
   * Get taxTransactionFilter
   * @return taxTransactionFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public TaxTransactionFilter getTaxTransactionFilter() {
    return taxTransactionFilter;
  }

  public void setTaxTransactionFilter(TaxTransactionFilter taxTransactionFilter) {
    this.taxTransactionFilter = taxTransactionFilter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxTransactionFilterAndCursorFilter taxTransactionFilterAndCursorFilter = (TaxTransactionFilterAndCursorFilter) o;
    return Objects.equals(this.cursorFilter, taxTransactionFilterAndCursorFilter.cursorFilter) &&
        Objects.equals(this.taxTransactionFilter, taxTransactionFilterAndCursorFilter.taxTransactionFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursorFilter, taxTransactionFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxTransactionFilterAndCursorFilter {\n");
    
    sb.append("    cursorFilter: ").append(toIndentedString(cursorFilter)).append("\n");
    sb.append("    taxTransactionFilter: ").append(toIndentedString(taxTransactionFilter)).append("\n");
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

