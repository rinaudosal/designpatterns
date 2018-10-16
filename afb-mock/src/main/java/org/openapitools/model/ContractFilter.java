package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This object is a filter used for retrieve a contracts list filtered by some criteria
 */
@ApiModel(description = "This object is a filter used for retrieve a contracts list filtered by some criteria")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class ContractFilter   {
  @JsonProperty("clientExternalReference")
  private String clientExternalReference = null;

  @JsonProperty("clientId")
  private String clientId = null;

  @JsonProperty("externalReference")
  private String externalReference = null;

  @JsonProperty("productId")
  private Long productId = null;

  @JsonProperty("subdistributorId")
  private String subdistributorId = null;

  public ContractFilter clientExternalReference(String clientExternalReference) {
    this.clientExternalReference = clientExternalReference;
    return this;
  }

  /**
   * The external reference of the {Client}
   * @return clientExternalReference
  **/
  @ApiModelProperty(value = "The external reference of the {Client}")


  public String getClientExternalReference() {
    return clientExternalReference;
  }

  public void setClientExternalReference(String clientExternalReference) {
    this.clientExternalReference = clientExternalReference;
  }

  public ContractFilter clientId(String clientId) {
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

  public ContractFilter externalReference(String externalReference) {
    this.externalReference = externalReference;
    return this;
  }

  /**
   * Contract external reference
   * @return externalReference
  **/
  @ApiModelProperty(value = "Contract external reference")


  public String getExternalReference() {
    return externalReference;
  }

  public void setExternalReference(String externalReference) {
    this.externalReference = externalReference;
  }

  public ContractFilter productId(Long productId) {
    this.productId = productId;
    return this;
  }

  /**
   * The Id of the {Product}
   * @return productId
  **/
  @ApiModelProperty(value = "The Id of the {Product}")


  public Long getProductId() {
    return productId;
  }

  public void setProductId(Long productId) {
    this.productId = productId;
  }

  public ContractFilter subdistributorId(String subdistributorId) {
    this.subdistributorId = subdistributorId;
    return this;
  }

  /**
   * The Id of the {Subdistributor}
   * @return subdistributorId
  **/
  @ApiModelProperty(value = "The Id of the {Subdistributor}")


  public String getSubdistributorId() {
    return subdistributorId;
  }

  public void setSubdistributorId(String subdistributorId) {
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
    ContractFilter contractFilter = (ContractFilter) o;
    return Objects.equals(this.clientExternalReference, contractFilter.clientExternalReference) &&
        Objects.equals(this.clientId, contractFilter.clientId) &&
        Objects.equals(this.externalReference, contractFilter.externalReference) &&
        Objects.equals(this.productId, contractFilter.productId) &&
        Objects.equals(this.subdistributorId, contractFilter.subdistributorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientExternalReference, clientId, externalReference, productId, subdistributorId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractFilter {\n");
    
    sb.append("    clientExternalReference: ").append(toIndentedString(clientExternalReference)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    externalReference: ").append(toIndentedString(externalReference)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
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

