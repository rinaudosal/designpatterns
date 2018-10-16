package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.ClientAddress;
import org.openapitools.model.FatcaData;
import org.openapitools.model.ForeignClientData;
import org.openapitools.model.ItalianRetailMarketClientData;
import org.openapitools.model.ItalianRetailMarketFatcaData;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This object keeps information related to Clients, who users could create in the system. It does not depends on the subdistributorId because of the fact that, in the italian retail market, clients are not mandatorily associated to a specific subdistributor within all subdistributors that its distributor has
 */
@ApiModel(description = "This object keeps information related to Clients, who users could create in the system. It does not depends on the subdistributorId because of the fact that, in the italian retail market, clients are not mandatorily associated to a specific subdistributor within all subdistributors that its distributor has")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class Client   {
  @JsonProperty("addresses")
  @Valid
  private List<ClientAddress> addresses = null;

  @JsonProperty("birthDate")
  private OffsetDateTime birthDate = null;

  @JsonProperty("cityOfBirth")
  private String cityOfBirth = null;

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

  @JsonProperty("cnae")
  private String cnae = null;

  @JsonProperty("countryOfBirthCode")
  private String countryOfBirthCode = null;

  @JsonProperty("distributorId")
  private Long distributorId = null;

  @JsonProperty("document")
  private String document = null;

  @JsonProperty("documentTypeCode")
  private String documentTypeCode = null;

  @JsonProperty("entityTypeCode")
  private String entityTypeCode = null;

  @JsonProperty("externalReference")
  private String externalReference = null;

  @JsonProperty("fatcaData")
  private FatcaData fatcaData = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("foreignClientData")
  private ForeignClientData foreignClientData = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("italianRetailMarketClientData")
  private ItalianRetailMarketClientData italianRetailMarketClientData = null;

  @JsonProperty("italianRetailMarketFatcaData")
  private ItalianRetailMarketFatcaData italianRetailMarketFatcaData = null;

  @JsonProperty("productTypeCode")
  private String productTypeCode = null;

  @JsonProperty("professionalAccording200439CE")
  private Boolean professionalAccording200439CE = null;

  @JsonProperty("residentInSpain")
  private Boolean residentInSpain = null;

  @JsonProperty("secondSurname")
  private String secondSurname = null;

  @JsonProperty("sectorization")
  private String sectorization = null;

  @JsonProperty("spanishTransfersPermitted")
  private Boolean spanishTransfersPermitted = null;

  @JsonProperty("subdistributorId")
  private Long subdistributorId = null;

  @JsonProperty("surname")
  private String surname = null;

  public Client addresses(List<ClientAddress> addresses) {
    this.addresses = addresses;
    return this;
  }

  public Client addAddressesItem(ClientAddress addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

  /**
   * Get addresses
   * @return addresses
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ClientAddress> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<ClientAddress> addresses) {
    this.addresses = addresses;
  }

  public Client birthDate(OffsetDateTime birthDate) {
    this.birthDate = birthDate;
    return this;
  }

  /**
   * Client birth date
   * @return birthDate
  **/
  @ApiModelProperty(value = "Client birth date")

  @Valid

  public OffsetDateTime getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(OffsetDateTime birthDate) {
    this.birthDate = birthDate;
  }

  public Client cityOfBirth(String cityOfBirth) {
    this.cityOfBirth = cityOfBirth;
    return this;
  }

  /**
   * City of birth
   * @return cityOfBirth
  **/
  @ApiModelProperty(value = "City of birth")


  public String getCityOfBirth() {
    return cityOfBirth;
  }

  public void setCityOfBirth(String cityOfBirth) {
    this.cityOfBirth = cityOfBirth;
  }

  public Client clientTypeCode(ClientTypeCodeEnum clientTypeCode) {
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

  public Client cnae(String cnae) {
    this.cnae = cnae;
    return this;
  }

  /**
   * Spanish economical activities clasification (CNAE). Mandatory for legal clients. Only used for spanish clients
   * @return cnae
  **/
  @ApiModelProperty(value = "Spanish economical activities clasification (CNAE). Mandatory for legal clients. Only used for spanish clients")


  public String getCnae() {
    return cnae;
  }

  public void setCnae(String cnae) {
    this.cnae = cnae;
  }

  public Client countryOfBirthCode(String countryOfBirthCode) {
    this.countryOfBirthCode = countryOfBirthCode;
    return this;
  }

  /**
   * Country of birth code. Refer to {listCountries}
   * @return countryOfBirthCode
  **/
  @ApiModelProperty(value = "Country of birth code. Refer to {listCountries}")


  public String getCountryOfBirthCode() {
    return countryOfBirthCode;
  }

  public void setCountryOfBirthCode(String countryOfBirthCode) {
    this.countryOfBirthCode = countryOfBirthCode;
  }

  public Client distributorId(Long distributorId) {
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

  public Client document(String document) {
    this.document = document;
    return this;
  }

  /**
   * Indicates the document type used as identification number of the client. Only used for non italian retail market clients
   * @return document
  **/
  @ApiModelProperty(value = "Indicates the document type used as identification number of the client. Only used for non italian retail market clients")


  public String getDocument() {
    return document;
  }

  public void setDocument(String document) {
    this.document = document;
  }

  public Client documentTypeCode(String documentTypeCode) {
    this.documentTypeCode = documentTypeCode;
    return this;
  }

  /**
   * The document type. Refer to {listDocumentTypes}
   * @return documentTypeCode
  **/
  @ApiModelProperty(value = "The document type. Refer to {listDocumentTypes}")


  public String getDocumentTypeCode() {
    return documentTypeCode;
  }

  public void setDocumentTypeCode(String documentTypeCode) {
    this.documentTypeCode = documentTypeCode;
  }

  public Client entityTypeCode(String entityTypeCode) {
    this.entityTypeCode = entityTypeCode;
    return this;
  }

  /**
   * The entity type. Refer to {listEntityTypes}
   * @return entityTypeCode
  **/
  @ApiModelProperty(value = "The entity type. Refer to {listEntityTypes}")


  public String getEntityTypeCode() {
    return entityTypeCode;
  }

  public void setEntityTypeCode(String entityTypeCode) {
    this.entityTypeCode = entityTypeCode;
  }

  public Client externalReference(String externalReference) {
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

  public Client fatcaData(FatcaData fatcaData) {
    this.fatcaData = fatcaData;
    return this;
  }

  /**
   * Get fatcaData
   * @return fatcaData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public FatcaData getFatcaData() {
    return fatcaData;
  }

  public void setFatcaData(FatcaData fatcaData) {
    this.fatcaData = fatcaData;
  }

  public Client firstName(String firstName) {
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

  public Client foreignClientData(ForeignClientData foreignClientData) {
    this.foreignClientData = foreignClientData;
    return this;
  }

  /**
   * Get foreignClientData
   * @return foreignClientData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ForeignClientData getForeignClientData() {
    return foreignClientData;
  }

  public void setForeignClientData(ForeignClientData foreignClientData) {
    this.foreignClientData = foreignClientData;
  }

  public Client id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique Client identifier
   * @return id
  **/
  @ApiModelProperty(value = "The unique Client identifier")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Client italianRetailMarketClientData(ItalianRetailMarketClientData italianRetailMarketClientData) {
    this.italianRetailMarketClientData = italianRetailMarketClientData;
    return this;
  }

  /**
   * Get italianRetailMarketClientData
   * @return italianRetailMarketClientData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ItalianRetailMarketClientData getItalianRetailMarketClientData() {
    return italianRetailMarketClientData;
  }

  public void setItalianRetailMarketClientData(ItalianRetailMarketClientData italianRetailMarketClientData) {
    this.italianRetailMarketClientData = italianRetailMarketClientData;
  }

  public Client italianRetailMarketFatcaData(ItalianRetailMarketFatcaData italianRetailMarketFatcaData) {
    this.italianRetailMarketFatcaData = italianRetailMarketFatcaData;
    return this;
  }

  /**
   * Get italianRetailMarketFatcaData
   * @return italianRetailMarketFatcaData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ItalianRetailMarketFatcaData getItalianRetailMarketFatcaData() {
    return italianRetailMarketFatcaData;
  }

  public void setItalianRetailMarketFatcaData(ItalianRetailMarketFatcaData italianRetailMarketFatcaData) {
    this.italianRetailMarketFatcaData = italianRetailMarketFatcaData;
  }

  public Client productTypeCode(String productTypeCode) {
    this.productTypeCode = productTypeCode;
    return this;
  }

  /**
   * The product type. Refer to {listProductTypes}
   * @return productTypeCode
  **/
  @ApiModelProperty(value = "The product type. Refer to {listProductTypes}")


  public String getProductTypeCode() {
    return productTypeCode;
  }

  public void setProductTypeCode(String productTypeCode) {
    this.productTypeCode = productTypeCode;
  }

  public Client professionalAccording200439CE(Boolean professionalAccording200439CE) {
    this.professionalAccording200439CE = professionalAccording200439CE;
    return this;
  }

  /**
   * Defines if the client is professional, according to European Directive 2004/39/CE.
   * @return professionalAccording200439CE
  **/
  @ApiModelProperty(value = "Defines if the client is professional, according to European Directive 2004/39/CE.")


  public Boolean getProfessionalAccording200439CE() {
    return professionalAccording200439CE;
  }

  public void setProfessionalAccording200439CE(Boolean professionalAccording200439CE) {
    this.professionalAccording200439CE = professionalAccording200439CE;
  }

  public Client residentInSpain(Boolean residentInSpain) {
    this.residentInSpain = residentInSpain;
    return this;
  }

  /**
   * Indicates if is client resides in Spain
   * @return residentInSpain
  **/
  @ApiModelProperty(value = "Indicates if is client resides in Spain")


  public Boolean getResidentInSpain() {
    return residentInSpain;
  }

  public void setResidentInSpain(Boolean residentInSpain) {
    this.residentInSpain = residentInSpain;
  }

  public Client secondSurname(String secondSurname) {
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

  public Client sectorization(String sectorization) {
    this.sectorization = sectorization;
    return this;
  }

  /**
   * Defines de sectorization code.
   * @return sectorization
  **/
  @ApiModelProperty(value = "Defines de sectorization code.")


  public String getSectorization() {
    return sectorization;
  }

  public void setSectorization(String sectorization) {
    this.sectorization = sectorization;
  }

  public Client spanishTransfersPermitted(Boolean spanishTransfersPermitted) {
    this.spanishTransfersPermitted = spanishTransfersPermitted;
    return this;
  }

  /**
   * Defines if the client can operate with {SpanishTranfer}s
   * @return spanishTransfersPermitted
  **/
  @ApiModelProperty(value = "Defines if the client can operate with {SpanishTranfer}s")


  public Boolean getSpanishTransfersPermitted() {
    return spanishTransfersPermitted;
  }

  public void setSpanishTransfersPermitted(Boolean spanishTransfersPermitted) {
    this.spanishTransfersPermitted = spanishTransfersPermitted;
  }

  public Client subdistributorId(Long subdistributorId) {
    this.subdistributorId = subdistributorId;
    return this;
  }

  /**
   * The Id of the Client's {Subdistributor}. TODO Comentar que para banca correspondiente es opcional
   * @return subdistributorId
  **/
  @ApiModelProperty(value = "The Id of the Client's {Subdistributor}. TODO Comentar que para banca correspondiente es opcional")


  public Long getSubdistributorId() {
    return subdistributorId;
  }

  public void setSubdistributorId(Long subdistributorId) {
    this.subdistributorId = subdistributorId;
  }

  public Client surname(String surname) {
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
    Client client = (Client) o;
    return Objects.equals(this.addresses, client.addresses) &&
        Objects.equals(this.birthDate, client.birthDate) &&
        Objects.equals(this.cityOfBirth, client.cityOfBirth) &&
        Objects.equals(this.clientTypeCode, client.clientTypeCode) &&
        Objects.equals(this.cnae, client.cnae) &&
        Objects.equals(this.countryOfBirthCode, client.countryOfBirthCode) &&
        Objects.equals(this.distributorId, client.distributorId) &&
        Objects.equals(this.document, client.document) &&
        Objects.equals(this.documentTypeCode, client.documentTypeCode) &&
        Objects.equals(this.entityTypeCode, client.entityTypeCode) &&
        Objects.equals(this.externalReference, client.externalReference) &&
        Objects.equals(this.fatcaData, client.fatcaData) &&
        Objects.equals(this.firstName, client.firstName) &&
        Objects.equals(this.foreignClientData, client.foreignClientData) &&
        Objects.equals(this.id, client.id) &&
        Objects.equals(this.italianRetailMarketClientData, client.italianRetailMarketClientData) &&
        Objects.equals(this.italianRetailMarketFatcaData, client.italianRetailMarketFatcaData) &&
        Objects.equals(this.productTypeCode, client.productTypeCode) &&
        Objects.equals(this.professionalAccording200439CE, client.professionalAccording200439CE) &&
        Objects.equals(this.residentInSpain, client.residentInSpain) &&
        Objects.equals(this.secondSurname, client.secondSurname) &&
        Objects.equals(this.sectorization, client.sectorization) &&
        Objects.equals(this.spanishTransfersPermitted, client.spanishTransfersPermitted) &&
        Objects.equals(this.subdistributorId, client.subdistributorId) &&
        Objects.equals(this.surname, client.surname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses, birthDate, cityOfBirth, clientTypeCode, cnae, countryOfBirthCode, distributorId, document, documentTypeCode, entityTypeCode, externalReference, fatcaData, firstName, foreignClientData, id, italianRetailMarketClientData, italianRetailMarketFatcaData, productTypeCode, professionalAccording200439CE, residentInSpain, secondSurname, sectorization, spanishTransfersPermitted, subdistributorId, surname);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Client {\n");
    
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    cityOfBirth: ").append(toIndentedString(cityOfBirth)).append("\n");
    sb.append("    clientTypeCode: ").append(toIndentedString(clientTypeCode)).append("\n");
    sb.append("    cnae: ").append(toIndentedString(cnae)).append("\n");
    sb.append("    countryOfBirthCode: ").append(toIndentedString(countryOfBirthCode)).append("\n");
    sb.append("    distributorId: ").append(toIndentedString(distributorId)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    documentTypeCode: ").append(toIndentedString(documentTypeCode)).append("\n");
    sb.append("    entityTypeCode: ").append(toIndentedString(entityTypeCode)).append("\n");
    sb.append("    externalReference: ").append(toIndentedString(externalReference)).append("\n");
    sb.append("    fatcaData: ").append(toIndentedString(fatcaData)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    foreignClientData: ").append(toIndentedString(foreignClientData)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    italianRetailMarketClientData: ").append(toIndentedString(italianRetailMarketClientData)).append("\n");
    sb.append("    italianRetailMarketFatcaData: ").append(toIndentedString(italianRetailMarketFatcaData)).append("\n");
    sb.append("    productTypeCode: ").append(toIndentedString(productTypeCode)).append("\n");
    sb.append("    professionalAccording200439CE: ").append(toIndentedString(professionalAccording200439CE)).append("\n");
    sb.append("    residentInSpain: ").append(toIndentedString(residentInSpain)).append("\n");
    sb.append("    secondSurname: ").append(toIndentedString(secondSurname)).append("\n");
    sb.append("    sectorization: ").append(toIndentedString(sectorization)).append("\n");
    sb.append("    spanishTransfersPermitted: ").append(toIndentedString(spanishTransfersPermitted)).append("\n");
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

