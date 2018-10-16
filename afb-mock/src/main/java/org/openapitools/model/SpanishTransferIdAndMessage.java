package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Message;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SpanishTransferIdAndMessage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SpanishTransferIdAndMessage   {
  @JsonProperty("message")
  private Message message = null;

  @JsonProperty("spanishTransferId")
  private Long spanishTransferId = null;

  public SpanishTransferIdAndMessage message(Message message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Message getMessage() {
    return message;
  }

  public void setMessage(Message message) {
    this.message = message;
  }

  public SpanishTransferIdAndMessage spanishTransferId(Long spanishTransferId) {
    this.spanishTransferId = spanishTransferId;
    return this;
  }

  /**
   * A collection of an {SpanishTransfer.id}s
   * @return spanishTransferId
  **/
  @ApiModelProperty(value = "A collection of an {SpanishTransfer.id}s")


  public Long getSpanishTransferId() {
    return spanishTransferId;
  }

  public void setSpanishTransferId(Long spanishTransferId) {
    this.spanishTransferId = spanishTransferId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpanishTransferIdAndMessage spanishTransferIdAndMessage = (SpanishTransferIdAndMessage) o;
    return Objects.equals(this.message, spanishTransferIdAndMessage.message) &&
        Objects.equals(this.spanishTransferId, spanishTransferIdAndMessage.spanishTransferId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, spanishTransferId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpanishTransferIdAndMessage {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    spanishTransferId: ").append(toIndentedString(spanishTransferId)).append("\n");
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

