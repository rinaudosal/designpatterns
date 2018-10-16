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
 * SpanishTransferRequestsDatesFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SpanishTransferRequestsDatesFilter   {
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

  @JsonProperty("endDate")
  private OffsetDateTime endDate = null;

  @JsonProperty("statusCode")
  private String statusCode = null;

  @JsonProperty("transferClass")
  private String transferClass = null;

  public SpanishTransferRequestsDatesFilter dealingInstrumentType(DealingInstrumentTypeEnum dealingInstrumentType) {
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

  public SpanishTransferRequestsDatesFilter endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Refers to the date used as end date. The service will search only available dates before that this one.
   * @return endDate
  **/
  @ApiModelProperty(value = "Refers to the date used as end date. The service will search only available dates before that this one.")

  @Valid

  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public SpanishTransferRequestsDatesFilter statusCode(String statusCode) {
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

  public SpanishTransferRequestsDatesFilter transferClass(String transferClass) {
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
    SpanishTransferRequestsDatesFilter spanishTransferRequestsDatesFilter = (SpanishTransferRequestsDatesFilter) o;
    return Objects.equals(this.dealingInstrumentType, spanishTransferRequestsDatesFilter.dealingInstrumentType) &&
        Objects.equals(this.endDate, spanishTransferRequestsDatesFilter.endDate) &&
        Objects.equals(this.statusCode, spanishTransferRequestsDatesFilter.statusCode) &&
        Objects.equals(this.transferClass, spanishTransferRequestsDatesFilter.transferClass);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dealingInstrumentType, endDate, statusCode, transferClass);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpanishTransferRequestsDatesFilter {\n");
    
    sb.append("    dealingInstrumentType: ").append(toIndentedString(dealingInstrumentType)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

