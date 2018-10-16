package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ClientFilter is an object used to search clients filtering by some criteria
 */
@ApiModel(description = "ClientFilter is an object used to search clients filtering by some criteria")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class ClientFilter   {
  /**
   * Client type to select between legal or natural person
   */
  public enum ClientTypeCodeEnum {
    LEGAL("LEGAL"),
    
    NATURAL("NATURAL");

    private String value;

    ClientTypeCodeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ClientTypeCodeEnum fromValue(String text) {
      for (ClientTypeCodeEnum b : ClientTypeCodeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("clientTypeCode")
  private ClientTypeCodeEnum clientTypeCode = null;

  @JsonProperty("externalReference")
  private String externalReference = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("secondSurname")
  private String secondSurname = null;

  @JsonProperty("subdistributorId")
  private Long subdistributorId = null;

  @JsonProperty("surname")
  private String surname = null;

  public ClientFilter clientTypeCode(ClientTypeCodeEnum clientTypeCode) {
    this.clientTypeCode = clientTypeCode;
    return this;
  }

  /**
   * Client type to select between legal or natural person
   * @return clientTypeCode
  **/
  @ApiModelProperty(value = "Client type to select between legal or natural person")


  public ClientTypeCodeEnum getClientTypeCode() {
    return clientTypeCode;
  }

  public void setClientTypeCode(ClientTypeCodeEnum clientTypeCode) {
    this.clientTypeCode = clientTypeCode;
  }

  public ClientFilter externalReference(String externalReference) {
    this.externalReference = externalReference;
    return this;
  }

  /**
   * In order to search by the {Client.externalReference}
   * @return externalReference
  **/
  @ApiModelProperty(value = "In order to search by the {Client.externalReference}")


  public String getExternalReference() {
    return externalReference;
  }

  public void setExternalReference(String externalReference) {
    this.externalReference = externalReference;
  }

  public ClientFilter firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * In order to search by the client name
   * @return firstName
  **/
  @ApiModelProperty(value = "In order to search by the client name")


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public ClientFilter secondSurname(String secondSurname) {
    this.secondSurname = secondSurname;
    return this;
  }

  /**
   * Second surname of the client. Only used for natural person
   * @return secondSurname
  **/
  @ApiModelProperty(value = "Second surname of the client. Only used for natural person")


  public String getSecondSurname() {
    return secondSurname;
  }

  public void setSecondSurname(String secondSurname) {
    this.secondSurname = secondSurname;
  }

  public ClientFilter subdistributorId(Long subdistributorId) {
    this.subdistributorId = subdistributorId;
    return this;
  }

  /**
   * In order to search by the {Subdistributor}
   * @return subdistributorId
  **/
  @ApiModelProperty(value = "In order to search by the {Subdistributor}")


  public Long getSubdistributorId() {
    return subdistributorId;
  }

  public void setSubdistributorId(Long subdistributorId) {
    this.subdistributorId = subdistributorId;
  }

  public ClientFilter surname(String surname) {
    this.surname = surname;
    return this;
  }

  /**
   * Surname of the client. Only used for natural person
   * @return surname
  **/
  @ApiModelProperty(value = "Surname of the client. Only used for natural person")


  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientFilter clientFilter = (ClientFilter) o;
    return Objects.equals(this.clientTypeCode, clientFilter.clientTypeCode) &&
        Objects.equals(this.externalReference, clientFilter.externalReference) &&
        Objects.equals(this.firstName, clientFilter.firstName) &&
        Objects.equals(this.secondSurname, clientFilter.secondSurname) &&
        Objects.equals(this.subdistributorId, clientFilter.subdistributorId) &&
        Objects.equals(this.surname, clientFilter.surname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientTypeCode, externalReference, firstName, secondSurname, subdistributorId, surname);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientFilter {\n");
    
    sb.append("    clientTypeCode: ").append(toIndentedString(clientTypeCode)).append("\n");
    sb.append("    externalReference: ").append(toIndentedString(externalReference)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    secondSurname: ").append(toIndentedString(secondSurname)).append("\n");
    sb.append("    subdistributorId: ").append(toIndentedString(subdistributorId)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
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

