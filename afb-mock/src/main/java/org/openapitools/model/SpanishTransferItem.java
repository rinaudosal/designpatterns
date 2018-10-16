package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.KeyValue;
import org.openapitools.model.ResourceReference;
import org.openapitools.model.SpanishTransferEtfData;
import org.openapitools.model.SpanishTransferFeeData;
import org.openapitools.model.SpanishTransferMarketer;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SpanishTransferItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SpanishTransferItem   {
  @JsonProperty("contractExternalReference")
  private String contractExternalReference = null;

  @JsonProperty("currencyCode")
  private String currencyCode = null;

  @JsonProperty("dealingInstrument")
  private ResourceReference dealingInstrument = null;

  @JsonProperty("dealingInstrumentExternalCodeKeyValues")
  @Valid
  private List<KeyValue> dealingInstrumentExternalCodeKeyValues = null;

  /**
   * Enum to select between {Fund} or {ETF}. Indicates the type of the {DealingInstrument} associated with the {Holding}.
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

  @JsonProperty("distributorId")
  private Long distributorId = null;

  @JsonProperty("etfData")
  private SpanishTransferEtfData etfData = null;

  @JsonProperty("feeData")
  private SpanishTransferFeeData feeData = null;

  @JsonProperty("marketer")
  private SpanishTransferMarketer marketer = null;

  @JsonProperty("omnibus")
  private Boolean omnibus = null;

  public SpanishTransferItem contractExternalReference(String contractExternalReference) {
    this.contractExternalReference = contractExternalReference;
    return this;
  }

  /**
   * The external reference of the {Contract} associated to this
   * @return contractExternalReference
  **/
  @ApiModelProperty(value = "The external reference of the {Contract} associated to this")


  public String getContractExternalReference() {
    return contractExternalReference;
  }

  public void setContractExternalReference(String contractExternalReference) {
    this.contractExternalReference = contractExternalReference;
  }

  public SpanishTransferItem currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * The currencyCode associated teh this {SpanishTransferItem.dealingInstrument}. Refer to {listCurrencies}
   * @return currencyCode
  **/
  @ApiModelProperty(value = "The currencyCode associated teh this {SpanishTransferItem.dealingInstrument}. Refer to {listCurrencies}")


  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public SpanishTransferItem dealingInstrument(ResourceReference dealingInstrument) {
    this.dealingInstrument = dealingInstrument;
    return this;
  }

  /**
   * Get dealingInstrument
   * @return dealingInstrument
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ResourceReference getDealingInstrument() {
    return dealingInstrument;
  }

  public void setDealingInstrument(ResourceReference dealingInstrument) {
    this.dealingInstrument = dealingInstrument;
  }

  public SpanishTransferItem dealingInstrumentExternalCodeKeyValues(List<KeyValue> dealingInstrumentExternalCodeKeyValues) {
    this.dealingInstrumentExternalCodeKeyValues = dealingInstrumentExternalCodeKeyValues;
    return this;
  }

  public SpanishTransferItem addDealingInstrumentExternalCodeKeyValuesItem(KeyValue dealingInstrumentExternalCodeKeyValuesItem) {
    if (this.dealingInstrumentExternalCodeKeyValues == null) {
      this.dealingInstrumentExternalCodeKeyValues = new ArrayList<>();
    }
    this.dealingInstrumentExternalCodeKeyValues.add(dealingInstrumentExternalCodeKeyValuesItem);
    return this;
  }

  /**
   * The {DealingInstrument}'s type code. Refer to {listDealingInstrumentExternalCodes}
   * @return dealingInstrumentExternalCodeKeyValues
  **/
  @ApiModelProperty(value = "The {DealingInstrument}'s type code. Refer to {listDealingInstrumentExternalCodes}")

  @Valid

  public List<KeyValue> getDealingInstrumentExternalCodeKeyValues() {
    return dealingInstrumentExternalCodeKeyValues;
  }

  public void setDealingInstrumentExternalCodeKeyValues(List<KeyValue> dealingInstrumentExternalCodeKeyValues) {
    this.dealingInstrumentExternalCodeKeyValues = dealingInstrumentExternalCodeKeyValues;
  }

  public SpanishTransferItem dealingInstrumentType(DealingInstrumentTypeEnum dealingInstrumentType) {
    this.dealingInstrumentType = dealingInstrumentType;
    return this;
  }

  /**
   * Enum to select between {Fund} or {ETF}. Indicates the type of the {DealingInstrument} associated with the {Holding}.
   * @return dealingInstrumentType
  **/
  @ApiModelProperty(value = "Enum to select between {Fund} or {ETF}. Indicates the type of the {DealingInstrument} associated with the {Holding}.")


  public DealingInstrumentTypeEnum getDealingInstrumentType() {
    return dealingInstrumentType;
  }

  public void setDealingInstrumentType(DealingInstrumentTypeEnum dealingInstrumentType) {
    this.dealingInstrumentType = dealingInstrumentType;
  }

  public SpanishTransferItem distributorId(Long distributorId) {
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

  public SpanishTransferItem etfData(SpanishTransferEtfData etfData) {
    this.etfData = etfData;
    return this;
  }

  /**
   * Get etfData
   * @return etfData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SpanishTransferEtfData getEtfData() {
    return etfData;
  }

  public void setEtfData(SpanishTransferEtfData etfData) {
    this.etfData = etfData;
  }

  public SpanishTransferItem feeData(SpanishTransferFeeData feeData) {
    this.feeData = feeData;
    return this;
  }

  /**
   * Get feeData
   * @return feeData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SpanishTransferFeeData getFeeData() {
    return feeData;
  }

  public void setFeeData(SpanishTransferFeeData feeData) {
    this.feeData = feeData;
  }

  public SpanishTransferItem marketer(SpanishTransferMarketer marketer) {
    this.marketer = marketer;
    return this;
  }

  /**
   * Get marketer
   * @return marketer
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SpanishTransferMarketer getMarketer() {
    return marketer;
  }

  public void setMarketer(SpanishTransferMarketer marketer) {
    this.marketer = marketer;
  }

  public SpanishTransferItem omnibus(Boolean omnibus) {
    this.omnibus = omnibus;
    return this;
  }

  /**
   * Indicates whether the entity is associated to an omnibus account.
   * @return omnibus
  **/
  @ApiModelProperty(value = "Indicates whether the entity is associated to an omnibus account.")


  public Boolean getOmnibus() {
    return omnibus;
  }

  public void setOmnibus(Boolean omnibus) {
    this.omnibus = omnibus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpanishTransferItem spanishTransferItem = (SpanishTransferItem) o;
    return Objects.equals(this.contractExternalReference, spanishTransferItem.contractExternalReference) &&
        Objects.equals(this.currencyCode, spanishTransferItem.currencyCode) &&
        Objects.equals(this.dealingInstrument, spanishTransferItem.dealingInstrument) &&
        Objects.equals(this.dealingInstrumentExternalCodeKeyValues, spanishTransferItem.dealingInstrumentExternalCodeKeyValues) &&
        Objects.equals(this.dealingInstrumentType, spanishTransferItem.dealingInstrumentType) &&
        Objects.equals(this.distributorId, spanishTransferItem.distributorId) &&
        Objects.equals(this.etfData, spanishTransferItem.etfData) &&
        Objects.equals(this.feeData, spanishTransferItem.feeData) &&
        Objects.equals(this.marketer, spanishTransferItem.marketer) &&
        Objects.equals(this.omnibus, spanishTransferItem.omnibus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractExternalReference, currencyCode, dealingInstrument, dealingInstrumentExternalCodeKeyValues, dealingInstrumentType, distributorId, etfData, feeData, marketer, omnibus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpanishTransferItem {\n");
    
    sb.append("    contractExternalReference: ").append(toIndentedString(contractExternalReference)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    dealingInstrument: ").append(toIndentedString(dealingInstrument)).append("\n");
    sb.append("    dealingInstrumentExternalCodeKeyValues: ").append(toIndentedString(dealingInstrumentExternalCodeKeyValues)).append("\n");
    sb.append("    dealingInstrumentType: ").append(toIndentedString(dealingInstrumentType)).append("\n");
    sb.append("    distributorId: ").append(toIndentedString(distributorId)).append("\n");
    sb.append("    etfData: ").append(toIndentedString(etfData)).append("\n");
    sb.append("    feeData: ").append(toIndentedString(feeData)).append("\n");
    sb.append("    marketer: ").append(toIndentedString(marketer)).append("\n");
    sb.append("    omnibus: ").append(toIndentedString(omnibus)).append("\n");
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

