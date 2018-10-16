package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Message;
import org.openapitools.model.OperationalPortfolio;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OperationalPortfolioAndMessages
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class OperationalPortfolioAndMessages   {
  @JsonProperty("messages")
  @Valid
  private List<Message> messages = null;

  @JsonProperty("operationalPortfolio")
  private OperationalPortfolio operationalPortfolio = null;

  public OperationalPortfolioAndMessages messages(List<Message> messages) {
    this.messages = messages;
    return this;
  }

  public OperationalPortfolioAndMessages addMessagesItem(Message messagesItem) {
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

  public OperationalPortfolioAndMessages operationalPortfolio(OperationalPortfolio operationalPortfolio) {
    this.operationalPortfolio = operationalPortfolio;
    return this;
  }

  /**
   * Get operationalPortfolio
   * @return operationalPortfolio
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OperationalPortfolio getOperationalPortfolio() {
    return operationalPortfolio;
  }

  public void setOperationalPortfolio(OperationalPortfolio operationalPortfolio) {
    this.operationalPortfolio = operationalPortfolio;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationalPortfolioAndMessages operationalPortfolioAndMessages = (OperationalPortfolioAndMessages) o;
    return Objects.equals(this.messages, operationalPortfolioAndMessages.messages) &&
        Objects.equals(this.operationalPortfolio, operationalPortfolioAndMessages.operationalPortfolio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messages, operationalPortfolio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationalPortfolioAndMessages {\n");
    
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    operationalPortfolio: ").append(toIndentedString(operationalPortfolio)).append("\n");
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

