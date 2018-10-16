package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SpanishTransferRequestDate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SpanishTransferRequestDate   {
  @JsonProperty("date")
  private OffsetDateTime date = null;

  @JsonProperty("numberOfRequests")
  private Long numberOfRequests = null;

  @JsonProperty("pendingDays")
  private Long pendingDays = null;

  public SpanishTransferRequestDate date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

  /**
   * A date in which there are some {SpanishTransfer} requests.
   * @return date
  **/
  @ApiModelProperty(value = "A date in which there are some {SpanishTransfer} requests.")

  @Valid

  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public SpanishTransferRequestDate numberOfRequests(Long numberOfRequests) {
    this.numberOfRequests = numberOfRequests;
    return this;
  }

  /**
   * Refers to the number of {SpanishTransfersRequest}s for this date.
   * @return numberOfRequests
  **/
  @ApiModelProperty(value = "Refers to the number of {SpanishTransfersRequest}s for this date.")


  public Long getNumberOfRequests() {
    return numberOfRequests;
  }

  public void setNumberOfRequests(Long numberOfRequests) {
    this.numberOfRequests = numberOfRequests;
  }

  public SpanishTransferRequestDate pendingDays(Long pendingDays) {
    this.pendingDays = pendingDays;
    return this;
  }

  /**
   * null
   * @return pendingDays
  **/
  @ApiModelProperty(value = "null")


  public Long getPendingDays() {
    return pendingDays;
  }

  public void setPendingDays(Long pendingDays) {
    this.pendingDays = pendingDays;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpanishTransferRequestDate spanishTransferRequestDate = (SpanishTransferRequestDate) o;
    return Objects.equals(this.date, spanishTransferRequestDate.date) &&
        Objects.equals(this.numberOfRequests, spanishTransferRequestDate.numberOfRequests) &&
        Objects.equals(this.pendingDays, spanishTransferRequestDate.pendingDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, numberOfRequests, pendingDays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpanishTransferRequestDate {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    numberOfRequests: ").append(toIndentedString(numberOfRequests)).append("\n");
    sb.append("    pendingDays: ").append(toIndentedString(pendingDays)).append("\n");
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

