package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CursorFilter;
import org.openapitools.model.TradingLimitFilter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TradingLimitFilterAndCursorFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class TradingLimitFilterAndCursorFilter   {
  @JsonProperty("cursorFilter")
  private CursorFilter cursorFilter = null;

  @JsonProperty("tradingLimitFilter")
  private TradingLimitFilter tradingLimitFilter = null;

  public TradingLimitFilterAndCursorFilter cursorFilter(CursorFilter cursorFilter) {
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

  public TradingLimitFilterAndCursorFilter tradingLimitFilter(TradingLimitFilter tradingLimitFilter) {
    this.tradingLimitFilter = tradingLimitFilter;
    return this;
  }

  /**
   * Get tradingLimitFilter
   * @return tradingLimitFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public TradingLimitFilter getTradingLimitFilter() {
    return tradingLimitFilter;
  }

  public void setTradingLimitFilter(TradingLimitFilter tradingLimitFilter) {
    this.tradingLimitFilter = tradingLimitFilter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TradingLimitFilterAndCursorFilter tradingLimitFilterAndCursorFilter = (TradingLimitFilterAndCursorFilter) o;
    return Objects.equals(this.cursorFilter, tradingLimitFilterAndCursorFilter.cursorFilter) &&
        Objects.equals(this.tradingLimitFilter, tradingLimitFilterAndCursorFilter.tradingLimitFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursorFilter, tradingLimitFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TradingLimitFilterAndCursorFilter {\n");
    
    sb.append("    cursorFilter: ").append(toIndentedString(cursorFilter)).append("\n");
    sb.append("    tradingLimitFilter: ").append(toIndentedString(tradingLimitFilter)).append("\n");
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

