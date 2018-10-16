package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.FailedOrderAndMessage;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contains the results after a {UploadedOrder}s of a file were uploaded
 */
@ApiModel(description = "Contains the results after a {UploadedOrder}s of a file were uploaded")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class UploadedFileResult   {
  @JsonProperty("failedOrders")
  @Valid
  private List<FailedOrderAndMessage> failedOrders = null;

  @JsonProperty("totalNumber")
  private Long totalNumber = null;

  public UploadedFileResult failedOrders(List<FailedOrderAndMessage> failedOrders) {
    this.failedOrders = failedOrders;
    return this;
  }

  public UploadedFileResult addFailedOrdersItem(FailedOrderAndMessage failedOrdersItem) {
    if (this.failedOrders == null) {
      this.failedOrders = new ArrayList<>();
    }
    this.failedOrders.add(failedOrdersItem);
    return this;
  }

  /**
   * The array of the indexes in the input file that contains {UploadedOrder}s that weren't uploaded, and their error messages
   * @return failedOrders
  **/
  @ApiModelProperty(value = "The array of the indexes in the input file that contains {UploadedOrder}s that weren't uploaded, and their error messages")

  @Valid

  public List<FailedOrderAndMessage> getFailedOrders() {
    return failedOrders;
  }

  public void setFailedOrders(List<FailedOrderAndMessage> failedOrders) {
    this.failedOrders = failedOrders;
  }

  public UploadedFileResult totalNumber(Long totalNumber) {
    this.totalNumber = totalNumber;
    return this;
  }

  /**
   * The total number of {UploadedOrder}s included in the file that was uploaded
   * @return totalNumber
  **/
  @ApiModelProperty(value = "The total number of {UploadedOrder}s included in the file that was uploaded")


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
    UploadedFileResult uploadedFileResult = (UploadedFileResult) o;
    return Objects.equals(this.failedOrders, uploadedFileResult.failedOrders) &&
        Objects.equals(this.totalNumber, uploadedFileResult.totalNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failedOrders, totalNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadedFileResult {\n");
    
    sb.append("    failedOrders: ").append(toIndentedString(failedOrders)).append("\n");
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

