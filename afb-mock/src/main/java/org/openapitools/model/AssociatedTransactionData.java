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
 * AssociatedTransactionData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class AssociatedTransactionData   {
  @JsonProperty("transaction")
  private ResourceReference transaction = null;

  @JsonProperty("valueDate")
  private OffsetDateTime valueDate = null;

  public AssociatedTransactionData transaction(ResourceReference transaction) {
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

  public AssociatedTransactionData valueDate(OffsetDateTime valueDate) {
    this.valueDate = valueDate;
    return this;
  }

  /**
   * The date of the {Transaction} associated to the {TaxTransaction}
   * @return valueDate
  **/
  @ApiModelProperty(value = "The date of the {Transaction} associated to the {TaxTransaction}")

  @Valid

  public OffsetDateTime getValueDate() {
    return valueDate;
  }

  public void setValueDate(OffsetDateTime valueDate) {
    this.valueDate = valueDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssociatedTransactionData associatedTransactionData = (AssociatedTransactionData) o;
    return Objects.equals(this.transaction, associatedTransactionData.transaction) &&
        Objects.equals(this.valueDate, associatedTransactionData.valueDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transaction, valueDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssociatedTransactionData {\n");
    
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
    sb.append("    valueDate: ").append(toIndentedString(valueDate)).append("\n");
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

