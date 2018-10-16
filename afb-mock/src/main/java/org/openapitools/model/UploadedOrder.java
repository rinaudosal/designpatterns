package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Message;
import org.openapitools.model.Order;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UploadedOrder
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class UploadedOrder   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("messages")
  @Valid
  private List<Message> messages = null;

  @JsonProperty("order")
  private Order order = null;

  /**
   * It shows the result of the validated {UploadedOrder}.
   */
  public enum StatusEnum {
    OK("OK"),
    
    ERROR("ERROR"),
    
    WARNING("WARNING");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("uploadedDate")
  private OffsetDateTime uploadedDate = null;

  public UploadedOrder id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * The Id of {UploadedOrder}s
   * @return id
  **/
  @ApiModelProperty(value = "The Id of {UploadedOrder}s")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public UploadedOrder messages(List<Message> messages) {
    this.messages = messages;
    return this;
  }

  public UploadedOrder addMessagesItem(Message messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<>();
    }
    this.messages.add(messagesItem);
    return this;
  }

  /**
   * The array of ids of {UploadedOrder}
   * @return messages
  **/
  @ApiModelProperty(value = "The array of ids of {UploadedOrder}")

  @Valid

  public List<Message> getMessages() {
    return messages;
  }

  public void setMessages(List<Message> messages) {
    this.messages = messages;
  }

  public UploadedOrder order(Order order) {
    this.order = order;
    return this;
  }

  /**
   * Get order
   * @return order
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }

  public UploadedOrder status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * It shows the result of the validated {UploadedOrder}.
   * @return status
  **/
  @ApiModelProperty(value = "It shows the result of the validated {UploadedOrder}.")


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public UploadedOrder uploadedDate(OffsetDateTime uploadedDate) {
    this.uploadedDate = uploadedDate;
    return this;
  }

  /**
   * The date when the {UploadedOrder} was uploaded
   * @return uploadedDate
  **/
  @ApiModelProperty(value = "The date when the {UploadedOrder} was uploaded")

  @Valid

  public OffsetDateTime getUploadedDate() {
    return uploadedDate;
  }

  public void setUploadedDate(OffsetDateTime uploadedDate) {
    this.uploadedDate = uploadedDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadedOrder uploadedOrder = (UploadedOrder) o;
    return Objects.equals(this.id, uploadedOrder.id) &&
        Objects.equals(this.messages, uploadedOrder.messages) &&
        Objects.equals(this.order, uploadedOrder.order) &&
        Objects.equals(this.status, uploadedOrder.status) &&
        Objects.equals(this.uploadedDate, uploadedOrder.uploadedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, messages, order, status, uploadedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadedOrder {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    uploadedDate: ").append(toIndentedString(uploadedDate)).append("\n");
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

