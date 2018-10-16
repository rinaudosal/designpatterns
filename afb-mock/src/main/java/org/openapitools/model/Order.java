package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OrderAmountData;
import org.openapitools.model.OrderContractData;
import org.openapitools.model.OrderDateData;
import org.openapitools.model.OrderEtfData;
import org.openapitools.model.OrderFeeData;
import org.openapitools.model.OrderItalianRetailMarketData;
import org.openapitools.model.OrderSettingsData;
import org.openapitools.model.OrderSharesData;
import org.openapitools.model.OrderSwitchData;
import org.openapitools.model.Price;
import org.openapitools.model.ResourceReference;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Order
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class Order   {
  @JsonProperty("comments")
  private String comments = null;

  @JsonProperty("currencyCode")
  private String currencyCode = null;

  @JsonProperty("dealingFundHouseId")
  private Long dealingFundHouseId = null;

  @JsonProperty("dealingInstrument")
  private ResourceReference dealingInstrument = null;

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

  @JsonProperty("depositaryId")
  private Long depositaryId = null;

  @JsonProperty("distributorId")
  private Long distributorId = null;

  @JsonProperty("externalReference")
  private String externalReference = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("localCurrencyCode")
  private String localCurrencyCode = null;

  @JsonProperty("orderAmountData")
  private OrderAmountData orderAmountData = null;

  @JsonProperty("orderContractData")
  private OrderContractData orderContractData = null;

  @JsonProperty("orderDateData")
  private OrderDateData orderDateData = null;

  @JsonProperty("orderEtfData")
  private OrderEtfData orderEtfData = null;

  @JsonProperty("orderFeeData")
  private OrderFeeData orderFeeData = null;

  @JsonProperty("orderItalianRetailMarketData")
  private OrderItalianRetailMarketData orderItalianRetailMarketData = null;

  @JsonProperty("orderSettingsData")
  private OrderSettingsData orderSettingsData = null;

  @JsonProperty("orderSharesData")
  private OrderSharesData orderSharesData = null;

  @JsonProperty("orderStatusCode")
  private String orderStatusCode = null;

  @JsonProperty("orderSwitchData")
  private OrderSwitchData orderSwitchData = null;

  @JsonProperty("orderTypeCode")
  private String orderTypeCode = null;

  @JsonProperty("paymentCurrencyCode")
  private String paymentCurrencyCode = null;

  @JsonProperty("price")
  private Price price = null;

  @JsonProperty("productId")
  private Long productId = null;

  @JsonProperty("subdistributorId")
  private Long subdistributorId = null;

  public Order comments(String comments) {
    this.comments = comments;
    return this;
  }

  /**
   * Comments added by the user.
   * @return comments
  **/
  @ApiModelProperty(value = "Comments added by the user.")


  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public Order currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * The currency associated to the order. Refer to {listCurrencies}
   * @return currencyCode
  **/
  @ApiModelProperty(value = "The currency associated to the order. Refer to {listCurrencies}")


  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public Order dealingFundHouseId(Long dealingFundHouseId) {
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

  public Order dealingInstrument(ResourceReference dealingInstrument) {
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

  public Order dealingInstrumentType(DealingInstrumentTypeEnum dealingInstrumentType) {
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

  public Order depositaryId(Long depositaryId) {
    this.depositaryId = depositaryId;
    return this;
  }

  /**
   * The Id of the {Depositary}
   * @return depositaryId
  **/
  @ApiModelProperty(value = "The Id of the {Depositary}")


  public Long getDepositaryId() {
    return depositaryId;
  }

  public void setDepositaryId(Long depositaryId) {
    this.depositaryId = depositaryId;
  }

  public Order distributorId(Long distributorId) {
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

  public Order externalReference(String externalReference) {
    this.externalReference = externalReference;
    return this;
  }

  /**
   * External reference associated to the {Order}
   * @return externalReference
  **/
  @ApiModelProperty(value = "External reference associated to the {Order}")


  public String getExternalReference() {
    return externalReference;
  }

  public void setExternalReference(String externalReference) {
    this.externalReference = externalReference;
  }

  public Order id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Order identification
   * @return id
  **/
  @ApiModelProperty(value = "Order identification")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Order localCurrencyCode(String localCurrencyCode) {
    this.localCurrencyCode = localCurrencyCode;
    return this;
  }

  /**
   * The local currency code of the simulation. Refer to {listCurrencies}
   * @return localCurrencyCode
  **/
  @ApiModelProperty(value = "The local currency code of the simulation. Refer to {listCurrencies}")


  public String getLocalCurrencyCode() {
    return localCurrencyCode;
  }

  public void setLocalCurrencyCode(String localCurrencyCode) {
    this.localCurrencyCode = localCurrencyCode;
  }

  public Order orderAmountData(OrderAmountData orderAmountData) {
    this.orderAmountData = orderAmountData;
    return this;
  }

  /**
   * Get orderAmountData
   * @return orderAmountData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OrderAmountData getOrderAmountData() {
    return orderAmountData;
  }

  public void setOrderAmountData(OrderAmountData orderAmountData) {
    this.orderAmountData = orderAmountData;
  }

  public Order orderContractData(OrderContractData orderContractData) {
    this.orderContractData = orderContractData;
    return this;
  }

  /**
   * Get orderContractData
   * @return orderContractData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OrderContractData getOrderContractData() {
    return orderContractData;
  }

  public void setOrderContractData(OrderContractData orderContractData) {
    this.orderContractData = orderContractData;
  }

  public Order orderDateData(OrderDateData orderDateData) {
    this.orderDateData = orderDateData;
    return this;
  }

  /**
   * Get orderDateData
   * @return orderDateData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OrderDateData getOrderDateData() {
    return orderDateData;
  }

  public void setOrderDateData(OrderDateData orderDateData) {
    this.orderDateData = orderDateData;
  }

  public Order orderEtfData(OrderEtfData orderEtfData) {
    this.orderEtfData = orderEtfData;
    return this;
  }

  /**
   * Get orderEtfData
   * @return orderEtfData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OrderEtfData getOrderEtfData() {
    return orderEtfData;
  }

  public void setOrderEtfData(OrderEtfData orderEtfData) {
    this.orderEtfData = orderEtfData;
  }

  public Order orderFeeData(OrderFeeData orderFeeData) {
    this.orderFeeData = orderFeeData;
    return this;
  }

  /**
   * Get orderFeeData
   * @return orderFeeData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OrderFeeData getOrderFeeData() {
    return orderFeeData;
  }

  public void setOrderFeeData(OrderFeeData orderFeeData) {
    this.orderFeeData = orderFeeData;
  }

  public Order orderItalianRetailMarketData(OrderItalianRetailMarketData orderItalianRetailMarketData) {
    this.orderItalianRetailMarketData = orderItalianRetailMarketData;
    return this;
  }

  /**
   * Get orderItalianRetailMarketData
   * @return orderItalianRetailMarketData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OrderItalianRetailMarketData getOrderItalianRetailMarketData() {
    return orderItalianRetailMarketData;
  }

  public void setOrderItalianRetailMarketData(OrderItalianRetailMarketData orderItalianRetailMarketData) {
    this.orderItalianRetailMarketData = orderItalianRetailMarketData;
  }

  public Order orderSettingsData(OrderSettingsData orderSettingsData) {
    this.orderSettingsData = orderSettingsData;
    return this;
  }

  /**
   * Get orderSettingsData
   * @return orderSettingsData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OrderSettingsData getOrderSettingsData() {
    return orderSettingsData;
  }

  public void setOrderSettingsData(OrderSettingsData orderSettingsData) {
    this.orderSettingsData = orderSettingsData;
  }

  public Order orderSharesData(OrderSharesData orderSharesData) {
    this.orderSharesData = orderSharesData;
    return this;
  }

  /**
   * Get orderSharesData
   * @return orderSharesData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OrderSharesData getOrderSharesData() {
    return orderSharesData;
  }

  public void setOrderSharesData(OrderSharesData orderSharesData) {
    this.orderSharesData = orderSharesData;
  }

  public Order orderStatusCode(String orderStatusCode) {
    this.orderStatusCode = orderStatusCode;
    return this;
  }

  /**
   * Order status code. Refer to {listTransactionStatuses}
   * @return orderStatusCode
  **/
  @ApiModelProperty(value = "Order status code. Refer to {listTransactionStatuses}")


  public String getOrderStatusCode() {
    return orderStatusCode;
  }

  public void setOrderStatusCode(String orderStatusCode) {
    this.orderStatusCode = orderStatusCode;
  }

  public Order orderSwitchData(OrderSwitchData orderSwitchData) {
    this.orderSwitchData = orderSwitchData;
    return this;
  }

  /**
   * Get orderSwitchData
   * @return orderSwitchData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OrderSwitchData getOrderSwitchData() {
    return orderSwitchData;
  }

  public void setOrderSwitchData(OrderSwitchData orderSwitchData) {
    this.orderSwitchData = orderSwitchData;
  }

  public Order orderTypeCode(String orderTypeCode) {
    this.orderTypeCode = orderTypeCode;
    return this;
  }

  /**
   * Order type code. Refer to {Distributors}'s {listOrderTypes} which returns a subset of {listTransactionTypes}
   * @return orderTypeCode
  **/
  @ApiModelProperty(value = "Order type code. Refer to {Distributors}'s {listOrderTypes} which returns a subset of {listTransactionTypes}")


  public String getOrderTypeCode() {
    return orderTypeCode;
  }

  public void setOrderTypeCode(String orderTypeCode) {
    this.orderTypeCode = orderTypeCode;
  }

  public Order paymentCurrencyCode(String paymentCurrencyCode) {
    this.paymentCurrencyCode = paymentCurrencyCode;
    return this;
  }

  /**
   * The payment currency selected. Refer to {listCurrencies}
   * @return paymentCurrencyCode
  **/
  @ApiModelProperty(value = "The payment currency selected. Refer to {listCurrencies}")


  public String getPaymentCurrencyCode() {
    return paymentCurrencyCode;
  }

  public void setPaymentCurrencyCode(String paymentCurrencyCode) {
    this.paymentCurrencyCode = paymentCurrencyCode;
  }

  public Order price(Price price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Price getPrice() {
    return price;
  }

  public void setPrice(Price price) {
    this.price = price;
  }

  public Order productId(Long productId) {
    this.productId = productId;
    return this;
  }

  /**
   * The Id of the {Product}
   * @return productId
  **/
  @ApiModelProperty(value = "The Id of the {Product}")


  public Long getProductId() {
    return productId;
  }

  public void setProductId(Long productId) {
    this.productId = productId;
  }

  public Order subdistributorId(Long subdistributorId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Order order = (Order) o;
    return Objects.equals(this.comments, order.comments) &&
        Objects.equals(this.currencyCode, order.currencyCode) &&
        Objects.equals(this.dealingFundHouseId, order.dealingFundHouseId) &&
        Objects.equals(this.dealingInstrument, order.dealingInstrument) &&
        Objects.equals(this.dealingInstrumentType, order.dealingInstrumentType) &&
        Objects.equals(this.depositaryId, order.depositaryId) &&
        Objects.equals(this.distributorId, order.distributorId) &&
        Objects.equals(this.externalReference, order.externalReference) &&
        Objects.equals(this.id, order.id) &&
        Objects.equals(this.localCurrencyCode, order.localCurrencyCode) &&
        Objects.equals(this.orderAmountData, order.orderAmountData) &&
        Objects.equals(this.orderContractData, order.orderContractData) &&
        Objects.equals(this.orderDateData, order.orderDateData) &&
        Objects.equals(this.orderEtfData, order.orderEtfData) &&
        Objects.equals(this.orderFeeData, order.orderFeeData) &&
        Objects.equals(this.orderItalianRetailMarketData, order.orderItalianRetailMarketData) &&
        Objects.equals(this.orderSettingsData, order.orderSettingsData) &&
        Objects.equals(this.orderSharesData, order.orderSharesData) &&
        Objects.equals(this.orderStatusCode, order.orderStatusCode) &&
        Objects.equals(this.orderSwitchData, order.orderSwitchData) &&
        Objects.equals(this.orderTypeCode, order.orderTypeCode) &&
        Objects.equals(this.paymentCurrencyCode, order.paymentCurrencyCode) &&
        Objects.equals(this.price, order.price) &&
        Objects.equals(this.productId, order.productId) &&
        Objects.equals(this.subdistributorId, order.subdistributorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comments, currencyCode, dealingFundHouseId, dealingInstrument, dealingInstrumentType, depositaryId, distributorId, externalReference, id, localCurrencyCode, orderAmountData, orderContractData, orderDateData, orderEtfData, orderFeeData, orderItalianRetailMarketData, orderSettingsData, orderSharesData, orderStatusCode, orderSwitchData, orderTypeCode, paymentCurrencyCode, price, productId, subdistributorId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    dealingFundHouseId: ").append(toIndentedString(dealingFundHouseId)).append("\n");
    sb.append("    dealingInstrument: ").append(toIndentedString(dealingInstrument)).append("\n");
    sb.append("    dealingInstrumentType: ").append(toIndentedString(dealingInstrumentType)).append("\n");
    sb.append("    depositaryId: ").append(toIndentedString(depositaryId)).append("\n");
    sb.append("    distributorId: ").append(toIndentedString(distributorId)).append("\n");
    sb.append("    externalReference: ").append(toIndentedString(externalReference)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    localCurrencyCode: ").append(toIndentedString(localCurrencyCode)).append("\n");
    sb.append("    orderAmountData: ").append(toIndentedString(orderAmountData)).append("\n");
    sb.append("    orderContractData: ").append(toIndentedString(orderContractData)).append("\n");
    sb.append("    orderDateData: ").append(toIndentedString(orderDateData)).append("\n");
    sb.append("    orderEtfData: ").append(toIndentedString(orderEtfData)).append("\n");
    sb.append("    orderFeeData: ").append(toIndentedString(orderFeeData)).append("\n");
    sb.append("    orderItalianRetailMarketData: ").append(toIndentedString(orderItalianRetailMarketData)).append("\n");
    sb.append("    orderSettingsData: ").append(toIndentedString(orderSettingsData)).append("\n");
    sb.append("    orderSharesData: ").append(toIndentedString(orderSharesData)).append("\n");
    sb.append("    orderStatusCode: ").append(toIndentedString(orderStatusCode)).append("\n");
    sb.append("    orderSwitchData: ").append(toIndentedString(orderSwitchData)).append("\n");
    sb.append("    orderTypeCode: ").append(toIndentedString(orderTypeCode)).append("\n");
    sb.append("    paymentCurrencyCode: ").append(toIndentedString(paymentCurrencyCode)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    subdistributorId: ").append(toIndentedString(subdistributorId)).append("\n");
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

