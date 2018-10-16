package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Specific FATCA data required for Italian Retail Market clients. FATCA is a law passed by the US Congress on March 18, 2010
 */
@ApiModel(description = "Specific FATCA data required for Italian Retail Market clients. FATCA is a law passed by the US Congress on March 18, 2010")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class ItalianRetailMarketFatcaData   {
  @JsonProperty("ateco")
  private String ateco = null;

  @JsonProperty("clientFatcaStatusCode")
  private String clientFatcaStatusCode = null;

  @JsonProperty("distributorFatcaStatusCode")
  private String distributorFatcaStatusCode = null;

  @JsonProperty("documentIssuingCountryCode")
  private String documentIssuingCountryCode = null;

  @JsonProperty("fatcaCertificateTypeCode")
  private String fatcaCertificateTypeCode = null;

  @JsonProperty("newAccount")
  private Boolean newAccount = null;

  @JsonProperty("secondNationalityCountryCode")
  private String secondNationalityCountryCode = null;

  @JsonProperty("thirdNationalityCountryCode")
  private String thirdNationalityCountryCode = null;

  @JsonProperty("usGiin")
  private String usGiin = null;

  @JsonProperty("usTin")
  private String usTin = null;

  @JsonProperty("usTinTypeCode")
  private String usTinTypeCode = null;

  public ItalianRetailMarketFatcaData ateco(String ateco) {
    this.ateco = ateco;
    return this;
  }

  /**
   * Italian economic activity classificacion code
   * @return ateco
  **/
  @ApiModelProperty(value = "Italian economic activity classificacion code")


  public String getAteco() {
    return ateco;
  }

  public void setAteco(String ateco) {
    this.ateco = ateco;
  }

  public ItalianRetailMarketFatcaData clientFatcaStatusCode(String clientFatcaStatusCode) {
    this.clientFatcaStatusCode = clientFatcaStatusCode;
    return this;
  }

  /**
   * Status \"sintetico\" provided by the person (\"autocertificazione\"). Refer to {listFatcaStatuses}
   * @return clientFatcaStatusCode
  **/
  @ApiModelProperty(value = "Status \"sintetico\" provided by the person (\"autocertificazione\"). Refer to {listFatcaStatuses}")


  public String getClientFatcaStatusCode() {
    return clientFatcaStatusCode;
  }

  public void setClientFatcaStatusCode(String clientFatcaStatusCode) {
    this.clientFatcaStatusCode = clientFatcaStatusCode;
  }

  public ItalianRetailMarketFatcaData distributorFatcaStatusCode(String distributorFatcaStatusCode) {
    this.distributorFatcaStatusCode = distributorFatcaStatusCode;
    return this;
  }

  /**
   * Status \"sintetico\" provided by the distributor (\"collocatore\"). Refer to {listFatcaStatuses}
   * @return distributorFatcaStatusCode
  **/
  @ApiModelProperty(value = "Status \"sintetico\" provided by the distributor (\"collocatore\"). Refer to {listFatcaStatuses}")


  public String getDistributorFatcaStatusCode() {
    return distributorFatcaStatusCode;
  }

  public void setDistributorFatcaStatusCode(String distributorFatcaStatusCode) {
    this.distributorFatcaStatusCode = distributorFatcaStatusCode;
  }

  public ItalianRetailMarketFatcaData documentIssuingCountryCode(String documentIssuingCountryCode) {
    this.documentIssuingCountryCode = documentIssuingCountryCode;
    return this;
  }

  /**
   * The country code of the country issuing the identification document. Refer to {listCountries}
   * @return documentIssuingCountryCode
  **/
  @ApiModelProperty(value = "The country code of the country issuing the identification document. Refer to {listCountries}")


  public String getDocumentIssuingCountryCode() {
    return documentIssuingCountryCode;
  }

  public void setDocumentIssuingCountryCode(String documentIssuingCountryCode) {
    this.documentIssuingCountryCode = documentIssuingCountryCode;
  }

  public ItalianRetailMarketFatcaData fatcaCertificateTypeCode(String fatcaCertificateTypeCode) {
    this.fatcaCertificateTypeCode = fatcaCertificateTypeCode;
    return this;
  }

  /**
   * Type of the FATCA certificate provided by the person Refer to {listFatcaCertificateTypes}
   * @return fatcaCertificateTypeCode
  **/
  @ApiModelProperty(value = "Type of the FATCA certificate provided by the person Refer to {listFatcaCertificateTypes}")


  public String getFatcaCertificateTypeCode() {
    return fatcaCertificateTypeCode;
  }

  public void setFatcaCertificateTypeCode(String fatcaCertificateTypeCode) {
    this.fatcaCertificateTypeCode = fatcaCertificateTypeCode;
  }

  public ItalianRetailMarketFatcaData newAccount(Boolean newAccount) {
    this.newAccount = newAccount;
    return this;
  }

  /**
   * Pre-existing or new account regarding FATCA start date
   * @return newAccount
  **/
  @ApiModelProperty(value = "Pre-existing or new account regarding FATCA start date")


  public Boolean getNewAccount() {
    return newAccount;
  }

  public void setNewAccount(Boolean newAccount) {
    this.newAccount = newAccount;
  }

  public ItalianRetailMarketFatcaData secondNationalityCountryCode(String secondNationalityCountryCode) {
    this.secondNationalityCountryCode = secondNationalityCountryCode;
    return this;
  }

  /**
   * The country code. Refer to {listCountries}
   * @return secondNationalityCountryCode
  **/
  @ApiModelProperty(value = "The country code. Refer to {listCountries}")


  public String getSecondNationalityCountryCode() {
    return secondNationalityCountryCode;
  }

  public void setSecondNationalityCountryCode(String secondNationalityCountryCode) {
    this.secondNationalityCountryCode = secondNationalityCountryCode;
  }

  public ItalianRetailMarketFatcaData thirdNationalityCountryCode(String thirdNationalityCountryCode) {
    this.thirdNationalityCountryCode = thirdNationalityCountryCode;
    return this;
  }

  /**
   * The country code. Refer to {listCountries}
   * @return thirdNationalityCountryCode
  **/
  @ApiModelProperty(value = "The country code. Refer to {listCountries}")


  public String getThirdNationalityCountryCode() {
    return thirdNationalityCountryCode;
  }

  public void setThirdNationalityCountryCode(String thirdNationalityCountryCode) {
    this.thirdNationalityCountryCode = thirdNationalityCountryCode;
  }

  public ItalianRetailMarketFatcaData usGiin(String usGiin) {
    this.usGiin = usGiin;
    return this;
  }

  /**
   * Global Intermediary Identification Number of the person
   * @return usGiin
  **/
  @ApiModelProperty(value = "Global Intermediary Identification Number of the person")


  public String getUsGiin() {
    return usGiin;
  }

  public void setUsGiin(String usGiin) {
    this.usGiin = usGiin;
  }

  public ItalianRetailMarketFatcaData usTin(String usTin) {
    this.usTin = usTin;
    return this;
  }

  /**
   * Tax payer identification number
   * @return usTin
  **/
  @ApiModelProperty(value = "Tax payer identification number")


  public String getUsTin() {
    return usTin;
  }

  public void setUsTin(String usTin) {
    this.usTin = usTin;
  }

  public ItalianRetailMarketFatcaData usTinTypeCode(String usTinTypeCode) {
    this.usTinTypeCode = usTinTypeCode;
    return this;
  }

  /**
   * Tax payer identification number type. Refer to {listUsTinTypes}
   * @return usTinTypeCode
  **/
  @ApiModelProperty(value = "Tax payer identification number type. Refer to {listUsTinTypes}")


  public String getUsTinTypeCode() {
    return usTinTypeCode;
  }

  public void setUsTinTypeCode(String usTinTypeCode) {
    this.usTinTypeCode = usTinTypeCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItalianRetailMarketFatcaData italianRetailMarketFatcaData = (ItalianRetailMarketFatcaData) o;
    return Objects.equals(this.ateco, italianRetailMarketFatcaData.ateco) &&
        Objects.equals(this.clientFatcaStatusCode, italianRetailMarketFatcaData.clientFatcaStatusCode) &&
        Objects.equals(this.distributorFatcaStatusCode, italianRetailMarketFatcaData.distributorFatcaStatusCode) &&
        Objects.equals(this.documentIssuingCountryCode, italianRetailMarketFatcaData.documentIssuingCountryCode) &&
        Objects.equals(this.fatcaCertificateTypeCode, italianRetailMarketFatcaData.fatcaCertificateTypeCode) &&
        Objects.equals(this.newAccount, italianRetailMarketFatcaData.newAccount) &&
        Objects.equals(this.secondNationalityCountryCode, italianRetailMarketFatcaData.secondNationalityCountryCode) &&
        Objects.equals(this.thirdNationalityCountryCode, italianRetailMarketFatcaData.thirdNationalityCountryCode) &&
        Objects.equals(this.usGiin, italianRetailMarketFatcaData.usGiin) &&
        Objects.equals(this.usTin, italianRetailMarketFatcaData.usTin) &&
        Objects.equals(this.usTinTypeCode, italianRetailMarketFatcaData.usTinTypeCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ateco, clientFatcaStatusCode, distributorFatcaStatusCode, documentIssuingCountryCode, fatcaCertificateTypeCode, newAccount, secondNationalityCountryCode, thirdNationalityCountryCode, usGiin, usTin, usTinTypeCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItalianRetailMarketFatcaData {\n");
    
    sb.append("    ateco: ").append(toIndentedString(ateco)).append("\n");
    sb.append("    clientFatcaStatusCode: ").append(toIndentedString(clientFatcaStatusCode)).append("\n");
    sb.append("    distributorFatcaStatusCode: ").append(toIndentedString(distributorFatcaStatusCode)).append("\n");
    sb.append("    documentIssuingCountryCode: ").append(toIndentedString(documentIssuingCountryCode)).append("\n");
    sb.append("    fatcaCertificateTypeCode: ").append(toIndentedString(fatcaCertificateTypeCode)).append("\n");
    sb.append("    newAccount: ").append(toIndentedString(newAccount)).append("\n");
    sb.append("    secondNationalityCountryCode: ").append(toIndentedString(secondNationalityCountryCode)).append("\n");
    sb.append("    thirdNationalityCountryCode: ").append(toIndentedString(thirdNationalityCountryCode)).append("\n");
    sb.append("    usGiin: ").append(toIndentedString(usGiin)).append("\n");
    sb.append("    usTin: ").append(toIndentedString(usTin)).append("\n");
    sb.append("    usTinTypeCode: ").append(toIndentedString(usTinTypeCode)).append("\n");
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

