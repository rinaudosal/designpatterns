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
import org.openapitools.model.StockTransfer;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UploadedStockTransfer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class UploadedStockTransfer   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("messages")
  @Valid
  private List<Message> messages = null;

  /**
   * It shows the result of the validated {UploadedStockTransfer}.
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

  @JsonProperty("stockTransfer")
  private StockTransfer stockTransfer = null;

  @JsonProperty("uploadedDate")
  private OffsetDateTime uploadedDate = null;

  public UploadedStockTransfer id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * The Id of {UploadedStockTransfer}s
   * @return id
  **/
  @ApiModelProperty(value = "The Id of {UploadedStockTransfer}s")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public UploadedStockTransfer messages(List<Message> messages) {
    this.messages = messages;
    return this;
  }

  public UploadedStockTransfer addMessagesItem(Message messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<>();
    }
    this.messages.add(messagesItem);
    return this;
  }

  /**
   * The array of ids of {UploadedStockTransfer}
   * @return messages
  **/
  @ApiModelProperty(value = "The array of ids of {UploadedStockTransfer}")

  @Valid

  public List<Message> getMessages() {
    return messages;
  }

  public void setMessages(List<Message> messages) {
    this.messages = messages;
  }

  public UploadedStockTransfer status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * It shows the result of the validated {UploadedStockTransfer}.
   * @return status
  **/
  @ApiModelProperty(value = "It shows the result of the validated {UploadedStockTransfer}.")


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public UploadedStockTransfer stockTransfer(StockTransfer stockTransfer) {
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

  public UploadedStockTransfer uploadedDate(OffsetDateTime uploadedDate) {
    this.uploadedDate = uploadedDate;
    return this;
  }

  /**
   * The date when the {UploadedStockTransfer} was uploaded
   * @return uploadedDate
  **/
  @ApiModelProperty(value = "The date when the {UploadedStockTransfer} was uploaded")

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
    UploadedStockTransfer uploadedStockTransfer = (UploadedStockTransfer) o;
    return Objects.equals(this.id, uploadedStockTransfer.id) &&
        Objects.equals(this.messages, uploadedStockTransfer.messages) &&
        Objects.equals(this.status, uploadedStockTransfer.status) &&
        Objects.equals(this.stockTransfer, uploadedStockTransfer.stockTransfer) &&
        Objects.equals(this.uploadedDate, uploadedStockTransfer.uploadedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, messages, status, stockTransfer, uploadedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadedStockTransfer {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    stockTransfer: ").append(toIndentedString(stockTransfer)).append("\n");
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

