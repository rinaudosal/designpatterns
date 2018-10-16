package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SpanishTransferChangeStatusFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SpanishTransferChangeStatusFilter   {
  /**
   * Indicates the action to be executed.
   */
  public enum ActionEnum {
    ACCEPT("ACCEPT"),
    
    REJECT("REJECT");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ActionEnum fromValue(String text) {
      for (ActionEnum b : ActionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("action")
  private ActionEnum action = null;

  @JsonProperty("rejectionCauseCode")
  private String rejectionCauseCode = null;

  public SpanishTransferChangeStatusFilter action(ActionEnum action) {
    this.action = action;
    return this;
  }

  /**
   * Indicates the action to be executed.
   * @return action
  **/
  @ApiModelProperty(value = "Indicates the action to be executed.")


  public ActionEnum getAction() {
    return action;
  }

  public void setAction(ActionEnum action) {
    this.action = action;
  }

  public SpanishTransferChangeStatusFilter rejectionCauseCode(String rejectionCauseCode) {
    this.rejectionCauseCode = rejectionCauseCode;
    return this;
  }

  /**
   * Refers to {listSpanishTransferRejectionCauses}. Mandatory if and only if statusCode is set to REJECTED
   * @return rejectionCauseCode
  **/
  @ApiModelProperty(value = "Refers to {listSpanishTransferRejectionCauses}. Mandatory if and only if statusCode is set to REJECTED")


  public String getRejectionCauseCode() {
    return rejectionCauseCode;
  }

  public void setRejectionCauseCode(String rejectionCauseCode) {
    this.rejectionCauseCode = rejectionCauseCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpanishTransferChangeStatusFilter spanishTransferChangeStatusFilter = (SpanishTransferChangeStatusFilter) o;
    return Objects.equals(this.action, spanishTransferChangeStatusFilter.action) &&
        Objects.equals(this.rejectionCauseCode, spanishTransferChangeStatusFilter.rejectionCauseCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, rejectionCauseCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpanishTransferChangeStatusFilter {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    rejectionCauseCode: ").append(toIndentedString(rejectionCauseCode)).append("\n");
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

