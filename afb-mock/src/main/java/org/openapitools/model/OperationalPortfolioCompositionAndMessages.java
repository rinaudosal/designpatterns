package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Message;
import org.openapitools.model.OperationalPortfolioComposition;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OperationalPortfolioCompositionAndMessages
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class OperationalPortfolioCompositionAndMessages   {
  @JsonProperty("messages")
  @Valid
  private List<Message> messages = null;

  @JsonProperty("operationalPortfolioComposition")
  private OperationalPortfolioComposition operationalPortfolioComposition = null;

  public OperationalPortfolioCompositionAndMessages messages(List<Message> messages) {
    this.messages = messages;
    return this;
  }

  public OperationalPortfolioCompositionAndMessages addMessagesItem(Message messagesItem) {
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

  public OperationalPortfolioCompositionAndMessages operationalPortfolioComposition(OperationalPortfolioComposition operationalPortfolioComposition) {
    this.operationalPortfolioComposition = operationalPortfolioComposition;
    return this;
  }

  /**
   * Get operationalPortfolioComposition
   * @return operationalPortfolioComposition
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OperationalPortfolioComposition getOperationalPortfolioComposition() {
    return operationalPortfolioComposition;
  }

  public void setOperationalPortfolioComposition(OperationalPortfolioComposition operationalPortfolioComposition) {
    this.operationalPortfolioComposition = operationalPortfolioComposition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationalPortfolioCompositionAndMessages operationalPortfolioCompositionAndMessages = (OperationalPortfolioCompositionAndMessages) o;
    return Objects.equals(this.messages, operationalPortfolioCompositionAndMessages.messages) &&
        Objects.equals(this.operationalPortfolioComposition, operationalPortfolioCompositionAndMessages.operationalPortfolioComposition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messages, operationalPortfolioComposition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationalPortfolioCompositionAndMessages {\n");
    
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    operationalPortfolioComposition: ").append(toIndentedString(operationalPortfolioComposition)).append("\n");
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

