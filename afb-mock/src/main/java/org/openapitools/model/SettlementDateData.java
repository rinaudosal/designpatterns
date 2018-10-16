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
 * Contains data about different dates associated to the {Settlement}
 */
@ApiModel(description = "Contains data about different dates associated to the {Settlement}")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SettlementDateData   {
  @JsonProperty("paymentDate")
  private OffsetDateTime paymentDate = null;

  @JsonProperty("settledDate")
  private OffsetDateTime settledDate = null;

  @JsonProperty("transactionOrderedDate")
  private OffsetDateTime transactionOrderedDate = null;

  public SettlementDateData paymentDate(OffsetDateTime paymentDate) {
    this.paymentDate = paymentDate;
    return this;
  }

  /**
   * The theorical payment date associated to the {Settlement}.
   * @return paymentDate
  **/
  @ApiModelProperty(value = "The theorical payment date associated to the {Settlement}.")

  @Valid

  public OffsetDateTime getPaymentDate() {
    return paymentDate;
  }

  public void setPaymentDate(OffsetDateTime paymentDate) {
    this.paymentDate = paymentDate;
  }

  public SettlementDateData settledDate(OffsetDateTime settledDate) {
    this.settledDate = settledDate;
    return this;
  }

  /**
   * This is the date when the payment was done.
   * @return settledDate
  **/
  @ApiModelProperty(value = "This is the date when the payment was done.")

  @Valid

  public OffsetDateTime getSettledDate() {
    return settledDate;
  }

  public void setSettledDate(OffsetDateTime settledDate) {
    this.settledDate = settledDate;
  }

  public SettlementDateData transactionOrderedDate(OffsetDateTime transactionOrderedDate) {
    this.transactionOrderedDate = transactionOrderedDate;
    return this;
  }

  /**
   * The date when the {Transaction} associated to the {Settlement} was ordered. This is the same date as {TransactionDateData.orderedDate}
   * @return transactionOrderedDate
  **/
  @ApiModelProperty(value = "The date when the {Transaction} associated to the {Settlement} was ordered. This is the same date as {TransactionDateData.orderedDate}")

  @Valid

  public OffsetDateTime getTransactionOrderedDate() {
    return transactionOrderedDate;
  }

  public void setTransactionOrderedDate(OffsetDateTime transactionOrderedDate) {
    this.transactionOrderedDate = transactionOrderedDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettlementDateData settlementDateData = (SettlementDateData) o;
    return Objects.equals(this.paymentDate, settlementDateData.paymentDate) &&
        Objects.equals(this.settledDate, settlementDateData.settledDate) &&
        Objects.equals(this.transactionOrderedDate, settlementDateData.transactionOrderedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentDate, settledDate, transactionOrderedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettlementDateData {\n");
    
    sb.append("    paymentDate: ").append(toIndentedString(paymentDate)).append("\n");
    sb.append("    settledDate: ").append(toIndentedString(settledDate)).append("\n");
    sb.append("    transactionOrderedDate: ").append(toIndentedString(transactionOrderedDate)).append("\n");
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

