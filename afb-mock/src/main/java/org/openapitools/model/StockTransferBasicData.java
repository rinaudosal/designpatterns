package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.model.Price;
import org.openapitools.model.ResourceReference;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StockTransferBasicData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class StockTransferBasicData   {
  @JsonProperty("additionalReference")
  private String additionalReference = null;

  @JsonProperty("additionalReferenceSwift")
  private String additionalReferenceSwift = null;

  @JsonProperty("categoryCode")
  private String categoryCode = null;

  @JsonProperty("contractExternalReference")
  private String contractExternalReference = null;

  @JsonProperty("dealingFundHouseId")
  private Long dealingFundHouseId = null;

  @JsonProperty("dealingInstrument")
  private ResourceReference dealingInstrument = null;

  /**
   * Enum to select between \"FUND\" \"ETF\". Indicates the type of the {DealingInstrument} associated to the {StockTransfer}.
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

  @JsonProperty("externalReference")
  private String externalReference = null;

  @JsonProperty("followupDate")
  private OffsetDateTime followupDate = null;

  @JsonProperty("price")
  private Price price = null;

  @JsonProperty("productId")
  private Long productId = null;

  @JsonProperty("sentDate")
  private OffsetDateTime sentDate = null;

  @JsonProperty("stockTransferStatusCode")
  private String stockTransferStatusCode = null;

  @JsonProperty("stockTransferTypeCode")
  private String stockTransferTypeCode = null;

  @JsonProperty("subdistributorId")
  private Long subdistributorId = null;

  public StockTransferBasicData additionalReference(String additionalReference) {
    this.additionalReference = additionalReference;
    return this;
  }

  /**
   * Optional additional reference
   * @return additionalReference
  **/
  @ApiModelProperty(value = "Optional additional reference")


  public String getAdditionalReference() {
    return additionalReference;
  }

  public void setAdditionalReference(String additionalReference) {
    this.additionalReference = additionalReference;
  }

  public StockTransferBasicData additionalReferenceSwift(String additionalReferenceSwift) {
    this.additionalReferenceSwift = additionalReferenceSwift;
    return this;
  }

  /**
   * Additional reference Swift
   * @return additionalReferenceSwift
  **/
  @ApiModelProperty(value = "Additional reference Swift")


  public String getAdditionalReferenceSwift() {
    return additionalReferenceSwift;
  }

  public void setAdditionalReferenceSwift(String additionalReferenceSwift) {
    this.additionalReferenceSwift = additionalReferenceSwift;
  }

  public StockTransferBasicData categoryCode(String categoryCode) {
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

  public StockTransferBasicData contractExternalReference(String contractExternalReference) {
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

  public StockTransferBasicData dealingFundHouseId(Long dealingFundHouseId) {
    this.dealingFundHouseId = dealingFundHouseId;
    return this;
  }

  /**
   * The Id of the {DealingFundHouse} of the {DealingInstrument} associated to the {StockTransfer}
   * @return dealingFundHouseId
  **/
  @ApiModelProperty(value = "The Id of the {DealingFundHouse} of the {DealingInstrument} associated to the {StockTransfer}")


  public Long getDealingFundHouseId() {
    return dealingFundHouseId;
  }

  public void setDealingFundHouseId(Long dealingFundHouseId) {
    this.dealingFundHouseId = dealingFundHouseId;
  }

  public StockTransferBasicData dealingInstrument(ResourceReference dealingInstrument) {
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

  public StockTransferBasicData dealingInstrumentType(DealingInstrumentTypeEnum dealingInstrumentType) {
    this.dealingInstrumentType = dealingInstrumentType;
    return this;
  }

  /**
   * Enum to select between \"FUND\" \"ETF\". Indicates the type of the {DealingInstrument} associated to the {StockTransfer}.
   * @return dealingInstrumentType
  **/
  @ApiModelProperty(value = "Enum to select between \"FUND\" \"ETF\". Indicates the type of the {DealingInstrument} associated to the {StockTransfer}.")


  public DealingInstrumentTypeEnum getDealingInstrumentType() {
    return dealingInstrumentType;
  }

  public void setDealingInstrumentType(DealingInstrumentTypeEnum dealingInstrumentType) {
    this.dealingInstrumentType = dealingInstrumentType;
  }

  public StockTransferBasicData distributorId(Long distributorId) {
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

  public StockTransferBasicData externalReference(String externalReference) {
    this.externalReference = externalReference;
    return this;
  }

  /**
   * The {StockTransfer} external reference
   * @return externalReference
  **/
  @ApiModelProperty(value = "The {StockTransfer} external reference")


  public String getExternalReference() {
    return externalReference;
  }

  public void setExternalReference(String externalReference) {
    this.externalReference = externalReference;
  }

  public StockTransferBasicData followupDate(OffsetDateTime followupDate) {
    this.followupDate = followupDate;
    return this;
  }

  /**
   * The specified follow-up date.
   * @return followupDate
  **/
  @ApiModelProperty(value = "The specified follow-up date.")

  @Valid

  public OffsetDateTime getFollowupDate() {
    return followupDate;
  }

  public void setFollowupDate(OffsetDateTime followupDate) {
    this.followupDate = followupDate;
  }

  public StockTransferBasicData price(Price price) {
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

  public StockTransferBasicData productId(Long productId) {
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

  public StockTransferBasicData sentDate(OffsetDateTime sentDate) {
    this.sentDate = sentDate;
    return this;
  }

  /**
   * The date when the {StockTransfer} was sent to the {DealingFundHouse}
   * @return sentDate
  **/
  @ApiModelProperty(value = "The date when the {StockTransfer} was sent to the {DealingFundHouse}")

  @Valid

  public OffsetDateTime getSentDate() {
    return sentDate;
  }

  public void setSentDate(OffsetDateTime sentDate) {
    this.sentDate = sentDate;
  }

  public StockTransferBasicData stockTransferStatusCode(String stockTransferStatusCode) {
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

  public StockTransferBasicData stockTransferTypeCode(String stockTransferTypeCode) {
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

  public StockTransferBasicData subdistributorId(Long subdistributorId) {
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
    StockTransferBasicData stockTransferBasicData = (StockTransferBasicData) o;
    return Objects.equals(this.additionalReference, stockTransferBasicData.additionalReference) &&
        Objects.equals(this.additionalReferenceSwift, stockTransferBasicData.additionalReferenceSwift) &&
        Objects.equals(this.categoryCode, stockTransferBasicData.categoryCode) &&
        Objects.equals(this.contractExternalReference, stockTransferBasicData.contractExternalReference) &&
        Objects.equals(this.dealingFundHouseId, stockTransferBasicData.dealingFundHouseId) &&
        Objects.equals(this.dealingInstrument, stockTransferBasicData.dealingInstrument) &&
        Objects.equals(this.dealingInstrumentType, stockTransferBasicData.dealingInstrumentType) &&
        Objects.equals(this.distributorId, stockTransferBasicData.distributorId) &&
        Objects.equals(this.externalReference, stockTransferBasicData.externalReference) &&
        Objects.equals(this.followupDate, stockTransferBasicData.followupDate) &&
        Objects.equals(this.price, stockTransferBasicData.price) &&
        Objects.equals(this.productId, stockTransferBasicData.productId) &&
        Objects.equals(this.sentDate, stockTransferBasicData.sentDate) &&
        Objects.equals(this.stockTransferStatusCode, stockTransferBasicData.stockTransferStatusCode) &&
        Objects.equals(this.stockTransferTypeCode, stockTransferBasicData.stockTransferTypeCode) &&
        Objects.equals(this.subdistributorId, stockTransferBasicData.subdistributorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalReference, additionalReferenceSwift, categoryCode, contractExternalReference, dealingFundHouseId, dealingInstrument, dealingInstrumentType, distributorId, externalReference, followupDate, price, productId, sentDate, stockTransferStatusCode, stockTransferTypeCode, subdistributorId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockTransferBasicData {\n");
    
    sb.append("    additionalReference: ").append(toIndentedString(additionalReference)).append("\n");
    sb.append("    additionalReferenceSwift: ").append(toIndentedString(additionalReferenceSwift)).append("\n");
    sb.append("    categoryCode: ").append(toIndentedString(categoryCode)).append("\n");
    sb.append("    contractExternalReference: ").append(toIndentedString(contractExternalReference)).append("\n");
    sb.append("    dealingFundHouseId: ").append(toIndentedString(dealingFundHouseId)).append("\n");
    sb.append("    dealingInstrument: ").append(toIndentedString(dealingInstrument)).append("\n");
    sb.append("    dealingInstrumentType: ").append(toIndentedString(dealingInstrumentType)).append("\n");
    sb.append("    distributorId: ").append(toIndentedString(distributorId)).append("\n");
    sb.append("    externalReference: ").append(toIndentedString(externalReference)).append("\n");
    sb.append("    followupDate: ").append(toIndentedString(followupDate)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    sentDate: ").append(toIndentedString(sentDate)).append("\n");
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

