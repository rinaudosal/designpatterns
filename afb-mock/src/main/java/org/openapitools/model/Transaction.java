package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Price;
import org.openapitools.model.ResourceReference;
import org.openapitools.model.TransactionAmountData;
import org.openapitools.model.TransactionCapitalGainedData;
import org.openapitools.model.TransactionContractData;
import org.openapitools.model.TransactionDateData;
import org.openapitools.model.TransactionDividendData;
import org.openapitools.model.TransactionEtfData;
import org.openapitools.model.TransactionFeeData;
import org.openapitools.model.TransactionForeignExchangeData;
import org.openapitools.model.TransactionItalianRetailMarketData;
import org.openapitools.model.TransactionPrepaidData;
import org.openapitools.model.TransactionSettingsData;
import org.openapitools.model.TransactionSharesData;
import org.openapitools.model.TransactionSpanishMarketData;
import org.openapitools.model.TransactionSwitchData;
import org.openapitools.model.TransactionWithholdingData;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This object keeps information related to Transactions.
 */
@ApiModel(description = "This object keeps information related to Transactions.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class Transaction   {
  @JsonProperty("averagePriceApplied")
  private Double averagePriceApplied = null;

  @JsonProperty("contractId")
  private Long contractId = null;

  @JsonProperty("currencyCode")
  private String currencyCode = null;

  @JsonProperty("dealingFundHouseId")
  private Long dealingFundHouseId = null;

  @JsonProperty("dealingInstrument")
  private ResourceReference dealingInstrument = null;

  /**
   * Enum to select between \"FUND\" \"ETF\". Indicates the type of the {DealingInstrument} associated to the transaction.
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

  @JsonProperty("exchangeRateToLocalCurrency")
  private Double exchangeRateToLocalCurrency = null;

  @JsonProperty("externalReference")
  private String externalReference = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("localCurrencyCode")
  private String localCurrencyCode = null;

  @JsonProperty("orderedBy")
  private String orderedBy = null;

  @JsonProperty("paymentCurrencyCode")
  private String paymentCurrencyCode = null;

  @JsonProperty("price")
  private Price price = null;

  @JsonProperty("productId")
  private Long productId = null;

  @JsonProperty("subdistributorId")
  private Long subdistributorId = null;

  @JsonProperty("transactionAmountData")
  private TransactionAmountData transactionAmountData = null;

  @JsonProperty("transactionCapitalGainedData")
  private TransactionCapitalGainedData transactionCapitalGainedData = null;

  @JsonProperty("transactionComments")
  private String transactionComments = null;

  @JsonProperty("transactionContractData")
  private TransactionContractData transactionContractData = null;

  @JsonProperty("transactionDateData")
  private TransactionDateData transactionDateData = null;

  @JsonProperty("transactionDividendData")
  private TransactionDividendData transactionDividendData = null;

  @JsonProperty("transactionEtfData")
  private TransactionEtfData transactionEtfData = null;

  @JsonProperty("transactionFeeData")
  private TransactionFeeData transactionFeeData = null;

  @JsonProperty("transactionForeignExchangeData")
  private TransactionForeignExchangeData transactionForeignExchangeData = null;

  @JsonProperty("transactionItalianRetailMarketData")
  private TransactionItalianRetailMarketData transactionItalianRetailMarketData = null;

  @JsonProperty("transactionPrepaidData")
  private TransactionPrepaidData transactionPrepaidData = null;

  @JsonProperty("transactionSettingsData")
  private TransactionSettingsData transactionSettingsData = null;

  @JsonProperty("transactionSharesData")
  private TransactionSharesData transactionSharesData = null;

  @JsonProperty("transactionSpanishMarketData")
  private TransactionSpanishMarketData transactionSpanishMarketData = null;

  @JsonProperty("transactionStatusCode")
  private String transactionStatusCode = null;

  @JsonProperty("transactionSwitchData")
  private TransactionSwitchData transactionSwitchData = null;

  @JsonProperty("transactionTypeCode")
  private String transactionTypeCode = null;

  @JsonProperty("transactionWithholdingData")
  private TransactionWithholdingData transactionWithholdingData = null;

  public Transaction averagePriceApplied(Double averagePriceApplied) {
    this.averagePriceApplied = averagePriceApplied;
    return this;
  }

  /**
   * average price applied
   * @return averagePriceApplied
  **/
  @ApiModelProperty(value = "average price applied")


  public Double getAveragePriceApplied() {
    return averagePriceApplied;
  }

  public void setAveragePriceApplied(Double averagePriceApplied) {
    this.averagePriceApplied = averagePriceApplied;
  }

  public Transaction contractId(Long contractId) {
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

  public Transaction currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * The Transaction's currency. Refer to {listCurrencies}
   * @return currencyCode
  **/
  @ApiModelProperty(value = "The Transaction's currency. Refer to {listCurrencies}")


  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public Transaction dealingFundHouseId(Long dealingFundHouseId) {
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

  public Transaction dealingInstrument(ResourceReference dealingInstrument) {
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

  public Transaction dealingInstrumentType(DealingInstrumentTypeEnum dealingInstrumentType) {
    this.dealingInstrumentType = dealingInstrumentType;
    return this;
  }

  /**
   * Enum to select between \"FUND\" \"ETF\". Indicates the type of the {DealingInstrument} associated to the transaction.
   * @return dealingInstrumentType
  **/
  @ApiModelProperty(value = "Enum to select between \"FUND\" \"ETF\". Indicates the type of the {DealingInstrument} associated to the transaction.")


  public DealingInstrumentTypeEnum getDealingInstrumentType() {
    return dealingInstrumentType;
  }

  public void setDealingInstrumentType(DealingInstrumentTypeEnum dealingInstrumentType) {
    this.dealingInstrumentType = dealingInstrumentType;
  }

  public Transaction depositaryId(Long depositaryId) {
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

  public Transaction distributorId(Long distributorId) {
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

  public Transaction exchangeRateApplied(Double exchangeRateApplied) {
    this.exchangeRateApplied = exchangeRateApplied;
    return this;
  }

  /**
   * Exchange rate applied when payment currency is different from the {DealingInstrument} currency. Refers to the attribute {Transaction.currencyCode}
   * @return exchangeRateApplied
  **/
  @ApiModelProperty(value = "Exchange rate applied when payment currency is different from the {DealingInstrument} currency. Refers to the attribute {Transaction.currencyCode}")


  public Double getExchangeRateApplied() {
    return exchangeRateApplied;
  }

  public void setExchangeRateApplied(Double exchangeRateApplied) {
    this.exchangeRateApplied = exchangeRateApplied;
  }

  public Transaction exchangeRateToLocalCurrency(Double exchangeRateToLocalCurrency) {
    this.exchangeRateToLocalCurrency = exchangeRateToLocalCurrency;
    return this;
  }

  /**
   * Exchange Rate from {DealingInstrument} currency to local currency. Refers to the attribute {Transaction.localCurrencyCode}
   * @return exchangeRateToLocalCurrency
  **/
  @ApiModelProperty(value = "Exchange Rate from {DealingInstrument} currency to local currency. Refers to the attribute {Transaction.localCurrencyCode}")


  public Double getExchangeRateToLocalCurrency() {
    return exchangeRateToLocalCurrency;
  }

  public void setExchangeRateToLocalCurrency(Double exchangeRateToLocalCurrency) {
    this.exchangeRateToLocalCurrency = exchangeRateToLocalCurrency;
  }

  public Transaction externalReference(String externalReference) {
    this.externalReference = externalReference;
    return this;
  }

  /**
   * External Reference associated to the transaction.
   * @return externalReference
  **/
  @ApiModelProperty(value = "External Reference associated to the transaction.")


  public String getExternalReference() {
    return externalReference;
  }

  public void setExternalReference(String externalReference) {
    this.externalReference = externalReference;
  }

  public Transaction id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Transaction Id
   * @return id
  **/
  @ApiModelProperty(value = "Transaction Id")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Transaction localCurrencyCode(String localCurrencyCode) {
    this.localCurrencyCode = localCurrencyCode;
    return this;
  }

  /**
   * The Transaction's local currency. There are some amounts that could be expressed in that currency. Refer to {listCurrencies}
   * @return localCurrencyCode
  **/
  @ApiModelProperty(value = "The Transaction's local currency. There are some amounts that could be expressed in that currency. Refer to {listCurrencies}")


  public String getLocalCurrencyCode() {
    return localCurrencyCode;
  }

  public void setLocalCurrencyCode(String localCurrencyCode) {
    this.localCurrencyCode = localCurrencyCode;
  }

  public Transaction orderedBy(String orderedBy) {
    this.orderedBy = orderedBy;
    return this;
  }

  /**
   * Username who registered the transaction
   * @return orderedBy
  **/
  @ApiModelProperty(value = "Username who registered the transaction")


  public String getOrderedBy() {
    return orderedBy;
  }

  public void setOrderedBy(String orderedBy) {
    this.orderedBy = orderedBy;
  }

  public Transaction paymentCurrencyCode(String paymentCurrencyCode) {
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

  public Transaction price(Price price) {
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

  public Transaction productId(Long productId) {
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

  public Transaction subdistributorId(Long subdistributorId) {
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

  public Transaction transactionAmountData(TransactionAmountData transactionAmountData) {
    this.transactionAmountData = transactionAmountData;
    return this;
  }

  /**
   * Get transactionAmountData
   * @return transactionAmountData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public TransactionAmountData getTransactionAmountData() {
    return transactionAmountData;
  }

  public void setTransactionAmountData(TransactionAmountData transactionAmountData) {
    this.transactionAmountData = transactionAmountData;
  }

  public Transaction transactionCapitalGainedData(TransactionCapitalGainedData transactionCapitalGainedData) {
    this.transactionCapitalGainedData = transactionCapitalGainedData;
    return this;
  }

  /**
   * Get transactionCapitalGainedData
   * @return transactionCapitalGainedData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public TransactionCapitalGainedData getTransactionCapitalGainedData() {
    return transactionCapitalGainedData;
  }

  public void setTransactionCapitalGainedData(TransactionCapitalGainedData transactionCapitalGainedData) {
    this.transactionCapitalGainedData = transactionCapitalGainedData;
  }

  public Transaction transactionComments(String transactionComments) {
    this.transactionComments = transactionComments;
    return this;
  }

  /**
   * Contains comments added to the transaction when it was ordered.
   * @return transactionComments
  **/
  @ApiModelProperty(value = "Contains comments added to the transaction when it was ordered.")


  public String getTransactionComments() {
    return transactionComments;
  }

  public void setTransactionComments(String transactionComments) {
    this.transactionComments = transactionComments;
  }

  public Transaction transactionContractData(TransactionContractData transactionContractData) {
    this.transactionContractData = transactionContractData;
    return this;
  }

  /**
   * Get transactionContractData
   * @return transactionContractData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public TransactionContractData getTransactionContractData() {
    return transactionContractData;
  }

  public void setTransactionContractData(TransactionContractData transactionContractData) {
    this.transactionContractData = transactionContractData;
  }

  public Transaction transactionDateData(TransactionDateData transactionDateData) {
    this.transactionDateData = transactionDateData;
    return this;
  }

  /**
   * Get transactionDateData
   * @return transactionDateData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public TransactionDateData getTransactionDateData() {
    return transactionDateData;
  }

  public void setTransactionDateData(TransactionDateData transactionDateData) {
    this.transactionDateData = transactionDateData;
  }

  public Transaction transactionDividendData(TransactionDividendData transactionDividendData) {
    this.transactionDividendData = transactionDividendData;
    return this;
  }

  /**
   * Get transactionDividendData
   * @return transactionDividendData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public TransactionDividendData getTransactionDividendData() {
    return transactionDividendData;
  }

  public void setTransactionDividendData(TransactionDividendData transactionDividendData) {
    this.transactionDividendData = transactionDividendData;
  }

  public Transaction transactionEtfData(TransactionEtfData transactionEtfData) {
    this.transactionEtfData = transactionEtfData;
    return this;
  }

  /**
   * Get transactionEtfData
   * @return transactionEtfData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public TransactionEtfData getTransactionEtfData() {
    return transactionEtfData;
  }

  public void setTransactionEtfData(TransactionEtfData transactionEtfData) {
    this.transactionEtfData = transactionEtfData;
  }

  public Transaction transactionFeeData(TransactionFeeData transactionFeeData) {
    this.transactionFeeData = transactionFeeData;
    return this;
  }

  /**
   * Get transactionFeeData
   * @return transactionFeeData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public TransactionFeeData getTransactionFeeData() {
    return transactionFeeData;
  }

  public void setTransactionFeeData(TransactionFeeData transactionFeeData) {
    this.transactionFeeData = transactionFeeData;
  }

  public Transaction transactionForeignExchangeData(TransactionForeignExchangeData transactionForeignExchangeData) {
    this.transactionForeignExchangeData = transactionForeignExchangeData;
    return this;
  }

  /**
   * Get transactionForeignExchangeData
   * @return transactionForeignExchangeData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public TransactionForeignExchangeData getTransactionForeignExchangeData() {
    return transactionForeignExchangeData;
  }

  public void setTransactionForeignExchangeData(TransactionForeignExchangeData transactionForeignExchangeData) {
    this.transactionForeignExchangeData = transactionForeignExchangeData;
  }

  public Transaction transactionItalianRetailMarketData(TransactionItalianRetailMarketData transactionItalianRetailMarketData) {
    this.transactionItalianRetailMarketData = transactionItalianRetailMarketData;
    return this;
  }

  /**
   * Get transactionItalianRetailMarketData
   * @return transactionItalianRetailMarketData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public TransactionItalianRetailMarketData getTransactionItalianRetailMarketData() {
    return transactionItalianRetailMarketData;
  }

  public void setTransactionItalianRetailMarketData(TransactionItalianRetailMarketData transactionItalianRetailMarketData) {
    this.transactionItalianRetailMarketData = transactionItalianRetailMarketData;
  }

  public Transaction transactionPrepaidData(TransactionPrepaidData transactionPrepaidData) {
    this.transactionPrepaidData = transactionPrepaidData;
    return this;
  }

  /**
   * Get transactionPrepaidData
   * @return transactionPrepaidData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public TransactionPrepaidData getTransactionPrepaidData() {
    return transactionPrepaidData;
  }

  public void setTransactionPrepaidData(TransactionPrepaidData transactionPrepaidData) {
    this.transactionPrepaidData = transactionPrepaidData;
  }

  public Transaction transactionSettingsData(TransactionSettingsData transactionSettingsData) {
    this.transactionSettingsData = transactionSettingsData;
    return this;
  }

  /**
   * Get transactionSettingsData
   * @return transactionSettingsData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public TransactionSettingsData getTransactionSettingsData() {
    return transactionSettingsData;
  }

  public void setTransactionSettingsData(TransactionSettingsData transactionSettingsData) {
    this.transactionSettingsData = transactionSettingsData;
  }

  public Transaction transactionSharesData(TransactionSharesData transactionSharesData) {
    this.transactionSharesData = transactionSharesData;
    return this;
  }

  /**
   * Get transactionSharesData
   * @return transactionSharesData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public TransactionSharesData getTransactionSharesData() {
    return transactionSharesData;
  }

  public void setTransactionSharesData(TransactionSharesData transactionSharesData) {
    this.transactionSharesData = transactionSharesData;
  }

  public Transaction transactionSpanishMarketData(TransactionSpanishMarketData transactionSpanishMarketData) {
    this.transactionSpanishMarketData = transactionSpanishMarketData;
    return this;
  }

  /**
   * Get transactionSpanishMarketData
   * @return transactionSpanishMarketData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public TransactionSpanishMarketData getTransactionSpanishMarketData() {
    return transactionSpanishMarketData;
  }

  public void setTransactionSpanishMarketData(TransactionSpanishMarketData transactionSpanishMarketData) {
    this.transactionSpanishMarketData = transactionSpanishMarketData;
  }

  public Transaction transactionStatusCode(String transactionStatusCode) {
    this.transactionStatusCode = transactionStatusCode;
    return this;
  }

  /**
   * The Transaction's status. Refer to {listTransactionDetailedStatuses}
   * @return transactionStatusCode
  **/
  @ApiModelProperty(value = "The Transaction's status. Refer to {listTransactionDetailedStatuses}")


  public String getTransactionStatusCode() {
    return transactionStatusCode;
  }

  public void setTransactionStatusCode(String transactionStatusCode) {
    this.transactionStatusCode = transactionStatusCode;
  }

  public Transaction transactionSwitchData(TransactionSwitchData transactionSwitchData) {
    this.transactionSwitchData = transactionSwitchData;
    return this;
  }

  /**
   * Get transactionSwitchData
   * @return transactionSwitchData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public TransactionSwitchData getTransactionSwitchData() {
    return transactionSwitchData;
  }

  public void setTransactionSwitchData(TransactionSwitchData transactionSwitchData) {
    this.transactionSwitchData = transactionSwitchData;
  }

  public Transaction transactionTypeCode(String transactionTypeCode) {
    this.transactionTypeCode = transactionTypeCode;
    return this;
  }

  /**
   * The Transaction's type. Refer to {listTransactionTypes}
   * @return transactionTypeCode
  **/
  @ApiModelProperty(value = "The Transaction's type. Refer to {listTransactionTypes}")


  public String getTransactionTypeCode() {
    return transactionTypeCode;
  }

  public void setTransactionTypeCode(String transactionTypeCode) {
    this.transactionTypeCode = transactionTypeCode;
  }

  public Transaction transactionWithholdingData(TransactionWithholdingData transactionWithholdingData) {
    this.transactionWithholdingData = transactionWithholdingData;
    return this;
  }

  /**
   * Get transactionWithholdingData
   * @return transactionWithholdingData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public TransactionWithholdingData getTransactionWithholdingData() {
    return transactionWithholdingData;
  }

  public void setTransactionWithholdingData(TransactionWithholdingData transactionWithholdingData) {
    this.transactionWithholdingData = transactionWithholdingData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transaction transaction = (Transaction) o;
    return Objects.equals(this.averagePriceApplied, transaction.averagePriceApplied) &&
        Objects.equals(this.contractId, transaction.contractId) &&
        Objects.equals(this.currencyCode, transaction.currencyCode) &&
        Objects.equals(this.dealingFundHouseId, transaction.dealingFundHouseId) &&
        Objects.equals(this.dealingInstrument, transaction.dealingInstrument) &&
        Objects.equals(this.dealingInstrumentType, transaction.dealingInstrumentType) &&
        Objects.equals(this.depositaryId, transaction.depositaryId) &&
        Objects.equals(this.distributorId, transaction.distributorId) &&
        Objects.equals(this.exchangeRateApplied, transaction.exchangeRateApplied) &&
        Objects.equals(this.exchangeRateToLocalCurrency, transaction.exchangeRateToLocalCurrency) &&
        Objects.equals(this.externalReference, transaction.externalReference) &&
        Objects.equals(this.id, transaction.id) &&
        Objects.equals(this.localCurrencyCode, transaction.localCurrencyCode) &&
        Objects.equals(this.orderedBy, transaction.orderedBy) &&
        Objects.equals(this.paymentCurrencyCode, transaction.paymentCurrencyCode) &&
        Objects.equals(this.price, transaction.price) &&
        Objects.equals(this.productId, transaction.productId) &&
        Objects.equals(this.subdistributorId, transaction.subdistributorId) &&
        Objects.equals(this.transactionAmountData, transaction.transactionAmountData) &&
        Objects.equals(this.transactionCapitalGainedData, transaction.transactionCapitalGainedData) &&
        Objects.equals(this.transactionComments, transaction.transactionComments) &&
        Objects.equals(this.transactionContractData, transaction.transactionContractData) &&
        Objects.equals(this.transactionDateData, transaction.transactionDateData) &&
        Objects.equals(this.transactionDividendData, transaction.transactionDividendData) &&
        Objects.equals(this.transactionEtfData, transaction.transactionEtfData) &&
        Objects.equals(this.transactionFeeData, transaction.transactionFeeData) &&
        Objects.equals(this.transactionForeignExchangeData, transaction.transactionForeignExchangeData) &&
        Objects.equals(this.transactionItalianRetailMarketData, transaction.transactionItalianRetailMarketData) &&
        Objects.equals(this.transactionPrepaidData, transaction.transactionPrepaidData) &&
        Objects.equals(this.transactionSettingsData, transaction.transactionSettingsData) &&
        Objects.equals(this.transactionSharesData, transaction.transactionSharesData) &&
        Objects.equals(this.transactionSpanishMarketData, transaction.transactionSpanishMarketData) &&
        Objects.equals(this.transactionStatusCode, transaction.transactionStatusCode) &&
        Objects.equals(this.transactionSwitchData, transaction.transactionSwitchData) &&
        Objects.equals(this.transactionTypeCode, transaction.transactionTypeCode) &&
        Objects.equals(this.transactionWithholdingData, transaction.transactionWithholdingData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(averagePriceApplied, contractId, currencyCode, dealingFundHouseId, dealingInstrument, dealingInstrumentType, depositaryId, distributorId, exchangeRateApplied, exchangeRateToLocalCurrency, externalReference, id, localCurrencyCode, orderedBy, paymentCurrencyCode, price, productId, subdistributorId, transactionAmountData, transactionCapitalGainedData, transactionComments, transactionContractData, transactionDateData, transactionDividendData, transactionEtfData, transactionFeeData, transactionForeignExchangeData, transactionItalianRetailMarketData, transactionPrepaidData, transactionSettingsData, transactionSharesData, transactionSpanishMarketData, transactionStatusCode, transactionSwitchData, transactionTypeCode, transactionWithholdingData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transaction {\n");
    
    sb.append("    averagePriceApplied: ").append(toIndentedString(averagePriceApplied)).append("\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    dealingFundHouseId: ").append(toIndentedString(dealingFundHouseId)).append("\n");
    sb.append("    dealingInstrument: ").append(toIndentedString(dealingInstrument)).append("\n");
    sb.append("    dealingInstrumentType: ").append(toIndentedString(dealingInstrumentType)).append("\n");
    sb.append("    depositaryId: ").append(toIndentedString(depositaryId)).append("\n");
    sb.append("    distributorId: ").append(toIndentedString(distributorId)).append("\n");
    sb.append("    exchangeRateApplied: ").append(toIndentedString(exchangeRateApplied)).append("\n");
    sb.append("    exchangeRateToLocalCurrency: ").append(toIndentedString(exchangeRateToLocalCurrency)).append("\n");
    sb.append("    externalReference: ").append(toIndentedString(externalReference)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    localCurrencyCode: ").append(toIndentedString(localCurrencyCode)).append("\n");
    sb.append("    orderedBy: ").append(toIndentedString(orderedBy)).append("\n");
    sb.append("    paymentCurrencyCode: ").append(toIndentedString(paymentCurrencyCode)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    subdistributorId: ").append(toIndentedString(subdistributorId)).append("\n");
    sb.append("    transactionAmountData: ").append(toIndentedString(transactionAmountData)).append("\n");
    sb.append("    transactionCapitalGainedData: ").append(toIndentedString(transactionCapitalGainedData)).append("\n");
    sb.append("    transactionComments: ").append(toIndentedString(transactionComments)).append("\n");
    sb.append("    transactionContractData: ").append(toIndentedString(transactionContractData)).append("\n");
    sb.append("    transactionDateData: ").append(toIndentedString(transactionDateData)).append("\n");
    sb.append("    transactionDividendData: ").append(toIndentedString(transactionDividendData)).append("\n");
    sb.append("    transactionEtfData: ").append(toIndentedString(transactionEtfData)).append("\n");
    sb.append("    transactionFeeData: ").append(toIndentedString(transactionFeeData)).append("\n");
    sb.append("    transactionForeignExchangeData: ").append(toIndentedString(transactionForeignExchangeData)).append("\n");
    sb.append("    transactionItalianRetailMarketData: ").append(toIndentedString(transactionItalianRetailMarketData)).append("\n");
    sb.append("    transactionPrepaidData: ").append(toIndentedString(transactionPrepaidData)).append("\n");
    sb.append("    transactionSettingsData: ").append(toIndentedString(transactionSettingsData)).append("\n");
    sb.append("    transactionSharesData: ").append(toIndentedString(transactionSharesData)).append("\n");
    sb.append("    transactionSpanishMarketData: ").append(toIndentedString(transactionSpanishMarketData)).append("\n");
    sb.append("    transactionStatusCode: ").append(toIndentedString(transactionStatusCode)).append("\n");
    sb.append("    transactionSwitchData: ").append(toIndentedString(transactionSwitchData)).append("\n");
    sb.append("    transactionTypeCode: ").append(toIndentedString(transactionTypeCode)).append("\n");
    sb.append("    transactionWithholdingData: ").append(toIndentedString(transactionWithholdingData)).append("\n");
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

