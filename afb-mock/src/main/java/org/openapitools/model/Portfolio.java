package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Fees;
import org.openapitools.model.OwnersPortfolio;
import org.openapitools.model.Price;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Portfolio
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-15T15:19:21.557+02:00[Europe/Rome]")

public class Portfolio   {
  @JsonProperty("calculationDate")
  private OffsetDateTime calculationDate = null;

  @JsonProperty("comparisonBenchmarkId")
  private String comparisonBenchmarkId = null;

  @JsonProperty("currencyCode")
  private String currencyCode = null;

  @JsonProperty("emails")
  @Valid
  private List<String> emails = null;

  @JsonProperty("fees")
  private Fees fees = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("inceptionDate")
  private OffsetDateTime inceptionDate = null;

  @JsonProperty("investmentObjective")
  private String investmentObjective = null;

  @JsonProperty("lastBenchmarkCompositionId")
  private Long lastBenchmarkCompositionId = null;

  @JsonProperty("lastCompositionId")
  private Long lastCompositionId = null;

  @JsonProperty("lastPrices")
  @Valid
  private List<Price> lastPrices = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("owner")
  @Valid
  private List<OwnersPortfolio> owner = null;

  /**
   * The type portfolio
   */
  public enum PortfolioTypeEnum {
    SIMULATED("SIMULATED"),
    
    THEORETICAL("THEORETICAL"),
    
    PREVIEW("PREVIEW"),
    
    DEALING("DEALING");

    private String value;

    PortfolioTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PortfolioTypeEnum fromValue(String text) {
      for (PortfolioTypeEnum b : PortfolioTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("portfolioType")
  private PortfolioTypeEnum portfolioType = null;

  @JsonProperty("rebalancingTypeCode")
  private String rebalancingTypeCode = null;

  @JsonProperty("statusCode")
  private String statusCode = null;

  /**
   * show this fund is Acumulation or Income
   */
  public enum TypeShareEnum {
    ACUMULATION("ACUMULATION"),
    
    INCOME("INCOME");

    private String value;

    TypeShareEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeShareEnum fromValue(String text) {
      for (TypeShareEnum b : TypeShareEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("typeShare")
  private TypeShareEnum typeShare = null;

  public Portfolio calculationDate(OffsetDateTime calculationDate) {
    this.calculationDate = calculationDate;
    return this;
  }

  /**
   * The portfolio's calculation date.
   * @return calculationDate
  **/
  @ApiModelProperty(value = "The portfolio's calculation date.")

  @Valid

  public OffsetDateTime getCalculationDate() {
    return calculationDate;
  }

  public void setCalculationDate(OffsetDateTime calculationDate) {
    this.calculationDate = calculationDate;
  }

  public Portfolio comparisonBenchmarkId(String comparisonBenchmarkId) {
    this.comparisonBenchmarkId = comparisonBenchmarkId;
    return this;
  }

  /**
   * The Id of the {Benchmark}
   * @return comparisonBenchmarkId
  **/
  @ApiModelProperty(value = "The Id of the {Benchmark}")


  public String getComparisonBenchmarkId() {
    return comparisonBenchmarkId;
  }

  public void setComparisonBenchmarkId(String comparisonBenchmarkId) {
    this.comparisonBenchmarkId = comparisonBenchmarkId;
  }

  public Portfolio currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * The currency. Refer to {listCurrencies}
   * @return currencyCode
  **/
  @ApiModelProperty(value = "The currency. Refer to {listCurrencies}")


  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public Portfolio emails(List<String> emails) {
    this.emails = emails;
    return this;
  }

  public Portfolio addEmailsItem(String emailsItem) {
    if (this.emails == null) {
      this.emails = new ArrayList<>();
    }
    this.emails.add(emailsItem);
    return this;
  }

  /**
   * Get emails
   * @return emails
  **/
  @ApiModelProperty(value = "")


  public List<String> getEmails() {
    return emails;
  }

  public void setEmails(List<String> emails) {
    this.emails = emails;
  }

  public Portfolio fees(Fees fees) {
    this.fees = fees;
    return this;
  }

  /**
   * Get fees
   * @return fees
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Fees getFees() {
    return fees;
  }

  public void setFees(Fees fees) {
    this.fees = fees;
  }

  public Portfolio id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The Id of the {Portfolio}
   * @return id
  **/
  @ApiModelProperty(value = "The Id of the {Portfolio}")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Portfolio inceptionDate(OffsetDateTime inceptionDate) {
    this.inceptionDate = inceptionDate;
    return this;
  }

  /**
   * The portfolio's inception date.
   * @return inceptionDate
  **/
  @ApiModelProperty(value = "The portfolio's inception date.")

  @Valid

  public OffsetDateTime getInceptionDate() {
    return inceptionDate;
  }

  public void setInceptionDate(OffsetDateTime inceptionDate) {
    this.inceptionDate = inceptionDate;
  }

  public Portfolio investmentObjective(String investmentObjective) {
    this.investmentObjective = investmentObjective;
    return this;
  }

  /**
   * A client information form used by registered investment advisors and other asset managers that aids in determining the optimal portfolio mix for the client. An investment objective survey may come in the form of a questionnaire, where the investor will be asked things such as * Current liquid and net worth * Risk aversion * Investing time horizon  * Income levels * Expense levels  * Planned bequeathments and/or charitable contributions  * Restrictions on security selection This attribute is localized according to the `{Accept-Language}` HTTP Header. 
   * @return investmentObjective
  **/
  @ApiModelProperty(value = "A client information form used by registered investment advisors and other asset managers that aids in determining the optimal portfolio mix for the client. An investment objective survey may come in the form of a questionnaire, where the investor will be asked things such as * Current liquid and net worth * Risk aversion * Investing time horizon  * Income levels * Expense levels  * Planned bequeathments and/or charitable contributions  * Restrictions on security selection This attribute is localized according to the `{Accept-Language}` HTTP Header. ")


  public String getInvestmentObjective() {
    return investmentObjective;
  }

  public void setInvestmentObjective(String investmentObjective) {
    this.investmentObjective = investmentObjective;
  }

  public Portfolio lastBenchmarkCompositionId(Long lastBenchmarkCompositionId) {
    this.lastBenchmarkCompositionId = lastBenchmarkCompositionId;
    return this;
  }

  /**
   * The Id of the {Composition}
   * @return lastBenchmarkCompositionId
  **/
  @ApiModelProperty(value = "The Id of the {Composition}")


  public Long getLastBenchmarkCompositionId() {
    return lastBenchmarkCompositionId;
  }

  public void setLastBenchmarkCompositionId(Long lastBenchmarkCompositionId) {
    this.lastBenchmarkCompositionId = lastBenchmarkCompositionId;
  }

  public Portfolio lastCompositionId(Long lastCompositionId) {
    this.lastCompositionId = lastCompositionId;
    return this;
  }

  /**
   * The Id of the {Composition}
   * @return lastCompositionId
  **/
  @ApiModelProperty(value = "The Id of the {Composition}")


  public Long getLastCompositionId() {
    return lastCompositionId;
  }

  public void setLastCompositionId(Long lastCompositionId) {
    this.lastCompositionId = lastCompositionId;
  }

  public Portfolio lastPrices(List<Price> lastPrices) {
    this.lastPrices = lastPrices;
    return this;
  }

  public Portfolio addLastPricesItem(Price lastPricesItem) {
    if (this.lastPrices == null) {
      this.lastPrices = new ArrayList<>();
    }
    this.lastPrices.add(lastPricesItem);
    return this;
  }

  /**
   * Get lastPrices
   * @return lastPrices
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Price> getLastPrices() {
    return lastPrices;
  }

  public void setLastPrices(List<Price> lastPrices) {
    this.lastPrices = lastPrices;
  }

  public Portfolio name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the portfolio
   * @return name
  **/
  @ApiModelProperty(value = "The name of the portfolio")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Portfolio owner(List<OwnersPortfolio> owner) {
    this.owner = owner;
    return this;
  }

  public Portfolio addOwnerItem(OwnersPortfolio ownerItem) {
    if (this.owner == null) {
      this.owner = new ArrayList<>();
    }
    this.owner.add(ownerItem);
    return this;
  }

  /**
   * The array of {OwnersPortfolio}
   * @return owner
  **/
  @ApiModelProperty(value = "The array of {OwnersPortfolio}")

  @Valid

  public List<OwnersPortfolio> getOwner() {
    return owner;
  }

  public void setOwner(List<OwnersPortfolio> owner) {
    this.owner = owner;
  }

  public Portfolio portfolioType(PortfolioTypeEnum portfolioType) {
    this.portfolioType = portfolioType;
    return this;
  }

  /**
   * The type portfolio
   * @return portfolioType
  **/
  @ApiModelProperty(value = "The type portfolio")


  public PortfolioTypeEnum getPortfolioType() {
    return portfolioType;
  }

  public void setPortfolioType(PortfolioTypeEnum portfolioType) {
    this.portfolioType = portfolioType;
  }

  public Portfolio rebalancingTypeCode(String rebalancingTypeCode) {
    this.rebalancingTypeCode = rebalancingTypeCode;
    return this;
  }

  /**
   * The rebalancing type. Refer to {listRebalancingTypes}
   * @return rebalancingTypeCode
  **/
  @ApiModelProperty(value = "The rebalancing type. Refer to {listRebalancingTypes}")


  public String getRebalancingTypeCode() {
    return rebalancingTypeCode;
  }

  public void setRebalancingTypeCode(String rebalancingTypeCode) {
    this.rebalancingTypeCode = rebalancingTypeCode;
  }

  public Portfolio statusCode(String statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  /**
   * The status of portfolio. Refer to {listPortfolioStatuses}
   * @return statusCode
  **/
  @ApiModelProperty(value = "The status of portfolio. Refer to {listPortfolioStatuses}")


  public String getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }

  public Portfolio typeShare(TypeShareEnum typeShare) {
    this.typeShare = typeShare;
    return this;
  }

  /**
   * show this fund is Acumulation or Income
   * @return typeShare
  **/
  @ApiModelProperty(value = "show this fund is Acumulation or Income")


  public TypeShareEnum getTypeShare() {
    return typeShare;
  }

  public void setTypeShare(TypeShareEnum typeShare) {
    this.typeShare = typeShare;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Portfolio portfolio = (Portfolio) o;
    return Objects.equals(this.calculationDate, portfolio.calculationDate) &&
        Objects.equals(this.comparisonBenchmarkId, portfolio.comparisonBenchmarkId) &&
        Objects.equals(this.currencyCode, portfolio.currencyCode) &&
        Objects.equals(this.emails, portfolio.emails) &&
        Objects.equals(this.fees, portfolio.fees) &&
        Objects.equals(this.id, portfolio.id) &&
        Objects.equals(this.inceptionDate, portfolio.inceptionDate) &&
        Objects.equals(this.investmentObjective, portfolio.investmentObjective) &&
        Objects.equals(this.lastBenchmarkCompositionId, portfolio.lastBenchmarkCompositionId) &&
        Objects.equals(this.lastCompositionId, portfolio.lastCompositionId) &&
        Objects.equals(this.lastPrices, portfolio.lastPrices) &&
        Objects.equals(this.name, portfolio.name) &&
        Objects.equals(this.owner, portfolio.owner) &&
        Objects.equals(this.portfolioType, portfolio.portfolioType) &&
        Objects.equals(this.rebalancingTypeCode, portfolio.rebalancingTypeCode) &&
        Objects.equals(this.statusCode, portfolio.statusCode) &&
        Objects.equals(this.typeShare, portfolio.typeShare);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calculationDate, comparisonBenchmarkId, currencyCode, emails, fees, id, inceptionDate, investmentObjective, lastBenchmarkCompositionId, lastCompositionId, lastPrices, name, owner, portfolioType, rebalancingTypeCode, statusCode, typeShare);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Portfolio {\n");
    
    sb.append("    calculationDate: ").append(toIndentedString(calculationDate)).append("\n");
    sb.append("    comparisonBenchmarkId: ").append(toIndentedString(comparisonBenchmarkId)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    fees: ").append(toIndentedString(fees)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inceptionDate: ").append(toIndentedString(inceptionDate)).append("\n");
    sb.append("    investmentObjective: ").append(toIndentedString(investmentObjective)).append("\n");
    sb.append("    lastBenchmarkCompositionId: ").append(toIndentedString(lastBenchmarkCompositionId)).append("\n");
    sb.append("    lastCompositionId: ").append(toIndentedString(lastCompositionId)).append("\n");
    sb.append("    lastPrices: ").append(toIndentedString(lastPrices)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    portfolioType: ").append(toIndentedString(portfolioType)).append("\n");
    sb.append("    rebalancingTypeCode: ").append(toIndentedString(rebalancingTypeCode)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    typeShare: ").append(toIndentedString(typeShare)).append("\n");
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

