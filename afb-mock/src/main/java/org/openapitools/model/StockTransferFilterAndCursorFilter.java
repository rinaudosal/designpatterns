package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CursorFilter;
import org.openapitools.model.StockTransferFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StockTransferFilterAndCursorFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class StockTransferFilterAndCursorFilter   {
  @JsonProperty("cursorFilter")
  private CursorFilter cursorFilter = null;

  @JsonProperty("stockTransferFilter")
  private StockTransferFilter stockTransferFilter = null;

  public StockTransferFilterAndCursorFilter cursorFilter(CursorFilter cursorFilter) {
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

  public StockTransferFilterAndCursorFilter stockTransferFilter(StockTransferFilter stockTransferFilter) {
    this.stockTransferFilter = stockTransferFilter;
    return this;
  }

  /**
   * Get stockTransferFilter
   * @return stockTransferFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public StockTransferFilter getStockTransferFilter() {
    return stockTransferFilter;
  }

  public void setStockTransferFilter(StockTransferFilter stockTransferFilter) {
    this.stockTransferFilter = stockTransferFilter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StockTransferFilterAndCursorFilter stockTransferFilterAndCursorFilter = (StockTransferFilterAndCursorFilter) o;
    return Objects.equals(this.cursorFilter, stockTransferFilterAndCursorFilter.cursorFilter) &&
        Objects.equals(this.stockTransferFilter, stockTransferFilterAndCursorFilter.stockTransferFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursorFilter, stockTransferFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockTransferFilterAndCursorFilter {\n");
    
    sb.append("    cursorFilter: ").append(toIndentedString(cursorFilter)).append("\n");
    sb.append("    stockTransferFilter: ").append(toIndentedString(stockTransferFilter)).append("\n");
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

