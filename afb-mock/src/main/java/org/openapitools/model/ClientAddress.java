package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Address;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This object it used to define addresses with their attributes
 */
@ApiModel(description = "This object it used to define addresses with their attributes")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class ClientAddress   {
  @JsonProperty("address")
  private Address address = null;

  @JsonProperty("externalReference")
  private String externalReference = null;

  @JsonProperty("fiscalAddress")
  private Boolean fiscalAddress = null;

  @JsonProperty("residentAddress")
  private Boolean residentAddress = null;

  public ClientAddress address(Address address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public ClientAddress externalReference(String externalReference) {
    this.externalReference = externalReference;
    return this;
  }

  /**
   * Address External Reference. Only used for italian retail market clients
   * @return externalReference
  **/
  @ApiModelProperty(value = "Address External Reference. Only used for italian retail market clients")


  public String getExternalReference() {
    return externalReference;
  }

  public void setExternalReference(String externalReference) {
    this.externalReference = externalReference;
  }

  public ClientAddress fiscalAddress(Boolean fiscalAddress) {
    this.fiscalAddress = fiscalAddress;
    return this;
  }

  /**
   * Indicates if the address is the official client fiscal address or not
   * @return fiscalAddress
  **/
  @ApiModelProperty(value = "Indicates if the address is the official client fiscal address or not")


  public Boolean getFiscalAddress() {
    return fiscalAddress;
  }

  public void setFiscalAddress(Boolean fiscalAddress) {
    this.fiscalAddress = fiscalAddress;
  }

  public ClientAddress residentAddress(Boolean residentAddress) {
    this.residentAddress = residentAddress;
    return this;
  }

  /**
   * Indicates if the address is the official client residence or not
   * @return residentAddress
  **/
  @ApiModelProperty(value = "Indicates if the address is the official client residence or not")


  public Boolean getResidentAddress() {
    return residentAddress;
  }

  public void setResidentAddress(Boolean residentAddress) {
    this.residentAddress = residentAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientAddress clientAddress = (ClientAddress) o;
    return Objects.equals(this.address, clientAddress.address) &&
        Objects.equals(this.externalReference, clientAddress.externalReference) &&
        Objects.equals(this.fiscalAddress, clientAddress.fiscalAddress) &&
        Objects.equals(this.residentAddress, clientAddress.residentAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, externalReference, fiscalAddress, residentAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientAddress {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    externalReference: ").append(toIndentedString(externalReference)).append("\n");
    sb.append("    fiscalAddress: ").append(toIndentedString(fiscalAddress)).append("\n");
    sb.append("    residentAddress: ").append(toIndentedString(residentAddress)).append("\n");
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

