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
 * CashClient
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class CashClient   {
  @JsonProperty("address")
  private Address address = null;

  @JsonProperty("bic")
  private String bic = null;

  @JsonProperty("cashBranchCode")
  private String cashBranchCode = null;

  @JsonProperty("cashClientTypeCode")
  private String cashClientTypeCode = null;

  @JsonProperty("cashUnitCode")
  private String cashUnitCode = null;

  @JsonProperty("externalReference")
  private String externalReference = null;

  @JsonProperty("fax")
  private String fax = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("languageCode")
  private String languageCode = null;

  @JsonProperty("mnemonicName")
  private String mnemonicName = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("shortName")
  private String shortName = null;

  @JsonProperty("telephone")
  private String telephone = null;

  public CashClient address(Address address) {
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

  public CashClient bic(String bic) {
    this.bic = bic;
    return this;
  }

  /**
   * The 'Bank Identifier Code' associated to the {CashClient}
   * @return bic
  **/
  @ApiModelProperty(value = "The 'Bank Identifier Code' associated to the {CashClient}")


  public String getBic() {
    return bic;
  }

  public void setBic(String bic) {
    this.bic = bic;
  }

  public CashClient cashBranchCode(String cashBranchCode) {
    this.cashBranchCode = cashBranchCode;
    return this;
  }

  /**
   * The {CashClient} branch. Refer to {listCashBranches}
   * @return cashBranchCode
  **/
  @ApiModelProperty(value = "The {CashClient} branch. Refer to {listCashBranches}")


  public String getCashBranchCode() {
    return cashBranchCode;
  }

  public void setCashBranchCode(String cashBranchCode) {
    this.cashBranchCode = cashBranchCode;
  }

  public CashClient cashClientTypeCode(String cashClientTypeCode) {
    this.cashClientTypeCode = cashClientTypeCode;
    return this;
  }

  /**
   * The {CashClient} type code. Refer to {listCashClientTypes}
   * @return cashClientTypeCode
  **/
  @ApiModelProperty(value = "The {CashClient} type code. Refer to {listCashClientTypes}")


  public String getCashClientTypeCode() {
    return cashClientTypeCode;
  }

  public void setCashClientTypeCode(String cashClientTypeCode) {
    this.cashClientTypeCode = cashClientTypeCode;
  }

  public CashClient cashUnitCode(String cashUnitCode) {
    this.cashUnitCode = cashUnitCode;
    return this;
  }

  /**
   * The {CashClient} unit. Refer to {listCashUnits}
   * @return cashUnitCode
  **/
  @ApiModelProperty(value = "The {CashClient} unit. Refer to {listCashUnits}")


  public String getCashUnitCode() {
    return cashUnitCode;
  }

  public void setCashUnitCode(String cashUnitCode) {
    this.cashUnitCode = cashUnitCode;
  }

  public CashClient externalReference(String externalReference) {
    this.externalReference = externalReference;
    return this;
  }

  /**
   * The external reference assigned to the {CashClient}
   * @return externalReference
  **/
  @ApiModelProperty(value = "The external reference assigned to the {CashClient}")


  public String getExternalReference() {
    return externalReference;
  }

  public void setExternalReference(String externalReference) {
    this.externalReference = externalReference;
  }

  public CashClient fax(String fax) {
    this.fax = fax;
    return this;
  }

  /**
   * Fax number
   * @return fax
  **/
  @ApiModelProperty(value = "Fax number")


  public String getFax() {
    return fax;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }

  public CashClient id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The {CashClient} internal Id
   * @return id
  **/
  @ApiModelProperty(value = "The {CashClient} internal Id")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CashClient languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * The {CashClient} language code. Refer to {listLanguages}
   * @return languageCode
  **/
  @ApiModelProperty(value = "The {CashClient} language code. Refer to {listLanguages}")


  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }

  public CashClient mnemonicName(String mnemonicName) {
    this.mnemonicName = mnemonicName;
    return this;
  }

  /**
   * The mnemonic name of the {CashClient}
   * @return mnemonicName
  **/
  @ApiModelProperty(value = "The mnemonic name of the {CashClient}")


  public String getMnemonicName() {
    return mnemonicName;
  }

  public void setMnemonicName(String mnemonicName) {
    this.mnemonicName = mnemonicName;
  }

  public CashClient name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the {CashClient}
   * @return name
  **/
  @ApiModelProperty(value = "The name of the {CashClient}")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CashClient shortName(String shortName) {
    this.shortName = shortName;
    return this;
  }

  /**
   * The short name of the {CashClient}
   * @return shortName
  **/
  @ApiModelProperty(value = "The short name of the {CashClient}")


  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  public CashClient telephone(String telephone) {
    this.telephone = telephone;
    return this;
  }

  /**
   * Telephone number
   * @return telephone
  **/
  @ApiModelProperty(value = "Telephone number")


  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CashClient cashClient = (CashClient) o;
    return Objects.equals(this.address, cashClient.address) &&
        Objects.equals(this.bic, cashClient.bic) &&
        Objects.equals(this.cashBranchCode, cashClient.cashBranchCode) &&
        Objects.equals(this.cashClientTypeCode, cashClient.cashClientTypeCode) &&
        Objects.equals(this.cashUnitCode, cashClient.cashUnitCode) &&
        Objects.equals(this.externalReference, cashClient.externalReference) &&
        Objects.equals(this.fax, cashClient.fax) &&
        Objects.equals(this.id, cashClient.id) &&
        Objects.equals(this.languageCode, cashClient.languageCode) &&
        Objects.equals(this.mnemonicName, cashClient.mnemonicName) &&
        Objects.equals(this.name, cashClient.name) &&
        Objects.equals(this.shortName, cashClient.shortName) &&
        Objects.equals(this.telephone, cashClient.telephone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, bic, cashBranchCode, cashClientTypeCode, cashUnitCode, externalReference, fax, id, languageCode, mnemonicName, name, shortName, telephone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashClient {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    bic: ").append(toIndentedString(bic)).append("\n");
    sb.append("    cashBranchCode: ").append(toIndentedString(cashBranchCode)).append("\n");
    sb.append("    cashClientTypeCode: ").append(toIndentedString(cashClientTypeCode)).append("\n");
    sb.append("    cashUnitCode: ").append(toIndentedString(cashUnitCode)).append("\n");
    sb.append("    externalReference: ").append(toIndentedString(externalReference)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    mnemonicName: ").append(toIndentedString(mnemonicName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    telephone: ").append(toIndentedString(telephone)).append("\n");
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

