package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This object keeps information about the internal {StockTransfer}. Will only be informed for {StockTransfer} whose {StockTransferBasicData.stockTransferTypeCode} is set to &#x60;INTERNAL&#x60; .
 */
@ApiModel(description = "This object keeps information about the internal {StockTransfer}. Will only be informed for {StockTransfer} whose {StockTransferBasicData.stockTransferTypeCode} is set to `INTERNAL` .")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class InternalStockTransferData   {
  @JsonProperty("associatedContractExternalReference")
  private String associatedContractExternalReference = null;

  @JsonProperty("associatedProductId")
  private Long associatedProductId = null;

  @JsonProperty("associatedTransactionExternalReference")
  private String associatedTransactionExternalReference = null;

  public InternalStockTransferData associatedContractExternalReference(String associatedContractExternalReference) {
    this.associatedContractExternalReference = associatedContractExternalReference;
    return this;
  }

  /**
   * The {Contract.externalReference} of the secondary {Transaction} associated with this {StockTransfer}.
   * @return associatedContractExternalReference
  **/
  @ApiModelProperty(value = "The {Contract.externalReference} of the secondary {Transaction} associated with this {StockTransfer}.")


  public String getAssociatedContractExternalReference() {
    return associatedContractExternalReference;
  }

  public void setAssociatedContractExternalReference(String associatedContractExternalReference) {
    this.associatedContractExternalReference = associatedContractExternalReference;
  }

  public InternalStockTransferData associatedProductId(Long associatedProductId) {
    this.associatedProductId = associatedProductId;
    return this;
  }

  /**
   * The {Product.id} of the secondary {Transaction} associated with this {StockTransfer}.
   * @return associatedProductId
  **/
  @ApiModelProperty(value = "The {Product.id} of the secondary {Transaction} associated with this {StockTransfer}.")


  public Long getAssociatedProductId() {
    return associatedProductId;
  }

  public void setAssociatedProductId(Long associatedProductId) {
    this.associatedProductId = associatedProductId;
  }

  public InternalStockTransferData associatedTransactionExternalReference(String associatedTransactionExternalReference) {
    this.associatedTransactionExternalReference = associatedTransactionExternalReference;
    return this;
  }

  /**
   * The {Transaction.externalReference} of the secondary {Transaction} associated with this {StockTransfer}.
   * @return associatedTransactionExternalReference
  **/
  @ApiModelProperty(value = "The {Transaction.externalReference} of the secondary {Transaction} associated with this {StockTransfer}.")


  public String getAssociatedTransactionExternalReference() {
    return associatedTransactionExternalReference;
  }

  public void setAssociatedTransactionExternalReference(String associatedTransactionExternalReference) {
    this.associatedTransactionExternalReference = associatedTransactionExternalReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InternalStockTransferData internalStockTransferData = (InternalStockTransferData) o;
    return Objects.equals(this.associatedContractExternalReference, internalStockTransferData.associatedContractExternalReference) &&
        Objects.equals(this.associatedProductId, internalStockTransferData.associatedProductId) &&
        Objects.equals(this.associatedTransactionExternalReference, internalStockTransferData.associatedTransactionExternalReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(associatedContractExternalReference, associatedProductId, associatedTransactionExternalReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InternalStockTransferData {\n");
    
    sb.append("    associatedContractExternalReference: ").append(toIndentedString(associatedContractExternalReference)).append("\n");
    sb.append("    associatedProductId: ").append(toIndentedString(associatedProductId)).append("\n");
    sb.append("    associatedTransactionExternalReference: ").append(toIndentedString(associatedTransactionExternalReference)).append("\n");
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

