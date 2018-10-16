package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.FailedStockTransferAndMessage;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contains the results after a {UploadedStockTransfer}s of a file were uploaded
 */
@ApiModel(description = "Contains the results after a {UploadedStockTransfer}s of a file were uploaded")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class UploadedFileStockTransferResult   {
  @JsonProperty("failedStockTransfers")
  @Valid
  private List<FailedStockTransferAndMessage> failedStockTransfers = null;

  @JsonProperty("totalNumber")
  private Long totalNumber = null;

  public UploadedFileStockTransferResult failedStockTransfers(List<FailedStockTransferAndMessage> failedStockTransfers) {
    this.failedStockTransfers = failedStockTransfers;
    return this;
  }

  public UploadedFileStockTransferResult addFailedStockTransfersItem(FailedStockTransferAndMessage failedStockTransfersItem) {
    if (this.failedStockTransfers == null) {
      this.failedStockTransfers = new ArrayList<>();
    }
    this.failedStockTransfers.add(failedStockTransfersItem);
    return this;
  }

  /**
   * The array of the indexes in the input file that contains {UploadedStockTransfer}s that weren't uploaded, and their error messages
   * @return failedStockTransfers
  **/
  @ApiModelProperty(value = "The array of the indexes in the input file that contains {UploadedStockTransfer}s that weren't uploaded, and their error messages")

  @Valid

  public List<FailedStockTransferAndMessage> getFailedStockTransfers() {
    return failedStockTransfers;
  }

  public void setFailedStockTransfers(List<FailedStockTransferAndMessage> failedStockTransfers) {
    this.failedStockTransfers = failedStockTransfers;
  }

  public UploadedFileStockTransferResult totalNumber(Long totalNumber) {
    this.totalNumber = totalNumber;
    return this;
  }

  /**
   * The total number of {UploadedStockTransfer}s included in the file that was uploaded
   * @return totalNumber
  **/
  @ApiModelProperty(value = "The total number of {UploadedStockTransfer}s included in the file that was uploaded")


  public Long getTotalNumber() {
    return totalNumber;
  }

  public void setTotalNumber(Long totalNumber) {
    this.totalNumber = totalNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadedFileStockTransferResult uploadedFileStockTransferResult = (UploadedFileStockTransferResult) o;
    return Objects.equals(this.failedStockTransfers, uploadedFileStockTransferResult.failedStockTransfers) &&
        Objects.equals(this.totalNumber, uploadedFileStockTransferResult.totalNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failedStockTransfers, totalNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadedFileStockTransferResult {\n");
    
    sb.append("    failedStockTransfers: ").append(toIndentedString(failedStockTransfers)).append("\n");
    sb.append("    totalNumber: ").append(toIndentedString(totalNumber)).append("\n");
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

