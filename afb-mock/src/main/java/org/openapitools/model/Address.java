package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This object it used to define addresses with their attributes
 */
@ApiModel(description = "This object it used to define addresses with their attributes")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class Address   {
  @JsonProperty("address")
  private String address = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("complementaryAddress")
  private String complementaryAddress = null;

  @JsonProperty("countryCode")
  private String countryCode = null;

  @JsonProperty("region")
  private String region = null;

  @JsonProperty("regionCode")
  private String regionCode = null;

  @JsonProperty("roadTypeCode")
  private String roadTypeCode = null;

  @JsonProperty("zipCode")
  private String zipCode = null;

  public Address address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Address description
   * @return address
  **/
  @ApiModelProperty(value = "Address description")


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Address city(String city) {
    this.city = city;
    return this;
  }

  /**
   * City within the region
   * @return city
  **/
  @ApiModelProperty(value = "City within the region")


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Address complementaryAddress(String complementaryAddress) {
    this.complementaryAddress = complementaryAddress;
    return this;
  }

  /**
   * Complementary address description. Only used for italian retail market clients
   * @return complementaryAddress
  **/
  @ApiModelProperty(value = "Complementary address description. Only used for italian retail market clients")


  public String getComplementaryAddress() {
    return complementaryAddress;
  }

  public void setComplementaryAddress(String complementaryAddress) {
    this.complementaryAddress = complementaryAddress;
  }

  public Address countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * The Address's country code. Refer to the {listCountries}
   * @return countryCode
  **/
  @ApiModelProperty(value = "The Address's country code. Refer to the {listCountries}")


  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public Address region(String region) {
    this.region = region;
    return this;
  }

  /**
   * Region within the country
   * @return region
  **/
  @ApiModelProperty(value = "Region within the country")


  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public Address regionCode(String regionCode) {
    this.regionCode = regionCode;
    return this;
  }

  /**
   * Region Code
   * @return regionCode
  **/
  @ApiModelProperty(value = "Region Code")


  public String getRegionCode() {
    return regionCode;
  }

  public void setRegionCode(String regionCode) {
    this.regionCode = regionCode;
  }

  public Address roadTypeCode(String roadTypeCode) {
    this.roadTypeCode = roadTypeCode;
    return this;
  }

  /**
   * The Address's road type code. Refer to {listRoadTypes}
   * @return roadTypeCode
  **/
  @ApiModelProperty(value = "The Address's road type code. Refer to {listRoadTypes}")


  public String getRoadTypeCode() {
    return roadTypeCode;
  }

  public void setRoadTypeCode(String roadTypeCode) {
    this.roadTypeCode = roadTypeCode;
  }

  public Address zipCode(String zipCode) {
    this.zipCode = zipCode;
    return this;
  }

  /**
   * Zip code
   * @return zipCode
  **/
  @ApiModelProperty(value = "Zip code")


  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.address, address.address) &&
        Objects.equals(this.city, address.city) &&
        Objects.equals(this.complementaryAddress, address.complementaryAddress) &&
        Objects.equals(this.countryCode, address.countryCode) &&
        Objects.equals(this.region, address.region) &&
        Objects.equals(this.regionCode, address.regionCode) &&
        Objects.equals(this.roadTypeCode, address.roadTypeCode) &&
        Objects.equals(this.zipCode, address.zipCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, city, complementaryAddress, countryCode, region, regionCode, roadTypeCode, zipCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    complementaryAddress: ").append(toIndentedString(complementaryAddress)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
    sb.append("    roadTypeCode: ").append(toIndentedString(roadTypeCode)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
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

