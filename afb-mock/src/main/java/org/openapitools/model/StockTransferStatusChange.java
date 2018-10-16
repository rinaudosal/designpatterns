package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StockTransferStatusChange
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class StockTransferStatusChange   {
  @JsonProperty("actionCode")
  private String actionCode = null;

  @JsonProperty("date")
  private OffsetDateTime date = null;

  public StockTransferStatusChange actionCode(String actionCode) {
    this.actionCode = actionCode;
    return this;
  }

  /**
   * Action. Refer to {listStockTransferCategories}
   * @return actionCode
  **/
  @ApiModelProperty(value = "Action. Refer to {listStockTransferCategories}")


  public String getActionCode() {
    return actionCode;
  }

  public void setActionCode(String actionCode) {
    this.actionCode = actionCode;
  }

  public StockTransferStatusChange date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

  /**
   * Central European Time [Date and Time]
   * @return date
  **/
  @ApiModelProperty(value = "Central European Time [Date and Time]")

  @Valid

  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StockTransferStatusChange stockTransferStatusChange = (StockTransferStatusChange) o;
    return Objects.equals(this.actionCode, stockTransferStatusChange.actionCode) &&
        Objects.equals(this.date, stockTransferStatusChange.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionCode, date);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockTransferStatusChange {\n");
    
    sb.append("    actionCode: ").append(toIndentedString(actionCode)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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

