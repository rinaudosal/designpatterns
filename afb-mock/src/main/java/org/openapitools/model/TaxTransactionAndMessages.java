package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Message;
import org.openapitools.model.TaxTransaction;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TaxTransactionAndMessages
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class TaxTransactionAndMessages   {
  @JsonProperty("message")
  private Message message = null;

  @JsonProperty("taxTransaction")
  private TaxTransaction taxTransaction = null;

  public TaxTransactionAndMessages message(Message message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Message getMessage() {
    return message;
  }

  public void setMessage(Message message) {
    this.message = message;
  }

  public TaxTransactionAndMessages taxTransaction(TaxTransaction taxTransaction) {
    this.taxTransaction = taxTransaction;
    return this;
  }

  /**
   * Get taxTransaction
   * @return taxTransaction
  **/
  @ApiModelProperty(value = "")

  @Valid

  public TaxTransaction getTaxTransaction() {
    return taxTransaction;
  }

  public void setTaxTransaction(TaxTransaction taxTransaction) {
    this.taxTransaction = taxTransaction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxTransactionAndMessages taxTransactionAndMessages = (TaxTransactionAndMessages) o;
    return Objects.equals(this.message, taxTransactionAndMessages.message) &&
        Objects.equals(this.taxTransaction, taxTransactionAndMessages.taxTransaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, taxTransaction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxTransactionAndMessages {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    taxTransaction: ").append(toIndentedString(taxTransaction)).append("\n");
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

