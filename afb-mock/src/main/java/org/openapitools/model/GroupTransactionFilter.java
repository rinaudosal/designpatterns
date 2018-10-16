package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This object is a filter used for retrieve a transction list filtered by some criteria
 */
@ApiModel(description = "This object is a filter used for retrieve a transction list filtered by some criteria")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class GroupTransactionFilter   {
  @JsonProperty("showConfirmed")
  private Boolean showConfirmed = null;

  @JsonProperty("subdistributorId")
  private Long subdistributorId = null;

  @JsonProperty("transactionId")
  private Long transactionId = null;

  public GroupTransactionFilter showConfirmed(Boolean showConfirmed) {
    this.showConfirmed = showConfirmed;
    return this;
  }

  /**
   * Indicates whether the indivial transactions are confirmed or not. Aqui viene el valor del attributo Transaction.settings.blablabla
   * @return showConfirmed
  **/
  @ApiModelProperty(value = "Indicates whether the indivial transactions are confirmed or not. Aqui viene el valor del attributo Transaction.settings.blablabla")


  public Boolean getShowConfirmed() {
    return showConfirmed;
  }

  public void setShowConfirmed(Boolean showConfirmed) {
    this.showConfirmed = showConfirmed;
  }

  public GroupTransactionFilter subdistributorId(Long subdistributorId) {
    this.subdistributorId = subdistributorId;
    return this;
  }

  /**
   * The Id of the {Subdistributor}
   * @return subdistributorId
  **/
  @ApiModelProperty(value = "The Id of the {Subdistributor}")


  public Long getSubdistributorId() {
    return subdistributorId;
  }

  public void setSubdistributorId(Long subdistributorId) {
    this.subdistributorId = subdistributorId;
  }

  public GroupTransactionFilter transactionId(Long transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  /**
   * The id of the transction (whose {TransactionSettingsData.grouped} is true), for which to lookup the subjacent {Transaction}.
   * @return transactionId
  **/
  @ApiModelProperty(value = "The id of the transction (whose {TransactionSettingsData.grouped} is true), for which to lookup the subjacent {Transaction}.")


  public Long getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(Long transactionId) {
    this.transactionId = transactionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupTransactionFilter groupTransactionFilter = (GroupTransactionFilter) o;
    return Objects.equals(this.showConfirmed, groupTransactionFilter.showConfirmed) &&
        Objects.equals(this.subdistributorId, groupTransactionFilter.subdistributorId) &&
        Objects.equals(this.transactionId, groupTransactionFilter.transactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(showConfirmed, subdistributorId, transactionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupTransactionFilter {\n");
    
    sb.append("    showConfirmed: ").append(toIndentedString(showConfirmed)).append("\n");
    sb.append("    subdistributorId: ").append(toIndentedString(subdistributorId)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
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

