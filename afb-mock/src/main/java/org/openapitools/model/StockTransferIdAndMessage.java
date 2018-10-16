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
 * StockTransferIdAndMessage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class StockTransferIdAndMessage   {
  @JsonProperty("message")
  private Message message = null;

  @JsonProperty("stockTransferId")
  private String stockTransferId = null;

  public StockTransferIdAndMessage message(Message message) {
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

  public StockTransferIdAndMessage stockTransferId(String stockTransferId) {
    this.stockTransferId = stockTransferId;
    return this;
  }

  /**
   * Refers to {StockTransfer.id}
   * @return stockTransferId
  **/
  @ApiModelProperty(value = "Refers to {StockTransfer.id}")


  public String getStockTransferId() {
    return stockTransferId;
  }

  public void setStockTransferId(String stockTransferId) {
    this.stockTransferId = stockTransferId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StockTransferIdAndMessage stockTransferIdAndMessage = (StockTransferIdAndMessage) o;
    return Objects.equals(this.message, stockTransferIdAndMessage.message) &&
        Objects.equals(this.stockTransferId, stockTransferIdAndMessage.stockTransferId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, stockTransferId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockTransferIdAndMessage {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    stockTransferId: ").append(toIndentedString(stockTransferId)).append("\n");
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

