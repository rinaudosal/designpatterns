package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Signature;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TransactionIdsAndSignature
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class TransactionIdsAndSignature   {
  @JsonProperty("signature")
  private Signature signature = null;

  @JsonProperty("transactionIds")
  @Valid
  private List<Long> transactionIds = null;

  public TransactionIdsAndSignature signature(Signature signature) {
    this.signature = signature;
    return this;
  }

  /**
   * Get signature
   * @return signature
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Signature getSignature() {
    return signature;
  }

  public void setSignature(Signature signature) {
    this.signature = signature;
  }

  public TransactionIdsAndSignature transactionIds(List<Long> transactionIds) {
    this.transactionIds = transactionIds;
    return this;
  }

  public TransactionIdsAndSignature addTransactionIdsItem(Long transactionIdsItem) {
    if (this.transactionIds == null) {
      this.transactionIds = new ArrayList<>();
    }
    this.transactionIds.add(transactionIdsItem);
    return this;
  }

  /**
   * The array of ids of {SpanishTransfer}
   * @return transactionIds
  **/
  @ApiModelProperty(value = "The array of ids of {SpanishTransfer}")


  public List<Long> getTransactionIds() {
    return transactionIds;
  }

  public void setTransactionIds(List<Long> transactionIds) {
    this.transactionIds = transactionIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionIdsAndSignature transactionIdsAndSignature = (TransactionIdsAndSignature) o;
    return Objects.equals(this.signature, transactionIdsAndSignature.signature) &&
        Objects.equals(this.transactionIds, transactionIdsAndSignature.transactionIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signature, transactionIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionIdsAndSignature {\n");
    
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    transactionIds: ").append(toIndentedString(transactionIds)).append("\n");
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

