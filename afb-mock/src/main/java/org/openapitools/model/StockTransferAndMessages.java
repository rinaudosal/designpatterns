package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Message;
import org.openapitools.model.StockTransfer;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StockTransferAndMessages
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class StockTransferAndMessages   {
  @JsonProperty("messages")
  @Valid
  private List<Message> messages = null;

  @JsonProperty("stockTransfer")
  private StockTransfer stockTransfer = null;

  public StockTransferAndMessages messages(List<Message> messages) {
    this.messages = messages;
    return this;
  }

  public StockTransferAndMessages addMessagesItem(Message messagesItem) {
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

  public StockTransferAndMessages stockTransfer(StockTransfer stockTransfer) {
    this.stockTransfer = stockTransfer;
    return this;
  }

  /**
   * Get stockTransfer
   * @return stockTransfer
  **/
  @ApiModelProperty(value = "")

  @Valid

  public StockTransfer getStockTransfer() {
    return stockTransfer;
  }

  public void setStockTransfer(StockTransfer stockTransfer) {
    this.stockTransfer = stockTransfer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StockTransferAndMessages stockTransferAndMessages = (StockTransferAndMessages) o;
    return Objects.equals(this.messages, stockTransferAndMessages.messages) &&
        Objects.equals(this.stockTransfer, stockTransferAndMessages.stockTransfer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messages, stockTransfer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockTransferAndMessages {\n");
    
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    stockTransfer: ").append(toIndentedString(stockTransfer)).append("\n");
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

