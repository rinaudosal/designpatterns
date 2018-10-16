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
 * A simple object composed of an array of {Depositary} and a {Page}.
 */
@ApiModel(description = "A simple object composed of an array of {Depositary} and a {Page}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class TradingLimit   {
  @JsonProperty("amount")
  private Double amount = null;

  @JsonProperty("currentConsumedAmount")
  private Double currentConsumedAmount = null;

  @JsonProperty("depositaryId")
  private Long depositaryId = null;

  @JsonProperty("distributorId")
  private Long distributorId = null;

  @JsonProperty("haltAllSubscriptions")
  private Boolean haltAllSubscriptions = null;

  @JsonProperty("haltAllTrades")
  private Boolean haltAllTrades = null;

  @JsonProperty("haltedTransactions")
  private Boolean haltedTransactions = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("productId")
  private Long productId = null;

  /**
   * The status of the {TradingLimit}.
   */
  public enum StatusEnum {
    ACTIVE("ACTIVE"),
    
    INACTIVE("INACTIVE");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("thresholdAmount")
  private Double thresholdAmount = null;

  @JsonProperty("thresholdPercetange")
  private Double thresholdPercetange = null;

  public TradingLimit amount(Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The {TradingLimit} amount, that can't be exceded.
   * @return amount
  **/
  @ApiModelProperty(value = "The {TradingLimit} amount, that can't be exceded.")


  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public TradingLimit currentConsumedAmount(Double currentConsumedAmount) {
    this.currentConsumedAmount = currentConsumedAmount;
    return this;
  }

  /**
   * The current consumed amount of {TradingLimit}'s amount
   * @return currentConsumedAmount
  **/
  @ApiModelProperty(value = "The current consumed amount of {TradingLimit}'s amount")


  public Double getCurrentConsumedAmount() {
    return currentConsumedAmount;
  }

  public void setCurrentConsumedAmount(Double currentConsumedAmount) {
    this.currentConsumedAmount = currentConsumedAmount;
  }

  public TradingLimit depositaryId(Long depositaryId) {
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

  public TradingLimit distributorId(Long distributorId) {
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

  public TradingLimit haltAllSubscriptions(Boolean haltAllSubscriptions) {
    this.haltAllSubscriptions = haltAllSubscriptions;
    return this;
  }

  /**
   * Indicates whether this {TradingLimit} halts all subscriptions
   * @return haltAllSubscriptions
  **/
  @ApiModelProperty(value = "Indicates whether this {TradingLimit} halts all subscriptions")


  public Boolean getHaltAllSubscriptions() {
    return haltAllSubscriptions;
  }

  public void setHaltAllSubscriptions(Boolean haltAllSubscriptions) {
    this.haltAllSubscriptions = haltAllSubscriptions;
  }

  public TradingLimit haltAllTrades(Boolean haltAllTrades) {
    this.haltAllTrades = haltAllTrades;
    return this;
  }

  /**
   * Indicates whether this {TradingLimit} halts all trades
   * @return haltAllTrades
  **/
  @ApiModelProperty(value = "Indicates whether this {TradingLimit} halts all trades")


  public Boolean getHaltAllTrades() {
    return haltAllTrades;
  }

  public void setHaltAllTrades(Boolean haltAllTrades) {
    this.haltAllTrades = haltAllTrades;
  }

  public TradingLimit haltedTransactions(Boolean haltedTransactions) {
    this.haltedTransactions = haltedTransactions;
    return this;
  }

  /**
   * Indicates whether there are halted {Transactions} caused by this {TradingLimit}
   * @return haltedTransactions
  **/
  @ApiModelProperty(value = "Indicates whether there are halted {Transactions} caused by this {TradingLimit}")


  public Boolean getHaltedTransactions() {
    return haltedTransactions;
  }

  public void setHaltedTransactions(Boolean haltedTransactions) {
    this.haltedTransactions = haltedTransactions;
  }

  public TradingLimit id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The Id of the {TradingLimit}
   * @return id
  **/
  @ApiModelProperty(value = "The Id of the {TradingLimit}")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TradingLimit productId(Long productId) {
    this.productId = productId;
    return this;
  }

  /**
   * The Id of the {Procuct}
   * @return productId
  **/
  @ApiModelProperty(value = "The Id of the {Procuct}")


  public Long getProductId() {
    return productId;
  }

  public void setProductId(Long productId) {
    this.productId = productId;
  }

  public TradingLimit status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the {TradingLimit}.
   * @return status
  **/
  @ApiModelProperty(value = "The status of the {TradingLimit}.")


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public TradingLimit thresholdAmount(Double thresholdAmount) {
    this.thresholdAmount = thresholdAmount;
    return this;
  }

  /**
   * The threshold amount of the {TradingLimit} that triggers an alarm
   * @return thresholdAmount
  **/
  @ApiModelProperty(value = "The threshold amount of the {TradingLimit} that triggers an alarm")


  public Double getThresholdAmount() {
    return thresholdAmount;
  }

  public void setThresholdAmount(Double thresholdAmount) {
    this.thresholdAmount = thresholdAmount;
  }

  public TradingLimit thresholdPercetange(Double thresholdPercetange) {
    this.thresholdPercetange = thresholdPercetange;
    return this;
  }

  /**
   * The threshold percentage of the {TradingLimit} that triggers an alarm
   * @return thresholdPercetange
  **/
  @ApiModelProperty(value = "The threshold percentage of the {TradingLimit} that triggers an alarm")


  public Double getThresholdPercetange() {
    return thresholdPercetange;
  }

  public void setThresholdPercetange(Double thresholdPercetange) {
    this.thresholdPercetange = thresholdPercetange;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TradingLimit tradingLimit = (TradingLimit) o;
    return Objects.equals(this.amount, tradingLimit.amount) &&
        Objects.equals(this.currentConsumedAmount, tradingLimit.currentConsumedAmount) &&
        Objects.equals(this.depositaryId, tradingLimit.depositaryId) &&
        Objects.equals(this.distributorId, tradingLimit.distributorId) &&
        Objects.equals(this.haltAllSubscriptions, tradingLimit.haltAllSubscriptions) &&
        Objects.equals(this.haltAllTrades, tradingLimit.haltAllTrades) &&
        Objects.equals(this.haltedTransactions, tradingLimit.haltedTransactions) &&
        Objects.equals(this.id, tradingLimit.id) &&
        Objects.equals(this.productId, tradingLimit.productId) &&
        Objects.equals(this.status, tradingLimit.status) &&
        Objects.equals(this.thresholdAmount, tradingLimit.thresholdAmount) &&
        Objects.equals(this.thresholdPercetange, tradingLimit.thresholdPercetange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currentConsumedAmount, depositaryId, distributorId, haltAllSubscriptions, haltAllTrades, haltedTransactions, id, productId, status, thresholdAmount, thresholdPercetange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TradingLimit {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currentConsumedAmount: ").append(toIndentedString(currentConsumedAmount)).append("\n");
    sb.append("    depositaryId: ").append(toIndentedString(depositaryId)).append("\n");
    sb.append("    distributorId: ").append(toIndentedString(distributorId)).append("\n");
    sb.append("    haltAllSubscriptions: ").append(toIndentedString(haltAllSubscriptions)).append("\n");
    sb.append("    haltAllTrades: ").append(toIndentedString(haltAllTrades)).append("\n");
    sb.append("    haltedTransactions: ").append(toIndentedString(haltedTransactions)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    thresholdAmount: ").append(toIndentedString(thresholdAmount)).append("\n");
    sb.append("    thresholdPercetange: ").append(toIndentedString(thresholdPercetange)).append("\n");
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

