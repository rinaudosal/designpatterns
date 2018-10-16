package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.model.ResourceReference;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple object composed of an array of {Depositary} and a {Page}.
 */
@ApiModel(description = "A simple object composed of an array of {Depositary} and a {Page}.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class HaltedTransaction   {
  @JsonProperty("confirmartionDate")
  private OffsetDateTime confirmartionDate = null;

  @JsonProperty("contractExternalReference")
  private String contractExternalReference = null;

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

  @JsonProperty("distributorId")
  private Long distributorId = null;

  @JsonProperty("orderedDate")
  private OffsetDateTime orderedDate = null;

  @JsonProperty("settlemnetDate")
  private OffsetDateTime settlemnetDate = null;

  @JsonProperty("tradingLimitAmountApplied")
  private Double tradingLimitAmountApplied = null;

  @JsonProperty("transaction")
  private ResourceReference transaction = null;

  public HaltedTransaction confirmartionDate(OffsetDateTime confirmartionDate) {
    this.confirmartionDate = confirmartionDate;
    return this;
  }

  /**
   * The date when the {HaltedTransaction} was confirmed
   * @return confirmartionDate
  **/
  @ApiModelProperty(value = "The date when the {HaltedTransaction} was confirmed")

  @Valid

  public OffsetDateTime getConfirmartionDate() {
    return confirmartionDate;
  }

  public void setConfirmartionDate(OffsetDateTime confirmartionDate) {
    this.confirmartionDate = confirmartionDate;
  }

  public HaltedTransaction contractExternalReference(String contractExternalReference) {
    this.contractExternalReference = contractExternalReference;
    return this;
  }

  /**
   * The externalReference of the {Contract}
   * @return contractExternalReference
  **/
  @ApiModelProperty(value = "The externalReference of the {Contract}")


  public String getContractExternalReference() {
    return contractExternalReference;
  }

  public void setContractExternalReference(String contractExternalReference) {
    this.contractExternalReference = contractExternalReference;
  }

  public HaltedTransaction dealingInstrument(ResourceReference dealingInstrument) {
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

  public HaltedTransaction dealingInstrumentType(DealingInstrumentTypeEnum dealingInstrumentType) {
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

  public HaltedTransaction distributorId(Long distributorId) {
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

  public HaltedTransaction orderedDate(OffsetDateTime orderedDate) {
    this.orderedDate = orderedDate;
    return this;
  }

  /**
   * The date when the {HaltedTransaction} was ordered
   * @return orderedDate
  **/
  @ApiModelProperty(value = "The date when the {HaltedTransaction} was ordered")

  @Valid

  public OffsetDateTime getOrderedDate() {
    return orderedDate;
  }

  public void setOrderedDate(OffsetDateTime orderedDate) {
    this.orderedDate = orderedDate;
  }

  public HaltedTransaction settlemnetDate(OffsetDateTime settlemnetDate) {
    this.settlemnetDate = settlemnetDate;
    return this;
  }

  /**
   * The date when the {HaltedTransaction} is settled
   * @return settlemnetDate
  **/
  @ApiModelProperty(value = "The date when the {HaltedTransaction} is settled")

  @Valid

  public OffsetDateTime getSettlemnetDate() {
    return settlemnetDate;
  }

  public void setSettlemnetDate(OffsetDateTime settlemnetDate) {
    this.settlemnetDate = settlemnetDate;
  }

  public HaltedTransaction tradingLimitAmountApplied(Double tradingLimitAmountApplied) {
    this.tradingLimitAmountApplied = tradingLimitAmountApplied;
    return this;
  }

  /**
   * The amount of the {TradingLimit} that caused the {HaltedTransaction}
   * @return tradingLimitAmountApplied
  **/
  @ApiModelProperty(value = "The amount of the {TradingLimit} that caused the {HaltedTransaction}")


  public Double getTradingLimitAmountApplied() {
    return tradingLimitAmountApplied;
  }

  public void setTradingLimitAmountApplied(Double tradingLimitAmountApplied) {
    this.tradingLimitAmountApplied = tradingLimitAmountApplied;
  }

  public HaltedTransaction transaction(ResourceReference transaction) {
    this.transaction = transaction;
    return this;
  }

  /**
   * Get transaction
   * @return transaction
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ResourceReference getTransaction() {
    return transaction;
  }

  public void setTransaction(ResourceReference transaction) {
    this.transaction = transaction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HaltedTransaction haltedTransaction = (HaltedTransaction) o;
    return Objects.equals(this.confirmartionDate, haltedTransaction.confirmartionDate) &&
        Objects.equals(this.contractExternalReference, haltedTransaction.contractExternalReference) &&
        Objects.equals(this.dealingInstrument, haltedTransaction.dealingInstrument) &&
        Objects.equals(this.dealingInstrumentType, haltedTransaction.dealingInstrumentType) &&
        Objects.equals(this.distributorId, haltedTransaction.distributorId) &&
        Objects.equals(this.orderedDate, haltedTransaction.orderedDate) &&
        Objects.equals(this.settlemnetDate, haltedTransaction.settlemnetDate) &&
        Objects.equals(this.tradingLimitAmountApplied, haltedTransaction.tradingLimitAmountApplied) &&
        Objects.equals(this.transaction, haltedTransaction.transaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confirmartionDate, contractExternalReference, dealingInstrument, dealingInstrumentType, distributorId, orderedDate, settlemnetDate, tradingLimitAmountApplied, transaction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HaltedTransaction {\n");
    
    sb.append("    confirmartionDate: ").append(toIndentedString(confirmartionDate)).append("\n");
    sb.append("    contractExternalReference: ").append(toIndentedString(contractExternalReference)).append("\n");
    sb.append("    dealingInstrument: ").append(toIndentedString(dealingInstrument)).append("\n");
    sb.append("    dealingInstrumentType: ").append(toIndentedString(dealingInstrumentType)).append("\n");
    sb.append("    distributorId: ").append(toIndentedString(distributorId)).append("\n");
    sb.append("    orderedDate: ").append(toIndentedString(orderedDate)).append("\n");
    sb.append("    settlemnetDate: ").append(toIndentedString(settlemnetDate)).append("\n");
    sb.append("    tradingLimitAmountApplied: ").append(toIndentedString(tradingLimitAmountApplied)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
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

