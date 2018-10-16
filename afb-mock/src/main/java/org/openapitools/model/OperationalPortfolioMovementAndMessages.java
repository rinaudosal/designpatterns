package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Message;
import org.openapitools.model.OperationalPortfolioMovement;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OperationalPortfolioMovementAndMessages
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class OperationalPortfolioMovementAndMessages   {
  @JsonProperty("messages")
  @Valid
  private List<Message> messages = null;

  @JsonProperty("operationalPortfolioMovement")
  private OperationalPortfolioMovement operationalPortfolioMovement = null;

  public OperationalPortfolioMovementAndMessages messages(List<Message> messages) {
    this.messages = messages;
    return this;
  }

  public OperationalPortfolioMovementAndMessages addMessagesItem(Message messagesItem) {
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

  public OperationalPortfolioMovementAndMessages operationalPortfolioMovement(OperationalPortfolioMovement operationalPortfolioMovement) {
    this.operationalPortfolioMovement = operationalPortfolioMovement;
    return this;
  }

  /**
   * Get operationalPortfolioMovement
   * @return operationalPortfolioMovement
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OperationalPortfolioMovement getOperationalPortfolioMovement() {
    return operationalPortfolioMovement;
  }

  public void setOperationalPortfolioMovement(OperationalPortfolioMovement operationalPortfolioMovement) {
    this.operationalPortfolioMovement = operationalPortfolioMovement;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationalPortfolioMovementAndMessages operationalPortfolioMovementAndMessages = (OperationalPortfolioMovementAndMessages) o;
    return Objects.equals(this.messages, operationalPortfolioMovementAndMessages.messages) &&
        Objects.equals(this.operationalPortfolioMovement, operationalPortfolioMovementAndMessages.operationalPortfolioMovement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messages, operationalPortfolioMovement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationalPortfolioMovementAndMessages {\n");
    
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    operationalPortfolioMovement: ").append(toIndentedString(operationalPortfolioMovement)).append("\n");
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

