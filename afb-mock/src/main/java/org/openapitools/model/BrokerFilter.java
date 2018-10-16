package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BrokerFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class BrokerFilter   {
  @JsonProperty("distributorId")
  private Long distributorId = null;

  @JsonProperty("stockExchangeId")
  private String stockExchangeId = null;

  public BrokerFilter distributorId(Long distributorId) {
    this.distributorId = distributorId;
    return this;
  }

  /**
   * The Id of the {Distributor}. The ids can be extracted from the {listDistributors} method
   * @return distributorId
  **/
  @ApiModelProperty(value = "The Id of the {Distributor}. The ids can be extracted from the {listDistributors} method")


  public Long getDistributorId() {
    return distributorId;
  }

  public void setDistributorId(Long distributorId) {
    this.distributorId = distributorId;
  }

  public BrokerFilter stockExchangeId(String stockExchangeId) {
    this.stockExchangeId = stockExchangeId;
    return this;
  }

  /**
   * The Id of the {StockExchange}. The ids can be extracted from the {listStockExchanges} method
   * @return stockExchangeId
  **/
  @ApiModelProperty(value = "The Id of the {StockExchange}. The ids can be extracted from the {listStockExchanges} method")


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
    BrokerFilter brokerFilter = (BrokerFilter) o;
    return Objects.equals(this.distributorId, brokerFilter.distributorId) &&
        Objects.equals(this.stockExchangeId, brokerFilter.stockExchangeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distributorId, stockExchangeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrokerFilter {\n");
    
    sb.append("    distributorId: ").append(toIndentedString(distributorId)).append("\n");
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

