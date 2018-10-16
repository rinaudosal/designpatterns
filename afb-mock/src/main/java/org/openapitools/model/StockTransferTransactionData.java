package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.model.ResourceReference;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This object keeps information about the principal {Transaction} associated to the  {StockTransfer}.
 */
@ApiModel(description = "This object keeps information about the principal {Transaction} associated to the  {StockTransfer}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class StockTransferTransactionData   {
  @JsonProperty("externalReference")
  private String externalReference = null;

  @JsonProperty("orderedDate")
  private OffsetDateTime orderedDate = null;

  @JsonProperty("transaction")
  private ResourceReference transaction = null;

  public StockTransferTransactionData externalReference(String externalReference) {
    this.externalReference = externalReference;
    return this;
  }

  /**
   * The {Transaction.externalReference} associated to the {StockTransfer}
   * @return externalReference
  **/
  @ApiModelProperty(value = "The {Transaction.externalReference} associated to the {StockTransfer}")


  public String getExternalReference() {
    return externalReference;
  }

  public void setExternalReference(String externalReference) {
    this.externalReference = externalReference;
  }

  public StockTransferTransactionData orderedDate(OffsetDateTime orderedDate) {
    this.orderedDate = orderedDate;
    return this;
  }

  /**
   * The ordered date of the {Transaction}'s {TransactionDateData.orderedDate}  associated to the {StockTransfer}.
   * @return orderedDate
  **/
  @ApiModelProperty(value = "The ordered date of the {Transaction}'s {TransactionDateData.orderedDate}  associated to the {StockTransfer}.")

  @Valid

  public OffsetDateTime getOrderedDate() {
    return orderedDate;
  }

  public void setOrderedDate(OffsetDateTime orderedDate) {
    this.orderedDate = orderedDate;
  }

  public StockTransferTransactionData transaction(ResourceReference transaction) {
    this.transaction = transaction;
    return this;
  }

  /**
   * Get transaction
   * @return transaction
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ResourceReference getTransaction() {
    return transaction;
  }

  public void setTransaction(ResourceReference transaction) {
    this.transaction = transaction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StockTransferTransactionData stockTransferTransactionData = (StockTransferTransactionData) o;
    return Objects.equals(this.externalReference, stockTransferTransactionData.externalReference) &&
        Objects.equals(this.orderedDate, stockTransferTransactionData.orderedDate) &&
        Objects.equals(this.transaction, stockTransferTransactionData.transaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalReference, orderedDate, transaction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockTransferTransactionData {\n");
    
    sb.append("    externalReference: ").append(toIndentedString(externalReference)).append("\n");
    sb.append("    orderedDate: ").append(toIndentedString(orderedDate)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
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

