package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Cursor;
import org.openapitools.model.Holding;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * HoldingAndCursor
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class HoldingAndCursor   {
  @JsonProperty("cursor")
  private Cursor cursor = null;

  @JsonProperty("holdings")
  @Valid
  private List<Holding> holdings = null;

  public HoldingAndCursor cursor(Cursor cursor) {
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

  public HoldingAndCursor holdings(List<Holding> holdings) {
    this.holdings = holdings;
    return this;
  }

  public HoldingAndCursor addHoldingsItem(Holding holdingsItem) {
    if (this.holdings == null) {
      this.holdings = new ArrayList<>();
    }
    this.holdings.add(holdingsItem);
    return this;
  }

  /**
   * Get holdings
   * @return holdings
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Holding> getHoldings() {
    return holdings;
  }

  public void setHoldings(List<Holding> holdings) {
    this.holdings = holdings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HoldingAndCursor holdingAndCursor = (HoldingAndCursor) o;
    return Objects.equals(this.cursor, holdingAndCursor.cursor) &&
        Objects.equals(this.holdings, holdingAndCursor.holdings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursor, holdings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HoldingAndCursor {\n");
    
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    holdings: ").append(toIndentedString(holdings)).append("\n");
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

