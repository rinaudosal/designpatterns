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
 * Distributor
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class Distributor   {
  @JsonProperty("accountingCenterCountryCode")
  private String accountingCenterCountryCode = null;

  @JsonProperty("address")
  private Address address = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("logoUrl")
  private String logoUrl = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("nif")
  private String nif = null;

  public Distributor accountingCenterCountryCode(String accountingCenterCountryCode) {
    this.accountingCenterCountryCode = accountingCenterCountryCode;
    return this;
  }

  /**
   * The country code of the Distributor Accounting center. Refer to {listCountries}
   * @return accountingCenterCountryCode
  **/
  @ApiModelProperty(value = "The country code of the Distributor Accounting center. Refer to {listCountries}")


  public String getAccountingCenterCountryCode() {
    return accountingCenterCountryCode;
  }

  public void setAccountingCenterCountryCode(String accountingCenterCountryCode) {
    this.accountingCenterCountryCode = accountingCenterCountryCode;
  }

  public Distributor address(Address address) {
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

  public Distributor id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Distributor
   * @return id
  **/
  @ApiModelProperty(value = "Distributor")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Distributor logoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
    return this;
  }

  /**
   * Logo URL
   * @return logoUrl
  **/
  @ApiModelProperty(value = "Logo URL")


  public String getLogoUrl() {
    return logoUrl;
  }

  public void setLogoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
  }

  public Distributor name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Distributor Name
   * @return name
  **/
  @ApiModelProperty(value = "Distributor Name")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Distributor nif(String nif) {
    this.nif = nif;
    return this;
  }

  /**
   * Nif Distributor
   * @return nif
  **/
  @ApiModelProperty(value = "Nif Distributor")


  public String getNif() {
    return nif;
  }

  public void setNif(String nif) {
    this.nif = nif;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Distributor distributor = (Distributor) o;
    return Objects.equals(this.accountingCenterCountryCode, distributor.accountingCenterCountryCode) &&
        Objects.equals(this.address, distributor.address) &&
        Objects.equals(this.id, distributor.id) &&
        Objects.equals(this.logoUrl, distributor.logoUrl) &&
        Objects.equals(this.name, distributor.name) &&
        Objects.equals(this.nif, distributor.nif);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountingCenterCountryCode, address, id, logoUrl, name, nif);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Distributor {\n");
    
    sb.append("    accountingCenterCountryCode: ").append(toIndentedString(accountingCenterCountryCode)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nif: ").append(toIndentedString(nif)).append("\n");
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

