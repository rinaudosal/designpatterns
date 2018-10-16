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
 * SpanishTransferBasicData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SpanishTransferBasicData   {
  @JsonProperty("amount")
  private Double amount = null;

  @JsonProperty("distributorId")
  private Long distributorId = null;

  @JsonProperty("externalReference")
  private String externalReference = null;

  @JsonProperty("orderedDate")
  private OffsetDateTime orderedDate = null;

  /**
   * The request type of the {SpanishTransfer}.
   */
  public enum RequestTypeEnum {
    OUTSIDE("OUTSIDE"),
    
    INSIDE("INSIDE");

    private String value;

    RequestTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RequestTypeEnum fromValue(String text) {
      for (RequestTypeEnum b : RequestTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("requestType")
  private RequestTypeEnum requestType = null;

  @JsonProperty("shares")
  private Double shares = null;

  @JsonProperty("statusCode")
  private String statusCode = null;

  @JsonProperty("subdistributorId")
  private Long subdistributorId = null;

  /**
   * The class of the {SpanishTransfer}.
   */
  public enum TransferClassEnum {
    ENTRY("ENTRY"),
    
    EXIT("EXIT"),
    
    INTERNAL("INTERNAL");

    private String value;

    TransferClassEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TransferClassEnum fromValue(String text) {
      for (TransferClassEnum b : TransferClassEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("transferClass")
  private TransferClassEnum transferClass = null;

  /**
   * The type of the {SpanishTransfer}.
   */
  public enum TransferTypeEnum {
    TOTAL("TOTAL"),
    
    PARTIAL("PARTIAL");

    private String value;

    TransferTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TransferTypeEnum fromValue(String text) {
      for (TransferTypeEnum b : TransferTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("transferType")
  private TransferTypeEnum transferType = null;

  public SpanishTransferBasicData amount(Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The amount assigned to the {SpanishTransfer} expressed in {SpanishTransfer.destinationItem.currencyCode}
   * @return amount
  **/
  @ApiModelProperty(value = "The amount assigned to the {SpanishTransfer} expressed in {SpanishTransfer.destinationItem.currencyCode}")


  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public SpanishTransferBasicData distributorId(Long distributorId) {
    this.distributorId = distributorId;
    return this;
  }

  /**
   * The Id of the {Distributor}
   * @return distributorId
  **/
  @ApiModelProperty(value = "The Id of the {Distributor}")


  public Long getDistributorId() {
    return distributorId;
  }

  public void setDistributorId(Long distributorId) {
    this.distributorId = distributorId;
  }

  public SpanishTransferBasicData externalReference(String externalReference) {
    this.externalReference = externalReference;
    return this;
  }

  /**
   * External Reference of the {SpanishTransfer}
   * @return externalReference
  **/
  @ApiModelProperty(value = "External Reference of the {SpanishTransfer}")


  public String getExternalReference() {
    return externalReference;
  }

  public void setExternalReference(String externalReference) {
    this.externalReference = externalReference;
  }

  public SpanishTransferBasicData orderedDate(OffsetDateTime orderedDate) {
    this.orderedDate = orderedDate;
    return this;
  }

  /**
   * The ordered date of the {SpanishTransfer}
   * @return orderedDate
  **/
  @ApiModelProperty(value = "The ordered date of the {SpanishTransfer}")

  @Valid

  public OffsetDateTime getOrderedDate() {
    return orderedDate;
  }

  public void setOrderedDate(OffsetDateTime orderedDate) {
    this.orderedDate = orderedDate;
  }

  public SpanishTransferBasicData requestType(RequestTypeEnum requestType) {
    this.requestType = requestType;
    return this;
  }

  /**
   * The request type of the {SpanishTransfer}.
   * @return requestType
  **/
  @ApiModelProperty(value = "The request type of the {SpanishTransfer}.")


  public RequestTypeEnum getRequestType() {
    return requestType;
  }

  public void setRequestType(RequestTypeEnum requestType) {
    this.requestType = requestType;
  }

  public SpanishTransferBasicData shares(Double shares) {
    this.shares = shares;
    return this;
  }

  /**
   * The shared assigned to the {SpanishTransfer}
   * @return shares
  **/
  @ApiModelProperty(value = "The shared assigned to the {SpanishTransfer}")


  public Double getShares() {
    return shares;
  }

  public void setShares(Double shares) {
    this.shares = shares;
  }

  public SpanishTransferBasicData statusCode(String statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  /**
   * The status of the {SpanishTransfer}. Refer of {listSpanishTransferStatuses}
   * @return statusCode
  **/
  @ApiModelProperty(value = "The status of the {SpanishTransfer}. Refer of {listSpanishTransferStatuses}")


  public String getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }

  public SpanishTransferBasicData subdistributorId(Long subdistributorId) {
    this.subdistributorId = subdistributorId;
    return this;
  }

  /**
   * The Id of the {Subdistributor}
   * @return subdistributorId
  **/
  @ApiModelProperty(value = "The Id of the {Subdistributor}")


  public Long getSubdistributorId() {
    return subdistributorId;
  }

  public void setSubdistributorId(Long subdistributorId) {
    this.subdistributorId = subdistributorId;
  }

  public SpanishTransferBasicData transferClass(TransferClassEnum transferClass) {
    this.transferClass = transferClass;
    return this;
  }

  /**
   * The class of the {SpanishTransfer}.
   * @return transferClass
  **/
  @ApiModelProperty(value = "The class of the {SpanishTransfer}.")


  public TransferClassEnum getTransferClass() {
    return transferClass;
  }

  public void setTransferClass(TransferClassEnum transferClass) {
    this.transferClass = transferClass;
  }

  public SpanishTransferBasicData transferType(TransferTypeEnum transferType) {
    this.transferType = transferType;
    return this;
  }

  /**
   * The type of the {SpanishTransfer}.
   * @return transferType
  **/
  @ApiModelProperty(value = "The type of the {SpanishTransfer}.")


  public TransferTypeEnum getTransferType() {
    return transferType;
  }

  public void setTransferType(TransferTypeEnum transferType) {
    this.transferType = transferType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpanishTransferBasicData spanishTransferBasicData = (SpanishTransferBasicData) o;
    return Objects.equals(this.amount, spanishTransferBasicData.amount) &&
        Objects.equals(this.distributorId, spanishTransferBasicData.distributorId) &&
        Objects.equals(this.externalReference, spanishTransferBasicData.externalReference) &&
        Objects.equals(this.orderedDate, spanishTransferBasicData.orderedDate) &&
        Objects.equals(this.requestType, spanishTransferBasicData.requestType) &&
        Objects.equals(this.shares, spanishTransferBasicData.shares) &&
        Objects.equals(this.statusCode, spanishTransferBasicData.statusCode) &&
        Objects.equals(this.subdistributorId, spanishTransferBasicData.subdistributorId) &&
        Objects.equals(this.transferClass, spanishTransferBasicData.transferClass) &&
        Objects.equals(this.transferType, spanishTransferBasicData.transferType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, distributorId, externalReference, orderedDate, requestType, shares, statusCode, subdistributorId, transferClass, transferType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpanishTransferBasicData {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    distributorId: ").append(toIndentedString(distributorId)).append("\n");
    sb.append("    externalReference: ").append(toIndentedString(externalReference)).append("\n");
    sb.append("    orderedDate: ").append(toIndentedString(orderedDate)).append("\n");
    sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
    sb.append("    shares: ").append(toIndentedString(shares)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    subdistributorId: ").append(toIndentedString(subdistributorId)).append("\n");
    sb.append("    transferClass: ").append(toIndentedString(transferClass)).append("\n");
    sb.append("    transferType: ").append(toIndentedString(transferType)).append("\n");
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

