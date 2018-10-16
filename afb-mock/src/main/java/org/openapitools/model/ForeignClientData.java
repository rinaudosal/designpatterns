package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This object keeps information related with natural clients who do not reside in Spain
 */
@ApiModel(description = "This object keeps information related with natural clients who do not reside in Spain")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class ForeignClientData   {
  @JsonProperty("certficationDate")
  private OffsetDateTime certficationDate = null;

  @JsonProperty("nativeFiscalIdentification")
  private String nativeFiscalIdentification = null;

  @JsonProperty("nativeOfficialDocument")
  private String nativeOfficialDocument = null;

  @JsonProperty("nativeOfficialDocumentTypeCode")
  private String nativeOfficialDocumentTypeCode = null;

  @JsonProperty("nonResidentDocumentTypeCode")
  private String nonResidentDocumentTypeCode = null;

  public ForeignClientData certficationDate(OffsetDateTime certficationDate) {
    this.certficationDate = certficationDate;
    return this;
  }

  /**
   * Defines the  expiration date of the fiscal residence certificate
   * @return certficationDate
  **/
  @ApiModelProperty(value = "Defines the  expiration date of the fiscal residence certificate")

  @Valid

  public OffsetDateTime getCertficationDate() {
    return certficationDate;
  }

  public void setCertficationDate(OffsetDateTime certficationDate) {
    this.certficationDate = certficationDate;
  }

  public ForeignClientData nativeFiscalIdentification(String nativeFiscalIdentification) {
    this.nativeFiscalIdentification = nativeFiscalIdentification;
    return this;
  }

  /**
   * Native fiscal identification
   * @return nativeFiscalIdentification
  **/
  @ApiModelProperty(value = "Native fiscal identification")


  public String getNativeFiscalIdentification() {
    return nativeFiscalIdentification;
  }

  public void setNativeFiscalIdentification(String nativeFiscalIdentification) {
    this.nativeFiscalIdentification = nativeFiscalIdentification;
  }

  public ForeignClientData nativeOfficialDocument(String nativeOfficialDocument) {
    this.nativeOfficialDocument = nativeOfficialDocument;
    return this;
  }

  /**
   * Native official document value
   * @return nativeOfficialDocument
  **/
  @ApiModelProperty(value = "Native official document value")


  public String getNativeOfficialDocument() {
    return nativeOfficialDocument;
  }

  public void setNativeOfficialDocument(String nativeOfficialDocument) {
    this.nativeOfficialDocument = nativeOfficialDocument;
  }

  public ForeignClientData nativeOfficialDocumentTypeCode(String nativeOfficialDocumentTypeCode) {
    this.nativeOfficialDocumentTypeCode = nativeOfficialDocumentTypeCode;
    return this;
  }

  /**
   * The official document provided by the native country. Refer to {listNativeOfficialDocumentTypes}
   * @return nativeOfficialDocumentTypeCode
  **/
  @ApiModelProperty(value = "The official document provided by the native country. Refer to {listNativeOfficialDocumentTypes}")


  public String getNativeOfficialDocumentTypeCode() {
    return nativeOfficialDocumentTypeCode;
  }

  public void setNativeOfficialDocumentTypeCode(String nativeOfficialDocumentTypeCode) {
    this.nativeOfficialDocumentTypeCode = nativeOfficialDocumentTypeCode;
  }

  public ForeignClientData nonResidentDocumentTypeCode(String nonResidentDocumentTypeCode) {
    this.nonResidentDocumentTypeCode = nonResidentDocumentTypeCode;
    return this;
  }

  /**
   * Defines the type of the certifiacation about \"Non resident\" client property. Refer to {listNonResidentDocumentTypes}
   * @return nonResidentDocumentTypeCode
  **/
  @ApiModelProperty(value = "Defines the type of the certifiacation about \"Non resident\" client property. Refer to {listNonResidentDocumentTypes}")


  public String getNonResidentDocumentTypeCode() {
    return nonResidentDocumentTypeCode;
  }

  public void setNonResidentDocumentTypeCode(String nonResidentDocumentTypeCode) {
    this.nonResidentDocumentTypeCode = nonResidentDocumentTypeCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForeignClientData foreignClientData = (ForeignClientData) o;
    return Objects.equals(this.certficationDate, foreignClientData.certficationDate) &&
        Objects.equals(this.nativeFiscalIdentification, foreignClientData.nativeFiscalIdentification) &&
        Objects.equals(this.nativeOfficialDocument, foreignClientData.nativeOfficialDocument) &&
        Objects.equals(this.nativeOfficialDocumentTypeCode, foreignClientData.nativeOfficialDocumentTypeCode) &&
        Objects.equals(this.nonResidentDocumentTypeCode, foreignClientData.nonResidentDocumentTypeCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certficationDate, nativeFiscalIdentification, nativeOfficialDocument, nativeOfficialDocumentTypeCode, nonResidentDocumentTypeCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForeignClientData {\n");
    
    sb.append("    certficationDate: ").append(toIndentedString(certficationDate)).append("\n");
    sb.append("    nativeFiscalIdentification: ").append(toIndentedString(nativeFiscalIdentification)).append("\n");
    sb.append("    nativeOfficialDocument: ").append(toIndentedString(nativeOfficialDocument)).append("\n");
    sb.append("    nativeOfficialDocumentTypeCode: ").append(toIndentedString(nativeOfficialDocumentTypeCode)).append("\n");
    sb.append("    nonResidentDocumentTypeCode: ").append(toIndentedString(nonResidentDocumentTypeCode)).append("\n");
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

