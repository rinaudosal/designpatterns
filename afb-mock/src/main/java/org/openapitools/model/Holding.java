package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Price;
import org.openapitools.model.ResourceReference;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * It contains data about fund position.
 */
@ApiModel(description = "It contains data about fund position.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class Holding   {
  @JsonProperty("amount")
  private Double amount = null;

  @JsonProperty("capitalGained")
  private Double capitalGained = null;

  @JsonProperty("contractId")
  private Long contractId = null;

  @JsonProperty("currencyCode")
  private String currencyCode = null;

  @JsonProperty("dealingFundHouseId")
  private Long dealingFundHouseId = null;

  @JsonProperty("dealingInstrument")
  private ResourceReference dealingInstrument = null;

  /**
   * Enum to select between {Fund} or {ETF}. Indicates the type of the {DealingInstrument} associated with the {Holding}.
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

  @JsonProperty("fiscalShares")
  private Double fiscalShares = null;

  @JsonProperty("price")
  private Price price = null;

  @JsonProperty("productId")
  private Long productId = null;

  @JsonProperty("shares")
  private Double shares = null;

  @JsonProperty("sharesAfterDistribution")
  private Double sharesAfterDistribution = null;

  @JsonProperty("sharesBeforeDistribution")
  private Double sharesBeforeDistribution = null;

  @JsonProperty("subdistributorId")
  private Long subdistributorId = null;

  @JsonProperty("weightedAverageCost")
  private Double weightedAverageCost = null;

  @JsonProperty("weightedAveragePrice")
  private Double weightedAveragePrice = null;

  public Holding amount(Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * amount
   * @return amount
  **/
  @ApiModelProperty(value = "amount")


  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public Holding capitalGained(Double capitalGained) {
    this.capitalGained = capitalGained;
    return this;
  }

  /**
   * Fiscal accrued income
   * @return capitalGained
  **/
  @ApiModelProperty(value = "Fiscal accrued income")


  public Double getCapitalGained() {
    return capitalGained;
  }

  public void setCapitalGained(Double capitalGained) {
    this.capitalGained = capitalGained;
  }

  public Holding contractId(Long contractId) {
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

  public Holding currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * The holding's currency. Refer to {listCurrencies}
   * @return currencyCode
  **/
  @ApiModelProperty(value = "The holding's currency. Refer to {listCurrencies}")


  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public Holding dealingFundHouseId(Long dealingFundHouseId) {
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

  public Holding dealingInstrument(ResourceReference dealingInstrument) {
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

  public Holding dealingInstrumentType(DealingInstrumentTypeEnum dealingInstrumentType) {
    this.dealingInstrumentType = dealingInstrumentType;
    return this;
  }

  /**
   * Enum to select between {Fund} or {ETF}. Indicates the type of the {DealingInstrument} associated with the {Holding}.
   * @return dealingInstrumentType
  **/
  @ApiModelProperty(value = "Enum to select between {Fund} or {ETF}. Indicates the type of the {DealingInstrument} associated with the {Holding}.")


  public DealingInstrumentTypeEnum getDealingInstrumentType() {
    return dealingInstrumentType;
  }

  public void setDealingInstrumentType(DealingInstrumentTypeEnum dealingInstrumentType) {
    this.dealingInstrumentType = dealingInstrumentType;
  }

  public Holding distributorId(Long distributorId) {
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

  public Holding fiscalShares(Double fiscalShares) {
    this.fiscalShares = fiscalShares;
    return this;
  }

  /**
   * Fiscal shares
   * @return fiscalShares
  **/
  @ApiModelProperty(value = "Fiscal shares")


  public Double getFiscalShares() {
    return fiscalShares;
  }

  public void setFiscalShares(Double fiscalShares) {
    this.fiscalShares = fiscalShares;
  }

  public Holding price(Price price) {
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

  public Holding productId(Long productId) {
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

  public Holding shares(Double shares) {
    this.shares = shares;
    return this;
  }

  /**
   * Number of shares
   * @return shares
  **/
  @ApiModelProperty(value = "Number of shares")


  public Double getShares() {
    return shares;
  }

  public void setShares(Double shares) {
    this.shares = shares;
  }

  public Holding sharesAfterDistribution(Double sharesAfterDistribution) {
    this.sharesAfterDistribution = sharesAfterDistribution;
    return this;
  }

  /**
   * Shares confirmed after the last fund distribution
   * @return sharesAfterDistribution
  **/
  @ApiModelProperty(value = "Shares confirmed after the last fund distribution")


  public Double getSharesAfterDistribution() {
    return sharesAfterDistribution;
  }

  public void setSharesAfterDistribution(Double sharesAfterDistribution) {
    this.sharesAfterDistribution = sharesAfterDistribution;
  }

  public Holding sharesBeforeDistribution(Double sharesBeforeDistribution) {
    this.sharesBeforeDistribution = sharesBeforeDistribution;
    return this;
  }

  /**
   * Shares confirmed before the last fund distribution
   * @return sharesBeforeDistribution
  **/
  @ApiModelProperty(value = "Shares confirmed before the last fund distribution")


  public Double getSharesBeforeDistribution() {
    return sharesBeforeDistribution;
  }

  public void setSharesBeforeDistribution(Double sharesBeforeDistribution) {
    this.sharesBeforeDistribution = sharesBeforeDistribution;
  }

  public Holding subdistributorId(Long subdistributorId) {
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

  public Holding weightedAverageCost(Double weightedAverageCost) {
    this.weightedAverageCost = weightedAverageCost;
    return this;
  }

  /**
   * Weighted Average Cost
   * @return weightedAverageCost
  **/
  @ApiModelProperty(value = "Weighted Average Cost")


  public Double getWeightedAverageCost() {
    return weightedAverageCost;
  }

  public void setWeightedAverageCost(Double weightedAverageCost) {
    this.weightedAverageCost = weightedAverageCost;
  }

  public Holding weightedAveragePrice(Double weightedAveragePrice) {
    this.weightedAveragePrice = weightedAveragePrice;
    return this;
  }

  /**
   * Weighted Average Price
   * @return weightedAveragePrice
  **/
  @ApiModelProperty(value = "Weighted Average Price")


  public Double getWeightedAveragePrice() {
    return weightedAveragePrice;
  }

  public void setWeightedAveragePrice(Double weightedAveragePrice) {
    this.weightedAveragePrice = weightedAveragePrice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Holding holding = (Holding) o;
    return Objects.equals(this.amount, holding.amount) &&
        Objects.equals(this.capitalGained, holding.capitalGained) &&
        Objects.equals(this.contractId, holding.contractId) &&
        Objects.equals(this.currencyCode, holding.currencyCode) &&
        Objects.equals(this.dealingFundHouseId, holding.dealingFundHouseId) &&
        Objects.equals(this.dealingInstrument, holding.dealingInstrument) &&
        Objects.equals(this.dealingInstrumentType, holding.dealingInstrumentType) &&
        Objects.equals(this.distributorId, holding.distributorId) &&
        Objects.equals(this.fiscalShares, holding.fiscalShares) &&
        Objects.equals(this.price, holding.price) &&
        Objects.equals(this.productId, holding.productId) &&
        Objects.equals(this.shares, holding.shares) &&
        Objects.equals(this.sharesAfterDistribution, holding.sharesAfterDistribution) &&
        Objects.equals(this.sharesBeforeDistribution, holding.sharesBeforeDistribution) &&
        Objects.equals(this.subdistributorId, holding.subdistributorId) &&
        Objects.equals(this.weightedAverageCost, holding.weightedAverageCost) &&
        Objects.equals(this.weightedAveragePrice, holding.weightedAveragePrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, capitalGained, contractId, currencyCode, dealingFundHouseId, dealingInstrument, dealingInstrumentType, distributorId, fiscalShares, price, productId, shares, sharesAfterDistribution, sharesBeforeDistribution, subdistributorId, weightedAverageCost, weightedAveragePrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Holding {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    capitalGained: ").append(toIndentedString(capitalGained)).append("\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    dealingFundHouseId: ").append(toIndentedString(dealingFundHouseId)).append("\n");
    sb.append("    dealingInstrument: ").append(toIndentedString(dealingInstrument)).append("\n");
    sb.append("    dealingInstrumentType: ").append(toIndentedString(dealingInstrumentType)).append("\n");
    sb.append("    distributorId: ").append(toIndentedString(distributorId)).append("\n");
    sb.append("    fiscalShares: ").append(toIndentedString(fiscalShares)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    shares: ").append(toIndentedString(shares)).append("\n");
    sb.append("    sharesAfterDistribution: ").append(toIndentedString(sharesAfterDistribution)).append("\n");
    sb.append("    sharesBeforeDistribution: ").append(toIndentedString(sharesBeforeDistribution)).append("\n");
    sb.append("    subdistributorId: ").append(toIndentedString(subdistributorId)).append("\n");
    sb.append("    weightedAverageCost: ").append(toIndentedString(weightedAverageCost)).append("\n");
    sb.append("    weightedAveragePrice: ").append(toIndentedString(weightedAveragePrice)).append("\n");
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

