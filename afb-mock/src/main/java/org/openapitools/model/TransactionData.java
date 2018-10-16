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
 * TransactionData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class TransactionData   {
  @JsonProperty("amount")
  private Double amount = null;

  @JsonProperty("destinationDate")
  private OffsetDateTime destinationDate = null;

  @JsonProperty("externalReference")
  private Long externalReference = null;

  @JsonProperty("sourceDate")
  private OffsetDateTime sourceDate = null;

  @JsonProperty("transactionCode")
  private String transactionCode = null;

  @JsonProperty("transferClass")
  private String transferClass = null;

  @JsonProperty("transferType")
  private String transferType = null;

  @JsonProperty("units")
  private Long units = null;

  public TransactionData amount(Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Amount
   * @return amount
  **/
  @ApiModelProperty(value = "Amount")


  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public TransactionData destinationDate(OffsetDateTime destinationDate) {
    this.destinationDate = destinationDate;
    return this;
  }

  /**
   * Destination date
   * @return destinationDate
  **/
  @ApiModelProperty(value = "Destination date")

  @Valid

  public OffsetDateTime getDestinationDate() {
    return destinationDate;
  }

  public void setDestinationDate(OffsetDateTime destinationDate) {
    this.destinationDate = destinationDate;
  }

  public TransactionData externalReference(Long externalReference) {
    this.externalReference = externalReference;
    return this;
  }

  /**
   * External Reference
   * @return externalReference
  **/
  @ApiModelProperty(value = "External Reference")


  public Long getExternalReference() {
    return externalReference;
  }

  public void setExternalReference(Long externalReference) {
    this.externalReference = externalReference;
  }

  public TransactionData sourceDate(OffsetDateTime sourceDate) {
    this.sourceDate = sourceDate;
    return this;
  }

  /**
   * Source date
   * @return sourceDate
  **/
  @ApiModelProperty(value = "Source date")

  @Valid

  public OffsetDateTime getSourceDate() {
    return sourceDate;
  }

  public void setSourceDate(OffsetDateTime sourceDate) {
    this.sourceDate = sourceDate;
  }

  public TransactionData transactionCode(String transactionCode) {
    this.transactionCode = transactionCode;
    return this;
  }

  /**
   * Transaction Code
   * @return transactionCode
  **/
  @ApiModelProperty(value = "Transaction Code")


  public String getTransactionCode() {
    return transactionCode;
  }

  public void setTransactionCode(String transactionCode) {
    this.transactionCode = transactionCode;
  }

  public TransactionData transferClass(String transferClass) {
    this.transferClass = transferClass;
    return this;
  }

  /**
   * Transfer class
   * @return transferClass
  **/
  @ApiModelProperty(value = "Transfer class")


  public String getTransferClass() {
    return transferClass;
  }

  public void setTransferClass(String transferClass) {
    this.transferClass = transferClass;
  }

  public TransactionData transferType(String transferType) {
    this.transferType = transferType;
    return this;
  }

  /**
   * Transfer Type (Total, Partial)
   * @return transferType
  **/
  @ApiModelProperty(value = "Transfer Type (Total, Partial)")


  public String getTransferType() {
    return transferType;
  }

  public void setTransferType(String transferType) {
    this.transferType = transferType;
  }

  public TransactionData units(Long units) {
    this.units = units;
    return this;
  }

  /**
   * Units
   * @return units
  **/
  @ApiModelProperty(value = "Units")


  public Long getUnits() {
    return units;
  }

  public void setUnits(Long units) {
    this.units = units;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionData transactionData = (TransactionData) o;
    return Objects.equals(this.amount, transactionData.amount) &&
        Objects.equals(this.destinationDate, transactionData.destinationDate) &&
        Objects.equals(this.externalReference, transactionData.externalReference) &&
        Objects.equals(this.sourceDate, transactionData.sourceDate) &&
        Objects.equals(this.transactionCode, transactionData.transactionCode) &&
        Objects.equals(this.transferClass, transactionData.transferClass) &&
        Objects.equals(this.transferType, transactionData.transferType) &&
        Objects.equals(this.units, transactionData.units);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, destinationDate, externalReference, sourceDate, transactionCode, transferClass, transferType, units);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionData {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    destinationDate: ").append(toIndentedString(destinationDate)).append("\n");
    sb.append("    externalReference: ").append(toIndentedString(externalReference)).append("\n");
    sb.append("    sourceDate: ").append(toIndentedString(sourceDate)).append("\n");
    sb.append("    transactionCode: ").append(toIndentedString(transactionCode)).append("\n");
    sb.append("    transferClass: ").append(toIndentedString(transferClass)).append("\n");
    sb.append("    transferType: ").append(toIndentedString(transferType)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
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

