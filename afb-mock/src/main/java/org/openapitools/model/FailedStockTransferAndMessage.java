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
 * FailedStockTransferAndMessage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class FailedStockTransferAndMessage   {
  @JsonProperty("inputFileRow")
  private Long inputFileRow = null;

  @JsonProperty("message")
  private Message message = null;

  public FailedStockTransferAndMessage inputFileRow(Long inputFileRow) {
    this.inputFileRow = inputFileRow;
    return this;
  }

  /**
   * The row, in the input file, of a {UploadedStockTransfer} that weren't uploaded.
   * @return inputFileRow
  **/
  @ApiModelProperty(value = "The row, in the input file, of a {UploadedStockTransfer} that weren't uploaded.")


  public Long getInputFileRow() {
    return inputFileRow;
  }

  public void setInputFileRow(Long inputFileRow) {
    this.inputFileRow = inputFileRow;
  }

  public FailedStockTransferAndMessage message(Message message) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FailedStockTransferAndMessage failedStockTransferAndMessage = (FailedStockTransferAndMessage) o;
    return Objects.equals(this.inputFileRow, failedStockTransferAndMessage.inputFileRow) &&
        Objects.equals(this.message, failedStockTransferAndMessage.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputFileRow, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FailedStockTransferAndMessage {\n");
    
    sb.append("    inputFileRow: ").append(toIndentedString(inputFileRow)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

