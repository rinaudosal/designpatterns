package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This object keeps the basic information about a contract
 */
@ApiModel(description = "This object keeps the basic information about a contract")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class ContractSummary   {
  @JsonProperty("contractId")
  private Long contractId = null;

  @JsonProperty("distributorId")
  private Long distributorId = null;

  @JsonProperty("externalReference")
  private String externalReference = null;

  @JsonProperty("numberOfShareholders")
  private Long numberOfShareholders = null;

  @JsonProperty("principalHolderClientId")
  private String principalHolderClientId = null;

  @JsonProperty("principalHolderExternalReference")
  private String principalHolderExternalReference = null;

  @JsonProperty("principalHolderName")
  private String principalHolderName = null;

  @JsonProperty("principalHolderSecondSurname")
  private String principalHolderSecondSurname = null;

  @JsonProperty("principalHolderSurname")
  private String principalHolderSurname = null;

  @JsonProperty("subdistributorId")
  private Long subdistributorId = null;

  public ContractSummary contractId(Long contractId) {
    this.contractId = contractId;
    return this;
  }

  /**
   * The Id of the {Contract}
   * @return contractId
  **/
  @ApiModelProperty(value = "The Id of the {Contract}")


  public Long getContractId() {
    return contractId;
  }

  public void setContractId(Long contractId) {
    this.contractId = contractId;
  }

  public ContractSummary distributorId(Long distributorId) {
    this.distributorId = distributorId;
    return this;
  }

  /**
   * The Id of the {Distributor}
   * @return distributorId
  **/
  @ApiModelProperty(value = "The Id of the {Distributor}")


  public Long getDistributorId() {
    return distributorId;
  }

  public void setDistributorId(Long distributorId) {
    this.distributorId = distributorId;
  }

  public ContractSummary externalReference(String externalReference) {
    this.externalReference = externalReference;
    return this;
  }

  /**
   * External Reference associated to the contract
   * @return externalReference
  **/
  @ApiModelProperty(value = "External Reference associated to the contract")


  public String getExternalReference() {
    return externalReference;
  }

  public void setExternalReference(String externalReference) {
    this.externalReference = externalReference;
  }

  public ContractSummary numberOfShareholders(Long numberOfShareholders) {
    this.numberOfShareholders = numberOfShareholders;
    return this;
  }

  /**
   * Number of shareholders
   * @return numberOfShareholders
  **/
  @ApiModelProperty(value = "Number of shareholders")


  public Long getNumberOfShareholders() {
    return numberOfShareholders;
  }

  public void setNumberOfShareholders(Long numberOfShareholders) {
    this.numberOfShareholders = numberOfShareholders;
  }

  public ContractSummary principalHolderClientId(String principalHolderClientId) {
    this.principalHolderClientId = principalHolderClientId;
    return this;
  }

  /**
   * The Id of the {Client}
   * @return principalHolderClientId
  **/
  @ApiModelProperty(value = "The Id of the {Client}")


  public String getPrincipalHolderClientId() {
    return principalHolderClientId;
  }

  public void setPrincipalHolderClientId(String principalHolderClientId) {
    this.principalHolderClientId = principalHolderClientId;
  }

  public ContractSummary principalHolderExternalReference(String principalHolderExternalReference) {
    this.principalHolderExternalReference = principalHolderExternalReference;
    return this;
  }

  /**
   * The External Refernce of the {Client}
   * @return principalHolderExternalReference
  **/
  @ApiModelProperty(value = "The External Refernce of the {Client}")


  public String getPrincipalHolderExternalReference() {
    return principalHolderExternalReference;
  }

  public void setPrincipalHolderExternalReference(String principalHolderExternalReference) {
    this.principalHolderExternalReference = principalHolderExternalReference;
  }

  public ContractSummary principalHolderName(String principalHolderName) {
    this.principalHolderName = principalHolderName;
    return this;
  }

  /**
   * Principal contract holder Name
   * @return principalHolderName
  **/
  @ApiModelProperty(value = "Principal contract holder Name")


  public String getPrincipalHolderName() {
    return principalHolderName;
  }

  public void setPrincipalHolderName(String principalHolderName) {
    this.principalHolderName = principalHolderName;
  }

  public ContractSummary principalHolderSecondSurname(String principalHolderSecondSurname) {
    this.principalHolderSecondSurname = principalHolderSecondSurname;
    return this;
  }

  /**
   * Principal contract holder second Surname
   * @return principalHolderSecondSurname
  **/
  @ApiModelProperty(value = "Principal contract holder second Surname")


  public String getPrincipalHolderSecondSurname() {
    return principalHolderSecondSurname;
  }

  public void setPrincipalHolderSecondSurname(String principalHolderSecondSurname) {
    this.principalHolderSecondSurname = principalHolderSecondSurname;
  }

  public ContractSummary principalHolderSurname(String principalHolderSurname) {
    this.principalHolderSurname = principalHolderSurname;
    return this;
  }

  /**
   * Principal contract holder Surname
   * @return principalHolderSurname
  **/
  @ApiModelProperty(value = "Principal contract holder Surname")


  public String getPrincipalHolderSurname() {
    return principalHolderSurname;
  }

  public void setPrincipalHolderSurname(String principalHolderSurname) {
    this.principalHolderSurname = principalHolderSurname;
  }

  public ContractSummary subdistributorId(Long subdistributorId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractSummary contractSummary = (ContractSummary) o;
    return Objects.equals(this.contractId, contractSummary.contractId) &&
        Objects.equals(this.distributorId, contractSummary.distributorId) &&
        Objects.equals(this.externalReference, contractSummary.externalReference) &&
        Objects.equals(this.numberOfShareholders, contractSummary.numberOfShareholders) &&
        Objects.equals(this.principalHolderClientId, contractSummary.principalHolderClientId) &&
        Objects.equals(this.principalHolderExternalReference, contractSummary.principalHolderExternalReference) &&
        Objects.equals(this.principalHolderName, contractSummary.principalHolderName) &&
        Objects.equals(this.principalHolderSecondSurname, contractSummary.principalHolderSecondSurname) &&
        Objects.equals(this.principalHolderSurname, contractSummary.principalHolderSurname) &&
        Objects.equals(this.subdistributorId, contractSummary.subdistributorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractId, distributorId, externalReference, numberOfShareholders, principalHolderClientId, principalHolderExternalReference, principalHolderName, principalHolderSecondSurname, principalHolderSurname, subdistributorId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractSummary {\n");
    
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    distributorId: ").append(toIndentedString(distributorId)).append("\n");
    sb.append("    externalReference: ").append(toIndentedString(externalReference)).append("\n");
    sb.append("    numberOfShareholders: ").append(toIndentedString(numberOfShareholders)).append("\n");
    sb.append("    principalHolderClientId: ").append(toIndentedString(principalHolderClientId)).append("\n");
    sb.append("    principalHolderExternalReference: ").append(toIndentedString(principalHolderExternalReference)).append("\n");
    sb.append("    principalHolderName: ").append(toIndentedString(principalHolderName)).append("\n");
    sb.append("    principalHolderSecondSurname: ").append(toIndentedString(principalHolderSecondSurname)).append("\n");
    sb.append("    principalHolderSurname: ").append(toIndentedString(principalHolderSurname)).append("\n");
    sb.append("    subdistributorId: ").append(toIndentedString(subdistributorId)).append("\n");
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

