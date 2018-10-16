package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SpanishTransferEtfData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SpanishTransferEtfData   {
  @JsonProperty("brokerId")
  private Long brokerId = null;

  @JsonProperty("stockExchangeId")
  private String stockExchangeId = null;

  public SpanishTransferEtfData brokerId(Long brokerId) {
    this.brokerId = brokerId;
    return this;
  }

  /**
   * The Id of the {Broker} associated to the transaction
   * @return brokerId
  **/
  @ApiModelProperty(value = "The Id of the {Broker} associated to the transaction")


  public Long getBrokerId() {
    return brokerId;
  }

  public void setBrokerId(Long brokerId) {
    this.brokerId = brokerId;
  }

  public SpanishTransferEtfData stockExchangeId(String stockExchangeId) {
    this.stockExchangeId = stockExchangeId;
    return this;
  }

  /**
   * Code of a stock exchange. Refer to {StockExchange}
   * @return stockExchangeId
  **/
  @ApiModelProperty(value = "Code of a stock exchange. Refer to {StockExchange}")


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
    SpanishTransferEtfData spanishTransferEtfData = (SpanishTransferEtfData) o;
    return Objects.equals(this.brokerId, spanishTransferEtfData.brokerId) &&
        Objects.equals(this.stockExchangeId, spanishTransferEtfData.stockExchangeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brokerId, stockExchangeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpanishTransferEtfData {\n");
    
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

