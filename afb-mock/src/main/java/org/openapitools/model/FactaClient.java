package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.model.Address;
import org.openapitools.model.Message;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Keeps FATCA controlling information around a client.
 */
@ApiModel(description = "Keeps FATCA controlling information around a client.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class FactaClient   {
  @JsonProperty("birthday")
  private OffsetDateTime birthday = null;

  /**
   * Client type to select between legal or natural person
   */
  public enum ClientTypeEnum {
    LEGAL("LEGAL"),
    
    NATURAL("NATURAL");

    private String value;

    ClientTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ClientTypeEnum fromValue(String text) {
      for (ClientTypeEnum b : ClientTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("clientType")
  private ClientTypeEnum clientType = null;

  @JsonProperty("firstname")
  private String firstname = null;

  @JsonProperty("message")
  private Message message = null;

  @JsonProperty("secondSurname")
  private String secondSurname = null;

  @JsonProperty("surname")
  private String surname = null;

  @JsonProperty("taxAddress")
  private Address taxAddress = null;

  @JsonProperty("usFiscalTypeCode")
  private String usFiscalTypeCode = null;

  @JsonProperty("usTaxReference")
  private String usTaxReference = null;

  public FactaClient birthday(OffsetDateTime birthday) {
    this.birthday = birthday;
    return this;
  }

  /**
   * Client bithday
   * @return birthday
  **/
  @ApiModelProperty(value = "Client bithday")

  @Valid

  public OffsetDateTime getBirthday() {
    return birthday;
  }

  public void setBirthday(OffsetDateTime birthday) {
    this.birthday = birthday;
  }

  public FactaClient clientType(ClientTypeEnum clientType) {
    this.clientType = clientType;
    return this;
  }

  /**
   * Client type to select between legal or natural person
   * @return clientType
  **/
  @ApiModelProperty(value = "Client type to select between legal or natural person")


  public ClientTypeEnum getClientType() {
    return clientType;
  }

  public void setClientType(ClientTypeEnum clientType) {
    this.clientType = clientType;
  }

  public FactaClient firstname(String firstname) {
    this.firstname = firstname;
    return this;
  }

  /**
   * Client name
   * @return firstname
  **/
  @ApiModelProperty(value = "Client name")


  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public FactaClient message(Message message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Message getMessage() {
    return message;
  }

  public void setMessage(Message message) {
    this.message = message;
  }

  public FactaClient secondSurname(String secondSurname) {
    this.secondSurname = secondSurname;
    return this;
  }

  /**
   * Client second surname
   * @return secondSurname
  **/
  @ApiModelProperty(value = "Client second surname")


  public String getSecondSurname() {
    return secondSurname;
  }

  public void setSecondSurname(String secondSurname) {
    this.secondSurname = secondSurname;
  }

  public FactaClient surname(String surname) {
    this.surname = surname;
    return this;
  }

  /**
   * Client surname
   * @return surname
  **/
  @ApiModelProperty(value = "Client surname")


  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public FactaClient taxAddress(Address taxAddress) {
    this.taxAddress = taxAddress;
    return this;
  }

  /**
   * Get taxAddress
   * @return taxAddress
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Address getTaxAddress() {
    return taxAddress;
  }

  public void setTaxAddress(Address taxAddress) {
    this.taxAddress = taxAddress;
  }

  public FactaClient usFiscalTypeCode(String usFiscalTypeCode) {
    this.usFiscalTypeCode = usFiscalTypeCode;
    return this;
  }

  /**
   * Fiscal id type in USA Fatca Type code. Refer to {listUsFiscalTypes}
   * @return usFiscalTypeCode
  **/
  @ApiModelProperty(value = "Fiscal id type in USA Fatca Type code. Refer to {listUsFiscalTypes}")


  public String getUsFiscalTypeCode() {
    return usFiscalTypeCode;
  }

  public void setUsFiscalTypeCode(String usFiscalTypeCode) {
    this.usFiscalTypeCode = usFiscalTypeCode;
  }

  public FactaClient usTaxReference(String usTaxReference) {
    this.usTaxReference = usTaxReference;
    return this;
  }

  /**
   * Tax identification in USA
   * @return usTaxReference
  **/
  @ApiModelProperty(value = "Tax identification in USA")


  public String getUsTaxReference() {
    return usTaxReference;
  }

  public void setUsTaxReference(String usTaxReference) {
    this.usTaxReference = usTaxReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FactaClient factaClient = (FactaClient) o;
    return Objects.equals(this.birthday, factaClient.birthday) &&
        Objects.equals(this.clientType, factaClient.clientType) &&
        Objects.equals(this.firstname, factaClient.firstname) &&
        Objects.equals(this.message, factaClient.message) &&
        Objects.equals(this.secondSurname, factaClient.secondSurname) &&
        Objects.equals(this.surname, factaClient.surname) &&
        Objects.equals(this.taxAddress, factaClient.taxAddress) &&
        Objects.equals(this.usFiscalTypeCode, factaClient.usFiscalTypeCode) &&
        Objects.equals(this.usTaxReference, factaClient.usTaxReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(birthday, clientType, firstname, message, secondSurname, surname, taxAddress, usFiscalTypeCode, usTaxReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FactaClient {\n");
    
    sb.append("    birthday: ").append(toIndentedString(birthday)).append("\n");
    sb.append("    clientType: ").append(toIndentedString(clientType)).append("\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    secondSurname: ").append(toIndentedString(secondSurname)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    taxAddress: ").append(toIndentedString(taxAddress)).append("\n");
    sb.append("    usFiscalTypeCode: ").append(toIndentedString(usFiscalTypeCode)).append("\n");
    sb.append("    usTaxReference: ").append(toIndentedString(usTaxReference)).append("\n");
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

