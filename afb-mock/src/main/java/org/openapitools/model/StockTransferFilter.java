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
 * StockTransferFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class StockTransferFilter   {
  @JsonProperty("categoryCode")
  private String categoryCode = null;

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

  @JsonProperty("endDate")
  private OffsetDateTime endDate = null;

  @JsonProperty("endFollowupDate")
  private OffsetDateTime endFollowupDate = null;

  @JsonProperty("endOrderedDate")
  private OffsetDateTime endOrderedDate = null;

  @JsonProperty("externalReference")
  private String externalReference = null;

  @JsonProperty("productId")
  private Long productId = null;

  @JsonProperty("startDate")
  private OffsetDateTime startDate = null;

  @JsonProperty("startFollowupDate")
  private OffsetDateTime startFollowupDate = null;

  @JsonProperty("startOrderedDate")
  private OffsetDateTime startOrderedDate = null;

  @JsonProperty("stockTransferStatusCode")
  private String stockTransferStatusCode = null;

  @JsonProperty("stockTransferTypeCode")
  private String stockTransferTypeCode = null;

  @JsonProperty("subdistributorId")
  private Long subdistributorId = null;

  public StockTransferFilter categoryCode(String categoryCode) {
    this.categoryCode = categoryCode;
    return this;
  }

  /**
   * The category of the {StockTransfer}. Refer to {listStockTransferCategories}
   * @return categoryCode
  **/
  @ApiModelProperty(value = "The category of the {StockTransfer}. Refer to {listStockTransferCategories}")


  public String getCategoryCode() {
    return categoryCode;
  }

  public void setCategoryCode(String categoryCode) {
    this.categoryCode = categoryCode;
  }

  public StockTransferFilter contractExternalReference(String contractExternalReference) {
    this.contractExternalReference = contractExternalReference;
    return this;
  }

  /**
   * The {Contract.externalReference} associated to the {StockTransfer}
   * @return contractExternalReference
  **/
  @ApiModelProperty(value = "The {Contract.externalReference} associated to the {StockTransfer}")


  public String getContractExternalReference() {
    return contractExternalReference;
  }

  public void setContractExternalReference(String contractExternalReference) {
    this.contractExternalReference = contractExternalReference;
  }

  public StockTransferFilter dealingFundHouseId(Long dealingFundHouseId) {
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

  public StockTransferFilter dealingInstrumentId(Long dealingInstrumentId) {
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

  public StockTransferFilter dealingInstrumentType(DealingInstrumentTypeEnum dealingInstrumentType) {
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

  public StockTransferFilter endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * End date to do the search. Refer to {Price.date} of the {StockTransfer.StockTransferBasicData}
   * @return endDate
  **/
  @ApiModelProperty(value = "End date to do the search. Refer to {Price.date} of the {StockTransfer.StockTransferBasicData}")

  @Valid

  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public StockTransferFilter endFollowupDate(OffsetDateTime endFollowupDate) {
    this.endFollowupDate = endFollowupDate;
    return this;
  }

  /**
   * End date to do the search. Refer to {StockTransferTransactionData.orderedDate} of the {StockTransfer.StockTransferTransactionData}
   * @return endFollowupDate
  **/
  @ApiModelProperty(value = "End date to do the search. Refer to {StockTransferTransactionData.orderedDate} of the {StockTransfer.StockTransferTransactionData}")

  @Valid

  public OffsetDateTime getEndFollowupDate() {
    return endFollowupDate;
  }

  public void setEndFollowupDate(OffsetDateTime endFollowupDate) {
    this.endFollowupDate = endFollowupDate;
  }

  public StockTransferFilter endOrderedDate(OffsetDateTime endOrderedDate) {
    this.endOrderedDate = endOrderedDate;
    return this;
  }

  /**
   * End date to do the search. Refer to {StockTransferTransactionData.orderedDate} of the {StockTransfer.StockTransferTransactionData}
   * @return endOrderedDate
  **/
  @ApiModelProperty(value = "End date to do the search. Refer to {StockTransferTransactionData.orderedDate} of the {StockTransfer.StockTransferTransactionData}")

  @Valid

  public OffsetDateTime getEndOrderedDate() {
    return endOrderedDate;
  }

  public void setEndOrderedDate(OffsetDateTime endOrderedDate) {
    this.endOrderedDate = endOrderedDate;
  }

  public StockTransferFilter externalReference(String externalReference) {
    this.externalReference = externalReference;
    return this;
  }

  /**
   * The external reference of the {StockTransfer}
   * @return externalReference
  **/
  @ApiModelProperty(value = "The external reference of the {StockTransfer}")


  public String getExternalReference() {
    return externalReference;
  }

  public void setExternalReference(String externalReference) {
    this.externalReference = externalReference;
  }

  public StockTransferFilter productId(Long productId) {
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

  public StockTransferFilter startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Start date to do the search. Refer to {Price.date} of the {StockTransfer.StockTransferBasicData}
   * @return startDate
  **/
  @ApiModelProperty(value = "Start date to do the search. Refer to {Price.date} of the {StockTransfer.StockTransferBasicData}")

  @Valid

  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public StockTransferFilter startFollowupDate(OffsetDateTime startFollowupDate) {
    this.startFollowupDate = startFollowupDate;
    return this;
  }

  /**
   * Start date to do the search. Refer to {StockTransferTransactionData.orderedDate} of the {StockTransfer.StockTransferTransactionData}
   * @return startFollowupDate
  **/
  @ApiModelProperty(value = "Start date to do the search. Refer to {StockTransferTransactionData.orderedDate} of the {StockTransfer.StockTransferTransactionData}")

  @Valid

  public OffsetDateTime getStartFollowupDate() {
    return startFollowupDate;
  }

  public void setStartFollowupDate(OffsetDateTime startFollowupDate) {
    this.startFollowupDate = startFollowupDate;
  }

  public StockTransferFilter startOrderedDate(OffsetDateTime startOrderedDate) {
    this.startOrderedDate = startOrderedDate;
    return this;
  }

  /**
   * Start date to do the search. Refer to {StockTransferTransactionData.orderedDate} of the {StockTransfer.StockTransferTransactionData}
   * @return startOrderedDate
  **/
  @ApiModelProperty(value = "Start date to do the search. Refer to {StockTransferTransactionData.orderedDate} of the {StockTransfer.StockTransferTransactionData}")

  @Valid

  public OffsetDateTime getStartOrderedDate() {
    return startOrderedDate;
  }

  public void setStartOrderedDate(OffsetDateTime startOrderedDate) {
    this.startOrderedDate = startOrderedDate;
  }

  public StockTransferFilter stockTransferStatusCode(String stockTransferStatusCode) {
    this.stockTransferStatusCode = stockTransferStatusCode;
    return this;
  }

  /**
   * The {StockTransfer} status. Refer to {listStockTransferStatuses}
   * @return stockTransferStatusCode
  **/
  @ApiModelProperty(value = "The {StockTransfer} status. Refer to {listStockTransferStatuses}")


  public String getStockTransferStatusCode() {
    return stockTransferStatusCode;
  }

  public void setStockTransferStatusCode(String stockTransferStatusCode) {
    this.stockTransferStatusCode = stockTransferStatusCode;
  }

  public StockTransferFilter stockTransferTypeCode(String stockTransferTypeCode) {
    this.stockTransferTypeCode = stockTransferTypeCode;
    return this;
  }

  /**
   * The type of the {StockTransfer}. Refer to {listStockTransferTypes}
   * @return stockTransferTypeCode
  **/
  @ApiModelProperty(value = "The type of the {StockTransfer}. Refer to {listStockTransferTypes}")


  public String getStockTransferTypeCode() {
    return stockTransferTypeCode;
  }

  public void setStockTransferTypeCode(String stockTransferTypeCode) {
    this.stockTransferTypeCode = stockTransferTypeCode;
  }

  public StockTransferFilter subdistributorId(Long subdistributorId) {
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
    StockTransferFilter stockTransferFilter = (StockTransferFilter) o;
    return Objects.equals(this.categoryCode, stockTransferFilter.categoryCode) &&
        Objects.equals(this.contractExternalReference, stockTransferFilter.contractExternalReference) &&
        Objects.equals(this.dealingFundHouseId, stockTransferFilter.dealingFundHouseId) &&
        Objects.equals(this.dealingInstrumentId, stockTransferFilter.dealingInstrumentId) &&
        Objects.equals(this.dealingInstrumentType, stockTransferFilter.dealingInstrumentType) &&
        Objects.equals(this.endDate, stockTransferFilter.endDate) &&
        Objects.equals(this.endFollowupDate, stockTransferFilter.endFollowupDate) &&
        Objects.equals(this.endOrderedDate, stockTransferFilter.endOrderedDate) &&
        Objects.equals(this.externalReference, stockTransferFilter.externalReference) &&
        Objects.equals(this.productId, stockTransferFilter.productId) &&
        Objects.equals(this.startDate, stockTransferFilter.startDate) &&
        Objects.equals(this.startFollowupDate, stockTransferFilter.startFollowupDate) &&
        Objects.equals(this.startOrderedDate, stockTransferFilter.startOrderedDate) &&
        Objects.equals(this.stockTransferStatusCode, stockTransferFilter.stockTransferStatusCode) &&
        Objects.equals(this.stockTransferTypeCode, stockTransferFilter.stockTransferTypeCode) &&
        Objects.equals(this.subdistributorId, stockTransferFilter.subdistributorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryCode, contractExternalReference, dealingFundHouseId, dealingInstrumentId, dealingInstrumentType, endDate, endFollowupDate, endOrderedDate, externalReference, productId, startDate, startFollowupDate, startOrderedDate, stockTransferStatusCode, stockTransferTypeCode, subdistributorId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockTransferFilter {\n");
    
    sb.append("    categoryCode: ").append(toIndentedString(categoryCode)).append("\n");
    sb.append("    contractExternalReference: ").append(toIndentedString(contractExternalReference)).append("\n");
    sb.append("    dealingFundHouseId: ").append(toIndentedString(dealingFundHouseId)).append("\n");
    sb.append("    dealingInstrumentId: ").append(toIndentedString(dealingInstrumentId)).append("\n");
    sb.append("    dealingInstrumentType: ").append(toIndentedString(dealingInstrumentType)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    endFollowupDate: ").append(toIndentedString(endFollowupDate)).append("\n");
    sb.append("    endOrderedDate: ").append(toIndentedString(endOrderedDate)).append("\n");
    sb.append("    externalReference: ").append(toIndentedString(externalReference)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    startFollowupDate: ").append(toIndentedString(startFollowupDate)).append("\n");
    sb.append("    startOrderedDate: ").append(toIndentedString(startOrderedDate)).append("\n");
    sb.append("    stockTransferStatusCode: ").append(toIndentedString(stockTransferStatusCode)).append("\n");
    sb.append("    stockTransferTypeCode: ").append(toIndentedString(stockTransferTypeCode)).append("\n");
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

