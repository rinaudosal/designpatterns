package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Message;
import org.openapitools.model.SpanishTransfer;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SpanishTransferAndMessages
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SpanishTransferAndMessages   {
  @JsonProperty("messages")
  @Valid
  private List<Message> messages = null;

  @JsonProperty("spanishTransfer")
  private SpanishTransfer spanishTransfer = null;

  public SpanishTransferAndMessages messages(List<Message> messages) {
    this.messages = messages;
    return this;
  }

  public SpanishTransferAndMessages addMessagesItem(Message messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<>();
    }
    this.messages.add(messagesItem);
    return this;
  }

  /**
   * Get messages
   * @return messages
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Message> getMessages() {
    return messages;
  }

  public void setMessages(List<Message> messages) {
    this.messages = messages;
  }

  public SpanishTransferAndMessages spanishTransfer(SpanishTransfer spanishTransfer) {
    this.spanishTransfer = spanishTransfer;
    return this;
  }

  /**
   * Get spanishTransfer
   * @return spanishTransfer
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SpanishTransfer getSpanishTransfer() {
    return spanishTransfer;
  }

  public void setSpanishTransfer(SpanishTransfer spanishTransfer) {
    this.spanishTransfer = spanishTransfer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpanishTransferAndMessages spanishTransferAndMessages = (SpanishTransferAndMessages) o;
    return Objects.equals(this.messages, spanishTransferAndMessages.messages) &&
        Objects.equals(this.spanishTransfer, spanishTransferAndMessages.spanishTransfer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messages, spanishTransfer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpanishTransferAndMessages {\n");
    
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    spanishTransfer: ").append(toIndentedString(spanishTransfer)).append("\n");
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

