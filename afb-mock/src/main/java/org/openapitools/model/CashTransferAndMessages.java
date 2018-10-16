package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.CashTransfer;
import org.openapitools.model.Message;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CashTransferAndMessages
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class CashTransferAndMessages   {
  @JsonProperty("cashTransfer")
  private CashTransfer cashTransfer = null;

  @JsonProperty("messages")
  @Valid
  private List<Message> messages = null;

  public CashTransferAndMessages cashTransfer(CashTransfer cashTransfer) {
    this.cashTransfer = cashTransfer;
    return this;
  }

  /**
   * Get cashTransfer
   * @return cashTransfer
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CashTransfer getCashTransfer() {
    return cashTransfer;
  }

  public void setCashTransfer(CashTransfer cashTransfer) {
    this.cashTransfer = cashTransfer;
  }

  public CashTransferAndMessages messages(List<Message> messages) {
    this.messages = messages;
    return this;
  }

  public CashTransferAndMessages addMessagesItem(Message messagesItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CashTransferAndMessages cashTransferAndMessages = (CashTransferAndMessages) o;
    return Objects.equals(this.cashTransfer, cashTransferAndMessages.cashTransfer) &&
        Objects.equals(this.messages, cashTransferAndMessages.messages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cashTransfer, messages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashTransferAndMessages {\n");
    
    sb.append("    cashTransfer: ").append(toIndentedString(cashTransfer)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
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

