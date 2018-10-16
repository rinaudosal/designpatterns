package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This object contains a summary of the Client information
 */
@ApiModel(description = "This object contains a summary of the Client information")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class ClientSummary   {
  @JsonProperty("clientId")
  private String clientId = null;

  @JsonProperty("distributorId")
  private Long distributorId = null;

  @JsonProperty("externalReference")
  private String externalReference = null;

  @JsonProperty("fatca")
  private Boolean fatca = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("secondSurname")
  private String secondSurname = null;

  @JsonProperty("subdistributorId")
  private Long subdistributorId = null;

  @JsonProperty("surname")
  private String surname = null;

  public ClientSummary clientId(String clientId) {
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

  public ClientSummary distributorId(Long distributorId) {
    this.distributorId = distributorId;
    return this;
  }

  /**
   * The Id of the Client's {Distributor}
   * @return distributorId
  **/
  @ApiModelProperty(value = "The Id of the Client's {Distributor}")


  public Long getDistributorId() {
    return distributorId;
  }

  public void setDistributorId(Long distributorId) {
    this.distributorId = distributorId;
  }

  public ClientSummary externalReference(String externalReference) {
    this.externalReference = externalReference;
    return this;
  }

  /**
   * The public reference of the client.
   * @return externalReference
  **/
  @ApiModelProperty(value = "The public reference of the client.")


  public String getExternalReference() {
    return externalReference;
  }

  public void setExternalReference(String externalReference) {
    this.externalReference = externalReference;
  }

  public ClientSummary fatca(Boolean fatca) {
    this.fatca = fatca;
    return this;
  }

  /**
   * Indicates if client has FATCA data
   * @return fatca
  **/
  @ApiModelProperty(value = "Indicates if client has FATCA data")


  public Boolean getFatca() {
    return fatca;
  }

  public void setFatca(Boolean fatca) {
    this.fatca = fatca;
  }

  public ClientSummary firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * First name of client
   * @return firstName
  **/
  @ApiModelProperty(value = "First name of client")


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public ClientSummary secondSurname(String secondSurname) {
    this.secondSurname = secondSurname;
    return this;
  }

  /**
   * Second surname of natural client
   * @return secondSurname
  **/
  @ApiModelProperty(value = "Second surname of natural client")


  public String getSecondSurname() {
    return secondSurname;
  }

  public void setSecondSurname(String secondSurname) {
    this.secondSurname = secondSurname;
  }

  public ClientSummary subdistributorId(Long subdistributorId) {
    this.subdistributorId = subdistributorId;
    return this;
  }

  /**
   * The Id of the Client's {Subdistributor}
   * @return subdistributorId
  **/
  @ApiModelProperty(value = "The Id of the Client's {Subdistributor}")


  public Long getSubdistributorId() {
    return subdistributorId;
  }

  public void setSubdistributorId(Long subdistributorId) {
    this.subdistributorId = subdistributorId;
  }

  public ClientSummary surname(String surname) {
    this.surname = surname;
    return this;
  }

  /**
   * Surname of natural client
   * @return surname
  **/
  @ApiModelProperty(value = "Surname of natural client")


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
    ClientSummary clientSummary = (ClientSummary) o;
    return Objects.equals(this.clientId, clientSummary.clientId) &&
        Objects.equals(this.distributorId, clientSummary.distributorId) &&
        Objects.equals(this.externalReference, clientSummary.externalReference) &&
        Objects.equals(this.fatca, clientSummary.fatca) &&
        Objects.equals(this.firstName, clientSummary.firstName) &&
        Objects.equals(this.secondSurname, clientSummary.secondSurname) &&
        Objects.equals(this.subdistributorId, clientSummary.subdistributorId) &&
        Objects.equals(this.surname, clientSummary.surname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, distributorId, externalReference, fatca, firstName, secondSurname, subdistributorId, surname);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientSummary {\n");
    
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    distributorId: ").append(toIndentedString(distributorId)).append("\n");
    sb.append("    externalReference: ").append(toIndentedString(externalReference)).append("\n");
    sb.append("    fatca: ").append(toIndentedString(fatca)).append("\n");
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

