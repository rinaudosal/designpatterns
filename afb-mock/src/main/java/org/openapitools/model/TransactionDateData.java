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
 * This object keeps information about relevant dates related to the transaction.
 */
@ApiModel(description = "This object keeps information about relevant dates related to the transaction.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class TransactionDateData   {
  @JsonProperty("cancellationDate")
  private OffsetDateTime cancellationDate = null;

  @JsonProperty("confirmationDate")
  private OffsetDateTime confirmationDate = null;

  @JsonProperty("cutoffDate")
  private OffsetDateTime cutoffDate = null;

  @JsonProperty("orderedDate")
  private OffsetDateTime orderedDate = null;

  @JsonProperty("settlementDate")
  private OffsetDateTime settlementDate = null;

  public TransactionDateData cancellationDate(OffsetDateTime cancellationDate) {
    this.cancellationDate = cancellationDate;
    return this;
  }

  /**
   * Date when the transaction was cancelled.
   * @return cancellationDate
  **/
  @ApiModelProperty(value = "Date when the transaction was cancelled.")

  @Valid

  public OffsetDateTime getCancellationDate() {
    return cancellationDate;
  }

  public void setCancellationDate(OffsetDateTime cancellationDate) {
    this.cancellationDate = cancellationDate;
  }

  public TransactionDateData confirmationDate(OffsetDateTime confirmationDate) {
    this.confirmationDate = confirmationDate;
    return this;
  }

  /**
   * The {Transaction} confirmation date
   * @return confirmationDate
  **/
  @ApiModelProperty(value = "The {Transaction} confirmation date")

  @Valid

  public OffsetDateTime getConfirmationDate() {
    return confirmationDate;
  }

  public void setConfirmationDate(OffsetDateTime confirmationDate) {
    this.confirmationDate = confirmationDate;
  }

  public TransactionDateData cutoffDate(OffsetDateTime cutoffDate) {
    this.cutoffDate = cutoffDate;
    return this;
  }

  /**
   * The {Transaction} cutoff date
   * @return cutoffDate
  **/
  @ApiModelProperty(value = "The {Transaction} cutoff date")

  @Valid

  public OffsetDateTime getCutoffDate() {
    return cutoffDate;
  }

  public void setCutoffDate(OffsetDateTime cutoffDate) {
    this.cutoffDate = cutoffDate;
  }

  public TransactionDateData orderedDate(OffsetDateTime orderedDate) {
    this.orderedDate = orderedDate;
    return this;
  }

  /**
   * The {Transaction}'s ordered date
   * @return orderedDate
  **/
  @ApiModelProperty(value = "The {Transaction}'s ordered date")

  @Valid

  public OffsetDateTime getOrderedDate() {
    return orderedDate;
  }

  public void setOrderedDate(OffsetDateTime orderedDate) {
    this.orderedDate = orderedDate;
  }

  public TransactionDateData settlementDate(OffsetDateTime settlementDate) {
    this.settlementDate = settlementDate;
    return this;
  }

  /**
   * The date when the {Transaction} is settled
   * @return settlementDate
  **/
  @ApiModelProperty(value = "The date when the {Transaction} is settled")

  @Valid

  public OffsetDateTime getSettlementDate() {
    return settlementDate;
  }

  public void setSettlementDate(OffsetDateTime settlementDate) {
    this.settlementDate = settlementDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionDateData transactionDateData = (TransactionDateData) o;
    return Objects.equals(this.cancellationDate, transactionDateData.cancellationDate) &&
        Objects.equals(this.confirmationDate, transactionDateData.confirmationDate) &&
        Objects.equals(this.cutoffDate, transactionDateData.cutoffDate) &&
        Objects.equals(this.orderedDate, transactionDateData.orderedDate) &&
        Objects.equals(this.settlementDate, transactionDateData.settlementDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cancellationDate, confirmationDate, cutoffDate, orderedDate, settlementDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionDateData {\n");
    
    sb.append("    cancellationDate: ").append(toIndentedString(cancellationDate)).append("\n");
    sb.append("    confirmationDate: ").append(toIndentedString(confirmationDate)).append("\n");
    sb.append("    cutoffDate: ").append(toIndentedString(cutoffDate)).append("\n");
    sb.append("    orderedDate: ").append(toIndentedString(orderedDate)).append("\n");
    sb.append("    settlementDate: ").append(toIndentedString(settlementDate)).append("\n");
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

