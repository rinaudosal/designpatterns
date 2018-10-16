package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contains specific data about the ETF associated to the  {Settlement}. Only informed if the settlement is associated to an ETF. Namely if {SettlementBasicData.dealingInstrumentType} is &#x60;ETF&#x60;
 */
@ApiModel(description = "Contains specific data about the ETF associated to the  {Settlement}. Only informed if the settlement is associated to an ETF. Namely if {SettlementBasicData.dealingInstrumentType} is `ETF`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SettlementEtfData   {
  @JsonProperty("brokerId")
  private Long brokerId = null;

  @JsonProperty("stockExchangeId")
  private String stockExchangeId = null;

  public SettlementEtfData brokerId(Long brokerId) {
    this.brokerId = brokerId;
    return this;
  }

  /**
   * The Id of the {Broker}
   * @return brokerId
  **/
  @ApiModelProperty(value = "The Id of the {Broker}")


  public Long getBrokerId() {
    return brokerId;
  }

  public void setBrokerId(Long brokerId) {
    this.brokerId = brokerId;
  }

  public SettlementEtfData stockExchangeId(String stockExchangeId) {
    this.stockExchangeId = stockExchangeId;
    return this;
  }

  /**
   * Code of an stock exchange. Refer to the {StockExchange}
   * @return stockExchangeId
  **/
  @ApiModelProperty(value = "Code of an stock exchange. Refer to the {StockExchange}")


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
    SettlementEtfData settlementEtfData = (SettlementEtfData) o;
    return Objects.equals(this.brokerId, settlementEtfData.brokerId) &&
        Objects.equals(this.stockExchangeId, settlementEtfData.stockExchangeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brokerId, stockExchangeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettlementEtfData {\n");
    
    sb.append("    brokerId: ").append(toIndentedString(brokerId)).append("\n");
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

