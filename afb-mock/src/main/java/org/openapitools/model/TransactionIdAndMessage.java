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
 * TransactionIdAndMessage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class TransactionIdAndMessage   {
  @JsonProperty("message")
  private Message message = null;

  @JsonProperty("transactionId")
  private Long transactionId = null;

  public TransactionIdAndMessage message(Message message) {
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

  public TransactionIdAndMessage transactionId(Long transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  /**
   * A collection of an {Transaction.id}s
   * @return transactionId
  **/
  @ApiModelProperty(value = "A collection of an {Transaction.id}s")


  public Long getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(Long transactionId) {
    this.transactionId = transactionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionIdAndMessage transactionIdAndMessage = (TransactionIdAndMessage) o;
    return Objects.equals(this.message, transactionIdAndMessage.message) &&
        Objects.equals(this.transactionId, transactionIdAndMessage.transactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, transactionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionIdAndMessage {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
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

