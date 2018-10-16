package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This object keeps information about transferor/transferee data. Will only be informed for {StockTransfer} whose {StockTransferBasicData.stockTransferTypeCode} is set to &#x60;EXTERNAL&#x60; .
 */
@ApiModel(description = "This object keeps information about transferor/transferee data. Will only be informed for {StockTransfer} whose {StockTransferBasicData.stockTransferTypeCode} is set to `EXTERNAL` .")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class ExternalStockTransferData   {
  @JsonProperty("address")
  private String address = null;

  @JsonProperty("document")
  private String document = null;

  @JsonProperty("externalAccountCode")
  private String externalAccountCode = null;

  @JsonProperty("externalAccountName")
  private String externalAccountName = null;

  @JsonProperty("externalCurrentAccountCode")
  private String externalCurrentAccountCode = null;

  @JsonProperty("name")
  private String name = null;

  public ExternalStockTransferData address(String address) {
    this.address = address;
    return this;
  }

  /**
   * The transferor/transferee address
   * @return address
  **/
  @ApiModelProperty(value = "The transferor/transferee address")


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public ExternalStockTransferData document(String document) {
    this.document = document;
    return this;
  }

  /**
   * The transferor/transferee identification document
   * @return document
  **/
  @ApiModelProperty(value = "The transferor/transferee identification document")


  public String getDocument() {
    return document;
  }

  public void setDocument(String document) {
    this.document = document;
  }

  public ExternalStockTransferData externalAccountCode(String externalAccountCode) {
    this.externalAccountCode = externalAccountCode;
    return this;
  }

  /**
   * The external account code of the transferor/transferee
   * @return externalAccountCode
  **/
  @ApiModelProperty(value = "The external account code of the transferor/transferee")


  public String getExternalAccountCode() {
    return externalAccountCode;
  }

  public void setExternalAccountCode(String externalAccountCode) {
    this.externalAccountCode = externalAccountCode;
  }

  public ExternalStockTransferData externalAccountName(String externalAccountName) {
    this.externalAccountName = externalAccountName;
    return this;
  }

  /**
   * The external account name of the transferor/transferee
   * @return externalAccountName
  **/
  @ApiModelProperty(value = "The external account name of the transferor/transferee")


  public String getExternalAccountName() {
    return externalAccountName;
  }

  public void setExternalAccountName(String externalAccountName) {
    this.externalAccountName = externalAccountName;
  }

  public ExternalStockTransferData externalCurrentAccountCode(String externalCurrentAccountCode) {
    this.externalCurrentAccountCode = externalCurrentAccountCode;
    return this;
  }

  /**
   * The external Current Account Code of the transferor/transferee
   * @return externalCurrentAccountCode
  **/
  @ApiModelProperty(value = "The external Current Account Code of the transferor/transferee")


  public String getExternalCurrentAccountCode() {
    return externalCurrentAccountCode;
  }

  public void setExternalCurrentAccountCode(String externalCurrentAccountCode) {
    this.externalCurrentAccountCode = externalCurrentAccountCode;
  }

  public ExternalStockTransferData name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The transferor/transferee name
   * @return name
  **/
  @ApiModelProperty(value = "The transferor/transferee name")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalStockTransferData externalStockTransferData = (ExternalStockTransferData) o;
    return Objects.equals(this.address, externalStockTransferData.address) &&
        Objects.equals(this.document, externalStockTransferData.document) &&
        Objects.equals(this.externalAccountCode, externalStockTransferData.externalAccountCode) &&
        Objects.equals(this.externalAccountName, externalStockTransferData.externalAccountName) &&
        Objects.equals(this.externalCurrentAccountCode, externalStockTransferData.externalCurrentAccountCode) &&
        Objects.equals(this.name, externalStockTransferData.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, document, externalAccountCode, externalAccountName, externalCurrentAccountCode, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalStockTransferData {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    externalAccountCode: ").append(toIndentedString(externalAccountCode)).append("\n");
    sb.append("    externalAccountName: ").append(toIndentedString(externalAccountName)).append("\n");
    sb.append("    externalCurrentAccountCode: ").append(toIndentedString(externalCurrentAccountCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

