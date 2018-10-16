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
 * SpanishTransferStatusChange
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SpanishTransferStatusChange   {
  @JsonProperty("actionCode")
  private String actionCode = null;

  @JsonProperty("date")
  private OffsetDateTime date = null;

  @JsonProperty("orderedBy")
  private String orderedBy = null;

  public SpanishTransferStatusChange actionCode(String actionCode) {
    this.actionCode = actionCode;
    return this;
  }

  /**
   * Action. Refer to {listTransactionsStatusChanges}
   * @return actionCode
  **/
  @ApiModelProperty(value = "Action. Refer to {listTransactionsStatusChanges}")


  public String getActionCode() {
    return actionCode;
  }

  public void setActionCode(String actionCode) {
    this.actionCode = actionCode;
  }

  public SpanishTransferStatusChange date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public SpanishTransferStatusChange orderedBy(String orderedBy) {
    this.orderedBy = orderedBy;
    return this;
  }

  /**
   * Get orderedBy
   * @return orderedBy
  **/
  @ApiModelProperty(value = "")


  public String getOrderedBy() {
    return orderedBy;
  }

  public void setOrderedBy(String orderedBy) {
    this.orderedBy = orderedBy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpanishTransferStatusChange spanishTransferStatusChange = (SpanishTransferStatusChange) o;
    return Objects.equals(this.actionCode, spanishTransferStatusChange.actionCode) &&
        Objects.equals(this.date, spanishTransferStatusChange.date) &&
        Objects.equals(this.orderedBy, spanishTransferStatusChange.orderedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionCode, date, orderedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpanishTransferStatusChange {\n");
    
    sb.append("    actionCode: ").append(toIndentedString(actionCode)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    orderedBy: ").append(toIndentedString(orderedBy)).append("\n");
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

