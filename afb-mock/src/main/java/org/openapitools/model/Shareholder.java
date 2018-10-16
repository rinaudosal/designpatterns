package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Object that keeps information about a shareholder who participates in a contract with a specific role
 */
@ApiModel(description = "Object that keeps information about a shareholder who participates in a contract with a specific role")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class Shareholder   {
  @JsonProperty("clientExternalReference")
  private String clientExternalReference = null;

  @JsonProperty("clientId")
  private String clientId = null;

  @JsonProperty("ownershipPercentage")
  private Double ownershipPercentage = null;

  @JsonProperty("shareholdingTypeCode")
  private String shareholdingTypeCode = null;

  @JsonProperty("shareholdingTypeOrder")
  private Long shareholdingTypeOrder = null;

  public Shareholder clientExternalReference(String clientExternalReference) {
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

  public Shareholder clientId(String clientId) {
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

  public Shareholder ownershipPercentage(Double ownershipPercentage) {
    this.ownershipPercentage = ownershipPercentage;
    return this;
  }

  /**
   * Defines the distribution percentage of the contract ownership
   * @return ownershipPercentage
  **/
  @ApiModelProperty(value = "Defines the distribution percentage of the contract ownership")


  public Double getOwnershipPercentage() {
    return ownershipPercentage;
  }

  public void setOwnershipPercentage(Double ownershipPercentage) {
    this.ownershipPercentage = ownershipPercentage;
  }

  public Shareholder shareholdingTypeCode(String shareholdingTypeCode) {
    this.shareholdingTypeCode = shareholdingTypeCode;
    return this;
  }

  /**
   * Specifies the client role within the contract. Refer to {listShareholdingTypes}
   * @return shareholdingTypeCode
  **/
  @ApiModelProperty(value = "Specifies the client role within the contract. Refer to {listShareholdingTypes}")


  public String getShareholdingTypeCode() {
    return shareholdingTypeCode;
  }

  public void setShareholdingTypeCode(String shareholdingTypeCode) {
    this.shareholdingTypeCode = shareholdingTypeCode;
  }

  public Shareholder shareholdingTypeOrder(Long shareholdingTypeOrder) {
    this.shareholdingTypeOrder = shareholdingTypeOrder;
    return this;
  }

  /**
   * Defines the specific order between shereholders with the same role
   * @return shareholdingTypeOrder
  **/
  @ApiModelProperty(value = "Defines the specific order between shereholders with the same role")


  public Long getShareholdingTypeOrder() {
    return shareholdingTypeOrder;
  }

  public void setShareholdingTypeOrder(Long shareholdingTypeOrder) {
    this.shareholdingTypeOrder = shareholdingTypeOrder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Shareholder shareholder = (Shareholder) o;
    return Objects.equals(this.clientExternalReference, shareholder.clientExternalReference) &&
        Objects.equals(this.clientId, shareholder.clientId) &&
        Objects.equals(this.ownershipPercentage, shareholder.ownershipPercentage) &&
        Objects.equals(this.shareholdingTypeCode, shareholder.shareholdingTypeCode) &&
        Objects.equals(this.shareholdingTypeOrder, shareholder.shareholdingTypeOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientExternalReference, clientId, ownershipPercentage, shareholdingTypeCode, shareholdingTypeOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Shareholder {\n");
    
    sb.append("    clientExternalReference: ").append(toIndentedString(clientExternalReference)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    ownershipPercentage: ").append(toIndentedString(ownershipPercentage)).append("\n");
    sb.append("    shareholdingTypeCode: ").append(toIndentedString(shareholdingTypeCode)).append("\n");
    sb.append("    shareholdingTypeOrder: ").append(toIndentedString(shareholdingTypeOrder)).append("\n");
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

