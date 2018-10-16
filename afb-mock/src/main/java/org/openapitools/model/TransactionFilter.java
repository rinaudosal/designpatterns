package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This object is a filter used for retrieve a transction list filtered by some criteria
 */
@ApiModel(description = "This object is a filter used for retrieve a transction list filtered by some criteria")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class TransactionFilter   {
  @JsonProperty("brokerId")
  private Long brokerId = null;

  @JsonProperty("contractExternalReference")
  private String contractExternalReference = null;

  @JsonProperty("dealingFundHouseId")
  private Long dealingFundHouseId = null;

  @JsonProperty("dealingInstrumentId")
  private Long dealingInstrumentId = null;

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

  @JsonProperty("priceFromDate")
  private OffsetDateTime priceFromDate = null;

  @JsonProperty("priceToDate")
  private OffsetDateTime priceToDate = null;

  @JsonProperty("stockExchangeId")
  private String stockExchangeId = null;

  @JsonProperty("subdistributorId")
  private Long subdistributorId = null;

  @JsonProperty("transactionExternalReference")
  private String transactionExternalReference = null;

  @JsonProperty("transactionFromDate")
  private OffsetDateTime transactionFromDate = null;

  @JsonProperty("transactionStatusCode")
  private String transactionStatusCode = null;

  @JsonProperty("transactionToDate")
  private OffsetDateTime transactionToDate = null;

  @JsonProperty("transactionTypeCode")
  private String transactionTypeCode = null;

  public TransactionFilter brokerId(Long brokerId) {
    this.brokerId = brokerId;
    return this;
  }

  /**
   * The Id of the {Broker}. This attribute is only valid for transaction related to {ETF}. See {TransactionEtfData}
   * @return brokerId
  **/
  @ApiModelProperty(value = "The Id of the {Broker}. This attribute is only valid for transaction related to {ETF}. See {TransactionEtfData}")


  public Long getBrokerId() {
    return brokerId;
  }

  public void setBrokerId(Long brokerId) {
    this.brokerId = brokerId;
  }

  public TransactionFilter contractExternalReference(String contractExternalReference) {
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

  public TransactionFilter dealingFundHouseId(Long dealingFundHouseId) {
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

  public TransactionFilter dealingInstrumentId(Long dealingInstrumentId) {
    this.dealingInstrumentId = dealingInstrumentId;
    return this;
  }

  /**
   * The Id of the {DealingInstrument}
   * @return dealingInstrumentId
  **/
  @ApiModelProperty(value = "The Id of the {DealingInstrument}")


  public Long getDealingInstrumentId() {
    return dealingInstrumentId;
  }

  public void setDealingInstrumentId(Long dealingInstrumentId) {
    this.dealingInstrumentId = dealingInstrumentId;
  }

  public TransactionFilter dealingInstrumentType(DealingInstrumentTypeEnum dealingInstrumentType) {
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

  public TransactionFilter priceFromDate(OffsetDateTime priceFromDate) {
    this.priceFromDate = priceFromDate;
    return this;
  }

  /**
   * The minimum price date.
   * @return priceFromDate
  **/
  @ApiModelProperty(value = "The minimum price date.")

  @Valid

  public OffsetDateTime getPriceFromDate() {
    return priceFromDate;
  }

  public void setPriceFromDate(OffsetDateTime priceFromDate) {
    this.priceFromDate = priceFromDate;
  }

  public TransactionFilter priceToDate(OffsetDateTime priceToDate) {
    this.priceToDate = priceToDate;
    return this;
  }

  /**
   * The maximum price date.
   * @return priceToDate
  **/
  @ApiModelProperty(value = "The maximum price date.")

  @Valid

  public OffsetDateTime getPriceToDate() {
    return priceToDate;
  }

  public void setPriceToDate(OffsetDateTime priceToDate) {
    this.priceToDate = priceToDate;
  }

  public TransactionFilter stockExchangeId(String stockExchangeId) {
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

  public TransactionFilter subdistributorId(Long subdistributorId) {
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

  public TransactionFilter transactionExternalReference(String transactionExternalReference) {
    this.transactionExternalReference = transactionExternalReference;
    return this;
  }

  /**
   * A transaction external reference
   * @return transactionExternalReference
  **/
  @ApiModelProperty(value = "A transaction external reference")


  public String getTransactionExternalReference() {
    return transactionExternalReference;
  }

  public void setTransactionExternalReference(String transactionExternalReference) {
    this.transactionExternalReference = transactionExternalReference;
  }

  public TransactionFilter transactionFromDate(OffsetDateTime transactionFromDate) {
    this.transactionFromDate = transactionFromDate;
    return this;
  }

  /**
   * The lower limit to search transactions ordered after this one.
   * @return transactionFromDate
  **/
  @ApiModelProperty(value = "The lower limit to search transactions ordered after this one.")

  @Valid

  public OffsetDateTime getTransactionFromDate() {
    return transactionFromDate;
  }

  public void setTransactionFromDate(OffsetDateTime transactionFromDate) {
    this.transactionFromDate = transactionFromDate;
  }

  public TransactionFilter transactionStatusCode(String transactionStatusCode) {
    this.transactionStatusCode = transactionStatusCode;
    return this;
  }

  /**
   * Transaction status. Refer to {listTransactionStatuses} or {listEtfTransactionStatuses} depending dealingInstrumentType
   * @return transactionStatusCode
  **/
  @ApiModelProperty(value = "Transaction status. Refer to {listTransactionStatuses} or {listEtfTransactionStatuses} depending dealingInstrumentType")


  public String getTransactionStatusCode() {
    return transactionStatusCode;
  }

  public void setTransactionStatusCode(String transactionStatusCode) {
    this.transactionStatusCode = transactionStatusCode;
  }

  public TransactionFilter transactionToDate(OffsetDateTime transactionToDate) {
    this.transactionToDate = transactionToDate;
    return this;
  }

  /**
   * The higher limit to search transactions ordered before this one.
   * @return transactionToDate
  **/
  @ApiModelProperty(value = "The higher limit to search transactions ordered before this one.")

  @Valid

  public OffsetDateTime getTransactionToDate() {
    return transactionToDate;
  }

  public void setTransactionToDate(OffsetDateTime transactionToDate) {
    this.transactionToDate = transactionToDate;
  }

  public TransactionFilter transactionTypeCode(String transactionTypeCode) {
    this.transactionTypeCode = transactionTypeCode;
    return this;
  }

  /**
   * The Transaction. Refer to {listTransactionTypes}
   * @return transactionTypeCode
  **/
  @ApiModelProperty(value = "The Transaction. Refer to {listTransactionTypes}")


  public String getTransactionTypeCode() {
    return transactionTypeCode;
  }

  public void setTransactionTypeCode(String transactionTypeCode) {
    this.transactionTypeCode = transactionTypeCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionFilter transactionFilter = (TransactionFilter) o;
    return Objects.equals(this.brokerId, transactionFilter.brokerId) &&
        Objects.equals(this.contractExternalReference, transactionFilter.contractExternalReference) &&
        Objects.equals(this.dealingFundHouseId, transactionFilter.dealingFundHouseId) &&
        Objects.equals(this.dealingInstrumentId, transactionFilter.dealingInstrumentId) &&
        Objects.equals(this.dealingInstrumentType, transactionFilter.dealingInstrumentType) &&
        Objects.equals(this.priceFromDate, transactionFilter.priceFromDate) &&
        Objects.equals(this.priceToDate, transactionFilter.priceToDate) &&
        Objects.equals(this.stockExchangeId, transactionFilter.stockExchangeId) &&
        Objects.equals(this.subdistributorId, transactionFilter.subdistributorId) &&
        Objects.equals(this.transactionExternalReference, transactionFilter.transactionExternalReference) &&
        Objects.equals(this.transactionFromDate, transactionFilter.transactionFromDate) &&
        Objects.equals(this.transactionStatusCode, transactionFilter.transactionStatusCode) &&
        Objects.equals(this.transactionToDate, transactionFilter.transactionToDate) &&
        Objects.equals(this.transactionTypeCode, transactionFilter.transactionTypeCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brokerId, contractExternalReference, dealingFundHouseId, dealingInstrumentId, dealingInstrumentType, priceFromDate, priceToDate, stockExchangeId, subdistributorId, transactionExternalReference, transactionFromDate, transactionStatusCode, transactionToDate, transactionTypeCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionFilter {\n");
    
    sb.append("    brokerId: ").append(toIndentedString(brokerId)).append("\n");
    sb.append("    contractExternalReference: ").append(toIndentedString(contractExternalReference)).append("\n");
    sb.append("    dealingFundHouseId: ").append(toIndentedString(dealingFundHouseId)).append("\n");
    sb.append("    dealingInstrumentId: ").append(toIndentedString(dealingInstrumentId)).append("\n");
    sb.append("    dealingInstrumentType: ").append(toIndentedString(dealingInstrumentType)).append("\n");
    sb.append("    priceFromDate: ").append(toIndentedString(priceFromDate)).append("\n");
    sb.append("    priceToDate: ").append(toIndentedString(priceToDate)).append("\n");
    sb.append("    stockExchangeId: ").append(toIndentedString(stockExchangeId)).append("\n");
    sb.append("    subdistributorId: ").append(toIndentedString(subdistributorId)).append("\n");
    sb.append("    transactionExternalReference: ").append(toIndentedString(transactionExternalReference)).append("\n");
    sb.append("    transactionFromDate: ").append(toIndentedString(transactionFromDate)).append("\n");
    sb.append("    transactionStatusCode: ").append(toIndentedString(transactionStatusCode)).append("\n");
    sb.append("    transactionToDate: ").append(toIndentedString(transactionToDate)).append("\n");
    sb.append("    transactionTypeCode: ").append(toIndentedString(transactionTypeCode)).append("\n");
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

