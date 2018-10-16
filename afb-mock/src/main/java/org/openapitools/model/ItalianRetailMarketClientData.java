package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Specific data related to clients belonging to Italian Retail Market 
 */
@ApiModel(description = "Specific data related to clients belonging to Italian Retail Market ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class ItalianRetailMarketClientData   {
  @JsonProperty("authority")
  private String authority = null;

  @JsonProperty("businessCountryFiscalIdentification")
  private String businessCountryFiscalIdentification = null;

  @JsonProperty("cipher")
  private String cipher = null;

  @JsonProperty("corporateName")
  private String corporateName = null;

  @JsonProperty("expeditionDate")
  private OffsetDateTime expeditionDate = null;

  @JsonProperty("fiscalCountryCode")
  private String fiscalCountryCode = null;

  /**
   * Gender code of the client
   */
  public enum GenderCodeEnum {
    MALE("MALE"),
    
    FEMALE("FEMALE");

    private String value;

    GenderCodeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static GenderCodeEnum fromValue(String text) {
      for (GenderCodeEnum b : GenderCodeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("genderCode")
  private GenderCodeEnum genderCode = null;

  @JsonProperty("nationalityCountryCode")
  private String nationalityCountryCode = null;

  @JsonProperty("nativeOfficialDocument")
  private String nativeOfficialDocument = null;

  @JsonProperty("nativeOfficialDocumentTypeCode")
  private String nativeOfficialDocumentTypeCode = null;

  @JsonProperty("placeOfExpedition")
  private String placeOfExpedition = null;

  @JsonProperty("regionOfBirth")
  private String regionOfBirth = null;

  @JsonProperty("regionOfExpedition")
  private String regionOfExpedition = null;

  @JsonProperty("residenceValidityExpirationDate")
  private OffsetDateTime residenceValidityExpirationDate = null;

  @JsonProperty("residentCountryFiscalIdentification")
  private String residentCountryFiscalIdentification = null;

  public ItalianRetailMarketClientData authority(String authority) {
    this.authority = authority;
    return this;
  }

  /**
   * The authority name of the identification document
   * @return authority
  **/
  @ApiModelProperty(value = "The authority name of the identification document")


  public String getAuthority() {
    return authority;
  }

  public void setAuthority(String authority) {
    this.authority = authority;
  }

  public ItalianRetailMarketClientData businessCountryFiscalIdentification(String businessCountryFiscalIdentification) {
    this.businessCountryFiscalIdentification = businessCountryFiscalIdentification;
    return this;
  }

  /**
   * Business country fiscal identification
   * @return businessCountryFiscalIdentification
  **/
  @ApiModelProperty(value = "Business country fiscal identification")


  public String getBusinessCountryFiscalIdentification() {
    return businessCountryFiscalIdentification;
  }

  public void setBusinessCountryFiscalIdentification(String businessCountryFiscalIdentification) {
    this.businessCountryFiscalIdentification = businessCountryFiscalIdentification;
  }

  public ItalianRetailMarketClientData cipher(String cipher) {
    this.cipher = cipher;
    return this;
  }

  /**
   * It should be used for encoding clients. In case of being informed, in the communications the full name it will be replaced by the content of this field
   * @return cipher
  **/
  @ApiModelProperty(value = "It should be used for encoding clients. In case of being informed, in the communications the full name it will be replaced by the content of this field")


  public String getCipher() {
    return cipher;
  }

  public void setCipher(String cipher) {
    this.cipher = cipher;
  }

  public ItalianRetailMarketClientData corporateName(String corporateName) {
    this.corporateName = corporateName;
    return this;
  }

  /**
   * Corporate name
   * @return corporateName
  **/
  @ApiModelProperty(value = "Corporate name")


  public String getCorporateName() {
    return corporateName;
  }

  public void setCorporateName(String corporateName) {
    this.corporateName = corporateName;
  }

  public ItalianRetailMarketClientData expeditionDate(OffsetDateTime expeditionDate) {
    this.expeditionDate = expeditionDate;
    return this;
  }

  /**
   * Issue date of the identification card
   * @return expeditionDate
  **/
  @ApiModelProperty(value = "Issue date of the identification card")

  @Valid

  public OffsetDateTime getExpeditionDate() {
    return expeditionDate;
  }

  public void setExpeditionDate(OffsetDateTime expeditionDate) {
    this.expeditionDate = expeditionDate;
  }

  public ItalianRetailMarketClientData fiscalCountryCode(String fiscalCountryCode) {
    this.fiscalCountryCode = fiscalCountryCode;
    return this;
  }

  /**
   * The country code of the Client fiscal address. Refer to {listCountries}
   * @return fiscalCountryCode
  **/
  @ApiModelProperty(value = "The country code of the Client fiscal address. Refer to {listCountries}")


  public String getFiscalCountryCode() {
    return fiscalCountryCode;
  }

  public void setFiscalCountryCode(String fiscalCountryCode) {
    this.fiscalCountryCode = fiscalCountryCode;
  }

  public ItalianRetailMarketClientData genderCode(GenderCodeEnum genderCode) {
    this.genderCode = genderCode;
    return this;
  }

  /**
   * Gender code of the client
   * @return genderCode
  **/
  @ApiModelProperty(value = "Gender code of the client")


  public GenderCodeEnum getGenderCode() {
    return genderCode;
  }

  public void setGenderCode(GenderCodeEnum genderCode) {
    this.genderCode = genderCode;
  }

  public ItalianRetailMarketClientData nationalityCountryCode(String nationalityCountryCode) {
    this.nationalityCountryCode = nationalityCountryCode;
    return this;
  }

  /**
   * The country code of the Client Country of nationality. Refer to {listCountries}
   * @return nationalityCountryCode
  **/
  @ApiModelProperty(value = "The country code of the Client Country of nationality. Refer to {listCountries}")


  public String getNationalityCountryCode() {
    return nationalityCountryCode;
  }

  public void setNationalityCountryCode(String nationalityCountryCode) {
    this.nationalityCountryCode = nationalityCountryCode;
  }

  public ItalianRetailMarketClientData nativeOfficialDocument(String nativeOfficialDocument) {
    this.nativeOfficialDocument = nativeOfficialDocument;
    return this;
  }

  /**
   * Identificaction document of the client in his native country
   * @return nativeOfficialDocument
  **/
  @ApiModelProperty(value = "Identificaction document of the client in his native country")


  public String getNativeOfficialDocument() {
    return nativeOfficialDocument;
  }

  public void setNativeOfficialDocument(String nativeOfficialDocument) {
    this.nativeOfficialDocument = nativeOfficialDocument;
  }

  public ItalianRetailMarketClientData nativeOfficialDocumentTypeCode(String nativeOfficialDocumentTypeCode) {
    this.nativeOfficialDocumentTypeCode = nativeOfficialDocumentTypeCode;
    return this;
  }

  /**
   * Defines the type of the official document assigned to the client in his native country. Refer to {listNativeOfficialDocumentTypes}
   * @return nativeOfficialDocumentTypeCode
  **/
  @ApiModelProperty(value = "Defines the type of the official document assigned to the client in his native country. Refer to {listNativeOfficialDocumentTypes}")


  public String getNativeOfficialDocumentTypeCode() {
    return nativeOfficialDocumentTypeCode;
  }

  public void setNativeOfficialDocumentTypeCode(String nativeOfficialDocumentTypeCode) {
    this.nativeOfficialDocumentTypeCode = nativeOfficialDocumentTypeCode;
  }

  public ItalianRetailMarketClientData placeOfExpedition(String placeOfExpedition) {
    this.placeOfExpedition = placeOfExpedition;
    return this;
  }

  /**
   * Place of expedition
   * @return placeOfExpedition
  **/
  @ApiModelProperty(value = "Place of expedition")


  public String getPlaceOfExpedition() {
    return placeOfExpedition;
  }

  public void setPlaceOfExpedition(String placeOfExpedition) {
    this.placeOfExpedition = placeOfExpedition;
  }

  public ItalianRetailMarketClientData regionOfBirth(String regionOfBirth) {
    this.regionOfBirth = regionOfBirth;
    return this;
  }

  /**
   * Region of Birth
   * @return regionOfBirth
  **/
  @ApiModelProperty(value = "Region of Birth")


  public String getRegionOfBirth() {
    return regionOfBirth;
  }

  public void setRegionOfBirth(String regionOfBirth) {
    this.regionOfBirth = regionOfBirth;
  }

  public ItalianRetailMarketClientData regionOfExpedition(String regionOfExpedition) {
    this.regionOfExpedition = regionOfExpedition;
    return this;
  }

  /**
   * Region of expedition
   * @return regionOfExpedition
  **/
  @ApiModelProperty(value = "Region of expedition")


  public String getRegionOfExpedition() {
    return regionOfExpedition;
  }

  public void setRegionOfExpedition(String regionOfExpedition) {
    this.regionOfExpedition = regionOfExpedition;
  }

  public ItalianRetailMarketClientData residenceValidityExpirationDate(OffsetDateTime residenceValidityExpirationDate) {
    this.residenceValidityExpirationDate = residenceValidityExpirationDate;
    return this;
  }

  /**
   * Residence validaty expiration date
   * @return residenceValidityExpirationDate
  **/
  @ApiModelProperty(value = "Residence validaty expiration date")

  @Valid

  public OffsetDateTime getResidenceValidityExpirationDate() {
    return residenceValidityExpirationDate;
  }

  public void setResidenceValidityExpirationDate(OffsetDateTime residenceValidityExpirationDate) {
    this.residenceValidityExpirationDate = residenceValidityExpirationDate;
  }

  public ItalianRetailMarketClientData residentCountryFiscalIdentification(String residentCountryFiscalIdentification) {
    this.residentCountryFiscalIdentification = residentCountryFiscalIdentification;
    return this;
  }

  /**
   * Fiscal identification of the country of residence
   * @return residentCountryFiscalIdentification
  **/
  @ApiModelProperty(value = "Fiscal identification of the country of residence")


  public String getResidentCountryFiscalIdentification() {
    return residentCountryFiscalIdentification;
  }

  public void setResidentCountryFiscalIdentification(String residentCountryFiscalIdentification) {
    this.residentCountryFiscalIdentification = residentCountryFiscalIdentification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItalianRetailMarketClientData italianRetailMarketClientData = (ItalianRetailMarketClientData) o;
    return Objects.equals(this.authority, italianRetailMarketClientData.authority) &&
        Objects.equals(this.businessCountryFiscalIdentification, italianRetailMarketClientData.businessCountryFiscalIdentification) &&
        Objects.equals(this.cipher, italianRetailMarketClientData.cipher) &&
        Objects.equals(this.corporateName, italianRetailMarketClientData.corporateName) &&
        Objects.equals(this.expeditionDate, italianRetailMarketClientData.expeditionDate) &&
        Objects.equals(this.fiscalCountryCode, italianRetailMarketClientData.fiscalCountryCode) &&
        Objects.equals(this.genderCode, italianRetailMarketClientData.genderCode) &&
        Objects.equals(this.nationalityCountryCode, italianRetailMarketClientData.nationalityCountryCode) &&
        Objects.equals(this.nativeOfficialDocument, italianRetailMarketClientData.nativeOfficialDocument) &&
        Objects.equals(this.nativeOfficialDocumentTypeCode, italianRetailMarketClientData.nativeOfficialDocumentTypeCode) &&
        Objects.equals(this.placeOfExpedition, italianRetailMarketClientData.placeOfExpedition) &&
        Objects.equals(this.regionOfBirth, italianRetailMarketClientData.regionOfBirth) &&
        Objects.equals(this.regionOfExpedition, italianRetailMarketClientData.regionOfExpedition) &&
        Objects.equals(this.residenceValidityExpirationDate, italianRetailMarketClientData.residenceValidityExpirationDate) &&
        Objects.equals(this.residentCountryFiscalIdentification, italianRetailMarketClientData.residentCountryFiscalIdentification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authority, businessCountryFiscalIdentification, cipher, corporateName, expeditionDate, fiscalCountryCode, genderCode, nationalityCountryCode, nativeOfficialDocument, nativeOfficialDocumentTypeCode, placeOfExpedition, regionOfBirth, regionOfExpedition, residenceValidityExpirationDate, residentCountryFiscalIdentification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItalianRetailMarketClientData {\n");
    
    sb.append("    authority: ").append(toIndentedString(authority)).append("\n");
    sb.append("    businessCountryFiscalIdentification: ").append(toIndentedString(businessCountryFiscalIdentification)).append("\n");
    sb.append("    cipher: ").append(toIndentedString(cipher)).append("\n");
    sb.append("    corporateName: ").append(toIndentedString(corporateName)).append("\n");
    sb.append("    expeditionDate: ").append(toIndentedString(expeditionDate)).append("\n");
    sb.append("    fiscalCountryCode: ").append(toIndentedString(fiscalCountryCode)).append("\n");
    sb.append("    genderCode: ").append(toIndentedString(genderCode)).append("\n");
    sb.append("    nationalityCountryCode: ").append(toIndentedString(nationalityCountryCode)).append("\n");
    sb.append("    nativeOfficialDocument: ").append(toIndentedString(nativeOfficialDocument)).append("\n");
    sb.append("    nativeOfficialDocumentTypeCode: ").append(toIndentedString(nativeOfficialDocumentTypeCode)).append("\n");
    sb.append("    placeOfExpedition: ").append(toIndentedString(placeOfExpedition)).append("\n");
    sb.append("    regionOfBirth: ").append(toIndentedString(regionOfBirth)).append("\n");
    sb.append("    regionOfExpedition: ").append(toIndentedString(regionOfExpedition)).append("\n");
    sb.append("    residenceValidityExpirationDate: ").append(toIndentedString(residenceValidityExpirationDate)).append("\n");
    sb.append("    residentCountryFiscalIdentification: ").append(toIndentedString(residentCountryFiscalIdentification)).append("\n");
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

