package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ResourceReference;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contains basic data about the settlement
 */
@ApiModel(description = "Contains basic data about the settlement")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class SettlementBasicData   {
  @JsonProperty("contractExternalReference")
  private String contractExternalReference = null;

  @JsonProperty("contractId")
  private Long contractId = null;

  @JsonProperty("currencyCode")
  private String currencyCode = null;

  @JsonProperty("dealingFundHouseId")
  private Long dealingFundHouseId = null;

  @JsonProperty("dealingInstrument")
  private ResourceReference dealingInstrument = null;

  /**
   * Gets or Sets dealingInstrumentType
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

  @JsonProperty("exchangeRateApplied")
  private Double exchangeRateApplied = null;

  @JsonProperty("externalReference")
  private String externalReference = null;

  @JsonProperty("localCurrencyCode")
  private String localCurrencyCode = null;

  @JsonProperty("paymentCurrencyCode")
  private String paymentCurrencyCode = null;

  @JsonProperty("paymentSequence")
  private Long paymentSequence = null;

  @JsonProperty("productId")
  private Long productId = null;

  @JsonProperty("settlementStatusCode")
  private String settlementStatusCode = null;

  @JsonProperty("settlementTransactionTypeCode")
  private String settlementTransactionTypeCode = null;

  @JsonProperty("statusChangePermitted")
  private Boolean statusChangePermitted = null;

  @JsonProperty("transactionExternalReference")
  private String transactionExternalReference = null;

  public SettlementBasicData contractExternalReference(String contractExternalReference) {
    this.contractExternalReference = contractExternalReference;
    return this;
  }

  /**
   * The external reference of the {Contract} (aka {Contract.externalReference}) associated to the {Settlement}
   * @return contractExternalReference
  **/
  @ApiModelProperty(value = "The external reference of the {Contract} (aka {Contract.externalReference}) associated to the {Settlement}")


  public String getContractExternalReference() {
    return contractExternalReference;
  }

  public void setContractExternalReference(String contractExternalReference) {
    this.contractExternalReference = contractExternalReference;
  }

  public SettlementBasicData contractId(Long contractId) {
    this.contractId = contractId;
    return this;
  }

  /**
   * The Id of the {Contract}
   * @return contractId
  **/
  @ApiModelProperty(value = "The Id of the {Contract}")


  public Long getContractId() {
    return contractId;
  }

  public void setContractId(Long contractId) {
    this.contractId = contractId;
  }

  public SettlementBasicData currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * The Settlement currency. Refer to {listCurrencies}
   * @return currencyCode
  **/
  @ApiModelProperty(value = "The Settlement currency. Refer to {listCurrencies}")


  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public SettlementBasicData dealingFundHouseId(Long dealingFundHouseId) {
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

  public SettlementBasicData dealingInstrument(ResourceReference dealingInstrument) {
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

  public SettlementBasicData dealingInstrumentType(DealingInstrumentTypeEnum dealingInstrumentType) {
    this.dealingInstrumentType = dealingInstrumentType;
    return this;
  }

  /**
   * Get dealingInstrumentType
   * @return dealingInstrumentType
  **/
  @ApiModelProperty(value = "")


  public DealingInstrumentTypeEnum getDealingInstrumentType() {
    return dealingInstrumentType;
  }

  public void setDealingInstrumentType(DealingInstrumentTypeEnum dealingInstrumentType) {
    this.dealingInstrumentType = dealingInstrumentType;
  }

  public SettlementBasicData depositaryId(Long depositaryId) {
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

  public SettlementBasicData distributorId(Long distributorId) {
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

  public SettlementBasicData exchangeRateApplied(Double exchangeRateApplied) {
    this.exchangeRateApplied = exchangeRateApplied;
    return this;
  }

  /**
   * Indicates de exchange rate applied to the {Settlement}
   * @return exchangeRateApplied
  **/
  @ApiModelProperty(value = "Indicates de exchange rate applied to the {Settlement}")


  public Double getExchangeRateApplied() {
    return exchangeRateApplied;
  }

  public void setExchangeRateApplied(Double exchangeRateApplied) {
    this.exchangeRateApplied = exchangeRateApplied;
  }

  public SettlementBasicData externalReference(String externalReference) {
    this.externalReference = externalReference;
    return this;
  }

  /**
   * The payment external reference asigned to the  {Settlement}.
   * @return externalReference
  **/
  @ApiModelProperty(value = "The payment external reference asigned to the  {Settlement}.")


  public String getExternalReference() {
    return externalReference;
  }

  public void setExternalReference(String externalReference) {
    this.externalReference = externalReference;
  }

  public SettlementBasicData localCurrencyCode(String localCurrencyCode) {
    this.localCurrencyCode = localCurrencyCode;
    return this;
  }

  /**
   * The Settlement local currency. Refer to {listCurrencies}. Always `Euro`.
   * @return localCurrencyCode
  **/
  @ApiModelProperty(value = "The Settlement local currency. Refer to {listCurrencies}. Always `Euro`.")


  public String getLocalCurrencyCode() {
    return localCurrencyCode;
  }

  public void setLocalCurrencyCode(String localCurrencyCode) {
    this.localCurrencyCode = localCurrencyCode;
  }

  public SettlementBasicData paymentCurrencyCode(String paymentCurrencyCode) {
    this.paymentCurrencyCode = paymentCurrencyCode;
    return this;
  }

  /**
   * The Payment currency. Refer to {listCurrencies}
   * @return paymentCurrencyCode
  **/
  @ApiModelProperty(value = "The Payment currency. Refer to {listCurrencies}")


  public String getPaymentCurrencyCode() {
    return paymentCurrencyCode;
  }

  public void setPaymentCurrencyCode(String paymentCurrencyCode) {
    this.paymentCurrencyCode = paymentCurrencyCode;
  }

  public SettlementBasicData paymentSequence(Long paymentSequence) {
    this.paymentSequence = paymentSequence;
    return this;
  }

  /**
   * In case of a split payment, the order of this payment within the total.
   * @return paymentSequence
  **/
  @ApiModelProperty(value = "In case of a split payment, the order of this payment within the total.")


  public Long getPaymentSequence() {
    return paymentSequence;
  }

  public void setPaymentSequence(Long paymentSequence) {
    this.paymentSequence = paymentSequence;
  }

  public SettlementBasicData productId(Long productId) {
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

  public SettlementBasicData settlementStatusCode(String settlementStatusCode) {
    this.settlementStatusCode = settlementStatusCode;
    return this;
  }

  /**
   * The {Settlement}'s status. Refer to {listSettlementStatuses}
   * @return settlementStatusCode
  **/
  @ApiModelProperty(value = "The {Settlement}'s status. Refer to {listSettlementStatuses}")


  public String getSettlementStatusCode() {
    return settlementStatusCode;
  }

  public void setSettlementStatusCode(String settlementStatusCode) {
    this.settlementStatusCode = settlementStatusCode;
  }

  public SettlementBasicData settlementTransactionTypeCode(String settlementTransactionTypeCode) {
    this.settlementTransactionTypeCode = settlementTransactionTypeCode;
    return this;
  }

  /**
   * The settlement type. Refer to {listSettlementTransactionTypes}
   * @return settlementTransactionTypeCode
  **/
  @ApiModelProperty(value = "The settlement type. Refer to {listSettlementTransactionTypes}")


  public String getSettlementTransactionTypeCode() {
    return settlementTransactionTypeCode;
  }

  public void setSettlementTransactionTypeCode(String settlementTransactionTypeCode) {
    this.settlementTransactionTypeCode = settlementTransactionTypeCode;
  }

  public SettlementBasicData statusChangePermitted(Boolean statusChangePermitted) {
    this.statusChangePermitted = statusChangePermitted;
    return this;
  }

  /**
   * Indicate whether the status of the  {Settlement} could be changed.
   * @return statusChangePermitted
  **/
  @ApiModelProperty(value = "Indicate whether the status of the  {Settlement} could be changed.")


  public Boolean getStatusChangePermitted() {
    return statusChangePermitted;
  }

  public void setStatusChangePermitted(Boolean statusChangePermitted) {
    this.statusChangePermitted = statusChangePermitted;
  }

  public SettlementBasicData transactionExternalReference(String transactionExternalReference) {
    this.transactionExternalReference = transactionExternalReference;
    return this;
  }

  /**
   * The external reference of the {Transaction} (aka {Transaction.externalReference}) associated to the {Settlement}.
   * @return transactionExternalReference
  **/
  @ApiModelProperty(value = "The external reference of the {Transaction} (aka {Transaction.externalReference}) associated to the {Settlement}.")


  public String getTransactionExternalReference() {
    return transactionExternalReference;
  }

  public void setTransactionExternalReference(String transactionExternalReference) {
    this.transactionExternalReference = transactionExternalReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettlementBasicData settlementBasicData = (SettlementBasicData) o;
    return Objects.equals(this.contractExternalReference, settlementBasicData.contractExternalReference) &&
        Objects.equals(this.contractId, settlementBasicData.contractId) &&
        Objects.equals(this.currencyCode, settlementBasicData.currencyCode) &&
        Objects.equals(this.dealingFundHouseId, settlementBasicData.dealingFundHouseId) &&
        Objects.equals(this.dealingInstrument, settlementBasicData.dealingInstrument) &&
        Objects.equals(this.dealingInstrumentType, settlementBasicData.dealingInstrumentType) &&
        Objects.equals(this.depositaryId, settlementBasicData.depositaryId) &&
        Objects.equals(this.distributorId, settlementBasicData.distributorId) &&
        Objects.equals(this.exchangeRateApplied, settlementBasicData.exchangeRateApplied) &&
        Objects.equals(this.externalReference, settlementBasicData.externalReference) &&
        Objects.equals(this.localCurrencyCode, settlementBasicData.localCurrencyCode) &&
        Objects.equals(this.paymentCurrencyCode, settlementBasicData.paymentCurrencyCode) &&
        Objects.equals(this.paymentSequence, settlementBasicData.paymentSequence) &&
        Objects.equals(this.productId, settlementBasicData.productId) &&
        Objects.equals(this.settlementStatusCode, settlementBasicData.settlementStatusCode) &&
        Objects.equals(this.settlementTransactionTypeCode, settlementBasicData.settlementTransactionTypeCode) &&
        Objects.equals(this.statusChangePermitted, settlementBasicData.statusChangePermitted) &&
        Objects.equals(this.transactionExternalReference, settlementBasicData.transactionExternalReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractExternalReference, contractId, currencyCode, dealingFundHouseId, dealingInstrument, dealingInstrumentType, depositaryId, distributorId, exchangeRateApplied, externalReference, localCurrencyCode, paymentCurrencyCode, paymentSequence, productId, settlementStatusCode, settlementTransactionTypeCode, statusChangePermitted, transactionExternalReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettlementBasicData {\n");
    
    sb.append("    contractExternalReference: ").append(toIndentedString(contractExternalReference)).append("\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    dealingFundHouseId: ").append(toIndentedString(dealingFundHouseId)).append("\n");
    sb.append("    dealingInstrument: ").append(toIndentedString(dealingInstrument)).append("\n");
    sb.append("    dealingInstrumentType: ").append(toIndentedString(dealingInstrumentType)).append("\n");
    sb.append("    depositaryId: ").append(toIndentedString(depositaryId)).append("\n");
    sb.append("    distributorId: ").append(toIndentedString(distributorId)).append("\n");
    sb.append("    exchangeRateApplied: ").append(toIndentedString(exchangeRateApplied)).append("\n");
    sb.append("    externalReference: ").append(toIndentedString(externalReference)).append("\n");
    sb.append("    localCurrencyCode: ").append(toIndentedString(localCurrencyCode)).append("\n");
    sb.append("    paymentCurrencyCode: ").append(toIndentedString(paymentCurrencyCode)).append("\n");
    sb.append("    paymentSequence: ").append(toIndentedString(paymentSequence)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    settlementStatusCode: ").append(toIndentedString(settlementStatusCode)).append("\n");
    sb.append("    settlementTransactionTypeCode: ").append(toIndentedString(settlementTransactionTypeCode)).append("\n");
    sb.append("    statusChangePermitted: ").append(toIndentedString(statusChangePermitted)).append("\n");
    sb.append("    transactionExternalReference: ").append(toIndentedString(transactionExternalReference)).append("\n");
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

