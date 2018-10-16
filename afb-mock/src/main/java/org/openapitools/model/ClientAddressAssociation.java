package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * It associates a italian retail market client with a specific address. The client may be one between all contract&#39;s shareholders. The address may be one between all that the selected client has.
 */
@ApiModel(description = "It associates a italian retail market client with a specific address. The client may be one between all contract's shareholders. The address may be one between all that the selected client has.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class ClientAddressAssociation   {
  @JsonProperty("addressExternalReference")
  private String addressExternalReference = null;

  @JsonProperty("clientExternalReference")
  private String clientExternalReference = null;

  @JsonProperty("clientId")
  private String clientId = null;

  public ClientAddressAssociation addressExternalReference(String addressExternalReference) {
    this.addressExternalReference = addressExternalReference;
    return this;
  }

  /**
   * External reference of an address associated to an italian retail market client
   * @return addressExternalReference
  **/
  @ApiModelProperty(value = "External reference of an address associated to an italian retail market client")


  public String getAddressExternalReference() {
    return addressExternalReference;
  }

  public void setAddressExternalReference(String addressExternalReference) {
    this.addressExternalReference = addressExternalReference;
  }

  public ClientAddressAssociation clientExternalReference(String clientExternalReference) {
    this.clientExternalReference = clientExternalReference;
    return this;
  }

  /**
   * The externalReference of the {Client}
   * @return clientExternalReference
  **/
  @ApiModelProperty(value = "The externalReference of the {Client}")


  public String getClientExternalReference() {
    return clientExternalReference;
  }

  public void setClientExternalReference(String clientExternalReference) {
    this.clientExternalReference = clientExternalReference;
  }

  public ClientAddressAssociation clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * The Id of the {Client}
   * @return clientId
  **/
  @ApiModelProperty(value = "The Id of the {Client}")


  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientAddressAssociation clientAddressAssociation = (ClientAddressAssociation) o;
    return Objects.equals(this.addressExternalReference, clientAddressAssociation.addressExternalReference) &&
        Objects.equals(this.clientExternalReference, clientAddressAssociation.clientExternalReference) &&
        Objects.equals(this.clientId, clientAddressAssociation.clientId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressExternalReference, clientExternalReference, clientId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientAddressAssociation {\n");
    
    sb.append("    addressExternalReference: ").append(toIndentedString(addressExternalReference)).append("\n");
    sb.append("    clientExternalReference: ").append(toIndentedString(clientExternalReference)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
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

