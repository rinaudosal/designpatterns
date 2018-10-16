package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ContractAccount;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This object keeps  information about the contract associated to the transaction.
 */
@ApiModel(description = "This object keeps  information about the contract associated to the transaction.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class TransactionContractData   {
  @JsonProperty("contractAccount")
  private ContractAccount contractAccount = null;

  @JsonProperty("contractExternalReference")
  private String contractExternalReference = null;

  public TransactionContractData contractAccount(ContractAccount contractAccount) {
    this.contractAccount = contractAccount;
    return this;
  }

  /**
   * Get contractAccount
   * @return contractAccount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ContractAccount getContractAccount() {
    return contractAccount;
  }

  public void setContractAccount(ContractAccount contractAccount) {
    this.contractAccount = contractAccount;
  }

  public TransactionContractData contractExternalReference(String contractExternalReference) {
    this.contractExternalReference = contractExternalReference;
    return this;
  }

  /**
   * Contract External Reference
   * @return contractExternalReference
  **/
  @ApiModelProperty(value = "Contract External Reference")


  public String getContractExternalReference() {
    return contractExternalReference;
  }

  public void setContractExternalReference(String contractExternalReference) {
    this.contractExternalReference = contractExternalReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionContractData transactionContractData = (TransactionContractData) o;
    return Objects.equals(this.contractAccount, transactionContractData.contractAccount) &&
        Objects.equals(this.contractExternalReference, transactionContractData.contractExternalReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractAccount, contractExternalReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionContractData {\n");
    
    sb.append("    contractAccount: ").append(toIndentedString(contractAccount)).append("\n");
    sb.append("    contractExternalReference: ").append(toIndentedString(contractExternalReference)).append("\n");
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

