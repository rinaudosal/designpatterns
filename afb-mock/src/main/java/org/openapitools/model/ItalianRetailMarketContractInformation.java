package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ClientAddressAssociation;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This object keeps specific information around contracts of italian retail market entities
 */
@ApiModel(description = "This object keeps specific information around contracts of italian retail market entities")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class ItalianRetailMarketContractInformation   {
  @JsonProperty("fiscalAddress")
  private ClientAddressAssociation fiscalAddress = null;

  @JsonProperty("fiscalGroupingCode")
  private String fiscalGroupingCode = null;

  @JsonProperty("fiscalGroupingExternalReference")
  private String fiscalGroupingExternalReference = null;

  @JsonProperty("newExternalReference")
  private String newExternalReference = null;

  @JsonProperty("newSubdistributorId")
  private Long newSubdistributorId = null;

  @JsonProperty("postalAdress")
  private ClientAddressAssociation postalAdress = null;

  @JsonProperty("scudato")
  private Boolean scudato = null;

  public ItalianRetailMarketContractInformation fiscalAddress(ClientAddressAssociation fiscalAddress) {
    this.fiscalAddress = fiscalAddress;
    return this;
  }

  /**
   * Get fiscalAddress
   * @return fiscalAddress
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ClientAddressAssociation getFiscalAddress() {
    return fiscalAddress;
  }

  public void setFiscalAddress(ClientAddressAssociation fiscalAddress) {
    this.fiscalAddress = fiscalAddress;
  }

  public ItalianRetailMarketContractInformation fiscalGroupingCode(String fiscalGroupingCode) {
    this.fiscalGroupingCode = fiscalGroupingCode;
    return this;
  }

  /**
   * Defines the Fiscal Grouping Option Code selected to the contract.Refer to {listFiscalGroupings}
   * @return fiscalGroupingCode
  **/
  @ApiModelProperty(value = "Defines the Fiscal Grouping Option Code selected to the contract.Refer to {listFiscalGroupings}")


  public String getFiscalGroupingCode() {
    return fiscalGroupingCode;
  }

  public void setFiscalGroupingCode(String fiscalGroupingCode) {
    this.fiscalGroupingCode = fiscalGroupingCode;
  }

  public ItalianRetailMarketContractInformation fiscalGroupingExternalReference(String fiscalGroupingExternalReference) {
    this.fiscalGroupingExternalReference = fiscalGroupingExternalReference;
    return this;
  }

  /**
   * Specifies the external reference defined to the selected fiscal grouping
   * @return fiscalGroupingExternalReference
  **/
  @ApiModelProperty(value = "Specifies the external reference defined to the selected fiscal grouping")


  public String getFiscalGroupingExternalReference() {
    return fiscalGroupingExternalReference;
  }

  public void setFiscalGroupingExternalReference(String fiscalGroupingExternalReference) {
    this.fiscalGroupingExternalReference = fiscalGroupingExternalReference;
  }

  public ItalianRetailMarketContractInformation newExternalReference(String newExternalReference) {
    this.newExternalReference = newExternalReference;
    return this;
  }

  /**
   * It permits to change the current {Contract} reference.
   * @return newExternalReference
  **/
  @ApiModelProperty(value = "It permits to change the current {Contract} reference.")


  public String getNewExternalReference() {
    return newExternalReference;
  }

  public void setNewExternalReference(String newExternalReference) {
    this.newExternalReference = newExternalReference;
  }

  public ItalianRetailMarketContractInformation newSubdistributorId(Long newSubdistributorId) {
    this.newSubdistributorId = newSubdistributorId;
    return this;
  }

  /**
   * It permits to migrate the current contract from a subdistributor to another one. The Id of the {Subdistributor} associated with this {Contract}
   * @return newSubdistributorId
  **/
  @ApiModelProperty(value = "It permits to migrate the current contract from a subdistributor to another one. The Id of the {Subdistributor} associated with this {Contract}")


  public Long getNewSubdistributorId() {
    return newSubdistributorId;
  }

  public void setNewSubdistributorId(Long newSubdistributorId) {
    this.newSubdistributorId = newSubdistributorId;
  }

  public ItalianRetailMarketContractInformation postalAdress(ClientAddressAssociation postalAdress) {
    this.postalAdress = postalAdress;
    return this;
  }

  /**
   * Get postalAdress
   * @return postalAdress
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ClientAddressAssociation getPostalAdress() {
    return postalAdress;
  }

  public void setPostalAdress(ClientAddressAssociation postalAdress) {
    this.postalAdress = postalAdress;
  }

  public ItalianRetailMarketContractInformation scudato(Boolean scudato) {
    this.scudato = scudato;
    return this;
  }

  /**
   * Specifies if the contract is marked with a fiscal \"scudato\" defined by the Italian government
   * @return scudato
  **/
  @ApiModelProperty(value = "Specifies if the contract is marked with a fiscal \"scudato\" defined by the Italian government")


  public Boolean getScudato() {
    return scudato;
  }

  public void setScudato(Boolean scudato) {
    this.scudato = scudato;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItalianRetailMarketContractInformation italianRetailMarketContractInformation = (ItalianRetailMarketContractInformation) o;
    return Objects.equals(this.fiscalAddress, italianRetailMarketContractInformation.fiscalAddress) &&
        Objects.equals(this.fiscalGroupingCode, italianRetailMarketContractInformation.fiscalGroupingCode) &&
        Objects.equals(this.fiscalGroupingExternalReference, italianRetailMarketContractInformation.fiscalGroupingExternalReference) &&
        Objects.equals(this.newExternalReference, italianRetailMarketContractInformation.newExternalReference) &&
        Objects.equals(this.newSubdistributorId, italianRetailMarketContractInformation.newSubdistributorId) &&
        Objects.equals(this.postalAdress, italianRetailMarketContractInformation.postalAdress) &&
        Objects.equals(this.scudato, italianRetailMarketContractInformation.scudato);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fiscalAddress, fiscalGroupingCode, fiscalGroupingExternalReference, newExternalReference, newSubdistributorId, postalAdress, scudato);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItalianRetailMarketContractInformation {\n");
    
    sb.append("    fiscalAddress: ").append(toIndentedString(fiscalAddress)).append("\n");
    sb.append("    fiscalGroupingCode: ").append(toIndentedString(fiscalGroupingCode)).append("\n");
    sb.append("    fiscalGroupingExternalReference: ").append(toIndentedString(fiscalGroupingExternalReference)).append("\n");
    sb.append("    newExternalReference: ").append(toIndentedString(newExternalReference)).append("\n");
    sb.append("    newSubdistributorId: ").append(toIndentedString(newSubdistributorId)).append("\n");
    sb.append("    postalAdress: ").append(toIndentedString(postalAdress)).append("\n");
    sb.append("    scudato: ").append(toIndentedString(scudato)).append("\n");
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

