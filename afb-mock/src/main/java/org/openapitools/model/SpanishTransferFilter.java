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
 * SpanishTransferFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SpanishTransferFilter   {
  @JsonProperty("clientDocument")
  private String clientDocument = null;

  @JsonProperty("contractExternalReference")
  private String contractExternalReference = null;

  /**
   * Indicates whether the search will be on {Fund} or {ETF}
   */
  public enum DealingInstrumentTypeEnum {
    FUND("FUND"),
    
    ETF("ETF");

    private String value;

    DealingInstrumentTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DealingInstrumentTypeEnum fromValue(String text) {
      for (DealingInstrumentTypeEnum b : DealingInstrumentTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("dealingInstrumentType")
  private DealingInstrumentTypeEnum dealingInstrumentType = null;

  @JsonProperty("externalReference")
  private String externalReference = null;

  @JsonProperty("orderedDate")
  private OffsetDateTime orderedDate = null;

  @JsonProperty("statusCode")
  private String statusCode = null;

  @JsonProperty("transferClass")
  private String transferClass = null;

  public SpanishTransferFilter clientDocument(String clientDocument) {
    this.clientDocument = clientDocument;
    return this;
  }

  /**
   * Refers to the {Client.document} of a shareholder of the {Contract} associated to the {SpanishTransfer}
   * @return clientDocument
  **/
  @ApiModelProperty(value = "Refers to the {Client.document} of a shareholder of the {Contract} associated to the {SpanishTransfer}")


  public String getClientDocument() {
    return clientDocument;
  }

  public void setClientDocument(String clientDocument) {
    this.clientDocument = clientDocument;
  }

  public SpanishTransferFilter contractExternalReference(String contractExternalReference) {
    this.contractExternalReference = contractExternalReference;
    return this;
  }

  /**
   * Refers to the {Contract} associated to the {SpanishTransfer}
   * @return contractExternalReference
  **/
  @ApiModelProperty(value = "Refers to the {Contract} associated to the {SpanishTransfer}")


  public String getContractExternalReference() {
    return contractExternalReference;
  }

  public void setContractExternalReference(String contractExternalReference) {
    this.contractExternalReference = contractExternalReference;
  }

  public SpanishTransferFilter dealingInstrumentType(DealingInstrumentTypeEnum dealingInstrumentType) {
    this.dealingInstrumentType = dealingInstrumentType;
    return this;
  }

  /**
   * Indicates whether the search will be on {Fund} or {ETF}
   * @return dealingInstrumentType
  **/
  @ApiModelProperty(value = "Indicates whether the search will be on {Fund} or {ETF}")


  public DealingInstrumentTypeEnum getDealingInstrumentType() {
    return dealingInstrumentType;
  }

  public void setDealingInstrumentType(DealingInstrumentTypeEnum dealingInstrumentType) {
    this.dealingInstrumentType = dealingInstrumentType;
  }

  public SpanishTransferFilter externalReference(String externalReference) {
    this.externalReference = externalReference;
    return this;
  }

  /**
   * Refers to {SpanishTransfer.basicData.externalReference}
   * @return externalReference
  **/
  @ApiModelProperty(value = "Refers to {SpanishTransfer.basicData.externalReference}")


  public String getExternalReference() {
    return externalReference;
  }

  public void setExternalReference(String externalReference) {
    this.externalReference = externalReference;
  }

  public SpanishTransferFilter orderedDate(OffsetDateTime orderedDate) {
    this.orderedDate = orderedDate;
    return this;
  }

  /**
   * Refers to the {SpanishTransfer.basicData.orderedDate}
   * @return orderedDate
  **/
  @ApiModelProperty(value = "Refers to the {SpanishTransfer.basicData.orderedDate}")

  @Valid

  public OffsetDateTime getOrderedDate() {
    return orderedDate;
  }

  public void setOrderedDate(OffsetDateTime orderedDate) {
    this.orderedDate = orderedDate;
  }

  public SpanishTransferFilter statusCode(String statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  /**
   * Refers to {SpanishTransfer.basicData.statusCode}
   * @return statusCode
  **/
  @ApiModelProperty(value = "Refers to {SpanishTransfer.basicData.statusCode}")


  public String getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }

  public SpanishTransferFilter transferClass(String transferClass) {
    this.transferClass = transferClass;
    return this;
  }

  /**
   * Refers to {SpanishTransfer.basicData.transferClass}
   * @return transferClass
  **/
  @ApiModelProperty(value = "Refers to {SpanishTransfer.basicData.transferClass}")


  public String getTransferClass() {
    return transferClass;
  }

  public void setTransferClass(String transferClass) {
    this.transferClass = transferClass;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpanishTransferFilter spanishTransferFilter = (SpanishTransferFilter) o;
    return Objects.equals(this.clientDocument, spanishTransferFilter.clientDocument) &&
        Objects.equals(this.contractExternalReference, spanishTransferFilter.contractExternalReference) &&
        Objects.equals(this.dealingInstrumentType, spanishTransferFilter.dealingInstrumentType) &&
        Objects.equals(this.externalReference, spanishTransferFilter.externalReference) &&
        Objects.equals(this.orderedDate, spanishTransferFilter.orderedDate) &&
        Objects.equals(this.statusCode, spanishTransferFilter.statusCode) &&
        Objects.equals(this.transferClass, spanishTransferFilter.transferClass);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientDocument, contractExternalReference, dealingInstrumentType, externalReference, orderedDate, statusCode, transferClass);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpanishTransferFilter {\n");
    
    sb.append("    clientDocument: ").append(toIndentedString(clientDocument)).append("\n");
    sb.append("    contractExternalReference: ").append(toIndentedString(contractExternalReference)).append("\n");
    sb.append("    dealingInstrumentType: ").append(toIndentedString(dealingInstrumentType)).append("\n");
    sb.append("    externalReference: ").append(toIndentedString(externalReference)).append("\n");
    sb.append("    orderedDate: ").append(toIndentedString(orderedDate)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    transferClass: ").append(toIndentedString(transferClass)).append("\n");
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

