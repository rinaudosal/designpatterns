package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Message;
import org.openapitools.model.OperationalPortfolioTransaction;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OperationalPortfolioTransactionAndMessages
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class OperationalPortfolioTransactionAndMessages   {
  @JsonProperty("messages")
  @Valid
  private List<Message> messages = null;

  @JsonProperty("operationalPortfolioTransaction")
  private OperationalPortfolioTransaction operationalPortfolioTransaction = null;

  public OperationalPortfolioTransactionAndMessages messages(List<Message> messages) {
    this.messages = messages;
    return this;
  }

  public OperationalPortfolioTransactionAndMessages addMessagesItem(Message messagesItem) {
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

  public OperationalPortfolioTransactionAndMessages operationalPortfolioTransaction(OperationalPortfolioTransaction operationalPortfolioTransaction) {
    this.operationalPortfolioTransaction = operationalPortfolioTransaction;
    return this;
  }

  /**
   * Get operationalPortfolioTransaction
   * @return operationalPortfolioTransaction
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OperationalPortfolioTransaction getOperationalPortfolioTransaction() {
    return operationalPortfolioTransaction;
  }

  public void setOperationalPortfolioTransaction(OperationalPortfolioTransaction operationalPortfolioTransaction) {
    this.operationalPortfolioTransaction = operationalPortfolioTransaction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationalPortfolioTransactionAndMessages operationalPortfolioTransactionAndMessages = (OperationalPortfolioTransactionAndMessages) o;
    return Objects.equals(this.messages, operationalPortfolioTransactionAndMessages.messages) &&
        Objects.equals(this.operationalPortfolioTransaction, operationalPortfolioTransactionAndMessages.operationalPortfolioTransaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messages, operationalPortfolioTransaction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationalPortfolioTransactionAndMessages {\n");
    
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    operationalPortfolioTransaction: ").append(toIndentedString(operationalPortfolioTransaction)).append("\n");
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

