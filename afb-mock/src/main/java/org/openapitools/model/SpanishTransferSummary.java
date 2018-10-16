package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.SpanishTransferBasicData;
import org.openapitools.model.SpanishTransferItem;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SpanishTransferSummary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SpanishTransferSummary   {
  @JsonProperty("basicData")
  private SpanishTransferBasicData basicData = null;

  @JsonProperty("destinationItem")
  private SpanishTransferItem destinationItem = null;

  @JsonProperty("rejectionCauseCode")
  private String rejectionCauseCode = null;

  @JsonProperty("requestStatusCode")
  private String requestStatusCode = null;

  @JsonProperty("sourceItem")
  private SpanishTransferItem sourceItem = null;

  @JsonProperty("spanishTransferId")
  private String spanishTransferId = null;

  public SpanishTransferSummary basicData(SpanishTransferBasicData basicData) {
    this.basicData = basicData;
    return this;
  }

  /**
   * Get basicData
   * @return basicData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SpanishTransferBasicData getBasicData() {
    return basicData;
  }

  public void setBasicData(SpanishTransferBasicData basicData) {
    this.basicData = basicData;
  }

  public SpanishTransferSummary destinationItem(SpanishTransferItem destinationItem) {
    this.destinationItem = destinationItem;
    return this;
  }

  /**
   * Get destinationItem
   * @return destinationItem
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SpanishTransferItem getDestinationItem() {
    return destinationItem;
  }

  public void setDestinationItem(SpanishTransferItem destinationItem) {
    this.destinationItem = destinationItem;
  }

  public SpanishTransferSummary rejectionCauseCode(String rejectionCauseCode) {
    this.rejectionCauseCode = rejectionCauseCode;
    return this;
  }

  /**
   * Refers to {listSpanishTransferRejectionCauses}. Informed only in requestStatusCode is REJECTED.
   * @return rejectionCauseCode
  **/
  @ApiModelProperty(value = "Refers to {listSpanishTransferRejectionCauses}. Informed only in requestStatusCode is REJECTED.")


  public String getRejectionCauseCode() {
    return rejectionCauseCode;
  }

  public void setRejectionCauseCode(String rejectionCauseCode) {
    this.rejectionCauseCode = rejectionCauseCode;
  }

  public SpanishTransferSummary requestStatusCode(String requestStatusCode) {
    this.requestStatusCode = requestStatusCode;
    return this;
  }

  /**
   * Refers to {listSpanishTransferStatuses}.
   * @return requestStatusCode
  **/
  @ApiModelProperty(value = "Refers to {listSpanishTransferStatuses}.")


  public String getRequestStatusCode() {
    return requestStatusCode;
  }

  public void setRequestStatusCode(String requestStatusCode) {
    this.requestStatusCode = requestStatusCode;
  }

  public SpanishTransferSummary sourceItem(SpanishTransferItem sourceItem) {
    this.sourceItem = sourceItem;
    return this;
  }

  /**
   * Get sourceItem
   * @return sourceItem
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SpanishTransferItem getSourceItem() {
    return sourceItem;
  }

  public void setSourceItem(SpanishTransferItem sourceItem) {
    this.sourceItem = sourceItem;
  }

  public SpanishTransferSummary spanishTransferId(String spanishTransferId) {
    this.spanishTransferId = spanishTransferId;
    return this;
  }

  /**
   * The Id of the {SpanishTransfer}
   * @return spanishTransferId
  **/
  @ApiModelProperty(value = "The Id of the {SpanishTransfer}")


  public String getSpanishTransferId() {
    return spanishTransferId;
  }

  public void setSpanishTransferId(String spanishTransferId) {
    this.spanishTransferId = spanishTransferId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpanishTransferSummary spanishTransferSummary = (SpanishTransferSummary) o;
    return Objects.equals(this.basicData, spanishTransferSummary.basicData) &&
        Objects.equals(this.destinationItem, spanishTransferSummary.destinationItem) &&
        Objects.equals(this.rejectionCauseCode, spanishTransferSummary.rejectionCauseCode) &&
        Objects.equals(this.requestStatusCode, spanishTransferSummary.requestStatusCode) &&
        Objects.equals(this.sourceItem, spanishTransferSummary.sourceItem) &&
        Objects.equals(this.spanishTransferId, spanishTransferSummary.spanishTransferId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(basicData, destinationItem, rejectionCauseCode, requestStatusCode, sourceItem, spanishTransferId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpanishTransferSummary {\n");
    
    sb.append("    basicData: ").append(toIndentedString(basicData)).append("\n");
    sb.append("    destinationItem: ").append(toIndentedString(destinationItem)).append("\n");
    sb.append("    rejectionCauseCode: ").append(toIndentedString(rejectionCauseCode)).append("\n");
    sb.append("    requestStatusCode: ").append(toIndentedString(requestStatusCode)).append("\n");
    sb.append("    sourceItem: ").append(toIndentedString(sourceItem)).append("\n");
    sb.append("    spanishTransferId: ").append(toIndentedString(spanishTransferId)).append("\n");
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

