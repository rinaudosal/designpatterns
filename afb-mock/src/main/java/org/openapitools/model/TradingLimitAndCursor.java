package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Cursor;
import org.openapitools.model.TradingLimit;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {TradingLimit} and a {Cursor}.
 */
@ApiModel(description = "A simple object composed of an array of {TradingLimit} and a {Cursor}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class TradingLimitAndCursor   {
  @JsonProperty("cursor")
  private Cursor cursor = null;

  @JsonProperty("tradingLimits")
  @Valid
  private List<TradingLimit> tradingLimits = null;

  public TradingLimitAndCursor cursor(Cursor cursor) {
    this.cursor = cursor;
    return this;
  }

  /**
   * Get cursor
   * @return cursor
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Cursor getCursor() {
    return cursor;
  }

  public void setCursor(Cursor cursor) {
    this.cursor = cursor;
  }

  public TradingLimitAndCursor tradingLimits(List<TradingLimit> tradingLimits) {
    this.tradingLimits = tradingLimits;
    return this;
  }

  public TradingLimitAndCursor addTradingLimitsItem(TradingLimit tradingLimitsItem) {
    if (this.tradingLimits == null) {
      this.tradingLimits = new ArrayList<>();
    }
    this.tradingLimits.add(tradingLimitsItem);
    return this;
  }

  /**
   * The array of {Depositary}
   * @return tradingLimits
  **/
  @ApiModelProperty(value = "The array of {Depositary}")

  @Valid

  public List<TradingLimit> getTradingLimits() {
    return tradingLimits;
  }

  public void setTradingLimits(List<TradingLimit> tradingLimits) {
    this.tradingLimits = tradingLimits;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TradingLimitAndCursor tradingLimitAndCursor = (TradingLimitAndCursor) o;
    return Objects.equals(this.cursor, tradingLimitAndCursor.cursor) &&
        Objects.equals(this.tradingLimits, tradingLimitAndCursor.tradingLimits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursor, tradingLimits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TradingLimitAndCursor {\n");
    
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    tradingLimits: ").append(toIndentedString(tradingLimits)).append("\n");
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

