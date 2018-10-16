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
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DealingInstrument
 */
@ApiModel(description = "DealingInstrument")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class DealingInstrument   {
  @JsonProperty("brokerId")
  private Long brokerId = null;

  @JsonProperty("currencyCode")
  private String currencyCode = null;

  @JsonProperty("dealingFundHouseId")
  private Long dealingFundHouseId = null;

  @JsonProperty("externalCodeKeyValues")
  @Valid
  private List<KeyValue> externalCodeKeyValues = null;

  @JsonProperty("id")
  private Long id = null;

  /**
   * Indicates whether the search will be on {Fund} or {ETF}
   */
  public enum InstrumentTypeEnum {
    FUND("FUND"),
    
    ETF("ETF");

    private String value;

    InstrumentTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static InstrumentTypeEnum fromValue(String text) {
      for (InstrumentTypeEnum b : InstrumentTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("instrumentType")
  private InstrumentTypeEnum instrumentType = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("stockExchangeId")
  private String stockExchangeId = null;

  public DealingInstrument brokerId(Long brokerId) {
    this.brokerId = brokerId;
    return this;
  }

  /**
   * The Id of the {Broker}. This attribute is only valid for transaction related to {ETF}s. See {Transaction.transactionEtfData}
   * @return brokerId
  **/
  @ApiModelProperty(value = "The Id of the {Broker}. This attribute is only valid for transaction related to {ETF}s. See {Transaction.transactionEtfData}")


  public Long getBrokerId() {
    return brokerId;
  }

  public void setBrokerId(Long brokerId) {
    this.brokerId = brokerId;
  }

  public DealingInstrument currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * The instruments's currency. Refer to {listCurrencies}
   * @return currencyCode
  **/
  @ApiModelProperty(value = "The instruments's currency. Refer to {listCurrencies}")


  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public DealingInstrument dealingFundHouseId(Long dealingFundHouseId) {
    this.dealingFundHouseId = dealingFundHouseId;
    return this;
  }

  /**
   * The Id of the {DealingFundHouse}
   * @return dealingFundHouseId
  **/
  @ApiModelProperty(value = "The Id of the {DealingFundHouse}")


  public Long getDealingFundHouseId() {
    return dealingFundHouseId;
  }

  public void setDealingFundHouseId(Long dealingFundHouseId) {
    this.dealingFundHouseId = dealingFundHouseId;
  }

  public DealingInstrument externalCodeKeyValues(List<KeyValue> externalCodeKeyValues) {
    this.externalCodeKeyValues = externalCodeKeyValues;
    return this;
  }

  public DealingInstrument addExternalCodeKeyValuesItem(KeyValue externalCodeKeyValuesItem) {
    if (this.externalCodeKeyValues == null) {
      this.externalCodeKeyValues = new ArrayList<>();
    }
    this.externalCodeKeyValues.add(externalCodeKeyValuesItem);
    return this;
  }

  /**
   * The instruments's type code. Refer to {listDealingInstrumentExternalCodes}
   * @return externalCodeKeyValues
  **/
  @ApiModelProperty(value = "The instruments's type code. Refer to {listDealingInstrumentExternalCodes}")

  @Valid

  public List<KeyValue> getExternalCodeKeyValues() {
    return externalCodeKeyValues;
  }

  public void setExternalCodeKeyValues(List<KeyValue> externalCodeKeyValues) {
    this.externalCodeKeyValues = externalCodeKeyValues;
  }

  public DealingInstrument id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * DealingInstrument Id
   * @return id
  **/
  @ApiModelProperty(value = "DealingInstrument Id")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public DealingInstrument instrumentType(InstrumentTypeEnum instrumentType) {
    this.instrumentType = instrumentType;
    return this;
  }

  /**
   * Indicates whether the search will be on {Fund} or {ETF}
   * @return instrumentType
  **/
  @ApiModelProperty(value = "Indicates whether the search will be on {Fund} or {ETF}")


  public InstrumentTypeEnum getInstrumentType() {
    return instrumentType;
  }

  public void setInstrumentType(InstrumentTypeEnum instrumentType) {
    this.instrumentType = instrumentType;
  }

  public DealingInstrument name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name
   * @return name
  **/
  @ApiModelProperty(value = "Name")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DealingInstrument stockExchangeId(String stockExchangeId) {
    this.stockExchangeId = stockExchangeId;
    return this;
  }

  /**
   * Code of an stock exchange. Refer to {StockExchange}
   * @return stockExchangeId
  **/
  @ApiModelProperty(value = "Code of an stock exchange. Refer to {StockExchange}")


  public String getStockExchangeId() {
    return stockExchangeId;
  }

  public void setStockExchangeId(String stockExchangeId) {
    this.stockExchangeId = stockExchangeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DealingInstrument dealingInstrument = (DealingInstrument) o;
    return Objects.equals(this.brokerId, dealingInstrument.brokerId) &&
        Objects.equals(this.currencyCode, dealingInstrument.currencyCode) &&
        Objects.equals(this.dealingFundHouseId, dealingInstrument.dealingFundHouseId) &&
        Objects.equals(this.externalCodeKeyValues, dealingInstrument.externalCodeKeyValues) &&
        Objects.equals(this.id, dealingInstrument.id) &&
        Objects.equals(this.instrumentType, dealingInstrument.instrumentType) &&
        Objects.equals(this.name, dealingInstrument.name) &&
        Objects.equals(this.stockExchangeId, dealingInstrument.stockExchangeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brokerId, currencyCode, dealingFundHouseId, externalCodeKeyValues, id, instrumentType, name, stockExchangeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DealingInstrument {\n");
    
    sb.append("    brokerId: ").append(toIndentedString(brokerId)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    dealingFundHouseId: ").append(toIndentedString(dealingFundHouseId)).append("\n");
    sb.append("    externalCodeKeyValues: ").append(toIndentedString(externalCodeKeyValues)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    instrumentType: ").append(toIndentedString(instrumentType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    stockExchangeId: ").append(toIndentedString(stockExchangeId)).append("\n");
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

