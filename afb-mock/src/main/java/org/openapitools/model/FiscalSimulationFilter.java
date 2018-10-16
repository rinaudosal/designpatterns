package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Client;
import org.openapitools.model.Price;
import org.openapitools.model.TaxTransaction;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Object used to do a fiscal simulation
 */
@ApiModel(description = "Object used to do a fiscal simulation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class FiscalSimulationFilter   {
  @JsonProperty("amount")
  private Double amount = null;

  @JsonProperty("contractId")
  private Long contractId = null;

  @JsonProperty("currencyCode")
  private String currencyCode = null;

  @JsonProperty("dealingInstrumentId")
  private Long dealingInstrumentId = null;

  /**
   * Informs if a De {Fund} or {ETF}
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

  @JsonProperty("exchangeRateApplied")
  private Double exchangeRateApplied = null;

  @JsonProperty("fee")
  private Double fee = null;

  @JsonProperty("price")
  private Price price = null;

  /**
   * The selected redemption type to do de simulation.
   */
  public enum RedemptionTypeEnum {
    TOTAL("TOTAL"),
    
    PARTIAL("PARTIAL");

    private String value;

    RedemptionTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RedemptionTypeEnum fromValue(String text) {
      for (RedemptionTypeEnum b : RedemptionTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("redemptionType")
  private RedemptionTypeEnum redemptionType = null;

  @JsonProperty("shareholders")
  @Valid
  private List<Client> shareholders = null;

  @JsonProperty("shares")
  private Double shares = null;

  @JsonProperty("subdistributorId")
  private Long subdistributorId = null;

  @JsonProperty("taxTransactions")
  @Valid
  private List<TaxTransaction> taxTransactions = null;

  public FiscalSimulationFilter amount(Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The amout do de simulation. Expressed in {FiscalSimulationFilter.currencyCode}
   * @return amount
  **/
  @ApiModelProperty(value = "The amout do de simulation. Expressed in {FiscalSimulationFilter.currencyCode}")


  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public FiscalSimulationFilter contractId(Long contractId) {
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

  public FiscalSimulationFilter currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * The selected currency to do the simulation. Refer of {listCurrencies}
   * @return currencyCode
  **/
  @ApiModelProperty(value = "The selected currency to do the simulation. Refer of {listCurrencies}")


  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public FiscalSimulationFilter dealingInstrumentId(Long dealingInstrumentId) {
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

  public FiscalSimulationFilter dealingInstrumentType(DealingInstrumentTypeEnum dealingInstrumentType) {
    this.dealingInstrumentType = dealingInstrumentType;
    return this;
  }

  /**
   * Informs if a De {Fund} or {ETF}
   * @return dealingInstrumentType
  **/
  @ApiModelProperty(value = "Informs if a De {Fund} or {ETF}")


  public DealingInstrumentTypeEnum getDealingInstrumentType() {
    return dealingInstrumentType;
  }

  public void setDealingInstrumentType(DealingInstrumentTypeEnum dealingInstrumentType) {
    this.dealingInstrumentType = dealingInstrumentType;
  }

  public FiscalSimulationFilter exchangeRateApplied(Double exchangeRateApplied) {
    this.exchangeRateApplied = exchangeRateApplied;
    return this;
  }

  /**
   * The exchange rate to do the simulation. Expressed in {FiscalSimulationFilter.currencyCode}
   * @return exchangeRateApplied
  **/
  @ApiModelProperty(value = "The exchange rate to do the simulation. Expressed in {FiscalSimulationFilter.currencyCode}")


  public Double getExchangeRateApplied() {
    return exchangeRateApplied;
  }

  public void setExchangeRateApplied(Double exchangeRateApplied) {
    this.exchangeRateApplied = exchangeRateApplied;
  }

  public FiscalSimulationFilter fee(Double fee) {
    this.fee = fee;
    return this;
  }

  /**
   * The fee amount to do the simulation
   * @return fee
  **/
  @ApiModelProperty(value = "The fee amount to do the simulation")


  public Double getFee() {
    return fee;
  }

  public void setFee(Double fee) {
    this.fee = fee;
  }

  public FiscalSimulationFilter price(Price price) {
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

  public FiscalSimulationFilter redemptionType(RedemptionTypeEnum redemptionType) {
    this.redemptionType = redemptionType;
    return this;
  }

  /**
   * The selected redemption type to do de simulation.
   * @return redemptionType
  **/
  @ApiModelProperty(value = "The selected redemption type to do de simulation.")


  public RedemptionTypeEnum getRedemptionType() {
    return redemptionType;
  }

  public void setRedemptionType(RedemptionTypeEnum redemptionType) {
    this.redemptionType = redemptionType;
  }

  public FiscalSimulationFilter shareholders(List<Client> shareholders) {
    this.shareholders = shareholders;
    return this;
  }

  public FiscalSimulationFilter addShareholdersItem(Client shareholdersItem) {
    if (this.shareholders == null) {
      this.shareholders = new ArrayList<>();
    }
    this.shareholders.add(shareholdersItem);
    return this;
  }

  /**
   * The list of {Client}s to do de simulation as a shareholders of the {Contract}
   * @return shareholders
  **/
  @ApiModelProperty(value = "The list of {Client}s to do de simulation as a shareholders of the {Contract}")

  @Valid

  public List<Client> getShareholders() {
    return shareholders;
  }

  public void setShareholders(List<Client> shareholders) {
    this.shareholders = shareholders;
  }

  public FiscalSimulationFilter shares(Double shares) {
    this.shares = shares;
    return this;
  }

  /**
   * Shares to do the simulation
   * @return shares
  **/
  @ApiModelProperty(value = "Shares to do the simulation")


  public Double getShares() {
    return shares;
  }

  public void setShares(Double shares) {
    this.shares = shares;
  }

  public FiscalSimulationFilter subdistributorId(Long subdistributorId) {
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

  public FiscalSimulationFilter taxTransactions(List<TaxTransaction> taxTransactions) {
    this.taxTransactions = taxTransactions;
    return this;
  }

  public FiscalSimulationFilter addTaxTransactionsItem(TaxTransaction taxTransactionsItem) {
    if (this.taxTransactions == null) {
      this.taxTransactions = new ArrayList<>();
    }
    this.taxTransactions.add(taxTransactionsItem);
    return this;
  }

  /**
   * The list of {TaxTransaction}s to do de simulation
   * @return taxTransactions
  **/
  @ApiModelProperty(value = "The list of {TaxTransaction}s to do de simulation")

  @Valid

  public List<TaxTransaction> getTaxTransactions() {
    return taxTransactions;
  }

  public void setTaxTransactions(List<TaxTransaction> taxTransactions) {
    this.taxTransactions = taxTransactions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FiscalSimulationFilter fiscalSimulationFilter = (FiscalSimulationFilter) o;
    return Objects.equals(this.amount, fiscalSimulationFilter.amount) &&
        Objects.equals(this.contractId, fiscalSimulationFilter.contractId) &&
        Objects.equals(this.currencyCode, fiscalSimulationFilter.currencyCode) &&
        Objects.equals(this.dealingInstrumentId, fiscalSimulationFilter.dealingInstrumentId) &&
        Objects.equals(this.dealingInstrumentType, fiscalSimulationFilter.dealingInstrumentType) &&
        Objects.equals(this.exchangeRateApplied, fiscalSimulationFilter.exchangeRateApplied) &&
        Objects.equals(this.fee, fiscalSimulationFilter.fee) &&
        Objects.equals(this.price, fiscalSimulationFilter.price) &&
        Objects.equals(this.redemptionType, fiscalSimulationFilter.redemptionType) &&
        Objects.equals(this.shareholders, fiscalSimulationFilter.shareholders) &&
        Objects.equals(this.shares, fiscalSimulationFilter.shares) &&
        Objects.equals(this.subdistributorId, fiscalSimulationFilter.subdistributorId) &&
        Objects.equals(this.taxTransactions, fiscalSimulationFilter.taxTransactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, contractId, currencyCode, dealingInstrumentId, dealingInstrumentType, exchangeRateApplied, fee, price, redemptionType, shareholders, shares, subdistributorId, taxTransactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FiscalSimulationFilter {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    dealingInstrumentId: ").append(toIndentedString(dealingInstrumentId)).append("\n");
    sb.append("    dealingInstrumentType: ").append(toIndentedString(dealingInstrumentType)).append("\n");
    sb.append("    exchangeRateApplied: ").append(toIndentedString(exchangeRateApplied)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    redemptionType: ").append(toIndentedString(redemptionType)).append("\n");
    sb.append("    shareholders: ").append(toIndentedString(shareholders)).append("\n");
    sb.append("    shares: ").append(toIndentedString(shares)).append("\n");
    sb.append("    subdistributorId: ").append(toIndentedString(subdistributorId)).append("\n");
    sb.append("    taxTransactions: ").append(toIndentedString(taxTransactions)).append("\n");
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

