package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This object keeps specific information about data related to Spanish Market.
 */
@ApiModel(description = "This object keeps specific information about data related to Spanish Market.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class TransactionSpanishMarketData   {
  /**
   * Indicates whether the transaction is associated to the Spanish Basque region tax law. \"MIXED\" could be a posible value when this law affects only to a part of the contract's shareholders
   */
  public enum BasqueSpanishRegionEnum {
    YES("YES"),
    
    NO("NO"),
    
    MIXED("MIXED");

    private String value;

    BasqueSpanishRegionEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static BasqueSpanishRegionEnum fromValue(String text) {
      for (BasqueSpanishRegionEnum b : BasqueSpanishRegionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("basqueSpanishRegion")
  private BasqueSpanishRegionEnum basqueSpanishRegion = null;

  @JsonProperty("capitalGainedUntil2005")
  private Double capitalGainedUntil2005 = null;

  @JsonProperty("spanishTransferExternalReference")
  private String spanishTransferExternalReference = null;

  @JsonProperty("spanishTransferId")
  private String spanishTransferId = null;

  @JsonProperty("valuationUntil2005")
  private Double valuationUntil2005 = null;

  @JsonProperty("valuationUntil2006")
  private Double valuationUntil2006 = null;

  public TransactionSpanishMarketData basqueSpanishRegion(BasqueSpanishRegionEnum basqueSpanishRegion) {
    this.basqueSpanishRegion = basqueSpanishRegion;
    return this;
  }

  /**
   * Indicates whether the transaction is associated to the Spanish Basque region tax law. \"MIXED\" could be a posible value when this law affects only to a part of the contract's shareholders
   * @return basqueSpanishRegion
  **/
  @ApiModelProperty(value = "Indicates whether the transaction is associated to the Spanish Basque region tax law. \"MIXED\" could be a posible value when this law affects only to a part of the contract's shareholders")


  public BasqueSpanishRegionEnum getBasqueSpanishRegion() {
    return basqueSpanishRegion;
  }

  public void setBasqueSpanishRegion(BasqueSpanishRegionEnum basqueSpanishRegion) {
    this.basqueSpanishRegion = basqueSpanishRegion;
  }

  public TransactionSpanishMarketData capitalGainedUntil2005(Double capitalGainedUntil2005) {
    this.capitalGainedUntil2005 = capitalGainedUntil2005;
    return this;
  }

  /**
   * Defines the capital gained until December 31th 2006. Expressed in {Transaction.localCurrencyCode}
   * @return capitalGainedUntil2005
  **/
  @ApiModelProperty(value = "Defines the capital gained until December 31th 2006. Expressed in {Transaction.localCurrencyCode}")


  public Double getCapitalGainedUntil2005() {
    return capitalGainedUntil2005;
  }

  public void setCapitalGainedUntil2005(Double capitalGainedUntil2005) {
    this.capitalGainedUntil2005 = capitalGainedUntil2005;
  }

  public TransactionSpanishMarketData spanishTransferExternalReference(String spanishTransferExternalReference) {
    this.spanishTransferExternalReference = spanishTransferExternalReference;
    return this;
  }

  /**
   * If the transction is a Spanish transfer, this field keeps the external reference of this transfer
   * @return spanishTransferExternalReference
  **/
  @ApiModelProperty(value = "If the transction is a Spanish transfer, this field keeps the external reference of this transfer")


  public String getSpanishTransferExternalReference() {
    return spanishTransferExternalReference;
  }

  public void setSpanishTransferExternalReference(String spanishTransferExternalReference) {
    this.spanishTransferExternalReference = spanishTransferExternalReference;
  }

  public TransactionSpanishMarketData spanishTransferId(String spanishTransferId) {
    this.spanishTransferId = spanishTransferId;
    return this;
  }

  /**
   * If the transction is a Spanish transfer, this field keeps the id of this transfer
   * @return spanishTransferId
  **/
  @ApiModelProperty(value = "If the transction is a Spanish transfer, this field keeps the id of this transfer")


  public String getSpanishTransferId() {
    return spanishTransferId;
  }

  public void setSpanishTransferId(String spanishTransferId) {
    this.spanishTransferId = spanishTransferId;
  }

  public TransactionSpanishMarketData valuationUntil2005(Double valuationUntil2005) {
    this.valuationUntil2005 = valuationUntil2005;
    return this;
  }

  /**
   * Defines the amount of the valuation until December 31th 2005. Expressed in {Transaction.localCurrencyCode}
   * @return valuationUntil2005
  **/
  @ApiModelProperty(value = "Defines the amount of the valuation until December 31th 2005. Expressed in {Transaction.localCurrencyCode}")


  public Double getValuationUntil2005() {
    return valuationUntil2005;
  }

  public void setValuationUntil2005(Double valuationUntil2005) {
    this.valuationUntil2005 = valuationUntil2005;
  }

  public TransactionSpanishMarketData valuationUntil2006(Double valuationUntil2006) {
    this.valuationUntil2006 = valuationUntil2006;
    return this;
  }

  /**
   * Defines the amount of the valuation until December 31th 2006. Expressed in {Transaction.localCurrencyCode}
   * @return valuationUntil2006
  **/
  @ApiModelProperty(value = "Defines the amount of the valuation until December 31th 2006. Expressed in {Transaction.localCurrencyCode}")


  public Double getValuationUntil2006() {
    return valuationUntil2006;
  }

  public void setValuationUntil2006(Double valuationUntil2006) {
    this.valuationUntil2006 = valuationUntil2006;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionSpanishMarketData transactionSpanishMarketData = (TransactionSpanishMarketData) o;
    return Objects.equals(this.basqueSpanishRegion, transactionSpanishMarketData.basqueSpanishRegion) &&
        Objects.equals(this.capitalGainedUntil2005, transactionSpanishMarketData.capitalGainedUntil2005) &&
        Objects.equals(this.spanishTransferExternalReference, transactionSpanishMarketData.spanishTransferExternalReference) &&
        Objects.equals(this.spanishTransferId, transactionSpanishMarketData.spanishTransferId) &&
        Objects.equals(this.valuationUntil2005, transactionSpanishMarketData.valuationUntil2005) &&
        Objects.equals(this.valuationUntil2006, transactionSpanishMarketData.valuationUntil2006);
  }

  @Override
  public int hashCode() {
    return Objects.hash(basqueSpanishRegion, capitalGainedUntil2005, spanishTransferExternalReference, spanishTransferId, valuationUntil2005, valuationUntil2006);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionSpanishMarketData {\n");
    
    sb.append("    basqueSpanishRegion: ").append(toIndentedString(basqueSpanishRegion)).append("\n");
    sb.append("    capitalGainedUntil2005: ").append(toIndentedString(capitalGainedUntil2005)).append("\n");
    sb.append("    spanishTransferExternalReference: ").append(toIndentedString(spanishTransferExternalReference)).append("\n");
    sb.append("    spanishTransferId: ").append(toIndentedString(spanishTransferId)).append("\n");
    sb.append("    valuationUntil2005: ").append(toIndentedString(valuationUntil2005)).append("\n");
    sb.append("    valuationUntil2006: ").append(toIndentedString(valuationUntil2006)).append("\n");
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

